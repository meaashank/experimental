package com.bytedance.sdk.openadsdk.uR.TFq.NOt;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class uR implements mZ {
    public long NOt;
    public long ZRu;
    public int mZ;
    public int uR = 0;

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
            jSONObject.put("total_duration", this.ZRu);
            jSONObject.put("buffers_time", this.NOt);
            jSONObject.put("break_reason", this.mZ);
            jSONObject.put("video_backup", this.uR);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lp.ZRu("FeedBreakModel", th.getMessage());
        }
    }
}
