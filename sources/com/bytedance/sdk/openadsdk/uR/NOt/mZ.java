package com.bytedance.sdk.openadsdk.uR.NOt;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class mZ implements NOt {
    NOt ZRu;

    @Override // com.bytedance.sdk.openadsdk.uR.NOt.NOt
    public void ZRu(JSONObject jSONObject, long j10) throws JSONException {
        NOt nOt = this.ZRu;
        if (nOt != null) {
            nOt.ZRu(jSONObject, j10);
        }
        if (j10 <= 0) {
            j10 = System.currentTimeMillis();
        }
        jSONObject.put("event_ts", j10);
    }
}
