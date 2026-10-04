package com.bytedance.adsdk.ugeno.core;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class aT {
    private int NOt;
    private aT TFq;
    private com.bytedance.adsdk.ugeno.NOt.mZ ZRu;
    private JSONObject mZ;
    private aT uR;

    public int NOt() {
        return this.NOt;
    }

    public com.bytedance.adsdk.ugeno.NOt.mZ ZRu() {
        return this.ZRu;
    }

    public JSONObject mZ() {
        return this.mZ;
    }

    public String toString() {
        return "UGenEvent{mWidget=" + this.ZRu + ", mEventType=" + this.NOt + ", mEvent=" + this.mZ + '}';
    }

    public aT uR() {
        return this.uR;
    }

    public void NOt(aT aTVar) {
        this.TFq = aTVar;
    }

    public void ZRu(com.bytedance.adsdk.ugeno.NOt.mZ mZVar) {
        this.ZRu = mZVar;
    }

    public void ZRu(int i10) {
        this.NOt = i10;
    }

    public void ZRu(JSONObject jSONObject) {
        this.mZ = jSONObject;
    }

    public void ZRu(aT aTVar) {
        this.uR = aTVar;
    }
}
