package com.bytedance.adsdk.ZRu.NOt.NOt.ZRu;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class oK implements com.bytedance.adsdk.ZRu.NOt.NOt.ZRu {
    private Number ZRu;

    public oK(String str) {
        if (str.indexOf(46) < 0) {
            try {
                this.ZRu = Integer.valueOf(str);
            } catch (NumberFormatException unused) {
                this.ZRu = Long.valueOf(str);
            }
        } else {
            Float fValueOf = Float.valueOf(str);
            this.ZRu = fValueOf;
            if (Float.isInfinite(fValueOf.floatValue())) {
                this.ZRu = Double.valueOf(str);
            }
        }
    }

    @Override // com.bytedance.adsdk.ZRu.NOt.NOt.ZRu
    public String NOt() {
        return this.ZRu.toString();
    }

    @Override // com.bytedance.adsdk.ZRu.NOt.NOt.ZRu
    public Object ZRu(Map<String, JSONObject> map) {
        return this.ZRu;
    }

    public String toString() {
        return NOt();
    }

    @Override // com.bytedance.adsdk.ZRu.NOt.NOt.ZRu
    public com.bytedance.adsdk.ZRu.NOt.uR.TFq ZRu() {
        return com.bytedance.adsdk.ZRu.NOt.uR.Ht.NUMBER;
    }
}
