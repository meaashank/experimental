package com.bytedance.adsdk.ugeno.Vor.TFq;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.view.E;
import com.bytedance.adsdk.ugeno.Mm.FA;
import com.bytedance.adsdk.ugeno.Mm.uR;
import com.bytedance.adsdk.ugeno.mZ;

/* JADX INFO: loaded from: classes2.dex */
public class ZRu extends FrameLayout {
    private mZ FA;
    private LinearLayout Ht;
    private Context Mm;
    private float NOt;
    private LinearLayout TFq;
    private float ZRu;
    private double mZ;
    private float uR;

    public ZRu(Context context) {
        super(context);
        this.Mm = context;
        this.TFq = new LinearLayout(context);
        this.Ht = new LinearLayout(context);
        this.TFq.setOrientation(0);
        this.TFq.setGravity(E.f111493b);
        this.Ht.setOrientation(0);
        this.Ht.setGravity(E.f111493b);
    }

    private ImageView getStarImageView() {
        ImageView imageView = new ImageView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) this.ZRu, (int) this.NOt);
        float f10 = this.uR;
        layoutParams.leftMargin = (int) f10;
        layoutParams.topMargin = 0;
        layoutParams.rightMargin = (int) f10;
        layoutParams.bottomMargin = 1;
        imageView.setLayoutParams(layoutParams);
        return imageView;
    }

    public void ZRu(double d10, int i10, int i11, float f10, int i12) {
        removeAllViews();
        this.TFq.removeAllViews();
        this.Ht.removeAllViews();
        this.ZRu = (int) FA.ZRu(this.Mm, f10);
        this.NOt = (int) FA.ZRu(this.Mm, f10);
        this.mZ = d10;
        this.uR = i12;
        for (int i13 = 0; i13 < 5; i13++) {
            ImageView starImageView = getStarImageView();
            starImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView.setImageResource(uR.ZRu(this.Mm, "tt_ugen_rating_star"));
            starImageView.setColorFilter(i10, PorterDuff.Mode.SRC_IN);
            this.Ht.addView(starImageView);
        }
        for (int i14 = 0; i14 < 5; i14++) {
            ImageView starImageView2 = getStarImageView();
            starImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView2.setImageResource(uR.ZRu(this.Mm, "tt_ugen_rating_star"));
            starImageView2.setColorFilter(i11);
            this.TFq.addView(starImageView2);
        }
        addView(this.TFq);
        addView(this.Ht);
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mZ mZVar = this.FA;
        if (mZVar != null) {
            mZVar.Mm();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mZ mZVar = this.FA;
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
        mZ mZVar = this.FA;
        if (mZVar != null) {
            mZVar.ZRu(i10, i11, i12, i13);
        }
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        mZ mZVar = this.FA;
        if (mZVar != null) {
            mZVar.ZRu(i10, i11);
        }
        super.onMeasure(i10, i11);
        this.TFq.measure(i10, i11);
        double dFloor = Math.floor(this.mZ);
        float f10 = this.uR;
        float f11 = this.ZRu;
        this.Ht.measure(View.MeasureSpec.makeMeasureSpec((int) (((this.mZ - dFloor) * ((double) f11)) + (((double) (f10 + f10 + f11)) * dFloor) + ((double) f10)), 1073741824), View.MeasureSpec.makeMeasureSpec(this.TFq.getMeasuredHeight(), 1073741824));
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        mZ mZVar = this.FA;
        if (mZVar != null) {
            mZVar.NOt(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
    }

    public void ZRu(mZ mZVar) {
        this.FA = mZVar;
    }
}
