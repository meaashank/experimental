package com.bytedance.adsdk.NOt.mZ.ZRu;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class mZ extends edo<com.bytedance.adsdk.NOt.mZ.NOt.uR, com.bytedance.adsdk.NOt.mZ.NOt.uR> {
    public mZ(List<com.bytedance.adsdk.NOt.Mm.ZRu<com.bytedance.adsdk.NOt.mZ.NOt.uR>> list) {
        super(ZRu(list));
    }

    private static List<com.bytedance.adsdk.NOt.Mm.ZRu<com.bytedance.adsdk.NOt.mZ.NOt.uR>> ZRu(List<com.bytedance.adsdk.NOt.Mm.ZRu<com.bytedance.adsdk.NOt.mZ.NOt.uR>> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            list.set(i10, ZRu(list.get(i10)));
        }
        return list;
    }

    @Override // com.bytedance.adsdk.NOt.mZ.ZRu.edo, com.bytedance.adsdk.NOt.mZ.ZRu.sAl
    public /* bridge */ /* synthetic */ boolean NOt() {
        return super.NOt();
    }

    @Override // com.bytedance.adsdk.NOt.mZ.ZRu.edo, com.bytedance.adsdk.NOt.mZ.ZRu.sAl
    public /* bridge */ /* synthetic */ List mZ() {
        return super.mZ();
    }

    @Override // com.bytedance.adsdk.NOt.mZ.ZRu.edo
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    private static com.bytedance.adsdk.NOt.Mm.ZRu<com.bytedance.adsdk.NOt.mZ.NOt.uR> ZRu(com.bytedance.adsdk.NOt.Mm.ZRu<com.bytedance.adsdk.NOt.mZ.NOt.uR> zRu) {
        com.bytedance.adsdk.NOt.mZ.NOt.uR uRVar = zRu.ZRu;
        com.bytedance.adsdk.NOt.mZ.NOt.uR uRVar2 = zRu.NOt;
        if (uRVar == null || uRVar2 == null || uRVar.ZRu().length == uRVar2.ZRu().length) {
            return zRu;
        }
        float[] fArrZRu = ZRu(uRVar.ZRu(), uRVar2.ZRu());
        return zRu.ZRu(uRVar.ZRu(fArrZRu), uRVar2.ZRu(fArrZRu));
    }

    public static float[] ZRu(float[] fArr, float[] fArr2) {
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
        System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
        Arrays.sort(fArr3);
        float f10 = Float.NaN;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            float f11 = fArr3[i11];
            if (f11 != f10) {
                fArr3[i10] = f11;
                i10++;
                f10 = fArr3[i11];
            }
        }
        return Arrays.copyOfRange(fArr3, 0, i10);
    }

    @Override // com.bytedance.adsdk.NOt.mZ.ZRu.sAl
    public com.bytedance.adsdk.NOt.ZRu.NOt.ZRu<com.bytedance.adsdk.NOt.mZ.NOt.uR, com.bytedance.adsdk.NOt.mZ.NOt.uR> ZRu() {
        return new com.bytedance.adsdk.NOt.ZRu.NOt.TFq(this.ZRu);
    }
}
