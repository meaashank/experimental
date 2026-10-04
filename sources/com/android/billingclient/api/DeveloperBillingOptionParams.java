package com.android.billingclient.api;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
public final class DeveloperBillingOptionParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f136374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f136375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f136376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f136377d;

    public static final class Builder {
        private Uri zza;
        private int zzb = 0;
        private int zzc = 0;

        @Nullable
        private String zzd;

        private Builder() {
        }

        @NonNull
        public DeveloperBillingOptionParams build() {
            int i10 = this.zzc;
            if (i10 == 0) {
                throw new IllegalArgumentException("Billing program is required.");
            }
            if (i10 == 5 && this.zza != null && TextUtils.isEmpty(this.zzd)) {
                throw new IllegalArgumentException("External transaction token is required for billing choice with an external link.");
            }
            Uri uri = this.zza;
            if (uri == null || uri.getScheme() != null) {
                return new DeveloperBillingOptionParams(this, null);
            }
            throw new IllegalArgumentException("URI must have a scheme.");
        }

        @NonNull
        public Builder setBillingProgram(int i10) {
            this.zzc = i10;
            return this;
        }

        @NonNull
        @InterfaceC3017k2
        public Builder setExternalTransactionToken(@Nullable String str) {
            this.zzd = str;
            return this;
        }

        @NonNull
        public Builder setLaunchMode(int i10) {
            this.zzb = i10;
            return this;
        }

        @NonNull
        public Builder setLinkUri(@NonNull Uri uri) {
            this.zza = uri;
            return this;
        }

        public /* synthetic */ Builder(X1 x12) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {

        /* JADX INFO: renamed from: R0, reason: collision with root package name */
        public static final int f136378R0 = 0;

        /* JADX INFO: renamed from: S0, reason: collision with root package name */
        public static final int f136379S0 = 1;

        /* JADX INFO: renamed from: T0, reason: collision with root package name */
        public static final int f136380T0 = 2;
    }

    public /* synthetic */ DeveloperBillingOptionParams(Builder builder, X1 x12) {
        this.f136374a = builder.zza;
        this.f136375b = builder.zzb;
        this.f136376c = builder.zzc;
        this.f136377d = builder.zzd;
    }

    @NonNull
    public static Builder e() {
        return new Builder(null);
    }

    public int a() {
        return this.f136376c;
    }

    @Nullable
    @InterfaceC3017k2
    public String b() {
        return this.f136377d;
    }

    public int c() {
        return this.f136375b;
    }

    @Nullable
    public Uri d() {
        return this.f136374a;
    }
}
