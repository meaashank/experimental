package com.android.billingclient.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.play_billing.zzcf;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.android.billingclient.api.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C2983c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f136662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f136663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JSONObject f136664c;

    /* JADX INFO: renamed from: com.android.billingclient.api.c0$a */
    @V2
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JSONObject f136665a;

        public a(JSONObject jSONObject) {
            this.f136665a = jSONObject;
        }

        @NonNull
        public List<String> a() {
            JSONArray jSONArrayOptJSONArray;
            ArrayList arrayList = new ArrayList();
            if (this.f136665a.has("productIds") && (jSONArrayOptJSONArray = this.f136665a.optJSONArray("productIds")) != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    arrayList.add(jSONArrayOptJSONArray.optString(i10));
                }
            }
            return arrayList;
        }

        @NonNull
        public String b() {
            return this.f136665a.optString("purchaseToken");
        }
    }

    /* JADX INFO: renamed from: com.android.billingclient.api.c0$b */
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {

        /* JADX INFO: renamed from: k1, reason: collision with root package name */
        public static final int f136666k1 = 0;

        /* JADX INFO: renamed from: l1, reason: collision with root package name */
        public static final int f136667l1 = 1;

        /* JADX INFO: renamed from: m1, reason: collision with root package name */
        public static final int f136668m1 = 2;
    }

    public C2983c0(@NonNull String str, @NonNull String str2) throws JSONException {
        this.f136662a = str;
        this.f136663b = str2;
        this.f136664c = new JSONObject(str);
        zzcf.zzk();
    }

    @Nullable
    public C2974a a() {
        JSONObject jSONObject = this.f136664c;
        String strOptString = jSONObject.optString("obfuscatedAccountId");
        String strOptString2 = jSONObject.optString("obfuscatedProfileId");
        if (strOptString == null && strOptString2 == null) {
            return null;
        }
        return new C2974a(strOptString, strOptString2);
    }

    @NonNull
    public String b() {
        return this.f136664c.optString("developerPayload");
    }

    @Nullable
    public String c() {
        String strOptString = this.f136664c.optString("orderId");
        if (TextUtils.isEmpty(strOptString)) {
            return null;
        }
        return strOptString;
    }

    @NonNull
    public String d() {
        return this.f136662a;
    }

    @NonNull
    public String e() {
        return this.f136664c.optString("packageName");
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2983c0)) {
            return false;
        }
        C2983c0 c2983c0 = (C2983c0) obj;
        return TextUtils.equals(this.f136662a, c2983c0.d()) && TextUtils.equals(this.f136663b, c2983c0.l());
    }

    @Nullable
    @V2
    public a f() {
        JSONObject jSONObjectOptJSONObject = this.f136664c.optJSONObject("pendingPurchaseUpdate");
        if (jSONObjectOptJSONObject == null) {
            return null;
        }
        return new a(jSONObjectOptJSONObject);
    }

    @NonNull
    public List<String> g() {
        return q();
    }

    public int h() {
        return this.f136664c.optInt("purchaseState", 1) != 4 ? 1 : 2;
    }

    public int hashCode() {
        return this.f136662a.hashCode();
    }

    public long i() {
        return this.f136664c.optLong("purchaseTime");
    }

    @NonNull
    public String j() {
        JSONObject jSONObject = this.f136664c;
        return jSONObject.optString(BidResponsed.KEY_TOKEN, jSONObject.optString("purchaseToken"));
    }

    public int k() {
        return this.f136664c.optInt(FirebaseAnalytics.Param.QUANTITY, 1);
    }

    @NonNull
    public String l() {
        return this.f136663b;
    }

    @NonNull
    @Deprecated
    public ArrayList<String> m() {
        return q();
    }

    public boolean n() {
        return this.f136664c.optBoolean("acknowledged", true);
    }

    public boolean o() {
        return this.f136664c.optBoolean("autoRenewing");
    }

    public boolean p() {
        return this.f136664c.optBoolean("suspended");
    }

    public final ArrayList q() {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = this.f136664c;
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
        return "Purchase. Json: ".concat(String.valueOf(this.f136662a));
    }
}
