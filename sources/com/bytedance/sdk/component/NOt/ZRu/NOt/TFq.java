package com.bytedance.sdk.component.NOt.ZRu.NOt;

/* JADX INFO: loaded from: classes2.dex */
final class TFq {
    TFq Ht;
    TFq Mm;
    int NOt;
    boolean TFq;
    final byte[] ZRu;
    int mZ;
    boolean uR;

    public TFq() {
        this.ZRu = new byte[8192];
        this.TFq = true;
        this.uR = false;
    }

    public final TFq NOt() {
        TFq tFq = this.Ht;
        TFq tFq2 = tFq != this ? tFq : null;
        TFq tFq3 = this.Mm;
        if (tFq3 != null) {
            tFq3.Ht = tFq;
        }
        TFq tFq4 = this.Ht;
        if (tFq4 != null) {
            tFq4.Mm = tFq3;
        }
        this.Ht = null;
        this.Mm = null;
        return tFq2;
    }

    public final TFq ZRu() {
        this.uR = true;
        return new TFq(this.ZRu, this.NOt, this.mZ, true, false);
    }

    public final TFq ZRu(TFq tFq) {
        tFq.Mm = this;
        tFq.Ht = this.Ht;
        this.Ht.Mm = tFq;
        this.Ht = tFq;
        return tFq;
    }

    public TFq(byte[] bArr, int i10, int i11, boolean z10, boolean z11) {
        this.ZRu = bArr;
        this.NOt = i10;
        this.mZ = i11;
        this.uR = z10;
        this.TFq = z11;
    }
}
