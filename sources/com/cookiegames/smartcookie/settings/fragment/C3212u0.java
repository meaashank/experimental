package com.cookiegames.smartcookie.settings.fragment;

import bc.InterfaceC2856f;
import javax.inject.Provider;

/* JADX INFO: renamed from: com.cookiegames.smartcookie.settings.fragment.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3212u0 implements InterfaceC2856f<DrawerSettingsFragment> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider<u4.e> f148240a;

    public C3212u0(Provider<u4.e> provider) {
        this.f148240a = provider;
    }

    public static InterfaceC2856f<DrawerSettingsFragment> a(Provider<u4.e> provider) {
        return new C3212u0(provider);
    }

    public static void c(DrawerSettingsFragment drawerSettingsFragment, u4.e eVar) {
        drawerSettingsFragment.f147876p = eVar;
    }

    @Override // bc.InterfaceC2856f
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void injectMembers(DrawerSettingsFragment drawerSettingsFragment) {
        drawerSettingsFragment.f147876p = this.f148240a.get();
    }
}
