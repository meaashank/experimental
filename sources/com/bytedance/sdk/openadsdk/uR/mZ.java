package com.bytedance.sdk.openadsdk.uR;

import Y6.d;
import android.app.Application;
import android.text.TextUtils;
import android.util.Log;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.Zf;
import com.bytedance.sdk.openadsdk.core.lp.NOt.mZ;
import com.bytedance.sdk.openadsdk.core.model.qF;
import com.bytedance.sdk.openadsdk.core.model.xY;
import com.bytedance.sdk.openadsdk.uR.NOt;
import com.bytedance.sdk.openadsdk.uR.ZRu;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.OCA;
import com.bytedance.sdk.openadsdk.utils.WD;
import com.bytedance.sdk.openadsdk.utils.Yx;
import com.bytedance.sdk.openadsdk.utils.fWk;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.pgl.ssdk.ces.out.DungeonFlag;
import com.prism.gaia.server.accounts.b;
import com.tonyodev.fetch2core.server.FileResponse;
import e.g0;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s0.x;
import u4.g;

/* JADX INFO: loaded from: classes3.dex */
public class mZ {
    public static void NOt(qF qFVar, String str, final long j10) {
        if (qFVar != null && j10 > 0 && j10 < 200000) {
            ZRu(System.currentTimeMillis(), qFVar, str, "video_click_duration", new com.bytedance.sdk.openadsdk.edo.mZ.ZRu() { // from class: com.bytedance.sdk.openadsdk.uR.mZ.3
                @Override // com.bytedance.sdk.openadsdk.edo.mZ.ZRu
                public JSONObject ZRu() {
                    JSONObject jSONObject = new JSONObject();
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject.put("video_click_duration_time", j10);
                        jSONObject2.put("ad_extra_data", jSONObject.toString());
                    } catch (Throwable unused) {
                    }
                    return jSONObject2;
                }
            });
        }
    }

    public static void TFq(qF qFVar, final com.bytedance.sdk.openadsdk.edo.ZRu.ZRu zRu, final String str) {
        ZRu(System.currentTimeMillis(), qFVar, str, "web_behavior_click", new com.bytedance.sdk.openadsdk.edo.mZ.ZRu() { // from class: com.bytedance.sdk.openadsdk.uR.mZ.29
            @Override // com.bytedance.sdk.openadsdk.edo.mZ.ZRu
            public JSONObject ZRu() {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("arbi_current_url", zRu.mZ());
                    jSONObject2.put("current_url_index", zRu.uR());
                    jSONObject2.put("arbi_start_x", zRu.TFq());
                    jSONObject2.put("arbi_start_y", zRu.Ht());
                    jSONObject2.put("click_duration", zRu.Mm());
                    jSONObject2.put("is_trigger_jump", zRu.FA());
                    jSONObject2.put("click_type", String.valueOf(zRu.om()));
                    if (zRu.ZRu() != -1) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("hit_type", zRu.ZRu());
                        jSONObject3.put("hit_extra", zRu.NOt());
                        jSONObject2.put("pag_json_data", jSONObject3.toString());
                    }
                    jSONObject.put("ad_extra_data", jSONObject2.toString());
                } catch (Throwable th) {
                    OCA.NOt("TTAD.AdEvent", "onWebBehaviorClick", th.getMessage());
                }
                return jSONObject;
            }
        });
    }

    @g0
    public static void ZRu() {
        try {
            Class.forName(mZ.class.getName());
        } catch (ClassNotFoundException unused) {
        }
    }

    public static void mZ(qF qFVar, String str, final int i10) {
        ZRu(System.currentTimeMillis(), qFVar, str, "check_meta_more", new com.bytedance.sdk.openadsdk.edo.mZ.ZRu() { // from class: com.bytedance.sdk.openadsdk.uR.mZ.7
            @Override // com.bytedance.sdk.openadsdk.edo.mZ.ZRu
            public JSONObject ZRu() {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject.put("error_code", i10);
                    jSONObject.put("check_url", com.bytedance.sdk.openadsdk.core.settings.yBV.CH().wcb());
                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                    return jSONObject2;
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.lp.NOt(th.toString());
                    return jSONObject2;
                }
            }
        });
    }

    @DungeonFlag
    private static void uR(final qF qFVar, final String str, final String str2, final JSONObject jSONObject) {
        if (qFVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (qFVar.mg() && "show".equals(str)) {
            return;
        }
        if ("show".equals(str)) {
            qFVar.FA(true);
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        ZRu(new com.bytedance.sdk.component.FA.FA("onShow") { // from class: com.bytedance.sdk.openadsdk.uR.mZ.47
            @Override // java.lang.Runnable
            public void run() {
                final String strZRu;
                if (com.bytedance.sdk.openadsdk.core.WMI.uR().Wo()) {
                    strZRu = com.bytedance.sdk.openadsdk.core.Vor.ZRu.ZRu.ZRu((Application) com.bytedance.sdk.openadsdk.core.WMI.ZRu()).ZRu(str2, DeviceUtils.ZRu(), qFVar.GE());
                } else {
                    strZRu = "none";
                }
                mZ.ZRu(jCurrentTimeMillis, qFVar, str2, str, new com.bytedance.sdk.openadsdk.edo.mZ.ZRu() { // from class: com.bytedance.sdk.openadsdk.uR.mZ.47.1
                    @Override // com.bytedance.sdk.openadsdk.edo.mZ.ZRu
                    public JSONObject ZRu() {
                        Object obj;
                        try {
                            Zf.NOt(qFVar);
                            JSONObject jSONObject2 = new JSONObject();
                            try {
                                AnonymousClass47 anonymousClass47 = AnonymousClass47.this;
                                JSONObject jSONObject3 = jSONObject;
                                if (jSONObject3 != null) {
                                    jSONObject3.put("interaction_method", qFVar.WMI());
                                    AnonymousClass47 anonymousClass472 = AnonymousClass47.this;
                                    jSONObject.put("real_interaction_method", qFVar.yBV());
                                    jSONObject.put("video_skip_result", com.bytedance.sdk.openadsdk.core.WMI.uR().sAl(String.valueOf(qFVar.GE())));
                                    jSONObject.put("au_show", strZRu);
                                    AnonymousClass47 anonymousClass473 = AnonymousClass47.this;
                                    com.bytedance.sdk.openadsdk.om.ZRu.ZRu.ZRu(qFVar, jSONObject);
                                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                                } else {
                                    JSONObject jSONObject4 = new JSONObject();
                                    jSONObject4.put("interaction_method", qFVar.WMI());
                                    jSONObject4.put("real_interaction_method", qFVar.yBV());
                                    jSONObject4.put("video_skip_result", com.bytedance.sdk.openadsdk.core.WMI.uR().sAl(String.valueOf(qFVar.GE())));
                                    jSONObject4.put("au_show", strZRu);
                                    com.bytedance.sdk.openadsdk.om.ZRu.ZRu.ZRu(qFVar, jSONObject4);
                                    jSONObject2.put("ad_extra_data", jSONObject4.toString());
                                }
                                jSONObject2.putOpt("log_extra", qFVar.Wo());
                                float fFloatValue = Double.valueOf((System.currentTimeMillis() / 1000) - qFVar.eCS()).floatValue();
                                if (fFloatValue <= 0.0f) {
                                    fFloatValue = 0.0f;
                                }
                                jSONObject2.putOpt("show_time", Float.valueOf(fFloatValue));
                                jSONObject2.putOpt("ua_policy", Integer.valueOf(qFVar.gI()));
                                String strFcs = qFVar.fcs();
                                if (!TextUtils.isEmpty(strFcs) && !TextUtils.isEmpty(strFcs)) {
                                    try {
                                        jSONObject2.put("ttdsp_price", Math.round(Float.parseFloat(strFcs) * 100000.0f));
                                    } catch (Throwable th) {
                                        jSONObject2.put("ttdsp_price", 0);
                                        com.bytedance.sdk.component.utils.lp.ZRu("TTAD.AdEvent", th.getMessage());
                                    }
                                }
                                if (qFVar.zkn() == null) {
                                    return jSONObject2;
                                }
                                try {
                                    Object obj2 = qFVar.zkn().get(TTAdConstant.SDK_BIDDING_TYPE);
                                    if (obj2 == null || Integer.parseInt(obj2.toString()) != 2 || (obj = qFVar.zkn().get("price")) == null) {
                                        return jSONObject2;
                                    }
                                    jSONObject2.put("ttdsp_price", Math.round(Double.parseDouble(obj.toString()) * 100000.0d));
                                    return jSONObject2;
                                } catch (Throwable th2) {
                                    com.bytedance.sdk.component.utils.lp.ZRu("TTAD.AdEvent", "client bidding price error: ", th2);
                                    return jSONObject2;
                                }
                            } catch (Exception unused) {
                                return jSONObject2;
                            }
                        } catch (Exception unused2) {
                            return null;
                        }
                    }
                });
                if ("show".equals(str)) {
                    if (!qFVar.CH()) {
                        if (qFVar.ACq()) {
                            com.bytedance.sdk.openadsdk.core.lp.NOt.mZ.ZRu(qFVar.gmt(), new mZ.NOt("show_urls", qFVar));
                        } else {
                            mZ.ZRu(qFVar);
                        }
                    }
                    JSONObject jSONObject2 = jSONObject;
                    if (jSONObject2 != null) {
                        int iOptInt = jSONObject2.optInt("dynamic_show_type");
                        if (qFVar.zp() == 1 && (iOptInt == 7 || iOptInt == 10)) {
                            com.bytedance.sdk.component.utils.Mm.ZRu().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.uR.mZ.47.2
                                @Override // java.lang.Runnable
                                public void run() {
                                    JSONObject jSONObject3 = new JSONObject();
                                    try {
                                        jSONObject3.put("auto_click", true);
                                        AnonymousClass47 anonymousClass47 = AnonymousClass47.this;
                                        mZ.NOt(qFVar, str2, "click", jSONObject3);
                                    } catch (Exception unused) {
                                        com.bytedance.sdk.component.utils.lp.ZRu("TTAD.AdEvent", "ugen click exception");
                                    }
                                }
                            }, com.bytedance.sdk.openadsdk.core.settings.yBV.CH().Pzo());
                        }
                    }
                    com.bytedance.sdk.openadsdk.core.Vor.mZ.ZRu(qFVar, strZRu);
                }
            }
        });
    }

    public static void NOt(qF qFVar, String str, final int i10) {
        ZRu(System.currentTimeMillis(), qFVar, str, "check_meta", new com.bytedance.sdk.openadsdk.edo.mZ.ZRu() { // from class: com.bytedance.sdk.openadsdk.uR.mZ.6
            @Override // com.bytedance.sdk.openadsdk.edo.mZ.ZRu
            public JSONObject ZRu() {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject.put("error_code", i10);
                    jSONObject.put("check_url", com.bytedance.sdk.openadsdk.core.settings.yBV.CH().wcb());
                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                    return jSONObject2;
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.lp.NOt(th.toString());
                    return jSONObject2;
                }
            }
        });
    }

    public static void TFq(qF qFVar, String str, JSONObject jSONObject) {
        uR(qFVar, "activity_recreate", str, jSONObject);
    }

    public static void ZRu(qF qFVar, String str, final int i10) {
        ZRu(System.currentTimeMillis(), qFVar, str, "open_url_h5", new com.bytedance.sdk.openadsdk.edo.mZ.ZRu() { // from class: com.bytedance.sdk.openadsdk.uR.mZ.1
            @Override // com.bytedance.sdk.openadsdk.edo.mZ.ZRu
            public JSONObject ZRu() {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.putOpt("render_type", "h5");
                    jSONObject2.putOpt("render_type_2", 0);
                    jSONObject2.putOpt("preload_status", Integer.valueOf(i10));
                    jSONObject.putOpt("ad_extra_data", jSONObject2.toString());
                } catch (Exception unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void mZ(final qF qFVar, String str) {
        if (qFVar == null || !qF.mZ(qFVar) || qFVar.Gg() == null) {
            return;
        }
        ZRu(System.currentTimeMillis(), qFVar, str, CampaignEx.JSON_NATIVE_VIDEO_ENDCARD_SHOW, new com.bytedance.sdk.openadsdk.edo.mZ.ZRu() { // from class: com.bytedance.sdk.openadsdk.uR.mZ.24
            @Override // com.bytedance.sdk.openadsdk.edo.mZ.ZRu
            public JSONObject ZRu() {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.putOpt("url", qFVar.Gg().mZ());
                    jSONObject2.putOpt("id", qFVar.Gg().ZRu());
                    jSONObject2.putOpt(FileResponse.FIELD_MD5, qFVar.Gg().NOt());
                    if (qFVar.Qg() != null) {
                        jSONObject2.putOpt("render_type", Integer.valueOf(qFVar.Qg().uR()));
                    }
                    jSONObject.put("ad_extra_data", jSONObject2.toString());
                } catch (Exception unused) {
                }
                return jSONObject;
            }
        });
    }

    public static class ZRu {
        public static void ZRu(String str, final JSONObject jSONObject, qF qFVar) {
            String strZRu = Yx.ZRu(qFVar);
            if (strZRu == null) {
                return;
            }
            mZ.ZRu(System.currentTimeMillis(), qFVar, strZRu.concat("_landingpage"), str, new com.bytedance.sdk.openadsdk.edo.mZ.ZRu() { // from class: com.bytedance.sdk.openadsdk.uR.mZ.ZRu.1
                @Override // com.bytedance.sdk.openadsdk.edo.mZ.ZRu
                public JSONObject ZRu() {
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("ad_extra_data", jSONObject.toString());
                        return jSONObject2;
                    } catch (Throwable th) {
                        Log.d("TTAD.AdEvent", "Gecko.loadEvent error", th);
                        return jSONObject2;
                    }
                }
            });
        }

        public static void ZRu(final int i10, final int i11, qF qFVar) {
            String strZRu = Yx.ZRu(qFVar);
            if (strZRu == null) {
                return;
            }
            mZ.ZRu(System.currentTimeMillis(), qFVar, strZRu.concat("_landingpage"), "local_res_hit_rate", new com.bytedance.sdk.openadsdk.edo.mZ.ZRu() { // from class: com.bytedance.sdk.openadsdk.uR.mZ.ZRu.2
                @Override // com.bytedance.sdk.openadsdk.edo.mZ.ZRu
                public JSONObject ZRu() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("all_times", i11);
                        jSONObject2.put("hit_times", i10);
                        jSONObject.put("ad_extra_data", jSONObject2.toString());
                        return jSONObject;
                    } catch (Throwable th) {
                        Log.d("TTAD.AdEvent", "Gecko.localResHitRate error", th);
                        return jSONObject;
                    }
                }
            });
        }

        public static void ZRu(final long j10, final qF qFVar, String str, final ILoader iLoader, final String str2) {
            if (str == null) {
                return;
            }
            mZ.ZRu(System.currentTimeMillis(), qFVar, str, "landingpage_init", new com.bytedance.sdk.openadsdk.edo.mZ.ZRu() { // from class: com.bytedance.sdk.openadsdk.uR.mZ.ZRu.3
                @Override // com.bytedance.sdk.openadsdk.edo.mZ.ZRu
                public JSONObject ZRu() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        int iZRu = com.bytedance.sdk.openadsdk.Mm.NOt.ZRu().ZRu(iLoader, str2);
                        JSONObject jSONObject2 = new JSONObject();
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put(qF.mZ, qFVar.NBW() ? 1 : 0);
                        jSONObject2.put("pag_json_data", jSONObject3.toString());
                        jSONObject2.put("url", qFVar.Gis());
                        jSONObject2.put("channel_name", qFVar.CXy());
                        jSONObject2.put("interceptor_status", (TextUtils.isEmpty(qFVar.CXy()) || iZRu <= 0) ? 0 : 1);
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put("resource_count", iZRu);
                        jSONObject2.put("resource_info", jSONObject4);
                        jSONObject.put("ad_extra_data", jSONObject2.toString());
                        jSONObject.put(x.h.f238399b, j10);
                        return jSONObject;
                    } catch (Throwable th) {
                        Log.d("TTAD.AdEvent", "Gecko.localResHitRate error", th);
                        return jSONObject;
                    }
                }
            });
        }

        public static void ZRu(final int i10, final int i11, final int i12, final int i13, final qF qFVar, String str, final int i14) {
            if (str == null || TextUtils.isEmpty(qFVar.CXy())) {
                return;
            }
            mZ.ZRu(System.currentTimeMillis(), qFVar, str, "landing_page_resource_detail", new com.bytedance.sdk.openadsdk.edo.mZ.ZRu() { // from class: com.bytedance.sdk.openadsdk.uR.mZ.ZRu.4
                @Override // com.bytedance.sdk.openadsdk.edo.mZ.ZRu
                public JSONObject ZRu() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("next_url", qFVar.Gis());
                        jSONObject2.put("channel_name", qFVar.CXy());
                        jSONObject2.put("preload_status", i10 <= 0 ? 0 : 2);
                        jSONObject2.put("first_page", i14);
                        jSONObject2.put("preload_h5_type", qFVar.EZN());
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("channel_response", i10);
                        jSONObject3.put("failResourceCount", i11);
                        jSONObject3.put("successCount", i12);
                        jSONObject3.put("failCount", i13);
                        jSONObject2.put("resource_info", jSONObject3);
                        jSONObject.put("ad_extra_data", jSONObject2.toString());
                        return jSONObject;
                    } catch (Throwable th) {
                        Log.d("TTAD.AdEvent", "Gecko.localResHitRate error", th);
                        return jSONObject;
                    }
                }
            });
        }
    }

    public static void NOt(final qF qFVar, String str) {
        ZRu(System.currentTimeMillis(), qFVar, str, "picture_click", new com.bytedance.sdk.openadsdk.edo.mZ.ZRu() { // from class: com.bytedance.sdk.openadsdk.uR.mZ.12
            @Override // com.bytedance.sdk.openadsdk.edo.mZ.ZRu
            public JSONObject ZRu() {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject.put("ad_slot_type", qFVar.WD().getNativeAdType());
                    jSONObject.put("interaction_method", qFVar.WMI());
                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                    return jSONObject2;
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.lp.NOt(th.toString());
                    return jSONObject2;
                }
            }
        });
    }

    public static void ZRu(final qF qFVar, String str) {
        ZRu(System.currentTimeMillis(), qFVar, str, "endcard_load_start", new com.bytedance.sdk.openadsdk.edo.mZ.ZRu() { // from class: com.bytedance.sdk.openadsdk.uR.mZ.11
            @Override // com.bytedance.sdk.openadsdk.edo.mZ.ZRu
            public JSONObject ZRu() {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    if (qF.mZ(qFVar)) {
                        if (qFVar.Gg() != null) {
                            jSONObject2.putOpt("url", qFVar.Gg().mZ());
                            jSONObject2.putOpt("id", qFVar.Gg().ZRu());
                            jSONObject2.putOpt(FileResponse.FIELD_MD5, qFVar.Gg().NOt());
                        }
                        if (qFVar.Qg() != null) {
                            jSONObject2.putOpt("render_type", 7);
                        }
                    } else {
                        jSONObject2.putOpt("url", qFVar.Qg().lp());
                        jSONObject2.putOpt("style_id", qFVar.XyE());
                        if (qFVar.Qg() != null) {
                            jSONObject2.putOpt("render_type", 0);
                        }
                    }
                    jSONObject.putOpt("ad_extra_data", jSONObject2.toString());
                    return jSONObject;
                } catch (Exception e10) {
                    com.bytedance.sdk.component.utils.lp.NOt(e10.getMessage());
                    return jSONObject;
                }
            }
        });
    }

    public static void NOt(qF qFVar, String str, String str2, final JSONObject jSONObject) {
        ZRu(System.currentTimeMillis(), qFVar, str, str2, new com.bytedance.sdk.openadsdk.edo.mZ.ZRu() { // from class: com.bytedance.sdk.openadsdk.uR.mZ.17
            @Override // com.bytedance.sdk.openadsdk.edo.mZ.ZRu
            public JSONObject ZRu() {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    JSONObject jSONObject3 = jSONObject;
                    if (jSONObject3 != null) {
                        jSONObject2.put("ad_extra_data", jSONObject3.toString());
                    }
                } catch (Exception unused) {
                }
                return jSONObject2;
            }
        });
    }

    public static void ZRu(final qF qFVar, String str, final long j10) {
        ZRu(System.currentTimeMillis(), qFVar, str, "endcard_load_finish", new com.bytedance.sdk.openadsdk.edo.mZ.ZRu() { // from class: com.bytedance.sdk.openadsdk.uR.mZ.22
            @Override // com.bytedance.sdk.openadsdk.edo.mZ.ZRu
            public JSONObject ZRu() {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    if (qF.mZ(qFVar)) {
                        if (qFVar.Gg() != null) {
                            jSONObject2.putOpt("url", qFVar.Gg().mZ());
                            jSONObject2.putOpt("id", qFVar.Gg().ZRu());
                            jSONObject2.putOpt(FileResponse.FIELD_MD5, qFVar.Gg().NOt());
                        }
                        if (qFVar.Qg() != null) {
                            jSONObject2.putOpt("render_type", 7);
                        }
                    } else {
                        jSONObject2.putOpt("url", qFVar.Qg().lp());
                        jSONObject2.putOpt("style_id", qFVar.XyE());
                        if (qFVar.Qg() != null) {
                            jSONObject2.putOpt("render_type", 0);
                        }
                    }
                    jSONObject.putOpt("ad_extra_data", jSONObject2.toString());
                    jSONObject.put(x.h.f238399b, j10);
                    return jSONObject;
                } catch (Exception e10) {
                    com.bytedance.sdk.component.utils.lp.NOt(e10.getMessage());
                    return jSONObject;
                }
            }
        });
    }

    public static void mZ(qF qFVar, final com.bytedance.sdk.openadsdk.edo.ZRu.ZRu zRu, final String str) {
        ZRu(System.currentTimeMillis(), qFVar, str, "web_behavior_stay", new com.bytedance.sdk.openadsdk.edo.mZ.ZRu() { // from class: com.bytedance.sdk.openadsdk.uR.mZ.27
            @Override // com.bytedance.sdk.openadsdk.edo.mZ.ZRu
            public JSONObject ZRu() {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("arbi_current_url", zRu.mZ());
                    jSONObject2.put("current_url_index", zRu.uR());
                    jSONObject2.put("arbi_stay_duration", zRu.edo());
                    jSONObject2.put("browsing_percentage", zRu.oK());
                    jSONObject2.put("out_focus_scene", zRu.yBV());
                    jSONObject.put("ad_extra_data", jSONObject2.toString());
                } catch (Throwable th) {
                    OCA.NOt("TTAD.AdEvent", "onWebBehaviorStay", th.getMessage());
                }
                return jSONObject;
            }
        });
    }

    public static void NOt(final long j10, final qF qFVar, String str, final String str2) {
        ZRu(System.currentTimeMillis(), qFVar, str, "endcard_feeling_duraion", new com.bytedance.sdk.openadsdk.edo.mZ.ZRu() { // from class: com.bytedance.sdk.openadsdk.uR.mZ.23
            @Override // com.bytedance.sdk.openadsdk.edo.mZ.ZRu
            public JSONObject ZRu() {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject.put(x.h.f238399b, j10);
                    if (qF.mZ(qFVar)) {
                        if (qFVar.Gg() != null) {
                            jSONObject2.putOpt("url", qFVar.Gg().mZ());
                            jSONObject2.putOpt("id", qFVar.Gg().ZRu());
                            jSONObject2.putOpt(FileResponse.FIELD_MD5, qFVar.Gg().NOt());
                        }
                        jSONObject2.putOpt(x.h.f238400c, str2);
                        if (qFVar.Qg() != null) {
                            jSONObject2.putOpt("render_type", 7);
                        }
                    } else {
                        jSONObject2.put("url", qFVar.Qg().lp());
                        jSONObject2.put("style_id", qFVar.XyE());
                        if (qFVar.Qg() != null) {
                            jSONObject2.putOpt("render_type", 0);
                        }
                    }
                    jSONObject.put("ad_extra_data", jSONObject2.toString());
                    return jSONObject;
                } catch (Exception e10) {
                    com.bytedance.sdk.component.utils.lp.NOt(e10.getMessage());
                    return jSONObject;
                }
            }
        });
    }

    public static void ZRu(final qF qFVar, String str, final long j10, final int i10, final String str2, final String str3) {
        ZRu(System.currentTimeMillis(), qFVar, str, "endcard_load_fail", new com.bytedance.sdk.openadsdk.edo.mZ.ZRu() { // from class: com.bytedance.sdk.openadsdk.uR.mZ.33
            @Override // com.bytedance.sdk.openadsdk.edo.mZ.ZRu
            public JSONObject ZRu() {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    if (qF.mZ(qFVar)) {
                        if (qFVar.Gg() != null) {
                            jSONObject2.putOpt("url", qFVar.Gg().mZ());
                            jSONObject2.putOpt("id", qFVar.Gg().ZRu());
                            jSONObject2.putOpt(FileResponse.FIELD_MD5, qFVar.Gg().NOt());
                        }
                        if (qFVar.Qg() != null) {
                            jSONObject2.putOpt("render_type", 7);
                        }
                    } else {
                        jSONObject2.putOpt("url", qFVar.Qg().lp());
                        jSONObject2.putOpt("style_id", qFVar.XyE());
                        if (!TextUtils.isEmpty(str3)) {
                            jSONObject2.putOpt("error_url", str3);
                        }
                        if (qFVar.Qg() != null) {
                            jSONObject2.putOpt("render_type", 0);
                        }
                    }
                    jSONObject2.put("error_code", i10);
                    jSONObject2.put("error_msg", str2);
                    jSONObject.putOpt("ad_extra_data", jSONObject2.toString());
                    jSONObject.put(x.h.f238399b, j10);
                    return jSONObject;
                } catch (Exception e10) {
                    com.bytedance.sdk.component.utils.lp.NOt(e10.getMessage());
                    return jSONObject;
                }
            }
        });
    }

    public static void mZ(qF qFVar, final String str, final String str2, final JSONObject jSONObject) {
        if (qFVar == null || jSONObject == null) {
            return;
        }
        ZRu(System.currentTimeMillis(), qFVar, str, str2, new com.bytedance.sdk.openadsdk.edo.mZ.ZRu() { // from class: com.bytedance.sdk.openadsdk.uR.mZ.35
            @Override // com.bytedance.sdk.openadsdk.edo.mZ.ZRu
            public JSONObject ZRu() {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                } catch (JSONException unused) {
                }
                return jSONObject2;
            }
        });
    }

    public static void NOt(qF qFVar, final com.bytedance.sdk.openadsdk.edo.ZRu.ZRu zRu, final String str) {
        ZRu(System.currentTimeMillis(), qFVar, str, "web_behavior_load", new com.bytedance.sdk.openadsdk.edo.mZ.ZRu() { // from class: com.bytedance.sdk.openadsdk.uR.mZ.26
            @Override // com.bytedance.sdk.openadsdk.edo.mZ.ZRu
            public JSONObject ZRu() {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("arbi_current_url", zRu.mZ());
                    jSONObject2.put("current_url_index", zRu.uR());
                    jSONObject2.put("arbi_load_duration", zRu.qF());
                    jSONObject.put("ad_extra_data", jSONObject2.toString());
                } catch (Throwable th) {
                    OCA.NOt("TTAD.AdEvent", "onWebBehaviorLoad", th.getMessage());
                }
                return jSONObject;
            }
        });
    }

    public static void ZRu(final qF qFVar, String str, final long j10, final int i10, final int i11) {
        ZRu(System.currentTimeMillis(), qFVar, str, "load", new com.bytedance.sdk.openadsdk.edo.mZ.ZRu() { // from class: com.bytedance.sdk.openadsdk.uR.mZ.44
            @Override // com.bytedance.sdk.openadsdk.edo.mZ.ZRu
            public JSONObject ZRu() {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.putOpt("render_type", "h5");
                    jSONObject2.putOpt("render_type_2", 0);
                    jSONObject2.putOpt("interaction_method", Integer.valueOf(qFVar.WMI()));
                    jSONObject2.put("first_page", i11);
                    jSONObject2.put("preload_h5_type", qFVar.EZN());
                    int i12 = i10;
                    if (i12 >= 0) {
                        jSONObject2.putOpt("preload_status", Integer.valueOf(i12));
                    }
                    jSONObject.putOpt("ad_extra_data", jSONObject2.toString());
                    jSONObject.put(x.h.f238399b, Math.min(j10, 600000L));
                } catch (Exception unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void mZ(qF qFVar, final String str, final JSONObject jSONObject) {
        ZRu(System.currentTimeMillis(), qFVar, str, NOt.Ht, new com.bytedance.sdk.openadsdk.edo.mZ.ZRu() { // from class: com.bytedance.sdk.openadsdk.uR.mZ.37
            @Override // com.bytedance.sdk.openadsdk.edo.mZ.ZRu
            public JSONObject ZRu() {
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("pag_json_data", jSONObject);
                    jSONObject2.put("ad_extra_data", jSONObject3);
                } catch (JSONException unused) {
                }
                String str2 = NOt.Ht;
                return jSONObject2;
            }
        });
    }

    public static void uR(qF qFVar, final com.bytedance.sdk.openadsdk.edo.ZRu.ZRu zRu, final String str) {
        ZRu(System.currentTimeMillis(), qFVar, str, "web_behavior_scroll", new com.bytedance.sdk.openadsdk.edo.mZ.ZRu() { // from class: com.bytedance.sdk.openadsdk.uR.mZ.28
            @Override // com.bytedance.sdk.openadsdk.edo.mZ.ZRu
            public JSONObject ZRu() {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("arbi_current_url", zRu.mZ());
                    jSONObject2.put("current_url_index", zRu.uR());
                    jSONObject2.put("trigger_scroll_x", zRu.Vor());
                    jSONObject2.put("trigger_scroll_y", zRu.aT());
                    jSONObject2.put("arbi_offset_y", zRu.ZH());
                    jSONObject2.put("scroll_type", zRu.lp());
                    jSONObject2.put("scroll_duration", zRu.sAl());
                    jSONObject.put("ad_extra_data", jSONObject2.toString());
                } catch (Throwable th) {
                    OCA.NOt("TTAD.AdEvent", "onWebBehaviorScroll", th.getMessage());
                }
                return jSONObject;
            }
        });
    }

    public static void NOt(qF qFVar, String str, String str2, final JSONObject jSONObject, final long j10) {
        if (qFVar == null || jSONObject == null) {
            return;
        }
        ZRu(System.currentTimeMillis(), qFVar, str, str2, new com.bytedance.sdk.openadsdk.edo.mZ.ZRu() { // from class: com.bytedance.sdk.openadsdk.uR.mZ.34
            @Override // com.bytedance.sdk.openadsdk.edo.mZ.ZRu
            public JSONObject ZRu() {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                    jSONObject2.put(x.h.f238399b, j10);
                } catch (Throwable unused) {
                }
                return jSONObject2;
            }
        });
    }

    public static void ZRu(String str, qF qFVar, String str2, final Map<String, Object> map) {
        ZRu(System.currentTimeMillis(), qFVar, str2, str, new com.bytedance.sdk.openadsdk.edo.mZ.ZRu() { // from class: com.bytedance.sdk.openadsdk.uR.mZ.45
            @Override // com.bytedance.sdk.openadsdk.edo.mZ.ZRu
            public JSONObject ZRu() {
                JSONObject jSONObject = new JSONObject();
                try {
                    if (map != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        for (Map.Entry entry : map.entrySet()) {
                            jSONObject2.put((String) entry.getKey(), entry.getValue());
                        }
                        jSONObject.put("ad_extra_data", jSONObject2.toString());
                    }
                } catch (Exception unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void uR(qF qFVar, String str, JSONObject jSONObject) {
        if (qFVar == null) {
            return;
        }
        ZRu(qFVar, str, -1L, jSONObject);
    }

    public static void NOt(qF qFVar, final String str, final JSONObject jSONObject) {
        ZRu(System.currentTimeMillis(), qFVar, str, NOt.TFq, new com.bytedance.sdk.openadsdk.edo.mZ.ZRu() { // from class: com.bytedance.sdk.openadsdk.uR.mZ.36
            @Override // com.bytedance.sdk.openadsdk.edo.mZ.ZRu
            public JSONObject ZRu() {
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("pag_json_data", jSONObject);
                    jSONObject2.put("ad_extra_data", jSONObject3);
                } catch (JSONException unused) {
                }
                String str2 = NOt.TFq;
                return jSONObject2;
            }
        });
    }

    public static void ZRu(long j10, qF qFVar, String str, String str2, final JSONObject jSONObject, Mm mm, com.bytedance.sdk.openadsdk.uR.NOt.ZRu zRu) {
        ZRu(j10, qFVar, str, str2, new com.bytedance.sdk.openadsdk.edo.mZ.ZRu() { // from class: com.bytedance.sdk.openadsdk.uR.mZ.46
            @Override // com.bytedance.sdk.openadsdk.edo.mZ.ZRu
            public JSONObject ZRu() {
                return jSONObject;
            }
        });
    }

    public static void NOt(qF qFVar, String str, int i10, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("type", i10);
        } catch (JSONException unused) {
        }
        NOt(qFVar, str, "download_app_ad_track", jSONObject);
    }

    @DungeonFlag
    public static void ZRu(qF qFVar, String str, JSONObject jSONObject) {
        uR(qFVar, "show", str, jSONObject);
    }

    public static void ZRu(qF qFVar) {
        if (TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.lp.ZRu(com.bytedance.sdk.openadsdk.core.WMI.ZRu()))) {
            return;
        }
        com.bytedance.sdk.openadsdk.uR.ZRu.uR.ZRu(com.bytedance.sdk.openadsdk.Zf.ZRu.ZRu(qFVar.gmt(), true), 1, qFVar.vE());
    }

    @DungeonFlag
    public static void ZRu(final String str, final qF qFVar, final String str2, final Mm mm) {
        if (qFVar == null || mm == null || !mm.ZRu()) {
            return;
        }
        ZRu(System.currentTimeMillis(), qFVar, str2, "ad_show_time", new com.bytedance.sdk.openadsdk.edo.mZ.ZRu() { // from class: com.bytedance.sdk.openadsdk.uR.mZ.48
            @Override // com.bytedance.sdk.openadsdk.edo.mZ.ZRu
            public JSONObject ZRu() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(x.h.f238399b, str);
                    Mm mm2 = mm;
                    if (mm2 != null && mm2.NOt() != null) {
                        JSONObject jSONObjectNOt = mm.NOt();
                        if (str2.equals("open_ad")) {
                            jSONObjectNOt.put("is_icon_only", qFVar.oZ() ? 1 : 0);
                        }
                        jSONObject.put("ad_extra_data", jSONObjectNOt.toString());
                    }
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void ZRu(final qF qFVar, final String str, final fWk fwk) {
        if (qFVar == null) {
            return;
        }
        final long jMZ = fwk.mZ();
        ZRu(System.currentTimeMillis(), qFVar, str, "stay_duration", new com.bytedance.sdk.openadsdk.edo.mZ.ZRu() { // from class: com.bytedance.sdk.openadsdk.uR.mZ.2
            @Override // com.bytedance.sdk.openadsdk.edo.mZ.ZRu
            public JSONObject ZRu() {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject.put("click_stay_time", jMZ);
                    jSONObject.put("click_time", fwk.ZRu);
                    if (str.equals("open_ad")) {
                        jSONObject.put("is_icon_only", qFVar.oZ() ? 1 : 0);
                    }
                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                } catch (Throwable unused) {
                }
                return jSONObject2;
            }
        });
    }

    public static void ZRu(qF qFVar, final String str, final int i10, final String str2, final long j10, final boolean z10, final int i11, final long j11) {
        ZRu(System.currentTimeMillis(), qFVar, str, NOt.uR, new com.bytedance.sdk.openadsdk.edo.mZ.ZRu() { // from class: com.bytedance.sdk.openadsdk.uR.mZ.4
            @Override // com.bytedance.sdk.openadsdk.edo.mZ.ZRu
            public JSONObject ZRu() {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject.put("invisible_scene", i10);
                    jSONObject.put("arbi_current_url", str2);
                    jSONObject.put("loading_visible_time", j10);
                    jSONObject.put("arbi_trigger_start", z10);
                    jSONObject.put("arbi_convert_count", i11);
                    jSONObject.put("loading_start_timestamp", j11);
                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.lp.NOt(th.toString());
                }
                return jSONObject2;
            }
        });
    }

    public static void ZRu(qF qFVar, String str, final long j10, final boolean z10) {
        ZRu(System.currentTimeMillis(), qFVar, str, "lp_loading", new com.bytedance.sdk.openadsdk.edo.mZ.ZRu() { // from class: com.bytedance.sdk.openadsdk.uR.mZ.5
            @Override // com.bytedance.sdk.openadsdk.edo.mZ.ZRu
            public JSONObject ZRu() {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject.put("if_lp_loading_success", z10 ? 1 : 2);
                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                    jSONObject2.put(x.h.f238399b, j10);
                    return jSONObject2;
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.lp.NOt(th.toString());
                    return jSONObject2;
                }
            }
        });
    }

    public static void ZRu(qF qFVar, final String str, final int i10, final String str2, final int i11) {
        ZRu(System.currentTimeMillis(), qFVar, str, NOt.ZRu, new com.bytedance.sdk.openadsdk.edo.mZ.ZRu() { // from class: com.bytedance.sdk.openadsdk.uR.mZ.8
            @Override // com.bytedance.sdk.openadsdk.edo.mZ.ZRu
            public JSONObject ZRu() {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject.put(FirebaseAnalytics.Param.INDEX, i10);
                    jSONObject.put("arbi_current_url", str2);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("new_index", i11);
                    jSONObject.put("pag_json_data", jSONObject3.toString());
                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.lp.NOt(th.toString());
                }
                return jSONObject2;
            }
        });
    }

    public static void ZRu(qF qFVar, final String str, final int i10, final String str2, final float f10) {
        ZRu(System.currentTimeMillis(), qFVar, str, NOt.NOt, new com.bytedance.sdk.openadsdk.edo.mZ.ZRu() { // from class: com.bytedance.sdk.openadsdk.uR.mZ.9
            @Override // com.bytedance.sdk.openadsdk.edo.mZ.ZRu
            public JSONObject ZRu() {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject.put(FirebaseAnalytics.Param.INDEX, i10);
                    jSONObject.put("arbi_current_url", str2);
                    jSONObject.put("arbi_load_duration", f10);
                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.lp.NOt(th.toString());
                }
                return jSONObject2;
            }
        });
    }

    public static void ZRu(qF qFVar, final String str, final int i10, final String str2, final String str3, final int i11) {
        ZRu(System.currentTimeMillis(), qFVar, str, NOt.mZ, new com.bytedance.sdk.openadsdk.edo.mZ.ZRu() { // from class: com.bytedance.sdk.openadsdk.uR.mZ.10
            @Override // com.bytedance.sdk.openadsdk.edo.mZ.ZRu
            public JSONObject ZRu() {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject.put(FirebaseAnalytics.Param.INDEX, i10);
                    jSONObject.put("arbi_current_url", str2);
                    jSONObject.put("load_url", str3);
                    jSONObject.put("url_flag", i11);
                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.lp.NOt(th.toString());
                }
                return jSONObject2;
            }
        });
    }

    @DungeonFlag
    public static void ZRu(final String str, final qF qFVar, final com.bytedance.sdk.openadsdk.core.model.aT aTVar, final String str2, final boolean z10, final Map<String, Object> map, final int i10) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        ZRu(new com.bytedance.sdk.component.FA.FA("onClick") { // from class: com.bytedance.sdk.openadsdk.uR.mZ.13
            @Override // java.lang.Runnable
            public void run() {
                qF qFVar2 = qFVar;
                if (qFVar2 == null) {
                    return;
                }
                mZ.ZRu(jCurrentTimeMillis, qFVar2, str2, str, new com.bytedance.sdk.openadsdk.edo.mZ.ZRu() { // from class: com.bytedance.sdk.openadsdk.uR.mZ.13.1
                    @Override // com.bytedance.sdk.openadsdk.edo.mZ.ZRu
                    public JSONObject ZRu() {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            com.bytedance.sdk.openadsdk.core.model.aT aTVar2 = aTVar;
                            if (aTVar2 != null) {
                                JSONObject jSONObjectZRu = aTVar2.ZRu();
                                jSONObjectZRu.put("is_valid", z10);
                                int i11 = i10;
                                if (i11 > 0 && i11 <= 2) {
                                    jSONObjectZRu.put("user_behavior_type", i11);
                                }
                                Map map2 = map;
                                if (map2 != null) {
                                    if (map2.containsKey(x.h.f238399b)) {
                                        jSONObject.put(x.h.f238399b, map.get(x.h.f238399b));
                                    }
                                    for (Map.Entry entry : map.entrySet()) {
                                        if (!x.h.f238399b.equals(entry.getKey())) {
                                            jSONObjectZRu.put((String) entry.getKey(), entry.getValue());
                                        }
                                    }
                                }
                                jSONObjectZRu.put("interaction_method", qFVar.WMI());
                                if (str2.equals("open_ad")) {
                                    jSONObjectZRu.put("is_icon_only", qFVar.oZ() ? 1 : 0);
                                }
                                jSONObject.put("ad_extra_data", jSONObjectZRu.toString());
                            }
                            jSONObject.putOpt("log_extra", qFVar.Wo());
                            float fFloatValue = Double.valueOf((System.currentTimeMillis() / 1000) - qFVar.eCS()).floatValue();
                            if (fFloatValue <= 0.0f) {
                                fFloatValue = 0.0f;
                            }
                            jSONObject.putOpt("show_time", Float.valueOf(fFloatValue));
                            jSONObject.putOpt("ua_policy", Integer.valueOf(qFVar.gI()));
                        } catch (Exception unused) {
                        }
                        return jSONObject;
                    }
                });
                if (!TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.lp.ZRu(com.bytedance.sdk.openadsdk.core.WMI.ZRu())) && "click".equals(str)) {
                    com.bytedance.sdk.openadsdk.uR.ZRu.uR.ZRu(com.bytedance.sdk.openadsdk.Zf.ZRu.ZRu(qFVar.ZRJ(), true), 2, qFVar.vE());
                }
                if ("click".equals(str)) {
                    Zf.mZ(qFVar);
                }
            }
        });
    }

    public static void ZRu(qF qFVar, String str, String str2, final JSONObject jSONObject) {
        ZRu(System.currentTimeMillis(), qFVar, str, str2, new com.bytedance.sdk.openadsdk.edo.mZ.ZRu() { // from class: com.bytedance.sdk.openadsdk.uR.mZ.14
            @Override // com.bytedance.sdk.openadsdk.edo.mZ.ZRu
            public JSONObject ZRu() {
                if (jSONObject == null) {
                    return null;
                }
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                    if (!jSONObject.has(x.h.f238399b)) {
                        return jSONObject2;
                    }
                    jSONObject2.put(x.h.f238399b, jSONObject.get(x.h.f238399b));
                    return jSONObject2;
                } catch (Exception e10) {
                    com.bytedance.sdk.component.utils.lp.ZRu("TTAD.AdEvent", e10.getMessage());
                    return jSONObject2;
                }
            }
        });
        if ("click".equals(str2)) {
            Zf.mZ(qFVar);
        }
    }

    public static void ZRu(qF qFVar, String str, final int i10, final long j10) {
        ZRu(System.currentTimeMillis(), qFVar, str, "video_choose", new com.bytedance.sdk.openadsdk.edo.mZ.ZRu() { // from class: com.bytedance.sdk.openadsdk.uR.mZ.15
            @Override // com.bytedance.sdk.openadsdk.edo.mZ.ZRu
            public JSONObject ZRu() {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("video_choose", i10);
                    jSONObject2.put("video_choose_duration", j10);
                    jSONObject.put("ad_extra_data", jSONObject2.toString());
                    return jSONObject;
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.lp.NOt(th.toString());
                    return jSONObject;
                }
            }
        });
    }

    public static void ZRu(qF qFVar, String str, final String str2, final long j10, final int i10, JSONObject jSONObject, final Mm mm) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        final JSONObject jSONObject2 = jSONObject;
        ZRu(System.currentTimeMillis(), qFVar, str, str2, new com.bytedance.sdk.openadsdk.edo.mZ.ZRu() { // from class: com.bytedance.sdk.openadsdk.uR.mZ.16
            @Override // com.bytedance.sdk.openadsdk.edo.mZ.ZRu
            public JSONObject ZRu() {
                Mm mm2;
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put(x.h.f238399b, j10);
                    jSONObject3.put("percent", i10);
                    if (("feed_break".equals(str2) || "feed_over".equals(str2)) && (mm2 = mm) != null) {
                        mm2.ZRu(jSONObject2);
                    }
                    jSONObject3.put("ad_extra_data", jSONObject2.toString());
                } catch (Throwable unused) {
                }
                return jSONObject3;
            }
        });
    }

    public static void ZRu(qF qFVar, String str, String str2, final JSONObject jSONObject, final long j10) {
        ZRu(System.currentTimeMillis(), qFVar, str, str2, new com.bytedance.sdk.openadsdk.edo.mZ.ZRu() { // from class: com.bytedance.sdk.openadsdk.uR.mZ.18
            @Override // com.bytedance.sdk.openadsdk.edo.mZ.ZRu
            public JSONObject ZRu() {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    JSONObject jSONObject3 = jSONObject;
                    if (jSONObject3 != null) {
                        jSONObject2.put("ad_extra_data", jSONObject3.toString());
                    }
                    jSONObject2.put(x.h.f238399b, j10);
                } catch (Exception unused) {
                }
                return jSONObject2;
            }
        });
    }

    public static void ZRu(final qF qFVar, String str, String str2, final Map<String, Object> map) {
        ZRu(System.currentTimeMillis(), qFVar, str, str2, new com.bytedance.sdk.openadsdk.edo.mZ.ZRu() { // from class: com.bytedance.sdk.openadsdk.uR.mZ.19
            @Override // com.bytedance.sdk.openadsdk.edo.mZ.ZRu
            public JSONObject ZRu() {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    Map map2 = map;
                    if (map2 != null) {
                        for (Map.Entry entry : map2.entrySet()) {
                            jSONObject2.put((String) entry.getKey(), entry.getValue());
                        }
                    }
                    jSONObject2.put("dp_creative_type", qFVar.Jf());
                    jSONObject.put("ad_extra_data", jSONObject2.toString());
                } catch (Exception unused) {
                }
                return jSONObject;
            }
        });
    }

    @DungeonFlag
    public static void ZRu(long j10, qF qFVar, String str, String str2) {
        ZRu(j10, qFVar, str, str2, (com.bytedance.sdk.openadsdk.edo.mZ.ZRu) null);
    }

    @DungeonFlag
    public static void ZRu(final long j10, final qF qFVar, final String str, final String str2, final com.bytedance.sdk.openadsdk.edo.mZ.ZRu zRu) {
        if (qFVar == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || ZRu(qFVar.tp(), str2)) {
            return;
        }
        ZRu(new com.bytedance.sdk.component.FA.FA(str2) { // from class: com.bytedance.sdk.openadsdk.uR.mZ.20
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject;
                try {
                    com.bytedance.sdk.openadsdk.edo.mZ.ZRu zRu2 = zRu;
                    if (zRu2 != null) {
                        jSONObject = zRu2.ZRu();
                        if (jSONObject == null) {
                            try {
                                jSONObject = new JSONObject();
                            } catch (Exception unused) {
                            }
                        }
                    } else {
                        jSONObject = new JSONObject();
                    }
                    jSONObject.putOpt("log_extra", qFVar.Wo());
                    jSONObject.putOpt("ua_policy", Integer.valueOf(qFVar.gI()));
                } catch (Exception unused2) {
                    jSONObject = null;
                }
                new ZRu.C0470ZRu(j10, qFVar).NOt(str).mZ(str2).TFq(qFVar.vE()).FA(qFVar.nv()).ZRu(qFVar.Oc()).ZRu(jSONObject).Mm(qFVar.jYr()).ZRu((com.bytedance.sdk.openadsdk.uR.NOt.ZRu) null);
            }
        });
    }

    public static void ZRu(qF qFVar, String str, final String str2, final com.bytedance.sdk.openadsdk.edo.mZ.ZRu zRu) {
        ZRu(System.currentTimeMillis(), qFVar, str, "playable_track", new com.bytedance.sdk.openadsdk.edo.mZ.ZRu() { // from class: com.bytedance.sdk.openadsdk.uR.mZ.21
            @Override // com.bytedance.sdk.openadsdk.edo.mZ.ZRu
            public JSONObject ZRu() {
                JSONObject jSONObject;
                JSONObject jSONObject2 = new JSONObject();
                try {
                    com.bytedance.sdk.openadsdk.edo.mZ.ZRu zRu2 = zRu;
                    if (zRu2 == null || (jSONObject = zRu2.ZRu()) == null) {
                        jSONObject = new JSONObject();
                    }
                    jSONObject.put("is_new_playable", 1);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("pag_json_data", jSONObject.toString());
                    jSONObject3.put("playable_event", str2);
                    jSONObject2.put("ad_extra_data", jSONObject3.toString());
                } catch (Exception unused) {
                }
                return jSONObject2;
            }
        });
    }

    public static void ZRu(qF qFVar, final com.bytedance.sdk.openadsdk.edo.ZRu.ZRu zRu, final String str) {
        ZRu(System.currentTimeMillis(), qFVar, str, "web_behavior_keyword", new com.bytedance.sdk.openadsdk.edo.mZ.ZRu() { // from class: com.bytedance.sdk.openadsdk.uR.mZ.25
            @Override // com.bytedance.sdk.openadsdk.edo.mZ.ZRu
            public JSONObject ZRu() {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("arbi_current_url", zRu.mZ());
                    jSONObject2.put("keyword", zRu.WMI());
                    jSONObject.put("ad_extra_data", jSONObject2.toString());
                } catch (Throwable th) {
                    OCA.NOt("TTAD.AdEvent", "onWebBehaviorKeyword", th.getMessage());
                }
                return jSONObject;
            }
        });
    }

    public static void ZRu(final long j10, final qF qFVar, String str) {
        if (qFVar == null || !qF.mZ(qFVar) || qFVar.Gg() == null) {
            return;
        }
        ZRu(System.currentTimeMillis(), qFVar, str, "endcard_close", new com.bytedance.sdk.openadsdk.edo.mZ.ZRu() { // from class: com.bytedance.sdk.openadsdk.uR.mZ.30
            @Override // com.bytedance.sdk.openadsdk.edo.mZ.ZRu
            public JSONObject ZRu() {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.putOpt("url", qFVar.Gg().mZ());
                    jSONObject2.putOpt("id", qFVar.Gg().ZRu());
                    jSONObject2.putOpt(FileResponse.FIELD_MD5, qFVar.Gg().NOt());
                    if (qFVar.Qg() != null) {
                        jSONObject2.putOpt("render_type", Integer.valueOf(qFVar.Qg().uR()));
                    }
                    jSONObject.put("ad_extra_data", jSONObject2.toString());
                    jSONObject.put(x.h.f238399b, j10);
                    return jSONObject;
                } catch (Exception e10) {
                    com.bytedance.sdk.component.utils.lp.NOt(e10.getMessage());
                    return jSONObject;
                }
            }
        });
    }

    public static void ZRu(qF qFVar, String str, final String str2) {
        ZRu(System.currentTimeMillis(), qFVar, str, "show_error", new com.bytedance.sdk.openadsdk.edo.mZ.ZRu() { // from class: com.bytedance.sdk.openadsdk.uR.mZ.31
            @Override // com.bytedance.sdk.openadsdk.edo.mZ.ZRu
            public JSONObject ZRu() {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.putOpt("error_msg", str2);
                    jSONObject.putOpt("ad_extra_data", jSONObject2.toString());
                } catch (Exception unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void ZRu(qF qFVar, String str, String str2, final long j10, final JSONObject jSONObject) {
        if (qFVar == null || jSONObject == null) {
            return;
        }
        ZRu(System.currentTimeMillis(), qFVar, str, str2, new com.bytedance.sdk.openadsdk.edo.mZ.ZRu() { // from class: com.bytedance.sdk.openadsdk.uR.mZ.32
            @Override // com.bytedance.sdk.openadsdk.edo.mZ.ZRu
            public JSONObject ZRu() {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put(x.h.f238399b, j10);
                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                    return jSONObject2;
                } catch (Exception e10) {
                    com.bytedance.sdk.component.utils.lp.ZRu("TTAD.AdEvent", e10.getMessage());
                    return jSONObject2;
                }
            }
        });
    }

    public static void ZRu(String str, long j10) {
        com.bytedance.sdk.openadsdk.core.Mm.mZ.ZRu(str, j10);
    }

    @DungeonFlag
    public static void ZRu(final qF qFVar, final String str, final String str2, final String str3, final long j10, final long j11, final JSONObject jSONObject, final boolean z10) {
        if (qFVar == null || ZRu(qFVar.tp(), str3)) {
            return;
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        ZRu(new com.bytedance.sdk.component.FA.FA("sendJsAdEvent") { // from class: com.bytedance.sdk.openadsdk.uR.mZ.38
            @Override // java.lang.Runnable
            public void run() {
                JSONArray jSONArrayOptJSONArray;
                String strOc = qFVar.Oc();
                if (jSONObject != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        String strOptString = jSONObject.optString("ad_extra_data");
                        if (!TextUtils.isEmpty(strOptString)) {
                            jSONObject2 = new JSONObject(strOptString);
                        }
                        if (!"click".equals(str3)) {
                            jSONObject2.put("device", DeviceUtils.TFq(com.bytedance.sdk.openadsdk.core.WMI.ZRu()).toString());
                        }
                        if ("click".equals(str3)) {
                            if (z10) {
                                jSONObject2.put("click_scence", 1);
                            } else if (xY.NOt(qFVar)) {
                                jSONObject2.put("click_scence", 3);
                            }
                        }
                        if (qFVar.Rgu()) {
                            try {
                                JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("pag_json_data");
                                if (jSONObjectOptJSONObject == null) {
                                    jSONObjectOptJSONObject = new JSONObject();
                                }
                                jSONObjectOptJSONObject.put("is_new_playable", 1);
                                if (qFVar.uJW()) {
                                    jSONObjectOptJSONObject.put("is_pre_render", 1);
                                }
                                jSONObject2.put("pag_json_data", jSONObjectOptJSONObject.toString());
                            } catch (Throwable unused) {
                            }
                        }
                        jSONObject.put("ad_extra_data", jSONObject2.toString());
                        jSONObject.put(d.C0152d.f79310d, str2);
                        int iOptInt = jSONObject2.optInt("agg_request_type", -1);
                        if (z10 && iOptInt == 2) {
                            strOc = jSONObject2.optString("app_log_url");
                        }
                        int i10 = 0;
                        if ("click".equals(str3)) {
                            Zf.mZ(qFVar);
                            float fFloatValue = Double.valueOf((System.currentTimeMillis() / 1000) - qF.NOt(jSONObject.optString("log_extra"))).floatValue();
                            JSONObject jSONObject3 = jSONObject;
                            if (fFloatValue <= 0.0f) {
                                fFloatValue = 0.0f;
                            }
                            jSONObject3.putOpt("show_time", Float.valueOf(fFloatValue));
                            if (!TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.lp.ZRu(com.bytedance.sdk.openadsdk.core.WMI.ZRu()))) {
                                if (z10 && iOptInt == 2) {
                                    JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("click_tracking_url");
                                    if (jSONArrayOptJSONArray2 != null) {
                                        ArrayList arrayList = new ArrayList();
                                        while (i10 < jSONArrayOptJSONArray2.length()) {
                                            arrayList.add(jSONArrayOptJSONArray2.optString(i10));
                                            i10++;
                                        }
                                        com.bytedance.sdk.openadsdk.uR.ZRu.uR.ZRu(com.bytedance.sdk.openadsdk.Zf.ZRu.ZRu(arrayList, true), 2, String.valueOf(j10));
                                    }
                                } else {
                                    qF qFVar2 = qFVar;
                                    if (qFVar2 != null) {
                                        com.bytedance.sdk.openadsdk.uR.ZRu.uR.ZRu(com.bytedance.sdk.openadsdk.Zf.ZRu.ZRu(qFVar2.ZRJ(), true), 2, qFVar.vE());
                                    }
                                }
                            }
                        } else if ("show".equals(str3) && !TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.lp.ZRu(com.bytedance.sdk.openadsdk.core.WMI.ZRu())) && z10 && iOptInt == 2 && (jSONArrayOptJSONArray = jSONObject2.optJSONArray("show_tracking_url")) != null) {
                            ArrayList arrayList2 = new ArrayList();
                            while (i10 < jSONArrayOptJSONArray.length()) {
                                arrayList2.add(jSONArrayOptJSONArray.optString(i10));
                                i10++;
                            }
                            com.bytedance.sdk.openadsdk.uR.ZRu.uR.ZRu(com.bytedance.sdk.openadsdk.Zf.ZRu.ZRu(arrayList2, true), 1, String.valueOf(j10));
                        }
                    } catch (Exception unused2) {
                    }
                }
                new ZRu.C0470ZRu(jCurrentTimeMillis, qFVar).uR(str).NOt(str2).mZ(str3).TFq(String.valueOf(j10)).Ht(String.valueOf(j11)).ZRu(strOc).ZRu(jSONObject).FA(qFVar.nv()).Mm(qFVar.jYr()).ZRu((com.bytedance.sdk.openadsdk.uR.NOt.ZRu) null);
            }
        });
    }

    public static void ZRu(qF qFVar, String str, final long j10, final JSONObject jSONObject) {
        ZRu(System.currentTimeMillis(), qFVar, "open_ad", str, new com.bytedance.sdk.openadsdk.edo.mZ.ZRu() { // from class: com.bytedance.sdk.openadsdk.uR.mZ.39
            @Override // com.bytedance.sdk.openadsdk.edo.mZ.ZRu
            public JSONObject ZRu() {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    long j11 = j10;
                    if (j11 != -1) {
                        jSONObject2.put(x.h.f238399b, j11);
                    }
                    JSONObject jSONObject3 = jSONObject;
                    if (jSONObject3 != null) {
                        jSONObject2.put("ad_extra_data", jSONObject3.toString());
                        return jSONObject2;
                    }
                    jSONObject2.put("ad_extra_data", new JSONObject().toString());
                    return jSONObject2;
                } catch (Exception e10) {
                    com.bytedance.sdk.component.utils.lp.ZRu("TTAD.AdEvent", e10.getMessage());
                    return jSONObject2;
                }
            }
        });
    }

    public static void ZRu(final com.bytedance.sdk.component.FA.FA fa2) {
        if (fa2 == null) {
            return;
        }
        if (WD.TFq()) {
            com.bytedance.sdk.component.utils.Mm.ZRu().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.uR.mZ.40
                @Override // java.lang.Runnable
                public void run() {
                    WD.NOt(fa2, 10);
                }
            });
        } else if (!WD.Ht()) {
            WD.NOt(fa2, 10);
        } else {
            fa2.run();
        }
    }

    public static void ZRu(final com.bytedance.sdk.openadsdk.edo.ZRu.NOt nOt) {
        if (nOt == null || nOt.NOt() == null) {
            return;
        }
        final qF qFVarNOt = nOt.NOt();
        final int iIZ = qFVarNOt.IZ();
        if (iIZ == 2 || iIZ == 8 || (Yx.uR(qFVarNOt) && NOt.ZRu.uR.equals(nOt.ZRu()))) {
            ZRu(System.currentTimeMillis(), qFVarNOt, nOt.mZ(), "open_browser", new com.bytedance.sdk.openadsdk.edo.mZ.ZRu() { // from class: com.bytedance.sdk.openadsdk.uR.mZ.41
                @Override // com.bytedance.sdk.openadsdk.edo.mZ.ZRu
                public JSONObject ZRu() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        int iUR = nOt.uR();
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("count", Yx.edo(com.bytedance.sdk.openadsdk.core.WMI.ZRu()));
                        jSONObject2.put("interceptor", iUR);
                        jSONObject2.put("success", nOt.TFq());
                        jSONObject2.put("link", nOt.ZRu());
                        jSONObject2.put("interaction_type", iIZ);
                        jSONObject2.put("real_interaction_type", nOt.Mm());
                        if (nOt.uR() == 9) {
                            jSONObject2.put("is_act_signals_api_available", nOt.FA());
                            jSONObject2.put("is_act_signals_callback", nOt.Vor());
                        }
                        if (!TextUtils.isEmpty(nOt.Ht())) {
                            jSONObject2.put("exception_msg", nOt.Ht());
                        }
                        if (iUR == 2 || iUR == 5) {
                            jSONObject2.put(b.f166415I, qFVarNOt.HZ().toString());
                        }
                        jSONObject.put("ad_extra_data", jSONObject2.toString());
                        return jSONObject;
                    } catch (Exception e10) {
                        com.bytedance.sdk.component.utils.lp.ZRu("TTAD.AdEvent", e10.getMessage());
                        return jSONObject;
                    }
                }
            });
        }
    }

    public static void ZRu(qF qFVar, String str, int i10, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("type", i10);
        } catch (JSONException unused) {
        }
        NOt(qFVar, str, "open_ad_land_page_links", jSONObject);
    }

    public static void ZRu(qF qFVar, String str, final boolean z10, final boolean z11, final boolean z12, final boolean z13, final int i10, final Map<String, Object> map) {
        ZRu(System.currentTimeMillis(), qFVar, str, "start_show_plb", new com.bytedance.sdk.openadsdk.edo.mZ.ZRu() { // from class: com.bytedance.sdk.openadsdk.uR.mZ.42
            @Override // com.bytedance.sdk.openadsdk.edo.mZ.ZRu
            public JSONObject ZRu() {
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("isSkip", z10);
                    jSONObject2.put(g.f239555d, z11);
                    jSONObject2.put("isFromLandingPage", z12);
                    jSONObject2.put("finishing", z13);
                    jSONObject2.put(x.h.f238400c, i10);
                    Map map2 = map;
                    if (map2 != null) {
                        for (Map.Entry entry : map2.entrySet()) {
                            jSONObject2.put((String) entry.getKey(), entry.getValue());
                        }
                    }
                    jSONObject.put("ad_extra_data", jSONObject2.toString());
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void ZRu(final qF qFVar, final boolean z10, String str, final String str2, final long j10, final String str3, final String str4, final int i10, final String str5) {
        ZRu(System.currentTimeMillis(), qFVar, str, "load_ugen_template", new com.bytedance.sdk.openadsdk.edo.mZ.ZRu() { // from class: com.bytedance.sdk.openadsdk.uR.mZ.43
            /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x004f  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x0091 A[Catch: all -> 0x002f, TryCatch #2 {all -> 0x002f, blocks: (B:3:0x000e, B:27:0x0055, B:29:0x005d, B:41:0x00d0, B:43:0x00ef, B:44:0x00f9, B:30:0x0073, B:32:0x007b, B:33:0x0091, B:35:0x0095, B:37:0x009d, B:38:0x00b3, B:40:0x00bb, B:10:0x0025, B:15:0x0032, B:18:0x003c), top: B:56:0x000e }] */
            /* JADX WARN: Removed duplicated region for block: B:43:0x00ef A[Catch: all -> 0x002f, TryCatch #2 {all -> 0x002f, blocks: (B:3:0x000e, B:27:0x0055, B:29:0x005d, B:41:0x00d0, B:43:0x00ef, B:44:0x00f9, B:30:0x0073, B:32:0x007b, B:33:0x0091, B:35:0x0095, B:37:0x009d, B:38:0x00b3, B:40:0x00bb, B:10:0x0025, B:15:0x0032, B:18:0x003c), top: B:56:0x000e }] */
            @Override // com.bytedance.sdk.openadsdk.edo.mZ.ZRu
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public org.json.JSONObject ZRu() {
                /*
                    Method dump skipped, instruction units count: 293
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.uR.mZ.AnonymousClass43.ZRu():org.json.JSONObject");
            }
        });
    }

    private static boolean ZRu(int i10, String str) {
        int iVdW;
        try {
            Set<String> setDs = com.bytedance.sdk.openadsdk.core.settings.yBV.CH().Ds();
            if ((i10 == 1 && setDs != null && setDs.contains(str)) || (iVdW = com.bytedance.sdk.openadsdk.core.settings.yBV.CH().VdW(str)) == 0) {
                return true;
            }
            if (iVdW != 100) {
                if (((int) ((Math.random() * 100.0d) + 1.0d)) > iVdW) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lp.ZRu("TTAD.AdEvent", th.getMessage());
            return false;
        }
    }
}
