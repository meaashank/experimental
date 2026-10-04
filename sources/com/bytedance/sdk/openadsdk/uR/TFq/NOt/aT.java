package com.bytedance.sdk.openadsdk.uR.TFq.NOt;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class aT implements mZ {
    private String Ht;
    private long NOt;
    private String TFq;
    private String ZRu;
    private long mZ;
    private int uR;

    public void NOt(long j10) {
        this.mZ = j10;
    }

    public void ZRu(String str) {
        this.ZRu = str;
    }

    public void mZ(String str) {
        this.Ht = str;
    }

    public void NOt(String str) {
        this.TFq = str;
    }

    public void ZRu(long j10) {
        this.NOt = j10;
    }

    public void ZRu(int i10) {
        this.uR = i10;
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
            jSONObject.put("error_code", this.uR);
            jSONObject.put("error_message", this.TFq);
            jSONObject.put("error_message_server", this.Ht);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lp.ZRu("LoadVideoErrorModel", th.getMessage());
        }
    }
}
