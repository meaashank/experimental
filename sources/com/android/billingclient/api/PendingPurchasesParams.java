package com.android.billingclient.api;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
@V2
public final class PendingPurchasesParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f136469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f136470b;

    @V2
    public static final class Builder {
        private boolean enableOneTimeProducts;
        private boolean enablePrepaidPlans;

        private Builder() {
        }

        @NonNull
        public PendingPurchasesParams build() {
            if (this.enableOneTimeProducts) {
                return new PendingPurchasesParams(true, this.enablePrepaidPlans);
            }
            throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
        }

        @NonNull
        public Builder enableOneTimeProducts() {
            this.enableOneTimeProducts = true;
            return this;
        }

        @NonNull
        public Builder enablePrepaidPlans() {
            this.enablePrepaidPlans = true;
            return this;
        }
    }

    public PendingPurchasesParams(boolean z10, boolean z11) {
        this.f136469a = z10;
        this.f136470b = z11;
    }

    @NonNull
    public static Builder c() {
        return new Builder();
    }

    public boolean a() {
        return this.f136469a;
    }

    public boolean b() {
        return this.f136470b;
    }
}
