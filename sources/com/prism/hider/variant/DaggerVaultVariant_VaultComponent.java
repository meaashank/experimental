package com.prism.hider.variant;

import com.prism.hider.variant.b;
import com.prism.hider.vault.calculator.B;
import com.prism.hider.vault.calculator.CalculatorVaultUI;
import com.prism.hider.vault.commons.E;
import com.prism.hider.vault.commons.VaultUI;
import com.prism.hider.vault.commons.v;
import com.prism.hider.vault.commons.w;
import dagger.internal.MapFactory;
import dagger.internal.d;
import java.util.Map;
import javax.inject.Provider;
import oa.k;
import oa.l;

/* JADX INFO: loaded from: classes6.dex */
public final class DaggerVaultVariant_VaultComponent implements b.InterfaceC0686b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Provider<VaultUI> f168410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Provider<Map<String, VaultUI>> f168411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Provider<String[]> f168412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Provider<E> f168413d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Provider<v> f168414e;

    public static final class Builder {
        public b.InterfaceC0686b build() {
            return new DaggerVaultVariant_VaultComponent(this);
        }

        @Deprecated
        public Builder calculatorVaultUI(CalculatorVaultUI calculatorVaultUI) {
            calculatorVaultUI.getClass();
            return this;
        }

        @Deprecated
        public Builder defaultVaultSetupUI(k kVar) {
            kVar.getClass();
            return this;
        }

        @Deprecated
        public Builder orderModule(b.a aVar) {
            aVar.getClass();
            return this;
        }

        private Builder() {
        }
    }

    public static Builder a() {
        return new Builder();
    }

    public static b.InterfaceC0686b b() {
        return new Builder().build();
    }

    public final void c(Builder builder) {
        this.f168410a = d.b(B.f168419a);
        this.f168411b = MapFactory.a(1).put(CalculatorVaultUI.VAULT_UI_ID, this.f168410a).build();
        this.f168412c = d.b(c.f168417a);
        Provider<E> providerB = d.b(l.f223419a);
        this.f168413d = providerB;
        this.f168414e = d.b(new w(this.f168411b, this.f168412c, providerB));
    }

    @Override // com.prism.hider.variant.b.InterfaceC0686b
    public v get() {
        return this.f168414e.get();
    }

    public DaggerVaultVariant_VaultComponent(Builder builder) {
        c(builder);
    }
}
