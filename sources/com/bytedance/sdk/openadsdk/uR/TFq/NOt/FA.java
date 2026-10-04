package com.bytedance.sdk.openadsdk.uR.TFq.NOt;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class FA implements mZ {
    private long NOt;
    private long ZRu;
    private int mZ;

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
            jSONObject.put("video_start_duration", this.ZRu);
            jSONObject.put("video_cache_size", this.NOt);
            jSONObject.put("is_auto_play", this.mZ);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lp.ZRu("FeedPlayModel", th.getMessage());
        }
    }
}
