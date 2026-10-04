package com.bytedance.adsdk.ugeno.TFq;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class mZ {
    int FA;
    int Ht;
    int Mm;
    int TFq;
    int Vor;
    boolean WMI;
    float ZH;
    float aT;
    int lp;
    int oK;
    boolean qF;
    int sAl;
    int yBV;
    int ZRu = Integer.MAX_VALUE;
    int NOt = Integer.MAX_VALUE;
    int mZ = Integer.MIN_VALUE;
    int uR = Integer.MIN_VALUE;
    List<Integer> edo = new ArrayList();

    public int NOt() {
        return this.FA - this.Vor;
    }

    public int ZRu() {
        return this.Mm;
    }

    public void ZRu(View view, int i10, int i11, int i12, int i13) {
        NOt nOt = (NOt) view.getLayoutParams();
        this.ZRu = Math.min(this.ZRu, (view.getLeft() - nOt.sAl()) - i10);
        this.NOt = Math.min(this.NOt, (view.getTop() - nOt.edo()) - i11);
        this.mZ = Math.max(this.mZ, nOt.oK() + view.getRight() + i12);
        this.uR = Math.max(this.uR, nOt.yBV() + view.getBottom() + i13);
    }
}
