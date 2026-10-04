package com.bytedance.sdk.component.Mm.mZ;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class uR {
    public boolean ZRu = false;
    public boolean NOt = true;
    public Map<String, Integer> mZ = null;
    public Map<String, String> uR = null;
    public int TFq = 10;
    public int Ht = 1;
    public int Mm = 1;
    public int FA = 10;
    public int Vor = 1;
    public int aT = 1;
    public int ZH = 900;
    public int lp = 120;
    public String sAl = null;
    public int edo = 0;
    public long oK = 0;

    public String toString() {
        StringBuilder sb2 = new StringBuilder(" localEnable: ");
        sb2.append(this.ZRu);
        sb2.append(" probeEnable: ");
        sb2.append(this.NOt);
        sb2.append(" hostFilter: ");
        Map<String, Integer> map = this.mZ;
        sb2.append(map != null ? map.size() : 0);
        sb2.append(" hostMap: ");
        Map<String, String> map2 = this.uR;
        sb2.append(map2 != null ? map2.size() : 0);
        sb2.append(" reqTo: ");
        sb2.append(this.TFq);
        sb2.append("#");
        sb2.append(this.Ht);
        sb2.append("#");
        sb2.append(this.Mm);
        sb2.append(" reqErr: ");
        sb2.append(this.FA);
        sb2.append("#");
        sb2.append(this.Vor);
        sb2.append("#");
        sb2.append(this.aT);
        sb2.append(" updateInterval: ");
        sb2.append(this.ZH);
        sb2.append(" updateRandom: ");
        sb2.append(this.lp);
        sb2.append(" httpBlack: ");
        sb2.append(this.sAl);
        return sb2.toString();
    }
}
