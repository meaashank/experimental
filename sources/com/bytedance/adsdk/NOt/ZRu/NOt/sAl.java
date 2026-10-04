package com.bytedance.adsdk.NOt.ZRu.NOt;

import android.graphics.Path;
import com.bytedance.adsdk.NOt.ZRu.ZRu.om;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class sAl extends ZRu<com.bytedance.adsdk.NOt.mZ.NOt.edo, Path> {
    private List<om> Ht;
    private final Path TFq;
    private final com.bytedance.adsdk.NOt.mZ.NOt.edo uR;

    public sAl(List<com.bytedance.adsdk.NOt.Mm.ZRu<com.bytedance.adsdk.NOt.mZ.NOt.edo>> list) {
        super(list);
        this.uR = new com.bytedance.adsdk.NOt.mZ.NOt.edo();
        this.TFq = new Path();
    }

    @Override // com.bytedance.adsdk.NOt.ZRu.NOt.ZRu
    /* JADX INFO: renamed from: NOt, reason: merged with bridge method [inline-methods] */
    public Path ZRu(com.bytedance.adsdk.NOt.Mm.ZRu<com.bytedance.adsdk.NOt.mZ.NOt.edo> zRu, float f10) {
        this.uR.ZRu(zRu.ZRu, zRu.NOt, f10);
        com.bytedance.adsdk.NOt.mZ.NOt.edo edoVarZRu = this.uR;
        List<om> list = this.Ht;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                edoVarZRu = this.Ht.get(size).ZRu(edoVarZRu);
            }
        }
        com.bytedance.adsdk.NOt.Ht.TFq.ZRu(edoVarZRu, this.TFq);
        return this.TFq;
    }

    public void ZRu(List<om> list) {
        this.Ht = list;
    }
}
