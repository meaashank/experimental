package com.bytedance.sdk.openadsdk;

import R3.a;
import android.content.Context;
import android.os.Build;
import android.support.v4.media.i;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.apm.insight.AttachUserData;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.MonitorCrash;
import com.bytedance.sdk.component.FA.FA;
import com.bytedance.sdk.openadsdk.core.WMI;
import com.bytedance.sdk.openadsdk.core.lp;
import com.bytedance.sdk.openadsdk.core.model.qF;
import com.bytedance.sdk.openadsdk.core.settings.Ht;
import com.bytedance.sdk.openadsdk.uR.mZ;
import com.bytedance.sdk.openadsdk.utils.WD;
import com.bytedance.sdk.openadsdk.utils.Yx;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.prism.gaia.download.j;
import com.prism.hider.vault.calculator.G;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class ApmHelper {
    private static NOt Ht = null;
    private static ZRu Mm = null;
    private static final AtomicBoolean NOt = new AtomicBoolean(false);
    private static boolean TFq = false;
    private static volatile boolean ZRu = false;
    private static String mZ;
    private static boolean uR;

    public interface NOt {
        void ZRu(String str, String str2, Throwable th);
    }

    public static class ZRu {
        public final String NOt;
        public final String ZRu;
        public final Throwable mZ;

        public ZRu(String str, String str2, Throwable th) {
            this.ZRu = str;
            this.NOt = str2;
            this.mZ = th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map<String, String> Vor() {
        HashMap map = new HashMap();
        qF qFVarZRu = com.bytedance.sdk.openadsdk.utils.NOt.ZRu();
        if (qFVarZRu != null) {
            map.put("adType", String.valueOf(qFVarZRu.dkT()));
            map.put("aid", String.valueOf(qFVarZRu.gx()));
            map.put(BidResponsedEx.KEY_CID, qFVarZRu.vE());
            map.put("reqId", qFVarZRu.jYr());
            map.put("rit", qFVarZRu.le("-1"));
            int iLe = qFVarZRu.le();
            if (qFVarZRu.xY() != 2) {
                iLe = -1;
            }
            map.put("render_type", String.valueOf(iLe));
        }
        return map;
    }

    public static void initApm(final Context context, final InitConfig initConfig) {
        if (NOt.compareAndSet(false, true) && !ZRu) {
            WD.ZRu(new FA("init-apm") { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1
                @Override // java.lang.Runnable
                public void run() {
                    if (!ApmHelper.ZRu) {
                        Ht htUR = WMI.uR();
                        boolean unused = ApmHelper.uR = htUR.IZ();
                        if (ApmHelper.uR && !TextUtils.isEmpty(htUR.Yx())) {
                            String unused2 = ApmHelper.mZ = initConfig.getAppId();
                            String[] strArr = {"com.bytedance.sdk.component", "com.bytedance.sdk.mediation", BuildConfig.LIBRARY_PACKAGE_NAME, "com.com.bytedance.overseas.sdk", "com.pgl.ssdk", "com.bykv.vk", "com.iab.omid.library.bytedance2", "com.bytedance.adsdk"};
                            String strZRu = lp.ZRu(context);
                            String strYx = htUR.Yx();
                            try {
                                final MonitorCrash monitorCrashInitSDK = MonitorCrash.initSDK(context, "10000001", 6405L, BuildConfig.VERSION_NAME, strArr);
                                monitorCrashInitSDK.setCustomDataCallback(new AttachUserData() { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1.1
                                    @Override // com.apm.insight.AttachUserData
                                    @Nullable
                                    public Map<? extends String, ? extends String> getUserData(CrashType crashType) {
                                        Map<? extends String, ? extends String> mapVor = ApmHelper.Vor();
                                        if (mapVor.containsKey("render_type")) {
                                            monitorCrashInitSDK.addTags("render_type", mapVor.get("render_type"));
                                            return mapVor;
                                        }
                                        monitorCrashInitSDK.addTags("render_type", "-2");
                                        return mapVor;
                                    }
                                });
                                if (htUR.gaw()) {
                                    monitorCrashInitSDK.config().setSoList(new String[]{"libnms.so", "libtobEmbedPagEncrypt.so", "tt_ugen_layout.so"});
                                }
                                monitorCrashInitSDK.config().setDeviceId(strZRu);
                                monitorCrashInitSDK.setReportUrl(strYx);
                                monitorCrashInitSDK.addTags("host_appid", ApmHelper.mZ);
                                monitorCrashInitSDK.addTags("sdk_version", BuildConfig.VERSION_NAME);
                                NOt unused3 = ApmHelper.Ht = new NOt() { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1.2
                                    @Override // com.bytedance.sdk.openadsdk.ApmHelper.NOt
                                    public void ZRu(String str, String str2, Throwable th) {
                                        monitorCrashInitSDK.reportCustomErr(str, str2, th);
                                    }
                                };
                                boolean unused4 = ApmHelper.ZRu = true;
                                ApmHelper.mZ(strZRu, strYx);
                                monitorCrashInitSDK.registerCrashCallback(new ICrashCallback() { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1.3
                                    @Override // com.apm.insight.ICrashCallback
                                    public void onCrash(@NonNull CrashType crashType, @Nullable String str, @Nullable Thread thread) {
                                        if (!ApmHelper.TFq) {
                                            ApmHelper.uR(crashType.getName());
                                        }
                                        boolean unused5 = ApmHelper.TFq = true;
                                    }
                                }, CrashType.ALL);
                                ZRu zRu = ApmHelper.Mm;
                                ZRu unused5 = ApmHelper.Mm = null;
                                if (zRu != null) {
                                    ApmHelper.Ht.ZRu(zRu.ZRu, zRu.NOt, zRu.mZ);
                                }
                            } catch (Throwable unused6) {
                                boolean unused7 = ApmHelper.ZRu = false;
                            }
                        }
                    }
                    ApmHelper.NOt.set(false);
                }
            });
        }
    }

    public static boolean isIsInit() {
        return ZRu;
    }

    public static void reportCustomError(String str, String str2, Throwable th) {
        NOt nOt = Ht;
        if (nOt != null) {
            nOt.ZRu(str, str2, th);
        } else {
            Mm = new ZRu(str, str2, th);
        }
    }

    public static void reportPvFromBackGround() {
        if (uR) {
            NOt(lp.ZRu(WMI.ZRu()), WMI.uR().Yx());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void uR(final String str) {
        final qF qFVarZRu = com.bytedance.sdk.openadsdk.utils.NOt.ZRu();
        if (qFVarZRu != null) {
            String strZRu = Yx.ZRu(qFVarZRu);
            if (TextUtils.isEmpty(strZRu)) {
                return;
            }
            mZ.ZRu(System.currentTimeMillis(), qFVarZRu, strZRu, "sdk_crash_info", new com.bytedance.sdk.openadsdk.edo.mZ.ZRu() { // from class: com.bytedance.sdk.openadsdk.ApmHelper.2
                @Override // com.bytedance.sdk.openadsdk.edo.mZ.ZRu
                public JSONObject ZRu() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("type", str);
                        jSONObject2.put(G.f168511d, com.bytedance.sdk.component.utils.ZRu.ZRu(qFVarZRu.HZ()).toString());
                        jSONObject.put("ad_extra_data", jSONObject2.toString());
                    } catch (JSONException unused) {
                    }
                    return jSONObject;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void mZ(String str, String str2) {
        NOt(str, str2);
    }

    private static void NOt(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        String strA = i.a(a.f67726d, str2, "/monitor/collect/c/session?version_code=6405&device_platform=android&aid=10000001");
        WMI.mZ().ZRu(mZ(str), strA);
    }

    private static JSONObject mZ(String str) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("sdk_version", BuildConfig.VERSION_NAME);
            jSONObject3.put("host_app_id", mZ);
            jSONObject2.putOpt("custom", jSONObject3);
            jSONObject2.put("os", "Android");
            jSONObject2.put("os_version", Build.VERSION.RELEASE);
            jSONObject2.put("device_model", Build.MODEL);
            jSONObject2.put("device_brand", Build.BRAND);
            jSONObject2.put("sdk_version_name", "0.0.5");
            jSONObject2.put("aid", "10000001");
            jSONObject2.put("update_version_code", BuildConfig.VERSION_CODE);
            jSONObject2.put("bd_did", str);
            jSONObject.putOpt(j.b.a.f164784c, jSONObject2);
            jSONObject.putOpt("local_time", Long.valueOf(System.currentTimeMillis()));
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(new JSONObject().put("local_time_ms", System.currentTimeMillis()));
            jSONObject.putOpt("launch", jSONArray);
            return jSONObject;
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.lp.ZRu("ApmHelper", e10.getMessage());
            return jSONObject;
        }
    }
}
