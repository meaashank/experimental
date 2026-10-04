package com.bytedance.adsdk.NOt.ZRu.ZRu;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.bytedance.adsdk.NOt.ZRu.NOt.ZRu;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class uR implements ZRu.InterfaceC0381ZRu, TFq, sAl {
    private final List<mZ> FA;
    private final String Ht;
    private final boolean Mm;
    private final RectF NOt;
    private final RectF TFq;
    private final com.bytedance.adsdk.NOt.Vor Vor;
    private com.bytedance.adsdk.NOt.ZRu.NOt.yBV ZH;
    private final Paint ZRu;
    private List<sAl> aT;
    private final Matrix mZ;
    private final Path uR;

    public uR(com.bytedance.adsdk.NOt.Vor vor, com.bytedance.adsdk.NOt.mZ.mZ.ZRu zRu, com.bytedance.adsdk.NOt.mZ.NOt.yBV ybv, com.bytedance.adsdk.NOt.Mm mm) {
        this(vor, zRu, ybv.ZRu(), ybv.mZ(), ZRu(vor, mm, zRu, ybv.NOt()), ZRu(ybv.NOt()));
    }

    private boolean TFq() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.FA.size(); i11++) {
            if ((this.FA.get(i11) instanceof TFq) && (i10 = i10 + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    private static List<mZ> ZRu(com.bytedance.adsdk.NOt.Vor vor, com.bytedance.adsdk.NOt.Mm mm, com.bytedance.adsdk.NOt.mZ.mZ.ZRu zRu, List<com.bytedance.adsdk.NOt.mZ.NOt.mZ> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            mZ mZVarZRu = list.get(i10).ZRu(vor, mm, zRu);
            if (mZVarZRu != null) {
                arrayList.add(mZVarZRu);
            }
        }
        return arrayList;
    }

    public List<sAl> NOt() {
        if (this.aT == null) {
            this.aT = new ArrayList();
            for (int i10 = 0; i10 < this.FA.size(); i10++) {
                mZ mZVar = this.FA.get(i10);
                if (mZVar instanceof sAl) {
                    this.aT.add((sAl) mZVar);
                }
            }
        }
        return this.aT;
    }

    public Matrix mZ() {
        com.bytedance.adsdk.NOt.ZRu.NOt.yBV ybv = this.ZH;
        if (ybv != null) {
            return ybv.uR();
        }
        this.mZ.reset();
        return this.mZ;
    }

    @Override // com.bytedance.adsdk.NOt.ZRu.ZRu.sAl
    public Path uR() {
        this.mZ.reset();
        com.bytedance.adsdk.NOt.ZRu.NOt.yBV ybv = this.ZH;
        if (ybv != null) {
            this.mZ.set(ybv.uR());
        }
        this.uR.reset();
        if (this.Mm) {
            return this.uR;
        }
        for (int size = this.FA.size() - 1; size >= 0; size--) {
            mZ mZVar = this.FA.get(size);
            if (mZVar instanceof sAl) {
                this.uR.addPath(((sAl) mZVar).uR(), this.mZ);
            }
        }
        return this.uR;
    }

    public uR(com.bytedance.adsdk.NOt.Vor vor, com.bytedance.adsdk.NOt.mZ.mZ.ZRu zRu, String str, boolean z10, List<mZ> list, com.bytedance.adsdk.NOt.mZ.ZRu.lp lpVar) {
        this.ZRu = new com.bytedance.adsdk.NOt.ZRu.ZRu();
        this.NOt = new RectF();
        this.mZ = new Matrix();
        this.uR = new Path();
        this.TFq = new RectF();
        this.Ht = str;
        this.Vor = vor;
        this.Mm = z10;
        this.FA = list;
        if (lpVar != null) {
            com.bytedance.adsdk.NOt.ZRu.NOt.yBV ybvAT = lpVar.aT();
            this.ZH = ybvAT;
            ybvAT.ZRu(zRu);
            this.ZH.ZRu(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            mZ mZVar = list.get(size);
            if (mZVar instanceof aT) {
                arrayList.add((aT) mZVar);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((aT) arrayList.get(size2)).ZRu(list.listIterator(list.size()));
        }
    }

    public static com.bytedance.adsdk.NOt.mZ.ZRu.lp ZRu(List<com.bytedance.adsdk.NOt.mZ.NOt.mZ> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            com.bytedance.adsdk.NOt.mZ.NOt.mZ mZVar = list.get(i10);
            if (mZVar instanceof com.bytedance.adsdk.NOt.mZ.ZRu.lp) {
                return (com.bytedance.adsdk.NOt.mZ.ZRu.lp) mZVar;
            }
        }
        return null;
    }

    @Override // com.bytedance.adsdk.NOt.ZRu.NOt.ZRu.InterfaceC0381ZRu
    public void ZRu() {
        this.Vor.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.NOt.ZRu.ZRu.mZ
    public void ZRu(List<mZ> list, List<mZ> list2) {
        ArrayList arrayList = new ArrayList(this.FA.size() + list.size());
        arrayList.addAll(list);
        for (int size = this.FA.size() - 1; size >= 0; size--) {
            mZ mZVar = this.FA.get(size);
            mZVar.ZRu(arrayList, this.FA.subList(0, size));
            arrayList.add(mZVar);
        }
    }

    @Override // com.bytedance.adsdk.NOt.ZRu.ZRu.TFq
    public void ZRu(Canvas canvas, Matrix matrix, int i10) {
        if (this.Mm) {
            return;
        }
        this.mZ.set(matrix);
        com.bytedance.adsdk.NOt.ZRu.NOt.yBV ybv = this.ZH;
        if (ybv != null) {
            this.mZ.preConcat(ybv.uR());
            i10 = (int) (((((this.ZH.ZRu() == null ? 100 : this.ZH.ZRu().Mm().intValue()) / 100.0f) * i10) / 255.0f) * 255.0f);
        }
        boolean z10 = this.Vor.Mm() && TFq() && i10 != 255;
        if (z10) {
            this.NOt.set(0.0f, 0.0f, 0.0f, 0.0f);
            ZRu(this.NOt, this.mZ, true);
            this.ZRu.setAlpha(i10);
            com.bytedance.adsdk.NOt.Ht.Ht.ZRu(canvas, this.NOt, this.ZRu);
        }
        if (z10) {
            i10 = 255;
        }
        for (int size = this.FA.size() - 1; size >= 0; size--) {
            mZ mZVar = this.FA.get(size);
            if (mZVar instanceof TFq) {
                ((TFq) mZVar).ZRu(canvas, this.mZ, i10);
            }
        }
        if (z10) {
            canvas.restore();
        }
    }

    @Override // com.bytedance.adsdk.NOt.ZRu.ZRu.TFq
    public void ZRu(RectF rectF, Matrix matrix, boolean z10) {
        this.mZ.set(matrix);
        com.bytedance.adsdk.NOt.ZRu.NOt.yBV ybv = this.ZH;
        if (ybv != null) {
            this.mZ.preConcat(ybv.uR());
        }
        this.TFq.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.FA.size() - 1; size >= 0; size--) {
            mZ mZVar = this.FA.get(size);
            if (mZVar instanceof TFq) {
                ((TFq) mZVar).ZRu(this.TFq, this.mZ, z10);
                rectF.union(this.TFq);
            }
        }
    }
}
