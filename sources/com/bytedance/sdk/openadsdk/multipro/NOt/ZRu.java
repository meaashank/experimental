package com.bytedance.sdk.openadsdk.multipro.NOt;

import org.json.JSONObject;
import s0.x;

/* JADX INFO: loaded from: classes3.dex */
public class ZRu {
    public long Ht;
    public long Mm;
    public boolean NOt;
    public long TFq;
    public boolean ZRu;
    public boolean mZ;
    public boolean uR;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.multipro.NOt.ZRu$ZRu, reason: collision with other inner class name */
    public interface InterfaceC0465ZRu {
        ZRu Ht();
    }

    public ZRu NOt(boolean z10) {
        this.ZRu = z10;
        return this;
    }

    public ZRu ZRu(boolean z10) {
        this.uR = z10;
        return this;
    }

    public ZRu mZ(boolean z10) {
        this.NOt = z10;
        return this;
    }

    public ZRu uR(boolean z10) {
        this.mZ = z10;
        return this;
    }

    public ZRu NOt(long j10) {
        this.Ht = j10;
        return this;
    }

    public ZRu ZRu(long j10) {
        this.TFq = j10;
        return this;
    }

    public ZRu mZ(long j10) {
        this.Mm = j10;
        return this;
    }

    public JSONObject ZRu() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isCompleted", this.ZRu);
            jSONObject.put("isFromVideoDetailPage", this.NOt);
            jSONObject.put("isFromDetailPage", this.mZ);
            jSONObject.put(x.h.f238399b, this.TFq);
            jSONObject.put("totalPlayDuration", this.Ht);
            jSONObject.put("currentPlayPosition", this.Mm);
            jSONObject.put("isAutoPlay", this.uR);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static ZRu ZRu(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        ZRu zRu = new ZRu();
        zRu.NOt(jSONObject.optBoolean("isCompleted"));
        zRu.mZ(jSONObject.optBoolean("isFromVideoDetailPage"));
        zRu.uR(jSONObject.optBoolean("isFromDetailPage"));
        zRu.ZRu(jSONObject.optLong(x.h.f238399b));
        zRu.NOt(jSONObject.optLong("totalPlayDuration"));
        zRu.mZ(jSONObject.optLong("currentPlayPosition"));
        zRu.ZRu(jSONObject.optBoolean("isAutoPlay"));
        return zRu;
    }
}
