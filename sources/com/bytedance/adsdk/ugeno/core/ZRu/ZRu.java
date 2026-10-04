package com.bytedance.adsdk.ugeno.core.ZRu;

import android.util.Log;
import com.bytedance.adsdk.ugeno.NOt.mZ;
import com.bytedance.adsdk.ugeno.core.aT;
import com.bytedance.adsdk.ugeno.core.lp;
import com.bytedance.adsdk.ugeno.uR.NOt;
import com.bytedance.sdk.component.uchain.action.EventChainAction;
import com.bytedance.sdk.component.uchain.listener.ICustomRouter;
import com.bytedance.sdk.component.uchain.listener.IEventChainLifeCycleListener;
import org.json.JSONObject;
import t1.b;

/* JADX INFO: loaded from: classes2.dex */
public class ZRu implements lp {
    private String NOt;
    private volatile C0395ZRu TFq;
    private lp ZRu;
    private JSONObject uR;
    private boolean mZ = true;
    private boolean Ht = false;

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.core.ZRu.ZRu$ZRu, reason: collision with other inner class name */
    public class C0395ZRu implements ICustomRouter {
        lp.ZRu ZRu;
        private aT mZ;
        private lp.NOt uR;

        public C0395ZRu() {
        }

        public void ZRu(aT aTVar) {
            this.mZ = aTVar;
        }

        public void ZRu(lp.NOt nOt) {
            this.uR = nOt;
        }

        public void ZRu(lp.ZRu zRu) {
            this.ZRu = zRu;
        }
    }

    public ZRu(lp lpVar) {
        this.ZRu = lpVar;
    }

    private void mZ(aT aTVar, lp.NOt nOt, lp.ZRu zRu) {
        if (this.TFq == null) {
            this.TFq = NOt();
        }
        this.TFq.ZRu(aTVar);
        this.TFq.ZRu(nOt);
        this.TFq.ZRu(zRu);
        JSONObject jSONObjectMZ = aTVar.mZ();
        if (jSONObjectMZ == null) {
            return;
        }
        new EventChainAction.Builder(jSONObjectMZ.optString("type")).setChainData(this.uR).setEventChainLifeCycleListener(new IEventChainLifeCycleListener() { // from class: com.bytedance.adsdk.ugeno.core.ZRu.ZRu.1
        }).build().run();
    }

    public void NOt(boolean z10) {
        this.Ht = z10;
    }

    public void ZRu(JSONObject jSONObject) {
        this.uR = jSONObject;
    }

    private void NOt(aT aTVar, lp.NOt nOt, lp.ZRu zRu) {
        lp lpVar = this.ZRu;
        if (lpVar == null) {
            return;
        }
        lpVar.ZRu(aTVar, nOt, zRu);
    }

    public void ZRu(String str) {
        this.NOt = str;
    }

    public void ZRu(boolean z10) {
        this.mZ = z10;
    }

    private C0395ZRu NOt() {
        if (this.TFq != null) {
            return this.TFq;
        }
        synchronized (C0395ZRu.class) {
            try {
                if (this.TFq != null) {
                    return this.TFq;
                }
                this.TFq = new C0395ZRu();
                return this.TFq;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean ZRu() {
        String str;
        return this.mZ && (str = this.NOt) != null && b.f238888Z4.compareTo(str) <= 0 && this.uR != null;
    }

    @Override // com.bytedance.adsdk.ugeno.core.lp
    public void ZRu(aT aTVar, lp.NOt nOt, lp.ZRu zRu) {
        if (ZRu()) {
            mZ(aTVar, nOt, zRu);
        } else {
            NOt(aTVar, nOt, zRu);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.lp
    public void ZRu(mZ mZVar, String str, NOt.ZRu zRu) {
        lp lpVar = this.ZRu;
        if (lpVar == null) {
            return;
        }
        lpVar.ZRu(mZVar, str, zRu);
        Log.d("UGenEvent", "onUGenEvent: ");
    }
}
