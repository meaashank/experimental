package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes4.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ClippableRoundedCornerLayout extends FrameLayout {
    private float cornerRadius;

    @Nullable
    private Path path;

    public ClippableRoundedCornerLayout(@NonNull Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (this.path == null) {
            super.dispatchDraw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.clipPath(this.path);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(iSave);
    }

    public float getCornerRadius() {
        return this.cornerRadius;
    }

    public void resetClipBoundsAndCornerRadius() {
        this.path = null;
        this.cornerRadius = 0.0f;
        invalidate();
    }

    public void updateClipBoundsAndCornerRadius(@NonNull Rect rect, float f10) {
        updateClipBoundsAndCornerRadius(rect.left, rect.top, rect.right, rect.bottom, f10);
    }

    public void updateCornerRadius(float f10) {
        updateClipBoundsAndCornerRadius(getLeft(), getTop(), getRight(), getBottom(), f10);
    }

    public ClippableRoundedCornerLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void updateClipBoundsAndCornerRadius(float f10, float f11, float f12, float f13, float f14) {
        updateClipBoundsAndCornerRadius(new RectF(f10, f11, f12, f13), f14);
    }

    public ClippableRoundedCornerLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    public void updateClipBoundsAndCornerRadius(@NonNull RectF rectF, float f10) {
        if (this.path == null) {
            this.path = new Path();
        }
        this.cornerRadius = f10;
        this.path.reset();
        this.path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        this.path.close();
        invalidate();
    }
}
