package com.bytedance.sdk.openadsdk.core.ZH;

import android.text.TextUtils;
import com.bykv.vk.openvk.preload.geckox.d.j;
import com.bytedance.sdk.openadsdk.core.Vor;
import com.bytedance.sdk.openadsdk.core.lp;
import com.bytedance.sdk.openadsdk.core.model.qF;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.prism.gaia.client.stub.PermissionListActivity;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class mZ {
    private static String ZRu = "";

    public static boolean NOt(qF qFVar) {
        return qFVar != null && qFVar.le() == 10;
    }

    public static boolean ZRu(int i10) {
        return i10 == 10 || i10 == 9;
    }

    private static JSONArray mZ(qF qFVar) {
        try {
            qF.ZRu zRuHo = qFVar.Ho();
            if (zRuHo == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(zRuHo.ZH());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt("original_price", Double.valueOf(jSONObject.optDouble("original_price", 0.0d)));
            jSONObject2.putOpt("price_unit", jSONObject.optString("price_unit"));
            jSONObject2.putOpt(FirebaseAnalytics.Param.DISCOUNT, Double.valueOf(jSONObject.optDouble(FirebaseAnalytics.Param.DISCOUNT, 0.0d)));
            jSONObject2.putOpt("product_name", jSONObject.optString("dpa_product_name"));
            jSONObject2.putOpt("description", jSONObject.optString("dpa_description"));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("dpa_images");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                jSONObject2.putOpt("image", jSONArrayOptJSONArray.get(0));
            }
            jSONObject2.putOpt("brand_name", jSONObject.optString("dpa_brand_name"));
            jSONObject2.putOpt("sale_price_i18n", Integer.valueOf(jSONObject.optInt("sale_price_i18n")));
            jSONObject2.putOpt("real_price", Double.valueOf(jSONObject.optDouble("real_price", 0.0d)));
            jSONObject2.put("button_text", qFVar.GC());
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("dpa_related_products");
            if (jSONArrayOptJSONArray2 != null) {
                jSONArray.put(jSONObject2);
                for (int i10 = 0; i10 < jSONArrayOptJSONArray2.length(); i10++) {
                    try {
                        JSONObject jSONObject3 = jSONArrayOptJSONArray2.getJSONObject(i10);
                        jSONObject3.put("button_text", qFVar.GC());
                        jSONArray.put(jSONObject3);
                    } catch (Throwable unused) {
                    }
                }
            }
            return jSONArray;
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static JSONObject ZRu(qF qFVar, String str) {
        JSONObject jSONObjectHZ = qFVar.HZ();
        try {
            jSONObjectHZ.put("show_dislike", qFVar.hNL());
            jSONObjectHZ.put("language", lp.ZRu());
            if ("open_ad".equals(str)) {
                JSONObject jSONObject = new JSONObject();
                String strHt = Vor.NOt().Ht();
                int iMm = Vor.NOt().Mm();
                jSONObject.put(PermissionListActivity.f164366k, strHt);
                jSONObject.put("app_icon_id", "@".concat(String.valueOf(iMm)));
                jSONObjectHZ.put("open_app_info", jSONObject);
            }
            jSONObjectHZ.put("os", "Android");
            JSONArray jSONArrayMZ = mZ(qFVar);
            if (jSONArrayMZ != null) {
                jSONObjectHZ.put("dpa_data", jSONArrayMZ);
            }
            return jSONObjectHZ;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lp.ZRu("UgenUtils", "parseUGenDataInfo exception", th.getMessage());
            return jSONObjectHZ;
        }
    }

    public static boolean ZRu(qF qFVar) {
        return qFVar != null && qFVar.le() == 7;
    }

    public static String ZRu() {
        return ZRu;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r4v2 */
    public static JSONObject ZRu(qF qFVar, com.bytedance.sdk.openadsdk.core.ZH.TFq.mZ mZVar) {
        qF.ZRu zRuHo;
        JSONObject jSONObject;
        mZVar.ZRu("ad");
        String strWMI = "";
        ZRu = "";
        ?? r42 = 0;
        try {
            zRuHo = qFVar.Ho();
            if (zRuHo != null) {
                strWMI = zRuHo.WMI();
                if (TextUtils.isEmpty(strWMI) && !TextUtils.isEmpty(zRuHo.yBV()) && !TextUtils.isEmpty(zRuHo.Ht())) {
                    strWMI = com.bytedance.sdk.openadsdk.core.ZH.ZRu.NOt.ZRu().ZRu("ad", zRuHo.Ht(), zRuHo.yBV());
                }
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (!TextUtils.isEmpty(strWMI)) {
                try {
                    jSONObject = new JSONObject(strWMI);
                } catch (JSONException unused) {
                }
                try {
                    ZRu = "getTemplate success";
                    mZVar.NOt(ImagesContract.LOCAL);
                    return jSONObject;
                } catch (JSONException unused2) {
                    String strConcat = "parse json exception data is ".concat(String.valueOf(strWMI));
                    ZRu = strConcat;
                    mZVar.ZRu(2, strConcat, ImagesContract.LOCAL);
                    return null;
                }
            }
            String str = "local data is null id is " + zRuHo.Ht() + " md5 is " + zRuHo.yBV();
            ZRu = str;
            mZVar.ZRu(3, str, "net");
            return null;
        } catch (Throwable th2) {
            r42 = zRuHo;
            th = th2;
            String strA = j.a(th, new StringBuilder("get template error "));
            ZRu = strA;
            mZVar.ZRu(2, strA, ImagesContract.LOCAL);
            return r42;
        }
    }
}
