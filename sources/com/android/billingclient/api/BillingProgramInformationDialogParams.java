package com.android.billingclient.api;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC3017k2
public final class BillingProgramInformationDialogParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f136351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f136352b;

    public static final class Builder {
        private int zza;
        private String zzb;

        private Builder() {
            throw null;
        }

        @NonNull
        public BillingProgramInformationDialogParams build() {
            int i10 = this.zza;
            if (i10 == 0) {
                throw new IllegalArgumentException("Billing program must be set.");
            }
            if (i10 != 5) {
                throw new IllegalArgumentException("The requested billing program is not supported for the billing program information dialog API.");
            }
            if (this.zzb != null) {
                return new BillingProgramInformationDialogParams(this);
            }
            throw new IllegalArgumentException("External transaction token must be set.");
        }

        @NonNull
        public Builder setBillingProgram(int i10) {
            this.zza = i10;
            return this;
        }

        @NonNull
        public Builder setExternalTransactionToken(@NonNull String str) {
            this.zzb = str;
            return this;
        }

        public /* synthetic */ Builder(P1 p12) {
        }
    }

    @NonNull
    public static Builder c() {
        return new Builder(null);
    }

    public int a() {
        return this.f136351a;
    }

    @NonNull
    public String b() {
        return this.f136352b;
    }

    public BillingProgramInformationDialogParams(Builder builder) {
        this.f136351a = builder.zza;
        this.f136352b = builder.zzb;
    }
}
