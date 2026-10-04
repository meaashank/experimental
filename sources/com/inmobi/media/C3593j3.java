package com.inmobi.media;

import androidx.collection.C1550p;

/* JADX INFO: renamed from: com.inmobi.media.j3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3593j3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f153033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f153034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f153035c;

    public C3593j3(long j10, long j11, long j12) {
        this.f153033a = j10;
        this.f153034b = j11;
        this.f153035c = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3593j3)) {
            return false;
        }
        C3593j3 c3593j3 = (C3593j3) obj;
        return this.f153033a == c3593j3.f153033a && this.f153034b == c3593j3.f153034b && this.f153035c == c3593j3.f153035c;
    }

    public final int hashCode() {
        return C1550p.a(this.f153035c) + ((C1550p.a(this.f153034b) + (C1550p.a(this.f153033a) * 31)) * 31);
    }

    public final String toString() {
        return "DeviceMemoryInfo(maxHeapSize=" + this.f153033a + ", freeHeapSize=" + this.f153034b + ", currentHeapSize=" + this.f153035c + ')';
    }
}
