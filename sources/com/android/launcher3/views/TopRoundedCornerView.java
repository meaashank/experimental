package com.android.launcher3.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.android.launcher3.util.Themes;
import com.app.hider.master.promax.R;

/* JADX INFO: loaded from: classes2.dex */
public class TopRoundedCornerView extends SpringRelativeLayout {
    private final Path mClipPath;
    private int mNavBarScrimHeight;
    private final Paint mNavBarScrimPaint;
    private float[] mRadii;
    private final RectF mRect;

    public TopRoundedCornerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mRect = new RectF();
        this.mClipPath = new Path();
        this.mNavBarScrimHeight = 0;
        float dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.bg_round_rect_radius);
        this.mRadii = new float[]{dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, 0.0f, 0.0f, 0.0f, 0.0f};
        Paint paint = new Paint();
        this.mNavBarScrimPaint = paint;
        paint.setColor(Themes.getAttrColor(context, R.attr.allAppsNavBarScrimColor));
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.mClipPath);
        super.draw(canvas);
        canvas.restore();
        if (this.mNavBarScrimHeight > 0) {
            canvas.drawRect(0.0f, getHeight() - this.mNavBarScrimHeight, getWidth(), getHeight(), this.mNavBarScrimPaint);
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.mRect.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        this.mClipPath.reset();
        this.mClipPath.addRoundRect(this.mRect, this.mRadii, Path.Direction.CW);
    }

    public void setNavBarScrimHeight(int i10) {
        if (this.mNavBarScrimHeight != i10) {
            this.mNavBarScrimHeight = i10;
            invalidate();
        }
    }

    public TopRoundedCornerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
