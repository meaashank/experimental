package com.bytedance.sdk.component.adexpress.dynamic.TFq;

import android.support.v4.media.f;
import android.text.TextUtils;
import androidx.lifecycle.a0;
import com.android.launcher3.IconCache;
import com.bytedance.sdk.component.adexpress.NOt.sAl;
import com.bytedance.sdk.component.adexpress.dynamic.TFq.TFq;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.prism.gaia.client.stub.PermissionListActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlinx.coroutines.N;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import u4.g;

/* JADX INFO: loaded from: classes2.dex */
public class Ht {
    private static HashMap<String, String> Mm;
    private com.bytedance.sdk.component.adexpress.dynamic.uR.uR Ht;
    private JSONObject NOt;
    private mZ TFq;
    private JSONObject ZRu;
    private com.bytedance.sdk.component.adexpress.dynamic.uR.mZ mZ;
    private ZRu uR;

    public static class ZRu {
        float NOt;
        float ZRu;
        boolean mZ;

        public static ZRu ZRu(JSONObject jSONObject) {
            ZRu zRu = new ZRu();
            if (jSONObject != null) {
                zRu.ZRu = (float) jSONObject.optDouble(InMobiNetworkValues.WIDTH);
                zRu.NOt = (float) jSONObject.optDouble(InMobiNetworkValues.HEIGHT);
                zRu.mZ = jSONObject.optBoolean("isLandscape");
            }
            return zRu;
        }
    }

    static {
        HashMap<String, String> map = new HashMap<>();
        Mm = map;
        map.put("subtitle", "description");
        Mm.put("source", "source|app.app_name");
        Mm.put("screenshot", "dynamic_creative.screenshot");
    }

    public Ht(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        this.ZRu = jSONObject;
        this.NOt = jSONObject2;
        this.mZ = new com.bytedance.sdk.component.adexpress.dynamic.uR.mZ(jSONObject2);
        this.uR = ZRu.ZRu(jSONObject3);
        this.Ht = com.bytedance.sdk.component.adexpress.dynamic.uR.uR.ZRu(jSONObject4);
    }

    private void NOt(com.bytedance.sdk.component.adexpress.dynamic.uR.FA fa2) {
        com.bytedance.sdk.component.adexpress.dynamic.uR.mZ mZVar;
        Object objZRu;
        Object objZRu2;
        Object objZRu3;
        Object objZRu4;
        if (fa2 == null || (mZVar = this.mZ) == null || (objZRu = mZVar.ZRu("image.0.url")) == null) {
            return;
        }
        String strValueOf = String.valueOf(objZRu);
        if (TextUtils.isEmpty(strValueOf) || (objZRu2 = this.mZ.ZRu("title")) == null) {
            return;
        }
        String strValueOf2 = String.valueOf(objZRu2);
        if (TextUtils.isEmpty(strValueOf2) || (objZRu3 = this.mZ.ZRu("description")) == null) {
            return;
        }
        String strValueOf3 = String.valueOf(objZRu3);
        if (TextUtils.isEmpty(strValueOf3) || (objZRu4 = this.mZ.ZRu("icon")) == null) {
            return;
        }
        String strValueOf4 = String.valueOf(objZRu4);
        if (TextUtils.isEmpty(strValueOf4)) {
            return;
        }
        Object objZRu5 = this.mZ.ZRu("app.app_name");
        Object objZRu6 = this.mZ.ZRu("source");
        if (objZRu5 == null && objZRu6 == null) {
            return;
        }
        if (objZRu5 == null) {
            objZRu5 = objZRu6;
        }
        String strValueOf5 = String.valueOf(objZRu5);
        if (TextUtils.isEmpty(strValueOf5)) {
            return;
        }
        fa2.ZRu(g.f239586r0, strValueOf);
        fa2.ZRu("title", strValueOf2);
        fa2.ZRu("description", strValueOf3);
        fa2.ZRu("icon", strValueOf4);
        fa2.ZRu(PermissionListActivity.f164366k, strValueOf5);
        fa2.ZRu(true);
    }

