package com.prism.gaia.helper.utils;

/* JADX INFO: loaded from: classes6.dex */
public abstract class z<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public T f165232a;

    public abstract T a();

    public final T b() {
        T t10;
        synchronized (this) {
            try {
                if (this.f165232a == null) {
                    this.f165232a = a();
                }
                t10 = this.f165232a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return t10;
    }
}
