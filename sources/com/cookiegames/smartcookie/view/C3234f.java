package com.cookiegames.smartcookie.view;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.cookiegames.smartcookie.view.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3234f implements dagger.internal.e<C3233e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider<h4.j> f148448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider<hc.H> f148449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Provider<hc.H> f148450c;

    public C3234f(Provider<h4.j> provider, Provider<hc.H> provider2, Provider<hc.H> provider3) {
        this.f148448a = provider;
        this.f148449b = provider2;
        this.f148450c = provider3;
    }

    public static C3234f a(Provider<h4.j> provider, Provider<hc.H> provider2, Provider<hc.H> provider3) {
        return new C3234f(provider, provider2, provider3);
    }

    public static C3233e c(h4.j jVar, hc.H h10, hc.H h11) {
        return new C3233e(jVar, h10, h11);
    }

    public static C3233e d(Provider<h4.j> provider, Provider<hc.H> provider2, Provider<hc.H> provider3) {
        return new C3233e(provider.get(), provider2.get(), provider3.get());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3233e get() {
        return d(this.f148448a, this.f148449b, this.f148450c);
    }
}
