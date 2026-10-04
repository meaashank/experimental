package com.bytedance.sdk.openadsdk.core.model;

import com.bytedance.sdk.openadsdk.utils.fWk;

/* JADX INFO: loaded from: classes3.dex */
public class ru {
    private long FA;
    private long Ht;
    private long Mm;
    public long NOt;
    private long TFq;
    private long Vor;
    private int ZH;
    public boolean ZRu;
    private long aT;
    private fWk mZ = fWk.NOt();
    private fWk uR = fWk.NOt();

    public int FA() {
        return this.ZH;
    }

    public long Ht() {
        return this.Vor;
    }

    public long Mm() {
        return this.aT;
    }

    public void NOt(fWk fwk) {
        this.uR = fwk;
        this.Vor = fwk.ZRu(this.mZ);
    }

    public long TFq() {
        return this.FA;
    }

    public void ZRu(fWk fwk, fWk fwk2, int i10, fWk fwk3) {
        this.TFq = fwk.ZRu(this.mZ);
        this.Ht = fwk2.ZRu(fwk);
        this.Mm = i10;
        this.FA = fwk3.ZRu(fwk2);
    }

    public long mZ() {
        return this.Ht;
    }

    public long uR() {
        return this.Mm;
    }

    public long NOt() {
        return this.TFq;
    }

    public void ZRu(fWk fwk) {
        this.mZ = fwk;
    }

    public fWk ZRu() {
        return this.mZ;
    }

    public void ZRu(long j10) {
        this.aT = j10;
    }

    public void ZRu(int i10) {
        this.ZH = i10;
    }
}
