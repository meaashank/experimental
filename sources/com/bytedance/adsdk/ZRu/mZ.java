package com.bytedance.adsdk.ZRu;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class mZ implements TFq {
    @Override // com.bytedance.adsdk.ZRu.TFq
    /* JADX INFO: renamed from: NOt, reason: merged with bridge method [inline-methods] */
    public String ZRu(JSONObject jSONObject, Object[] objArr) {
        if (objArr == null || objArr.length != 3) {
            return null;
        }
        String strValueOf = String.valueOf(objArr[0]);
        if (TextUtils.isEmpty(strValueOf)) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(strValueOf);
            String strValueOf2 = String.valueOf(objArr[1]);
            if (TextUtils.isEmpty(strValueOf2)) {
                return null;
            }
            return jSONObject2.optString(strValueOf2, String.valueOf(objArr[2]));
        } catch (JSONException unused) {
            return null;
        }
    }
}
