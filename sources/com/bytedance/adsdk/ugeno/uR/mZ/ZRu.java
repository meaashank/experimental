package com.bytedance.adsdk.ugeno.uR.mZ;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.uR.Ht;
import com.bytedance.adsdk.ugeno.uR.Mm;
import com.bytedance.adsdk.ugeno.uR.NOt;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ZRu {
    protected Context FA;
    protected String Ht;
    protected String Mm;
    protected com.bytedance.adsdk.ugeno.NOt.mZ NOt;
    protected Map<String, String> TFq;
    protected Mm ZRu;
    protected com.bytedance.adsdk.ugeno.uR.NOt mZ;
    protected NOt.ZRu uR;

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.uR.mZ.ZRu$ZRu, reason: collision with other inner class name */
    public static class C0398ZRu {
        public static ZRu ZRu(Context context, com.bytedance.adsdk.ugeno.NOt.mZ mZVar, JSONObject jSONObject, JSONObject jSONObject2) {
            com.bytedance.adsdk.ugeno.uR.NOt nOtZRu;
            NOt.ZRu ZRu;
            if (mZVar == null || jSONObject == null || (nOtZRu = com.bytedance.adsdk.ugeno.uR.NOt.ZRu(jSONObject, jSONObject2)) == null || (ZRu = nOtZRu.ZRu()) == null) {
                return null;
            }
            if (TextUtils.equals(ZRu.ZRu(), "custom")) {
                NOt nOt = new NOt(context);
                nOt.ZRu(mZVar);
                nOt.ZRu(nOtZRu);
                nOt.ZRu();
                return nOt;
            }
            com.bytedance.adsdk.ugeno.uR.mZ mZVarZRu = Ht.ZRu(ZRu.NOt());
            if (mZVarZRu == null) {
                return null;
            }
            ZRu ZRu2 = mZVarZRu.ZRu(context);
            ZRu2.ZRu(mZVar);
            ZRu2.ZRu(nOtZRu);
            ZRu2.ZRu();
            return ZRu2;
        }
    }

    public ZRu(Context context) {
        this.FA = context;
    }

    public String NOt() {
        return this.Ht;
    }

    public void ZRu() {
        this.uR = this.mZ.ZRu();
        com.bytedance.adsdk.ugeno.uR.NOt nOt = this.mZ;
        if (nOt == null) {
            return;
        }
        NOt.ZRu ZRu = nOt.ZRu();
        this.uR = ZRu;
        if (ZRu == null) {
            return;
        }
        this.TFq = ZRu.mZ();
        this.Ht = this.uR.NOt();
        this.Mm = this.uR.ZRu();
    }

    public abstract boolean ZRu(Object... objArr);

    public void ZRu(com.bytedance.adsdk.ugeno.NOt.mZ mZVar) {
        this.NOt = mZVar;
    }

    public void ZRu(com.bytedance.adsdk.ugeno.uR.NOt nOt) {
        this.mZ = nOt;
    }

    public void ZRu(Mm mm) {
        this.ZRu = mm;
    }
}
