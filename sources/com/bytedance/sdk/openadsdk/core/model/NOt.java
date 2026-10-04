package com.bytedance.sdk.openadsdk.core.model;

import com.bytedance.sdk.openadsdk.AdSlot;
import java.util.ArrayList;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONObject;
import s0.x;

/* JADX INFO: loaded from: classes3.dex */
public class NOt {
    public int NOt;
    public AdSlot TFq;
    public String ZRu;
    public int mZ = 1;
    public ArrayList<Integer> uR;

    public int NOt() {
        return this.NOt;
    }

    public ArrayList<Integer> TFq() {
        return this.uR;
    }

    public String ZRu() {
        return this.ZRu;
    }

    public int mZ() {
        return this.mZ;
    }

    public AdSlot uR() {
        return this.TFq;
    }

    public void NOt(int i10) {
        this.mZ = i10;
    }

    public void ZRu(String str) {
        this.ZRu = str;
    }

    public void ZRu(int i10) {
        this.NOt = i10;
    }

    public void ZRu(AdSlot adSlot) {
        this.TFq = adSlot;
    }

    public void ZRu(ArrayList<Integer> arrayList) {
        this.uR = arrayList;
    }

    public static void ZRu(NOt nOt) {
        int iNOt;
        if (nOt == null || nOt.uR() == null || (iNOt = nOt.NOt()) >= 0 || iNOt == -8) {
            return;
        }
        com.bytedance.sdk.openadsdk.edo.mZ.ZRu();
        com.bytedance.sdk.openadsdk.edo.mZ.ZRu("rd_client_custom_error", false, new com.bytedance.sdk.openadsdk.edo.NOt() { // from class: com.bytedance.sdk.openadsdk.core.model.NOt.1
            @Override // com.bytedance.sdk.openadsdk.edo.NOt
            public com.bytedance.sdk.openadsdk.edo.ZRu.mZ getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(x.h.f238400c, NOt.this.mZ());
                jSONObject.put("err_code", NOt.this.NOt());
                jSONObject.put("server_res_str", NOt.this.ZRu());
                if (NOt.this.TFq() != null && NOt.this.TFq().size() > 0) {
                    jSONObject.put("mate_unavailable_code_list", new JSONArray((Collection) NOt.this.TFq()).toString());
                }
                return com.bytedance.sdk.openadsdk.edo.ZRu.uR.NOt().ZRu("rd_client_custom_error").ZRu(NOt.this.uR().getDurationSlotType()).NOt(jSONObject.toString());
            }
        });
    }
}
