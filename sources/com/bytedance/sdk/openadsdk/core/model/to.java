package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class to {
    private String NOt;
    private String ZRu;
    private int mZ;
    private int uR;

    public void NOt(String str) {
        this.NOt = str;
    }

    public void ZRu(String str) {
        this.ZRu = str;
    }

    public JSONObject mZ() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.ZRu)) {
                jSONObject.put("market_dpl", this.ZRu);
            }
            if (!TextUtils.isEmpty(this.NOt)) {
                jSONObject.put("market_dpl_auto", this.NOt);
            }
            jSONObject.put("exec_type", this.mZ);
            jSONObject.put("oem_vendor_type", this.uR);
            return jSONObject;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lp.ZRu("OemModel", th.getMessage());
            return null;
        }
    }

    public void NOt(int i10) {
        this.uR = i10;
    }

    public void ZRu(int i10) {
        this.mZ = i10;
    }

    public String NOt() {
        if (this.mZ == 2) {
            return this.NOt;
        }
        return this.ZRu;
    }

    public boolean ZRu() {
        return this.uR == 1;
    }

    public static to ZRu(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        to toVar = new to();
        try {
            toVar.ZRu(jSONObject.optString("market_dpl", ""));
            toVar.NOt(jSONObject.optString("market_dpl_auto", ""));
            toVar.ZRu(jSONObject.optInt("exec_type", 0));
            toVar.NOt(jSONObject.optInt("oem_vendor_type", 0));
            return toVar;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lp.ZRu("OemModel", th.getMessage());
            return toVar;
        }
    }
}
