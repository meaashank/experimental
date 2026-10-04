package s0;

import p0.C5382f;

/* JADX INFO: loaded from: classes.dex */
public class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f237965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f237966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f237967c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f237968d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f237969e;

    public void a(C5382f c5382f) {
        this.f237966b = c5382f.l();
        this.f237967c = c5382f.w();
        this.f237968d = c5382f.q();
        this.f237969e = c5382f.h();
        this.f237965a = (int) c5382f.t();
    }

    public int b() {
        return this.f237969e - this.f237967c;
    }

    public int c() {
        return this.f237968d - this.f237966b;
    }
}
