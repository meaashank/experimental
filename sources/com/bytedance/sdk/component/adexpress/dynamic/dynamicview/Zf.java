package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public class Zf extends Ht {
    public Zf(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.uR.FA fa2) {
        super(context, dynamicRootView, fa2);
        View view = new View(context);
        this.oK = view;
        addView(view, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Ht, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Yx
    public boolean Vor() {
        super.Vor();
        this.oK.setBackgroundColor(this.lp.Nb());
        return true;
    }
}
