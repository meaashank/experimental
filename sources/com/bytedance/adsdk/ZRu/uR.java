package com.bytedance.adsdk.ZRu;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class uR implements TFq {
    @Override // com.bytedance.adsdk.ZRu.TFq
    /* JADX INFO: renamed from: NOt, reason: merged with bridge method [inline-methods] */
    public Boolean ZRu(JSONObject jSONObject, Object[] objArr) {
        if (objArr == null || objArr.length <= 0) {
            return Boolean.FALSE;
        }
        try {
            Double.parseDouble(String.valueOf(objArr[0]));
            return Boolean.TRUE;
        } catch (NumberFormatException unused) {
            return Boolean.FALSE;
        }
    }
}
