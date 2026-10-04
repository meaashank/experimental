package com.bytedance.adsdk.ugeno.Ht;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public class NOt extends ZRu<com.bytedance.adsdk.ugeno.NOt.mZ> {
    private com.bytedance.adsdk.ugeno.mZ mZ;

    public NOt(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.Ht.ZRu
    public View Mm(int i10) {
        return ((com.bytedance.adsdk.ugeno.NOt.mZ) this.ZRu.get(i10)).Vor();
    }

    public void ZRu(com.bytedance.adsdk.ugeno.mZ mZVar) {
        this.mZ = mZVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bytedance.adsdk.ugeno.mZ mZVar = this.mZ;
        if (mZVar != null) {
            mZVar.Mm();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.bytedance.adsdk.ugeno.mZ mZVar = this.mZ;
        if (mZVar != null) {
            mZVar.FA();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        com.bytedance.adsdk.ugeno.mZ mZVar = this.mZ;
        if (mZVar != null) {
            mZVar.Ht();
        }
        super.onLayout(z10, i10, i11, i12, i13);
        com.bytedance.adsdk.ugeno.mZ mZVar2 = this.mZ;
        if (mZVar2 != null) {
            mZVar2.ZRu(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        com.bytedance.adsdk.ugeno.mZ mZVar = this.mZ;
        if (mZVar != null) {
            int[] iArrZRu = mZVar.ZRu(i10, i11);
            super.onMeasure(iArrZRu[0], iArrZRu[1]);
        } else {
            super.onMeasure(i10, i11);
        }
        com.bytedance.adsdk.ugeno.mZ mZVar2 = this.mZ;
        if (mZVar2 != null) {
            mZVar2.TFq();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        com.bytedance.adsdk.ugeno.mZ mZVar = this.mZ;
        if (mZVar != null) {
            mZVar.NOt(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
    }
}
