package com.bytedance.sdk.openadsdk.core.model;

import com.tonyodev.fetch2core.server.FileResponse;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class le {
    private String NOt;
    private JSONObject TFq;
    private String ZRu;
    private String mZ;
    private String uR;

    public JSONObject Ht() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.ZRu);
            jSONObject.put(FileResponse.FIELD_MD5, this.NOt);
            jSONObject.put("url", this.mZ);
            jSONObject.put("data", this.uR);
            jSONObject.put("custom_components", this.TFq);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public String NOt() {
        return this.NOt;
    }

    public JSONObject TFq() {
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

    public static le ZRu(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        le leVar = new le();
        leVar.ZRu = jSONObject.optString("id");
        leVar.uR = jSONObject.optString("data");
        leVar.mZ = jSONObject.optString("url");
        leVar.NOt = jSONObject.optString(FileResponse.FIELD_MD5);
        leVar.TFq = jSONObject.optJSONObject("custom_components");
        return leVar;
    }
}
