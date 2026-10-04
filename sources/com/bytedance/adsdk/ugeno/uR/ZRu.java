package com.bytedance.adsdk.ugeno.uR;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ZRu implements uR {
    @Override // com.bytedance.adsdk.ugeno.uR.uR
    public List<mZ> ZRu() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new mZ("slide") { // from class: com.bytedance.adsdk.ugeno.uR.ZRu.1
            @Override // com.bytedance.adsdk.ugeno.uR.mZ
            public com.bytedance.adsdk.ugeno.uR.mZ.ZRu ZRu(Context context) {
                return new com.bytedance.adsdk.ugeno.uR.mZ.mZ(context);
            }
        });
        arrayList.add(new mZ("tap") { // from class: com.bytedance.adsdk.ugeno.uR.ZRu.2
            @Override // com.bytedance.adsdk.ugeno.uR.mZ
            public com.bytedance.adsdk.ugeno.uR.mZ.ZRu ZRu(Context context) {
                return new com.bytedance.adsdk.ugeno.uR.mZ.uR(context);
            }
        });
        arrayList.add(new mZ("timer") { // from class: com.bytedance.adsdk.ugeno.uR.ZRu.3
            @Override // com.bytedance.adsdk.ugeno.uR.mZ
            public com.bytedance.adsdk.ugeno.uR.mZ.ZRu ZRu(Context context) {
                return new com.bytedance.adsdk.ugeno.uR.mZ.TFq(context);
            }
        });
        return arrayList;
    }
}
