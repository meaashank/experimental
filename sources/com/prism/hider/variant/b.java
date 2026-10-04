package com.prism.hider.variant;

import bc.InterfaceC2857g;
import bc.InterfaceC2858h;
import com.prism.hider.vault.calculator.CalculatorVaultUI;
import com.prism.hider.vault.commons.InterfaceC4278n;
import com.prism.hider.vault.commons.v;
import dagger.Component;
import javax.inject.Singleton;
import oa.k;

/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static InterfaceC0686b f168416a;

    @InterfaceC2857g
    public static class a {
        @Singleton
        @InterfaceC2858h
        public static String[] a() {
            return new String[]{CalculatorVaultUI.VAULT_UI_ID};
        }
    }

    /* JADX INFO: renamed from: com.prism.hider.variant.b$b, reason: collision with other inner class name */
    @Component(modules = {k.class, CalculatorVaultUI.class, a.class})
    @Singleton
    public interface InterfaceC0686b {
        @Singleton
        v get();
    }

    public static boolean a() {
        return true;
    }

    public static InterfaceC4278n b() {
        if (f168416a == null) {
            synchronized (b.class) {
                try {
                    if (f168416a == null) {
                        f168416a = DaggerVaultVariant_VaultComponent.b();
                    }
                } finally {
                }
            }
        }
        return f168416a.get();
    }
}
