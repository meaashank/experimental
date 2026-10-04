package com.google.android.exoplayer2.source.dash.manifest;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.android.launcher3.IconCache;

/* JADX INFO: loaded from: classes3.dex */
public final class RepresentationKey implements Comparable<RepresentationKey> {
    public final int adaptationSetIndex;
    public final int periodIndex;
    public final int representationIndex;

    public RepresentationKey(int i10, int i11, int i12) {
        this.periodIndex = i10;
        this.adaptationSetIndex = i11;
        this.representationIndex = i12;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && RepresentationKey.class == obj.getClass()) {
            RepresentationKey representationKey = (RepresentationKey) obj;
            if (this.periodIndex == representationKey.periodIndex && this.adaptationSetIndex == representationKey.adaptationSetIndex && this.representationIndex == representationKey.representationIndex) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.periodIndex * 31) + this.adaptationSetIndex) * 31) + this.representationIndex;
    }

    public String toString() {
        return this.periodIndex + IconCache.EMPTY_CLASS_NAME + this.adaptationSetIndex + IconCache.EMPTY_CLASS_NAME + this.representationIndex;
    }

    @Override // java.lang.Comparable
    public int compareTo(@NonNull RepresentationKey representationKey) {
        int i10 = this.periodIndex - representationKey.periodIndex;
        if (i10 != 0) {
            return i10;
        }
        int i11 = this.adaptationSetIndex - representationKey.adaptationSetIndex;
        return i11 == 0 ? this.representationIndex - representationKey.representationIndex : i11;
    }
}
