package com.bytedance.sdk.openadsdk.Vor;

import com.bytedance.sdk.component.TFq.OCA;
import com.bytedance.sdk.component.TFq.Vor;

/* JADX INFO: loaded from: classes3.dex */
public class TFq implements OCA {
    private static int ZRu;
    private long NOt = 0;
    private final String TFq;
    private long mZ;
    private boolean uR;

    public TFq() {
        ZRu++;
        this.TFq = "image_request_" + ZRu;
    }

    private String mZ(String str, Vor vor) {
        com.bytedance.sdk.component.TFq.mZ.ZRu zRuQF;
        if (str != null) {
            switch (str) {
                case "success":
                    return "success";
                case "raw_cache":
                    return "raw cache";
                case "image_type":
                    return "image type：";
                case "disk_cache":
                    return "disk cache";
                case "decode":
                    return "decode";
                case "failed":
                    if (!(vor instanceof com.bytedance.sdk.component.TFq.mZ.mZ) || (zRuQF = ((com.bytedance.sdk.component.TFq.mZ.mZ) vor).qF()) == null) {
                        return "fail";
                    }
                    Throwable thMZ = zRuQF.mZ();
                    StringBuilder sb2 = new StringBuilder("fail：code:");
                    sb2.append(zRuQF.ZRu());
                    sb2.append(", msg:");
                    sb2.append(zRuQF.NOt());
                    sb2.append(", exception:");
                    sb2.append(thMZ != null ? thMZ.getMessage() : "null \r\n");
                    return sb2.toString();
                case "check_duplicate":
                    return "duplicate request";
                case "memory_cache":
                    return "memory cache";
                case "net_request":
                    return "net request";
                case "generate_key":
                    return "generate key:" + vor.TFq();
                case "cache_policy":
                    return "cache policy";
            }
        }
        return str;
    }

    @Override // com.bytedance.sdk.component.TFq.OCA
    public void NOt(String str, Vor vor) {
        this.mZ += System.currentTimeMillis() - this.NOt;
        mZ(str, vor);
    }

    @Override // com.bytedance.sdk.component.TFq.OCA
    public void ZRu(String str, Vor vor) {
        if (!this.uR) {
            vor.ZRu();
            vor.NOt();
            vor.mZ();
            this.uR = true;
        }
        this.NOt = System.currentTimeMillis();
        mZ(str, vor);
    }
}
