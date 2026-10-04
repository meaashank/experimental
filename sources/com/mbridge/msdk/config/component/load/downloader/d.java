package com.mbridge.msdk.config.component.load.downloader;

/* JADX INFO: loaded from: classes5.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f154579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f154580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f154581c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f154582d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f154583e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f154584f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f154585g;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f154586a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f154587b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f154588c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f154589d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f154590e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f154591f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f154592g;

        public b() {
            this(null);
        }

        public b(d dVar) {
            this.f154586a = 20000L;
            this.f154587b = 10L;
            this.f154588c = 20000L;
            this.f154589d = 20000L;
            this.f154590e = 64;
            this.f154591f = 20;
            this.f154592g = 10;
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.a(dVar)) {
                this.f154588c = dVar.c();
                this.f154586a = dVar.a();
                this.f154590e = dVar.f();
                this.f154589d = dVar.d();
                this.f154591f = dVar.g();
                this.f154587b = dVar.b();
                this.f154592g = dVar.e();
            }
        }

        public d a() {
            return new d(this);
        }

        public b a(int i10) {
            this.f154592g = i10;
            return this;
        }
    }

    public long a() {
        return this.f154579a;
    }

    public long b() {
        return this.f154580b;
    }

    public long c() {
        return this.f154581c;
    }

    public long d() {
        return this.f154582d;
    }

    public int e() {
        return this.f154585g;
    }

    public int f() {
        return this.f154583e;
    }

    public int g() {
        return this.f154584f;
    }

    private d(b bVar) {
        this.f154579a = bVar.f154586a;
        this.f154581c = bVar.f154588c;
        this.f154582d = bVar.f154589d;
        this.f154583e = bVar.f154590e;
        this.f154584f = bVar.f154591f;
        this.f154580b = bVar.f154587b;
        this.f154585g = bVar.f154592g;
    }
}
