package com.cookiegames.smartcookie.view;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.cookiegames.smartcookie.view.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3236h implements dagger.internal.e<C3235g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider<i4.k> f148454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider<hc.H> f148455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Provider<hc.H> f148456c;

    public C3236h(Provider<i4.k> provider, Provider<hc.H> provider2, Provider<hc.H> provider3) {
        this.f148454a = provider;
        this.f148455b = provider2;
        this.f148456c = provider3;
    }

    public static C3236h a(Provider<i4.k> provider, Provider<hc.H> provider2, Provider<hc.H> provider3) {
        return new C3236h(provider, provider2, provider3);
    }

    public static C3235g c(i4.k kVar, hc.H h10, hc.H h11) {
        return new C3235g(kVar, h10, h11);
    }

    public static C3235g d(Provider<i4.k> provider, Provider<hc.H> provider2, Provider<hc.H> provider3) {
        return new C3235g(provider.get(), provider2.get(), provider3.get());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3235g get() {
        return d(this.f148454a, this.f148455b, this.f148456c);
    }
}
