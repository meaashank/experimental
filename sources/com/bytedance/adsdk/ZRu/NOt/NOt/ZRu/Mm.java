package com.bytedance.adsdk.ZRu.NOt.NOt.ZRu;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class Mm implements com.bytedance.adsdk.ZRu.NOt.NOt.ZRu {
    private final Object ZRu;

    public Mm(String str) {
        if (str.equalsIgnoreCase("true")) {
            this.ZRu = Boolean.TRUE;
        } else if (str.equalsIgnoreCase("false")) {
            this.ZRu = Boolean.FALSE;
        } else {
            if (!str.equalsIgnoreCase("null")) {
                throw new IllegalArgumentException();
            }
            this.ZRu = null;
        }
    }

    @Override // com.bytedance.adsdk.ZRu.NOt.NOt.ZRu
    public String NOt() {
        Object obj = this.ZRu;
        return obj != null ? obj.toString() : "NULL";
    }

    @Override // com.bytedance.adsdk.ZRu.NOt.NOt.ZRu
    public Object ZRu(Map<String, JSONObject> map) {
        return this.ZRu;
    }

    public String toString() {
        return "KeywordNode [keywordValue=" + this.ZRu + "]";
    }

    @Override // com.bytedance.adsdk.ZRu.NOt.NOt.ZRu
    public com.bytedance.adsdk.ZRu.NOt.uR.TFq ZRu() {
        return com.bytedance.adsdk.ZRu.NOt.uR.Ht.CONSTANT;
    }
}
