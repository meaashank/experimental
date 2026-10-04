package com.bytedance.sdk.openadsdk.uR.TFq.NOt;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class Ht implements mZ {
    private long NOt;
    private long ZRu;
    private int mZ = 0;

    public void NOt(long j10) {
        this.NOt = j10;
    }

    public void ZRu(long j10) {
        this.ZRu = j10;
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
            jSONObject.put("total_duration", this.ZRu);
            jSONObject.put("buffers_time", this.NOt);
            jSONObject.put("video_backup", this.mZ);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lp.ZRu("FeedOverModel", th.getMessage());
        }
    }
}
