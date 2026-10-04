package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.f6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3540f6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f152914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f152915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f152916c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f152917d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f152918e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f152919f;

    public C3540f6(String fileName, long j10, int i10, long j11, boolean z10, int i11) {
        kotlin.jvm.internal.G.p(fileName, "fileName");
        this.f152914a = fileName;
        this.f152915b = j10;
        this.f152916c = i10;
        this.f152917d = j11;
        this.f152918e = z10;
        this.f152919f = i11;
    }

    public /* synthetic */ C3540f6(String str, long j10, int i10, long j11, boolean z10, int i11, int i12) {
        this(str, j10, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0L : j11, (i12 & 16) != 0 ? false : z10, (i12 & 32) != 0 ? 0 : i11);
    }
}
