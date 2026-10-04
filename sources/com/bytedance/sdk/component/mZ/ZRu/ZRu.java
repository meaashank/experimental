package com.bytedance.sdk.component.mZ.ZRu;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
public class ZRu {
    long FA;
    long Ht;
    long Mm;
    long NOt;
    long TFq;
    long ZRu = SystemClock.elapsedRealtime();
    long mZ;
    long uR;

    public long FA() {
        return this.uR;
    }

    public long Ht() {
        return this.Ht;
    }

    public long Mm() {
        return this.mZ;
    }

    public void NOt() {
        this.uR = SystemClock.elapsedRealtime();
    }

    public void TFq() {
        this.Ht = SystemClock.elapsedRealtime();
    }

    public long Vor() {
        return this.TFq;
    }

    public void ZH() {
        this.Mm = SystemClock.elapsedRealtime();
    }

    public void ZRu() {
        this.mZ = SystemClock.elapsedRealtime();
    }

    public long aT() {
        return this.Mm;
    }

    public long edo() {
        return this.NOt;
    }

    public long lp() {
        return this.FA;
    }

    public void mZ() {
        this.TFq = SystemClock.elapsedRealtime();
    }

    public void oK() {
        this.NOt = SystemClock.elapsedRealtime();
    }

    public void sAl() {
        this.FA = SystemClock.elapsedRealtime();
    }

    public String toString() {
        return "RequestHttpTime{requestBuildTs=" + this.ZRu + ", asyncCallExecTs=" + this.NOt + ", requestStartExecTs=" + this.mZ + ", requestConnectStartTs=" + this.uR + ", requestConnectFinishTs=" + this.TFq + ", reqCallServerStartTs=" + this.Mm + ", reqCallServerFinishTs=" + this.FA + '}';
    }

    public long uR() {
        return this.ZRu;
    }
}
