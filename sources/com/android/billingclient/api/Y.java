package com.android.billingclient.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.C2564b;
import com.android.billingclient.api.BillingClient;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f136584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f136585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f136586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f136587d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f136588e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f136589f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f136590g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f136591h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final String f136592i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final List f136593j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final List f136594k;

    @O2
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f136595a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f136596b;

        public a(JSONObject jSONObject) throws JSONException {
            this.f136595a = jSONObject.getInt("commitmentPaymentsCount");
            this.f136596b = jSONObject.optInt("subsequentCommitmentPaymentsCount");
        }

        @O2
        public int a() {
            return this.f136595a;
        }

        @O2
        public int b() {
            return this.f136596b;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f136597a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f136598b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f136599c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final String f136600d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public final String f136601e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public final String f136602f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final List f136603g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Nullable
        public final Long f136604h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Nullable
        public final a f136605i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @Nullable
        public final e f136606j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @Nullable
        public final C0356b f136607k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @Nullable
        public final String f136608l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @Nullable
        public final c f136609m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @Nullable
        public final d f136610n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        @Nullable
        public final C3029n2 f136611o;

        @S2
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @Nullable
            public final Integer f136612a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @Nullable
            public final C0355a f136613b;

            /* JADX INFO: renamed from: com.android.billingclient.api.Y$b$a$a, reason: collision with other inner class name */
            @S2
            public static final class C0355a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f136614a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final long f136615b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final String f136616c;

                public C0355a(JSONObject jSONObject) {
                    this.f136614a = jSONObject.optString("formattedDiscountAmount");
                    this.f136615b = jSONObject.optLong("discountAmountMicros");
                    this.f136616c = jSONObject.optString("discountAmountCurrencyCode");
                }

                @NonNull
                public String a() {
                    return this.f136616c;
                }

                public long b() {
                    return this.f136615b;
                }

                @NonNull
                public String c() {
                    return this.f136614a;
                }
            }

            public a(JSONObject jSONObject) throws JSONException {
                this.f136612a = jSONObject.has("percentageDiscount") ? Integer.valueOf(jSONObject.optInt("percentageDiscount")) : null;
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("discountAmount");
                this.f136613b = jSONObjectOptJSONObject != null ? new C0355a(jSONObjectOptJSONObject) : null;
            }

            @Nullable
            @S2
            public C0355a a() {
                return this.f136613b;
            }

            @Nullable
            @S2
            public Integer b() {
                return this.f136612a;
            }
        }

        /* JADX INFO: renamed from: com.android.billingclient.api.Y$b$b, reason: collision with other inner class name */
        @S2
        public static final class C0356b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f136617a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f136618b;

            public C0356b(JSONObject jSONObject) throws JSONException {
                this.f136617a = jSONObject.getInt("maximumQuantity");
                this.f136618b = jSONObject.getInt("remainingQuantity");
            }

            @S2
            public int a() {
                return this.f136617a;
            }

            @S2
            public int b() {
                return this.f136618b;
            }
        }

        @T2
        public static final class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final long f136619a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final long f136620b;

            public c(JSONObject jSONObject) throws JSONException {
                this.f136619a = jSONObject.getLong("preorderReleaseTimeMillis");
                this.f136620b = jSONObject.getLong("preorderPresaleEndTimeMillis");
            }

            @T2
            public long a() {
                return this.f136620b;
            }

            @T2
            public long b() {
                return this.f136619a;
            }
        }

        @U2
        public static final class d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f136621a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @Nullable
            public final String f136622b;

            public d(JSONObject jSONObject) throws JSONException {
                this.f136621a = jSONObject.getString("rentalPeriod");
                String strOptString = jSONObject.optString("rentalExpirationPeriod");
                this.f136622b = true == strOptString.isEmpty() ? null : strOptString;
            }

            @Nullable
            @U2
            public String a() {
                return this.f136622b;
            }

            @NonNull
            @U2
            public String b() {
                return this.f136621a;
            }
        }

        @S2
        public static final class e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @Nullable
            public final Long f136623a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @Nullable
            public final Long f136624b;

            public e(JSONObject jSONObject) throws JSONException {
                this.f136623a = jSONObject.has("startTimeMillis") ? Long.valueOf(jSONObject.optLong("startTimeMillis")) : null;
                this.f136624b = jSONObject.has("endTimeMillis") ? Long.valueOf(jSONObject.optLong("endTimeMillis")) : null;
            }

            @Nullable
            @S2
            public Long a() {
                return this.f136624b;
            }

            @Nullable
            @S2
            public Long b() {
                return this.f136623a;
            }
        }

        public b(JSONObject jSONObject) throws JSONException {
            this.f136597a = jSONObject.optString("formattedPrice");
            this.f136598b = jSONObject.optLong("priceAmountMicros");
            this.f136599c = jSONObject.optString("priceCurrencyCode");
            String strOptString = jSONObject.optString("offerIdToken");
            C3029n2 c3029n2 = null;
            this.f136600d = true == strOptString.isEmpty() ? null : strOptString;
            String strOptString2 = jSONObject.optString("offerId");
            this.f136601e = true == strOptString2.isEmpty() ? null : strOptString2;
            String strOptString3 = jSONObject.optString("purchaseOptionId");
            this.f136602f = true == strOptString3.isEmpty() ? null : strOptString3;
            jSONObject.optInt("offerType");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
            this.f136603g = new ArrayList();
            if (jSONArrayOptJSONArray != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    this.f136603g.add(jSONArrayOptJSONArray.getString(i10));
                }
            }
            this.f136604h = jSONObject.has("fullPriceMicros") ? Long.valueOf(jSONObject.optLong("fullPriceMicros")) : null;
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("discountDisplayInfo");
            this.f136605i = jSONObjectOptJSONObject == null ? null : new a(jSONObjectOptJSONObject);
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("validTimeWindow");
            this.f136606j = jSONObjectOptJSONObject2 == null ? null : new e(jSONObjectOptJSONObject2);
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("limitedQuantityInfo");
            this.f136607k = jSONObjectOptJSONObject3 == null ? null : new C0356b(jSONObjectOptJSONObject3);
            this.f136608l = jSONObject.optString("serializedDocid");
            JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("preorderDetails");
            this.f136609m = jSONObjectOptJSONObject4 == null ? null : new c(jSONObjectOptJSONObject4);
            JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("rentalDetails");
            this.f136610n = jSONObjectOptJSONObject5 == null ? null : new d(jSONObjectOptJSONObject5);
            JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject("autoPayDetails");
            if (jSONObjectOptJSONObject6 != null) {
                c3029n2 = new C3029n2();
                jSONObjectOptJSONObject6.getString("type");
            }
            this.f136611o = c3029n2;
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("pricingPhases");
            if (jSONArrayOptJSONArray2 == null) {
                return;
            }
            new d(jSONArrayOptJSONArray2);
        }

        @Nullable
        @S2
        public a a() {
            return this.f136605i;
        }

        @NonNull
        public String b() {
            return this.f136597a;
        }

        @Nullable
        @S2
        public Long c() {
            return this.f136604h;
        }

        @Nullable
        @S2
        public C0356b d() {
            return this.f136607k;
        }

        @Nullable
        @S2
        @U2
        public String e() {
            return this.f136601e;
        }

        @Nullable
        @S2
        public List<String> f() {
            return this.f136603g;
        }

        @Nullable
        @S2
        @U2
        public String g() {
            return this.f136600d;
        }

        @Nullable
        @T2
        public c h() {
            return this.f136609m;
        }

        public long i() {
            return this.f136598b;
        }

        @NonNull
        public String j() {
            return this.f136599c;
        }

        @Nullable
        @U2
        public String k() {
            return this.f136602f;
        }

        @Nullable
        @U2
        public d l() {
            return this.f136610n;
        }

        @Nullable
        @S2
        public e m() {
            return this.f136606j;
        }

        @Nullable
        public final C3029n2 n() {
            return this.f136611o;
        }

        @Nullable
        public final String o() {
            return this.f136608l;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f136625a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f136626b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f136627c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f136628d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f136629e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f136630f;

        public c(JSONObject jSONObject) {
            this.f136628d = jSONObject.optString("billingPeriod");
            this.f136627c = jSONObject.optString("priceCurrencyCode");
            this.f136625a = jSONObject.optString("formattedPrice");
            this.f136626b = jSONObject.optLong("priceAmountMicros");
            this.f136630f = jSONObject.optInt("recurrenceMode");
            this.f136629e = jSONObject.optInt("billingCycleCount");
        }

        public int a() {
            return this.f136629e;
        }

        @NonNull
        public String b() {
            return this.f136628d;
        }

        @NonNull
        public String c() {
            return this.f136625a;
        }

        public long d() {
            return this.f136626b;
        }

        @NonNull
        public String e() {
            return this.f136627c;
        }

        public int f() {
            return this.f136630f;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f136631a;

        public d(JSONArray jSONArray) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                    if (jSONObjectOptJSONObject != null) {
                        arrayList.add(new c(jSONObjectOptJSONObject));
                    }
                }
            }
            this.f136631a = arrayList;
        }

        @NonNull
        public List<c> a() {
            return this.f136631a;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface e {

        /* JADX INFO: renamed from: h1, reason: collision with root package name */
        public static final int f136632h1 = 1;

        /* JADX INFO: renamed from: i1, reason: collision with root package name */
        public static final int f136633i1 = 2;

        /* JADX INFO: renamed from: j1, reason: collision with root package name */
        public static final int f136634j1 = 3;
    }

    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f136635a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final String f136636b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f136637c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final d f136638d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final List f136639e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public final a f136640f;

        public f(JSONObject jSONObject) throws JSONException {
            this.f136635a = jSONObject.optString("basePlanId");
            String strOptString = jSONObject.optString("offerId");
            this.f136636b = true == strOptString.isEmpty() ? null : strOptString;
            this.f136637c = jSONObject.getString("offerIdToken");
            this.f136638d = new d(jSONObject.getJSONArray("pricingPhases"));
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("installmentPlanDetails");
            this.f136640f = jSONObjectOptJSONObject != null ? new a(jSONObjectOptJSONObject) : null;
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("transitionPlanDetails");
            if (jSONObjectOptJSONObject2 != null) {
                jSONObjectOptJSONObject2.getString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
                jSONObjectOptJSONObject2.optString("title");
                jSONObjectOptJSONObject2.optString("name");
                jSONObjectOptJSONObject2.optString("description");
                jSONObjectOptJSONObject2.optString("basePlanId");
                JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("pricingPhase");
                if (jSONObjectOptJSONObject3 != null) {
                    new c(jSONObjectOptJSONObject3);
                }
            }
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
            if (jSONArrayOptJSONArray != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    arrayList.add(jSONArrayOptJSONArray.getString(i10));
                }
            }
            this.f136639e = arrayList;
        }

        @NonNull
        public String a() {
            return this.f136635a;
        }

        @Nullable
        @O2
        public a b() {
            return this.f136640f;
        }

        @Nullable
        public String c() {
            return this.f136636b;
        }

        @NonNull
        public List<String> d() {
            return this.f136639e;
        }

        @NonNull
        public String e() {
            return this.f136637c;
        }

        @NonNull
        public d f() {
            return this.f136638d;
        }
    }

    public Y(String str) throws JSONException {
        this.f136584a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f136585b = jSONObject;
        String strOptString = jSONObject.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
        this.f136586c = strOptString;
        String strOptString2 = jSONObject.optString("type");
        this.f136587d = strOptString2;
        if (TextUtils.isEmpty(strOptString)) {
            throw new IllegalArgumentException("Product id cannot be empty.");
        }
        if (TextUtils.isEmpty(strOptString2)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.f136588e = jSONObject.optString("title");
        this.f136589f = jSONObject.optString("name");
        this.f136590g = jSONObject.optString("description");
        jSONObject.optString("packageDisplayName");
        jSONObject.optString("iconUrl");
        this.f136591h = jSONObject.optString("skuDetailsToken");
        this.f136592i = jSONObject.optString("serializedDocid");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                arrayList.add(new f(jSONArrayOptJSONArray.getJSONObject(i10)));
            }
            this.f136593j = arrayList;
        } else {
            this.f136593j = (strOptString2.equals(BillingClient.f.f136321x0) || strOptString2.equals("play_pass_subs")) ? new ArrayList() : null;
        }
        JSONObject jSONObjectOptJSONObject = this.f136585b.optJSONObject("oneTimePurchaseOfferDetails");
        JSONArray jSONArrayOptJSONArray2 = this.f136585b.optJSONArray("oneTimePurchaseOfferDetailsList");
        ArrayList arrayList2 = new ArrayList();
        if (jSONArrayOptJSONArray2 != null) {
            for (int i11 = 0; i11 < jSONArrayOptJSONArray2.length(); i11++) {
                arrayList2.add(new b(jSONArrayOptJSONArray2.getJSONObject(i11)));
            }
            this.f136594k = arrayList2;
            return;
        }
        if (jSONObjectOptJSONObject == null) {
            this.f136594k = null;
        } else {
            arrayList2.add(new b(jSONObjectOptJSONObject));
            this.f136594k = arrayList2;
        }
    }

    @NonNull
    public String a() {
        return this.f136590g;
    }

    @NonNull
    public String b() {
        return this.f136589f;
    }

    @Nullable
    public b c() {
        List list = this.f136594k;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (b) list.get(0);
    }

    @Nullable
    @S2
    @U2
    public List<b> d() {
        return this.f136594k;
    }

    @NonNull
    public String e() {
        return this.f136586c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Y) {
            return TextUtils.equals(this.f136584a, ((Y) obj).f136584a);
        }
        return false;
    }

    @NonNull
    public String f() {
        return this.f136587d;
    }

    @Nullable
    public List<f> g() {
        return this.f136593j;
    }

    @NonNull
    public String h() {
        return this.f136588e;
    }

    public int hashCode() {
        return this.f136584a.hashCode();
    }

    @NonNull
    public final String i() {
        return this.f136585b.optString("packageName");
    }

    public final String j() {
        return this.f136591h;
    }

    @Nullable
    public final String k(@Nullable String str) {
        List<b> list;
        if (!TextUtils.isEmpty(str) && (list = this.f136594k) != null && !list.isEmpty()) {
            for (b bVar : list) {
                if (!TextUtils.isEmpty(bVar.f136608l) && Objects.equals(bVar.f136600d, str)) {
                    return bVar.f136608l;
                }
            }
        }
        return this.f136592i;
    }

    @NonNull
    public String toString() {
        List list = this.f136593j;
        String string = this.f136585b.toString();
        String strValueOf = String.valueOf(list);
        StringBuilder sb2 = new StringBuilder("ProductDetails{jsonString='");
        androidx.room.F.a(sb2, this.f136584a, "', parsedJson=", string, ", productId='");
        sb2.append(this.f136586c);
        sb2.append("', productType='");
        sb2.append(this.f136587d);
        sb2.append("', title='");
        sb2.append(this.f136588e);
        sb2.append("', productDetailsToken='");
        return C2564b.a(sb2, this.f136591h, "', subscriptionOfferDetails=", strValueOf, "}");
    }
}
