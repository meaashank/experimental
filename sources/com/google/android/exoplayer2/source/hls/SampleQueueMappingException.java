package com.google.android.exoplayer2.source.hls;

import android.support.v4.media.i;
import com.android.launcher3.IconCache;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class SampleQueueMappingException extends IOException {
    public SampleQueueMappingException(String str) {
        super(i.a("Unable to bind a sample queue to TrackGroup with mime type ", str, IconCache.EMPTY_CLASS_NAME));
    }
}
