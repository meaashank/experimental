package com.bytedance.adsdk.ugeno;

import android.content.Context;
import com.bytedance.adsdk.ugeno.uR.Ht;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class uR {
    private static volatile uR ZRu;
    private com.bytedance.adsdk.ugeno.core.NOt.mZ Ht;
    private List<com.bytedance.adsdk.ugeno.core.NOt> NOt;
    private com.bytedance.adsdk.ugeno.mZ.ZRu TFq;
    private com.bytedance.adsdk.ugeno.core.mZ mZ;
    private ZRu uR;

    private uR() {
    }

    private void TFq() {
        ArrayList arrayList = new ArrayList();
        this.NOt = arrayList;
        com.bytedance.adsdk.ugeno.core.mZ mZVar = this.mZ;
        if (mZVar != null) {
            arrayList.addAll(mZVar.ZRu());
        }
        com.bytedance.adsdk.ugeno.core.uR.ZRu(this.NOt);
    }

    public static uR ZRu() {
        if (ZRu == null) {
            synchronized (uR.class) {
                try {
                    if (ZRu == null) {
                        ZRu = new uR();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ZRu;
    }

    public ZRu NOt() {
        return this.uR;
    }

    public com.bytedance.adsdk.ugeno.mZ.ZRu mZ() {
        return this.TFq;
    }

    public com.bytedance.adsdk.ugeno.core.NOt.mZ uR() {
        return this.Ht;
    }

    public void ZRu(Context context, com.bytedance.adsdk.ugeno.core.mZ mZVar, ZRu zRu) {
        this.mZ = mZVar;
        this.uR = zRu;
        TFq();
    }

    public void ZRu(com.bytedance.adsdk.ugeno.mZ.ZRu zRu) {
        this.TFq = zRu;
    }

    public void ZRu(com.bytedance.adsdk.ugeno.uR.uR uRVar) {
        ArrayList arrayList = new ArrayList(new com.bytedance.adsdk.ugeno.uR.ZRu().ZRu());
        if (uRVar != null) {
            arrayList.addAll(uRVar.ZRu());
        }
        Ht.ZRu(arrayList);
    }
}
