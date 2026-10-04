package com.google.android.exoplayer2.source.dash;

import com.google.android.exoplayer2.source.dash.manifest.RangedUri;

/* JADX INFO: loaded from: classes3.dex */
public interface DashSegmentIndex {
    public static final int INDEX_UNBOUNDED = -1;

    long getDurationUs(long j10, long j11);

    long getFirstSegmentNum();

    int getSegmentCount(long j10);

    long getSegmentNum(long j10, long j11);

    RangedUri getSegmentUrl(long j10);

    long getTimeUs(long j10);

    boolean isExplicit();
}
