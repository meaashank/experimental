package com.android.billingclient.api;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class ConsumeParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f136365a;

    public static final class Builder {
        private String zza;

        private Builder() {
            throw null;
        }

        @NonNull
        public ConsumeParams build() {
            String str = this.zza;
            if (str == null) {
                throw new IllegalArgumentException("Purchase token must be set");
            }
            ConsumeParams consumeParams = new ConsumeParams();
            consumeParams.f136365a = str;
            return consumeParams;
        }

        @NonNull
        public Builder setPurchaseToken(@NonNull String str) {
            this.zza = str;
            return this;
        }

        public /* synthetic */ Builder(T1 t12) {
        }
    }

    public ConsumeParams() {
        throw null;
    }

    @NonNull
    public static Builder b() {
        return new Builder(null);
    }

    @NonNull
    public String a() {
        return this.f136365a;
    }

    public /* synthetic */ ConsumeParams(T1 t12) {
    }
}
