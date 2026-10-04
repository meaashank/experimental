package com.bytedance.adsdk.ZRu.NOt.NOt.ZRu;

import android.support.v4.media.e;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class OCA implements com.bytedance.adsdk.ZRu.NOt.NOt.ZRu {
    private final String ZRu;

    public OCA(String str) {
        this.ZRu = str;
    }

    @Override // com.bytedance.adsdk.ZRu.NOt.NOt.ZRu
    public String NOt() {
        return e.a(new StringBuilder("'"), this.ZRu, "'");
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
        return com.bytedance.adsdk.ZRu.NOt.uR.Ht.STRING;
    }
}
