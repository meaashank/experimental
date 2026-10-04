package com.cookiegames.smartcookie.settings.fragment;

import bc.InterfaceC2856f;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes3.dex */
public final class X1 implements InterfaceC2856f<ParentalControlSettingsFragment> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider<u4.e> f148107a;

    public X1(Provider<u4.e> provider) {
        this.f148107a = provider;
    }

    public static InterfaceC2856f<ParentalControlSettingsFragment> a(Provider<u4.e> provider) {
        return new X1(provider);
    }

    public static void c(ParentalControlSettingsFragment parentalControlSettingsFragment, u4.e eVar) {
        parentalControlSettingsFragment.f148027p = eVar;
    }

    @Override // bc.InterfaceC2856f
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void injectMembers(ParentalControlSettingsFragment parentalControlSettingsFragment) {
        parentalControlSettingsFragment.f148027p = this.f148107a.get();
    }
}
