package com.bytedance.adsdk.ugeno.Vor.Ht;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;
import com.bytedance.adsdk.ugeno.ZRu.Ht;
import com.bytedance.adsdk.ugeno.ZRu.TFq;
import com.bytedance.adsdk.ugeno.core.IAnimation;
import com.bytedance.adsdk.ugeno.mZ;

/* JADX INFO: loaded from: classes2.dex */
public class ZRu extends TextView implements TFq, IAnimation {
    private float NOt;
    private mZ ZRu;
    private Ht mZ;

    public ZRu(Context context) {
        super(context);
        this.mZ = new Ht(this);
    }

    public void ZRu(mZ mZVar) {
        this.ZRu = mZVar;
    }

    public float getBorderRadius() {
        return this.mZ.ZRu();
    }

    @Override // com.bytedance.adsdk.ugeno.ZRu.TFq, com.bytedance.adsdk.ugeno.core.IAnimation
    public float getRipple() {
        return this.NOt;
    }

    @Override // com.bytedance.adsdk.ugeno.ZRu.TFq
    public float getRubIn() {
        return this.mZ.getRubIn();
    }

    @Override // com.bytedance.adsdk.ugeno.ZRu.TFq
    public float getShine() {
        return this.mZ.getShine();
    }

    @Override // com.bytedance.adsdk.ugeno.ZRu.TFq
    public float getStretch() {
        return this.mZ.getStretch();
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mZ mZVar = this.ZRu;
        if (mZVar != null) {
            mZVar.Mm();
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mZ mZVar = this.ZRu;
        if (mZVar != null) {
            mZVar.FA();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mZ mZVar = this.ZRu;
        if (mZVar != null) {
            mZVar.ZRu(canvas, this);
            this.ZRu.ZRu(canvas);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        mZ mZVar = this.ZRu;
        if (mZVar != null) {
            mZVar.ZRu(i10, i11, i12, i13);
        }
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        mZ mZVar = this.ZRu;
        if (mZVar == null) {
            super.onMeasure(i10, i11);
        } else {
            int[] iArrZRu = mZVar.ZRu(i10, i11);
            super.onMeasure(iArrZRu[0], iArrZRu[1]);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        mZ mZVar = this.ZRu;
        if (mZVar != null) {
            mZVar.NOt(i10, i11, i12, i12);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        this.mZ.ZRu(i10);
    }

    public void setBorderRadius(float f10) {
        Ht ht = this.mZ;
        if (ht != null) {
            ht.ZRu(f10);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation
    public void setRipple(float f10) {
        this.NOt = f10;
        Ht ht = this.mZ;
        if (ht != null) {
            ht.NOt(f10);
        }
        postInvalidate();
    }

    public void setRubIn(float f10) {
        Ht ht = this.mZ;
        if (ht != null) {
            ht.TFq(f10);
        }
    }

    public void setShine(float f10) {
        Ht ht = this.mZ;
        if (ht != null) {
            ht.mZ(f10);
        }
    }

    public void setStretch(float f10) {
        Ht ht = this.mZ;
        if (ht != null) {
            ht.uR(f10);
        }
    }
}
