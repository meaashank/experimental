package com.bytedance.sdk.component.Ht.ZRu.ZRu;

import com.bytedance.sdk.component.Ht.ZRu.FA;
import com.bytedance.sdk.component.Ht.ZRu.ZRu.NOt.Mm;
import java.util.List;
import java.util.Queue;

/* JADX INFO: loaded from: classes2.dex */
public class Ht implements uR {
    private com.bytedance.sdk.component.Ht.ZRu.uR.NOt.ZRu FA;
    private com.bytedance.sdk.component.Ht.ZRu.ZRu.NOt.mZ Ht;
    private com.bytedance.sdk.component.Ht.ZRu.ZRu.NOt.Ht Mm;
    private com.bytedance.sdk.component.Ht.ZRu.ZRu.NOt.TFq NOt;
    private Mm TFq;
    private com.bytedance.sdk.component.Ht.ZRu.uR.NOt.ZRu Vor;
    private com.bytedance.sdk.component.Ht.ZRu.uR.NOt.ZRu ZH;
    TFq ZRu = FA.Mm().uR();
    private com.bytedance.sdk.component.Ht.ZRu.uR.NOt.ZRu aT;
    private Queue<String> edo;
    private com.bytedance.sdk.component.Ht.ZRu.uR.NOt.ZRu lp;
    private com.bytedance.sdk.component.Ht.ZRu.ZRu.NOt.ZRu mZ;
    private com.bytedance.sdk.component.Ht.ZRu.uR.NOt.ZRu sAl;
    private com.bytedance.sdk.component.Ht.ZRu.ZRu.NOt.NOt uR;

    public Ht(Queue<String> queue) {
        this.edo = queue;
        if (com.bytedance.sdk.component.Ht.ZRu.NOt.ZRu.ZRu()) {
            com.bytedance.sdk.component.Ht.ZRu.uR.NOt.ZRu zRuLp = FA.Mm().lp();
            this.FA = zRuLp;
            this.NOt = new com.bytedance.sdk.component.Ht.ZRu.ZRu.NOt.TFq(zRuLp, queue);
        }
        if (com.bytedance.sdk.component.Ht.ZRu.NOt.ZRu.TFq()) {
            if (FA.Mm().aT() != null) {
                this.aT = FA.Mm().aT();
            } else {
                this.aT = FA.Mm().sAl();
            }
            this.uR = new com.bytedance.sdk.component.Ht.ZRu.ZRu.NOt.NOt(this.aT, queue);
        }
        if (com.bytedance.sdk.component.Ht.ZRu.NOt.ZRu.NOt()) {
            com.bytedance.sdk.component.Ht.ZRu.uR.NOt.ZRu zRuSAl = FA.Mm().sAl();
            this.Vor = zRuSAl;
            this.mZ = new com.bytedance.sdk.component.Ht.ZRu.ZRu.NOt.ZRu(zRuSAl, queue);
        }
        if (com.bytedance.sdk.component.Ht.ZRu.NOt.ZRu.mZ()) {
            com.bytedance.sdk.component.Ht.ZRu.uR.NOt.ZRu zRuSAl2 = FA.Mm().sAl();
            this.ZH = zRuSAl2;
            this.TFq = new Mm(zRuSAl2, queue);
        }
        if (com.bytedance.sdk.component.Ht.ZRu.NOt.ZRu.uR()) {
            com.bytedance.sdk.component.Ht.ZRu.uR.NOt.ZRu zRuEdo = FA.Mm().edo();
            this.lp = zRuEdo;
            this.Ht = new com.bytedance.sdk.component.Ht.ZRu.ZRu.NOt.mZ(zRuEdo, queue);
        }
        if (com.bytedance.sdk.component.Ht.ZRu.NOt.ZRu.Ht()) {
            com.bytedance.sdk.component.Ht.ZRu.uR.NOt.ZRu zRuOK = FA.Mm().oK();
            this.sAl = zRuOK;
            this.Mm = new com.bytedance.sdk.component.Ht.ZRu.ZRu.NOt.Ht(zRuOK, queue);
        }
    }

    @Override // com.bytedance.sdk.component.Ht.ZRu.ZRu.uR
    public void ZRu(int i10, long j10) {
    }

