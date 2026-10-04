package com.bytedance.adsdk.ZRu.NOt.NOt.ZRu;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class aT implements com.bytedance.adsdk.ZRu.NOt.NOt.ZRu {
    private String NOt;
    private com.bytedance.adsdk.ZRu.NOt.NOt.ZRu[] ZRu;
    private com.bytedance.adsdk.ZRu.NOt.ZRu.ZRu mZ;

    public aT(String str) {
        this.NOt = str;
    }

    @Override // com.bytedance.adsdk.ZRu.NOt.NOt.ZRu
    public String NOt() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.NOt);
        sb2.append("(");
        com.bytedance.adsdk.ZRu.NOt.NOt.ZRu[] zRuArr = this.ZRu;
        if (zRuArr != null && zRuArr.length > 0) {
            int i10 = 0;
            while (true) {
                com.bytedance.adsdk.ZRu.NOt.NOt.ZRu[] zRuArr2 = this.ZRu;
                if (i10 >= zRuArr2.length) {
                    break;
                }
                sb2.append(zRuArr2[i10].NOt());
                sb2.append(",");
                i10++;
            }
        }
        sb2.append(")");
        return sb2.toString();
    }

    public void ZRu(com.bytedance.adsdk.ZRu.NOt.NOt.ZRu[] zRuArr) {
        this.ZRu = zRuArr;
    }

    @Override // com.bytedance.adsdk.ZRu.NOt.NOt.ZRu
    public Object ZRu(Map<String, JSONObject> map) {
        com.bytedance.adsdk.ZRu.NOt.ZRu.ZRu zRu = new com.bytedance.adsdk.ZRu.NOt.ZRu.ZRu();
        this.mZ = zRu;
        zRu.ZRu(this.NOt);
        Object[] objArr = new Object[this.ZRu.length];
        int i10 = 0;
        while (true) {
            com.bytedance.adsdk.ZRu.NOt.NOt.ZRu[] zRuArr = this.ZRu;
            if (i10 >= zRuArr.length) {
                this.mZ.ZRu(objArr);
                return com.bytedance.adsdk.ZRu.Mm.ZRu(this.NOt).ZRu(map.get("default_key"), objArr);
            }
            com.bytedance.adsdk.ZRu.NOt.NOt.ZRu zRu2 = zRuArr[i10];
            if (zRu2 != null) {
                objArr[i10] = zRu2.ZRu(map);
            }
            i10++;
        }
    }

    @Override // com.bytedance.adsdk.ZRu.NOt.NOt.ZRu
    public com.bytedance.adsdk.ZRu.NOt.uR.TFq ZRu() {
        return com.bytedance.adsdk.ZRu.NOt.uR.NOt.METHOD;
    }
}
