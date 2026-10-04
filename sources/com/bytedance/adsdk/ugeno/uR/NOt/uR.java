package com.bytedance.adsdk.ugeno.uR.NOt;

import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.uR.NOt;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class uR extends ZRu {
    public uR(com.bytedance.adsdk.ugeno.NOt.mZ mZVar, String str, NOt.ZRu zRu) {
        super(mZVar, str, zRu);
    }

    @Override // com.bytedance.adsdk.ugeno.uR.NOt.ZRu
    public void ZRu() {
        Map<String, String> map = this.Ht;
        if (map == null || map.size() <= 0) {
            return;
        }
        String str = this.Ht.get("id");
        if (TextUtils.isEmpty(str)) {
            ZRu(this.mZ);
            return;
        }
        com.bytedance.adsdk.ugeno.NOt.mZ mZVar = this.mZ;
        com.bytedance.adsdk.ugeno.NOt.mZ mZVarNOt = mZVar.NOt(mZVar);
        if (mZVarNOt == null) {
            return;
        }
        ZRu(mZVarNOt.mZ(str));
    }

    private void ZRu(com.bytedance.adsdk.ugeno.NOt.mZ mZVar) {
        if (mZVar == null) {
            return;
        }
        for (String str : this.Ht.keySet()) {
            if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, "id")) {
                mZVar.ZRu(str, this.Ht.get(str));
            }
        }
        mZVar.MR();
        mZVar.NOt();
    }
}
