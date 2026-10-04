package com.android.billingclient.api;

import androidx.annotation.NonNull;
import com.android.billingclient.api.BillingClient;

/* JADX INFO: loaded from: classes2.dex */
public final class QueryPurchasesParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f136509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f136510b;

    public static class Builder {
        private String zza;
        private boolean zzb = false;

        private Builder() {
        }

        @NonNull
        public QueryPurchasesParams build() {
            String str = this.zza;
            if (str == null) {
                throw new IllegalArgumentException("Product type must be set");
            }
            if (!this.zzb || str.equals(BillingClient.f.f136321x0)) {
                return new QueryPurchasesParams(this, null);
            }
            throw new IllegalArgumentException("includeSuspendedSubscriptions is only supported for subscription purchases");
        }

        @NonNull
        public Builder includeSuspendedSubscriptions(boolean z10) {
            this.zzb = z10;
            return this;
        }

        @NonNull
        public Builder setProductType(@NonNull String str) {
            this.zza = str;
            return this;
        }

        public /* synthetic */ Builder(C3072y2 c3072y2) {
        }
    }

    public /* synthetic */ QueryPurchasesParams(Builder builder, C3072y2 c3072y2) {
        this.f136509a = builder.zza;
        this.f136510b = builder.zzb;
    }

    @NonNull
    public static Builder b() {
        return new Builder(null);
    }

    public boolean a() {
        return this.f136510b;
    }

    @NonNull
    public final String c() {
        return this.f136509a;
    }
}
