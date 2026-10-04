package com.bytedance.sdk.openadsdk.component.FA;

/* JADX INFO: loaded from: classes3.dex */
public final class ZRu {
    private long NOt;
    private float ZRu;

    public long NOt() {
        return this.NOt;
    }

    public float ZRu() {
        return this.ZRu;
    }

    public void ZRu(float f10) {
        StringBuilder sb2 = new StringBuilder("setTotalTime() called with: time = [");
        sb2.append(f10);
        sb2.append("]");
        this.ZRu = f10;
    }

    public void ZRu(long j10) {
        this.NOt = j10;
    }
}
