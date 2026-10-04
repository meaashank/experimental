package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.sdk.openadsdk.utils.Cox;

/* JADX INFO: loaded from: classes3.dex */
public class yBV extends View {
    private float Ht;
    private final boolean NOt;
    private Drawable TFq;
    private final Path ZRu;
    private int mZ;
    private Drawable uR;

    public yBV(Context context) {
        this(context, false);
    }

    private void NOt() {
        int width = getWidth();
        int height = getHeight();
        if (this.Ht <= 0.0f || width <= 0 || height <= 0) {
            return;
        }
        this.ZRu.reset();
        this.ZRu.addRect(new RectF(0.0f, 0.0f, width * this.Ht, height), Path.Direction.CCW);
    }

    private void ZRu() {
        Context context = getContext();
        this.uR = com.bytedance.sdk.component.utils.om.mZ(context, this.NOt ? "tt_star_thick_dark" : "tt_star_thick");
        this.TFq = com.bytedance.sdk.component.utils.om.mZ(context, "tt_star");
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.mZ <= 0) {
            return;
        }
        int iSave = canvas.save();
        for (int i10 = 0; i10 < 5; i10++) {
            this.uR.draw(canvas);
            canvas.translate(this.mZ, 0.0f);
        }
        canvas.restoreToCount(iSave);
        canvas.clipPath(this.ZRu);
        for (int i11 = 0; i11 < 5; i11++) {
            this.TFq.draw(canvas);
            canvas.translate(this.mZ, 0.0f);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.mZ * 5, 1073741824), View.MeasureSpec.makeMeasureSpec(this.mZ, 1073741824));
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        NOt();
    }

    public yBV(Context context, boolean z10) {
        super(context);
        this.ZRu = new Path();
        this.NOt = z10;
        ZRu();
    }

    public void ZRu(double d10, int i10) {
        int iZRu = (int) Cox.ZRu(getContext(), i10, false);
        this.mZ = iZRu;
        this.uR.setBounds(0, 0, iZRu, iZRu);
        Drawable drawable = this.TFq;
        int i11 = this.mZ;
        drawable.setBounds(0, 0, i11, i11);
        this.Ht = ((float) d10) / 5.0f;
        NOt();
        requestLayout();
    }
}
