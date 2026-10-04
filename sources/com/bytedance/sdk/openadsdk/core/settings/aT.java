package com.bytedance.sdk.openadsdk.core.settings;

import com.bytedance.sdk.openadsdk.core.settings.TFq;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class aT extends oK {
    public aT() {
        super("tt_set_mediation.prop", null);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.TFq
    public void ZRu(JSONObject jSONObject) {
        if (jSONObject.has("mediation_init_conf")) {
            TFq.ZRu ZRu = ZRu();
            ZRu.ZRu("mediation_init_conf", jSONObject.optString("mediation_init_conf"));
            ZRu.ZRu();
            uR();
        }
    }
}
