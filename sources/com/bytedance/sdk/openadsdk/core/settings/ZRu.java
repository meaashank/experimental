package com.bytedance.sdk.openadsdk.core.settings;

import com.bytedance.sdk.openadsdk.core.settings.TFq;
import com.bytedance.sdk.openadsdk.core.settings.oK;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class ZRu extends oK {
    public ZRu() {
        super("tt_set_apm.prop", new oK.ZRu() { // from class: com.bytedance.sdk.openadsdk.core.settings.ZRu.1
            @Override // com.bytedance.sdk.openadsdk.core.settings.oK.ZRu
            public void NOt() {
            }

            @Override // com.bytedance.sdk.openadsdk.core.settings.oK.ZRu
            public void ZRu() {
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.TFq
    public void ZRu(JSONObject jSONObject) {
        TFq.ZRu ZRu = ZRu();
        if (jSONObject.has("apm_url")) {
            ZRu.ZRu("apm_url", jSONObject.optString("apm_url"));
        }
        if (jSONObject.has("perf_con")) {
            try {
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("perf_con");
                if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.has("perf_con_apm")) {
                    ZRu.ZRu("perf_con_apm", jSONObjectOptJSONObject.optInt("perf_con_apm"));
                }
            } catch (Exception unused) {
            }
        }
        ZRu.ZRu();
        uR();
    }
}
