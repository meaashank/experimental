package com.google.android.exoplayer2.extractor.mp3;

import com.google.android.exoplayer2.extractor.MpegAudioHeader;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.extractor.mp3.Mp3Extractor;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes3.dex */
final class ConstantBitrateSeeker implements Mp3Extractor.Seeker {
    private static final int BITS_PER_BYTE = 8;
    private final int bitrate;
    private final long dataSize;
    private final long durationUs;
    private final long firstFramePosition;
    private final int frameSize;

    public ConstantBitrateSeeker(long j10, long j11, MpegAudioHeader mpegAudioHeader) {
        this.firstFramePosition = j11;
        this.frameSize = mpegAudioHeader.frameSize;
        this.bitrate = mpegAudioHeader.bitrate;
        if (j10 == -1) {
            this.dataSize = -1L;
            this.durationUs = -9223372036854775807L;
        } else {
            this.dataSize = j10 - j11;
            this.durationUs = getTimeUs(j10);
        }
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public long getDurationUs() {
        return this.durationUs;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j10) {
        long j11 = this.dataSize;
        if (j11 == -1) {
            return new SeekMap.SeekPoints(new SeekPoint(0L, this.firstFramePosition));
        }
        long j12 = (((long) this.bitrate) * j10) / 8000000;
        int i10 = this.frameSize;
        long jConstrainValue = Util.constrainValue((j12 / ((long) i10)) * ((long) i10), 0L, j11 - ((long) i10));
        long j13 = this.firstFramePosition + jConstrainValue;
        long timeUs = getTimeUs(j13);
        SeekPoint seekPoint = new SeekPoint(timeUs, j13);
        if (timeUs < j10) {
            long j14 = this.dataSize;
            int i11 = this.frameSize;
            if (jConstrainValue != j14 - ((long) i11)) {
                long j15 = j13 + ((long) i11);
                return new SeekMap.SeekPoints(seekPoint, new SeekPoint(getTimeUs(j15), j15));
            }
        }
        return new SeekMap.SeekPoints(seekPoint);
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.Mp3Extractor.Seeker
    public long getTimeUs(long j10) {
        return (Math.max(0L, j10 - this.firstFramePosition) * 8000000) / ((long) this.bitrate);
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public boolean isSeekable() {
        return this.dataSize != -1;
    }
}
