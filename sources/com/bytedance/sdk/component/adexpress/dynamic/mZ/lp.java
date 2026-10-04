package com.bytedance.sdk.component.adexpress.dynamic.mZ;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes2.dex */
public class lp implements Mm {
    private com.bytedance.sdk.component.adexpress.Ht.edo ZRu;

    public lp(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.TFq tFq, com.bytedance.sdk.component.adexpress.dynamic.uR.Mm mm) {
        this.ZRu = new com.bytedance.sdk.component.adexpress.Ht.edo(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.uR.FA.ZRu(context, 180.0f), (int) com.bytedance.sdk.component.adexpress.uR.FA.ZRu(context, 180.0f));
        layoutParams.gravity = 17;
        this.ZRu.setLayoutParams(layoutParams);
        this.ZRu.setGuideText(mm.Gis());
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
