package com.bytedance.sdk.openadsdk.utils;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes3.dex */
public class fWk {
    private long NOt;
    public long ZRu;

    private fWk(boolean z10) {
        if (z10) {
            uR();
        }
    }

    public static fWk NOt() {
        return new fWk(false);
    }

    public static fWk ZRu() {
        return new fWk(true);
    }

    public boolean TFq() {
        return this.NOt > 0;
    }

    public long mZ() {
        return SystemClock.elapsedRealtime() - this.NOt;
    }

    public String toString() {
        return String.valueOf(this.ZRu);
    }

    public void uR() {
        this.ZRu = System.currentTimeMillis();
        this.NOt = SystemClock.elapsedRealtime();
    }

    public long ZRu(fWk fwk) {
        return Math.abs(fwk.NOt - this.NOt);
    }
}
