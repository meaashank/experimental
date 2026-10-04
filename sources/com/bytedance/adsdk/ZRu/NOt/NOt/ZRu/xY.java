package com.bytedance.adsdk.ZRu.NOt.NOt.ZRu;

import android.support.v4.media.e;
import android.text.TextUtils;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class xY implements com.bytedance.adsdk.ZRu.NOt.NOt.ZRu {
    private final String ZRu;

    public xY(String str) {
        this.ZRu = str;
    }

    @Override // com.bytedance.adsdk.ZRu.NOt.NOt.ZRu
    public String NOt() {
        return this.ZRu;
    }

    @Override // com.bytedance.adsdk.ZRu.NOt.NOt.ZRu
    public Object ZRu(Map<String, JSONObject> map) {
        Object objZRu;
        if (map == null || map.size() <= 0 || (objZRu = ZRu(this.ZRu, map.get("default_key"))) == JSONObject.NULL) {
            return null;
        }
        return objZRu;
    }

    public String toString() {
        return e.a(new StringBuilder("VariableNode [literals="), this.ZRu, "]");
    }

    @Override // com.bytedance.adsdk.ZRu.NOt.NOt.ZRu
    public com.bytedance.adsdk.ZRu.NOt.uR.TFq ZRu() {
        return com.bytedance.adsdk.ZRu.NOt.uR.Ht.VARIABLE;
    }

    public Object ZRu(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return ZRu(str.split("\\."), 0, jSONObject);
    }

    private Object ZRu(String[] strArr, int i10, JSONObject jSONObject) {
        Object objOpt;
        if (strArr != null && strArr.length > 0 && i10 < strArr.length && jSONObject != null) {
            String str = strArr[i10];
            int iIndexOf = str.indexOf("[");
            int iIndexOf2 = str.indexOf("]");
            if (iIndexOf >= 0 && iIndexOf2 >= 0 && iIndexOf <= iIndexOf2) {
                String strSubstring = str.substring(0, iIndexOf);
                try {
                    int i11 = Integer.parseInt(str.substring(iIndexOf + 1, iIndexOf2));
                    Object objOpt2 = jSONObject.opt(strSubstring);
                    objOpt = objOpt2 instanceof JSONArray ? ((JSONArray) objOpt2).opt(i11) : null;
                } catch (NumberFormatException unused) {
                    return null;
                }
            } else {
                objOpt = jSONObject.opt(str);
            }
            if (i10 == strArr.length - 1) {
                return objOpt;
            }
            if (objOpt instanceof String) {
                try {
                    return ZRu(strArr, i10 + 1, new JSONObject((String) objOpt));
                } catch (JSONException unused2) {
                    return objOpt;
                }
            }
            if (objOpt instanceof JSONObject) {
                return ZRu(strArr, i10 + 1, (JSONObject) objOpt);
            }
        }
        return null;
    }
}
