package com.android.billingclient.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.play_billing.zzca;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class QueryProductDetailsParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzca f136505a;

    public static class Builder {
        private zzca zza;

        private Builder() {
            throw null;
        }

        @NonNull
        public QueryProductDetailsParams build() {
            if (this.zza != null) {
                return new QueryProductDetailsParams(this, null);
            }
            throw new IllegalArgumentException("Product list must be set to a non empty list.");
        }

        @NonNull
        public Builder setProductList(@NonNull List<Product> list) {
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("Product list cannot be empty.");
            }
            HashSet hashSet = new HashSet();
            for (Product product : list) {
                if (!"play_pass_subs".equals(product.f136508c)) {
                    hashSet.add(product.f136508c);
                }
            }
            if (hashSet.size() > 1) {
                throw new IllegalArgumentException("All products should be of the same product type.");
            }
            this.zza = zzca.zzj(list);
            return this;
        }

        public /* synthetic */ Builder(C3068x2 c3068x2) {
        }
    }

    public static class Product {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        @I2
        public final String f136506a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f136507b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f136508c;

        public static class Builder {

            @Nullable
            @I2
            private String dynamicProductToken;
            private String zza;
            private String zzb;

            private Builder() {
                throw null;
            }

            @NonNull
            public Product build() {
                String str = this.zzb;
                if ("first_party".equals(str)) {
                    throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
                }
                if (this.zza == null) {
                    throw new IllegalArgumentException("Product id must be provided.");
                }
                if (str != null) {
                    return new Product(this, null);
                }
                throw new IllegalArgumentException("Product type must be provided.");
            }

            @NonNull
            @I2
            public Builder setDynamicProductToken(@NonNull String str) {
                this.dynamicProductToken = str;
                return this;
            }

            @NonNull
            public Builder setProductId(@NonNull String str) {
                this.zza = str;
                return this;
            }

            @NonNull
            public Builder setProductType(@NonNull String str) {
                this.zzb = str;
                return this;
            }

            public /* synthetic */ Builder(C3068x2 c3068x2) {
            }
        }

        public /* synthetic */ Product(Builder builder, C3068x2 c3068x2) {
            this.f136507b = builder.zza;
            this.f136508c = builder.zzb;
            this.f136506a = builder.dynamicProductToken;
        }

        @NonNull
        public static Builder b() {
            return new Builder(null);
        }

        @Nullable
        @I2
        public String a() {
            return this.f136506a;
        }

        @NonNull
        public final String c() {
            return this.f136507b;
        }

        @NonNull
        public final String d() {
            return this.f136508c;
        }
    }

    public /* synthetic */ QueryProductDetailsParams(Builder builder, C3068x2 c3068x2) {
        this.f136505a = builder.zza;
    }

    @NonNull
    public static Builder a() {
        return new Builder(null);
    }

    public final zzca b() {
        return this.f136505a;
    }

    @NonNull
    public final String c() {
        return ((Product) this.f136505a.get(0)).f136508c;
    }
}
