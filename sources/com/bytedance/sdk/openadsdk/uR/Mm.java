package com.bytedance.sdk.openadsdk.uR;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class Mm {
    private long NOt;
    private long TFq;
    private long ZRu;
    private long mZ;
    private long uR;

    public void NOt(long j10) {
        if (this.NOt <= 0) {
            this.NOt = j10;
        }
    }

    public void TFq(long j10) {
        if (this.TFq <= 0) {
            this.TFq = j10;
        }
    }

    public void ZRu(long j10) {
        if (this.ZRu <= 0) {
            this.ZRu = j10;
        }
    }

    public void mZ(long j10) {
        if (this.mZ <= 0) {
            this.mZ = j10;
        }
    }

    public void uR(long j10) {
        if (this.uR <= 0) {
            this.uR = j10;
        }
    }

    public JSONObject NOt() {
        return ZRu((JSONObject) null);
    }

    public boolean ZRu() {
        return this.ZRu > 0;
    }

    public void ZRu(long j10, float f10) {
        if (f10 > 0.0f) {
            ZRu(j10);
        }
        double d10 = f10;
        if (d10 >= 0.25d) {
            ZRu(j10);
            NOt(j10);
        }
        if (d10 >= 0.5d) {
            ZRu(j10);
            NOt(j10);
            mZ(j10);
        }
        if (d10 >= 0.75d) {
            ZRu(j10);
            NOt(j10);
            mZ(j10);
            uR(j10);
        }
        if (f10 >= 1.0f) {
            ZRu(j10);
            NOt(j10);
            mZ(j10);
            uR(j10);
            TFq(j10);
        }
    }

    public JSONObject ZRu(JSONObject jSONObject) {
        if (jSONObject == null) {
            try {
                jSONObject = new JSONObject();
            } catch (Exception unused) {
            }
        }
        long j10 = this.ZRu;
        if (j10 > 0) {
            jSONObject.put("show_start", j10);
            long j11 = this.NOt;
            if (j11 > 0) {
                jSONObject.put("show_firstQuartile", j11);
                long j12 = this.mZ;
                if (j12 > 0) {
                    jSONObject.put("show_mid", j12);
                    long j13 = this.uR;
                    if (j13 > 0) {
                        jSONObject.put("show_thirdQuartile", j13);
                        long j14 = this.TFq;
                        if (j14 > 0) {
                            jSONObject.put("show_full", j14);
                        }
                    }
                }
            }
        }
        return jSONObject;
    }
}
