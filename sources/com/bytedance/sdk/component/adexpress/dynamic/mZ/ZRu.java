package com.bytedance.sdk.component.adexpress.dynamic.mZ;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes2.dex */
public class ZRu implements Mm {
    private com.bytedance.sdk.component.adexpress.Ht.NOt ZRu;

    public ZRu(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.TFq tFq, com.bytedance.sdk.component.adexpress.dynamic.uR.Mm mm) {
        double dGC = mm.GC();
        dGC = dGC == 0.0d ? 1.0d : dGC;
        double dVE = mm.vE();
        double d10 = dVE != 0.0d ? dVE : 1.0d;
        int dynamicWidth = (int) (((double) tFq.getDynamicWidth()) * 0.32d * dGC);
        int dynamicWidth2 = (int) (((double) tFq.getDynamicWidth()) * 0.32d * d10);
        this.ZRu = new com.bytedance.sdk.component.adexpress.Ht.NOt(context, dynamicWidth, dynamicWidth2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dynamicWidth, dynamicWidth2);
        layoutParams.gravity = 17;
        layoutParams.topMargin = (int) com.bytedance.sdk.component.adexpress.uR.FA.ZRu(context, mm.yM() - 7);
        layoutParams.leftMargin = (int) com.bytedance.sdk.component.adexpress.uR.FA.ZRu(context, mm.gX() - 3);
        this.ZRu.setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.mZ.Mm
    public void NOt() {
        this.ZRu.NOt();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.mZ.Mm
    public void ZRu() {
        this.ZRu.ZRu();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.mZ.Mm
    public ViewGroup mZ() {
        return this.ZRu;
    }
}
