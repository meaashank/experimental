package com.bytedance.sdk.component.Ht.ZRu.ZRu;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.Ht.ZRu.FA;
import com.bytedance.sdk.component.Ht.ZRu.ZRu.ZRu.ZRu.Mm;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class mZ implements uR {
    private com.bytedance.sdk.component.Ht.ZRu.uR.NOt.ZRu FA;
    private com.bytedance.sdk.component.Ht.ZRu.ZRu.ZRu.ZRu.TFq Ht;
    private com.bytedance.sdk.component.Ht.ZRu.uR.NOt.ZRu Mm;
    private com.bytedance.sdk.component.Ht.ZRu.ZRu.ZRu.ZRu.ZRu NOt;
    private com.bytedance.sdk.component.Ht.ZRu.ZRu.ZRu.ZRu.Ht TFq;
    private com.bytedance.sdk.component.Ht.ZRu.uR.NOt.ZRu Vor;
    private com.bytedance.sdk.component.Ht.ZRu.uR.NOt.ZRu ZH;
    private com.bytedance.sdk.component.Ht.ZRu.ZRu.ZRu.ZRu.uR ZRu;
    private com.bytedance.sdk.component.Ht.ZRu.uR.NOt.ZRu aT;
    private com.bytedance.sdk.component.Ht.ZRu.uR.NOt.ZRu lp;
    private com.bytedance.sdk.component.Ht.ZRu.ZRu.ZRu.ZRu.NOt mZ;
    private Mm uR;

    public mZ() {
        Context contextHt = FA.Mm().Ht();
        if (com.bytedance.sdk.component.Ht.ZRu.NOt.ZRu.ZRu()) {
            com.bytedance.sdk.component.Ht.ZRu.uR.NOt.ZRu zRuLp = FA.Mm().lp();
            this.Mm = zRuLp;
            this.ZRu = new com.bytedance.sdk.component.Ht.ZRu.ZRu.ZRu.ZRu.uR(contextHt, zRuLp);
        }
        if (com.bytedance.sdk.component.Ht.ZRu.NOt.ZRu.TFq()) {
            if (FA.Mm().aT() != null) {
                this.Vor = FA.Mm().aT();
            } else {
                this.Vor = FA.Mm().sAl();
            }
            this.mZ = new com.bytedance.sdk.component.Ht.ZRu.ZRu.ZRu.ZRu.NOt(contextHt, this.Vor);
        }
        if (com.bytedance.sdk.component.Ht.ZRu.NOt.ZRu.NOt()) {
            com.bytedance.sdk.component.Ht.ZRu.uR.NOt.ZRu zRuSAl = FA.Mm().sAl();
            this.FA = zRuSAl;
            this.NOt = new com.bytedance.sdk.component.Ht.ZRu.ZRu.ZRu.ZRu.ZRu(contextHt, zRuSAl);
        }
        if (com.bytedance.sdk.component.Ht.ZRu.NOt.ZRu.mZ()) {
            com.bytedance.sdk.component.Ht.ZRu.uR.NOt.ZRu zRuSAl2 = FA.Mm().sAl();
            this.aT = zRuSAl2;
            this.uR = new Mm(contextHt, zRuSAl2);
        }
        if (com.bytedance.sdk.component.Ht.ZRu.NOt.ZRu.uR()) {
            com.bytedance.sdk.component.Ht.ZRu.uR.NOt.ZRu zRuEdo = FA.Mm().edo();
            this.ZH = zRuEdo;
            this.TFq = new com.bytedance.sdk.component.Ht.ZRu.ZRu.ZRu.ZRu.Ht(contextHt, zRuEdo);
        }
        if (com.bytedance.sdk.component.Ht.ZRu.NOt.ZRu.Ht()) {
            com.bytedance.sdk.component.Ht.ZRu.uR.NOt.ZRu zRuOK = FA.Mm().oK();
            this.lp = zRuOK;
            this.Ht = new com.bytedance.sdk.component.Ht.ZRu.ZRu.ZRu.ZRu.TFq(contextHt, zRuOK);
        }
    }

    public List<com.bytedance.sdk.component.Ht.ZRu.uR.ZRu> NOt(com.bytedance.sdk.component.Ht.ZRu.uR.ZRu zRu, int i10) {
        if (zRu.uR() == 0 && zRu.TFq() == 1 && com.bytedance.sdk.component.Ht.ZRu.NOt.ZRu.ZRu()) {
            if (this.Mm.NOt() <= i10) {
                return null;
            }
            List<com.bytedance.sdk.component.Ht.ZRu.uR.ZRu> listZRu = this.ZRu.ZRu(this.Mm.NOt() - i10, "_id");
            if (listZRu != null && listZRu.size() != 0) {
                com.bytedance.sdk.component.Ht.ZRu.mZ.NOt.ZRu(com.bytedance.sdk.component.Ht.ZRu.NOt.uR.uR.fcs(), 1);
            }
            return listZRu;
        }
        if (zRu.uR() == 3 && zRu.TFq() == 2 && com.bytedance.sdk.component.Ht.ZRu.NOt.ZRu.TFq()) {
            if (this.Vor.NOt() > i10) {
                return this.mZ.ZRu(this.Vor.NOt() - i10, "_id");
            }
        } else if (zRu.uR() == 0 && zRu.TFq() == 2 && com.bytedance.sdk.component.Ht.ZRu.NOt.ZRu.NOt()) {
            if (this.FA.NOt() > i10) {
                List<com.bytedance.sdk.component.Ht.ZRu.uR.ZRu> listZRu2 = this.NOt.ZRu(this.FA.NOt() - i10, "_id");
                if (listZRu2 != null && listZRu2.size() != 0) {
                    com.bytedance.sdk.component.Ht.ZRu.mZ.NOt.ZRu(com.bytedance.sdk.component.Ht.ZRu.NOt.uR.uR.Nb(), 1);
                }
                return listZRu2;
            }
        } else if (zRu.uR() == 1 && zRu.TFq() == 2 && com.bytedance.sdk.component.Ht.ZRu.NOt.ZRu.mZ()) {
            if (this.aT.NOt() > i10) {
                List<com.bytedance.sdk.component.Ht.ZRu.uR.ZRu> listZRu3 = this.uR.ZRu(this.aT.NOt() - i10, "_id");
                if (listZRu3 != null && listZRu3.size() != 0) {
                    com.bytedance.sdk.component.Ht.ZRu.mZ.NOt.ZRu(com.bytedance.sdk.component.Ht.ZRu.NOt.uR.uR.VdW(), 1);
                }
                return listZRu3;
            }
        } else if (zRu.uR() == 1 && zRu.TFq() == 3 && com.bytedance.sdk.component.Ht.ZRu.NOt.ZRu.uR()) {
            if (this.ZH.NOt() > i10) {
                List<com.bytedance.sdk.component.Ht.ZRu.uR.ZRu> listZRu4 = this.TFq.ZRu(this.ZH.NOt() - i10, "_id");
                if (listZRu4 != null && listZRu4.size() != 0) {
                    com.bytedance.sdk.component.Ht.ZRu.mZ.NOt.ZRu(com.bytedance.sdk.component.Ht.ZRu.NOt.uR.uR.th(), 1);
                }
                return listZRu4;
            }
        } else if (zRu.uR() == 2 && zRu.TFq() == 3 && com.bytedance.sdk.component.Ht.ZRu.NOt.ZRu.Ht() && this.lp.NOt() > i10) {
            return this.Ht.ZRu(this.lp.NOt() - i10, "_id");
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.Ht.ZRu.ZRu.uR
    public void ZRu(com.bytedance.sdk.component.Ht.ZRu.uR.ZRu zRu, int i10) {
        if (zRu == null) {
            return;
        }
        try {
            zRu.NOt(System.currentTimeMillis());
            if (zRu.uR() == 0 && zRu.TFq() == 1) {
                if (com.bytedance.sdk.component.Ht.ZRu.NOt.ZRu.ZRu()) {
                    this.ZRu.ZRu(zRu);
                    return;
                }
                return;
            }
            if (zRu.uR() == 3 && zRu.TFq() == 2) {
                if (com.bytedance.sdk.component.Ht.ZRu.NOt.ZRu.TFq()) {
                    this.mZ.ZRu(zRu);
                    return;
                }
                return;
            }
            if (zRu.uR() == 0 && zRu.TFq() == 2) {
                if (com.bytedance.sdk.component.Ht.ZRu.NOt.ZRu.NOt()) {
                    this.NOt.ZRu(zRu);
                    return;
                }
                return;
            }
            if (zRu.uR() == 1 && zRu.TFq() == 2) {
                if (com.bytedance.sdk.component.Ht.ZRu.NOt.ZRu.mZ()) {
                    this.uR.ZRu(zRu);
                }
            } else if (zRu.uR() == 1 && zRu.TFq() == 3) {
                if (com.bytedance.sdk.component.Ht.ZRu.NOt.ZRu.uR()) {
                    this.TFq.ZRu(zRu);
                }
            } else if (zRu.uR() == 2 && zRu.TFq() == 3 && com.bytedance.sdk.component.Ht.ZRu.NOt.ZRu.Ht()) {
                this.Ht.ZRu(zRu);
            }
        } catch (Throwable unused) {
            com.bytedance.sdk.component.Ht.ZRu.mZ.NOt.ZRu(com.bytedance.sdk.component.Ht.ZRu.NOt.uR.uR.Yx(), 1);
        }
    }

    @Override // com.bytedance.sdk.component.Ht.ZRu.ZRu.uR
    public void ZRu(int i10, List<com.bytedance.sdk.component.Ht.ZRu.uR.ZRu> list) {
        if (list == null || list.size() == 0 || list.get(0) == null) {
            return;
        }
        com.bytedance.sdk.component.Ht.ZRu.uR.ZRu zRu = list.get(0);
        if (i10 == 200 || i10 == -1) {
            com.bytedance.sdk.component.Ht.ZRu.NOt.ZRu.ZRu zRu2 = com.bytedance.sdk.component.Ht.ZRu.NOt.uR.uR;
            com.bytedance.sdk.component.Ht.ZRu.mZ.NOt.ZRu(zRu2.HX(), list.size());
            if (i10 != 200) {
                com.bytedance.sdk.component.Ht.ZRu.mZ.NOt.ZRu(zRu2.ZRJ(), list.size());
            }
            if (zRu.uR() == 0 && zRu.TFq() == 1) {
                if (com.bytedance.sdk.component.Ht.ZRu.NOt.ZRu.ZRu()) {
                    this.ZRu.NOt(list);
                    return;
                }
                return;
            }
            if (zRu.uR() == 3 && zRu.TFq() == 2) {
                if (com.bytedance.sdk.component.Ht.ZRu.NOt.ZRu.TFq()) {
                    this.mZ.NOt(list);
                    return;
                }
                return;
            }
            if (zRu.uR() == 0 && zRu.TFq() == 2) {
                if (com.bytedance.sdk.component.Ht.ZRu.NOt.ZRu.NOt()) {
                    this.NOt.NOt(list);
                    return;
                }
                return;
            }
            if (zRu.uR() == 1 && zRu.TFq() == 2) {
                if (com.bytedance.sdk.component.Ht.ZRu.NOt.ZRu.mZ()) {
                    this.uR.NOt(list);
                }
            } else if (zRu.uR() == 1 && zRu.TFq() == 3) {
                if (com.bytedance.sdk.component.Ht.ZRu.NOt.ZRu.uR()) {
                    this.TFq.NOt(list);
                }
            } else if (zRu.uR() == 2 && zRu.TFq() == 3 && com.bytedance.sdk.component.Ht.ZRu.NOt.ZRu.Ht()) {
                this.Ht.NOt(list);
            }
        }
    }

    @Override // com.bytedance.sdk.component.Ht.ZRu.ZRu.uR
    public List<com.bytedance.sdk.component.Ht.ZRu.uR.ZRu> ZRu(int i10, int i11, List<String> list) {
        if (com.bytedance.sdk.component.Ht.ZRu.NOt.ZRu.ZRu()) {
            List<com.bytedance.sdk.component.Ht.ZRu.uR.ZRu> listZRu = this.ZRu.ZRu("_id");
            if (ZRu(listZRu, list)) {
                listZRu.size();
                com.bytedance.sdk.component.Ht.ZRu.mZ.NOt.ZRu(com.bytedance.sdk.component.Ht.ZRu.NOt.uR.uR.Zf(), 1);
                return listZRu;
            }
        }
        if (com.bytedance.sdk.component.Ht.ZRu.NOt.ZRu.TFq()) {
            List<com.bytedance.sdk.component.Ht.ZRu.uR.ZRu> listZRu2 = this.mZ.ZRu("_id");
            if (ZRu(listZRu2, list)) {
                listZRu2.size();
                return listZRu2;
            }
        }
        if (com.bytedance.sdk.component.Ht.ZRu.NOt.ZRu.NOt()) {
            List<com.bytedance.sdk.component.Ht.ZRu.uR.ZRu> listZRu3 = this.NOt.ZRu("_id");
            if (ZRu(listZRu3, list)) {
                listZRu3.size();
                com.bytedance.sdk.component.Ht.ZRu.mZ.NOt.ZRu(com.bytedance.sdk.component.Ht.ZRu.NOt.uR.uR.ru(), 1);
                return listZRu3;
            }
        }
        if (com.bytedance.sdk.component.Ht.ZRu.NOt.ZRu.mZ()) {
            List<com.bytedance.sdk.component.Ht.ZRu.uR.ZRu> listNOt = this.uR.NOt("_id");
            if (ZRu(listNOt, list)) {
                listNOt.size();
                com.bytedance.sdk.component.Ht.ZRu.mZ.NOt.ZRu(com.bytedance.sdk.component.Ht.ZRu.NOt.uR.uR.le(), 1);
                return listNOt;
            }
        }
        if (com.bytedance.sdk.component.Ht.ZRu.NOt.ZRu.uR()) {
            List<com.bytedance.sdk.component.Ht.ZRu.uR.ZRu> listNOt2 = this.TFq.NOt("_id");
            if (ZRu(listNOt2, list)) {
                listNOt2.size();
                com.bytedance.sdk.component.Ht.ZRu.mZ.NOt.ZRu(com.bytedance.sdk.component.Ht.ZRu.NOt.uR.uR.MR(), 1);
                return listNOt2;
            }
        }
        if (!com.bytedance.sdk.component.Ht.ZRu.NOt.ZRu.Ht()) {
            return null;
        }
        List<com.bytedance.sdk.component.Ht.ZRu.uR.ZRu> listNOt3 = this.Ht.NOt("_id");
        if (!ZRu(listNOt3, list)) {
            return null;
        }
        listNOt3.size();
        return listNOt3;
    }

    private boolean ZRu(List<com.bytedance.sdk.component.Ht.ZRu.uR.ZRu> list, List<String> list2) {
        if (list != null && !list.isEmpty() && list2 != null && !list2.isEmpty()) {
            try {
                Iterator<com.bytedance.sdk.component.Ht.ZRu.uR.ZRu> it = list.iterator();
                while (it.hasNext()) {
                    com.bytedance.sdk.component.Ht.ZRu.uR.ZRu next = it.next();
                    if (next != null) {
                        String strMZ = next.mZ();
                        if (!TextUtils.isEmpty(strMZ) && list2.contains(strMZ)) {
                            it.remove();
                        }
                    }
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        return (list == null || list.isEmpty()) ? false : true;
    }

    @Override // com.bytedance.sdk.component.Ht.ZRu.ZRu.uR
    public boolean ZRu(int i10, boolean z10) {
        com.bytedance.sdk.component.Ht.ZRu.ZRu.ZRu.ZRu.TFq tFq;
        com.bytedance.sdk.component.Ht.ZRu.ZRu.ZRu.ZRu.Ht ht;
        Mm mm;
        com.bytedance.sdk.component.Ht.ZRu.ZRu.ZRu.ZRu.ZRu zRu;
        com.bytedance.sdk.component.Ht.ZRu.ZRu.ZRu.ZRu.NOt nOt;
        com.bytedance.sdk.component.Ht.ZRu.ZRu.ZRu.ZRu.uR uRVar;
        if (com.bytedance.sdk.component.Ht.ZRu.NOt.ZRu.ZRu() && (uRVar = this.ZRu) != null && uRVar.ZRu(i10)) {
            com.bytedance.sdk.component.Ht.ZRu.mZ.NOt.ZRu(com.bytedance.sdk.component.Ht.ZRu.NOt.uR.uR.edo(), 1);
            return true;
        }
        if (com.bytedance.sdk.component.Ht.ZRu.NOt.ZRu.TFq() && (nOt = this.mZ) != null && nOt.ZRu(i10)) {
            return true;
        }
        if (com.bytedance.sdk.component.Ht.ZRu.NOt.ZRu.NOt() && (zRu = this.NOt) != null && zRu.ZRu(i10)) {
            com.bytedance.sdk.component.Ht.ZRu.mZ.NOt.ZRu(com.bytedance.sdk.component.Ht.ZRu.NOt.uR.uR.oK(), 1);
            return true;
        }
        if (com.bytedance.sdk.component.Ht.ZRu.NOt.ZRu.mZ() && (mm = this.uR) != null && mm.ZRu(i10)) {
            com.bytedance.sdk.component.Ht.ZRu.mZ.NOt.ZRu(com.bytedance.sdk.component.Ht.ZRu.NOt.uR.uR.yBV(), 1);
            return true;
        }
        if (!com.bytedance.sdk.component.Ht.ZRu.NOt.ZRu.uR() || (ht = this.TFq) == null || !ht.ZRu(i10)) {
            return com.bytedance.sdk.component.Ht.ZRu.NOt.ZRu.Ht() && (tFq = this.Ht) != null && tFq.ZRu(i10);
        }
        com.bytedance.sdk.component.Ht.ZRu.mZ.NOt.ZRu(com.bytedance.sdk.component.Ht.ZRu.NOt.uR.uR.WMI(), 1);
        return true;
    }

    @Override // com.bytedance.sdk.component.Ht.ZRu.ZRu.uR
    public void ZRu(int i10, long j10) {
        com.bytedance.sdk.component.Ht.ZRu.ZRu.ZRu.ZRu.uR uRVar = this.ZRu;
        if (uRVar != null) {
            uRVar.ZRu(i10, j10);
        }
        com.bytedance.sdk.component.Ht.ZRu.ZRu.ZRu.ZRu.NOt nOt = this.mZ;
        if (nOt != null) {
            nOt.ZRu(i10, j10);
        }
        com.bytedance.sdk.component.Ht.ZRu.ZRu.ZRu.ZRu.ZRu zRu = this.NOt;
        if (zRu != null) {
            zRu.ZRu(i10, j10);
        }
        Mm mm = this.uR;
        if (mm != null) {
            mm.ZRu(i10, j10);
        }
        com.bytedance.sdk.component.Ht.ZRu.ZRu.ZRu.ZRu.Ht ht = this.TFq;
        if (ht != null) {
            ht.ZRu(i10, j10);
        }
        com.bytedance.sdk.component.Ht.ZRu.ZRu.ZRu.ZRu.TFq tFq = this.Ht;
        if (tFq != null) {
            tFq.ZRu(i10, j10);
        }
    }
}
