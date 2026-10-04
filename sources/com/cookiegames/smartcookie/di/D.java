package com.cookiegames.smartcookie.di;

import javax.inject.Provider;
import okhttp3.CacheControl;

/* JADX INFO: loaded from: classes3.dex */
public final class D implements dagger.internal.e<z4.k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3121g f141080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider<CacheControl> f141081b;

    public D(C3121g c3121g, Provider<CacheControl> provider) {
        this.f141080a = c3121g;
        this.f141081b = provider;
    }

    public static D a(C3121g c3121g, Provider<CacheControl> provider) {
        return new D(c3121g, provider);
    }

    public static z4.k c(C3121g c3121g, Provider<CacheControl> provider) {
        return c3121g.E(provider.get());
    }

    public static z4.k d(C3121g c3121g, CacheControl cacheControl) {
        return c3121g.E(cacheControl);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public z4.k get() {
        return c(this.f141080a, this.f141081b);
    }
}
