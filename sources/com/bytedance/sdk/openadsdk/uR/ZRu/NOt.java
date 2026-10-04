package com.bytedance.sdk.openadsdk.uR.ZRu;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONObject;
import s0.x;

/* JADX INFO: loaded from: classes3.dex */
public class NOt {
    public int uR;
    public AtomicInteger ZRu = new AtomicInteger(0);
    public AtomicInteger NOt = new AtomicInteger(0);
    public AtomicLong mZ = new AtomicLong(0);
    public AtomicInteger TFq = new AtomicInteger(0);
    public Map<Integer, Integer> Ht = new HashMap();
    public AtomicBoolean Mm = new AtomicBoolean(false);

    public NOt(int i10) {
        this.uR = i10;
    }

    public JSONObject NOt() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("success", this.ZRu.get());
            jSONObject.put("fail", this.NOt.get());
            jSONObject.put("type", this.uR);
            jSONObject.put("time", this.TFq.get());
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public JSONObject ZRu() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("success", this.ZRu.get());
            jSONObject.put("fail", this.NOt.get());
            jSONObject.put("type", this.uR);
            jSONObject.put(x.h.f238399b, this.mZ.get() / ((long) this.ZRu.get()));
            JSONObject jSONObject2 = new JSONObject();
            if (this.Ht.size() > 0) {
                for (Map.Entry<Integer, Integer> entry : this.Ht.entrySet()) {
                    jSONObject2.put(String.valueOf(entry.getKey()), entry.getValue());
                }
            }
            jSONObject.put("fail_error_code", jSONObject2);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }
}
