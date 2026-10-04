package com.bytedance.adsdk.ugeno.ZRu;

import android.support.v4.media.e;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class NOt {
    private JSONObject FA;
    private String Ht;
    private String Mm;
    private long NOt;
    private long TFq;
    private Map<String, TreeMap<Float, String>> ZRu;
    private int mZ;
    private String uR;

    public long Ht() {
        return this.TFq;
    }

    public String Mm() {
        return this.Mm;
    }

    public Map<String, TreeMap<Float, String>> NOt() {
        return this.ZRu;
    }

    public String TFq() {
        return this.uR;
    }

    public JSONObject ZRu() {
        return this.FA;
    }

    public long mZ() {
        return this.NOt;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AnimationModel{mKeyFramesMap=");
        sb2.append(this.ZRu);
        sb2.append(", mDuration=");
        sb2.append(this.NOt);
        sb2.append(", mPlayCount=");
        sb2.append(this.mZ);
        sb2.append(", mPlayDirection=");
        sb2.append(this.uR);
        sb2.append(", mDelay=");
        sb2.append(this.TFq);
        sb2.append(", mTransformOrigin='");
        sb2.append(this.Ht);
        sb2.append("', mTimingFunction='");
        return e.a(sb2, this.Mm, "'}");
    }

    public int uR() {
        return this.mZ;
    }

    public void NOt(long j10) {
        this.TFq = j10;
    }

    public void ZRu(JSONObject jSONObject) {
        this.FA = jSONObject;
    }

    public void mZ(String str) {
        this.Mm = str;
    }

    public void NOt(String str) {
        this.Ht = str;
    }

    public void ZRu(Map<String, TreeMap<Float, String>> map) {
        this.ZRu = map;
    }

    public void ZRu(long j10) {
        this.NOt = j10;
    }

    public void ZRu(int i10) {
        this.mZ = i10;
    }

    public void ZRu(String str) {
        this.uR = str;
    }
}
