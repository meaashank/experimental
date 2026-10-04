package com.cookiegames.smartcookie.di;

/* JADX INFO: loaded from: classes3.dex */
public final class y implements dagger.internal.e<hc.H> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3121g f141180a;

    public y(C3121g c3121g) {
        this.f141180a = c3121g;
    }

    public static y a(C3121g c3121g) {
        return new y(c3121g);
    }

    public static hc.H c(C3121g c3121g) {
        return c3121g.x();
    }

    public static hc.H d(C3121g c3121g) {
        return c3121g.x();
    }

    public hc.H b() {
        return this.f141180a.x();
    }

    @Override // javax.inject.Provider
    public Object get() {
        return this.f141180a.x();
    }
}
