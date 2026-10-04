package com.inmobi.media;

import androidx.collection.C1550p;

/* JADX INFO: loaded from: classes5.dex */
public final class K3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f152153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f152154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f152155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f152156d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f152157e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f152158f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f152159g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f152160h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f152161i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f152162j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f152163k;

    public K3(int i10, long j10, long j11, long j12, int i11, int i12, int i13, int i14, long j13, long j14) {
        this.f152153a = i10;
        this.f152154b = j10;
        this.f152155c = j11;
        this.f152156d = j12;
        this.f152157e = i11;
        this.f152158f = i12;
        this.f152159g = i13;
        this.f152160h = i14;
        this.f152161i = j13;
        this.f152162j = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K3)) {
            return false;
        }
        K3 k32 = (K3) obj;
        return this.f152153a == k32.f152153a && this.f152154b == k32.f152154b && this.f152155c == k32.f152155c && this.f152156d == k32.f152156d && this.f152157e == k32.f152157e && this.f152158f == k32.f152158f && this.f152159g == k32.f152159g && this.f152160h == k32.f152160h && this.f152161i == k32.f152161i && this.f152162j == k32.f152162j;
    }

    public final int hashCode() {
        return C1550p.a(this.f152162j) + ((C1550p.a(this.f152161i) + ((this.f152160h + ((this.f152159g + ((this.f152158f + ((this.f152157e + ((C1550p.a(this.f152156d) + ((C1550p.a(this.f152155c) + ((C1550p.a(this.f152154b) + (this.f152153a * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "EventConfig(maxRetryCount=" + this.f152153a + ", timeToLiveInSec=" + this.f152154b + ", processingInterval=" + this.f152155c + ", ingestionLatencyInSec=" + this.f152156d + ", minBatchSizeWifi=" + this.f152157e + ", maxBatchSizeWifi=" + this.f152158f + ", minBatchSizeMobile=" + this.f152159g + ", maxBatchSizeMobile=" + this.f152160h + ", retryIntervalWifi=" + this.f152161i + ", retryIntervalMobile=" + this.f152162j + ')';
    }
}
