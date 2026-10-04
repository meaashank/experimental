package com.android.launcher3.badge;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.Log;
import com.android.launcher3.graphics.ShadowGenerator;

/* JADX INFO: loaded from: classes2.dex */
public class BadgeRenderer {
    private static final float DOT_SCALE = 0.6f;
    private static final float OFFSET_PERCENTAGE = 0.02f;
    private static final float SIZE_PERCENTAGE = 0.38f;
    private static final String TAG = "BadgeRenderer";
    private final Bitmap mBackgroundWithShadow;
    private final float mBitmapOffset;
    private final Paint mCirclePaint = new Paint(3);
    private final float mCircleRadius;
    private final float mDotCenterOffset;
    private final int mOffset;

    public BadgeRenderer(int i10) {
        float f10 = i10;
        float f11 = 0.38f * f10;
        this.mDotCenterOffset = f11;
        this.mOffset = (int) (f10 * OFFSET_PERCENTAGE);
        int i11 = (int) (f11 * 0.6f);
        ShadowGenerator.Builder builder = new ShadowGenerator.Builder(0);
        this.mBackgroundWithShadow = builder.setupBlurForSize(i11).createPill(i11, i11);
        this.mCircleRadius = builder.radius;
        this.mBitmapOffset = (-r3.getHeight()) * 0.5f;
    }

    public void draw(Canvas canvas, int i10, Rect rect, float f10, Point point) {
        if (rect == null || point == null) {
            Log.e(TAG, "Invalid null argument(s) passed in call to onDrawBadge.");
            return;
        }
        canvas.save();
        float f11 = rect.right;
        float f12 = this.mDotCenterOffset;
        canvas.translate((f11 - (f12 / 2.0f)) + Math.min(this.mOffset, point.x), ((f12 / 2.0f) + rect.top) - Math.min(this.mOffset, point.y));
        canvas.scale(f10, f10);
        this.mCirclePaint.setColor(-16777216);
        Bitmap bitmap = this.mBackgroundWithShadow;
        float f13 = this.mBitmapOffset;
        canvas.drawBitmap(bitmap, f13, f13, this.mCirclePaint);
        this.mCirclePaint.setColor(i10);
        canvas.drawCircle(0.0f, 0.0f, this.mCircleRadius, this.mCirclePaint);
        canvas.restore();
    }
}
