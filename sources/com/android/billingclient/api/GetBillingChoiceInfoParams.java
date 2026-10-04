package com.android.billingclient.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC3017k2
public final class GetBillingChoiceInfoParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Locale f136399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f136400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final String f136401c;

    public static final class Builder {

        @Nullable
        private Locale zza;
        private int zzb = 0;

        @NonNull
        private String zzc;

        private Builder() {
        }

        @NonNull
        public GetBillingChoiceInfoParams build() {
            if (this.zzb != 5) {
                throw new IllegalArgumentException("Only billing choice is allowed for this API.");
            }
            if (this.zzc != null) {
                return new GetBillingChoiceInfoParams(this);
            }
            throw new IllegalArgumentException("Play Billing choice image layout is required.");
        }

        @NonNull
        public Builder setBillingProgram(int i10) {
            this.zzb = i10;
            return this;
        }

        @NonNull
        public Builder setPlayBillingChoiceImageLayout(@NonNull String str) {
            this.zzc = str;
            return this;
        }

        @NonNull
        public Builder setUserLocale(@Nullable Locale locale) {
            this.zza = locale;
            return this;
        }

        public /* synthetic */ Builder(C3001g2 c3001g2) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {

        /* JADX INFO: renamed from: U0, reason: collision with root package name */
        @NonNull
        public static final String f136402U0 = "RECTANGULAR_FOUR_BY_ONE";

        /* JADX INFO: renamed from: V0, reason: collision with root package name */
        @NonNull
        public static final String f136403V0 = "RECTANGULAR_TWO_BY_TWO";

        /* JADX INFO: renamed from: W0, reason: collision with root package name */
        @NonNull
        public static final String f136404W0 = "RECTANGULAR_THREE_BY_ONE";
    }

    @NonNull
    public static Builder d() {
        return new Builder(null);
    }

    public int a() {
        return this.f136400b;
    }

    @NonNull
    public String b() {
        return this.f136401c;
    }

    @Nullable
    public Locale c() {
        return this.f136399a;
    }

    public GetBillingChoiceInfoParams(Builder builder) {
        this.f136399a = builder.zza;
        this.f136400b = builder.zzb;
        this.f136401c = builder.zzc;
    }
}
