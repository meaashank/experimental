package com.bytedance.sdk.component.adexpress.dynamic.uR;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class uR {
    public String NOt;
    public List<ZRu> ZRu;
    public String mZ;
    public String uR;

    public static class ZRu {
        public JSONObject NOt;
        public int ZRu;
    }

    public static uR ZRu(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        uR uRVar = new uR();
        String strOptString = jSONObject.optString("custom_components");
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(strOptString);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    ZRu zRu = new ZRu();
                    zRu.ZRu = jSONObjectOptJSONObject.optInt("id");
                    zRu.NOt = new JSONObject(jSONObjectOptJSONObject.optString("componentLayout"));
                    arrayList.add(zRu);
                }
            }
        } catch (JSONException unused) {
        }
        uRVar.ZRu = arrayList;
        uRVar.NOt = jSONObject.optString("diff_data");
        uRVar.mZ = jSONObject.optString("style_diff");
        uRVar.uR = jSONObject.optString("tag_diff");
        return uRVar;
    }
}
