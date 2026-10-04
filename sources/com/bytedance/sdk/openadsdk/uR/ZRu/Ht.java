package com.bytedance.sdk.openadsdk.uR.ZRu;

import Z3.f;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class Ht {
    public static AtomicInteger ZRu = new AtomicInteger(0);
    public static AtomicInteger NOt = new AtomicInteger(0);
    public static AtomicInteger mZ = new AtomicInteger(0);
    public static AtomicInteger uR = new AtomicInteger(0);
    public static AtomicInteger TFq = new AtomicInteger(0);
    public static AtomicInteger Ht = new AtomicInteger(0);
    public static AtomicInteger Mm = new AtomicInteger(0);
    public static AtomicInteger FA = new AtomicInteger(0);
    public static AtomicInteger Vor = new AtomicInteger(0);

    public static void NOt() {
        try {
            com.bytedance.sdk.openadsdk.edo.mZ.ZRu().ZRu("pangle_sdk_get_ad_track", com.bytedance.sdk.openadsdk.multipro.uR.ZRu.NOt("tt_sdk_event_get_ad", "get_ad_event_key", ""));
            com.bytedance.sdk.openadsdk.multipro.uR.ZRu.ZRu("tt_sdk_event_get_ad");
        } catch (Throwable unused) {
        }
    }

    public static void TFq() {
        try {
            if (DeviceUtils.NOt()) {
                return;
            }
            Vor.incrementAndGet();
        } catch (Throwable unused) {
        }
    }

    public static void ZRu() {
        try {
            long jZRu = com.bytedance.sdk.openadsdk.multipro.uR.ZRu.ZRu("tt_sdk_event_get_ad", "get_ad_event_time_key", 0L);
            if (jZRu > 0 && System.currentTimeMillis() - jZRu >= 86400000) {
                NOt();
                com.bytedance.sdk.openadsdk.multipro.uR.ZRu.ZRu("tt_sdk_event_get_ad", "get_ad_event_time_key", Long.valueOf(System.currentTimeMillis()));
                return;
            }
            if (jZRu <= 0 || jZRu > System.currentTimeMillis()) {
                com.bytedance.sdk.openadsdk.multipro.uR.ZRu.ZRu("tt_sdk_event_get_ad", "get_ad_event_time_key", Long.valueOf(System.currentTimeMillis()));
            }
            JSONObject jSONObject = new JSONObject(com.bytedance.sdk.openadsdk.multipro.uR.ZRu.NOt("tt_sdk_event_get_ad", "get_ad_event_key", ""));
            int iOptInt = jSONObject.optInt("load_get_ad_version", 0);
            if (iOptInt >= 5702 && (iOptInt < 5800 || iOptInt >= 5802)) {
                ZRu.addAndGet(jSONObject.optInt("load_times"));
                NOt.addAndGet(jSONObject.optInt("load_success"));
                mZ.addAndGet(jSONObject.optInt("load_fail"));
                uR.addAndGet(jSONObject.optInt("load_success_and_parse_success"));
                TFq.addAndGet(jSONObject.optInt("load_success_and_parse_fail"));
                Ht.addAndGet(jSONObject.optInt("load_success_and_no_ad"));
                Mm.addAndGet(jSONObject.optInt("load_fail_by_no_net"));
                FA.addAndGet(jSONObject.optInt("load_fail_by_io"));
                Vor.addAndGet(jSONObject.optInt("load_fail_in_background"));
                return;
            }
            com.bytedance.sdk.openadsdk.multipro.uR.ZRu.ZRu("tt_sdk_event_get_ad");
        } catch (Throwable unused) {
        }
    }

    public static void mZ() {
        try {
            com.bytedance.sdk.openadsdk.multipro.uR.ZRu.ZRu("tt_sdk_event_get_ad", "get_ad_event_key", uR().toString());
        } catch (Throwable unused) {
        }
    }

    public static JSONObject uR() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("load_times", ZRu.get());
            jSONObject.put("load_success", NOt.get());
            jSONObject.put("load_fail", mZ.get());
            jSONObject.put("load_fail_in_background", Vor.get());
            jSONObject.put("load_success_and_parse_success", uR.get());
            jSONObject.put("load_success_and_parse_fail", TFq.get());
            jSONObject.put("load_success_and_no_ad", Ht.get());
            jSONObject.put("load_fail_by_no_net", Mm.get());
            jSONObject.put("load_fail_by_io", FA.get());
            jSONObject.put("load_get_ad_version", BuildConfig.VERSION_CODE);
            return jSONObject;
        } catch (Throwable unused) {
            return new JSONObject();
        }
    }

    public static void ZRu(int i10, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(f.f79422s, i10);
            jSONObject.put("msg", str);
            com.bytedance.sdk.openadsdk.edo.mZ.ZRu().ZRu("pangle_sdk_client_load_error", jSONObject);
        } catch (Throwable unused) {
        }
    }
}
