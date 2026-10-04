package com.bytedance.sdk.component.adexpress.dynamic.mZ;

import android.content.Context;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes2.dex */
public class mZ implements Mm {
    com.bytedance.sdk.component.adexpress.Ht.TFq ZRu;

    public mZ(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.TFq tFq, com.bytedance.sdk.component.adexpress.dynamic.uR.Mm mm) {
        this.ZRu = new com.bytedance.sdk.component.adexpress.Ht.TFq(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(tFq.getDynamicHeight(), tFq.getDynamicHeight());
        layoutParams.gravity = 17;
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
    /* JADX INFO: renamed from: uR, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.component.adexpress.Ht.TFq mZ() {
        return this.ZRu;
    }
}
