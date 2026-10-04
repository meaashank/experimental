package com.bytedance.sdk.component.adexpress.dynamic.TFq;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.NOt.sAl;
import com.bytedance.sdk.component.adexpress.dynamic.TFq.NOt;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class TFq {
    protected NOt NOt;
    public com.bytedance.sdk.component.adexpress.dynamic.uR.NOt ZRu;
    private com.bytedance.sdk.component.adexpress.dynamic.uR.FA mZ;
    private ZRu uR;

    public static class ZRu {
        float NOt;
        float ZRu;
        float mZ;
    }

    public TFq(double d10, int i10, double d11, String str, sAl sal) {
        this.NOt = new NOt(d10, i10, d11, str, sal);
    }

    public void ZRu(ZRu zRu) {
        this.uR = zRu;
    }

    public void ZRu() {
        this.NOt.ZRu();
    }

    public void ZRu(com.bytedance.sdk.component.adexpress.dynamic.uR.FA fa2, float f10, float f11) {
        if (fa2 != null) {
            this.mZ = fa2;
        }
        com.bytedance.sdk.component.adexpress.dynamic.uR.FA fa3 = this.mZ;
        float fFA = fa3.FA();
        float fVor = fa3.Vor();
        float f12 = TextUtils.equals(fa3.aT().TFq().fcs(), "fixed") ? fVor : 65536.0f;
        this.NOt.ZRu();
        this.NOt.mZ(fa3, fFA, f12);
        NOt.mZ mZVarZRu = this.NOt.ZRu(fa3);
        com.bytedance.sdk.component.adexpress.dynamic.uR.NOt nOt = new com.bytedance.sdk.component.adexpress.dynamic.uR.NOt();
        nOt.ZRu = f10;
        nOt.NOt = f11;
        if (mZVarZRu != null) {
            fFA = mZVarZRu.ZRu;
        }
        nOt.mZ = fFA;
        if (mZVarZRu != null) {
            fVor = mZVarZRu.NOt;
        }
        nOt.uR = fVor;
        nOt.TFq = "root";
        nOt.Vor = 1280.0f;
        nOt.Ht = fa3;
        fa3.mZ(f10);
        nOt.Ht.uR(nOt.NOt);
        nOt.Ht.TFq(nOt.mZ);
        nOt.Ht.Ht(nOt.uR);
        com.bytedance.sdk.component.adexpress.dynamic.uR.NOt nOtZRu = ZRu(nOt, 0.0f);
        this.ZRu = nOtZRu;
        ZRu(nOtZRu);
    }

    public void ZRu(com.bytedance.sdk.component.adexpress.dynamic.uR.NOt nOt) {
        if (nOt == null) {
            return;
        }
        nOt.Ht.aT().NOt();
        List<List<com.bytedance.sdk.component.adexpress.dynamic.uR.NOt>> list = nOt.Mm;
        if (list == null || list.size() <= 0) {
            return;
        }
        for (List<com.bytedance.sdk.component.adexpress.dynamic.uR.NOt> list2 : list) {
            if (list2 != null && list2.size() > 0) {
                Iterator<com.bytedance.sdk.component.adexpress.dynamic.uR.NOt> it = list2.iterator();
                while (it.hasNext()) {
                    ZRu(it.next());
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.bytedance.sdk.component.adexpress.dynamic.uR.NOt ZRu(com.bytedance.sdk.component.adexpress.dynamic.uR.NOt r37, float r38) {
        /*
            Method dump skipped, instruction units count: 1009
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.dynamic.TFq.TFq.ZRu(com.bytedance.sdk.component.adexpress.dynamic.uR.NOt, float):com.bytedance.sdk.component.adexpress.dynamic.uR.NOt");
    }

    private com.bytedance.sdk.component.adexpress.dynamic.uR.Vor ZRu(com.bytedance.sdk.component.adexpress.dynamic.uR.Ht ht, NOt.mZ mZVar, NOt.mZ mZVar2) {
        float fCXy = ht.CXy();
        float fFFX = ht.FFX();
        float fPDA = ht.pDA();
        float fZkn = ht.zkn();
        boolean zYM = ht.yM();
        boolean zGX = ht.gX();
        boolean zGC = ht.GC();
        boolean zVE = ht.vE();
        if (!zYM) {
            if (zGX) {
                float f10 = this.uR.ZRu;
                fCXy = ((f10 != 0.0f ? Math.min(f10, mZVar.ZRu) : mZVar.ZRu) - fPDA) - mZVar2.ZRu;
            } else {
                fCXy = 0.0f;
            }
        }
        if (!zGC) {
            if (zVE) {
                float f11 = this.uR.NOt;
                if (f11 == 0.0f) {
                    f11 = mZVar.NOt;
                }
                fFFX = (f11 - fZkn) - mZVar2.NOt;
            } else {
                fFFX = 0.0f;
            }
        }
        return new com.bytedance.sdk.component.adexpress.dynamic.uR.Vor(fCXy, fFFX);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009b A[PHI: r4
      0x009b: PHI (r4v3 float) = (r4v0 float), (r4v5 float) binds: [B:31:0x00a4, B:27:0x0092] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.bytedance.sdk.component.adexpress.dynamic.uR.Vor ZRu(com.bytedance.sdk.component.adexpress.dynamic.uR.NOt r18, com.bytedance.sdk.component.adexpress.dynamic.uR.Ht r19, float r20, float r21) {
        /*
            r17 = this;
            r0 = r18
            r1 = r20
            r2 = r21
            float r3 = r0.ZRu
            float r4 = r0.NOt
            int r5 = r19.CXy()
            float r5 = (float) r5
            int r6 = r19.FFX()
            float r6 = (float) r6
            int r7 = r19.pDA()
            float r7 = (float) r7
            int r8 = r19.zkn()
            float r8 = (float) r8
            boolean r9 = r19.yM()
            boolean r10 = r19.gX()
            boolean r11 = r19.GC()
            boolean r12 = r19.vE()
            java.lang.String r13 = r19.MU()
            float r14 = r0.mZ
            float r15 = r0.uR
            r16 = r3
            java.lang.String r3 = "0"
            boolean r3 = android.text.TextUtils.equals(r13, r3)
            if (r3 == 0) goto L61
            if (r9 == 0) goto L47
            float r1 = r0.ZRu
            float r3 = r1 + r5
            goto L51
        L47:
            if (r10 == 0) goto L4f
            float r3 = r0.ZRu
            float r3 = r3 + r14
            float r3 = r3 - r7
            float r3 = r3 - r1
            goto L51
        L4f:
            r3 = r16
        L51:
            if (r11 == 0) goto L58
            float r0 = r0.NOt
        L55:
            float r4 = r0 + r6
            goto Lb3
        L58:
            if (r12 == 0) goto Lb3
            float r0 = r0.NOt
        L5c:
            float r0 = r0 + r15
            float r0 = r0 - r8
            float r4 = r0 - r2
            goto Lb3
        L61:
            java.lang.String r3 = "1"
            boolean r3 = android.text.TextUtils.equals(r13, r3)
            r19 = r3
            r3 = 1073741824(0x40000000, float:2.0)
            if (r19 == 0) goto L7d
            float r5 = r0.ZRu
            float r3 = androidx.compose.animation.W.a(r14, r1, r3, r5)
            if (r11 == 0) goto L78
            float r0 = r0.NOt
            goto L55
        L78:
            if (r12 == 0) goto Lb3
            float r0 = r0.NOt
            goto L5c
        L7d:
            java.lang.String r6 = "2"
            boolean r6 = android.text.TextUtils.equals(r13, r6)
            if (r6 == 0) goto L9e
            float r4 = r0.NOt
            float r4 = androidx.compose.animation.W.a(r15, r2, r3, r4)
            if (r9 == 0) goto L92
            float r0 = r0.ZRu
            float r3 = r0 + r5
            goto Lb3
        L92:
            if (r10 == 0) goto L9b
            float r0 = r0.ZRu
            float r0 = r0 + r14
            float r0 = r0 - r7
            float r3 = r0 - r1
            goto Lb3
        L9b:
            r3 = r16
            goto Lb3
        L9e:
            java.lang.String r5 = "3"
            boolean r5 = android.text.TextUtils.equals(r13, r5)
            if (r5 == 0) goto L9b
            float r4 = r0.ZRu
            float r1 = androidx.compose.animation.W.a(r14, r1, r3, r4)
            float r0 = r0.NOt
            float r4 = androidx.compose.animation.W.a(r15, r2, r3, r0)
            r3 = r1
        Lb3:
            com.bytedance.sdk.component.adexpress.dynamic.uR.Vor r0 = new com.bytedance.sdk.component.adexpress.dynamic.uR.Vor
            r0.<init>(r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.dynamic.TFq.TFq.ZRu(com.bytedance.sdk.component.adexpress.dynamic.uR.NOt, com.bytedance.sdk.component.adexpress.dynamic.uR.Ht, float, float):com.bytedance.sdk.component.adexpress.dynamic.uR.Vor");
    }
}
