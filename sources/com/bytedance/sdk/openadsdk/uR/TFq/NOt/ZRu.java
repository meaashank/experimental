package com.bytedance.sdk.openadsdk.uR.TFq.NOt;

import com.bytedance.sdk.openadsdk.core.model.qF;
import com.bytedance.sdk.openadsdk.uR.TFq.NOt.mZ;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class ZRu<T extends mZ> {
    private String NOt;
    private boolean TFq = false;
    private qF ZRu;
    private JSONObject mZ;
    private T uR;

    public ZRu(qF qFVar, String str, JSONObject jSONObject, T t10) {
        this.ZRu = qFVar;
        this.NOt = str;
        this.mZ = jSONObject;
        this.uR = t10;
    }

    public String NOt() {
        return this.NOt;
    }

    public boolean TFq() {
        return this.TFq;
    }

    public qF ZRu() {
        return this.ZRu;
    }

    public JSONObject mZ() {
        if (this.mZ == null) {
            this.mZ = new JSONObject();
        }
        return this.mZ;
    }

    public T uR() {
        return this.uR;
    }

    public void ZRu(boolean z10) {
        this.TFq = z10;
    }
}
