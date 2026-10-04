package com.bytedance.adsdk.NOt;

import android.graphics.Rect;
import android.util.LongSparseArray;
import android.util.SparseArray;
import com.bytedance.component.sdk.annotation.RestrictTo;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class Mm {
    private LongSparseArray<com.bytedance.adsdk.NOt.mZ.mZ.TFq> FA;
    private List<com.bytedance.adsdk.NOt.mZ.Ht> Ht;
    private SparseArray<com.bytedance.adsdk.NOt.mZ.uR> Mm;
    private Map<String, com.bytedance.adsdk.NOt.mZ.mZ> TFq;
    private List<com.bytedance.adsdk.NOt.mZ.mZ.TFq> Vor;
    private float ZH;
    private Rect aT;
    private boolean edo;
    private float lp;
    private Map<String, List<com.bytedance.adsdk.NOt.mZ.mZ.TFq>> mZ;
    private NOt om;
    private ZRu qF;
    private float sAl;
    private Map<String, aT> uR;
    private mZ yBV;
    private final qF ZRu = new qF();
    private final HashSet<String> NOt = new HashSet<>();
    private int oK = 0;
    private String WMI = "";

    public static class NOt {
        public int[][] NOt;
        public String ZRu;
    }

    public static class ZRu {
        public Map<String, Object> NOt;
        public int ZRu;
        public Map<String, Object> mZ;
    }

    public static class mZ {
        public String Ht;
        public String NOt;
        public int[] TFq;
        public int ZRu;
        public String mZ;
        public String uR;
    }

    public mZ FA() {
        return this.yBV;
    }

    public float Ht() {
        return this.ZH;
    }

    public float Mm() {
        return this.lp;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int NOt() {
        return this.oK;
    }

    public float TFq() {
        return (long) ((WMI() / this.sAl) * 1000.0f);
    }

    public String Vor() {
        return this.WMI;
    }

    public float WMI() {
        return this.lp - this.ZH;
    }

    public ZRu ZH() {
        return this.qF;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void ZRu(Rect rect, float f10, float f11, float f12, List<com.bytedance.adsdk.NOt.mZ.mZ.TFq> list, LongSparseArray<com.bytedance.adsdk.NOt.mZ.mZ.TFq> longSparseArray, Map<String, List<com.bytedance.adsdk.NOt.mZ.mZ.TFq>> map, Map<String, aT> map2, SparseArray<com.bytedance.adsdk.NOt.mZ.uR> sparseArray, Map<String, com.bytedance.adsdk.NOt.mZ.mZ> map3, List<com.bytedance.adsdk.NOt.mZ.Ht> list2, mZ mZVar, String str, ZRu zRu, NOt nOt) {
        this.aT = rect;
        this.ZH = f10;
        this.lp = f11;
        this.sAl = f12;
        this.Vor = list;
        this.FA = longSparseArray;
        this.mZ = map;
        this.uR = map2;
        this.Mm = sparseArray;
        this.TFq = map3;
        this.Ht = list2;
        this.yBV = mZVar;
        this.WMI = str;
        this.qF = zRu;
        this.om = nOt;
    }

    public NOt aT() {
        return this.om;
    }

    public SparseArray<com.bytedance.adsdk.NOt.mZ.uR> edo() {
        return this.Mm;
    }

    public float lp() {
        return this.sAl;
    }

    public qF mZ() {
        return this.ZRu;
    }

    public Map<String, com.bytedance.adsdk.NOt.mZ.mZ> oK() {
        return this.TFq;
    }

    public List<com.bytedance.adsdk.NOt.mZ.mZ.TFq> sAl() {
        return this.Vor;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("LottieComposition:\n");
        Iterator<com.bytedance.adsdk.NOt.mZ.mZ.TFq> it = this.Vor.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().ZRu("\t"));
        }
        return sb2.toString();
    }

    public Rect uR() {
        return this.aT;
    }

    public Map<String, aT> yBV() {
        return this.uR;
    }

    public void NOt(boolean z10) {
        this.ZRu.ZRu(z10);
    }

    public com.bytedance.adsdk.NOt.mZ.Ht mZ(String str) {
        int size = this.Ht.size();
        for (int i10 = 0; i10 < size; i10++) {
            com.bytedance.adsdk.NOt.mZ.Ht ht = this.Ht.get(i10);
            if (ht.ZRu(str)) {
                return ht;
            }
        }
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public List<com.bytedance.adsdk.NOt.mZ.mZ.TFq> NOt(String str) {
        return this.mZ.get(str);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void ZRu(String str) {
        this.NOt.add(str);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void ZRu(boolean z10) {
        this.edo = z10;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void ZRu(int i10) {
        this.oK += i10;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean ZRu() {
        return this.edo;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public com.bytedance.adsdk.NOt.mZ.mZ.TFq ZRu(long j10) {
        return this.FA.get(j10);
    }

    public float ZRu(float f10) {
        return com.bytedance.adsdk.NOt.Ht.TFq.ZRu(this.ZH, this.lp, f10);
    }
}
