package com.bytedance.sdk.component.Ht.ZRu.uR.NOt;

/* JADX INFO: loaded from: classes2.dex */
public class ZRu {
    private int NOt;
    private int ZRu;

    public ZRu(int i10, int i11, long j10) {
        if (i11 < i10) {
            throw new IllegalStateException("atMostBatchSendCount should meet a condition (atMostBatchSendCount >= maxCacheCount)");
        }
        this.ZRu = i10;
        this.NOt = i11;
    }

    public static ZRu TFq() {
        return new ZRu(3, 100, 172800000L);
    }

    public static ZRu mZ() {
        return new ZRu(1, 100, 172800000L);
    }

    public static ZRu uR() {
        return new ZRu(1, 100, -1L);
    }

    public int NOt() {
        return this.NOt;
    }

    public int ZRu() {
        return this.ZRu;
    }
}
