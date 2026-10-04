package com.android.billingclient.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.android.billingclient.api.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C2987d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f136676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f136677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JSONObject f136678c;

    public C2987d0(@NonNull String str, @NonNull String str2) throws JSONException {
        this.f136676a = str;
        this.f136677b = str2;
        this.f136678c = new JSONObject(str);
    }

    @NonNull
    public String a() {
        return this.f136678c.optString("developerPayload");
    }

    @NonNull
    public String b() {
        return this.f136676a;
    }

    @NonNull
    public List<String> c() {
        return i();
    }

    public long d() {
        return this.f136678c.optLong("purchaseTime");
    }

    @NonNull
    public String e() {
        JSONObject jSONObject = this.f136678c;
        return jSONObject.optString(BidResponsed.KEY_TOKEN, jSONObject.optString("purchaseToken"));
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2987d0)) {
            return false;
        }
        C2987d0 c2987d0 = (C2987d0) obj;
        return TextUtils.equals(this.f136676a, c2987d0.b()) && TextUtils.equals(this.f136677b, c2987d0.g());
    }

    public int f() {
        return this.f136678c.optInt(FirebaseAnalytics.Param.QUANTITY, 1);
    }

    @NonNull
    public String g() {
        return this.f136677b;
    }

    @NonNull
    @Deprecated
    public ArrayList<String> h() {
        return i();
    }

    public int hashCode() {
        return this.f136676a.hashCode();
    }

    public final ArrayList i() {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = this.f136678c;
        if (jSONObject.has("productIds")) {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("productIds");
            if (jSONArrayOptJSONArray != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    arrayList.add(jSONArrayOptJSONArray.optString(i10));
                }
            }
        } else if (jSONObject.has(InAppPurchaseMetaData.KEY_PRODUCT_ID)) {
            arrayList.add(jSONObject.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID));
        }
        return arrayList;
    }

    @NonNull
    public String toString() {
        return "PurchaseHistoryRecord. Json: ".concat(String.valueOf(this.f136676a));
    }
}
