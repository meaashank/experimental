package com.cookiegames.smartcookie.settings.fragment;

import bc.InterfaceC2856f;
import javax.inject.Provider;

/* JADX INFO: renamed from: com.cookiegames.smartcookie.settings.fragment.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3179k0 implements InterfaceC2856f<C3175j0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider<u4.e> f148173a;

    public C3179k0(Provider<u4.e> provider) {
        this.f148173a = provider;
    }

    public static InterfaceC2856f<C3175j0> a(Provider<u4.e> provider) {
        return new C3179k0(provider);
    }

    public static void c(C3175j0 c3175j0, u4.e eVar) {
        c3175j0.f148164a = eVar;
    }

    @Override // bc.InterfaceC2856f
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void injectMembers(C3175j0 c3175j0) {
        c3175j0.f148164a = this.f148173a.get();
    }
}
