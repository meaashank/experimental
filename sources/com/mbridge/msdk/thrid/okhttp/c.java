package com.mbridge.msdk.thrid.okhttp;

import androidx.collection.LruCacheKt;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final c f159101n = new a().b().a();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final c f159102o = new a().c().a(Integer.MAX_VALUE, TimeUnit.SECONDS).a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f159103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f159104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f159105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f159106d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f159107e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f159108f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f159109g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f159110h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f159111i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f159112j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f159113k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f159114l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    String f159115m;

    private c(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, @Nullable String str) {
        this.f159103a = z10;
        this.f159104b = z11;
        this.f159105c = i10;
        this.f159106d = i11;
        this.f159107e = z12;
        this.f159108f = z13;
        this.f159109g = z14;
        this.f159110h = i12;
        this.f159111i = i13;
        this.f159112j = z15;
        this.f159113k = z16;
        this.f159114l = z17;
        this.f159115m = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.mbridge.msdk.thrid.okhttp.c a(com.mbridge.msdk.thrid.okhttp.r r23) {
        /*
            Method dump skipped, instruction units count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okhttp.c.a(com.mbridge.msdk.thrid.okhttp.r):com.mbridge.msdk.thrid.okhttp.c");
    }

    public boolean b() {
        return this.f159107e;
    }

    public boolean c() {
        return this.f159108f;
    }

    public int d() {
        return this.f159105c;
    }

    public int e() {
        return this.f159110h;
    }

    public int f() {
        return this.f159111i;
    }

    public boolean g() {
        return this.f159109g;
    }

    public boolean h() {
        return this.f159103a;
    }

    public boolean i() {
        return this.f159104b;
    }

    public boolean j() {
        return this.f159112j;
    }

    public String toString() {
        String str = this.f159115m;
        if (str != null) {
            return str;
        }
        String strA = a();
        this.f159115m = strA;
        return strA;
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f159116a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f159117b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f159118c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f159119d = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f159120e = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f159121f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f159122g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f159123h;

        public a a(int i10, TimeUnit timeUnit) {
            if (i10 < 0) {
                throw new IllegalArgumentException(android.support.v4.media.c.a("maxStale < 0: ", i10));
            }
            long seconds = timeUnit.toSeconds(i10);
            this.f159119d = seconds > LruCacheKt.f86729a ? Integer.MAX_VALUE : (int) seconds;
            return this;
        }

        public a b() {
            this.f159116a = true;
            return this;
        }

        public a c() {
            this.f159121f = true;
            return this;
        }

        public c a() {
            return new c(this);
        }
    }

    public c(a aVar) {
        this.f159103a = aVar.f159116a;
        this.f159104b = aVar.f159117b;
        this.f159105c = aVar.f159118c;
        this.f159106d = -1;
        this.f159107e = false;
        this.f159108f = false;
        this.f159109g = false;
        this.f159110h = aVar.f159119d;
        this.f159111i = aVar.f159120e;
        this.f159112j = aVar.f159121f;
        this.f159113k = aVar.f159122g;
        this.f159114l = aVar.f159123h;
    }

    private String a() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f159103a) {
            sb2.append("no-cache, ");
        }
        if (this.f159104b) {
            sb2.append("no-store, ");
        }
        if (this.f159105c != -1) {
            sb2.append("max-age=");
            sb2.append(this.f159105c);
            sb2.append(U6.j.f68738d);
        }
        if (this.f159106d != -1) {
            sb2.append("s-maxage=");
            sb2.append(this.f159106d);
            sb2.append(U6.j.f68738d);
        }
        if (this.f159107e) {
            sb2.append("private, ");
        }
        if (this.f159108f) {
            sb2.append("public, ");
        }
        if (this.f159109g) {
            sb2.append("must-revalidate, ");
        }
        if (this.f159110h != -1) {
            sb2.append("max-stale=");
            sb2.append(this.f159110h);
            sb2.append(U6.j.f68738d);
        }
        if (this.f159111i != -1) {
            sb2.append("min-fresh=");
            sb2.append(this.f159111i);
            sb2.append(U6.j.f68738d);
        }
        if (this.f159112j) {
            sb2.append("only-if-cached, ");
        }
        if (this.f159113k) {
            sb2.append("no-transform, ");
        }
        if (this.f159114l) {
            sb2.append("immutable, ");
        }
        if (sb2.length() == 0) {
            return "";
        }
        sb2.delete(sb2.length() - 2, sb2.length());
        return sb2.toString();
    }
}
