package com.cookiegames.smartcookie.view;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes3.dex */
public final class q0 implements dagger.internal.e<p0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider<j4.j> f148514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider<hc.H> f148515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Provider<hc.H> f148516c;

    public q0(Provider<j4.j> provider, Provider<hc.H> provider2, Provider<hc.H> provider3) {
        this.f148514a = provider;
        this.f148515b = provider2;
        this.f148516c = provider3;
    }

    public static q0 a(Provider<j4.j> provider, Provider<hc.H> provider2, Provider<hc.H> provider3) {
        return new q0(provider, provider2, provider3);
    }

    public static p0 c(j4.j jVar, hc.H h10, hc.H h11) {
        return new p0(jVar, h10, h11);
    }

    public static p0 d(Provider<j4.j> provider, Provider<hc.H> provider2, Provider<hc.H> provider3) {
        return new p0(provider.get(), provider2.get(), provider3.get());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public p0 get() {
        return d(this.f148514a, this.f148515b, this.f148516c);
    }
}
