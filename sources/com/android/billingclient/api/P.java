package com.android.billingclient.api;

import androidx.annotation.NonNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@K2
public final class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f136466a;

    public P(String str) throws JSONException {
        this.f136466a = new JSONObject(str).optString("externalTransactionToken");
    }

    @NonNull
    public String a() {
        return this.f136466a;
    }
}
