package com.bytedance.sdk.component.FA.mZ;

/* JADX INFO: loaded from: classes2.dex */
public abstract class NOt implements Comparable<NOt>, Runnable {
    private long Ht;
    private String NOt;
    private long TFq;
    private int ZRu;
    private Runnable mZ;
    private long uR;

    public NOt(String str) {
        this.ZRu = 5;
        this.NOt = str;
    }

    public Runnable FA() {
        return this.mZ;
    }

    public long Ht() {
        return this.TFq - this.uR;
    }

    public long Mm() {
        return this.Ht - this.TFq;
    }

    public String NOt() {
        return this.NOt;
    }

    public long TFq() {
        return this.Ht;
    }

    public void ZRu(int i10) {
        this.ZRu = i10;
    }

    public long mZ() {
        return this.uR;
    }

    public long uR() {
        return this.TFq;
    }

    public void NOt(long j10) {
        this.TFq = j10;
    }

    public int ZRu() {
        return this.ZRu;
    }

    public void mZ(long j10) {
        this.Ht = j10;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ZRu, reason: merged with bridge method [inline-methods] */
    public int compareTo(NOt nOt) {
        if (ZRu() < nOt.ZRu()) {
            return 1;
        }
        return ZRu() >= nOt.ZRu() ? -1 : 0;
    }

    public NOt(int i10, String str) {
        this.ZRu = i10;
        this.NOt = str;
    }

    public void ZRu(long j10) {
        this.uR = j10;
    }

    public NOt(String str, Runnable runnable) {
        this.ZRu = 5;
        this.NOt = str;
        this.mZ = runnable;
    }
}
