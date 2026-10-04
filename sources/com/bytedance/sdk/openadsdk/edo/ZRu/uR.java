package com.bytedance.sdk.openadsdk.edo.ZRu;

import android.os.Build;
import android.text.TextUtils;
import androidx.preference.s;
import com.bytedance.JProtect;
import com.bytedance.sdk.component.utils.lp;
import com.bytedance.sdk.component.utils.oK;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.Vor;
import com.bytedance.sdk.openadsdk.core.WMI;
import com.bytedance.sdk.openadsdk.edo.ZRu.uR;
import com.bytedance.sdk.openadsdk.utils.Yx;
import com.google.ads.mediation.pangle.PangleConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONObject;
import s0.x;

/* JADX INFO: loaded from: classes3.dex */
public class uR<T extends uR> implements mZ {
    private String Mm;
    private String NOt;
    private String Vor;
    private String ZH;
    private String ZRu;
    private String aT;
    private String lp;
    private String mZ;
    private final String uR = BuildConfig.VERSION_NAME;
    private long TFq = System.currentTimeMillis() / 1000;
    private int Ht = 0;
    private int FA = 0;

    public static uR<uR> NOt() {
        return new uR<>();
    }

    @JProtect
    private JSONObject oK() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("os", 1);
            jSONObject.put("model", Build.MODEL);
            jSONObject.put("vendor", Build.MANUFACTURER);
            jSONObject.put("package_name", Yx.TFq());
            jSONObject.put("ua", Yx.mZ());
            jSONObject.put("gaid", com.bytedance.sdk.openadsdk.qF.ZRu.NOt.ZRu.ZRu().NOt());
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    private T yBV() {
        return this;
    }

    public long FA() {
        return this.TFq;
    }

    public String Ht() {
        return this.mZ;
    }

    public String Mm() {
        return TextUtils.isEmpty(BuildConfig.VERSION_NAME) ? "" : BuildConfig.VERSION_NAME;
    }

    public String TFq() {
        return this.NOt;
    }

    public int Vor() {
        return this.Ht;
    }

    public int ZH() {
        return this.FA;
    }

    @Override // com.bytedance.sdk.openadsdk.edo.ZRu.mZ
    @JProtect
    public JSONObject ZRu() {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("ad_sdk_version", Mm());
            jSONObject2.put("app_version", Yx.Mm());
            jSONObject2.put("timestamp", FA());
            jSONObject2.put("conn_type", oK.NOt(WMI.ZRu()));
            jSONObject2.put(PangleConstants.APP_ID, TextUtils.isEmpty(Vor.NOt().uR()) ? "" : Vor.NOt().uR());
            jSONObject2.put("device_info", oK());
            if (!TextUtils.isEmpty(mZ())) {
                jSONObject2.put("type", mZ());
            }
            jSONObject2.put("error_code", ZH());
            if (!TextUtils.isEmpty(lp())) {
                jSONObject2.put("error_msg", lp());
            }
            if (!TextUtils.isEmpty(TFq())) {
                jSONObject2.put("rit", TFq());
            }
            if (!TextUtils.isEmpty(Ht())) {
                jSONObject2.put(CampaignEx.JSON_KEY_CREATIVE_ID, Ht());
            }
            if (Vor() > 0) {
                jSONObject2.put("adtype", Vor());
            }
            if (!TextUtils.isEmpty(aT())) {
                jSONObject2.put("req_id", aT());
            }
            if (!TextUtils.isEmpty(sAl())) {
                jSONObject2.put(s.f115701h, sAl());
            }
            String strUR = uR();
            if (TextUtils.isEmpty(strUR)) {
                jSONObject = new JSONObject();
            } else {
                try {
                    jSONObject = new JSONObject(strUR);
                } catch (Exception unused) {
                    jSONObject = null;
                }
            }
            if (jSONObject != null) {
                jSONObject.put("os_version_int", Build.VERSION.SDK_INT);
                jSONObject2.put("event_extra", jSONObject.toString());
            } else if (!TextUtils.isEmpty(strUR)) {
                jSONObject2.put("event_extra", strUR);
            }
            if (!TextUtils.isEmpty(edo())) {
                jSONObject2.put(x.h.f238399b, edo());
            }
        } catch (Throwable th) {
            lp.ZRu("LogStatsBase", th.getMessage());
        }
        return jSONObject2;
    }

    public String aT() {
        return this.Mm;
    }

    public String edo() {
        return this.lp;
    }

    public String lp() {
        return this.Vor;
    }

    public String mZ() {
        return this.ZRu;
    }

    public String sAl() {
        return this.aT;
    }

    public String uR() {
        return this.ZH;
    }

    public T FA(String str) {
        this.lp = str;
        return (T) yBV();
    }

    public T Ht(String str) {
        this.Vor = str;
        return (T) yBV();
    }

    public T Mm(String str) {
        this.aT = str;
        return (T) yBV();
    }

    public T NOt(String str) {
        this.ZH = str;
        return (T) yBV();
    }

    public T TFq(String str) {
        this.Mm = str;
        return (T) yBV();
    }

    public T mZ(String str) {
        this.NOt = str;
        return (T) yBV();
    }

    public T uR(String str) {
        this.mZ = str;
        return (T) yBV();
    }

    public T NOt(int i10) {
        this.FA = i10;
        return (T) yBV();
    }

    public T ZRu(String str) {
        this.ZRu = str;
        return (T) yBV();
    }

    public T ZRu(int i10) {
        this.Ht = i10;
        return (T) yBV();
    }
}
