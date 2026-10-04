package com.bytedance.sdk.openadsdk.uR.TFq.NOt;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class edo implements mZ {
    private long NOt;
    private final String TFq;
    private long ZRu;
    private final int mZ;
    private final int uR;

    public edo(com.bykv.vk.openvk.ZRu.ZRu.ZRu.mZ.ZRu zRu) {
        this.mZ = zRu.ZRu();
        this.uR = zRu.NOt();
        this.TFq = zRu.mZ();
    }

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
            jSONObject.put("error_code", this.mZ);
            jSONObject.put("extra_error_code", this.uR);
            jSONObject.put("error_message", this.TFq);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lp.ZRu("PlayErrorModel", th.getMessage());
        }
    }
}
