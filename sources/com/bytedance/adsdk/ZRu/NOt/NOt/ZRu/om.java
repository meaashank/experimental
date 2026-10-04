package com.bytedance.adsdk.ZRu.NOt.NOt.ZRu;

import com.prism.gaia.server.accounts.b;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class om implements com.bytedance.adsdk.ZRu.NOt.NOt.NOt {
    private com.bytedance.adsdk.ZRu.NOt.NOt.ZRu NOt;
    private com.bytedance.adsdk.ZRu.NOt.NOt.ZRu ZRu;
    private com.bytedance.adsdk.ZRu.NOt.NOt.ZRu mZ;

    @Override // com.bytedance.adsdk.ZRu.NOt.NOt.NOt
    public void NOt(com.bytedance.adsdk.ZRu.NOt.NOt.ZRu zRu) {
        this.NOt = zRu;
    }

    @Override // com.bytedance.adsdk.ZRu.NOt.NOt.ZRu
    public Object ZRu(Map<String, JSONObject> map) {
        Object objZRu = this.ZRu.ZRu(map);
        if (objZRu == null) {
            return null;
        }
        return ((Boolean) objZRu).booleanValue() ? this.NOt.ZRu(map) : this.mZ.ZRu(map);
    }

    @Override // com.bytedance.adsdk.ZRu.NOt.NOt.NOt
    public void mZ(com.bytedance.adsdk.ZRu.NOt.NOt.ZRu zRu) {
        this.mZ = zRu;
    }

    public String toString() {
        return NOt();
    }

    @Override // com.bytedance.adsdk.ZRu.NOt.NOt.ZRu
    public String NOt() {
        return this.ZRu.NOt() + "?" + this.NOt.NOt() + b.f166434b0 + this.mZ.NOt();
    }

    @Override // com.bytedance.adsdk.ZRu.NOt.NOt.ZRu
    public com.bytedance.adsdk.ZRu.NOt.uR.TFq ZRu() {
        return com.bytedance.adsdk.ZRu.NOt.uR.Ht.OPERATOR_RESULT;
    }

    @Override // com.bytedance.adsdk.ZRu.NOt.NOt.NOt
    public void ZRu(com.bytedance.adsdk.ZRu.NOt.NOt.ZRu zRu) {
        this.ZRu = zRu;
    }
}
