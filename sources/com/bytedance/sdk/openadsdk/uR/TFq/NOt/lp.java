package com.bytedance.sdk.openadsdk.uR.TFq.NOt;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class lp implements mZ {
    private long NOt;
    private String ZRu;
    private long mZ;
    private long uR;

    public void NOt(long j10) {
        this.mZ = j10;
    }

    public void ZRu(String str) {
        this.ZRu = str;
    }

    public void mZ(long j10) {
        this.uR = j10;
    }

    public void ZRu(long j10) {
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
            jSONObject.put("load_time", this.mZ);
            jSONObject.put("local_cache", this.uR);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lp.ZRu("LoadVideoSuccessModel", th.getMessage());
        }
    }
}
