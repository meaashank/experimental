package com.bytedance.sdk.openadsdk.core.model;

import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class TFq {
    private int Ht;
    private int Mm;
    private int NOt;
    private List<String> TFq;
    private int ZRu;
    private List<Integer> mZ;
    private int uR;

    public JSONObject FA() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("interceptor_x", this.ZRu);
            jSONObject.put("interceptor_y", this.NOt);
            if (this.mZ != null) {
                JSONArray jSONArray = new JSONArray();
                Iterator<Integer> it = this.mZ.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().intValue());
                }
                jSONObject.put("interceptor_page", jSONArray);
            }
            jSONObject.put("interceptor_interval_time", this.uR);
            if (this.TFq != null) {
                JSONArray jSONArray2 = new JSONArray();
                Iterator<String> it2 = this.TFq.iterator();
                while (it2.hasNext()) {
                    jSONArray2.put(it2.next());
                }
                jSONObject.put("url_regular", jSONArray2);
            }
            jSONObject.put("is_act", this.Ht);
            jSONObject.put("boc_index", this.Mm);
            return jSONObject;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lp.NOt(th.getMessage());
            return jSONObject;
        }
    }

    public List<Integer> Ht() {
        return this.mZ;
    }

    public int Mm() {
        return this.uR;
    }

    public int NOt() {
        int i10 = this.Mm;
        if (i10 >= 2) {
            return i10;
        }
        return 0;
    }

    public int TFq() {
        return this.NOt;
    }

    public boolean ZRu() {
        return this.Ht == 1;
    }

    public List<String> mZ() {
        return this.TFq;
    }

    public int uR() {
        return this.ZRu;
    }

    public void NOt(int i10) {
        this.Mm = i10;
    }

    public void TFq(int i10) {
        this.uR = i10;
    }

    public void ZRu(int i10) {
        this.Ht = i10;
    }

    public void mZ(int i10) {
        this.ZRu = i10;
    }

    public void uR(int i10) {
        this.NOt = i10;
    }

    public void NOt(List<Integer> list) {
        this.mZ = list;
    }

    public void ZRu(List<String> list) {
        this.TFq = list;
    }
}
