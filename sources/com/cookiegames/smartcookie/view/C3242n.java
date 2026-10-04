package com.cookiegames.smartcookie.view;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.cookiegames.smartcookie.view.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3242n implements dagger.internal.e<C3241m> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider<u4.e> f148499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider<n0> f148500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Provider<C3230b> f148501c;

    public C3242n(Provider<u4.e> provider, Provider<n0> provider2, Provider<C3230b> provider3) {
        this.f148499a = provider;
        this.f148500b = provider2;
        this.f148501c = provider3;
    }

    public static C3242n a(Provider<u4.e> provider, Provider<n0> provider2, Provider<C3230b> provider3) {
        return new C3242n(provider, provider2, provider3);
    }

    public static C3241m c(u4.e eVar, n0 n0Var, C3230b c3230b) {
        return new C3241m(eVar, n0Var, c3230b);
    }

    public static C3241m d(Provider<u4.e> provider, Provider<n0> provider2, Provider<C3230b> provider3) {
        return new C3241m(provider.get(), provider2.get(), provider3.get());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3241m get() {
        return d(this.f148499a, this.f148500b, this.f148501c);
    }
}
