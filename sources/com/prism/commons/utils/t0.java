package com.prism.commons.utils;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
public class t0<T, P> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public T f162151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w0<T, P> f162152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public A0<T, P> f162153c;

    public t0(w0<T, P> w0Var, A0<T, P> a02) {
        this.f162152b = w0Var;
        this.f162153c = a02;
    }

    public T a(P p10) {
        if (this.f162151a == null) {
            synchronized (this) {
                try {
                    if (this.f162151a == null) {
                        this.f162151a = this.f162152b.b(p10);
                    }
                } finally {
                }
            }
        }
        return this.f162151a;
    }

    public void b(P p10, T t10) {
        this.f162151a = t10;
        synchronized (this) {
            this.f162153c.a(p10, t10);
        }
    }

    public void c(A0<T, P> a02) {
        this.f162153c = a02;
    }

    public t0(@NonNull w0<T, P> w0Var) {
        this.f162152b = w0Var;
    }
}
