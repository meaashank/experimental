package com.bytedance.sdk.component.adexpress.dynamic.mZ;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.Ht.xY;

/* JADX INFO: loaded from: classes2.dex */
public class WMI<E extends xY> implements Mm<E> {
    protected Context NOt;
    protected int TFq;
    protected xY ZRu;
    protected com.bytedance.sdk.component.adexpress.dynamic.dynamicview.TFq mZ;
    protected com.bytedance.sdk.component.adexpress.dynamic.uR.Mm uR;

    public WMI(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.TFq tFq, com.bytedance.sdk.component.adexpress.dynamic.uR.Mm mm, int i10) {
        this.TFq = i10;
        this.NOt = context;
        this.mZ = tFq;
        this.uR = mm;
        uR();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.mZ.Mm
    public void NOt() {
        this.ZRu.NOt();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.mZ.Mm
    /* JADX INFO: renamed from: TFq, reason: merged with bridge method [inline-methods] */
    public E mZ() {
        return (E) this.ZRu;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.mZ.Mm
    public void ZRu() {
        this.ZRu.ZRu();
    }

    public void uR() {
        this.ZRu = new xY(this.NOt, this.uR.Qg());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) com.bytedance.sdk.component.adexpress.uR.FA.ZRu(this.NOt, 200.0f));
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.uR.FA.ZRu(this.NOt, 100 - this.TFq);
        this.ZRu.setLayoutParams(layoutParams);
        try {
            this.ZRu.setGuideText(this.uR.Gis());
        } catch (Throwable unused) {
        }
    }

    public WMI(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.TFq tFq, com.bytedance.sdk.component.adexpress.dynamic.uR.Mm mm) {
        this(context, tFq, mm, 0);
    }
}
