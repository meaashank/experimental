package androidx.webkit;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class UserAgentMetadata {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f120020j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<BrandVersion> f120021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f120022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f120023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f120024d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f120025e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f120026f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f120027g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f120028h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f120029i;

    public static final class BrandVersion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f120030a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f120031b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f120032c;

        public static final class Builder {
            private String mBrand;
            private String mFullVersion;
            private String mMajorVersion;

            public Builder() {
            }

            @NonNull
            public BrandVersion build() {
                String str;
                String str2;
                String str3 = this.mBrand;
                if (str3 == null || str3.trim().isEmpty() || (str = this.mMajorVersion) == null || str.trim().isEmpty() || (str2 = this.mFullVersion) == null || str2.trim().isEmpty()) {
                    throw new IllegalStateException("Brand name, major version and full version should not be null or blank.");
                }
                return new BrandVersion(this.mBrand, this.mMajorVersion, this.mFullVersion);
            }

            @NonNull
            public Builder setBrand(@NonNull String str) {
                if (str.trim().isEmpty()) {
                    throw new IllegalArgumentException("Brand should not be blank.");
                }
                this.mBrand = str;
                return this;
            }

            @NonNull
            public Builder setFullVersion(@NonNull String str) {
                if (str.trim().isEmpty()) {
                    throw new IllegalArgumentException("FullVersion should not be blank.");
                }
                this.mFullVersion = str;
                return this;
            }

            @NonNull
            public Builder setMajorVersion(@NonNull String str) {
                if (str.trim().isEmpty()) {
                    throw new IllegalArgumentException("MajorVersion should not be blank.");
                }
                this.mMajorVersion = str;
                return this;
            }

            public Builder(@NonNull BrandVersion brandVersion) {
                this.mBrand = brandVersion.f120030a;
                this.mMajorVersion = brandVersion.f120031b;
                this.mFullVersion = brandVersion.f120032c;
            }
        }

        @NonNull
        public String a() {
            return this.f120030a;
        }

        @NonNull
        public String b() {
            return this.f120032c;
        }

        @NonNull
        public String c() {
            return this.f120031b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BrandVersion)) {
                return false;
            }
            BrandVersion brandVersion = (BrandVersion) obj;
            return Objects.equals(this.f120030a, brandVersion.f120030a) && Objects.equals(this.f120031b, brandVersion.f120031b) && Objects.equals(this.f120032c, brandVersion.f120032c);
        }

        public int hashCode() {
            return Objects.hash(this.f120030a, this.f120031b, this.f120032c);
        }

        @NonNull
        public String toString() {
            return this.f120030a + "," + this.f120031b + "," + this.f120032c;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public BrandVersion(@NonNull String str, @NonNull String str2, @NonNull String str3) {
            this.f120030a = str;
            this.f120031b = str2;
            this.f120032c = str3;
        }
    }

    @Nullable
    public String a() {
        return this.f120025e;
    }

    public int b() {
        return this.f120028h;
    }

    @NonNull
    public List<BrandVersion> c() {
        return this.f120021a;
    }

    @Nullable
    public String d() {
        return this.f120022b;
    }

    @Nullable
    public String e() {
        return this.f120026f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserAgentMetadata)) {
            return false;
        }
        UserAgentMetadata userAgentMetadata = (UserAgentMetadata) obj;
        return this.f120027g == userAgentMetadata.f120027g && this.f120028h == userAgentMetadata.f120028h && this.f120029i == userAgentMetadata.f120029i && Objects.equals(this.f120021a, userAgentMetadata.f120021a) && Objects.equals(this.f120022b, userAgentMetadata.f120022b) && Objects.equals(this.f120023c, userAgentMetadata.f120023c) && Objects.equals(this.f120024d, userAgentMetadata.f120024d) && Objects.equals(this.f120025e, userAgentMetadata.f120025e) && Objects.equals(this.f120026f, userAgentMetadata.f120026f);
    }

    @Nullable
    public String f() {
        return this.f120023c;
    }

    @Nullable
    public String g() {
        return this.f120024d;
    }

    public boolean h() {
        return this.f120027g;
    }

    public int hashCode() {
        return Objects.hash(this.f120021a, this.f120022b, this.f120023c, this.f120024d, this.f120025e, this.f120026f, Boolean.valueOf(this.f120027g), Integer.valueOf(this.f120028h), Boolean.valueOf(this.f120029i));
    }

    public boolean i() {
        return this.f120029i;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public UserAgentMetadata(@NonNull List<BrandVersion> list, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, boolean z10, int i10, boolean z11) {
        this.f120021a = list;
        this.f120022b = str;
        this.f120023c = str2;
        this.f120024d = str3;
        this.f120025e = str4;
        this.f120026f = str5;
        this.f120027g = z10;
        this.f120028h = i10;
        this.f120029i = z11;
    }

    public static final class Builder {
        private String mArchitecture;
        private int mBitness;
        private List<BrandVersion> mBrandVersionList;
        private String mFullVersion;
        private boolean mMobile;
        private String mModel;
        private String mPlatform;
        private String mPlatformVersion;
        private boolean mWow64;

        public Builder() {
            this.mBrandVersionList = new ArrayList();
            this.mMobile = true;
            this.mBitness = 0;
            this.mWow64 = false;
        }

        @NonNull
        public UserAgentMetadata build() {
            return new UserAgentMetadata(this.mBrandVersionList, this.mFullVersion, this.mPlatform, this.mPlatformVersion, this.mArchitecture, this.mModel, this.mMobile, this.mBitness, this.mWow64);
        }

        @NonNull
        public Builder setArchitecture(@Nullable String str) {
            this.mArchitecture = str;
            return this;
        }

        @NonNull
        public Builder setBitness(int i10) {
            this.mBitness = i10;
            return this;
        }

        @NonNull
        public Builder setBrandVersionList(@NonNull List<BrandVersion> list) {
            this.mBrandVersionList = list;
            return this;
        }

        @NonNull
        public Builder setFullVersion(@Nullable String str) {
            if (str == null) {
                this.mFullVersion = null;
                return this;
            }
            if (str.trim().isEmpty()) {
                throw new IllegalArgumentException("Full version should not be blank.");
            }
            this.mFullVersion = str;
            return this;
        }

        @NonNull
        public Builder setMobile(boolean z10) {
            this.mMobile = z10;
            return this;
        }

        @NonNull
        public Builder setModel(@Nullable String str) {
            this.mModel = str;
            return this;
        }

        @NonNull
        public Builder setPlatform(@Nullable String str) {
            if (str == null) {
                this.mPlatform = null;
                return this;
            }
            if (str.trim().isEmpty()) {
                throw new IllegalArgumentException("Platform should not be blank.");
            }
            this.mPlatform = str;
            return this;
        }

        @NonNull
        public Builder setPlatformVersion(@Nullable String str) {
            this.mPlatformVersion = str;
            return this;
        }

        @NonNull
        public Builder setWow64(boolean z10) {
            this.mWow64 = z10;
            return this;
        }

        public Builder(@NonNull UserAgentMetadata userAgentMetadata) {
            this.mBrandVersionList = new ArrayList();
            this.mMobile = true;
            this.mBitness = 0;
            this.mWow64 = false;
            this.mBrandVersionList = userAgentMetadata.f120021a;
            this.mFullVersion = userAgentMetadata.f120022b;
            this.mPlatform = userAgentMetadata.f120023c;
            this.mPlatformVersion = userAgentMetadata.f120024d;
            this.mArchitecture = userAgentMetadata.f120025e;
            this.mModel = userAgentMetadata.f120026f;
            this.mMobile = userAgentMetadata.f120027g;
            this.mBitness = userAgentMetadata.f120028h;
            this.mWow64 = userAgentMetadata.f120029i;
        }
    }
}
