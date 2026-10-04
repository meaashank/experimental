package com.bytedance.sdk.component.adexpress.dynamic.mZ;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.Ht.xY;

/* JADX INFO: loaded from: classes2.dex */
public class uR extends WMI<com.bytedance.sdk.component.adexpress.Ht.Mm> {
    public uR(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.TFq tFq, com.bytedance.sdk.component.adexpress.dynamic.uR.Mm mm) {
        super(context, tFq, mm);
        ZRu(mm);
    }

    private void ZRu(com.bytedance.sdk.component.adexpress.dynamic.uR.Mm mm) {
        this.ZRu = new com.bytedance.sdk.component.adexpress.Ht.Mm(this.NOt);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.uR.FA.ZRu(this.NOt, mm.NBW());
        this.ZRu.setLayoutParams(layoutParams);
        this.ZRu.setSlideText(this.uR.Gis());
        xY xYVar = this.ZRu;
        if (xYVar instanceof com.bytedance.sdk.component.adexpress.Ht.Mm) {
            ((com.bytedance.sdk.component.adexpress.Ht.Mm) xYVar).setButtonText(this.uR.aT());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.mZ.WMI, com.bytedance.sdk.component.adexpress.dynamic.mZ.Mm
    public void NOt() {
        this.ZRu.NOt();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.mZ.WMI
    public void uR() {
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.mZ.WMI, com.bytedance.sdk.component.adexpress.dynamic.mZ.Mm
    public void ZRu() {
        this.ZRu.ZRu();
    }
}
