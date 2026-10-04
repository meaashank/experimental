package com.bytedance.adsdk.ugeno.core;

import android.content.Context;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class FA {
    private JSONObject NOt;
    private Context ZRu;
    private JSONObject mZ;
    private Map<String, Object> uR;

    public void NOt(JSONObject jSONObject) {
        this.mZ = jSONObject;
    }

    public void ZRu(Context context) {
        this.ZRu = context;
    }

    public Map<String, Object> NOt() {
        return this.uR;
    }

    public void ZRu(JSONObject jSONObject) {
        this.NOt = jSONObject;
    }

    public JSONObject ZRu() {
        return this.mZ;
    }

    public void ZRu(Map<String, Object> map) {
        this.uR = map;
    }
}
