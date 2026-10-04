package com.bytedance.sdk.openadsdk.core.sAl.mZ;

import com.bytedance.sdk.component.utils.lp;
import com.bytedance.sdk.openadsdk.core.model.qF;
import com.bytedance.sdk.openadsdk.core.model.xY;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class NOt {
    public static void ZRu(qF qFVar) {
        if (xY.NOt(qFVar)) {
            com.bytedance.sdk.openadsdk.uR.mZ.NOt(qFVar, "playable_preload", "preload_start", (JSONObject) null);
        }
    }

    public static void ZRu(qF qFVar, long j10, long j11) {
        if (qFVar != null) {
            if (xY.mZ(qFVar) || xY.NOt(qFVar)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("loadzip_success_time", j10);
                    jSONObject.put("unzip_success_time", j11);
                } catch (JSONException e10) {
                    lp.ZRu("PlayableEvent", "onSuccess json error", e10);
                }
                com.bytedance.sdk.openadsdk.uR.mZ.NOt(qFVar, "playable_preload", "preload_success", jSONObject);
            }
        }
    }

    public static void ZRu(qF qFVar, int i10, String str) {
        if (qFVar != null) {
            if (xY.mZ(qFVar) || xY.NOt(qFVar)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("error_code", i10);
                    jSONObject.put("error_reason", str);
                } catch (JSONException e10) {
                    lp.ZRu("PlayableEvent", "onFail json error", e10);
                }
                com.bytedance.sdk.openadsdk.uR.mZ.NOt(qFVar, "playable_preload", "preload_fail", jSONObject);
            }
        }
    }
}
