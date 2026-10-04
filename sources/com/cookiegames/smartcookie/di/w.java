package com.cookiegames.smartcookie.di;

/* JADX INFO: loaded from: classes3.dex */
public final class w implements dagger.internal.e<hc.H> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3121g f141178a;

    public w(C3121g c3121g) {
        this.f141178a = c3121g;
    }

    public static w a(C3121g c3121g) {
        return new w(c3121g);
    }

    public static hc.H c(C3121g c3121g) {
        return c3121g.v();
    }

    public static hc.H d(C3121g c3121g) {
        return c3121g.v();
    }

    public hc.H b() {
        return this.f141178a.v();
    }

    @Override // javax.inject.Provider
    public Object get() {
        return this.f141178a.v();
    }
}
