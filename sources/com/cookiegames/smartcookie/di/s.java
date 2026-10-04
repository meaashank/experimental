package com.cookiegames.smartcookie.di;

/* JADX INFO: loaded from: classes3.dex */
public final class s implements dagger.internal.e<hc.H> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3121g f141171a;

    public s(C3121g c3121g) {
        this.f141171a = c3121g;
    }

    public static s a(C3121g c3121g) {
        return new s(c3121g);
    }

    public static hc.H c(C3121g c3121g) {
        return c3121g.p();
    }

    public static hc.H d(C3121g c3121g) {
        return c3121g.p();
    }

    public hc.H b() {
        return this.f141171a.p();
    }

    @Override // javax.inject.Provider
    public Object get() {
        return this.f141171a.p();
    }
}
