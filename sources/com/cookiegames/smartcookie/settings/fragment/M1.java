package com.cookiegames.smartcookie.settings.fragment;

import bc.InterfaceC2856f;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes3.dex */
public final class M1 implements InterfaceC2856f<HomepageSettingsFragment> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider<u4.e> f148005a;

    public M1(Provider<u4.e> provider) {
        this.f148005a = provider;
    }

    public static InterfaceC2856f<HomepageSettingsFragment> a(Provider<u4.e> provider) {
        return new M1(provider);
    }

    public static void c(HomepageSettingsFragment homepageSettingsFragment, u4.e eVar) {
        homepageSettingsFragment.f147976q = eVar;
    }

    @Override // bc.InterfaceC2856f
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void injectMembers(HomepageSettingsFragment homepageSettingsFragment) {
        homepageSettingsFragment.f147976q = this.f148005a.get();
    }
}
