package com.bytedance.sdk.openadsdk.core;

import e.I;

/* JADX INFO: loaded from: classes3.dex */
public class ru {
    private static ru ZRu;
    private com.bytedance.sdk.openadsdk.ZRu.uR.NOt Ht;
    private com.bytedance.sdk.openadsdk.core.model.ZRu NOt;
    private com.bytedance.sdk.openadsdk.ZRu.mZ.NOt TFq;
    private com.bytedance.sdk.openadsdk.core.model.qF mZ;
    private com.bytedance.sdk.openadsdk.ZRu.TFq.ZRu uR;

    private ru() {
    }

    @I
    public static ru ZRu() {
        if (ZRu == null) {
            ZRu = new ru();
        }
        return ZRu;
    }

    public void Ht() {
        this.mZ = null;
        this.NOt = null;
        this.uR = null;
        this.TFq = null;
        this.Ht = null;
    }

    public com.bytedance.sdk.openadsdk.core.model.ZRu Mm() {
        return this.NOt;
    }

    public com.bytedance.sdk.openadsdk.core.model.qF NOt() {
        return this.mZ;
    }

    public com.bytedance.sdk.openadsdk.ZRu.uR.NOt TFq() {
        return this.Ht;
    }

    public com.bytedance.sdk.openadsdk.ZRu.TFq.ZRu mZ() {
        return this.uR;
    }

    public com.bytedance.sdk.openadsdk.ZRu.mZ.NOt uR() {
        return this.TFq;
    }

    public void ZRu(com.bytedance.sdk.openadsdk.core.model.qF qFVar) {
        this.mZ = qFVar;
    }

    public void ZRu(com.bytedance.sdk.openadsdk.ZRu.mZ.NOt nOt) {
        this.TFq = nOt;
    }

    public void ZRu(com.bytedance.sdk.openadsdk.ZRu.TFq.ZRu zRu) {
        this.uR = zRu;
    }

    public void ZRu(com.bytedance.sdk.openadsdk.ZRu.uR.NOt nOt) {
        this.Ht = nOt;
    }

    public void ZRu(com.bytedance.sdk.openadsdk.core.model.ZRu zRu) {
        this.NOt = zRu;
    }
}
