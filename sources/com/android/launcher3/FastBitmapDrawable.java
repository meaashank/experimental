package com.android.launcher3;

import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.util.SparseArray;
import com.android.launcher3.anim.Interpolators;
import com.android.launcher3.graphics.BitmapInfo;

/* JADX INFO: loaded from: classes2.dex */
public class FastBitmapDrawable extends Drawable {
    public static final int CLICK_FEEDBACK_DURATION = 200;
    private static final float DISABLED_BRIGHTNESS = 0.5f;
    private static final float DISABLED_DESATURATION = 1.0f;
    private static final float PRESSED_SCALE = 1.1f;
    private static final int REDUCED_FILTER_VALUE_SPACE = 48;
    private int mAlpha;
    protected Bitmap mBitmap;
    private int mBrightness;
    private int mDesaturation;
    protected final int mIconColor;
    private boolean mIsDisabled;
    private boolean mIsPressed;
    protected final Paint mPaint;
    private int mPrevUpdateKey;
    private float mScale;
    private ObjectAnimator mScaleAnimation;
    private static final SparseArray<ColorFilter> sCachedFilter = new SparseArray<>();
    private static final ColorMatrix sTempBrightnessMatrix = new ColorMatrix();
    private static final ColorMatrix sTempFilterMatrix = new ColorMatrix();
    private static final Property<FastBitmapDrawable, Float> SCALE = new AnonymousClass1(Float.TYPE, "scale");

    /* JADX INFO: renamed from: com.android.launcher3.FastBitmapDrawable$1, reason: invalid class name */
    public class AnonymousClass1 extends Property<FastBitmapDrawable, Float> {
        public AnonymousClass1(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Float get(FastBitmapDrawable fastBitmapDrawable) {
            return Float.valueOf(fastBitmapDrawable.mScale);
        }

        @Override // android.util.Property
        public void set(FastBitmapDrawable fastBitmapDrawable, Float f10) {
            fastBitmapDrawable.mScale = f10.floatValue();
            fastBitmapDrawable.invalidateSelf();
        }
    }

    public static class MyConstantState extends Drawable.ConstantState {
        protected final Bitmap mBitmap;
        protected final int mIconColor;

        public MyConstantState(Bitmap bitmap, int i10) {
            this.mBitmap = bitmap;
            this.mIconColor = i10;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new FastBitmapDrawable(this.mBitmap, this.mIconColor);
        }
    }

    public FastBitmapDrawable(Bitmap bitmap) {
        this(bitmap, 0);
    }

    private float getBrightness() {
        return this.mBrightness / 48.0f;
    }

    private void invalidateDesaturationAndBrightness() {
        setDesaturation(this.mIsDisabled ? 1.0f : 0.0f);
        setBrightness(this.mIsDisabled ? 0.5f : 0.0f);
    }

    private void setBrightness(float f10) {
        int iFloor = (int) Math.floor(f10 * 48.0f);
        if (this.mBrightness != iFloor) {
            this.mBrightness = iFloor;
            updateFilter();
        }
    }

    private void setDesaturation(float f10) {
        int iFloor = (int) Math.floor(f10 * 48.0f);
        if (this.mDesaturation != iFloor) {
            this.mDesaturation = iFloor;
            updateFilter();
        }
    }

