package com.bytedance.sdk.component.Ht.ZRu.TFq;

import com.prism.gaia.download.a;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public abstract class TFq implements Comparable<TFq>, Runnable {
    private String mZ;
    private int ZRu = 5;
    private String NOt = UUID.randomUUID().toString() + a.f164606q + String.valueOf(System.nanoTime());

    public TFq(String str) {
        this.mZ = str;
    }

    public void ZRu(int i10) {
        this.ZRu = i10;
    }

    public int ZRu() {
        return this.ZRu;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ZRu, reason: merged with bridge method [inline-methods] */
    public int compareTo(TFq tFq) {
        if (ZRu() < tFq.ZRu()) {
            return 1;
        }
        return ZRu() >= tFq.ZRu() ? -1 : 0;
    }
}
