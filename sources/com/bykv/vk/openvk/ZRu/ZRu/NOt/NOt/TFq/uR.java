package com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.TFq;

import android.text.TextUtils;
import com.bytedance.sdk.component.NOt.ZRu.ZH;
import com.bytedance.sdk.component.NOt.ZRu.oK;
import com.bytedance.sdk.component.NOt.ZRu.sAl;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class uR implements NOt {
    private ZH ZRu;

    public uR() {
        this.ZRu = null;
        this.ZRu = com.bykv.vk.openvk.ZRu.ZRu.ZRu.mZ.uR();
    }

    @Override // com.bykv.vk.openvk.ZRu.ZRu.NOt.NOt.TFq.NOt
    public ZRu ZRu(TFq tFq) throws IOException {
        sAl.ZRu zRu = new sAl.ZRu();
        try {
            Map<String, String> map = tFq.TFq;
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (!TextUtils.isEmpty(key)) {
                        String value = entry.getValue();
                        if (value == null) {
                            value = "";
                        }
                        zRu.NOt(key, value);
                    }
                }
            }
            oK oKVarNOt = this.ZRu.ZRu(zRu.NOt(tFq.NOt).ZRu().ZRu("videoPreloadLowVersion").ZRu(6).NOt()).NOt();
            oKVarNOt.mZ();
            return new Ht(oKVarNOt, tFq);
        } catch (Throwable unused) {
            return null;
        }
    }
}
