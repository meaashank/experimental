package com.android.billingclient.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@M2
public final class EnableBillingProgramParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f136384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final M f136385b;

    public static final class Builder {
        private int zza;

        @Nullable
        private M zzb;

        @NonNull
        public EnableBillingProgramParams build() {
            return new EnableBillingProgramParams(this, null);
        }

        @NonNull
        public Builder setBillingProgram(int i10) {
            this.zza = i10;
            return this;
        }

        @NonNull
        public Builder setDeveloperProvidedBillingListener(@Nullable M m10) {
            this.zzb = m10;
            return this;
        }
    }

    public /* synthetic */ EnableBillingProgramParams(Builder builder, Z1 z12) {
        this.f136384a = builder.zza;
        this.f136385b = builder.zzb;
    }

    @NonNull
    public static Builder c() {
        return new Builder();
    }

    public int a() {
        return this.f136384a;
    }

    @Nullable
    public M b() {
        return this.f136385b;
    }
}
