package com.android.launcher3.graphics;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes2.dex */
public class NinePatchDrawHelper {
    public static final int EXTENSION_PX = 20;
    private final Rect mSrc = new Rect();
    private final RectF mDst = new RectF();
    public final Paint paint = new Paint(1);

    private void draw3Patch(Bitmap bitmap, Canvas canvas, float f10, float f11) {
        int width = bitmap.getWidth();
        int i10 = width / 2;
        float f12 = i10;
        float f13 = f10 + f12;
        drawRegion(bitmap, canvas, 0, i10, f10, f13);
        float f14 = f11 - f12;
        drawRegion(bitmap, canvas, i10, width, f14, f11);
        drawRegion(bitmap, canvas, i10 - 5, i10 + 5, f13, f14);
    }

    private void drawRegion(Bitmap bitmap, Canvas canvas, int i10, int i11, float f10, float f11) {
        Rect rect = this.mSrc;
        rect.left = i10;
        rect.right = i11;
        RectF rectF = this.mDst;
        rectF.left = f10;
        rectF.right = f11;
        canvas.drawBitmap(bitmap, rect, rectF, this.paint);
    }

    public void draw(Bitmap bitmap, Canvas canvas, float f10, float f11, float f12) {
        int height = bitmap.getHeight();
        Rect rect = this.mSrc;
        rect.top = 0;
        rect.bottom = height;
        RectF rectF = this.mDst;
        rectF.top = f11;
        rectF.bottom = f11 + height;
        draw3Patch(bitmap, canvas, f10, f12);
    }

    public void drawVerticallyStretched(Bitmap bitmap, Canvas canvas, float f10, float f11, float f12, float f13) {
        draw(bitmap, canvas, f10, f11, f12);
        int height = bitmap.getHeight();
        Rect rect = this.mSrc;
        rect.top = height - 5;
        rect.bottom = height;
        RectF rectF = this.mDst;
        rectF.top = f11 + height;
        rectF.bottom = f13;
        draw3Patch(bitmap, canvas, f10, f12);
    }
}
