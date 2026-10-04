package com.android.billingclient.api;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
@P2
public final class LaunchExternalLinkParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f136449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f136450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f136451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f136452d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final String f136453e;

    @P2
    public static final class Builder {
        private Uri zza;
        private int zzb = 0;
        private int zzc = 0;
        private int zzd = 0;

        @Nullable
        private String zze;

        private Builder() {
        }

        @NonNull
        @P2
        public LaunchExternalLinkParams build() {
            int i10 = this.zzc;
            if (i10 == 0) {
                throw new IllegalArgumentException("Link type is required.");
            }
            int i11 = this.zzb;
            if (i11 == 0) {
                throw new IllegalArgumentException("Launch mode is required.");
            }
            if (i11 != 1 && i10 == 2) {
                throw new IllegalArgumentException("App downloads must launch in an external browser or app.");
            }
            int i12 = this.zzd;
            if (i12 == 0) {
                throw new IllegalArgumentException("Billing program is required.");
            }
            if (i12 == 5) {
                if (TextUtils.isEmpty(this.zze)) {
                    throw new IllegalArgumentException("External transaction token is required for billing choice with an external link.");
                }
                if (this.zzc != 1) {
                    throw new IllegalArgumentException("Link type must be LINK_TO_DIGITAL_CONTENT_OFFER for billing choice with an external link.");
                }
            }
            Uri uri = this.zza;
            if (uri == null) {
                throw new IllegalArgumentException("URI must be set.");
            }
            if (uri.getScheme() != null) {
                return new LaunchExternalLinkParams(this, null);
            }
            throw new IllegalArgumentException("URI must have a scheme.");
        }

        @NonNull
        @P2
        public Builder setBillingProgram(int i10) {
            this.zzd = i10;
            return this;
        }

        @NonNull
        @InterfaceC3017k2
        public Builder setExternalTransactionToken(@NonNull String str) {
            this.zze = str;
            return this;
        }

        @NonNull
        @P2
        public Builder setLaunchMode(int i10) {
            this.zzb = i10;
            return this;
        }

        @NonNull
        @P2
        public Builder setLinkType(int i10) {
            this.zzc = i10;
            return this;
        }

        @NonNull
        @P2
        public Builder setLinkUri(@NonNull Uri uri) {
            this.zza = uri;
            return this;
        }

        public /* synthetic */ Builder(C3021l2 c3021l2) {
        }
    }

    @P2
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {

        /* JADX INFO: renamed from: b1, reason: collision with root package name */
        @P2
        public static final int f136454b1 = 0;

        /* JADX INFO: renamed from: c1, reason: collision with root package name */
        @P2
        public static final int f136455c1 = 1;

        /* JADX INFO: renamed from: d1, reason: collision with root package name */
        @P2
        public static final int f136456d1 = 2;
    }

    @P2
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {

        /* JADX INFO: renamed from: e1, reason: collision with root package name */
        @P2
        public static final int f136457e1 = 0;

        /* JADX INFO: renamed from: f1, reason: collision with root package name */
        @P2
        public static final int f136458f1 = 1;

        /* JADX INFO: renamed from: g1, reason: collision with root package name */
        @Q2
        public static final int f136459g1 = 2;
    }

    public /* synthetic */ LaunchExternalLinkParams(Builder builder, C3021l2 c3021l2) {
        this.f136449a = builder.zza;
        this.f136450b = builder.zzb;
        this.f136451c = builder.zzc;
        this.f136452d = builder.zzd;
        this.f136453e = builder.zze;
    }

    @NonNull
    @P2
    public static Builder f() {
        return new Builder(null);
    }

    @P2
    public int a() {
        return this.f136452d;
    }

    @Nullable
    @InterfaceC3017k2
    public String b() {
        return this.f136453e;
    }

    @P2
    public int c() {
        return this.f136450b;
    }

    @P2
    public int d() {
        return this.f136451c;
    }

    @NonNull
    @P2
    public Uri e() {
        return this.f136449a;
    }
}
