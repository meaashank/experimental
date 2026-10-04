package com.bytedance.sdk.component.adexpress.dynamic.TFq;

import androidx.lifecycle.a0;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import u.e;

/* JADX INFO: loaded from: classes2.dex */
public class Vor {
    public static String NOt(String str, String str2) {
        if (!com.bytedance.sdk.component.adexpress.uR.NOt()) {
            return ZRu.ZRu(str);
        }
        if (str.indexOf(46) < 0) {
            str = str.concat(e.f239314f);
        }
        return androidx.concurrent.futures.a.a(str2, "static/images/", str);
    }

    public static void ZRu(String str, JSONObject jSONObject) {
        JSONObject jSONObjectWZ = com.bytedance.sdk.component.adexpress.NOt.wZ(str);
        if (jSONObjectWZ == null) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        JSONObject jSONObjectOptJSONObject = jSONObjectWZ.optJSONObject(a0.f114167g);
        if (jSONObjectOptJSONObject == null) {
            return;
        }
        ZRu(jSONObjectOptJSONObject, jSONObject);
    }

    public static JSONObject ZRu(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObjectWZ = com.bytedance.sdk.component.adexpress.NOt.wZ(str);
        if (jSONObjectWZ == null) {
            return null;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        return ZRu(jSONObject2, jSONObjectWZ.optJSONObject("themeValues"), jSONObject);
    }

    private static void ZRu(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        if (jSONObject == null) {
            return;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!jSONObject2.has(next)) {
                try {
                    jSONObject2.put(next, jSONObject.opt(next));
                } catch (JSONException unused) {
                }
            }
        }
    }

    public static JSONObject ZRu(JSONObject... jSONObjectArr) {
        JSONObject jSONObject = new JSONObject();
        for (JSONObject jSONObject2 : jSONObjectArr) {
            if (jSONObject2 != null) {
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    try {
                        jSONObject.put(next, jSONObject2.opt(next));
                    } catch (JSONException unused) {
                    }
                }
            }
        }
        return jSONObject;
    }

    public static String ZRu(String str) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectWZ = com.bytedance.sdk.component.adexpress.NOt.wZ(str);
        if (jSONObjectWZ == null || (jSONObjectOptJSONObject = jSONObjectWZ.optJSONObject(a0.f114167g)) == null) {
            return null;
        }
        return jSONObjectOptJSONObject.optString("data");
    }

    public static String ZRu(String str, String str2) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectWZ = com.bytedance.sdk.component.adexpress.NOt.wZ(str);
        if (jSONObjectWZ == null || (jSONObjectOptJSONObject = jSONObjectWZ.optJSONObject(a0.f114167g)) == null) {
            return null;
        }
        return jSONObjectOptJSONObject.optString(str2);
    }

    public static JSONObject ZRu(JSONArray jSONArray) {
        JSONObject jSONObjectOptJSONObject;
        if (jSONArray == null || jSONArray.length() <= 0 || (jSONObjectOptJSONObject = jSONArray.optJSONObject(0)) == null) {
            return null;
        }
        return jSONObjectOptJSONObject.optJSONObject(a0.f114167g);
    }
}
