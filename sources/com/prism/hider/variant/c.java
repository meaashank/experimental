package com.prism.hider.variant;

import com.prism.hider.vault.calculator.CalculatorVaultUI;
import dagger.internal.e;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements e<String[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f168417a = new c();

    public static c a() {
        return f168417a;
    }

    public static String[] c() {
        return new String[]{CalculatorVaultUI.VAULT_UI_ID};
    }

    public static String[] d() {
        return new String[]{CalculatorVaultUI.VAULT_UI_ID};
    }

    public String[] b() {
        return new String[]{CalculatorVaultUI.VAULT_UI_ID};
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new String[]{CalculatorVaultUI.VAULT_UI_ID};
    }
}
