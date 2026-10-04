package com.bytedance.adsdk.ZRu.NOt.NOt.ZRu;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class uR extends WMI {
    public uR() {
        super(com.bytedance.adsdk.ZRu.NOt.uR.mZ.EQ);
    }

    @Override // com.bytedance.adsdk.ZRu.NOt.NOt.ZRu
    public Object ZRu(Map<String, JSONObject> map) {
        Object objZRu = this.ZRu.ZRu(map);
        Object objZRu2 = this.NOt.ZRu(map);
        return (objZRu == null && objZRu2 == null) ? Boolean.TRUE : (objZRu != null || objZRu2 == null) ? (objZRu == null || objZRu2 != null) ? ((objZRu instanceof Number) && (objZRu2 instanceof Number)) ? Boolean.valueOf(com.bytedance.adsdk.ZRu.NOt.TFq.ZRu.NOt.ZRu((Number) objZRu, (Number) objZRu2)) : Boolean.valueOf(objZRu.equals(objZRu2)) : Boolean.FALSE : Boolean.FALSE;
    }
}
