package com.bytedance.adsdk.NOt.mZ.NOt;

import android.support.v4.media.d;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class uR {
    private final int[] NOt;
    private final float[] ZRu;

    public uR(float[] fArr, int[] iArr) {
        this.ZRu = fArr;
        this.NOt = iArr;
    }

    public int[] NOt() {
        return this.NOt;
    }

    public float[] ZRu() {
        return this.ZRu;
    }

    public int mZ() {
        return this.NOt.length;
    }

    public void ZRu(uR uRVar, uR uRVar2, float f10) {
        if (uRVar.NOt.length != uRVar2.NOt.length) {
            StringBuilder sb2 = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
            sb2.append(uRVar.NOt.length);
            sb2.append(" vs ");
            throw new IllegalArgumentException(d.a(sb2, uRVar2.NOt.length, ")"));
        }
        for (int i10 = 0; i10 < uRVar.NOt.length; i10++) {
            this.ZRu[i10] = com.bytedance.adsdk.NOt.Ht.TFq.ZRu(uRVar.ZRu[i10], uRVar2.ZRu[i10], f10);
            this.NOt[i10] = com.bytedance.adsdk.NOt.Ht.NOt.ZRu(f10, uRVar.NOt[i10], uRVar2.NOt[i10]);
        }
    }

    public uR ZRu(float[] fArr) {
        int[] iArr = new int[fArr.length];
        for (int i10 = 0; i10 < fArr.length; i10++) {
            iArr[i10] = ZRu(fArr[i10]);
        }
        return new uR(fArr, iArr);
    }

    private int ZRu(float f10) {
        int iBinarySearch = Arrays.binarySearch(this.ZRu, f10);
        if (iBinarySearch >= 0) {
            return this.NOt[iBinarySearch];
        }
        int i10 = -(iBinarySearch + 1);
        if (i10 == 0) {
            return this.NOt[0];
        }
        int[] iArr = this.NOt;
        if (i10 == iArr.length - 1) {
            return iArr[iArr.length - 1];
        }
        float[] fArr = this.ZRu;
        int i11 = i10 - 1;
        float f11 = fArr[i11];
        return com.bytedance.adsdk.NOt.Ht.NOt.ZRu((f10 - f11) / (fArr[i10] - f11), iArr[i11], iArr[i10]);
    }
}
