package com.android.billingclient.api;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.play_billing.zzc;

/* JADX INFO: loaded from: classes2.dex */
public final class BillingResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f136358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f136359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f136360c;

    public static class Builder {
        private int zza;
        private int zzb = 0;
        private String zzc = "";

        private Builder() {
        }

        @NonNull
        public BillingResult build() {
            BillingResult billingResult = new BillingResult();
            billingResult.f136358a = this.zza;
            billingResult.f136359b = this.zzb;
            billingResult.f136360c = this.zzc;
            return billingResult;
        }

        @NonNull
        public Builder setDebugMessage(@NonNull String str) {
            this.zzc = str;
            return this;
        }

        @NonNull
        @R2
        public Builder setOnPurchasesUpdatedSubResponseCode(int i10) {
            this.zzb = i10;
            return this;
        }

        @NonNull
        public Builder setResponseCode(int i10) {
            this.zza = i10;
            return this;
        }

        public /* synthetic */ Builder(R1 r12) {
        }
    }

    @NonNull
    public static Builder d() {
        return new Builder(null);
    }

    @NonNull
    public String a() {
        return this.f136360c;
    }

    @R2
    public int b() {
        return this.f136359b;
    }

    public int c() {
        return this.f136358a;
    }

    @NonNull
    public String toString() {
        return androidx.fragment.app.G.a("Response Code: ", zzc.zzk(this.f136358a), ", Debug Message: ", this.f136360c);
    }
}
