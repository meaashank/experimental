package com.android.launcher3.graphics;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.android.launcher3.Utilities;
import com.app.hider.master.promax.R;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
@TargetApi(26)
public class ShadowDrawable extends Drawable {
    private final Paint mPaint;
    private final ShadowDrawableState mState;

    public static class ShadowDrawableState extends Drawable.ConstantState {
        int mChangingConfigurations;
        Drawable.ConstantState mChildState;
        int mDarkTintColor;
        int mIntrinsicHeight;
        int mIntrinsicWidth;
        boolean mIsDark;
        Bitmap mLastDrawnBitmap;
        int mShadowColor;
        int mShadowSize;

        private ShadowDrawableState() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return true;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.mChangingConfigurations;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new ShadowDrawable(this);
        }

        public ShadowDrawableState(h hVar) {
        }
    }

    private void regenerateBitmapCache() {
        ShadowDrawableState shadowDrawableState = this.mState;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(shadowDrawableState.mIntrinsicWidth, shadowDrawableState.mIntrinsicHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Drawable drawableMutate = this.mState.mChildState.newDrawable().mutate();
        ShadowDrawableState shadowDrawableState2 = this.mState;
        int i10 = shadowDrawableState2.mShadowSize;
        drawableMutate.setBounds(i10, i10, shadowDrawableState2.mIntrinsicWidth - i10, shadowDrawableState2.mIntrinsicHeight - i10);
        ShadowDrawableState shadowDrawableState3 = this.mState;
        drawableMutate.setTint(shadowDrawableState3.mIsDark ? shadowDrawableState3.mDarkTintColor : -1);
        drawableMutate.draw(canvas);
        if (!this.mState.mIsDark) {
            Paint paint = new Paint(3);
            paint.setMaskFilter(new BlurMaskFilter(this.mState.mShadowSize, BlurMaskFilter.Blur.NORMAL));
            Bitmap bitmapExtractAlpha = bitmapCreateBitmap.extractAlpha(paint, new int[2]);
            paint.setMaskFilter(null);
            paint.setColor(this.mState.mShadowColor);
            bitmapCreateBitmap.eraseColor(0);
            canvas.drawBitmap(bitmapExtractAlpha, r5[0], r5[1], paint);
            drawableMutate.draw(canvas);
        }
        if (Utilities.ATLEAST_OREO) {
            bitmapCreateBitmap = bitmapCreateBitmap.copy(Bitmap.Config.HARDWARE, false);
        }
        this.mState.mLastDrawnBitmap = bitmapCreateBitmap;
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(new int[]{R.attr.isWorkspaceDarkText});
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        ShadowDrawableState shadowDrawableState = this.mState;
        if (shadowDrawableState.mIsDark != z10) {
            shadowDrawableState.mIsDark = z10;
            shadowDrawableState.mLastDrawnBitmap = null;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        this.mState.getClass();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            return;
        }
        if (this.mState.mLastDrawnBitmap == null) {
            regenerateBitmapCache();
        }
        canvas.drawBitmap(this.mState.mLastDrawnBitmap, (Rect) null, bounds, this.mPaint);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.mState;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.mState.mIntrinsicHeight;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.mState.mIntrinsicWidth;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        super.inflate(resources, xmlPullParser, attributeSet, theme);
        TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, com.android.launcher3.R.styleable.ShadowDrawable) : theme.obtainStyledAttributes(attributeSet, com.android.launcher3.R.styleable.ShadowDrawable, 0, 0);
        try {
            Drawable drawable = typedArrayObtainAttributes.getDrawable(0);
            if (drawable == null) {
                throw new XmlPullParserException("missing src attribute");
            }
            this.mState.mShadowColor = typedArrayObtainAttributes.getColor(1, -16777216);
            this.mState.mShadowSize = typedArrayObtainAttributes.getDimensionPixelSize(2, 0);
            this.mState.mDarkTintColor = typedArrayObtainAttributes.getColor(3, -16777216);
            ShadowDrawableState shadowDrawableState = this.mState;
            int intrinsicHeight = drawable.getIntrinsicHeight();
            ShadowDrawableState shadowDrawableState2 = this.mState;
            shadowDrawableState.mIntrinsicHeight = (shadowDrawableState2.mShadowSize * 2) + intrinsicHeight;
            int intrinsicWidth = drawable.getIntrinsicWidth();
            ShadowDrawableState shadowDrawableState3 = this.mState;
            shadowDrawableState2.mIntrinsicWidth = (shadowDrawableState3.mShadowSize * 2) + intrinsicWidth;
            shadowDrawableState3.mChangingConfigurations = drawable.getChangingConfigurations();
            this.mState.mChildState = drawable.getConstantState();
        } finally {
            typedArrayObtainAttributes.recycle();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.mPaint.setAlpha(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.mPaint.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public ShadowDrawable() {
        this(new ShadowDrawableState());
    }

    private ShadowDrawable(ShadowDrawableState shadowDrawableState) {
        this.mPaint = new Paint(3);
        this.mState = shadowDrawableState;
    }
}