    private void updateFilter() {
        boolean z10;
        int i10;
        ColorFilter colorMatrixColorFilter;
        int i11 = this.mDesaturation;
        if (i11 > 0) {
            i10 = (i11 << 16) | this.mBrightness;
            z10 = false;
        } else {
            int i12 = this.mBrightness;
            if (i12 > 0) {
                i10 = i12 | 65536;
                z10 = true;
            } else {
                z10 = false;
                i10 = -1;
            }
        }
        if (i10 == this.mPrevUpdateKey) {
            return;
        }
        this.mPrevUpdateKey = i10;
        if (i10 != -1) {
            SparseArray<ColorFilter> sparseArray = sCachedFilter;
            ColorFilter colorFilter = sparseArray.get(i10);
            if (colorFilter == null) {
                float brightness = getBrightness();
                int i13 = (int) (255.0f * brightness);
                if (z10) {
                    colorMatrixColorFilter = new PorterDuffColorFilter(Color.argb(i13, 255, 255, 255), PorterDuff.Mode.SRC_ATOP);
                } else {
                    float desaturation = 1.0f - getDesaturation();
                    ColorMatrix colorMatrix = sTempFilterMatrix;
                    colorMatrix.setSaturation(desaturation);
                    if (this.mBrightness > 0) {
                        float f10 = 1.0f - brightness;
                        ColorMatrix colorMatrix2 = sTempBrightnessMatrix;
                        float[] array = colorMatrix2.getArray();
                        array[0] = f10;
                        array[6] = f10;
                        array[12] = f10;
                        float f11 = i13;
                        array[4] = f11;
                        array[9] = f11;
                        array[14] = f11;
                        colorMatrix.preConcat(colorMatrix2);
                    }
                    colorMatrixColorFilter = new ColorMatrixColorFilter(colorMatrix);
                }
                colorFilter = colorMatrixColorFilter;
                sparseArray.append(i10, colorFilter);
            }
            this.mPaint.setColorFilter(colorFilter);
        } else {
            this.mPaint.setColorFilter(null);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.mScaleAnimation == null) {
            drawInternal(canvas, getBounds());
            return;
        }
        int iSave = canvas.save();
        Rect bounds = getBounds();
        float f10 = this.mScale;
        canvas.scale(f10, f10, bounds.exactCenterX(), bounds.exactCenterY());
        drawInternal(canvas, bounds);
        canvas.restoreToCount(iSave);
    }

    public void drawInternal(Canvas canvas, Rect rect) {
        canvas.drawBitmap(this.mBitmap, (Rect) null, rect, this.mPaint);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.mAlpha;
    }

    public float getAnimatedScale() {
        if (this.mScaleAnimation == null) {
            return 1.0f;
        }
        return this.mScale;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.mPaint.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return new MyConstantState(this.mBitmap, this.mIconColor);
    }

    public float getDesaturation() {
        return this.mDesaturation / 48.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.mBitmap.getHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.mBitmap.getWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return getBounds().height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return getBounds().width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z10;
        int length = iArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                z10 = false;
                break;
            }
            if (iArr[i10] == 16842919) {
                z10 = true;
                break;
            }
            i10++;
        }
        if (this.mIsPressed == z10) {
            return false;
        }
        this.mIsPressed = z10;
        ObjectAnimator objectAnimator = this.mScaleAnimation;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.mScaleAnimation = null;
        }
        if (this.mIsPressed) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, SCALE, PRESSED_SCALE);
            this.mScaleAnimation = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(200L);
            this.mScaleAnimation.setInterpolator(Interpolators.ACCEL);
            this.mScaleAnimation.start();
        } else {
            this.mScale = 1.0f;
            invalidateSelf();
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.mAlpha = i10;
        this.mPaint.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z10) {
        this.mPaint.setFilterBitmap(z10);
        this.mPaint.setAntiAlias(z10);
    }

    public void setIsDisabled(boolean z10) {
        if (this.mIsDisabled != z10) {
            this.mIsDisabled = z10;
            invalidateDesaturationAndBrightness();
        }
    }

    public FastBitmapDrawable(BitmapInfo bitmapInfo) {
        this(bitmapInfo.icon, bitmapInfo.color);
    }

    public FastBitmapDrawable(ItemInfoWithIcon itemInfoWithIcon) {
        this(itemInfoWithIcon.iconBitmap, itemInfoWithIcon.iconColor);
    }

    public FastBitmapDrawable(Bitmap bitmap, int i10) {
        this.mPaint = new Paint(3);
        this.mScale = 1.0f;
        this.mDesaturation = 0;
        this.mBrightness = 0;
        this.mAlpha = 255;
        this.mPrevUpdateKey = Integer.MAX_VALUE;
        this.mBitmap = bitmap;
        this.mIconColor = i10;
        setFilterBitmap(true);
    }
}
