package com.bytedance.adsdk.ugeno;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.adsdk.ugeno.Mm.FA;
import com.bytedance.adsdk.ugeno.core.Vor;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class NOt extends com.bytedance.adsdk.ugeno.NOt.ZRu<com.bytedance.adsdk.ugeno.Ht.NOt> {
    private float AOL;
    private float CH;
    private float CTl;
    private float Ds;
    private boolean HZ;
    private JSONArray KIc;
    private String NOt;
    private float RPV;
    private int bDW;
    private boolean cA;
    private String fOq;
    private boolean jJC;
    private com.bytedance.adsdk.ugeno.NOt.mZ pU;
    private float qZ;
    private int wcb;

    public NOt(Context context) {
        super(context);
        this.HZ = true;
        this.jJC = true;
        this.RPV = 0.0f;
        this.CTl = 2000.0f;
        this.fOq = "normal";
        this.cA = true;
        this.bDW = Color.parseColor("#666666");
        this.wcb = Color.parseColor("#ffffff");
    }

    @Override // com.bytedance.adsdk.ugeno.NOt.ZRu, com.bytedance.adsdk.ugeno.NOt.mZ
    public void NOt() {
        super.NOt();
        JSONArray jSONArray = this.KIc;
        if (jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.Ht.NOt) this.Ht).uR((int) this.Ds).TFq((int) this.qZ).Ht((int) this.CH).NOt(this.cA).NOt(this.wcb).mZ(this.bDW).ZRu(this.fOq).mZ(this.HZ).ZRu(this.AOL).ZRu(this.jJC).ZRu((int) this.CTl).NOt(this.cA);
        for (int i10 = 0; i10 < this.KIc.length(); i10++) {
            Vor vor = new Vor(this.mZ);
            vor.ZRu(this.pvl);
            com.bytedance.adsdk.ugeno.NOt.mZ<View> mZVarNOt = vor.NOt(this.pU.fcs(), null);
            vor.NOt(this.KIc.optJSONObject(i10));
            ((com.bytedance.adsdk.ugeno.Ht.NOt) this.Ht).ZRu(mZVarNOt);
        }
        if (this.jJC) {
            ((com.bytedance.adsdk.ugeno.Ht.NOt) this.Ht).ZRu();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.NOt.mZ
    public void ZRu(JSONObject jSONObject) {
    }

    @Override // com.bytedance.adsdk.ugeno.NOt.mZ
    public View uR() {
        com.bytedance.adsdk.ugeno.Ht.NOt nOt = new com.bytedance.adsdk.ugeno.Ht.NOt(this.mZ);
        this.Ht = nOt;
        nOt.ZRu((mZ) this);
        return this.Ht;
    }

    public void ZRu(com.bytedance.adsdk.ugeno.Ht.mZ mZVar) {
        T t10 = this.Ht;
        if (t10 != 0) {
            ((com.bytedance.adsdk.ugeno.Ht.NOt) t10).setOnPageChangeListener(mZVar);
        }
    }

    public void ZRu(int i10) {
        T t10 = this.Ht;
        if (t10 != 0) {
            ((com.bytedance.adsdk.ugeno.Ht.NOt) t10).Vor(i10);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.NOt.ZRu
    public void ZRu(com.bytedance.adsdk.ugeno.NOt.mZ mZVar) {
        this.pU = mZVar;
    }

    @Override // com.bytedance.adsdk.ugeno.NOt.mZ
    public void ZRu(String str, String str2) {
        super.ZRu(str, str2);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        str.getClass();
        switch (str) {
            case "delayStart":
                this.RPV = com.bytedance.adsdk.ugeno.Mm.mZ.ZRu(str2, 0.0f);
                break;
            case "indicatorColor":
                this.bDW = com.bytedance.adsdk.ugeno.Mm.ZRu.ZRu(str2);
                break;
            case "nextMargin":
                this.CH = FA.ZRu(this.mZ, com.bytedance.adsdk.ugeno.Mm.mZ.ZRu(str2, 0.0f));
                break;
            case "effect":
                this.fOq = str2;
                break;
            case "direction":
                this.NOt = str2;
                break;
            case "indicator":
                this.cA = com.bytedance.adsdk.ugeno.Mm.mZ.ZRu(str2, true);
                break;
            case "previousMargin":
                this.qZ = FA.ZRu(this.mZ, com.bytedance.adsdk.ugeno.Mm.mZ.ZRu(str2, 0.0f));
                break;
            case "loop":
                this.HZ = com.bytedance.adsdk.ugeno.Mm.mZ.ZRu(str2, true);
                break;
            case "speed":
                this.CTl = com.bytedance.adsdk.ugeno.Mm.mZ.ZRu(str2, 500.0f);
                break;
            case "pageCount":
                this.AOL = com.bytedance.adsdk.ugeno.Mm.mZ.ZRu(str2, 1.0f);
                break;
            case "pageMargin":
                this.Ds = FA.ZRu(this.mZ, com.bytedance.adsdk.ugeno.Mm.mZ.ZRu(str2, 0.0f));
                break;
            case "indicatorSelectedColor":
                this.wcb = com.bytedance.adsdk.ugeno.Mm.ZRu.ZRu(str2);
                break;
            case "autoplay":
                this.jJC = com.bytedance.adsdk.ugeno.Mm.mZ.ZRu(str2, true);
                break;
            case "dataList":
                this.KIc = com.bytedance.adsdk.ugeno.Mm.NOt.ZRu(str2, (JSONArray) null);
                break;
        }
    }
}
