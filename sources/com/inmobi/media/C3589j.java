package com.inmobi.media;

import java.io.File;

/* JADX INFO: renamed from: com.inmobi.media.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3589j {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f153014m = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f153015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f153016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f153017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f153018d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f153019e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f153020f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f153021g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f153022h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f153023i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f153024j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f153025k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public byte f153026l;

    public C3589j(int i10, String url, String str, int i11, long j10, long j11, long j12, long j13) {
        kotlin.jvm.internal.G.p(url, "url");
        this.f153015a = i10;
        this.f153016b = url;
        this.f153017c = str;
        this.f153018d = i11;
        this.f153019e = j10;
        this.f153020f = j11;
        this.f153021g = j12;
        this.f153022h = j13;
    }

    public final void a(byte b10) {
        this.f153026l = b10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3589j) {
            return kotlin.jvm.internal.G.g(this.f153016b, ((C3589j) obj).f153016b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f153016b.hashCode();
    }

    public final String toString() {
        return android.support.v4.media.e.a(new StringBuilder("AdAsset{url='"), this.f153016b, "'}");
    }

    public final boolean a() {
        return AbstractC3620l2.a(this.f153017c) && new File(this.f153017c).exists();
    }
}
