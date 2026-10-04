package com.bytedance.sdk.openadsdk.ZH.ZRu;

import com.bytedance.sdk.component.ZRu.WMI;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class Vor extends com.bytedance.sdk.component.ZRu.TFq<JSONObject, JSONObject> {
    private WeakReference<com.bytedance.sdk.component.Vor.uR> ZRu;

    public Vor(com.bytedance.sdk.component.Vor.uR uRVar) {
        this.ZRu = new WeakReference<>(uRVar);
    }

    public static void ZRu(WMI wmi, com.bytedance.sdk.component.Vor.uR uRVar) {
        wmi.ZRu("preventTouchEvent", new Vor(uRVar));
    }

    @Override // com.bytedance.sdk.component.ZRu.TFq
    public JSONObject ZRu(JSONObject jSONObject, com.bytedance.sdk.component.ZRu.Ht ht) throws Exception {
        JSONObject jSONObject2 = new JSONObject();
        try {
            boolean zOptBoolean = jSONObject.optBoolean("isPrevent", false);
            com.bytedance.sdk.component.Vor.uR uRVar = this.ZRu.get();
            if (uRVar != null) {
                uRVar.setIsPreventTouchEvent(zOptBoolean);
                jSONObject2.put("success", true);
                return jSONObject2;
            }
            jSONObject2.put("success", false);
            return jSONObject2;
        } catch (Throwable unused) {
            jSONObject2.put("success", false);
            return jSONObject2;
        }
    }
}
