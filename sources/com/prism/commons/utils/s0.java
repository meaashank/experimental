package com.prism.commons.utils;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
public class s0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public T f162146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v0<T> f162147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z0<T> f162148c;

    public s0(v0<T> v0Var, z0<T> z0Var) {
        this.f162147b = v0Var;
        this.f162148c = z0Var;
    }

    public T a() {
        if (this.f162146a == null) {
            synchronized (this) {
                try {
                    if (this.f162146a == null) {
                        this.f162146a = this.f162147b.read();
                    }
                } finally {
                }
            }
        }
        return this.f162146a;
    }

    public void b(T t10) {
        this.f162146a = t10;
        synchronized (this) {
            this.f162148c.a(t10);
        }
    }

    public void c(z0<T> z0Var) {
        this.f162148c = z0Var;
    }

    public s0(@NonNull v0<T> v0Var) {
        this.f162147b = v0Var;
    }
}
