package com.inmobi.media;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public abstract class U3 {
    public static V3 a(String json) {
        kotlin.jvm.internal.G.p(json, "json");
        V3 v32 = new V3();
        v32.f152512b = json;
        try {
            JSONObject jSONObject = new JSONObject(json);
            v32.f152511a = true;
            if (jSONObject.has("useCustomClose")) {
                v32.f152514d = true;
            }
            v32.f152513c = jSONObject.optBoolean("useCustomClose", false);
        } catch (JSONException unused) {
        }
        return v32;
    }
}
