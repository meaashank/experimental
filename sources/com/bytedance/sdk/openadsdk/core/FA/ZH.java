package com.bytedance.sdk.openadsdk.core.FA;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.qF;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class ZH {
    public static void ZRu(String str, int i10, String str2, String str3, String str4, com.bytedance.sdk.openadsdk.core.model.qF qFVar) {
        if (TextUtils.isEmpty(str2)) {
            str2 = com.bytedance.sdk.openadsdk.core.FA.ZRu(i10);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("render_source", str);
            qF.ZRu zRuHo = qFVar.Ho();
            if (zRuHo != null) {
                jSONObject.put("tpl_id", zRuHo.Ht());
                if ("Web".equals(str)) {
                    if (zRuHo.edo()) {
                        jSONObject.put("engine_version", "v3");
                    } else {
                        jSONObject.put("engine_version", "v1");
                    }
                }
            } else if (qFVar.AK() != null) {
                jSONObject.put("tpl_id", qFVar.AK().ZRu());
                if ("Web".equals(str)) {
                    jSONObject.put("engine_version", "v3");
                }
            }
        } catch (Exception unused) {
        }
        com.bytedance.sdk.openadsdk.edo.mZ.ZRu().ZRu(com.bytedance.sdk.openadsdk.edo.ZRu.uR.NOt().ZRu(ZRu(str3)).mZ(str4).TFq(qFVar != null ? qFVar.jYr() : "").NOt(i10).NOt(jSONObject.toString()).Ht(str2));
    }

    private static int ZRu(String str) {
        str.getClass();
        switch (str) {
            case "banner_ad":
                return 1;
            case "rewarded_video":
                return 7;
            case "open_ad":
                return 3;
            case "fullscreen_interstitial_ad":
                return 8;
            case "interaction":
                return 2;
            default:
                return 5;
        }
    }
}
