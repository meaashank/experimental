package com.android.launcher3.graphics;

import G0.C1162y;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import com.android.launcher3.LauncherAppState;

/* JADX INFO: loaded from: classes2.dex */
public class ShadowGenerator {
    private static final int AMBIENT_SHADOW_ALPHA = 30;
    public static final float BLUR_FACTOR = 0.010416667f;
    private static final float HALF_DISTANCE = 0.5f;
    private static final int KEY_SHADOW_ALPHA = 61;
    public static final float KEY_SHADOW_DISTANCE = 0.020833334f;
    private final Paint mBlurPaint;
    private final BlurMaskFilter mDefaultBlurMaskFilter;
    private final Paint mDrawPaint;
    private final int mIconSize;

    public static class Builder {
        public final int color;
        public float keyShadowDistance;
        public float radius;
        public float shadowBlur;
        public final RectF bounds = new RectF();
        public int ambientShadowAlpha = 30;
        public int keyShadowAlpha = 61;

        public Builder(int i10) {
            this.color = i10;
        }

        public Bitmap createPill(int i10, int i11) {
            this.radius = i11 / 2;
            int iMax = Math.max(Math.round((i10 / 2) + this.shadowBlur), Math.round(this.radius + this.shadowBlur + this.keyShadowDistance));
            this.bounds.set(0.0f, 0.0f, i10, i11);
            this.bounds.offsetTo(iMax - r1, iMax - r0);
            int i12 = iMax * 2;
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i12, i12, Bitmap.Config.ARGB_8888);
            drawShadow(new Canvas(bitmapCreateBitmap));
            return bitmapCreateBitmap;
        }

        public void drawShadow(Canvas canvas) {
            Paint paint = new Paint(3);
            paint.setColor(this.color);
            paint.setShadowLayer(this.shadowBlur, 0.0f, this.keyShadowDistance, C1162y.D(-16777216, this.keyShadowAlpha));
            RectF rectF = this.bounds;
            float f10 = this.radius;
            canvas.drawRoundRect(rectF, f10, f10, paint);
            paint.setShadowLayer(this.shadowBlur, 0.0f, 0.0f, C1162y.D(-16777216, this.ambientShadowAlpha));
            RectF rectF2 = this.bounds;
            float f11 = this.radius;
            canvas.drawRoundRect(rectF2, f11, f11, paint);
            if (Color.alpha(this.color) < 255) {
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                paint.clearShadowLayer();
                paint.setColor(-16777216);
                RectF rectF3 = this.bounds;
                float f12 = this.radius;
                canvas.drawRoundRect(rectF3, f12, f12, paint);
                paint.setXfermode(null);
                paint.setColor(this.color);
                RectF rectF4 = this.bounds;
                float f13 = this.radius;
                canvas.drawRoundRect(rectF4, f13, f13, paint);
            }
        }

        public Builder setupBlurForSize(int i10) {
            float f10 = i10 * 1.0f;
            this.shadowBlur = f10 / 32.0f;
            this.keyShadowDistance = f10 / 16.0f;
            return this;
        }
    }

    public ShadowGenerator(Context context) {
        int i10 = LauncherAppState.getIDP(context).iconBitmapSize;
        this.mIconSize = i10;
        this.mBlurPaint = new Paint(3);
        this.mDrawPaint = new Paint(3);
        this.mDefaultBlurMaskFilter = new BlurMaskFilter(i10 * 0.010416667f, BlurMaskFilter.Blur.NORMAL);
    }

    public static float getScaleForBounds(RectF rectF) {
        float fMin = Math.min(Math.min(rectF.left, rectF.right), rectF.top);
        float f10 = fMin < 0.010416667f ? 0.48958334f / (0.5f - fMin) : 1.0f;
        float f11 = rectF.bottom;
        return f11 < 0.03125f ? Math.min(f10, 0.46875f / (0.5f - f11)) : f10;
    }

    public synchronized void recreateIcon(Bitmap bitmap, Canvas canvas) throws Throwable {
        try {
            try {
                recreateIcon(bitmap, this.mDefaultBlurMaskFilter, 30, 61, canvas);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public synchronized void recreateIcon(Bitmap bitmap, BlurMaskFilter blurMaskFilter, int i10, int i11, Canvas canvas) {
        this.mBlurPaint.setMaskFilter(blurMaskFilter);
        Bitmap bitmapExtractAlpha = bitmap.extractAlpha(this.mBlurPaint, new int[2]);
        this.mDrawPaint.setAlpha(i10);
        canvas.drawBitmap(bitmapExtractAlpha, r0[0], r0[1], this.mDrawPaint);
        this.mDrawPaint.setAlpha(i11);
        canvas.drawBitmap(bitmapExtractAlpha, r0[0], (this.mIconSize * 0.020833334f) + r0[1], this.mDrawPaint);
        this.mDrawPaint.setAlpha(255);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.mDrawPaint);
    }
}
