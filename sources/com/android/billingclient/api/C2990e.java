package com.android.billingclient.api;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.android.billingclient.api.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC3012j1
@KeepForSdk
public final class C2990e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f136691a;

    public C2990e(String str) throws JSONException {
        this.f136691a = new JSONObject(str).optString("externalTransactionToken");
    }

    @NonNull
    public String a() {
        return this.f136691a;
    }
}
