package com.android.billingclient.api;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class AcknowledgePurchaseParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f136280a;

    public static final class Builder {
        private String zza;

        private Builder() {
            throw null;
        }

        @NonNull
        public AcknowledgePurchaseParams build() {
            String str = this.zza;
            if (str == null) {
                throw new IllegalArgumentException("Purchase token must be set");
            }
            AcknowledgePurchaseParams acknowledgePurchaseParams = new AcknowledgePurchaseParams();
            acknowledgePurchaseParams.f136280a = str;
            return acknowledgePurchaseParams;
        }

        @NonNull
        public Builder setPurchaseToken(@NonNull String str) {
            this.zza = str;
            return this;
        }

        public /* synthetic */ Builder(C3023m0 c3023m0) {
        }
    }

    public AcknowledgePurchaseParams() {
        throw null;
    }

    @NonNull
    public static Builder b() {
        return new Builder(null);
    }

    @NonNull
    public String a() {
        return this.f136280a;
    }

    public /* synthetic */ AcknowledgePurchaseParams(C3023m0 c3023m0) {
    }
}
