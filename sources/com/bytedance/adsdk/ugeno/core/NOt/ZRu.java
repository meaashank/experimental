package com.bytedance.adsdk.ugeno.core.NOt;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.Mm.Vor;
import com.bytedance.adsdk.ugeno.core.Mm;
import com.bytedance.adsdk.ugeno.core.aT;
import com.bytedance.adsdk.ugeno.core.lp;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ZRu implements Vor.ZRu {
    private Handler Ht = new Vor(Looper.getMainLooper(), this);
    private lp NOt;
    private com.bytedance.adsdk.ugeno.NOt.mZ TFq;
    private int ZRu;
    private Context mZ;
    private aT uR;

    public ZRu(Context context, aT aTVar, com.bytedance.adsdk.ugeno.NOt.mZ mZVar) {
        this.mZ = context;
        this.uR = aTVar;
        this.TFq = mZVar;
    }

    public void ZRu(lp lpVar) {
        this.NOt = lpVar;
    }

    public void ZRu() {
        aT aTVar = this.uR;
        if (aTVar == null) {
            return;
        }
        try {
            int i10 = Integer.parseInt(com.bytedance.adsdk.ugeno.mZ.NOt.ZRu(aTVar.mZ().optString("delay"), this.TFq.aT()));
            this.ZRu = i10;
            this.Ht.sendEmptyMessageDelayed(1001, i10);
        } catch (NumberFormatException unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.Mm.Vor.ZRu
    public void ZRu(Message message) {
        if (message.what != 1001) {
            return;
        }
        JSONObject jSONObjectMZ = this.uR.mZ();
        if (TextUtils.equals(jSONObjectMZ.optString("type"), "onAnimation")) {
            String strOptString = jSONObjectMZ.optString("nodeId");
            com.bytedance.adsdk.ugeno.NOt.mZ mZVar = this.TFq;
            com.bytedance.adsdk.ugeno.NOt.mZ mZVarMZ = mZVar.NOt(mZVar).mZ(strOptString);
            new Mm(mZVarMZ.Vor(), com.bytedance.adsdk.ugeno.core.ZRu.ZRu(jSONObjectMZ.optJSONObject("animatorSet"), mZVarMZ)).ZRu();
        } else {
            lp lpVar = this.NOt;
            if (lpVar != null) {
                aT aTVar = this.uR;
                com.bytedance.adsdk.ugeno.NOt.mZ mZVar2 = this.TFq;
                lpVar.ZRu(aTVar, mZVar2, mZVar2);
            }
        }
        this.Ht.removeMessages(1001);
    }
}
