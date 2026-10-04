package com.android.launcher3.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.android.launcher3.Utilities;
import com.app.hider.master.promax.R;

/* JADX INFO: loaded from: classes2.dex */
public class WidgetImageView extends View {
    private Drawable mBadge;
    private final int mBadgeMargin;
    private Bitmap mBitmap;
    private final RectF mDstRectF;
    private final Paint mPaint;

    public WidgetImageView(Context context) {
        this(context, null);
    }

    private void updateDstRectF() {
        float width = getWidth();
        float height = getHeight();
        float width2 = this.mBitmap.getWidth();
        float f10 = width2 > width ? width / width2 : 1.0f;
        float f11 = width2 * f10;
        float height2 = this.mBitmap.getHeight() * f10;
        RectF rectF = this.mDstRectF;
        rectF.left = (width - f11) / 2.0f;
        rectF.right = (width + f11) / 2.0f;
        if (height2 > height) {
            rectF.top = 0.0f;
            rectF.bottom = height2;
        } else {
            rectF.top = (height - height2) / 2.0f;
            rectF.bottom = (height + height2) / 2.0f;
        }
        Drawable drawable = this.mBadge;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int iBoundToRange = Utilities.boundToRange((int) ((this.mDstRectF.right + this.mBadgeMargin) - bounds.width()), this.mBadgeMargin, getWidth() - bounds.width());
            int iBoundToRange2 = Utilities.boundToRange((int) ((this.mDstRectF.bottom + this.mBadgeMargin) - bounds.height()), this.mBadgeMargin, getHeight() - bounds.height());
            this.mBadge.setBounds(iBoundToRange, iBoundToRange2, bounds.width() + iBoundToRange, bounds.height() + iBoundToRange2);
        }
    }

    public Bitmap getBitmap() {
        return this.mBitmap;
    }

    public Rect getBitmapBounds() {
        updateDstRectF();
        Rect rect = new Rect();
        this.mDstRectF.round(rect);
        return rect;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.mBitmap != null) {
            updateDstRectF();
            canvas.drawBitmap(this.mBitmap, (Rect) null, this.mDstRectF, this.mPaint);
            Drawable drawable = this.mBadge;
            if (drawable != null) {
                drawable.draw(canvas);
            }
        }
    }

    public void setBitmap(Bitmap bitmap, Drawable drawable) {
        this.mBitmap = bitmap;
        this.mBadge = drawable;
        invalidate();
    }

    public WidgetImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public WidgetImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mPaint = new Paint(3);
        this.mDstRectF = new RectF();
        this.mBadgeMargin = context.getResources().getDimensionPixelSize(R.dimen.profile_badge_margin);
    }
}
