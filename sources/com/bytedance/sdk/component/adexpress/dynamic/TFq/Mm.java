package com.bytedance.sdk.component.adexpress.dynamic.TFq;

import com.bytedance.sdk.component.adexpress.NOt.sAl;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class Mm implements FA {
    private com.bytedance.sdk.component.adexpress.dynamic.Ht.NOt ZRu;

    /* JADX INFO: Access modifiers changed from: private */
    public void NOt(sAl sal) {
        try {
            JSONObject jSONObjectMZ = sal.mZ();
            JSONObject jSONObject = new JSONObject(jSONObjectMZ.optString("template_Plugin"));
            JSONObject jSONObjectOptJSONObject = jSONObjectMZ.optJSONObject("creative");
            com.bytedance.sdk.component.adexpress.dynamic.uR.FA faZRu = new Ht(jSONObject, jSONObjectOptJSONObject, jSONObjectMZ.optJSONObject("AdSize"), new JSONObject(jSONObjectMZ.optString("diff_template_Plugin"))).ZRu(sal.NOt(), sal.aT(), jSONObjectOptJSONObject.optDouble("score_exact_i18n"), jSONObjectOptJSONObject.optString("comment_num_i18n"), sal);
            try {
                JSONObject jSONObject2 = new JSONObject(jSONObjectOptJSONObject.optString("dynamic_creative"));
                faZRu.ZRu(jSONObject2.optString("color"));
                faZRu.ZRu(jSONObject2.optJSONArray("material_center"));
            } catch (Throwable unused) {
            }
            this.ZRu.ZRu(faZRu);
        } catch (Exception unused2) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.TFq.FA
    public void ZRu(com.bytedance.sdk.component.adexpress.dynamic.Ht.NOt nOt) {
        this.ZRu = nOt;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.TFq.FA
    public void ZRu(final sAl sal) {
        if (sal.lp() == 1) {
            NOt(sal);
        } else {
            com.bytedance.sdk.component.adexpress.uR.uR.ZRu(new com.bytedance.sdk.component.FA.FA("dynamicparse") { // from class: com.bytedance.sdk.component.adexpress.dynamic.TFq.Mm.1
                @Override // java.lang.Runnable
                public void run() {
                    Mm.this.NOt(sal);
                }
            }, 5);
        }
    }
}
