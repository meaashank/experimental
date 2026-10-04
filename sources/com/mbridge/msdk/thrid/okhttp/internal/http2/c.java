package com.mbridge.msdk.thrid.okhttp.internal.http2;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final com.mbridge.msdk.thrid.okio.f f159427d = com.mbridge.msdk.thrid.okio.f.c(com.prism.gaia.server.accounts.b.f166434b0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final com.mbridge.msdk.thrid.okio.f f159428e = com.mbridge.msdk.thrid.okio.f.c(Hd.a.f50749f);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final com.mbridge.msdk.thrid.okio.f f159429f = com.mbridge.msdk.thrid.okio.f.c(Hd.a.f50750g);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final com.mbridge.msdk.thrid.okio.f f159430g = com.mbridge.msdk.thrid.okio.f.c(Hd.a.f50751h);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final com.mbridge.msdk.thrid.okio.f f159431h = com.mbridge.msdk.thrid.okio.f.c(Hd.a.f50752i);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final com.mbridge.msdk.thrid.okio.f f159432i = com.mbridge.msdk.thrid.okio.f.c(Hd.a.f50753j);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.mbridge.msdk.thrid.okio.f f159433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.mbridge.msdk.thrid.okio.f f159434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f159435c;

    public interface a {
    }

    public c(String str, String str2) {
        this(com.mbridge.msdk.thrid.okio.f.c(str), com.mbridge.msdk.thrid.okio.f.c(str2));
    }

    public boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f159433a.equals(cVar.f159433a) && this.f159434b.equals(cVar.f159434b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f159434b.hashCode() + ((this.f159433a.hashCode() + 527) * 31);
    }

    public String toString() {
        return com.mbridge.msdk.thrid.okhttp.internal.c.a("%s: %s", this.f159433a.m(), this.f159434b.m());
    }

    public c(com.mbridge.msdk.thrid.okio.f fVar, String str) {
        this(fVar, com.mbridge.msdk.thrid.okio.f.c(str));
    }

    public c(com.mbridge.msdk.thrid.okio.f fVar, com.mbridge.msdk.thrid.okio.f fVar2) {
        this.f159433a = fVar;
        this.f159434b = fVar2;
        this.f159435c = fVar2.j() + fVar.j() + 32;
    }
}
