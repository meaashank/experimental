package com.bytedance.adsdk.NOt.Mm;

/* JADX INFO: loaded from: classes2.dex */
public class mZ {
    private float NOt;
    private float ZRu;

    public mZ(float f10, float f11) {
        this.ZRu = f10;
        this.NOt = f11;
    }

    public float NOt() {
        return this.NOt;
    }

    public float ZRu() {
        return this.ZRu;
    }

    public String toString() {
        return ZRu() + "x" + NOt();
    }

    public boolean NOt(float f10, float f11) {
        return this.ZRu == f10 && this.NOt == f11;
    }

    public void ZRu(float f10, float f11) {
        this.ZRu = f10;
        this.NOt = f11;
    }

    public mZ() {
        this(1.0f, 1.0f);
    }
}
