package com.prism.hider.vault.calculator;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import bc.InterfaceC2857g;
import bc.InterfaceC2858h;
import com.prism.hider.vault.commons.C4270f;
import com.prism.hider.vault.commons.VaultUI;
import com.prism.hider.vault.commons.VaultUIMeta;
import javax.inject.Singleton;
import rb.C5548b;

/* JADX INFO: loaded from: classes6.dex */
@InterfaceC2857g
public class CalculatorVaultUI implements VaultUI {
    public static final Parcelable.Creator<CalculatorVaultUI> CREATOR = new a();
    public static final String VAULT_UI_ID = "vault_ui_id_calculator";
    private final VaultUIMeta meta;

    public class a implements Parcelable.Creator<CalculatorVaultUI> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public CalculatorVaultUI createFromParcel(Parcel parcel) {
            return new CalculatorVaultUI(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public CalculatorVaultUI[] newArray(int i10) {
            return new CalculatorVaultUI[i10];
        }
    }

    private CalculatorVaultUI() {
        this.meta = new VaultUIMeta(VAULT_UI_ID, C5548b.m.f235799J3);
    }

    @cc.d
    @Singleton
    @InterfaceC2858h
    @cc.h(VAULT_UI_ID)
    public static VaultUI provideVaultUI() {
        C4270f.f168650d = w.b();
        C4270f.f168651e = new C4263o();
        return new CalculatorVaultUI();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.prism.hider.vault.commons.VaultUI
    public VaultUIMeta getMeta() {
        return this.meta;
    }

    @Override // com.prism.hider.vault.commons.VaultUI
    public boolean launchVault(Context context) {
        String strB = C4270f.f168647a.b();
        if (context.getPackageName().equals(strB)) {
            context.startActivity(new Intent(context, (Class<?>) VaultGateActivity.class));
            return true;
        }
        context.startActivity(com.prism.hider.vault.commons.N.c(context, strB, VaultGateActivity.class));
        return true;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.meta, i10);
    }

    public CalculatorVaultUI(Parcel parcel) {
        this.meta = (VaultUIMeta) parcel.readParcelable(VaultUIMeta.class.getClassLoader());
    }
}
