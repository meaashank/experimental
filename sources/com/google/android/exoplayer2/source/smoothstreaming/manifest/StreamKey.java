package com.google.android.exoplayer2.source.smoothstreaming.manifest;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.android.launcher3.IconCache;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamKey implements Comparable<StreamKey> {
    public final int streamElementIndex;
    public final int trackIndex;

    public StreamKey(int i10, int i11) {
        this.streamElementIndex = i10;
        this.trackIndex = i11;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && StreamKey.class == obj.getClass()) {
            StreamKey streamKey = (StreamKey) obj;
            if (this.streamElementIndex == streamKey.streamElementIndex && this.trackIndex == streamKey.trackIndex) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.streamElementIndex * 31) + this.trackIndex;
    }

    public String toString() {
        return this.streamElementIndex + IconCache.EMPTY_CLASS_NAME + this.trackIndex;
    }

    @Override // java.lang.Comparable
    public int compareTo(@NonNull StreamKey streamKey) {
        int i10 = this.streamElementIndex - streamKey.streamElementIndex;
        return i10 == 0 ? this.trackIndex - streamKey.trackIndex : i10;
    }
}
