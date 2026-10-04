package com.bytedance.sdk.openadsdk.uR.TFq.NOt;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class TFq implements mZ {
    private long NOt;
    private long ZRu;

    public void NOt(long j10) {
        this.NOt = j10;
    }

    public void ZRu(long j10) {
        this.ZRu = j10;
    }

    @Override // com.bytedance.sdk.openadsdk.uR.TFq.NOt.mZ
    public void ZRu(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("buffers_time", this.ZRu);
            jSONObject.put("total_duration", this.NOt);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lp.ZRu("FeedContinueModel", th.getMessage());
        }
    }
}
