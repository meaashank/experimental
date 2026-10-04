package com.bytedance.sdk.component.adexpress.dynamic.mZ;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.Ht.to;

/* JADX INFO: loaded from: classes2.dex */
public class yBV implements Mm {
    private Context NOt;
    private to ZRu;
    private com.bytedance.sdk.component.adexpress.dynamic.dynamicview.TFq mZ;
    private com.bytedance.sdk.component.adexpress.dynamic.uR.Mm uR;

    public yBV(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.TFq tFq, com.bytedance.sdk.component.adexpress.dynamic.uR.Mm mm) {
        this.NOt = context;
        this.mZ = tFq;
        this.uR = mm;
        uR();
    }

    private void uR() {
        this.ZRu = new to(this.NOt);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, (int) com.bytedance.sdk.component.adexpress.uR.FA.ZRu(this.NOt, 120.0f));
        layoutParams.gravity = 17;
        this.ZRu.setLayoutParams(layoutParams);
        this.ZRu.setClipChildren(false);
        this.ZRu.setGuideText(this.uR.Gis());
        com.bytedance.sdk.component.adexpress.dynamic.dynamicview.TFq tFq = this.mZ;
        if (tFq != null) {
            this.ZRu.setOnClickListener((View.OnClickListener) tFq.getDynamicClickListener());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.mZ.Mm
    public void NOt() {
        to toVar = this.ZRu;
        if (toVar != null) {
            toVar.NOt();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.mZ.Mm
    public void ZRu() {
        to toVar = this.ZRu;
        if (toVar != null) {
            toVar.ZRu();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.mZ.Mm
    public ViewGroup mZ() {
        return this.ZRu;
    }
}
