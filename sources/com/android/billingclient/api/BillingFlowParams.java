package com.android.billingclient.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.Y;
import com.google.android.gms.internal.play_billing.zzbl;
import com.google.android.gms.internal.play_billing.zzbo;
import com.google.android.gms.internal.play_billing.zzca;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class BillingFlowParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f136322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f136323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f136324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SubscriptionUpdateParams f136325d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public zzca f136326e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f136327f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f136328g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public DeveloperBillingOptionParams f136329h;

    public static class Builder {
        private String zza;
        private String zzb;
        private List zzc;
        private boolean zzd;
        private SubscriptionUpdateParams.Builder zze;

        @Nullable
        private DeveloperBillingOptionParams zzf;

        private Builder() {
            SubscriptionUpdateParams.Builder builderA = SubscriptionUpdateParams.a();
            SubscriptionUpdateParams.Builder.zza(builderA);
            this.zze = builderA;
        }

        @NonNull
        public BillingFlowParams build() {
            List list = this.zzc;
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("Details of the products must be provided.");
            }
            List list2 = this.zzc;
            if (list2 != null) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if (((ProductDetailsParams) it.next()) == null) {
                        throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
                    }
                }
            }
            BillingFlowParams billingFlowParams = new BillingFlowParams();
            billingFlowParams.f136322a = !((ProductDetailsParams) this.zzc.get(0)).f136331b.i().isEmpty();
            billingFlowParams.f136323b = this.zza;
            billingFlowParams.f136324c = this.zzb;
            billingFlowParams.f136325d = this.zze.build();
            billingFlowParams.f136327f = new ArrayList();
            billingFlowParams.f136328g = this.zzd;
            List list3 = this.zzc;
            billingFlowParams.f136326e = list3 != null ? zzca.zzj(list3) : zzca.zzk();
            billingFlowParams.f136329h = this.zzf;
            return billingFlowParams;
        }

        @NonNull
        @M2
        public Builder enableDeveloperBillingOption(@NonNull DeveloperBillingOptionParams developerBillingOptionParams) {
            this.zzf = developerBillingOptionParams;
            return this;
        }

        @NonNull
        public Builder setIsOfferPersonalized(boolean z10) {
            this.zzd = z10;
            return this;
        }

        @NonNull
        public Builder setObfuscatedAccountId(@NonNull String str) {
            this.zza = str;
            return this;
        }

        @NonNull
        public Builder setObfuscatedProfileId(@NonNull String str) {
            this.zzb = str;
            return this;
        }

        @NonNull
        public Builder setProductDetailsParamsList(@NonNull List<ProductDetailsParams> list) {
            this.zzc = new ArrayList(list);
            return this;
        }

        @NonNull
        public Builder setSubscriptionUpdateParams(@NonNull SubscriptionUpdateParams subscriptionUpdateParams) {
            this.zze = SubscriptionUpdateParams.c(subscriptionUpdateParams);
            return this;
        }

        public /* synthetic */ Builder(M1 m12) {
            SubscriptionUpdateParams.Builder builderA = SubscriptionUpdateParams.a();
            SubscriptionUpdateParams.Builder.zza(builderA);
            this.zze = builderA;
        }
    }

    public static final class ProductDetailsParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        @Z2
        public final SubscriptionProductReplacementParams f136330a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Y f136331b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final String f136332c;

        public static class Builder {

            @Nullable
            @Z2
            private SubscriptionProductReplacementParams mSubscriptionProductReplacementParams;
            private Y zza;

            @Nullable
            private String zzb;

            private Builder() {
                throw null;
            }

            @NonNull
            public ProductDetailsParams build() {
                zzbl.zzc(this.zza, "ProductDetails is required for constructing ProductDetailsParams.");
                return new ProductDetailsParams(this, null);
            }

            @NonNull
            public Builder setOfferToken(@NonNull String str) {
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("offerToken can not be empty");
                }
                this.zzb = str;
                return this;
            }

            @NonNull
            public Builder setProductDetails(@NonNull Y y10) {
                this.zza = y10;
                if (y10.c() != null) {
                    y10.c().getClass();
                    String str = y10.c().f136600d;
                    if (str != null) {
                        this.zzb = str;
                    }
                }
                return this;
            }

            @NonNull
            @Z2
            public Builder setSubscriptionProductReplacementParams(@NonNull SubscriptionProductReplacementParams subscriptionProductReplacementParams) {
                this.mSubscriptionProductReplacementParams = subscriptionProductReplacementParams;
                return this;
            }

            public /* synthetic */ Builder(M1 m12) {
            }
        }

        @Z2
        public static class SubscriptionProductReplacementParams {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public String f136333a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @Z2
            public int f136334b;

            @Z2
            public static class Builder {
                private String oldProductId;
                private int replacementMode;

                private Builder() {
                    this.replacementMode = 0;
                }

                @NonNull
                @Z2
                public SubscriptionProductReplacementParams build() {
                    SubscriptionProductReplacementParams subscriptionProductReplacementParams = new SubscriptionProductReplacementParams();
                    subscriptionProductReplacementParams.f136333a = this.oldProductId;
                    subscriptionProductReplacementParams.f136334b = this.replacementMode;
                    return subscriptionProductReplacementParams;
                }

                @NonNull
                @Z2
                public Builder setOldProductId(@NonNull String str) {
                    this.oldProductId = str;
                    return this;
                }

                @NonNull
                @Z2
                public Builder setReplacementMode(int i10) {
                    this.replacementMode = i10;
                    return this;
                }
            }

            @Retention(RetentionPolicy.SOURCE)
            public @interface a {

                /* JADX INFO: renamed from: A0, reason: collision with root package name */
                public static final int f136335A0 = 2;

                /* JADX INFO: renamed from: B0, reason: collision with root package name */
                public static final int f136336B0 = 3;

                /* JADX INFO: renamed from: C0, reason: collision with root package name */
                public static final int f136337C0 = 4;

                /* JADX INFO: renamed from: D0, reason: collision with root package name */
                public static final int f136338D0 = 5;

                /* JADX INFO: renamed from: E0, reason: collision with root package name */
                public static final int f136339E0 = 6;

                /* JADX INFO: renamed from: y0, reason: collision with root package name */
                public static final int f136340y0 = 0;

                /* JADX INFO: renamed from: z0, reason: collision with root package name */
                public static final int f136341z0 = 1;
            }

            @NonNull
            public static Builder f() {
                return new Builder();
            }

            @NonNull
            @Z2
            public String d() {
                return this.f136333a;
            }

            @Z2
            public int e() {
                return this.f136334b;
            }
        }

        public /* synthetic */ ProductDetailsParams(Builder builder, M1 m12) {
            this.f136331b = builder.zza;
            this.f136332c = builder.zzb;
            this.f136330a = builder.mSubscriptionProductReplacementParams;
        }

        @NonNull
        public static Builder b() {
            return new Builder(null);
        }

        @Nullable
        @Z2
        public SubscriptionProductReplacementParams a() {
            return this.f136330a;
        }

        @NonNull
        public final Y c() {
            return this.f136331b;
        }

        @Nullable
        public final String d() {
            return this.f136332c;
        }
    }

    public static class SubscriptionUpdateParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f136342a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f136343b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f136344c = 0;

        public static class Builder {
            private String zza;
            private String zzb;
            private boolean zzc;
            private int zzd = 0;

            private Builder() {
            }

            public static /* synthetic */ Builder zza(Builder builder) {
                builder.zzc = true;
                return builder;
            }

            @NonNull
            public SubscriptionUpdateParams build() {
                boolean z10 = true;
                M1 m12 = null;
                if (TextUtils.isEmpty(this.zza) && TextUtils.isEmpty(null)) {
                    z10 = false;
                }
                boolean zIsEmpty = TextUtils.isEmpty(this.zzb);
                if (z10 && !zIsEmpty) {
                    throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                }
                if (!this.zzc && !z10 && zIsEmpty) {
                    throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                }
                SubscriptionUpdateParams subscriptionUpdateParams = new SubscriptionUpdateParams(m12);
                subscriptionUpdateParams.f136342a = this.zza;
                subscriptionUpdateParams.f136344c = this.zzd;
                subscriptionUpdateParams.f136343b = this.zzb;
                return subscriptionUpdateParams;
            }

            @NonNull
            public Builder setOldPurchaseToken(@NonNull String str) {
                this.zza = str;
                return this;
            }

            @NonNull
            @N0
            public Builder setOriginalExternalTransactionId(@NonNull String str) {
                this.zzb = str;
                return this;
            }

            @NonNull
            @Deprecated
            public Builder setSubscriptionReplacementMode(int i10) {
                this.zzd = i10;
                return this;
            }

            public /* synthetic */ Builder(M1 m12) {
            }
        }

        @Retention(RetentionPolicy.SOURCE)
        public @interface a {

            /* JADX INFO: renamed from: F0, reason: collision with root package name */
            public static final int f136345F0 = 0;

            /* JADX INFO: renamed from: G0, reason: collision with root package name */
            public static final int f136346G0 = 1;

            /* JADX INFO: renamed from: H0, reason: collision with root package name */
            public static final int f136347H0 = 2;

            /* JADX INFO: renamed from: I0, reason: collision with root package name */
            public static final int f136348I0 = 3;

            /* JADX INFO: renamed from: J0, reason: collision with root package name */
            public static final int f136349J0 = 5;

            /* JADX INFO: renamed from: K0, reason: collision with root package name */
            public static final int f136350K0 = 6;
        }

        public SubscriptionUpdateParams() {
        }

        @NonNull
        public static Builder a() {
            return new Builder(null);
        }

        public static /* bridge */ /* synthetic */ Builder c(SubscriptionUpdateParams subscriptionUpdateParams) {
            Builder builderA = a();
            builderA.setOldPurchaseToken(subscriptionUpdateParams.f136342a);
            builderA.setSubscriptionReplacementMode(subscriptionUpdateParams.f136344c);
            builderA.setOriginalExternalTransactionId(subscriptionUpdateParams.f136343b);
            return builderA;
        }

        public final int b() {
            return this.f136344c;
        }

        public final String d() {
            return this.f136342a;
        }

        public final String e() {
            return this.f136343b;
        }

        public /* synthetic */ SubscriptionUpdateParams(M1 m12) {
        }
    }

    public BillingFlowParams() {
        throw null;
    }

    @NonNull
    public static Builder b() {
        return new Builder(null);
    }

    @Nullable
    @M2
    public DeveloperBillingOptionParams a() {
        return this.f136329h;
    }

    public int c() {
        return 0;
    }

    public final int d() {
        return this.f136325d.f136344c;
    }

    public long e() {
        return 0L;
    }

    public final BillingResult f() {
        Y.b bVar;
        ProductDetailsParams.SubscriptionProductReplacementParams subscriptionProductReplacementParams;
        char c10;
        BillingResult billingResultA;
        BillingResult billingResultA2;
        if (this.f136326e.isEmpty()) {
            return S1.f136538i;
        }
        char c11 = 0;
        ProductDetailsParams productDetailsParams = (ProductDetailsParams) this.f136326e.get(0);
        for (int i10 = 1; i10 < this.f136326e.size(); i10++) {
            ProductDetailsParams productDetailsParams2 = (ProductDetailsParams) this.f136326e.get(i10);
            if (!productDetailsParams2.f136331b.f136587d.equals(productDetailsParams.f136331b.f136587d) && !productDetailsParams2.f136331b.f136587d.equals("play_pass_subs")) {
                return S1.a(5, "All products should have same ProductType.");
            }
        }
        String strI = productDetailsParams.f136331b.i();
        HashMap map = new HashMap();
        HashSet<String> hashSet = new HashSet();
        zzca zzcaVar = this.f136326e;
        int size = zzcaVar.size();
        int i11 = 0;
        boolean z10 = false;
        while (i11 < size) {
            ProductDetailsParams productDetailsParams3 = (ProductDetailsParams) zzcaVar.get(i11);
            ProductDetailsParams.SubscriptionProductReplacementParams subscriptionProductReplacementParams2 = productDetailsParams3.f136330a;
            if (subscriptionProductReplacementParams2 != null) {
                c10 = c11;
                if (!productDetailsParams3.f136331b.f136587d.equals(BillingClient.f.f136321x0)) {
                    Object[] objArr = new Object[1];
                    objArr[c10] = productDetailsParams3.f136331b.f136586c;
                    billingResultA2 = S1.a(5, String.format("Non-subscription product cannot have SubscriptionProductReplacementParams. Invalid product id: %s", objArr));
                } else if (subscriptionProductReplacementParams2.e() <= 0) {
                    Object[] objArr2 = new Object[1];
                    objArr2[c10] = productDetailsParams3.f136331b.f136586c;
                    billingResultA2 = S1.a(5, String.format("replacementMode is required for constructing SubscriptionProductReplacementParams. Not correctly set for product id: %s", objArr2));
                } else if (zzbo.zzd(subscriptionProductReplacementParams2.f136333a)) {
                    Object[] objArr3 = new Object[1];
                    objArr3[c10] = productDetailsParams3.f136331b.f136586c;
                    billingResultA2 = S1.a(5, String.format("oldProductId is required for constructing SubscriptionProductReplacementParams. Not correctly set for product id: %s", objArr3));
                } else {
                    billingResultA2 = S1.f136538i;
                }
                if (billingResultA2 != S1.f136538i) {
                    return billingResultA2;
                }
            } else {
                c10 = c11;
            }
            if (subscriptionProductReplacementParams2 != null && subscriptionProductReplacementParams2.e() == 6) {
                if (productDetailsParams3.f136332c != null) {
                    Object[] objArr4 = new Object[1];
                    objArr4[c10] = productDetailsParams3.f136331b.f136586c;
                    billingResultA = S1.a(5, String.format("When using KEEP_EXISTING mode, offerToken in ProductDetailsParams should not be set. Offer token is set for product id: %s", objArr4));
                } else if (subscriptionProductReplacementParams2.d().equals(productDetailsParams3.f136331b.f136586c)) {
                    billingResultA = S1.f136538i;
                } else {
                    Object[] objArr5 = new Object[1];
                    objArr5[c10] = productDetailsParams3.f136331b.f136586c;
                    billingResultA = S1.a(5, String.format("When using KEEP_EXISTING mode, oldProductId in SubscriptionProductReplacementParams should be the same as the product id in ProductDetails. Value is invalid for product id: %s", objArr5));
                }
                if (billingResultA != S1.f136538i) {
                    return billingResultA;
                }
            }
            if (productDetailsParams3.f136331b.f136593j != null && productDetailsParams3.f136332c == null && (subscriptionProductReplacementParams2 == null || subscriptionProductReplacementParams2.e() != 6)) {
                Object[] objArr6 = new Object[1];
                objArr6[c10] = productDetailsParams3.f136331b.f136586c;
                return S1.a(5, String.format("offerToken is required for constructing ProductDetailsParams for subscriptions. Missing value for product id: %s", objArr6));
            }
            if (map.containsKey(productDetailsParams3.f136331b.f136586c)) {
                Object[] objArr7 = new Object[1];
                objArr7[c10] = productDetailsParams3.f136331b.f136586c;
                return S1.a(5, String.format("ProductId can not be duplicated. Invalid product id: %s.", objArr7));
            }
            map.put(productDetailsParams3.f136331b.f136586c, productDetailsParams3);
            if (subscriptionProductReplacementParams2 != null) {
                if (hashSet.contains(subscriptionProductReplacementParams2.d())) {
                    Object[] objArr8 = new Object[1];
                    objArr8[c10] = subscriptionProductReplacementParams2.d();
                    return S1.a(5, String.format("OldProductId can not be duplicated. Invalid old product id: %s.", objArr8));
                }
                hashSet.add(subscriptionProductReplacementParams2.d());
                z10 = true;
            }
            if (!productDetailsParams.f136331b.f136587d.equals("play_pass_subs") && !productDetailsParams3.f136331b.f136587d.equals("play_pass_subs") && !strI.equals(productDetailsParams3.f136331b.i())) {
                return S1.a(5, "All products must have the same package name.");
            }
            i11++;
            c11 = c10;
        }
        char c12 = c11;
        for (String str : hashSet) {
            if (map.containsKey(str) && ((subscriptionProductReplacementParams = ((ProductDetailsParams) map.get(str)).f136330a) == null || !subscriptionProductReplacementParams.d().equals(str))) {
                Object[] objArr9 = new Object[1];
                objArr9[c12] = str;
                return S1.a(5, String.format("OldProductId must not be one of the products to be purchased. Invalid old product id: %s.", objArr9));
            }
        }
        if (z10 && this.f136325d.f136344c != 0) {
            return S1.a(5, "SubscriptionUpdateParams.setSubscriptionReplaceMode and  ProductDetailsParams.setSubscriptionProductReplacementParams cannot be called at the same time.");
        }
        List list = productDetailsParams.f136331b.f136594k;
        String str2 = productDetailsParams.f136332c;
        if (str2 != null && list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    bVar = null;
                    break;
                }
                bVar = (Y.b) it.next();
                if (str2.equals(bVar.f136600d)) {
                    break;
                }
            }
            if (bVar != null && bVar.f136611o != null) {
                return S1.a(5, "Both autoPayDetails and autoPayBalanceThreshold is required for constructing ProductDetailsParams for autopay.");
            }
        }
        return S1.f136538i;
    }

    @Nullable
    public final String g() {
        return this.f136323b;
    }

    @Nullable
    public final String h() {
        return this.f136324c;
    }

    @Nullable
    @Deprecated
    public String i() {
        return null;
    }

    @Nullable
    @Deprecated
    public final String j() {
        return this.f136325d.f136342a;
    }

    @Nullable
    public final String k() {
        return this.f136325d.f136343b;
    }

    @NonNull
    public final ArrayList l() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f136327f);
        return arrayList;
    }

    @NonNull
    public final List m() {
        return this.f136326e;
    }

    public final boolean v() {
        return this.f136328g;
    }

    public final boolean w() {
        if (this.f136323b == null && this.f136324c == null) {
            SubscriptionUpdateParams subscriptionUpdateParams = this.f136325d;
            if (subscriptionUpdateParams.f136343b == null && subscriptionUpdateParams.f136344c == 0 && !this.f136322a && !this.f136328g) {
                zzca zzcaVar = this.f136326e;
                if (zzcaVar != null) {
                    int size = zzcaVar.size();
                    int i10 = 0;
                    while (i10 < size) {
                        ProductDetailsParams.SubscriptionProductReplacementParams subscriptionProductReplacementParams = ((ProductDetailsParams) zzcaVar.get(i10)).f136330a;
                        i10++;
                        if (subscriptionProductReplacementParams != null) {
                            return true;
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    public /* synthetic */ BillingFlowParams(M1 m12) {
    }
}
