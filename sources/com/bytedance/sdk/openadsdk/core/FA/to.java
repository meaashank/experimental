package com.bytedance.sdk.openadsdk.core.FA;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public class to implements com.bytedance.sdk.openadsdk.core.ZH.TFq.mZ {
    private String Ht;
    private long ZRu = 0;
    private long NOt = 0;
    private int mZ = 0;
    private String uR = null;
    private String TFq = null;
    private final AtomicBoolean Mm = new AtomicBoolean(false);

    @Override // com.bytedance.sdk.openadsdk.core.ZH.TFq.mZ
    public void NOt(String str) {
        this.TFq = str;
        this.NOt = SystemClock.elapsedRealtime();
        this.Mm.set(true);
    }

    @Override // com.bytedance.sdk.openadsdk.core.ZH.TFq.mZ
    public void ZRu(String str) {
        this.Ht = str;
        this.ZRu = SystemClock.elapsedRealtime();
    }

    @Override // com.bytedance.sdk.openadsdk.core.ZH.TFq.mZ
    public void ZRu(int i10, String str, String str2) {
        this.mZ = i10;
        this.uR = str;
        this.TFq = str2;
        this.NOt = SystemClock.elapsedRealtime();
        this.Mm.set(false);
    }

    public void ZRu(com.bytedance.sdk.openadsdk.core.model.qF qFVar, String str) {
        if (this.Mm.get()) {
            com.bytedance.sdk.openadsdk.uR.mZ.ZRu(qFVar, false, str, "success", this.NOt - this.ZRu, this.TFq, this.Ht, 0, null);
        } else {
            com.bytedance.sdk.openadsdk.uR.mZ.ZRu(qFVar, false, str, "fail", this.NOt - this.ZRu, this.TFq, this.Ht, this.mZ, this.uR);
        }
    }
}
