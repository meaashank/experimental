package com.bytedance.sdk.openadsdk.core.FA.ZRu;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.VdW;
import com.bytedance.sdk.openadsdk.core.Vor;
import com.bytedance.sdk.openadsdk.core.WMI;
import com.bytedance.sdk.openadsdk.core.ZH.TFq.mZ;
import com.bytedance.sdk.openadsdk.core.lp;
import com.bytedance.sdk.openadsdk.core.model.ZRu;
import com.bytedance.sdk.openadsdk.core.model.le;
import com.bytedance.sdk.openadsdk.core.model.oK;
import com.bytedance.sdk.openadsdk.core.model.om;
import com.bytedance.sdk.openadsdk.core.model.qF;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.prism.gaia.client.stub.PermissionListActivity;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class NOt {
    private static String NOt = "";
    public static String ZRu = "https://pag_open_icon_id/appicon.png";

    public static boolean NOt() {
        return true;
    }

    public static String ZRu() {
        return NOt;
    }

    private static JSONObject NOt(qF qFVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            VdW.ZRu(jSONObject, qFVar);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static JSONObject ZRu(float f10, float f11, boolean z10, @NonNull qF qFVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("platform", "android");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(InMobiNetworkValues.WIDTH, f10);
            jSONObject2.put(InMobiNetworkValues.HEIGHT, f11);
            if (z10) {
                jSONObject2.put("isLandscape", true);
            }
            jSONObject.put("AdSize", jSONObject2);
            if (!(qFVar instanceof om) || !((om) qFVar).Dg()) {
                jSONObject.put("creative", ZRu(false, qFVar));
                jSONObject.put("template_Plugin", NOt(qFVar.Ho()));
                jSONObject.put("diff_template_Plugin", ZRu(qFVar.Ho()));
                return jSONObject;
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject.put("choose_ui_data", jSONObject3);
            ZRu.C0455ZRu c0455ZRuBBr = ((om) qFVar).bBr();
            JSONObject jSONObjectNOt = c0455ZRuBBr.NOt();
            if (TextUtils.isEmpty(c0455ZRuBBr.Vor())) {
                jSONObjectNOt.put("data", NOt(c0455ZRuBBr));
            }
            jSONObject3.put("tpl_info", jSONObjectNOt);
            JSONArray jSONArray = new JSONArray();
            jSONObject.put("creatives", jSONArray);
            for (qF qFVar2 : ((om) qFVar).lgB()) {
                JSONObject jSONObjectZRu = ZRu(false, qFVar2);
                if (jSONObjectZRu != null) {
                    jSONObjectZRu.put("template_Plugin", NOt(qFVar2.Ho()));
                    jSONObjectZRu.put("diff_template_Plugin", ZRu(qFVar2.Ho()));
                    jSONArray.put(jSONObjectZRu);
                }
            }
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    private static String NOt(qF.ZRu zRu) {
        com.bytedance.sdk.component.adexpress.ZRu.mZ.NOt nOtMZ;
        if (zRu != null) {
            String strVor = zRu.Vor();
            return (!TextUtils.isEmpty(strVor) || (nOtMZ = com.bytedance.sdk.component.adexpress.ZRu.NOt.NOt.mZ(zRu.Ht())) == null) ? strVor : nOtMZ.TFq();
        }
        return "";
    }

    public static JSONObject ZRu(float f10, float f11, boolean z10, @NonNull qF qFVar, String str, mZ mZVar) {
        NOt = "";
        if (qFVar == null) {
            return null;
        }
        try {
            JSONObject jSONObjectHZ = qFVar.HZ();
            ZRu(jSONObjectHZ, qFVar, str);
            JSONObject jSONObjectNOt = VdW.NOt(qFVar);
            jSONObjectNOt.put("language", lp.ZRu());
            jSONObjectHZ.put("xSetting", jSONObjectNOt);
            jSONObjectHZ.put("xAdInfo", ZRu(str, NOt(qFVar), qFVar));
            JSONObject jSONObject = new JSONObject();
            VdW.NOt(jSONObject);
            jSONObject.put("platform", "android");
            jSONObjectHZ.put("xAppInfo", jSONObject);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(InMobiNetworkValues.WIDTH, f10);
            jSONObject2.put(InMobiNetworkValues.HEIGHT, f11);
            if (z10) {
                jSONObject2.put("isLandscape", true);
            }
            jSONObjectHZ.put("xSize", jSONObject2);
            mZVar.ZRu("adv3");
            le leVarAK = qFVar.AK();
            if (leVarAK != null) {
                String strUR = leVarAK.uR();
                if (!TextUtils.isEmpty(strUR)) {
                    jSONObjectHZ.put("xTemplate", new JSONObject(strUR));
                    NOt = "getTemplate success by local data";
                    mZVar.NOt(ImagesContract.LOCAL);
                    return jSONObjectHZ;
                }
                String strZRu = com.bytedance.sdk.openadsdk.core.ZH.ZRu.NOt.ZRu().ZRu("adv3", leVarAK.ZRu(), leVarAK.NOt());
                if (!TextUtils.isEmpty(strZRu)) {
                    jSONObjectHZ.put("xTemplate", new JSONObject(strZRu));
                    NOt = "getTemplate success by db data";
                    mZVar.NOt(ImagesContract.LOCAL);
                    return jSONObjectHZ;
                }
                String str2 = "local db data is null id is " + leVarAK.ZRu() + " md5 is " + leVarAK.NOt();
                NOt = str2;
                mZVar.ZRu(3, str2, "net");
            }
            return jSONObjectHZ;
        } catch (Exception e10) {
            String str3 = "load template exception " + e10.getMessage();
            NOt = str3;
            mZVar.ZRu(3, str3, "net");
            return null;
        }
    }

    private static void ZRu(JSONObject jSONObject, qF qFVar, String str) {
        com.bykv.vk.openvk.ZRu.ZRu.ZRu.mZ.NOt nOtQg;
        if (qFVar == null || jSONObject == null) {
            return;
        }
        try {
            if (jSONObject.has("h265_video")) {
                jSONObject.remove("h265_video");
            }
            if (!jSONObject.has("video") || (nOtQg = qFVar.Qg()) == null) {
                return;
            }
            JSONObject jSONObjectQF = nOtQg.qF();
            if (jSONObjectQF != null) {
                if ("open_ad".equals(str)) {
                    jSONObjectQF.put("video_duration", WMI.uR().Zf(String.valueOf(qFVar.GE())));
                } else {
                    jSONObjectQF.put("video_duration", nOtQg.Ht() * ((double) nOtQg.xY()));
                }
            }
            jSONObject.put("video", jSONObjectQF);
        } catch (Exception e10) {
            e10.getMessage();
        }
    }

    private static JSONObject ZRu(String str, JSONObject jSONObject, qF qFVar) {
        if (qFVar != null) {
            try {
                if ("open_ad".equals(str)) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(PermissionListActivity.f164366k, Vor.NOt().Ht());
                    int iMm = Vor.NOt().Mm();
                    if (iMm != 0) {
                        int iLe = qFVar.le();
                        if (9 == iLe) {
                            jSONObject2.put(PermissionListActivity.f164367l, ZRu);
                        } else if (10 == iLe) {
                            jSONObject2.put(PermissionListActivity.f164367l, "@".concat(String.valueOf(iMm)));
                        }
                    }
                    jSONObject.put("open_app_info", jSONObject2);
                }
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    public static JSONObject ZRu(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject2 == null) {
            return jSONObject;
        }
        JSONObject jSONObject3 = new JSONObject();
        if (jSONObject == null) {
            return jSONObject3;
        }
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("keys");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    String strOptString = jSONArrayOptJSONArray.optString(i10);
                    if (jSONObject.has(strOptString)) {
                        jSONObject3.put(strOptString, jSONObject.opt(strOptString));
                    }
                }
                jSONObject3.put("xSetting", jSONObject.opt("xSetting"));
                jSONObject3.put("xAdInfo", jSONObject.opt("xAdInfo"));
                jSONObject3.put("xAppInfo", jSONObject.opt("xAppInfo"));
                jSONObject3.put("xSize", jSONObject.opt("xSize"));
                jSONObject3.put("xTemplate", jSONObject.opt("xTemplate"));
                return jSONObject3;
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private static String ZRu(qF.ZRu zRu) {
        if (zRu != null) {
            return zRu.aT();
        }
        return "";
    }

    public static JSONObject ZRu(boolean z10, @NonNull qF qFVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("button_text", qFVar.GC());
            if (qFVar.yz() != null) {
                if (qFVar.yz() != null && !TextUtils.isEmpty(qFVar.yz().ZRu())) {
                    jSONObject.put("icon", qFVar.yz().ZRu());
                } else {
                    jSONObject.put("icon", "");
                }
            }
            JSONArray jSONArray = new JSONArray();
            if (qFVar.Np() != null) {
                for (int i10 = 0; i10 < qFVar.Np().size(); i10++) {
                    oK oKVar = qFVar.Np().get(i10);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(InMobiNetworkValues.HEIGHT, oKVar.mZ());
                    jSONObject2.put(InMobiNetworkValues.WIDTH, oKVar.NOt());
                    jSONObject2.put("url", oKVar.ZRu());
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("image", jSONArray);
            jSONObject.put("image_mode", qFVar.wZ());
            jSONObject.put("interaction_type", qFVar.IZ());
            jSONObject.put("interaction_method", qFVar.WMI());
            jSONObject.put("is_compliance_template", NOt());
            jSONObject.put("title", qFVar.yM());
            jSONObject.put("description", qFVar.gX());
            jSONObject.put("source", qFVar.Hvv());
            if (qFVar.gaw() != null) {
                jSONObject.put("comment_num", qFVar.gaw().TFq());
                jSONObject.put(FirebaseAnalytics.Param.SCORE, qFVar.gaw().uR());
                jSONObject.put(CampaignEx.JSON_KEY_APP_SIZE, qFVar.gaw().Ht());
                jSONObject.put("app", qFVar.gaw().FA());
            }
            com.bykv.vk.openvk.ZRu.ZRu.ZRu.mZ.NOt nOtQg = qFVar.Qg();
            if (nOtQg != null) {
                JSONObject jSONObjectQF = nOtQg.qF();
                jSONObjectQF.put("video_duration", nOtQg.Ht() * ((double) nOtQg.xY()));
                jSONObject.put("video", jSONObjectQF);
            }
            if (qFVar.Ho() != null) {
                jSONObject.put("dynamic_creative", qFVar.Ho().ZH());
            }
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String ZRu(qF qFVar, String str) {
        List<oK> listNp;
        if (qFVar != null && (listNp = qFVar.Np()) != null && listNp.size() > 0) {
            for (oK oKVar : listNp) {
                if (oKVar != null && TextUtils.equals(str, oKVar.ZRu())) {
                    return oKVar.Mm();
                }
            }
        }
        return null;
    }

    public static Map<String, String> ZRu(qF qFVar) {
        HashMap map = null;
        if (qFVar == null) {
            return null;
        }
        List<oK> listNp = qFVar.Np();
        if (listNp != null && listNp.size() > 0) {
            map = new HashMap();
            for (oK oKVar : listNp) {
                if (oKVar != null) {
                    map.put(oKVar.ZRu(), oKVar.Mm());
                }
            }
            oK oKVarYz = qFVar.yz();
            if (oKVarYz != null) {
                map.put(oKVarYz.ZRu(), oKVarYz.Mm());
            }
        }
        return map;
    }
}
