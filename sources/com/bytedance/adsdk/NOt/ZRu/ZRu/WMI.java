package com.bytedance.adsdk.NOt.ZRu.ZRu;

import android.graphics.PointF;
import com.bytedance.adsdk.NOt.ZRu.NOt.ZRu;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class WMI implements ZRu.InterfaceC0381ZRu, om {
    private final String NOt;
    private final com.bytedance.adsdk.NOt.Vor ZRu;
    private final com.bytedance.adsdk.NOt.ZRu.NOt.ZRu<Float, Float> mZ;
    private com.bytedance.adsdk.NOt.mZ.NOt.edo uR;

    public WMI(com.bytedance.adsdk.NOt.Vor vor, com.bytedance.adsdk.NOt.mZ.mZ.ZRu zRu, com.bytedance.adsdk.NOt.mZ.NOt.sAl sal) {
        this.ZRu = vor;
        this.NOt = sal.ZRu();
        com.bytedance.adsdk.NOt.ZRu.NOt.ZRu<Float, Float> ZRu = sal.NOt().ZRu();
        this.mZ = ZRu;
        zRu.ZRu(ZRu);
        ZRu.ZRu(this);
    }

    public com.bytedance.adsdk.NOt.ZRu.NOt.ZRu<Float, Float> NOt() {
        return this.mZ;
    }

    @Override // com.bytedance.adsdk.NOt.ZRu.ZRu.mZ
    public void ZRu(List<mZ> list, List<mZ> list2) {
    }

    private com.bytedance.adsdk.NOt.mZ.NOt.edo NOt(com.bytedance.adsdk.NOt.mZ.NOt.edo edoVar) {
        List<com.bytedance.adsdk.NOt.mZ.ZRu> listMZ = edoVar.mZ();
        boolean zNOt = edoVar.NOt();
        int size = listMZ.size() - 1;
        int i10 = 0;
        while (size >= 0) {
            com.bytedance.adsdk.NOt.mZ.ZRu zRu = listMZ.get(size);
            com.bytedance.adsdk.NOt.mZ.ZRu zRu2 = listMZ.get(ZRu(size - 1, listMZ.size()));
            PointF pointFMZ = (size != 0 || zNOt) ? zRu2.mZ() : edoVar.ZRu();
            i10 = (((size != 0 || zNOt) ? zRu2.NOt() : pointFMZ).equals(pointFMZ) && zRu.ZRu().equals(pointFMZ) && !(!edoVar.NOt() && size == 0 && size == listMZ.size() - 1)) ? i10 + 2 : i10 + 1;
            size--;
        }
        com.bytedance.adsdk.NOt.mZ.NOt.edo edoVar2 = this.uR;
        if (edoVar2 == null || edoVar2.mZ().size() != i10) {
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                arrayList.add(new com.bytedance.adsdk.NOt.mZ.ZRu());
            }
            this.uR = new com.bytedance.adsdk.NOt.mZ.NOt.edo(new PointF(0.0f, 0.0f), false, arrayList);
        }
        this.uR.ZRu(zNOt);
        return this.uR;
    }

    @Override // com.bytedance.adsdk.NOt.ZRu.NOt.ZRu.InterfaceC0381ZRu
    public void ZRu() {
        this.ZRu.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a1  */
    @Override // com.bytedance.adsdk.NOt.ZRu.ZRu.om
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.bytedance.adsdk.NOt.mZ.NOt.edo ZRu(com.bytedance.adsdk.NOt.mZ.NOt.edo r19) {
        /*
            Method dump skipped, instruction units count: 412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.NOt.ZRu.ZRu.WMI.ZRu(com.bytedance.adsdk.NOt.mZ.NOt.edo):com.bytedance.adsdk.NOt.mZ.NOt.edo");
    }

    private static int NOt(int i10, int i11) {
        int i12 = i10 / i11;
        return ((i10 ^ i11) >= 0 || i11 * i12 == i10) ? i12 : i12 - 1;
    }

    private static int ZRu(int i10, int i11) {
        return i10 - (NOt(i10, i11) * i11);
    }
}
