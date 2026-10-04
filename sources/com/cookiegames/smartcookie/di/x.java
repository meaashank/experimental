package com.cookiegames.smartcookie.di;

/* JADX INFO: loaded from: classes3.dex */
public final class x implements dagger.internal.e<hc.H> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3121g f141179a;

    public x(C3121g c3121g) {
        this.f141179a = c3121g;
    }

    public static x a(C3121g c3121g) {
        return new x(c3121g);
    }

    public static hc.H c(C3121g c3121g) {
        return c3121g.w();
    }

    public static hc.H d(C3121g c3121g) {
        return c3121g.w();
    }

    public hc.H b() {
        return this.f141179a.w();
    }

    @Override // javax.inject.Provider
    public Object get() {
        return this.f141179a.w();
    }
}
