package com.bytedance.sdk.component.ZRu;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class oK {
    private final Map<String, Object> ZRu = new ConcurrentHashMap();

    private oK() {
    }

    public static oK ZRu() {
        return new oK();
    }

    public String NOt() {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, Object> entry : this.ZRu.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    public oK ZRu(String str, Object obj) {
        if (!TextUtils.isEmpty(str) && obj != null) {
            this.ZRu.put(str, obj);
        }
        return this;
    }
}
