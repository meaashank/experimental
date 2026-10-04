package com.bytedance.sdk.openadsdk.uR.TFq.NOt;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class NOt implements mZ {
    private long NOt;
    private long ZRu;
    private int mZ;
    private int uR;

    public void NOt(long j10) {
        this.NOt = j10;
    }

    public void ZRu(long j10) {
        this.ZRu = j10;
    }

    public void NOt(int i10) {
        this.uR = i10;
    }

    public void ZRu(int i10) {
        this.mZ = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.uR.TFq.NOt.mZ
    public void ZRu(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("buffers_time", this.ZRu);
            jSONObject.put("total_duration", this.NOt);
            jSONObject.put("vbtt_skip_type", this.mZ);
            jSONObject.put("skip_reason", this.uR);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lp.ZRu("EndcardSkipModel", th.getMessage());
        }
    }
}
