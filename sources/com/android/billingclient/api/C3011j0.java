package com.android.billingclient.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.android.billingclient.api.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@W2
public final class C3011j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f136715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f136716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f136717c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f136718d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final String f136719e;

    /* JADX INFO: renamed from: com.android.billingclient.api.j0$a */
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {

        /* JADX INFO: renamed from: n1, reason: collision with root package name */
        @W2
        public static final int f136720n1 = 0;

        /* JADX INFO: renamed from: o1, reason: collision with root package name */
        @W2
        public static final int f136721o1 = 2;

        /* JADX INFO: renamed from: p1, reason: collision with root package name */
        @W2
        public static final int f136722p1 = 3;

        /* JADX INFO: renamed from: q1, reason: collision with root package name */
        @W2
        public static final int f136723q1 = 4;
    }

    public C3011j0(String str) throws JSONException {
        this.f136715a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f136716b = jSONObject.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
        String strOptString = jSONObject.optString("type");
        this.f136717c = strOptString;
        this.f136718d = jSONObject.has("statusCode") ? jSONObject.optInt("statusCode") : 0;
        if (TextUtils.isEmpty(strOptString)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.f136719e = jSONObject.optString("serializedDocid");
    }

    @NonNull
    @e.f0
    public static C3011j0 a(@NonNull String str) throws JSONException {
        return new C3011j0(str);
    }

    @NonNull
    @W2
    public String b() {
        return this.f136716b;
    }

    @NonNull
    @W2
    public String c() {
        return this.f136717c;
    }

    @Nullable
    public String d() {
        return this.f136719e;
    }

    @W2
    public int e() {
        return this.f136718d;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3011j0) {
            return TextUtils.equals(this.f136715a, ((C3011j0) obj).f136715a);
        }
        return false;
    }

    public int hashCode() {
        return this.f136715a.hashCode();
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("UnfetchedProduct{productId='");
        sb2.append(this.f136716b);
        sb2.append("', productType='");
        sb2.append(this.f136717c);
        sb2.append("', statusCode=");
        return android.support.v4.media.d.a(sb2, this.f136718d, "}");
    }
}
