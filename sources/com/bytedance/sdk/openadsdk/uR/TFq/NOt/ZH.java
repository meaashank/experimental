package com.bytedance.sdk.openadsdk.uR.TFq.NOt;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class ZH implements mZ {
    private final long NOt;
    private final String ZRu;

    public ZH(String str, long j10) {
        this.ZRu = str;
        this.NOt = j10;
    }

    @Override // com.bytedance.sdk.openadsdk.uR.TFq.NOt.mZ
    public void ZRu(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("preload_url", this.ZRu);
            jSONObject.put("preload_size", this.NOt);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lp.ZRu("LoadVideoStartModel", th.getMessage());
        }
    }
}
