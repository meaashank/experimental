package com.bytedance.adsdk.ZRu.NOt.NOt.ZRu;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class TFq extends WMI {
    public TFq() {
        super(com.bytedance.adsdk.ZRu.NOt.uR.mZ.GT_EQ);
    }

    @Override // com.bytedance.adsdk.ZRu.NOt.NOt.ZRu
    public Object ZRu(Map<String, JSONObject> map) {
        Object objZRu;
        if (this.ZRu.ZRu(map) == null || (objZRu = this.NOt.ZRu(map)) == null) {
            return null;
        }
        return Boolean.valueOf(!((Boolean) com.bytedance.adsdk.ZRu.NOt.TFq.ZRu.uR.ZRu(r0, (Number) objZRu)).booleanValue());
    }
}
