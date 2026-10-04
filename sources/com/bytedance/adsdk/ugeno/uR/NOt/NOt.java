package com.bytedance.adsdk.ugeno.uR.NOt;

import com.bytedance.adsdk.ugeno.uR.NOt;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class NOt extends ZRu {
    private List<com.bytedance.adsdk.ugeno.uR.ZRu.uR> FA;

    public NOt(com.bytedance.adsdk.ugeno.NOt.mZ mZVar, String str, NOt.ZRu zRu) {
        super(mZVar, str, zRu);
        this.FA = new CopyOnWriteArrayList();
    }

    @Override // com.bytedance.adsdk.ugeno.uR.NOt.ZRu
    public void ZRu() {
        com.bytedance.adsdk.ugeno.uR.ZRu.mZ mZVarZRu;
        Map<String, String> map = this.Ht;
        if (map == null || map.size() <= 0) {
            return;
        }
        String str = this.Ht.get("name");
        com.bytedance.adsdk.ugeno.uR.ZRu.ZRu zRuHo = this.mZ.Ho();
        if (zRuHo == null || (mZVarZRu = zRuHo.ZRu(str)) == null) {
            return;
        }
        mZVarZRu.ZRu(str);
    }
}
