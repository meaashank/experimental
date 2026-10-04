package com.bytedance.sdk.openadsdk.ZH.ZRu;

import com.bytedance.sdk.component.ZRu.WMI;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class uR extends com.bytedance.sdk.component.ZRu.TFq<JSONObject, JSONObject> {
    private JSONObject ZRu;

    public uR(JSONObject jSONObject) {
        this.ZRu = jSONObject;
    }

    public static void ZRu(WMI wmi, JSONObject jSONObject) {
        wmi.ZRu("getData", new uR(jSONObject));
    }

    @Override // com.bytedance.sdk.component.ZRu.TFq
    public JSONObject ZRu(JSONObject jSONObject, com.bytedance.sdk.component.ZRu.Ht ht) throws Exception {
        return com.bytedance.sdk.openadsdk.core.FA.ZRu.NOt.ZRu(this.ZRu, jSONObject);
    }
}
