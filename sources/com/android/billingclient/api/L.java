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

/* JADX INFO: loaded from: classes2.dex */
public final class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f136434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f136435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f136436c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f136437d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final String f136438e;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f136439a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f136440b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final String f136441c;

        public /* synthetic */ a(JSONObject jSONObject, Y1 y12) {
            this.f136439a = jSONObject.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
            this.f136440b = jSONObject.optString("productType");
            String strOptString = jSONObject.optString("offerToken");
            this.f136441c = true == strOptString.isEmpty() ? null : strOptString;
        }

        @NonNull
        public String a() {
            return this.f136439a;
        }

        @Nullable
        public String b() {
            return this.f136441c;
        }

        @NonNull
        public String c() {
            return this.f136440b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f136439a.equals(aVar.a()) && this.f136440b.equals(aVar.c()) && Objects.equals(this.f136441c, aVar.b());
        }

        public int hashCode() {
            return Objects.hash(this.f136439a, this.f136440b, this.f136441c);
        }

        @NonNull
        public String toString() {
            return String.format("{id: %s, type: %s, offer token: %s}", this.f136439a, this.f136440b, this.f136441c);
        }
    }

    public L(String str) throws JSONException {
        this.f136434a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f136435b = jSONObject;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("products");
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray != null) {
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new a(jSONObjectOptJSONObject, null));
                }
            }
        }
        this.f136436c = arrayList;
        this.f136437d = e("originalExternalTransactionId");
        this.f136438e = e("externalTransactionToken");
    }

    @Nullable
    @InterfaceC3017k2
    public String a() {
        return this.f136438e;
    }

    @Nullable
    public String b() {
        return this.f136435b.optString("linkUri");
    }

    @Nullable
    public String c() {
        return this.f136437d;
    }

    @NonNull
    public List<a> d() {
        return this.f136436c;
    }

    @Nullable
    public final String e(String str) {
        String strOptString = this.f136435b.optString(str);
        if (strOptString.isEmpty()) {
            return null;
        }
        return strOptString;
    }
}
