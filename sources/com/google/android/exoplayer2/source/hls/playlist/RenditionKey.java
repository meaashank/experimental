package com.google.android.exoplayer2.source.hls.playlist;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.android.launcher3.IconCache;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes3.dex */
public final class RenditionKey implements Comparable<RenditionKey> {
    public static final int TYPE_AUDIO = 1;
    public static final int TYPE_SUBTITLE = 2;
    public static final int TYPE_VARIANT = 0;
    public final int trackIndex;
    public final int type;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Type {
    }

    public RenditionKey(int i10, int i11) {
        this.type = i10;
        this.trackIndex = i11;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && RenditionKey.class == obj.getClass()) {
            RenditionKey renditionKey = (RenditionKey) obj;
            if (this.type == renditionKey.type && this.trackIndex == renditionKey.trackIndex) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.type * 31) + this.trackIndex;
    }

    public String toString() {
        return this.type + IconCache.EMPTY_CLASS_NAME + this.trackIndex;
    }

    @Override // java.lang.Comparable
    public int compareTo(@NonNull RenditionKey renditionKey) {
        int i10 = this.type - renditionKey.type;
        return i10 == 0 ? this.trackIndex - renditionKey.trackIndex : i10;
    }
}
