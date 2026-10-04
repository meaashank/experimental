package com.bytedance.adsdk.ZRu.NOt.NOt.ZRu;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class Ht extends WMI {
    public Ht() {
        super(com.bytedance.adsdk.ZRu.NOt.uR.mZ.GT);
    }

    @Override // com.bytedance.adsdk.ZRu.NOt.NOt.ZRu
    public Object ZRu(Map<String, JSONObject> map) {
        Object objZRu;
        Object objZRu2 = this.ZRu.ZRu(map);
        if (objZRu2 == null || (objZRu = this.NOt.ZRu(map)) == null) {
            return null;
        }
        return com.bytedance.adsdk.ZRu.NOt.TFq.ZRu.mZ.ZRu(objZRu2, (Number) objZRu);
    }
}
