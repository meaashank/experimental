package com.mbridge.msdk.tracker.network;

/* JADX INFO: loaded from: classes5.dex */
public abstract class b0 extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f159938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f159939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f159940c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f159941d;

    public b0() {
        this.f159940c = 0;
        this.f159941d = "";
        this.f159938a = null;
    }

    public void a(long j10) {
        this.f159939b = j10;
    }

    public abstract int d();

    public int g() {
        return this.f159940c;
    }

    public void a(int i10) {
        this.f159940c = i10;
    }

    public b0(q qVar) {
        this.f159940c = 0;
        this.f159941d = "";
        this.f159938a = qVar;
    }

    public b0(String str) {
        super(str);
        this.f159940c = 0;
        this.f159941d = "";
        this.f159938a = null;
    }

    public b0(Throwable th) {
        super(th);
        this.f159940c = 0;
        this.f159941d = "";
        this.f159938a = null;
    }
}
