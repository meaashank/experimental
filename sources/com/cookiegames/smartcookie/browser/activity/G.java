package com.cookiegames.smartcookie.browser.activity;

import bc.InterfaceC2856f;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes3.dex */
public final class G implements InterfaceC2856f<F> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider<u4.e> f140902a;

    public G(Provider<u4.e> provider) {
        this.f140902a = provider;
    }

    public static InterfaceC2856f<F> a(Provider<u4.e> provider) {
        return new G(provider);
    }

    public static void c(F f10, u4.e eVar) {
        f10.f140897a = eVar;
    }

    @Override // bc.InterfaceC2856f
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void injectMembers(F f10) {
        f10.f140897a = this.f140902a.get();
    }
}
