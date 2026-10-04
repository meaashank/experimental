package com.bytedance.adsdk.NOt.mZ.mZ;

import androidx.compose.runtime.changelist.a;
import com.bytedance.adsdk.NOt.mZ.ZRu.ZH;
import com.bytedance.adsdk.NOt.mZ.ZRu.aT;
import com.bytedance.adsdk.NOt.mZ.ZRu.lp;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class TFq {
    private final List<com.bytedance.adsdk.NOt.mZ.NOt.FA> FA;
    private final long Ht;
    private final String Mm;
    private final com.bytedance.adsdk.NOt.Mm NOt;
    private final List<com.bytedance.adsdk.NOt.Mm.ZRu<Float>> OCA;
    private final ZRu TFq;
    private final lp Vor;
    private final aT WMI;
    private final int ZH;
    private final List<com.bytedance.adsdk.NOt.mZ.NOt.mZ> ZRu;
    private final com.bytedance.adsdk.NOt.mZ.NOt.ZRu Zf;
    private final int aT;
    private final float edo;
    private final int lp;
    private final String mZ;
    private final float oK;
    private final com.bytedance.adsdk.NOt.mZ.ZRu.NOt om;
    private final ZH qF;
    private final com.bytedance.adsdk.NOt.TFq.aT ru;
    private final float sAl;
    private final NOt to;
    private final long uR;
    private final boolean xY;
    private final float yBV;

    public enum NOt {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    public enum ZRu {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    public TFq(List<com.bytedance.adsdk.NOt.mZ.NOt.mZ> list, com.bytedance.adsdk.NOt.Mm mm, String str, long j10, ZRu zRu, long j11, String str2, List<com.bytedance.adsdk.NOt.mZ.NOt.FA> list2, lp lpVar, int i10, int i11, int i12, float f10, float f11, float f12, float f13, aT aTVar, ZH zh, List<com.bytedance.adsdk.NOt.Mm.ZRu<Float>> list3, NOt nOt, com.bytedance.adsdk.NOt.mZ.ZRu.NOt nOt2, boolean z10, com.bytedance.adsdk.NOt.mZ.NOt.ZRu zRu2, com.bytedance.adsdk.NOt.TFq.aT aTVar2) {
        this.ZRu = list;
        this.NOt = mm;
        this.mZ = str;
        this.uR = j10;
        this.TFq = zRu;
        this.Ht = j11;
        this.Mm = str2;
        this.FA = list2;
        this.Vor = lpVar;
        this.aT = i10;
        this.ZH = i11;
        this.lp = i12;
        this.sAl = f10;
        this.edo = f11;
        this.oK = f12;
        this.yBV = f13;
        this.WMI = aTVar;
        this.qF = zh;
        this.OCA = list3;
        this.to = nOt;
        this.om = nOt2;
        this.xY = z10;
        this.Zf = zRu2;
        this.ru = aTVar2;
    }

    public float FA() {
        return this.oK;
    }

    public String Ht() {
        return this.mZ;
    }

    public String Mm() {
        return this.Mm;
    }

    public float NOt() {
        return this.sAl;
    }

    public ZH OCA() {
        return this.qF;
    }

    public long TFq() {
        return this.uR;
    }

    public float Vor() {
        return this.yBV;
    }

    public int WMI() {
        return this.ZH;
    }

    public ZRu ZH() {
        return this.TFq;
    }

    public String ZRu(String str) {
        StringBuilder sbA = a.a(str);
        sbA.append(Ht());
        sbA.append("\n");
        TFq tFqZRu = this.NOt.ZRu(sAl());
        if (tFqZRu != null) {
            sbA.append("\t\tParents: ");
            sbA.append(tFqZRu.Ht());
            TFq tFqZRu2 = this.NOt.ZRu(tFqZRu.sAl());
            while (tFqZRu2 != null) {
                sbA.append("->");
                sbA.append(tFqZRu2.Ht());
                tFqZRu2 = this.NOt.ZRu(tFqZRu2.sAl());
            }
            sbA.append(str);
            sbA.append("\n");
        }
        if (!aT().isEmpty()) {
            sbA.append(str);
            sbA.append("\tMasks: ");
            sbA.append(aT().size());
            sbA.append("\n");
        }
        if (qF() != 0 && WMI() != 0) {
            sbA.append(str);
            sbA.append("\tBackground: ");
            sbA.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(qF()), Integer.valueOf(WMI()), Integer.valueOf(yBV())));
        }
        if (!this.ZRu.isEmpty()) {
            sbA.append(str);
            sbA.append("\tShapes:\n");
            for (com.bytedance.adsdk.NOt.mZ.NOt.mZ mZVar : this.ZRu) {
                sbA.append(str);
                sbA.append("\t\t");
                sbA.append(mZVar);
                sbA.append("\n");
            }
        }
        return sbA.toString();
    }

    public com.bytedance.adsdk.NOt.mZ.NOt.ZRu Zf() {
        return this.Zf;
    }

    public List<com.bytedance.adsdk.NOt.mZ.NOt.FA> aT() {
        return this.FA;
    }

    public List<com.bytedance.adsdk.NOt.mZ.NOt.mZ> edo() {
        return this.ZRu;
    }

    public NOt lp() {
        return this.to;
    }

    public float mZ() {
        return this.edo / this.NOt.WMI();
    }

    public lp oK() {
        return this.Vor;
    }

    public aT om() {
        return this.WMI;
    }

    public int qF() {
        return this.aT;
    }

    public com.bytedance.adsdk.NOt.TFq.aT ru() {
        return this.ru;
    }

    public long sAl() {
        return this.Ht;
    }

    public com.bytedance.adsdk.NOt.mZ.ZRu.NOt to() {
        return this.om;
    }

    public String toString() {
        return ZRu("");
    }

    public List<com.bytedance.adsdk.NOt.Mm.ZRu<Float>> uR() {
        return this.OCA;
    }

    public boolean xY() {
        return this.xY;
    }

    public int yBV() {
        return this.lp;
    }

    public com.bytedance.adsdk.NOt.Mm ZRu() {
        return this.NOt;
    }
}