    public com.bytedance.sdk.component.adexpress.dynamic.uR.FA ZRu(double d10, int i10, double d11, String str, sAl sal) {
        JSONObject jSONObject;
        this.mZ.ZRu();
        try {
            jSONObject = new JSONObject(this.Ht.NOt);
        } catch (JSONException unused) {
            jSONObject = null;
        }
        com.bytedance.sdk.component.adexpress.dynamic.uR.FA faZRu = ZRu(uR.ZRu(this.ZRu, jSONObject), (com.bytedance.sdk.component.adexpress.dynamic.uR.FA) null);
        ZRu(faZRu);
        TFq tFq = new TFq(d10, i10, d11, str, sal);
        TFq.ZRu zRu = new TFq.ZRu();
        ZRu zRu2 = this.uR;
        zRu.ZRu = zRu2.ZRu;
        zRu.NOt = zRu2.NOt;
        zRu.mZ = 0.0f;
        tFq.ZRu(zRu);
        tFq.ZRu(faZRu, 0.0f, 0.0f);
        tFq.ZRu();
        com.bytedance.sdk.component.adexpress.dynamic.uR.NOt nOt = tFq.ZRu;
        if (nOt.uR == 65536.0f) {
            return null;
        }
        return nOt.Ht;
    }

    private void ZRu(com.bytedance.sdk.component.adexpress.dynamic.uR.FA fa2) {
        int iZRu;
        if (fa2 == null) {
            return;
        }
        if (com.bytedance.sdk.component.adexpress.ZRu.ZRu.ZRu.ZRu().mZ() != null) {
            iZRu = com.bytedance.sdk.component.adexpress.ZRu.ZRu.ZRu.ZRu().mZ().oK();
        } else {
            iZRu = com.bytedance.sdk.component.adexpress.uR.FA.ZRu(com.bytedance.sdk.component.adexpress.uR.ZRu());
        }
        int iNOt = com.bytedance.sdk.component.adexpress.uR.FA.NOt(com.bytedance.sdk.component.adexpress.uR.ZRu(), iZRu);
        ZRu zRu = this.uR;
        float fMin = zRu.mZ ? zRu.ZRu : Math.min(zRu.ZRu, iNOt);
        if (this.uR.NOt == 0.0f) {
            fa2.TFq(fMin);
            fa2.aT().TFq().aT(N.f218775c);
            fa2.Ht(0.0f);
        } else {
            fa2.TFq(fMin);
            int iNOt2 = com.bytedance.sdk.component.adexpress.uR.FA.NOt(com.bytedance.sdk.component.adexpress.uR.ZRu(), com.bytedance.sdk.component.adexpress.uR.FA.NOt(com.bytedance.sdk.component.adexpress.uR.ZRu()));
            ZRu zRu2 = this.uR;
            fa2.Ht(zRu2.mZ ? zRu2.NOt : Math.min(zRu2.NOt, iNOt2));
            fa2.aT().TFq().aT("fixed");
        }
    }

    public com.bytedance.sdk.component.adexpress.dynamic.uR.FA ZRu(JSONObject jSONObject, com.bytedance.sdk.component.adexpress.dynamic.uR.FA fa2) {
        int length;
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString("type");
        if (TextUtils.equals(strOptString, "custom-component-vessel")) {
            int iOptInt = jSONObject.optInt("componentId");
            if (this.Ht != null) {
                mZ mZVar = new mZ();
                this.TFq = mZVar;
                JSONObject jSONObjectZRu = mZVar.ZRu(this.Ht.ZRu, iOptInt, jSONObject);
                if (jSONObjectZRu != null) {
                    jSONObject = jSONObjectZRu;
                }
            }
        }
        com.bytedance.sdk.component.adexpress.dynamic.uR.FA faZRu = ZRu(jSONObject);
        faZRu.ZRu(fa2);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("children");
        if (jSONArrayOptJSONArray == null) {
            faZRu.ZRu((List<com.bytedance.sdk.component.adexpress.dynamic.uR.FA>) null);
            return faZRu;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
            JSONArray jSONArrayOptJSONArray2 = jSONArrayOptJSONArray.optJSONArray(i10);
            if (jSONArrayOptJSONArray2 != null) {
                ArrayList arrayList3 = new ArrayList();
                if (TextUtils.equals(strOptString, "tag-group")) {
                    length = faZRu.aT().TFq().IOC();
                } else {
                    length = jSONArrayOptJSONArray2.length();
                }
                for (int i11 = 0; i11 < length; i11++) {
                    com.bytedance.sdk.component.adexpress.dynamic.uR.FA faZRu2 = ZRu(jSONArrayOptJSONArray2.optJSONObject(i11), faZRu);
                    if (com.bytedance.sdk.component.adexpress.uR.NOt() && "skip-with-time".equals(faZRu.aT().NOt()) && !"transparent".equals(faZRu.Zf()) && !TextUtils.isEmpty(faZRu.Zf())) {
                        faZRu2.mZ(faZRu.Zf());
                    }
                    arrayList.add(faZRu2);
                    arrayList3.add(faZRu2);
                }
                arrayList2.add(arrayList3);
            }
        }
        if (arrayList.size() > 0) {
            faZRu.ZRu(arrayList);
        }
        if (arrayList2.size() > 0) {
            faZRu.NOt(arrayList2);
        }
        return faZRu;
    }

