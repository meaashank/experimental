package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.utils.Cox;
import com.bytedance.sdk.openadsdk.utils.Yx;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class Nb implements MR {
    private static final Map<Integer, String> TFq = new HashMap<Integer, String>(12) { // from class: com.bytedance.sdk.openadsdk.core.Nb.1
        {
            put(1, "abtest");
            put(2, "user_data");
            put(3, "gaid");
            put(4, "apk-sign");
            put(5, "app_set_id_scope");
            put(6, "app_set_id");
            put(7, "installed_source");
            put(8, "app_running_time");
            put(9, "vendor");
            put(10, "model");
            put(11, "user_agent_device");
            put(12, "user_agent_webview");
            put(13, "sys_compiling_time");
            put(14, "sec_did");
            put(15, "url");
            put(16, "X-Argus");
            put(17, "X-Ladon");
            put(18, "X-Khronos");
            put(19, "X-Gorgon");
            put(20, "pangle_m");
            put(21, "screen_height");
            put(22, "screen_width");
            put(23, "rom_version");
            put(24, "carrier_name");
            put(25, "os_version");
            put(26, "conn_type");
            put(27, "boot");
            put(28, "feature_data");
        }
    };
    boolean ZRu = false;
    boolean NOt = false;
    String mZ = "com.union_test.internationad";
    String uR = "8025677";
    private int Ht = 0;

    @Override // com.bytedance.sdk.openadsdk.core.MR
    public int Ht() {
        return Vor.NOt().OCA();
    }

    @Override // com.bytedance.sdk.openadsdk.core.MR
    public int Mm() {
        return this.Ht;
    }

    @Override // com.bytedance.sdk.openadsdk.core.MR
    /* JADX INFO: renamed from: TFq, reason: merged with bridge method [inline-methods] */
    public Nb NOt(String str) {
        Vor.NOt().mZ(str);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.MR
    public MR mZ(int i10) {
        Vor.NOt().mZ(i10);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.MR
    /* JADX INFO: renamed from: uR, reason: merged with bridge method [inline-methods] */
    public Nb ZRu(String str) {
        Vor.NOt().ZRu(str);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.MR
    public MR Ht(int i10) {
        Vor.NOt().ZRu(i10);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.MR
    public MR NOt(int i10) {
        Vor.NOt().NOt(i10);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.MR
    public String TFq() {
        return mZ((String) null);
    }

    @Override // com.bytedance.sdk.openadsdk.core.MR
    public MR ZRu(int i10) {
        Vor.NOt().TFq(i10);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.MR
    public int mZ() {
        return Vor.NOt().Vor();
    }

    @Override // com.bytedance.sdk.openadsdk.core.MR
    public String uR() {
        return BuildConfig.VERSION_NAME;
    }

    @Override // com.bytedance.sdk.openadsdk.core.MR
    public int NOt() {
        return Vor.NOt().FA();
    }

    @Override // com.bytedance.sdk.openadsdk.core.MR
    public MR TFq(int i10) {
        this.Ht = i10;
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.MR
    public MR ZRu() {
        com.bytedance.sdk.component.utils.lp.ZRu("PangleSDK-6405");
        com.bykv.vk.openvk.ZRu.ZRu.ZRu.Mm.mZ.ZRu("PangleSDK-6405");
        com.bytedance.sdk.component.utils.lp.NOt();
        com.bytedance.sdk.component.Mm.ZRu.ZRu();
        com.bykv.vk.openvk.ZRu.ZRu.ZRu.Mm.mZ.ZRu();
        com.bytedance.sdk.openadsdk.utils.OCA.ZRu();
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.MR
    public String mZ(String str) {
        int size;
        Yx.aT("getBiddingToken");
        com.bytedance.sdk.openadsdk.core.Vor.mZ.ZRu();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("is_init", edo.TFq() ? 1 : 0);
            String strAT = WMI.uR().aT();
            String strOCA = WMI.uR().OCA();
            if (strAT != null && strOCA != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("version", strAT);
                jSONObject2.put("param", strOCA);
                jSONObject.put("abtest", jSONObject2);
            }
            jSONObject.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            jSONObject.put("package_name", Yx.TFq());
            jSONObject.put("user_data", OCA.ZRu(TextUtils.isEmpty(str) ? null : new AdSlot.Builder().setCodeId(str).build()));
            jSONObject.put(CampaignEx.JSON_KEY_ST_TS, System.currentTimeMillis() / 1000);
            if (jSONObject.toString().getBytes().length <= 2680) {
                com.bytedance.sdk.openadsdk.core.settings.Ht htUR = WMI.uR();
                if (htUR.Nb("gaid")) {
                    jSONObject.put("gaid", com.bytedance.sdk.openadsdk.qF.ZRu.NOt.ZRu.ZRu().NOt());
                }
                Context contextZRu = WMI.ZRu();
                jSONObject.put("apk-sign", com.bytedance.sdk.openadsdk.common.NOt.Mm());
                jSONObject.put("app_set_id_scope", com.bytedance.sdk.openadsdk.core.settings.uR.NOt());
                jSONObject.put("app_set_id", com.bytedance.sdk.openadsdk.core.settings.uR.mZ());
                jSONObject.put("installed_source", com.bytedance.sdk.openadsdk.core.settings.uR.uR());
                jSONObject.put("app_running_time", (System.currentTimeMillis() - edo.ZRu()) / 1000);
                jSONObject.put("rewardedfull_link", com.bytedance.sdk.openadsdk.core.settings.yBV.CH().cA() ? 1 : 0);
                jSONObject.put("js_render_ver", com.bytedance.sdk.openadsdk.core.FA.lp.NOt());
                jSONObject.put("js_render_v3_ver", com.bytedance.sdk.openadsdk.core.FA.lp.mZ());
                jSONObject.put("vendor", Build.MANUFACTURER);
                jSONObject.put("model", Build.MODEL);
                jSONObject.put("user_agent_device", Yx.NOt());
                jSONObject.put("user_agent_webview", Yx.mZ());
                jSONObject.put("sys_compiling_time", lp.NOt(contextZRu));
                jSONObject.put("screen_height", Cox.uR(contextZRu));
                jSONObject.put("screen_width", Cox.mZ(contextZRu));
                jSONObject.put("rom_version", com.bytedance.sdk.openadsdk.utils.ru.ZRu());
                jSONObject.put("carrier_name", com.bytedance.sdk.openadsdk.utils.MR.ZRu());
                jSONObject.put("os_version", Build.VERSION.RELEASE);
                jSONObject.put("conn_type", Yx.lp(contextZRu));
                if (htUR.Nb("boot")) {
                    jSONObject.put("boot", String.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()));
                }
                Yx.ZRu(jSONObject);
                com.bytedance.sdk.openadsdk.core.Vor.mZ.ZRu(jSONObject);
                size = TFq.size();
            } else {
                size = 2;
            }
            while (size > 0 && jSONObject.toString().getBytes().length > 2680) {
                jSONObject.remove(TFq.get(Integer.valueOf(size)));
                size--;
            }
            com.bytedance.sdk.openadsdk.Ht.NOt.ZRu().ZRu(jSONObject);
            boolean z10 = com.bytedance.sdk.openadsdk.core.settings.yBV.kkl() && com.bytedance.sdk.openadsdk.core.settings.yBV.CH().ZRu(PangleEncryptConstant.CryptDataScene.BIDDING_TOKEN);
            JSONObject jSONObjectZRu = ZRu(jSONObject, z10);
            while (size > 0 && jSONObjectZRu.toString().getBytes().length > 4096) {
                jSONObject.remove(TFq.get(Integer.valueOf(size)));
                jSONObjectZRu = ZRu(jSONObject, z10);
                size--;
            }
            if (com.bytedance.sdk.component.utils.lp.uR()) {
                Objects.toString(jSONObjectZRu);
                int length = jSONObjectZRu.toString().getBytes().length;
            }
            Objects.toString(jSONObjectZRu);
            return jSONObjectZRu.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.MR
    public MR uR(int i10) {
        Vor.NOt().Ht(i10);
        return this;
    }

    private JSONObject ZRu(JSONObject jSONObject, boolean z10) {
        JSONObject jSONObjectZRu;
        if (z10) {
            jSONObjectZRu = PangleEncryptManager.encryptType4(jSONObject, new to(PangleEncryptConstant.CryptDataScene.BIDDING_TOKEN));
            xY.ZRu(jSONObjectZRu);
        } else {
            jSONObjectZRu = com.bytedance.sdk.component.utils.ZRu.ZRu(jSONObject);
        }
        return jSONObjectZRu != null ? jSONObjectZRu : new JSONObject();
    }

    @Override // com.bytedance.sdk.openadsdk.core.MR
    public boolean ZRu(String str, int i10, String str2, String str3, String str4) {
        if (!this.mZ.equals(WMI.ZRu().getPackageName()) || !this.uR.equals(Vor.NOt().uR()) || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Method methodZRu = com.bytedance.sdk.component.utils.Zf.ZRu("com.bytedance.sdk.openadsdk.TTC3Proxy", "verityPlayable", String.class, Integer.TYPE, String.class, String.class, String.class);
            if (methodZRu != null) {
                methodZRu.invoke(null, str, Integer.valueOf(i10), str2, str3, str4);
            }
        } catch (Throwable unused) {
        }
        return true;
    }
}
