package com.bytedance.sdk.component.adexpress.dynamic.mZ;

import android.content.Context;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes2.dex */
public class qF implements Mm<com.bytedance.sdk.component.adexpress.Ht.ZH> {
    private final com.bytedance.sdk.component.adexpress.Ht.ZH ZRu;

    public qF(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.TFq tFq, com.bytedance.sdk.component.adexpress.dynamic.uR.Mm mm) {
        com.bytedance.sdk.component.adexpress.Ht.ZH zh = new com.bytedance.sdk.component.adexpress.Ht.ZH(context);
        this.ZRu = zh;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.uR.FA.ZRu(context, mm.NBW() > 0 ? mm.NBW() : com.bytedance.sdk.component.adexpress.uR.NOt() ? 0 : 120);
        zh.setLayoutParams(layoutParams);
        zh.setClipChildren(false);
        zh.setText(mm.Gis());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.mZ.Mm
    public void NOt() {
        com.bytedance.sdk.component.adexpress.Ht.ZH zh = this.ZRu;
        if (zh != null) {
            zh.NOt();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.mZ.Mm
    public void ZRu() {
        com.bytedance.sdk.component.adexpress.Ht.ZH zh = this.ZRu;
        if (zh != null) {
            zh.ZRu();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.mZ.Mm
    /* JADX INFO: renamed from: uR, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.component.adexpress.Ht.ZH mZ() {
        return this.ZRu;
    }
}
