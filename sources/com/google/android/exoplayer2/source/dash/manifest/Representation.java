package com.google.android.exoplayer2.source.dash.manifest;

import android.net.Uri;
import android.support.v4.media.f;
import com.android.launcher3.IconCache;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.dash.DashSegmentIndex;
import com.google.android.exoplayer2.source.dash.manifest.SegmentBase;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Representation {
    public static final long REVISION_ID_DEFAULT = -1;
    public final String baseUrl;
    public final String contentId;
    public final Format format;
    public final List<Descriptor> inbandEventStreams;
    private final RangedUri initializationUri;
    public final long presentationTimeOffsetUs;
    public final long revisionId;

    public static class MultiSegmentRepresentation extends Representation implements DashSegmentIndex {
        private final SegmentBase.MultiSegmentBase segmentBase;

        public MultiSegmentRepresentation(String str, long j10, Format format, String str2, SegmentBase.MultiSegmentBase multiSegmentBase, List<Descriptor> list) {
            super(str, j10, format, str2, multiSegmentBase, list);
            this.segmentBase = multiSegmentBase;
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.Representation
        public String getCacheKey() {
            return null;
        }

        @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
        public long getDurationUs(long j10, long j11) {
            return this.segmentBase.getSegmentDurationUs(j10, j11);
        }

        @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
        public long getFirstSegmentNum() {
            return this.segmentBase.getFirstSegmentNum();
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.Representation
        public DashSegmentIndex getIndex() {
            return this;
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.Representation
        public RangedUri getIndexUri() {
            return null;
        }

        @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
        public int getSegmentCount(long j10) {
            return this.segmentBase.getSegmentCount(j10);
        }

        @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
        public long getSegmentNum(long j10, long j11) {
            return this.segmentBase.getSegmentNum(j10, j11);
        }

        @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
        public RangedUri getSegmentUrl(long j10) {
            return this.segmentBase.getSegmentUrl(this, j10);
        }

        @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
        public long getTimeUs(long j10) {
            return this.segmentBase.getSegmentTimeUs(j10);
        }

        @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
        public boolean isExplicit() {
            return this.segmentBase.isExplicit();
        }
    }

    public static class SingleSegmentRepresentation extends Representation {
        private final String cacheKey;
        public final long contentLength;
        private final RangedUri indexUri;
        private final SingleSegmentIndex segmentIndex;
        public final Uri uri;

        public SingleSegmentRepresentation(String str, long j10, Format format, String str2, SegmentBase.SingleSegmentBase singleSegmentBase, List<Descriptor> list, String str3, long j11) {
            String string;
            super(str, j10, format, str2, singleSegmentBase, list);
            this.uri = Uri.parse(str2);
            RangedUri index = singleSegmentBase.getIndex();
            this.indexUri = index;
            if (str3 != null) {
                string = str3;
            } else if (str != null) {
                StringBuilder sbA = f.a(str, IconCache.EMPTY_CLASS_NAME);
                sbA.append(format.f150732id);
                sbA.append(IconCache.EMPTY_CLASS_NAME);
                sbA.append(j10);
                string = sbA.toString();
            } else {
                string = null;
            }
            this.cacheKey = string;
            this.contentLength = j11;
            this.segmentIndex = index == null ? new SingleSegmentIndex(new RangedUri(null, 0L, j11)) : null;
        }

        public static SingleSegmentRepresentation newInstance(String str, long j10, Format format, String str2, long j11, long j12, long j13, long j14, List<Descriptor> list, String str3, long j15) {
            return new SingleSegmentRepresentation(str, j10, format, str2, new SegmentBase.SingleSegmentBase(new RangedUri(null, j11, (j12 - j11) + 1), 1L, 0L, j13, (j14 - j13) + 1), list, str3, j15);
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.Representation
        public String getCacheKey() {
            return this.cacheKey;
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.Representation
        public DashSegmentIndex getIndex() {
            return this.segmentIndex;
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.Representation
        public RangedUri getIndexUri() {
            return this.indexUri;
        }
    }

    public static Representation newInstance(String str, long j10, Format format, String str2, SegmentBase segmentBase) {
        return newInstance(str, j10, format, str2, segmentBase, null);
    }

    public abstract String getCacheKey();

    public abstract DashSegmentIndex getIndex();

    public abstract RangedUri getIndexUri();

    public RangedUri getInitializationUri() {
        return this.initializationUri;
    }

    private Representation(String str, long j10, Format format, String str2, SegmentBase segmentBase, List<Descriptor> list) {
        this.contentId = str;
        this.revisionId = j10;
        this.format = format;
        this.baseUrl = str2;
        this.inbandEventStreams = list == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list);
        this.initializationUri = segmentBase.getInitialization(this);
        this.presentationTimeOffsetUs = segmentBase.getPresentationTimeOffsetUs();
    }

    public static Representation newInstance(String str, long j10, Format format, String str2, SegmentBase segmentBase, List<Descriptor> list) {
        return newInstance(str, j10, format, str2, segmentBase, list, null);
    }

    public static Representation newInstance(String str, long j10, Format format, String str2, SegmentBase segmentBase, List<Descriptor> list, String str3) {
        if (segmentBase instanceof SegmentBase.SingleSegmentBase) {
            return new SingleSegmentRepresentation(str, j10, format, str2, (SegmentBase.SingleSegmentBase) segmentBase, list, str3, -1L);
        }
        if (segmentBase instanceof SegmentBase.MultiSegmentBase) {
            return new MultiSegmentRepresentation(str, j10, format, str2, (SegmentBase.MultiSegmentBase) segmentBase, list);
        }
        throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
    }
}
