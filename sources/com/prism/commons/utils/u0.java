package com.prism.commons.utils;

/* JADX INFO: loaded from: classes5.dex */
public class u0<T, P> implements y0<T, P> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public w0<T, P> f162154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public A0<T, P> f162155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public T f162156c;

    public u0(y0<T, P> y0Var) {
        this.f162154a = y0Var;
        this.f162155b = y0Var;
    }

    @Override // com.prism.commons.utils.A0
    public void a(P p10, T t10) {
        T t11 = this.f162156c;
        if (t11 == null || t10 == null || t11.equals(t10)) {
            return;
        }
        this.f162156c = t10;
        synchronized (this) {
            this.f162155b.a(p10, t10);
        }
    }

    @Override // com.prism.commons.utils.w0
    public T b(P p10) {
        if (this.f162156c == null) {
            synchronized (this) {
                try {
                    if (this.f162156c == null) {
                        this.f162156c = this.f162154a.b(p10);
                    }
                } finally {
                }
            }
        }
        return this.f162156c;
    }
}