    @Override // com.bytedance.sdk.component.Ht.ZRu.ZRu.uR
    public void ZRu(com.bytedance.sdk.component.Ht.ZRu.uR.ZRu zRu, int i10) {
        try {
            byte bUR = zRu.uR();
            byte bTFq = zRu.TFq();
            if (bUR == 0 && bTFq == 1 && com.bytedance.sdk.component.Ht.ZRu.NOt.ZRu.ZRu()) {
                this.NOt.ZRu(zRu);
                return;
            }
            if (bUR == 3 && bTFq == 2 && com.bytedance.sdk.component.Ht.ZRu.NOt.ZRu.TFq()) {
                this.uR.ZRu(zRu);
                return;
            }
            if (bUR == 0 && bTFq == 2 && com.bytedance.sdk.component.Ht.ZRu.NOt.ZRu.NOt()) {
                this.mZ.ZRu(zRu);
                return;
            }
            if (bUR == 1 && bTFq == 2 && com.bytedance.sdk.component.Ht.ZRu.NOt.ZRu.mZ()) {
                this.TFq.ZRu(zRu);
                return;
            }
            if (bUR == 1 && bTFq == 3 && com.bytedance.sdk.component.Ht.ZRu.NOt.ZRu.uR()) {
                this.Ht.ZRu(zRu);
            } else if (bUR == 2 && bTFq == 3 && com.bytedance.sdk.component.Ht.ZRu.NOt.ZRu.Ht()) {
                this.Mm.ZRu(zRu);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.sdk.component.Ht.ZRu.ZRu.uR
    public void ZRu(int i10, List<com.bytedance.sdk.component.Ht.ZRu.uR.ZRu> list) {
        if (list == null || list.size() == 0 || list.get(0) == null) {
            return;
        }
        com.bytedance.sdk.component.Ht.ZRu.uR.ZRu zRu = list.get(0);
        byte bTFq = zRu.TFq();
        byte bUR = zRu.uR();
        if (bUR == 0 && bTFq == 1 && com.bytedance.sdk.component.Ht.ZRu.NOt.ZRu.ZRu()) {
            this.NOt.ZRu(i10, list);
            return;
        }
        if (bUR == 3 && bTFq == 2 && com.bytedance.sdk.component.Ht.ZRu.NOt.ZRu.TFq()) {
            this.uR.ZRu(i10, list);
            return;
        }
        if (bUR == 0 && bTFq == 2 && com.bytedance.sdk.component.Ht.ZRu.NOt.ZRu.NOt()) {
            this.mZ.ZRu(i10, list);
            return;
        }
        if (bUR == 1 && bTFq == 2 && com.bytedance.sdk.component.Ht.ZRu.NOt.ZRu.mZ()) {
            this.TFq.ZRu(i10, list);
            return;
        }
        if (bUR == 1 && bTFq == 3 && com.bytedance.sdk.component.Ht.ZRu.NOt.ZRu.uR()) {
            this.Ht.ZRu(i10, list);
        } else if (bUR == 2 && bTFq == 3 && com.bytedance.sdk.component.Ht.ZRu.NOt.ZRu.Ht()) {
            this.Mm.ZRu(i10, list);
        }
    }

    @Override // com.bytedance.sdk.component.Ht.ZRu.ZRu.uR
    public List<com.bytedance.sdk.component.Ht.ZRu.uR.ZRu> ZRu(int i10, int i11, List<String> list) {
        List<com.bytedance.sdk.component.Ht.ZRu.uR.ZRu> listZRu;
        List<com.bytedance.sdk.component.Ht.ZRu.uR.ZRu> listZRu2;
        List<com.bytedance.sdk.component.Ht.ZRu.uR.ZRu> listZRu3;
        List<com.bytedance.sdk.component.Ht.ZRu.uR.ZRu> listZRu4;
        List<com.bytedance.sdk.component.Ht.ZRu.uR.ZRu> listZRu5;
        List<com.bytedance.sdk.component.Ht.ZRu.uR.ZRu> listZRu6;
        if (com.bytedance.sdk.component.Ht.ZRu.NOt.ZRu.ZRu() && this.NOt.NOt(i10, i11) && (listZRu6 = this.NOt.ZRu(i10, i11)) != null && listZRu6.size() != 0) {
            com.bytedance.sdk.component.Ht.ZRu.mZ.NOt.ZRu(com.bytedance.sdk.component.Ht.ZRu.NOt.uR.uR.qF(), 1);
            return listZRu6;
        }
        if (com.bytedance.sdk.component.Ht.ZRu.NOt.ZRu.TFq() && this.uR.NOt(i10, i11) && (listZRu5 = this.uR.ZRu(i10, i11)) != null && listZRu5.size() != 0) {
            return listZRu5;
        }
        if (com.bytedance.sdk.component.Ht.ZRu.NOt.ZRu.NOt() && this.mZ.NOt(i10, i11) && (listZRu4 = this.mZ.ZRu(i10, i11)) != null && listZRu4.size() != 0) {
            com.bytedance.sdk.component.Ht.ZRu.mZ.NOt.ZRu(com.bytedance.sdk.component.Ht.ZRu.NOt.uR.uR.om(), 1);
            return listZRu4;
        }
        if (com.bytedance.sdk.component.Ht.ZRu.NOt.ZRu.mZ() && this.TFq.NOt(i10, i11) && (listZRu3 = this.TFq.ZRu(i10, i11)) != null && listZRu3.size() != 0) {
            com.bytedance.sdk.component.Ht.ZRu.mZ.NOt.ZRu(com.bytedance.sdk.component.Ht.ZRu.NOt.uR.uR.OCA(), 1);
            return listZRu3;
        }
        if (com.bytedance.sdk.component.Ht.ZRu.NOt.ZRu.uR() && this.Ht.NOt(i10, i11) && (listZRu2 = this.Ht.ZRu(i10, i11)) != null && listZRu2.size() != 0) {
            com.bytedance.sdk.component.Ht.ZRu.mZ.NOt.ZRu(com.bytedance.sdk.component.Ht.ZRu.NOt.uR.uR.to(), 1);
            return listZRu2;
        }
        if (!com.bytedance.sdk.component.Ht.ZRu.NOt.ZRu.Ht() || !this.Mm.NOt(i10, i11) || (listZRu = this.Mm.ZRu(i10, i11)) == null || listZRu.size() == 0) {
            return null;
        }
        return listZRu;
    }

    @Override // com.bytedance.sdk.component.Ht.ZRu.ZRu.uR
    public boolean ZRu(int i10, boolean z10) {
        com.bytedance.sdk.component.Ht.ZRu.ZRu.NOt.Ht ht;
        com.bytedance.sdk.component.Ht.ZRu.uR.NOt.ZRu zRu;
        com.bytedance.sdk.component.Ht.ZRu.ZRu.NOt.mZ mZVar;
        com.bytedance.sdk.component.Ht.ZRu.uR.NOt.ZRu zRu2;
        Mm mm;
        com.bytedance.sdk.component.Ht.ZRu.uR.NOt.ZRu zRu3;
        com.bytedance.sdk.component.Ht.ZRu.ZRu.NOt.ZRu zRu4;
        com.bytedance.sdk.component.Ht.ZRu.uR.NOt.ZRu zRu5;
        com.bytedance.sdk.component.Ht.ZRu.ZRu.NOt.NOt nOt;
        com.bytedance.sdk.component.Ht.ZRu.uR.NOt.ZRu zRu6;
        com.bytedance.sdk.component.Ht.ZRu.ZRu.NOt.TFq tFq;
        com.bytedance.sdk.component.Ht.ZRu.uR.NOt.ZRu zRu7;
        if (com.bytedance.sdk.component.Ht.ZRu.NOt.ZRu.ZRu() && (tFq = this.NOt) != null && (zRu7 = this.FA) != null && tFq.NOt(i10, zRu7.ZRu())) {
            return true;
        }
        if (com.bytedance.sdk.component.Ht.ZRu.NOt.ZRu.TFq() && (nOt = this.uR) != null && (zRu6 = this.aT) != null && nOt.NOt(i10, zRu6.ZRu())) {
            return true;
        }
        if (com.bytedance.sdk.component.Ht.ZRu.NOt.ZRu.NOt() && (zRu4 = this.mZ) != null && (zRu5 = this.Vor) != null && zRu4.NOt(i10, zRu5.ZRu())) {
            return true;
        }
        if (com.bytedance.sdk.component.Ht.ZRu.NOt.ZRu.mZ() && (mm = this.TFq) != null && (zRu3 = this.ZH) != null && mm.NOt(i10, zRu3.ZRu())) {
            return true;
        }
        if (!com.bytedance.sdk.component.Ht.ZRu.NOt.ZRu.uR() || (mZVar = this.Ht) == null || (zRu2 = this.lp) == null || !mZVar.NOt(i10, zRu2.ZRu())) {
            return com.bytedance.sdk.component.Ht.ZRu.NOt.ZRu.Ht() && (ht = this.Mm) != null && (zRu = this.sAl) != null && ht.NOt(i10, zRu.ZRu());
        }
        return true;
    }
}
