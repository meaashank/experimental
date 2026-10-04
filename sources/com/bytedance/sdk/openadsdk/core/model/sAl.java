package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class sAl {
    private final int NOt;
    private final int ZRu;
    private final int mZ;
    private final int uR;

    public sAl(JSONObject jSONObject) {
        this.ZRu = jSONObject.optInt("auto_click", 0);
        this.NOt = jSONObject.optInt("close_jump_probability", 0);
        this.mZ = jSONObject.optInt("skip_jump_probability", 0);
        this.uR = jSONObject.optInt("hidden_bar", 0);
    }

    public int NOt() {
        int i10 = this.NOt;
        if (i10 < 0 || i10 > 100) {
            return 0;
        }
        return i10;
    }

    public JSONObject TFq() {
        try {
            JSONObject jSONObject = new JSONObject();
            int i10 = this.ZRu;
            if (i10 == 1) {
                jSONObject.put("auto_click", i10);
            }
            int i11 = this.NOt;
            if (i11 > 0 && i11 <= 100) {
                jSONObject.put("close_jump_probability", i11);
            }
            int i12 = this.mZ;
            if (i12 > 0 && i12 <= 100) {
                jSONObject.put("skip_jump_probability", i12);
            }
            if (this.uR == 1) {
                jSONObject.put("hidden_bar", 1);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public int ZRu() {
        return this.ZRu;
    }

    public int mZ() {
        int i10 = this.mZ;
        if (i10 < 0 || i10 > 100) {
            return 0;
        }
        return i10;
    }

    public boolean uR() {
        return this.uR == 1;
    }

    public static boolean ZRu(qF qFVar) {
        if (qFVar == null || !qFVar.wcb() || qFVar.rd() == null) {
            return false;
        }
        return qFVar.rd().uR();
    }
}
