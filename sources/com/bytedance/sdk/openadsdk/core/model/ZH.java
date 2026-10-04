package com.bytedance.sdk.openadsdk.core.model;

import androidx.annotation.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class ZH {
    private String NOt;
    private String ZRu;
    private int mZ;

    public String NOt() {
        return this.NOt;
    }

    public String ZRu() {
        return this.ZRu;
    }

    public int mZ() {
        return this.mZ;
    }

    @Nullable
    public JSONObject uR() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("u", this.ZRu);
            jSONObject.put("ft", this.mZ);
            jSONObject.put("fu", this.NOt);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public void NOt(String str) {
        this.NOt = str;
    }

    public void ZRu(String str) {
        this.ZRu = str;
    }

    public void ZRu(int i10) {
        this.mZ = i10;
    }
}
