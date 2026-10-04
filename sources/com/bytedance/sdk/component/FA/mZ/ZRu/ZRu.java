package com.bytedance.sdk.component.FA.mZ.ZRu;

import android.text.TextUtils;
import com.bytedance.sdk.component.FA.mZ.NOt;

/* JADX INFO: loaded from: classes2.dex */
public class ZRu {
    private long Ht;
    private int NOt = 0;
    private long TFq;
    private String ZRu;
    private long mZ;
    private long uR;

    public long Ht() {
        return this.Ht;
    }

    public int NOt() {
        return this.NOt;
    }

    public long TFq() {
        return this.TFq;
    }

    public String ZRu() {
        return this.ZRu;
    }

    public long mZ() {
        return this.mZ;
    }

    public String toString() {
        return this.ZRu + " times=" + this.NOt + ",waitMaxTime=" + this.TFq + ",runMaxTime=" + this.Ht + ",runTotalTime=" + this.uR + ",waitTotalTime=" + this.mZ;
    }

    public long uR() {
        return this.uR;
    }

    public void ZRu(NOt nOt) {
        synchronized (this) {
            try {
                if (TextUtils.isEmpty(this.ZRu)) {
                    this.ZRu = nOt.NOt();
                }
                this.mZ += nOt.Ht();
                this.uR += nOt.Mm();
                this.TFq = Math.max(this.TFq, nOt.Ht());
                this.Ht = Math.max(this.Ht, nOt.Mm());
                this.NOt++;
            } catch (Throwable th) {
                throw th;
            }
        }
        nOt.Ht();
        nOt.Mm();
        toString();
    }
}