    public com.bytedance.sdk.component.adexpress.dynamic.uR.FA ZRu(JSONObject jSONObject) {
        String strZRu;
        JSONObject jSONObject2;
        String strOptString = jSONObject.optString("type");
        String strOptString2 = jSONObject.optString("id");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(a0.f114167g);
        Vor.ZRu(strOptString, jSONObjectOptJSONObject);
        JSONObject jSONObjectZRu = Vor.ZRu(strOptString, Vor.ZRu(jSONObject.optJSONArray("sceneValues")), jSONObjectOptJSONObject);
        com.bytedance.sdk.component.adexpress.dynamic.uR.FA fa2 = new com.bytedance.sdk.component.adexpress.dynamic.uR.FA();
        if (TextUtils.isEmpty(strOptString2)) {
            fa2.NOt(String.valueOf(fa2.hashCode()));
        } else {
            fa2.NOt(strOptString2);
        }
        if (jSONObjectOptJSONObject != null) {
            NOt(fa2);
            fa2.mZ((float) jSONObjectOptJSONObject.optDouble("x"));
            fa2.uR((float) jSONObjectOptJSONObject.optDouble("y"));
            fa2.TFq((float) jSONObjectOptJSONObject.optDouble(InMobiNetworkValues.WIDTH));
            fa2.Ht((float) jSONObjectOptJSONObject.optDouble(InMobiNetworkValues.HEIGHT));
            fa2.Mm(jSONObjectOptJSONObject.optInt("remainWidth"));
            com.bytedance.sdk.component.adexpress.dynamic.uR.TFq tFq = new com.bytedance.sdk.component.adexpress.dynamic.uR.TFq();
            tFq.ZRu(strOptString);
            tFq.NOt(jSONObjectOptJSONObject.optString("data"));
            tFq.mZ(jSONObjectOptJSONObject.optString("dataExtraInfo"));
            com.bytedance.sdk.component.adexpress.dynamic.uR.Ht htZRu = com.bytedance.sdk.component.adexpress.dynamic.uR.Ht.ZRu(jSONObjectOptJSONObject);
            tFq.ZRu(htZRu);
            com.bytedance.sdk.component.adexpress.dynamic.uR.Ht htZRu2 = com.bytedance.sdk.component.adexpress.dynamic.uR.Ht.ZRu(jSONObjectZRu);
            if (htZRu2 == null) {
                tFq.NOt(htZRu);
            } else {
                tFq.NOt(htZRu2);
            }
            ZRu(htZRu);
            ZRu(htZRu2);
            if (TextUtils.equals(strOptString, "video-image-budget") && (jSONObject2 = this.NOt) != null) {
                ZRu(tFq, jSONObject2.optInt("image_mode"));
            }
            String strNOt = tFq.NOt();
            com.bytedance.sdk.component.adexpress.dynamic.uR.Ht htTFq = tFq.TFq();
            if (Mm.containsKey(strNOt) && !htTFq.Np()) {
                htTFq.OCA(Mm.get(strNOt));
            }
            if (htTFq.Np()) {
                strZRu = tFq.mZ();
            } else {
                strZRu = ZRu(tFq.mZ());
            }
            if (com.bytedance.sdk.component.adexpress.uR.NOt()) {
                if (TextUtils.equals(strNOt, "star") || TextUtils.equals(strNOt, "text_star")) {
                    strZRu = ZRu("dynamic_creative.score_exact_i18n|");
                }
                if (TextUtils.equals(strNOt, "score-count") || TextUtils.equals(strNOt, "score-count-type-1") || TextUtils.equals(strNOt, "score-count-type-2")) {
                    strZRu = ZRu("dynamic_creative.comment_num_i18n|");
                }
                if ("root".equals(strNOt) && htZRu.YuF()) {
                    strZRu = ZRu("image.0.url");
                }
            }
            if (!TextUtils.isEmpty(ZRu()) && (TextUtils.equals("logo-union", strOptString) || TextUtils.equals("logo", strOptString))) {
                StringBuilder sbA = f.a(strZRu, "adx:");
                sbA.append(ZRu());
                tFq.NOt(sbA.toString());
            } else {
                tFq.NOt(strZRu);
            }
            fa2.ZRu(tFq);
        }
        return fa2;
    }

