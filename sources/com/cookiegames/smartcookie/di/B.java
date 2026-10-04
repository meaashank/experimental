package com.cookiegames.smartcookie.di;

import okhttp3.CacheControl;

/* JADX INFO: loaded from: classes3.dex */
public final class B implements dagger.internal.e<CacheControl> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3121g f141077a;

    public B(C3121g c3121g) {
        this.f141077a = c3121g;
    }

    public static B a(C3121g c3121g) {
        return new B(c3121g);
    }

    public static CacheControl c(C3121g c3121g) {
        return d(c3121g);
    }

    public static CacheControl d(C3121g c3121g) {
        CacheControl cacheControlA = c3121g.A();
        dagger.internal.j.b(cacheControlA, "Cannot return null from a non-@Nullable @Provides method");
        return cacheControlA;
    }

    public CacheControl b() {
        return d(this.f141077a);
    }

    @Override // javax.inject.Provider
    public Object get() {
        return d(this.f141077a);
    }
}
