package com.prism.hider.vault.calculator;

import com.prism.hider.vault.commons.VaultUI;

/* JADX INFO: loaded from: classes6.dex */
public final class B implements dagger.internal.e<VaultUI> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final B f168419a = new B();

    public static B a() {
        return f168419a;
    }

    public static VaultUI c() {
        return d();
    }

    public static VaultUI d() {
        VaultUI vaultUIProvideVaultUI = CalculatorVaultUI.provideVaultUI();
        dagger.internal.j.b(vaultUIProvideVaultUI, "Cannot return null from a non-@Nullable @Provides method");
        return vaultUIProvideVaultUI;
    }

    public VaultUI b() {
        return d();
    }

    @Override // javax.inject.Provider
    public Object get() {
        return d();
    }
}
