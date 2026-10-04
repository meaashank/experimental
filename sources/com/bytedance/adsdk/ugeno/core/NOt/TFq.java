package com.bytedance.adsdk.ugeno.core.NOt;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.adsdk.ugeno.Mm.Vor;
import com.bytedance.adsdk.ugeno.core.aT;
import com.bytedance.adsdk.ugeno.core.lp;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class TFq implements Vor.ZRu {
    private com.bytedance.adsdk.ugeno.NOt.mZ Ht;
    private Handler Mm = new Vor(Looper.getMainLooper(), this);
    private int NOt;
    private aT TFq;
    private boolean ZRu;
    private lp mZ;
    private Context uR;

    public TFq(Context context, aT aTVar, com.bytedance.adsdk.ugeno.NOt.mZ mZVar) {
        this.uR = context;
        this.TFq = aTVar;
        this.Ht = mZVar;
    }

    public void ZRu(lp lpVar) {
        this.mZ = lpVar;
    }

    public void ZRu() {
        aT aTVar = this.TFq;
        if (aTVar == null) {
            return;
        }
        JSONObject jSONObjectMZ = aTVar.mZ();
        try {
            this.NOt = Integer.parseInt(com.bytedance.adsdk.ugeno.mZ.NOt.ZRu(jSONObjectMZ.optString("interval", "8000"), this.Ht.aT()));
            this.ZRu = jSONObjectMZ.optBoolean("repeat");
            this.Mm.sendEmptyMessageDelayed(1001, this.NOt);
        } catch (NumberFormatException unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.Mm.Vor.ZRu
    public void ZRu(Message message) {
        if (message.what != 1001) {
            return;
        }
        lp lpVar = this.mZ;
        if (lpVar != null) {
            aT aTVar = this.TFq;
            com.bytedance.adsdk.ugeno.NOt.mZ mZVar = this.Ht;
            lpVar.ZRu(aTVar, mZVar, mZVar);
        }
        if (this.ZRu) {
            this.Mm.sendEmptyMessageDelayed(1001, this.NOt);
        } else {
            this.Mm.removeMessages(1001);
        }
    }
}
