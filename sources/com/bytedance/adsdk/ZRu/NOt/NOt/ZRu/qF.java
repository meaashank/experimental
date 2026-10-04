package com.bytedance.adsdk.ZRu.NOt.NOt.ZRu;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class qF extends WMI {
    private static final ThreadLocal<StringBuilder> uR = new ThreadLocal<StringBuilder>() { // from class: com.bytedance.adsdk.ZRu.NOt.NOt.ZRu.qF.1
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: ZRu, reason: merged with bridge method [inline-methods] */
        public StringBuilder initialValue() {
            return new StringBuilder();
        }
    };

    public qF() {
        super(com.bytedance.adsdk.ZRu.NOt.uR.mZ.PLUS);
    }

    @Override // com.bytedance.adsdk.ZRu.NOt.NOt.ZRu
    public Object ZRu(Map<String, JSONObject> map) {
        Object objZRu;
        Object objZRu2 = this.ZRu.ZRu(map);
        if (objZRu2 == null || (objZRu = this.NOt.ZRu(map)) == null) {
            return null;
        }
        if (!(objZRu2 instanceof String) && !(objZRu instanceof String)) {
            return com.bytedance.adsdk.ZRu.NOt.TFq.ZRu.FA.ZRu((Number) objZRu2, (Number) objZRu);
        }
        StringBuilder sb2 = uR.get();
        sb2.append(objZRu2);
        sb2.append(objZRu);
        String string = sb2.toString();
        sb2.setLength(0);
        return string;
    }
}
