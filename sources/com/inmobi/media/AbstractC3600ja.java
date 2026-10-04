package com.inmobi.media;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.ja, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC3600ja {
    public static JSONObject a(String str, int i10, String str2, int i11) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(str, i10);
        jSONObject.put(str2, i11);
        return jSONObject;
    }
}
