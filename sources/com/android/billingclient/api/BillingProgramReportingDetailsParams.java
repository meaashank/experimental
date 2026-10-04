package com.android.billingclient.api;

import androidx.annotation.NonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
public final class BillingProgramReportingDetailsParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f136353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f136354b;

    public static final class Builder {
        private int zza = 0;
        private int zzb = 0;

        private Builder() {
        }

        @NonNull
        public BillingProgramReportingDetailsParams build() {
            int i10 = this.zza;
            if (i10 == 0) {
                throw new IllegalArgumentException("Billing program is not specified.");
            }
            if (i10 == 5 && this.zzb == 0) {
                throw new IllegalArgumentException("Developer billing type must be specified for billing choice.");
            }
            return new BillingProgramReportingDetailsParams(this, null);
        }

        @NonNull
        public Builder setBillingProgram(int i10) {
            this.zza = i10;
            return this;
        }

        @NonNull
        @InterfaceC3017k2
        public Builder setDeveloperBillingType(int i10) {
            this.zzb = i10;
            return this;
        }

        public /* synthetic */ Builder(Q1 q12) {
        }
    }

    @InterfaceC3017k2
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {

        /* JADX INFO: renamed from: O0, reason: collision with root package name */
        public static final int f136355O0 = 0;

        /* JADX INFO: renamed from: P0, reason: collision with root package name */
        public static final int f136356P0 = 1;

        /* JADX INFO: renamed from: Q0, reason: collision with root package name */
        public static final int f136357Q0 = 2;
    }

    public /* synthetic */ BillingProgramReportingDetailsParams(Builder builder, Q1 q12) {
        this.f136353a = builder.zza;
        this.f136354b = builder.zzb;
    }

    @NonNull
    public static Builder c() {
        return new Builder(null);
    }

    public int a() {
        return this.f136353a;
    }

    @InterfaceC3017k2
    public int b() {
        return this.f136354b;
    }
}