    private void ZRu(com.bytedance.sdk.component.adexpress.dynamic.uR.TFq tFq, int i10) {
        int iLastIndexOf;
        if (i10 != 5 && i10 != 15 && i10 != 50 && i10 != 154) {
            tFq.ZRu("image");
            String strZRu = Vor.ZRu("image");
            com.bytedance.sdk.component.adexpress.dynamic.uR.Ht htTFq = tFq.TFq();
            htTFq.OCA(strZRu);
            tFq.Mm().OCA(strZRu);
            String strZRu2 = Vor.ZRu("image", "clickArea");
            if (!TextUtils.isEmpty(strZRu2)) {
                htTFq.oK(strZRu2);
                tFq.Mm().oK(strZRu2);
            }
            JSONObject jSONObjectANu = htTFq.aNu();
            if (jSONObjectANu != null) {
                htTFq.Zf(jSONObjectANu.optString("imageLottieTosPath"));
                htTFq.lp(jSONObjectANu.optBoolean("animationsLoop"));
                htTFq.MR(jSONObjectANu.optInt("lottieAppNameMaxLength"));
                htTFq.Nb(jSONObjectANu.optInt("lottieAdDescMaxLength"));
                htTFq.fcs(jSONObjectANu.optInt("lottieAdTitleMaxLength"));
            }
            tFq.NOt(strZRu);
            if (strZRu != null && (iLastIndexOf = strZRu.lastIndexOf(IconCache.EMPTY_CLASS_NAME)) > 0) {
                String strSubstring = strZRu.substring(0, iLastIndexOf);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(InMobiNetworkValues.WIDTH, ZRu(strSubstring + ".width"));
                    jSONObject.put(InMobiNetworkValues.HEIGHT, ZRu(strSubstring + ".height"));
                } catch (JSONException unused) {
                }
                tFq.mZ(jSONObject.toString());
            }
            htTFq.jQo();
            return;
        }
        tFq.ZRu("video");
        String strZRu3 = Vor.ZRu("video");
        tFq.TFq().OCA(strZRu3);
        String strZRu4 = Vor.ZRu("video", "clickArea");
        if (!TextUtils.isEmpty(strZRu4)) {
            tFq.TFq().oK(strZRu4);
            tFq.Mm().oK(strZRu4);
        }
        tFq.Mm().OCA(strZRu3);
        tFq.NOt(strZRu3);
        tFq.TFq().cb();
    }

    private String ZRu(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        for (String str2 : str.split("\\|")) {
            if (this.mZ.NOt(str2)) {
                String strValueOf = String.valueOf(this.mZ.ZRu(str2));
                if (!TextUtils.isEmpty(strValueOf)) {
                    return strValueOf;
                }
            }
        }
        return "";
    }

    private String ZRu() {
        com.bytedance.sdk.component.adexpress.dynamic.uR.mZ mZVar = this.mZ;
        if (mZVar == null) {
            return "";
        }
        return String.valueOf(mZVar.ZRu("adx_name"));
    }

    private void ZRu(com.bytedance.sdk.component.adexpress.dynamic.uR.Ht ht) {
        if (ht == null) {
            return;
        }
        String strVdW = ht.VdW();
        if (com.bytedance.sdk.component.adexpress.uR.NOt()) {
            String strMZ = com.bytedance.sdk.component.adexpress.uR.FA.mZ(com.bytedance.sdk.component.adexpress.uR.ZRu());
            if ("zh".equals(strMZ)) {
                strMZ = "cn";
            }
            if (!TextUtils.isEmpty(strMZ) && ht.Ht() != null) {
                String strOptString = ht.Ht().optString(strMZ);
                if (!TextUtils.isEmpty(strOptString)) {
                    strVdW = strOptString;
                }
            }
        }
        if (TextUtils.isEmpty(strVdW)) {
            return;
        }
        int iIndexOf = strVdW.indexOf("{{");
        int iIndexOf2 = strVdW.indexOf("}}");
        if (iIndexOf >= 0 && iIndexOf2 >= 0 && iIndexOf2 >= iIndexOf) {
            String strZRu = ZRu(strVdW.substring(iIndexOf + 2, iIndexOf2));
            StringBuilder sb2 = new StringBuilder(strVdW.substring(0, iIndexOf));
            if (!TextUtils.isEmpty(strZRu)) {
                sb2.append(strZRu);
            }
            sb2.append(strVdW.substring(iIndexOf2 + 2));
            ht.lp(sb2.toString());
            return;
        }
        ht.lp(strVdW);
    }
}
