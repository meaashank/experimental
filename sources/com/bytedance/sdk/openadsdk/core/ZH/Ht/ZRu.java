package com.bytedance.sdk.openadsdk.core.ZH.Ht;

import com.tonyodev.fetch2core.server.FileResponse;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class ZRu {
    private String NOt;
    private String TFq;
    private String ZRu;
    private String mZ;
    private String uR;

    public String NOt() {
        return this.NOt;
    }

    public String TFq() {
        return this.TFq;
    }

    public String ZRu() {
        return this.ZRu;
    }

    public String mZ() {
        return this.mZ;
    }

    public String uR() {
        return this.uR;
    }

    public ZRu NOt(String str) {
        this.NOt = str;
        return this;
    }

    public ZRu TFq(String str) {
        this.TFq = str;
        return this;
    }

    public ZRu ZRu(String str) {
        this.ZRu = str;
        return this;
    }

    public ZRu mZ(String str) {
        this.mZ = str;
        return this;
    }

    public ZRu uR(String str) {
        this.uR = str;
        return this;
    }

    public JSONObject ZRu(ZRu zRu) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.ZRu);
            jSONObject.put(FileResponse.FIELD_MD5, this.NOt);
            jSONObject.put("url", this.mZ);
            if (zRu != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("id", zRu.ZRu());
                jSONObject2.put(FileResponse.FIELD_MD5, zRu.NOt());
                jSONObject2.put("url", zRu.mZ());
                jSONObject.put("overlay", jSONObject2);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
