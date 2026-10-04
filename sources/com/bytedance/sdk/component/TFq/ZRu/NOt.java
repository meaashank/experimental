package com.bytedance.sdk.component.TFq.ZRu;

import com.bytedance.sdk.component.TFq.Vor;
import com.bytedance.sdk.component.TFq.lp;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class NOt {
    public static lp ZRu() {
        return new lp() { // from class: com.bytedance.sdk.component.TFq.ZRu.NOt.1
            private WeakHashMap<String, String> ZRu = new WeakHashMap<>();

            @Override // com.bytedance.sdk.component.TFq.lp
            public String NOt(Vor vor) {
                return ZRu(vor.ZRu());
            }

            @Override // com.bytedance.sdk.component.TFq.lp
            public String ZRu(Vor vor) {
                return ZRu(vor.ZRu() + "#width=" + vor.NOt() + "#height=" + vor.mZ() + "#scaletype=" + vor.uR() + "#bitmapConfig=" + vor.Ht());
            }

            private String ZRu(String str) {
                String str2 = this.ZRu.get(str);
                if (str2 != null) {
                    return str2;
                }
                String strZRu = com.bytedance.sdk.component.TFq.mZ.mZ.mZ.ZRu(str);
                this.ZRu.put(str, strZRu);
                return strZRu;
            }
        };
    }
}
