package com.android.billingclient.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.android.billingclient.api.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@X2
public final class C3019l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f136768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f136769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<a> f136770c;

    public C3019l0(String str) throws JSONException {
        this.f136768a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f136769b = jSONObject;
        this.f136770c = d(jSONObject.optJSONArray("products"));
    }

    public static List<a> d(@Nullable JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new a(jSONObjectOptJSONObject));
                }
            }
        }
        return arrayList;
    }

    @NonNull
    public String a() {
        return this.f136769b.optString("externalTransactionToken");
    }

    @Nullable
    public String b() {
        String strOptString = this.f136769b.optString("originalExternalTransactionId");
        if (strOptString.isEmpty()) {
            return null;
        }
        return strOptString;
    }

    @NonNull
    public List<a> c() {
        return this.f136770c;
    }

    /* JADX INFO: renamed from: com.android.billingclient.api.l0$a */
    @X2
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f136771a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f136772b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final String f136773c;

        public a(String str, String str2, @Nullable String str3) {
            this.f136771a = str;
            this.f136772b = str2;
            this.f136773c = str3;
        }

        @NonNull
        public String a() {
            return this.f136771a;
        }

        @Nullable
        public String b() {
            return this.f136773c;
        }

        @NonNull
        public String c() {
            return this.f136772b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f136771a.equals(aVar.a()) && this.f136772b.equals(aVar.c()) && Objects.equals(this.f136773c, aVar.b());
        }

        public int hashCode() {
            return Objects.hash(this.f136771a, this.f136772b, this.f136773c);
        }

        @NonNull
        public String toString() {
            return String.format("{id: %s, type: %s, offer token: %s}", this.f136771a, this.f136772b, this.f136773c);
        }

        public a(JSONObject jSONObject) {
            this.f136771a = jSONObject.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
            this.f136772b = jSONObject.optString("productType");
            String strOptString = jSONObject.optString("offerToken");
            this.f136773c = true == strOptString.isEmpty() ? null : strOptString;
        }
    }
}
