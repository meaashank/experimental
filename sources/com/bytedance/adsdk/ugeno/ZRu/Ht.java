package com.bytedance.adsdk.ugeno.ZRu;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public class Ht implements TFq {
    private float Ht;
    private float NOt;
    private float TFq;
    private View ZRu;
    private float mZ;
    private float uR;

    public Ht(View view) {
        this.ZRu = view;
    }

    public void NOt(float f10) {
        View view = this.ZRu;
        if (view == null) {
            return;
        }
        this.mZ = f10;
        view.postInvalidate();
    }

    public void TFq(float f10) {
        this.Ht = f10;
        this.ZRu.postInvalidate();
    }

    public void ZRu(float f10) {
        View view = this.ZRu;
        if (view == null) {
            return;
        }
        this.NOt = f10;
        Drawable background = view.getBackground();
        if (background instanceof GradientDrawable) {
            ((GradientDrawable) background).setCornerRadius(f10);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ZRu.TFq, com.bytedance.adsdk.ugeno.core.IAnimation
    public float getRipple() {
        return this.mZ;
    }

    @Override // com.bytedance.adsdk.ugeno.ZRu.TFq
    public float getRubIn() {
        return this.Ht;
    }

    @Override // com.bytedance.adsdk.ugeno.ZRu.TFq
    public float getShine() {
        return this.uR;
    }

    @Override // com.bytedance.adsdk.ugeno.ZRu.TFq
    public float getStretch() {
        return this.TFq;
    }

    public void mZ(float f10) {
        View view = this.ZRu;
        if (view == null) {
            return;
        }
        this.uR = f10;
        view.postInvalidate();
    }

    public void uR(float f10) {
        this.TFq = f10;
        this.ZRu.postInvalidate();
    }

    public float ZRu() {
        return this.NOt;
    }

    public void ZRu(int i10) {
        View view = this.ZRu;
        if (view == null) {
            return;
        }
        Drawable background = view.getBackground();
        if (background instanceof GradientDrawable) {
            ((GradientDrawable) background).setColor(i10);
        } else if (background instanceof ColorDrawable) {
            ((ColorDrawable) background.mutate()).setColor(i10);
        }
    }
}
