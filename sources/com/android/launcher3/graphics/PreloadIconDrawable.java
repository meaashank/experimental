package com.android.launcher3.graphics;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.util.Property;
import android.util.SparseArray;
import com.android.launcher3.FastBitmapDrawable;
import com.android.launcher3.ItemInfoWithIcon;
import com.android.launcher3.anim.Interpolators;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class PreloadIconDrawable extends FastBitmapDrawable {
    private static final int COLOR_SHADOW = 1426063360;
    private static final int COLOR_TRACK = 2012147438;
    private static final float COMPLETE_ANIM_FRACTION = 0.3f;
    private static final long DURATION_SCALE = 500;
    private static final int MAX_PAINT_ALPHA = 255;
    public static final int PATH_SIZE = 100;
    private static final float PROGRESS_GAP = 2.0f;
    private static final float PROGRESS_WIDTH = 7.0f;
    private static final float SMALL_SCALE = 0.6f;
    private final Context mContext;
    private ObjectAnimator mCurrentAnim;
    private float mIconScale;
    private final int mIndicatorColor;
    private float mInternalStateProgress;
    private final PathMeasure mPathMeasure;
    private final Paint mProgressPaint;
    private final Path mProgressPath;
    private boolean mRanFinishAnimation;
    private final Path mScaledProgressPath;
    private final Path mScaledTrackPath;
    private Bitmap mShadowBitmap;
    private final Matrix mTmpMatrix;
    private int mTrackAlpha;
    private float mTrackLength;
    private static final Property<PreloadIconDrawable, Float> INTERNAL_STATE = new AnonymousClass1(Float.TYPE, "internalStateProgress");
    private static final SparseArray<WeakReference<Bitmap>> sShadowCache = new SparseArray<>();

    /* JADX INFO: renamed from: com.android.launcher3.graphics.PreloadIconDrawable$1, reason: invalid class name */
    public class AnonymousClass1 extends Property<PreloadIconDrawable, Float> {
        public AnonymousClass1(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Float get(PreloadIconDrawable preloadIconDrawable) {
            return Float.valueOf(preloadIconDrawable.mInternalStateProgress);
        }

        @Override // android.util.Property
        public void set(PreloadIconDrawable preloadIconDrawable, Float f10) {
            preloadIconDrawable.setInternalProgress(f10.floatValue());
        }
    }

    public PreloadIconDrawable(ItemInfoWithIcon itemInfoWithIcon, Path path, Context context) {
        super(itemInfoWithIcon);
        this.mTmpMatrix = new Matrix();
        this.mPathMeasure = new PathMeasure();
        this.mContext = context;
        this.mProgressPath = path;
        this.mScaledTrackPath = new Path();
        this.mScaledProgressPath = new Path();
        Paint paint = new Paint(3);
        this.mProgressPaint = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.mIndicatorColor = IconPalette.getPreloadProgressColor(context, this.mIconColor);
        setInternalProgress(0.0f);
    }

    private Bitmap getShadowBitmap(int i10, int i11, float f10) {
        int i12 = (i10 << 16) | i11;
        SparseArray<WeakReference<Bitmap>> sparseArray = sShadowCache;
        WeakReference<Bitmap> weakReference = sparseArray.get(i12);
        Bitmap bitmap = weakReference != null ? weakReference.get() : null;
        if (bitmap != null) {
            return bitmap;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        this.mProgressPaint.setShadowLayer(f10, 0.0f, 0.0f, COLOR_SHADOW);
        this.mProgressPaint.setColor(COLOR_TRACK);
        this.mProgressPaint.setAlpha(255);
        canvas.drawPath(this.mScaledTrackPath, this.mProgressPaint);
        this.mProgressPaint.clearShadowLayer();
        canvas.setBitmap(null);
        sparseArray.put(i12, new WeakReference<>(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInternalProgress(float f10) {
        this.mInternalStateProgress = f10;
        if (f10 <= 0.0f) {
            this.mIconScale = 0.6f;
            this.mScaledTrackPath.reset();
            this.mTrackAlpha = 255;
            setIsDisabled(true);
        }
        if (f10 < 1.0f && f10 > 0.0f) {
            this.mPathMeasure.getSegment(0.0f, f10 * this.mTrackLength, this.mScaledProgressPath, true);
            this.mIconScale = 0.6f;
            this.mTrackAlpha = 255;
            setIsDisabled(true);
        } else if (f10 >= 1.0f) {
            setIsDisabled(false);
            this.mScaledTrackPath.set(this.mScaledProgressPath);
            float f11 = (f10 - 1.0f) / 0.3f;
            if (f11 >= 1.0f) {
                this.mIconScale = 1.0f;
                this.mTrackAlpha = 0;
            } else {
                this.mTrackAlpha = Math.round((1.0f - f11) * 255.0f);
                this.mIconScale = (f11 * 0.39999998f) + 0.6f;
            }
        }
        invalidateSelf();
    }

    private void updateInternalState(float f10, boolean z10, boolean z11) {
        ObjectAnimator objectAnimator = this.mCurrentAnim;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.mCurrentAnim = null;
        }
        if (Float.compare(f10, this.mInternalStateProgress) == 0) {
            return;
        }
        if (f10 < this.mInternalStateProgress) {
            z10 = false;
        }
        if (!z10 || this.mRanFinishAnimation) {
            setInternalProgress(f10);
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, INTERNAL_STATE, f10);
        this.mCurrentAnim = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration((long) ((f10 - this.mInternalStateProgress) * 500.0f));
        this.mCurrentAnim.setInterpolator(Interpolators.LINEAR);
        if (z11) {
            this.mCurrentAnim.addListener(new AnimatorListenerAdapter() { // from class: com.android.launcher3.graphics.PreloadIconDrawable.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    PreloadIconDrawable.this.mRanFinishAnimation = true;
                }
            });
        }
        this.mCurrentAnim.start();
    }

    @Override // com.android.launcher3.FastBitmapDrawable
    public void drawInternal(Canvas canvas, Rect rect) {
        if (this.mRanFinishAnimation) {
            super.drawInternal(canvas, rect);
            return;
        }
        this.mProgressPaint.setColor(this.mIndicatorColor);
        this.mProgressPaint.setAlpha(this.mTrackAlpha);
        Bitmap bitmap = this.mShadowBitmap;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, rect.left, rect.top, this.mProgressPaint);
        }
        canvas.drawPath(this.mScaledProgressPath, this.mProgressPaint);
        int iSave = canvas.save();
        float f10 = this.mIconScale;
        canvas.scale(f10, f10, rect.exactCenterX(), rect.exactCenterY());
        super.drawInternal(canvas, rect);
        canvas.restoreToCount(iSave);
    }

    public boolean hasNotCompleted() {
        return !this.mRanFinishAnimation;
    }

    public void maybePerformFinishedAnimation() {
        if (this.mInternalStateProgress == 0.0f) {
            this.mInternalStateProgress = 1.0f;
        }
        updateInternalState(1.3f, true, true);
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.mTmpMatrix.setScale(((rect.width() - 14.0f) - 4.0f) / 100.0f, ((rect.height() - 14.0f) - 4.0f) / 100.0f);
        this.mTmpMatrix.postTranslate(rect.left + PROGRESS_WIDTH + 2.0f, rect.top + PROGRESS_WIDTH + 2.0f);
        this.mProgressPath.transform(this.mTmpMatrix, this.mScaledTrackPath);
        float fWidth = rect.width() / 100;
        this.mProgressPaint.setStrokeWidth(PROGRESS_WIDTH * fWidth);
        this.mShadowBitmap = getShadowBitmap(rect.width(), rect.height(), fWidth * 2.0f);
        this.mPathMeasure.setPath(this.mScaledTrackPath, true);
        this.mTrackLength = this.mPathMeasure.getLength();
        setInternalProgress(this.mInternalStateProgress);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i10) {
        updateInternalState(i10 * 0.01f, getBounds().width() > 0, false);
        return true;
    }
}
