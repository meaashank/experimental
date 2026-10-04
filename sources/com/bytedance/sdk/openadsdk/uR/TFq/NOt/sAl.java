package com.bytedance.sdk.openadsdk.uR.TFq.NOt;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class sAl implements mZ {
    public int NOt;
    public long ZRu;
    public long mZ;

    public void NOt(long j10) {
        this.mZ = j10;
    }

    public void ZRu(long j10) {
        this.ZRu = j10;
    }

    public void ZRu(int i10) {
        this.NOt = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.uR.TFq.NOt.mZ
    public void ZRu(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("buffers_time", this.ZRu);
            jSONObject.put("buffers_count", this.NOt);
            jSONObject.put("total_duration", this.mZ);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lp.ZRu("PlayBufferModel", th.getMessage());
        }
    }
}
