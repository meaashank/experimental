package com.google.android.exoplayer2.source.hls.playlist;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.view.menu.d;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class HlsMediaPlaylist extends HlsPlaylist {
    public static final int PLAYLIST_TYPE_EVENT = 2;
    public static final int PLAYLIST_TYPE_UNKNOWN = 0;
    public static final int PLAYLIST_TYPE_VOD = 1;
    public final int discontinuitySequence;
    public final DrmInitData drmInitData;
    public final long durationUs;
    public final boolean hasDiscontinuitySequence;
    public final boolean hasEndTag;
    public final boolean hasIndependentSegmentsTag;
    public final boolean hasProgramDateTime;
    public final long mediaSequence;
    public final int playlistType;
    public final List<Segment> segments;
    public final long startOffsetUs;
    public final long startTimeUs;
    public final long targetDurationUs;
    public final int version;

    @Retention(RetentionPolicy.SOURCE)
    public @interface PlaylistType {
    }

    public static final class Segment implements Comparable<Long> {
        public final long byterangeLength;
        public final long byterangeOffset;
        public final long durationUs;
        public final String encryptionIV;
        public final String fullSegmentEncryptionKeyUri;
        public final boolean hasGapTag;

        @Nullable
        public final Segment initializationSegment;
        public final int relativeDiscontinuitySequence;
        public final long relativeStartTimeUs;
        public final String url;

        public Segment(String str, long j10, long j11) {
            this(str, null, 0L, -1, -9223372036854775807L, null, null, j10, j11, false);
        }

        public Segment(String str, Segment segment, long j10, int i10, long j11, String str2, String str3, long j12, long j13, boolean z10) {
            this.url = str;
            this.initializationSegment = segment;
            this.durationUs = j10;
            this.relativeDiscontinuitySequence = i10;
            this.relativeStartTimeUs = j11;
            this.fullSegmentEncryptionKeyUri = str2;
            this.encryptionIV = str3;
            this.byterangeOffset = j12;
            this.byterangeLength = j13;
            this.hasGapTag = z10;
        }

        @Override // java.lang.Comparable
        public int compareTo(@NonNull Long l10) {
            if (this.relativeStartTimeUs > l10.longValue()) {
                return 1;
            }
            return this.relativeStartTimeUs < l10.longValue() ? -1 : 0;
        }
    }

    public HlsMediaPlaylist(int i10, String str, List<String> list, long j10, long j11, boolean z10, int i11, long j12, int i12, long j13, boolean z11, boolean z12, boolean z13, DrmInitData drmInitData, List<Segment> list2) {
        super(str, list);
        this.playlistType = i10;
        this.startTimeUs = j11;
        this.hasDiscontinuitySequence = z10;
        this.discontinuitySequence = i11;
        this.mediaSequence = j12;
        this.version = i12;
        this.targetDurationUs = j13;
        this.hasIndependentSegmentsTag = z11;
        this.hasEndTag = z12;
        this.hasProgramDateTime = z13;
        this.drmInitData = drmInitData;
        this.segments = Collections.unmodifiableList(list2);
        if (list2.isEmpty()) {
            this.durationUs = 0L;
        } else {
            Segment segment = (Segment) d.a(list2, 1);
            this.durationUs = segment.relativeStartTimeUs + segment.durationUs;
        }
        if (j10 == -9223372036854775807L) {
            j10 = -9223372036854775807L;
        } else if (j10 < 0) {
            j10 += this.durationUs;
        }
        this.startOffsetUs = j10;
    }

    @Override // com.google.android.exoplayer2.offline.FilterableManifest
    /* JADX INFO: renamed from: copy */
    public HlsPlaylist copy2(List<RenditionKey> list) {
        return this;
    }

    public HlsMediaPlaylist copyWith(long j10, int i10) {
        return new HlsMediaPlaylist(this.playlistType, this.baseUri, this.tags, this.startOffsetUs, j10, true, i10, this.mediaSequence, this.version, this.targetDurationUs, this.hasIndependentSegmentsTag, this.hasEndTag, this.hasProgramDateTime, this.drmInitData, this.segments);
    }

    public HlsMediaPlaylist copyWithEndTag() {
        return this.hasEndTag ? this : new HlsMediaPlaylist(this.playlistType, this.baseUri, this.tags, this.startOffsetUs, this.startTimeUs, this.hasDiscontinuitySequence, this.discontinuitySequence, this.mediaSequence, this.version, this.targetDurationUs, this.hasIndependentSegmentsTag, true, this.hasProgramDateTime, this.drmInitData, this.segments);
    }

    public long getEndTimeUs() {
        return this.startTimeUs + this.durationUs;
    }

    public boolean isNewerThan(HlsMediaPlaylist hlsMediaPlaylist) {
        if (hlsMediaPlaylist != null) {
            long j10 = this.mediaSequence;
            long j11 = hlsMediaPlaylist.mediaSequence;
            if (j10 <= j11) {
                if (j10 < j11) {
                    return false;
                }
                int size = this.segments.size();
                int size2 = hlsMediaPlaylist.segments.size();
                if (size <= size2 && (size != size2 || !this.hasEndTag || hlsMediaPlaylist.hasEndTag)) {
                    return false;
                }
            }
        }
        return true;
    }
}
