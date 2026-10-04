package com.bytedance.sdk.component.FA.NOt;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ZRu {
    public int NOt;
    public int ZRu;
    public int mZ;
    public int uR;

    public ZRu(int i10, int i11, int i12, int i13) {
        this.ZRu = i10;
        this.NOt = i11;
        this.mZ = i12;
        this.uR = i13;
    }

    public JSONObject ZRu() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdk_thread_num", this.ZRu);
            jSONObject.put("sdk_max_thread_num", this.NOt);
            jSONObject.put("app_thread_num", this.mZ);
            jSONObject.put("app_max_thread_num", this.uR);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
