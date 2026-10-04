package com.cookiegames.smartcookie.adblock.allowlist;

import hc.H;
import javax.inject.Provider;
import p4.InterfaceC5390c;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements dagger.internal.e<SessionAllowListModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider<V3.h> f140709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider<H> f140710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC5390c> f140711c;

    public k(Provider<V3.h> provider, Provider<H> provider2, Provider<InterfaceC5390c> provider3) {
        this.f140709a = provider;
        this.f140710b = provider2;
        this.f140711c = provider3;
    }

    public static k a(Provider<V3.h> provider, Provider<H> provider2, Provider<InterfaceC5390c> provider3) {
        return new k(provider, provider2, provider3);
    }

    public static SessionAllowListModel c(V3.h hVar, H h10, InterfaceC5390c interfaceC5390c) {
        return new SessionAllowListModel(hVar, h10, interfaceC5390c);
    }

    public static SessionAllowListModel d(Provider<V3.h> provider, Provider<H> provider2, Provider<InterfaceC5390c> provider3) {
        return new SessionAllowListModel(provider.get(), provider2.get(), provider3.get());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public SessionAllowListModel get() {
        return d(this.f140709a, this.f140710b, this.f140711c);
    }
}
