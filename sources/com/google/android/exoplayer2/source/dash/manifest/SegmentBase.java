package com.google.android.exoplayer2.source.dash.manifest;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.Util;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SegmentBase {
    final RangedUri initialization;
    final long presentationTimeOffset;
    final long timescale;

    public static abstract class MultiSegmentBase extends SegmentBase {
        final long duration;
        final List<SegmentTimelineElement> segmentTimeline;
        final long startNumber;

        public MultiSegmentBase(RangedUri rangedUri, long j10, long j11, long j12, long j13, List<SegmentTimelineElement> list) {
            super(rangedUri, j10, j11);
            this.startNumber = j12;
            this.duration = j13;
            this.segmentTimeline = list;
        }

        public long getFirstSegmentNum() {
            return this.startNumber;
        }

        public abstract int getSegmentCount(long j10);

        public final long getSegmentDurationUs(long j10, long j11) {
            List<SegmentTimelineElement> list = this.segmentTimeline;
            if (list != null) {
                return (list.get((int) (j10 - this.startNumber)).duration * 1000000) / this.timescale;
            }
            int segmentCount = getSegmentCount(j11);
            return (segmentCount == -1 || j10 != (getFirstSegmentNum() + ((long) segmentCount)) - 1) ? (this.duration * 1000000) / this.timescale : j11 - getSegmentTimeUs(j10);
        }

        public long getSegmentNum(long j10, long j11) {
            long firstSegmentNum = getFirstSegmentNum();
            long segmentCount = getSegmentCount(j11);
            if (segmentCount != 0) {
                if (this.segmentTimeline != null) {
                    long j12 = (segmentCount + firstSegmentNum) - 1;
                    long j13 = firstSegmentNum;
                    while (j13 <= j12) {
                        long j14 = ((j12 - j13) / 2) + j13;
                        long segmentTimeUs = getSegmentTimeUs(j14);
                        if (segmentTimeUs < j10) {
                            j13 = j14 + 1;
                        } else {
                            if (segmentTimeUs <= j10) {
                                return j14;
                            }
                            j12 = j14 - 1;
                        }
                    }
                    return j13 == firstSegmentNum ? j13 : j12;
                }
                long j15 = (j10 / ((this.duration * 1000000) / this.timescale)) + this.startNumber;
                if (j15 >= firstSegmentNum) {
                    return segmentCount == -1 ? j15 : Math.min(j15, (firstSegmentNum + segmentCount) - 1);
                }
            }
            return firstSegmentNum;
        }

        public final long getSegmentTimeUs(long j10) {
            List<SegmentTimelineElement> list = this.segmentTimeline;
            return Util.scaleLargeTimestamp(list != null ? list.get((int) (j10 - this.startNumber)).startTime - this.presentationTimeOffset : (j10 - this.startNumber) * this.duration, 1000000L, this.timescale);
        }

        public abstract RangedUri getSegmentUrl(Representation representation, long j10);

        public boolean isExplicit() {
            return this.segmentTimeline != null;
        }
    }

    public static class SegmentList extends MultiSegmentBase {
        final List<RangedUri> mediaSegments;

        public SegmentList(RangedUri rangedUri, long j10, long j11, long j12, long j13, List<SegmentTimelineElement> list, List<RangedUri> list2) {
            super(rangedUri, j10, j11, j12, j13, list);
            this.mediaSegments = list2;
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.SegmentBase.MultiSegmentBase
        public int getSegmentCount(long j10) {
            return this.mediaSegments.size();
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.SegmentBase.MultiSegmentBase
        public RangedUri getSegmentUrl(Representation representation, long j10) {
            return this.mediaSegments.get((int) (j10 - this.startNumber));
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.SegmentBase.MultiSegmentBase
        public boolean isExplicit() {
            return true;
        }
    }

    public static class SegmentTemplate extends MultiSegmentBase {
        final UrlTemplate initializationTemplate;
        final UrlTemplate mediaTemplate;

        public SegmentTemplate(RangedUri rangedUri, long j10, long j11, long j12, long j13, List<SegmentTimelineElement> list, UrlTemplate urlTemplate, UrlTemplate urlTemplate2) {
            super(rangedUri, j10, j11, j12, j13, list);
            this.initializationTemplate = urlTemplate;
            this.mediaTemplate = urlTemplate2;
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.SegmentBase
        public RangedUri getInitialization(Representation representation) {
            UrlTemplate urlTemplate = this.initializationTemplate;
            if (urlTemplate == null) {
                return super.getInitialization(representation);
            }
            Format format = representation.format;
            return new RangedUri(urlTemplate.buildUri(format.f150732id, 0L, format.bitrate, 0L), 0L, -1L);
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.SegmentBase.MultiSegmentBase
        public int getSegmentCount(long j10) {
            List<SegmentTimelineElement> list = this.segmentTimeline;
            if (list != null) {
                return list.size();
            }
            if (j10 != -9223372036854775807L) {
                return (int) Util.ceilDivide(j10, (this.duration * 1000000) / this.timescale);
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.SegmentBase.MultiSegmentBase
        public RangedUri getSegmentUrl(Representation representation, long j10) {
            List<SegmentTimelineElement> list = this.segmentTimeline;
            long j11 = list != null ? list.get((int) (j10 - this.startNumber)).startTime : (j10 - this.startNumber) * this.duration;
            UrlTemplate urlTemplate = this.mediaTemplate;
            Format format = representation.format;
            return new RangedUri(urlTemplate.buildUri(format.f150732id, j10, format.bitrate, j11), 0L, -1L);
        }
    }

    public static class SegmentTimelineElement {
        final long duration;
        final long startTime;

        public SegmentTimelineElement(long j10, long j11) {
            this.startTime = j10;
            this.duration = j11;
        }
    }

    public SegmentBase(RangedUri rangedUri, long j10, long j11) {
        this.initialization = rangedUri;
        this.timescale = j10;
        this.presentationTimeOffset = j11;
    }

    public RangedUri getInitialization(Representation representation) {
        return this.initialization;
    }

    public long getPresentationTimeOffsetUs() {
        return Util.scaleLargeTimestamp(this.presentationTimeOffset, 1000000L, this.timescale);
    }

    public static class SingleSegmentBase extends SegmentBase {
        final long indexLength;
        final long indexStart;

        public SingleSegmentBase(RangedUri rangedUri, long j10, long j11, long j12, long j13) {
            super(rangedUri, j10, j11);
            this.indexStart = j12;
            this.indexLength = j13;
        }

        public RangedUri getIndex() {
            long j10 = this.indexLength;
            if (j10 <= 0) {
                return null;
            }
            return new RangedUri(null, this.indexStart, j10);
        }

        public SingleSegmentBase() {
            this(null, 1L, 0L, 0L, 0L);
        }
    }
}
