package com.android.billingclient.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.android.billingclient.api.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@N2
public final class C3069y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f136855a;

    public C3069y(@Nullable String str, String str2) {
        this.f136855a = str2;
    }

    public static C3069y a(String str) {
        return new C3069y(null, str);
    }

    @NonNull
    public String b() {
        return this.f136855a;
    }

    public C3069y(String str) throws JSONException {
        this.f136855a = new JSONObject(str).optString(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE);
    }
}
