package com.android.launcher3.graphics;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public class FastScrollThumbDrawable extends Drawable {
    private static final Matrix sMatrix = new Matrix();
    private final boolean mIsRtl;
    private final Paint mPaint;
    private final Path mPath = new Path();

    public FastScrollThumbDrawable(Paint paint, boolean z10) {
        this.mPaint = paint;
        this.mIsRtl = z10;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        canvas.drawPath(this.mPath, this.mPaint);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.mPath.isConvex()) {
            outline.setConvexPath(this.mPath);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.mPath.reset();
        float fHeight = rect.height() * 0.5f;
        float f10 = 2.0f * fHeight;
        float f11 = fHeight / 5.0f;
        Path path = this.mPath;
        int i10 = rect.left;
        int i11 = rect.top;
        path.addRoundRect(i10, i11, i10 + f10, i11 + f10, new float[]{fHeight, fHeight, fHeight, fHeight, f11, f11, fHeight, fHeight}, Path.Direction.CCW);
        Matrix matrix = sMatrix;
        matrix.setRotate(-45.0f, rect.left + fHeight, rect.top + fHeight);
        if (this.mIsRtl) {
            matrix.postTranslate(rect.width(), 0.0f);
            matrix.postScale(-1.0f, 1.0f, rect.width(), 0.0f);
        }
        this.mPath.transform(matrix);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
