package com.prism.hider.vault.commons;

import android.app.Activity;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import bc.InterfaceC2857g;
import bc.InterfaceC2858h;
import com.prism.hider.vault.commons.C4276l;
import javax.inject.Singleton;

/* JADX INFO: loaded from: classes6.dex */
@InterfaceC2857g
public class NoneVaultModule {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f168620a = "vault_ui_id_none";

    public static class NoneVaultUI implements VaultUI {
        public static final Parcelable.Creator<NoneVaultUI> CREATOR = new a();
        private final VaultUIMeta meta;

        public class a implements Parcelable.Creator<NoneVaultUI> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public NoneVaultUI createFromParcel(Parcel parcel) {
                return new NoneVaultUI(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public NoneVaultUI[] newArray(int i10) {
                return new NoneVaultUI[i10];
            }
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
            return false;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.meta, i10);
        }

        private NoneVaultUI() {
            this.meta = new VaultUIMeta(NoneVaultModule.f168620a, C4276l.m.f171872M2);
        }

        public NoneVaultUI(Parcel parcel) {
            this.meta = (VaultUIMeta) parcel.readParcelable(VaultUIMeta.class.getClassLoader());
        }
    }

    public static class a implements E {
        public a() {
        }

        @Override // com.prism.hider.vault.commons.E
        public boolean a(Activity activity, boolean z10) {
            return false;
        }

        public a(C4272h c4272h) {
        }
    }

    @Singleton
    @InterfaceC2858h
    public static String[] a() {
        return new String[]{f168620a};
    }

    @Singleton
    @InterfaceC2858h
    public static E b() {
        return new a();
    }

    @cc.d
    @Singleton
    @InterfaceC2858h
    @cc.h(f168620a)
    public static VaultUI c() {
        return new NoneVaultUI();
    }
}
