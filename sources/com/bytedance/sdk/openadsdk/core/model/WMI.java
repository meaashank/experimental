package com.bytedance.sdk.openadsdk.core.model;

/* JADX INFO: loaded from: classes3.dex */
public class WMI {
    private long ZRu = 10000;
    private long NOt = 10000;
    private long mZ = 10;
    private long uR = 20;
    private String TFq = "";

    public long NOt() {
        return this.NOt;
    }

    public String TFq() {
        return this.TFq;
    }

    public long ZRu() {
        return this.ZRu;
    }

    public long mZ() {
        return this.mZ;
    }

    public long uR() {
        return this.uR;
    }

    public void NOt(long j10) {
        if (j10 < 0) {
            this.NOt = 20L;
        } else {
            this.NOt = j10;
        }
    }

    public void ZRu(long j10) {
        if (j10 <= 0) {
            this.ZRu = 10L;
        } else {
            this.ZRu = j10;
        }
    }

    public void mZ(long j10) {
        if (j10 <= 0) {
            this.mZ = 10L;
        } else {
            this.mZ = j10;
        }
    }

    public void uR(long j10) {
        if (j10 < 0) {
            this.uR = 20L;
        } else {
            this.uR = j10;
        }
    }

    public void ZRu(String str) {
        this.TFq = str;
    }
}
