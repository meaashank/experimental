package com.bytedance.adsdk.ugeno.uR.mZ;

import android.content.Context;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public class NOt extends ZRu implements com.bytedance.adsdk.ugeno.uR.ZRu.uR {
    private com.bytedance.adsdk.ugeno.uR.ZRu.mZ Vor;

    public NOt(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.uR.mZ.ZRu
    public boolean ZRu(Object... objArr) {
        com.bytedance.adsdk.ugeno.uR.ZRu.ZRu zRuHo = this.NOt.Ho();
        if (zRuHo == null) {
            return false;
        }
        com.bytedance.adsdk.ugeno.uR.ZRu.mZ mZVarZRu = zRuHo.ZRu(this.Ht);
        this.Vor = mZVarZRu;
        if (mZVarZRu != null) {
            mZVarZRu.ZRu(this);
            return false;
        }
        zRuHo.ZRu(this.Ht, new com.bytedance.adsdk.ugeno.uR.ZRu.NOt());
        return false;
    }

    @Override // com.bytedance.adsdk.ugeno.uR.ZRu.uR
    public void ZRu(String str) {
        Log.d("UGBaseEventMonitor", "receive: ");
        this.ZRu.ZRu(this.NOt, this.Ht, this.mZ.NOt());
    }
}
