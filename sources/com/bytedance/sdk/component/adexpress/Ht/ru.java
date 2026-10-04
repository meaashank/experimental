package com.bytedance.sdk.component.adexpress.Ht;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.view.E;
import s0.C5559a;

/* JADX INFO: loaded from: classes2.dex */
public class ru extends FrameLayout {
    private static final int Vor = (com.bytedance.sdk.component.adexpress.dynamic.TFq.ZH.NOt("", 0.0f, true)[1] / 2) + 1;
    private static final int aT = (com.bytedance.sdk.component.adexpress.dynamic.TFq.ZH.NOt("", 0.0f, true)[1] / 2) + 3;
    private float FA;
    private Drawable Ht;
    private double Mm;
    LinearLayout NOt;
    private Drawable TFq;
    LinearLayout ZRu;
    private float mZ;
    private float uR;

    public ru(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.ZRu = new LinearLayout(getContext());
        this.NOt = new LinearLayout(getContext());
        this.ZRu.setOrientation(0);
        this.ZRu.setGravity(E.f111493b);
        this.NOt.setOrientation(0);
        this.NOt.setGravity(E.f111493b);
        this.TFq = com.bytedance.sdk.component.utils.om.mZ(context, "tt_star_thick");
        this.Ht = com.bytedance.sdk.component.utils.om.mZ(context, "tt_star");
    }

    private ImageView getStarImageView() {
        ImageView imageView = new ImageView(getContext());
        imageView.setLayoutParams(new ViewGroup.LayoutParams((int) this.mZ, (int) this.uR));
        imageView.setPadding(1, Vor, 1, aT);
        return imageView;
    }

    public void ZRu(double d10, int i10, int i11, int i12) {
        float f10 = i11;
        this.mZ = (int) com.bytedance.sdk.component.adexpress.uR.FA.mZ(getContext(), f10);
        this.uR = (int) com.bytedance.sdk.component.adexpress.uR.FA.mZ(getContext(), f10);
        this.Mm = d10;
        this.FA = i12;
        removeAllViews();
        for (int i13 = 0; i13 < 5; i13++) {
            ImageView starImageView = getStarImageView();
            starImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView.setColorFilter(i10, PorterDuff.Mode.SRC_IN);
            starImageView.setImageDrawable(getStarFillDrawable());
            this.NOt.addView(starImageView);
        }
        for (int i14 = 0; i14 < 5; i14++) {
            ImageView starImageView2 = getStarImageView();
            starImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView2.setImageDrawable(getStarEmptyDrawable());
            this.ZRu.addView(starImageView2);
        }
        addView(this.ZRu);
        addView(this.NOt);
        requestLayout();
    }

    public Drawable getStarEmptyDrawable() {
        return this.TFq;
    }

    public Drawable getStarFillDrawable() {
        return this.Ht;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.ZRu.measure(i10, i11);
        double d10 = this.Mm;
        float f10 = this.mZ;
        this.NOt.measure(View.MeasureSpec.makeMeasureSpec((int) C5559a.a(d10, (int) d10, f10 - 2.0f, (((int) d10) * f10) + 1.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(this.ZRu.getMeasuredHeight(), 1073741824));
        if (this.FA > 0.0f) {
            this.ZRu.setPadding(0, ((int) (r10.getMeasuredHeight() - this.FA)) / 2, 0, 0);
            this.NOt.setPadding(0, ((int) (this.ZRu.getMeasuredHeight() - this.FA)) / 2, 0, 0);
        }
    }
}
