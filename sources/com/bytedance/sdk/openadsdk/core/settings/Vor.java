package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class Vor {
    public static final Vor ZRu = new Vor("");
    private final HashMap<String, ZRu> NOt = new HashMap<>();

    public static class ZRu {
        public String NOt;
        public String TFq;
        public final String ZRu;
        public int mZ;
        public int uR;

        public ZRu(JSONObject jSONObject) {
            this.ZRu = jSONObject.optString("name");
            this.NOt = jSONObject.optString("app_id");
            this.mZ = jSONObject.optInt("init_thread", 2);
            this.uR = jSONObject.optInt("request_after_init", 2);
            this.TFq = jSONObject.optString("class_name");
        }
    }

    public Vor(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    ZRu zRu = new ZRu(jSONObjectOptJSONObject);
                    this.NOt.put(zRu.ZRu, zRu);
                }
            }
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.lp.ZRu("MediationInitConfigs", e10.getMessage());
        }
    }
}
