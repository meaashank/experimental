package com.bytedance.adsdk.NOt.ZRu.ZRu;

import android.annotation.TargetApi;
import android.graphics.Path;
import com.bytedance.adsdk.NOt.mZ.NOt.Vor;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
@TargetApi(19)
public class lp implements aT, sAl {
    private final com.bytedance.adsdk.NOt.mZ.NOt.Vor Ht;
    private final String uR;
    private final Path ZRu = new Path();
    private final Path NOt = new Path();
    private final Path mZ = new Path();
    private final List<sAl> TFq = new ArrayList();

    /* JADX INFO: renamed from: com.bytedance.adsdk.NOt.ZRu.ZRu.lp$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] ZRu;

        static {
            int[] iArr = new int[Vor.ZRu.values().length];
            ZRu = iArr;
            try {
                iArr[Vor.ZRu.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ZRu[Vor.ZRu.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ZRu[Vor.ZRu.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ZRu[Vor.ZRu.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                ZRu[Vor.ZRu.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public lp(com.bytedance.adsdk.NOt.mZ.NOt.Vor vor) {
        this.uR = vor.ZRu();
        this.Ht = vor;
    }

    @Override // com.bytedance.adsdk.NOt.ZRu.ZRu.aT
    public void ZRu(ListIterator<mZ> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            mZ mZVarPrevious = listIterator.previous();
            if (mZVarPrevious instanceof sAl) {
                this.TFq.add((sAl) mZVarPrevious);
                listIterator.remove();
            }
        }
    }

    @Override // com.bytedance.adsdk.NOt.ZRu.ZRu.sAl
    public Path uR() {
        this.mZ.reset();
        if (this.Ht.mZ()) {
            return this.mZ;
        }
        int i10 = AnonymousClass1.ZRu[this.Ht.NOt().ordinal()];
        if (i10 == 1) {
            ZRu();
        } else if (i10 == 2) {
            ZRu(Path.Op.UNION);
        } else if (i10 == 3) {
            ZRu(Path.Op.REVERSE_DIFFERENCE);
        } else if (i10 == 4) {
            ZRu(Path.Op.INTERSECT);
        } else if (i10 == 5) {
            ZRu(Path.Op.XOR);
        }
        return this.mZ;
    }

    @Override // com.bytedance.adsdk.NOt.ZRu.ZRu.mZ
    public void ZRu(List<mZ> list, List<mZ> list2) {
        for (int i10 = 0; i10 < this.TFq.size(); i10++) {
            this.TFq.get(i10).ZRu(list, list2);
        }
    }

    private void ZRu() {
        for (int i10 = 0; i10 < this.TFq.size(); i10++) {
            this.mZ.addPath(this.TFq.get(i10).uR());
        }
    }

    @TargetApi(19)
    private void ZRu(Path.Op op) {
        this.NOt.reset();
        this.ZRu.reset();
        for (int size = this.TFq.size() - 1; size > 0; size--) {
            sAl sal = this.TFq.get(size);
            if (sal instanceof uR) {
                uR uRVar = (uR) sal;
                List<sAl> listNOt = uRVar.NOt();
                for (int size2 = listNOt.size() - 1; size2 >= 0; size2--) {
                    Path pathUR = listNOt.get(size2).uR();
                    pathUR.transform(uRVar.mZ());
                    this.NOt.addPath(pathUR);
                }
            } else {
                this.NOt.addPath(sal.uR());
            }
        }
        sAl sal2 = this.TFq.get(0);
        if (sal2 instanceof uR) {
            uR uRVar2 = (uR) sal2;
            List<sAl> listNOt2 = uRVar2.NOt();
            for (int i10 = 0; i10 < listNOt2.size(); i10++) {
                Path pathUR2 = listNOt2.get(i10).uR();
                pathUR2.transform(uRVar2.mZ());
                this.ZRu.addPath(pathUR2);
            }
        } else {
            this.ZRu.set(sal2.uR());
        }
        this.mZ.op(this.ZRu, this.NOt, op);
    }
}
