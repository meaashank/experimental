package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import e.InterfaceC4337k;

/* JADX INFO: loaded from: classes2.dex */
public class qF extends Ht {
    public NOt ZRu;

    public qF(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.uR.FA fa2) {
        super(context, dynamicRootView, fa2);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Ht, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Yx
    public boolean Vor() {
        return super.Vor();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.TFq
    public NOt ZRu(Bitmap bitmap) {
        ZRu zRu = new ZRu(bitmap, this.ZRu);
        this.ZRu = zRu;
        return zRu;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.TFq
    public GradientDrawable getDrawable() {
        NOt nOt = new NOt();
        this.ZRu = nOt;
        return nOt;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.TFq
    public GradientDrawable ZRu(GradientDrawable.Orientation orientation, @InterfaceC4337k int[] iArr) {
        NOt nOt = new NOt(orientation, iArr);
        this.ZRu = nOt;
        return nOt;
    }
}
