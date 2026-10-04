package com.bytedance.sdk.openadsdk.core.Vor;

import android.text.TextUtils;
import android.view.MotionEvent;
import com.bytedance.sdk.component.utils.TFq;
import com.bytedance.sdk.component.utils.lp;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.WMI;
import com.bytedance.sdk.openadsdk.core.model.qF;
import com.pgl.ssdk.ces.out.PglSSManager;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class mZ {
    private static boolean ZRu = false;

    public static String Ht() {
        if (WMI.uR().nqR()) {
            return NOt.NOt().uR();
        }
        return null;
    }

    public static void NOt(String str) {
        if (TextUtils.isEmpty(str) || !WMI.uR().nqR()) {
            return;
        }
        NOt.NOt().NOt(str);
    }

    public static int TFq() {
        if (WMI.uR().nqR()) {
            return NOt.NOt().Mm();
        }
        return 6;
    }

    public static void ZRu() {
        if (!ZRu && WMI.uR().nqR()) {
            NOt.NOt();
            ZRu = NOt.NOt().mZ();
        }
    }

    public static String mZ() {
        return WMI.uR().nqR() ? NOt.NOt().TFq() : "";
    }

    public static long uR() {
        if (WMI.uR().nqR()) {
            return NOt.NOt().Ht();
        }
        return 0L;
    }

    public static void NOt() {
        if (WMI.uR().nqR()) {
            NOt.NOt().ZRu();
        }
    }

    public static void ZRu(String str) {
        if (TextUtils.isEmpty(str) && WMI.uR().nqR()) {
            NOt.NOt().ZRu(str);
        }
    }

    public static void ZRu(qF qFVar, String str) {
        long jOptLong;
        long jOptLong2;
        long jOptLong3;
        Object obj;
        if (WMI.uR().nqR()) {
            HashMap map = new HashMap();
            map.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            map.put("au_show", str);
            if (qFVar != null) {
                String strJYr = qFVar.jYr();
                String strOptString = "-1";
                if (!TextUtils.isEmpty(strJYr)) {
                    map.put("request_id", strJYr);
                } else {
                    map.put("request_id", "-1");
                }
                try {
                    long j10 = -1;
                    if (qFVar.LO() != null) {
                        jOptLong = qFVar.LO().optLong("ad_id", -1L);
                        jOptLong2 = qFVar.LO().optLong("rit", -1L);
                        jOptLong3 = qFVar.LO().optLong("ad_slot_type", -1L);
                        strOptString = qFVar.LO().optString("ad_type", "-1");
                    } else {
                        jOptLong = -1;
                        jOptLong2 = -1;
                        jOptLong3 = -1;
                    }
                    map.put("ad_id", Long.valueOf(jOptLong));
                    map.put("rit", Long.valueOf(jOptLong2));
                    map.put("ad_slot_type", Long.valueOf(jOptLong3));
                    map.put("ad_type", strOptString);
                    Map<String, Object> mapZkn = qFVar.zkn();
                    if (mapZkn != null && (obj = mapZkn.get(TTAdConstant.SDK_BIDDING_TYPE)) != null) {
                        j10 = Long.parseLong(obj.toString());
                    }
                    map.put(TTAdConstant.SDK_BIDDING_TYPE, Long.valueOf(j10));
                    NOt.NOt().ZRu(PglSSManager.REPORT_SCENE_ADSHOW, map);
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static Map<String, String> ZRu(String str, String str2) {
        if (WMI.uR().nqR()) {
            return NOt.NOt().ZRu(str, str2 != null ? str2.getBytes() : new byte[0]);
        }
        return new HashMap();
    }

    public static void ZRu(MotionEvent motionEvent) {
        if (WMI.uR().nqR()) {
            NOt.NOt().ZRu(motionEvent);
        }
    }

    public static void ZRu(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            if (WMI.uR().nqR()) {
                ZRu();
                if (TFq() == 0) {
                    jSONObject.put("sec_did", NOt.NOt().uR());
                    String strZRu = TFq.ZRu(jSONObject.toString());
                    Map<String, String> mapZRu = NOt.NOt().ZRu("https://api16-access-sg.pangle.io/api/ad/union/sdk/get_ads/?aid=1371&device_platform=android&version_code=4250", strZRu != null ? strZRu.getBytes() : new byte[0]);
                    if (mapZRu != null && mapZRu.size() > 0) {
                        for (String str : mapZRu.keySet()) {
                            jSONObject.put(str, mapZRu.get(str));
                        }
                        jSONObject.put("url", "https://api16-access-sg.pangle.io/api/ad/union/sdk/get_ads/?aid=1371&device_platform=android&version_code=4250");
                        jSONObject.put("pangle_m", strZRu);
                    } else {
                        jSONObject.put("pglx", "8");
                    }
                    jSONObject.put("ec", NOt.NOt().Ht());
                    return;
                }
                jSONObject.put("pglx", String.valueOf(TFq()));
                return;
            }
            jSONObject.put("pglx", "6");
        } catch (Throwable th) {
            lp.ZRu("SecSdkHelperUtil", th.getMessage());
            try {
                jSONObject.put("pglx", "7");
            } catch (JSONException unused) {
            }
        }
    }
}
