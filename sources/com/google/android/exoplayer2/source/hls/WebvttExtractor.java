package com.google.android.exoplayer2.source.hls;

import android.text.TextUtils;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.text.webvtt.WebvttParserUtil;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
final class WebvttExtractor implements Extractor {
    private static final Pattern LOCAL_TIMESTAMP = Pattern.compile("LOCAL:([^,]+)");
    private static final Pattern MEDIA_TIMESTAMP = Pattern.compile("MPEGTS:(\\d+)");
    private final String language;
    private ExtractorOutput output;
    private int sampleSize;
    private final TimestampAdjuster timestampAdjuster;
    private final ParsableByteArray sampleDataWrapper = new ParsableByteArray();
    private byte[] sampleData = new byte[1024];

    public WebvttExtractor(String str, TimestampAdjuster timestampAdjuster) {
        this.language = str;
        this.timestampAdjuster = timestampAdjuster;
    }

    private TrackOutput buildTrackOutput(long j10) {
        TrackOutput trackOutputTrack = this.output.track(0, 3);
        trackOutputTrack.format(Format.createTextSampleFormat((String) null, "text/vtt", (String) null, -1, 0, this.language, (DrmInitData) null, j10));
        this.output.endTracks();
        return trackOutputTrack;
    }

    private void processSample() throws ParserException {
        ParsableByteArray parsableByteArray = new ParsableByteArray(this.sampleData);
        try {
            WebvttParserUtil.validateWebvttHeaderLine(parsableByteArray);
            long jPtsToUs = 0;
            long timestampUs = 0;
            while (true) {
                String line = parsableByteArray.readLine();
                if (TextUtils.isEmpty(line)) {
                    Matcher matcherFindNextCueHeader = WebvttParserUtil.findNextCueHeader(parsableByteArray);
                    if (matcherFindNextCueHeader == null) {
                        buildTrackOutput(0L);
                        return;
                    }
                    long timestampUs2 = WebvttParserUtil.parseTimestampUs(matcherFindNextCueHeader.group(1));
                    long jAdjustTsTimestamp = this.timestampAdjuster.adjustTsTimestamp(TimestampAdjuster.usToPts((jPtsToUs + timestampUs2) - timestampUs));
                    TrackOutput trackOutputBuildTrackOutput = buildTrackOutput(jAdjustTsTimestamp - timestampUs2);
                    this.sampleDataWrapper.reset(this.sampleData, this.sampleSize);
                    trackOutputBuildTrackOutput.sampleData(this.sampleDataWrapper, this.sampleSize);
                    trackOutputBuildTrackOutput.sampleMetadata(jAdjustTsTimestamp, 1, this.sampleSize, 0, null);
                    return;
                }
                if (line.startsWith("X-TIMESTAMP-MAP")) {
                    Matcher matcher = LOCAL_TIMESTAMP.matcher(line);
                    if (!matcher.find()) {
                        throw new ParserException("X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(line));
                    }
                    Matcher matcher2 = MEDIA_TIMESTAMP.matcher(line);
                    if (!matcher2.find()) {
                        throw new ParserException("X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(line));
                    }
                    timestampUs = WebvttParserUtil.parseTimestampUs(matcher.group(1));
                    jPtsToUs = TimestampAdjuster.ptsToUs(Long.parseLong(matcher2.group(1)));
                }
            }
        } catch (SubtitleDecoderException e10) {
            throw new ParserException(e10);
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        this.output = extractorOutput;
        extractorOutput.seekMap(new SeekMap.Unseekable(-9223372036854775807L));
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws InterruptedException, IOException {
        int length = (int) extractorInput.getLength();
        int i10 = this.sampleSize;
        byte[] bArr = this.sampleData;
        if (i10 == bArr.length) {
            this.sampleData = Arrays.copyOf(bArr, ((length != -1 ? length : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.sampleData;
        int i11 = this.sampleSize;
        int i12 = extractorInput.read(bArr2, i11, bArr2.length - i11);
        if (i12 != -1) {
            int i13 = this.sampleSize + i12;
            this.sampleSize = i13;
            if (length == -1 || i13 != length) {
                return 0;
            }
        }
        processSample();
        return -1;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void release() {
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void seek(long j10, long j11) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) throws InterruptedException, IOException {
        throw new IllegalStateException();
    }
}
