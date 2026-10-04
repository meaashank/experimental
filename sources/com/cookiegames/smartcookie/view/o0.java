package com.cookiegames.smartcookie.view;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes3.dex */
public final class o0 implements dagger.internal.e<n0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider<k4.j> f148504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider<hc.H> f148505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Provider<hc.H> f148506c;

    public o0(Provider<k4.j> provider, Provider<hc.H> provider2, Provider<hc.H> provider3) {
        this.f148504a = provider;
        this.f148505b = provider2;
        this.f148506c = provider3;
    }

    public static o0 a(Provider<k4.j> provider, Provider<hc.H> provider2, Provider<hc.H> provider3) {
        return new o0(provider, provider2, provider3);
    }

    public static n0 c(k4.j jVar, hc.H h10, hc.H h11) {
        return new n0(jVar, h10, h11);
    }

    public static n0 d(Provider<k4.j> provider, Provider<hc.H> provider2, Provider<hc.H> provider3) {
        return new n0(provider.get(), provider2.get(), provider3.get());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public n0 get() {
        return d(this.f148504a, this.f148505b, this.f148506c);
    }
}
