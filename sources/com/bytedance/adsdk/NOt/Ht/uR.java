package com.bytedance.adsdk.NOt.Ht;

/* JADX INFO: loaded from: classes2.dex */
public class uR {
    private int NOt;
    private float ZRu;

    public void ZRu(float f10) {
        float f11 = this.ZRu + f10;
        this.ZRu = f11;
        int i10 = this.NOt + 1;
        this.NOt = i10;
        if (i10 == Integer.MAX_VALUE) {
            this.ZRu = f11 / 2.0f;
            this.NOt = i10 / 2;
        }
    }
}
