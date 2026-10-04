package com.android.launcher3.pageindicators;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.animation.OvershootInterpolator;
import com.android.launcher3.Utilities;
import com.android.launcher3.util.Themes;
import com.app.hider.master.promax.R;

/* JADX INFO: loaded from: classes2.dex */
public class PageIndicatorDots extends View implements PageIndicator {
    private static final long ANIMATION_DURATION = 150;
    private static final int ENTER_ANIMATION_DURATION = 400;
    private static final float ENTER_ANIMATION_OVERSHOOT_TENSION = 4.9f;
    private static final int ENTER_ANIMATION_STAGGERED_DELAY = 150;
    private static final int ENTER_ANIMATION_START_DELAY = 300;
    private static final float SHIFT_PER_ANIMATION = 0.5f;
    private static final float SHIFT_THRESHOLD = 0.1f;
    private final int mActiveColor;
    private int mActivePage;
    private ObjectAnimator mAnimator;
    private final Paint mCirclePaint;
    private float mCurrentPosition;
    private final float mDotRadius;
    private float[] mEntryAnimationRadiusFactors;
    private float mFinalPosition;
    private final int mInActiveColor;
    private final boolean mIsRtl;
    private int mNumPages;
    private static final RectF sTempRect = new RectF();
    private static final Property<PageIndicatorDots, Float> CURRENT_POSITION = new AnonymousClass1(Float.TYPE, "current_position");

    /* JADX INFO: renamed from: com.android.launcher3.pageindicators.PageIndicatorDots$1, reason: invalid class name */
    public class AnonymousClass1 extends Property<PageIndicatorDots, Float> {
        public AnonymousClass1(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Float get(PageIndicatorDots pageIndicatorDots) {
            return Float.valueOf(pageIndicatorDots.mCurrentPosition);
        }

        @Override // android.util.Property
        public void set(PageIndicatorDots pageIndicatorDots, Float f10) {
            pageIndicatorDots.mCurrentPosition = f10.floatValue();
            pageIndicatorDots.invalidate();
            pageIndicatorDots.invalidateOutline();
        }
    }

    public class AnimationCycleListener extends AnimatorListenerAdapter {
        private boolean mCancelled;

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.mCancelled = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.mCancelled) {
                return;
            }
            PageIndicatorDots.this.mAnimator = null;
            PageIndicatorDots pageIndicatorDots = PageIndicatorDots.this;
            pageIndicatorDots.animateToPosition(pageIndicatorDots.mFinalPosition);
        }

        private AnimationCycleListener() {
            this.mCancelled = false;
        }
    }

    public class MyOutlineProver extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (PageIndicatorDots.this.mEntryAnimationRadiusFactors == null) {
                RectF activeRect = PageIndicatorDots.this.getActiveRect();
                outline.setRoundRect((int) activeRect.left, (int) activeRect.top, (int) activeRect.right, (int) activeRect.bottom, PageIndicatorDots.this.mDotRadius);
            }
        }

        private MyOutlineProver() {
        }
    }

    public PageIndicatorDots(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void animateToPosition(float f10) {
        this.mFinalPosition = f10;
        if (Math.abs(this.mCurrentPosition - f10) < 0.1f) {
            this.mCurrentPosition = this.mFinalPosition;
        }
        if (this.mAnimator != null || Float.compare(this.mCurrentPosition, this.mFinalPosition) == 0) {
            return;
        }
        float f11 = this.mCurrentPosition;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, CURRENT_POSITION, f11 > this.mFinalPosition ? f11 - 0.5f : f11 + 0.5f);
        this.mAnimator = objectAnimatorOfFloat;
        objectAnimatorOfFloat.addListener(new AnimationCycleListener());
        this.mAnimator.setDuration(150L);
        this.mAnimator.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getActiveRect() {
        float f10 = this.mCurrentPosition;
        float f11 = (int) f10;
        float f12 = f10 - f11;
        float f13 = this.mDotRadius;
        float f14 = f13 * 2.0f;
        float f15 = f13 * 3.0f;
        float width = ((getWidth() - (this.mNumPages * f15)) + this.mDotRadius) / 2.0f;
        RectF rectF = sTempRect;
        rectF.top = (getHeight() * 0.5f) - this.mDotRadius;
        rectF.bottom = (getHeight() * 0.5f) + this.mDotRadius;
        float f16 = (f11 * f15) + width;
        rectF.left = f16;
        float f17 = f14 + f16;
        rectF.right = f17;
        if (f12 < 0.5f) {
            rectF.right = (f12 * f15 * 2.0f) + f17;
        } else {
            rectF.right = f17 + f15;
            rectF.left = ((f12 - 0.5f) * f15 * 2.0f) + f16;
        }
        if (this.mIsRtl) {
            float fWidth = rectF.width();
            float width2 = getWidth() - rectF.left;
            rectF.right = width2;
            rectF.left = width2 - fWidth;
        }
        return rectF;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float f10 = this.mDotRadius * 3.0f;
        float f11 = this.mDotRadius;
        float width = (((getWidth() - (this.mNumPages * f10)) + f11) / 2.0f) + f11;
        float height = canvas.getHeight() / 2;
        int i10 = 0;
        if (this.mEntryAnimationRadiusFactors != null) {
            if (this.mIsRtl) {
                width = getWidth() - width;
                f10 = -f10;
            }
            while (i10 < this.mEntryAnimationRadiusFactors.length) {
                this.mCirclePaint.setColor(i10 == this.mActivePage ? this.mActiveColor : this.mInActiveColor);
                canvas.drawCircle(width, height, this.mDotRadius * this.mEntryAnimationRadiusFactors[i10], this.mCirclePaint);
                width += f10;
                i10++;
            }
            return;
        }
        this.mCirclePaint.setColor(this.mInActiveColor);
        while (i10 < this.mNumPages) {
            canvas.drawCircle(width, height, this.mDotRadius, this.mCirclePaint);
            width += f10;
            i10++;
        }
        this.mCirclePaint.setColor(this.mActiveColor);
        RectF activeRect = getActiveRect();
        float f12 = this.mDotRadius;
        canvas.drawRoundRect(activeRect, f12, f12, this.mCirclePaint);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getMode(i10) == 1073741824 ? View.MeasureSpec.getSize(i10) : (int) (((this.mNumPages * 3) + 2) * this.mDotRadius), View.MeasureSpec.getMode(i11) == 1073741824 ? View.MeasureSpec.getSize(i11) : (int) (this.mDotRadius * 4.0f));
    }

    public void playEntryAnimation() {
        int length = this.mEntryAnimationRadiusFactors.length;
        if (length == 0) {
            this.mEntryAnimationRadiusFactors = null;
            invalidate();
            return;
        }
        OvershootInterpolator overshootInterpolator = new OvershootInterpolator(ENTER_ANIMATION_OVERSHOOT_TENSION);
        AnimatorSet animatorSet = new AnimatorSet();
        for (final int i10 = 0; i10 < length; i10++) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(400L);
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.android.launcher3.pageindicators.PageIndicatorDots.2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    PageIndicatorDots.this.mEntryAnimationRadiusFactors[i10] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    PageIndicatorDots.this.invalidate();
                }
            });
            duration.setInterpolator(overshootInterpolator);
            duration.setStartDelay((i10 * 150) + 300);
            animatorSet.play(duration);
        }
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.android.launcher3.pageindicators.PageIndicatorDots.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                PageIndicatorDots.this.mEntryAnimationRadiusFactors = null;
                PageIndicatorDots.this.invalidateOutline();
                PageIndicatorDots.this.invalidate();
            }
        });
        animatorSet.start();
    }

    public void prepareEntryAnimation() {
        this.mEntryAnimationRadiusFactors = new float[this.mNumPages];
        invalidate();
    }

    @Override // com.android.launcher3.pageindicators.PageIndicator
    public void setActiveMarker(int i10) {
        if (this.mActivePage != i10) {
            this.mActivePage = i10;
        }
    }

    @Override // com.android.launcher3.pageindicators.PageIndicator
    public void setMarkersCount(int i10) {
        this.mNumPages = i10;
        requestLayout();
    }

    @Override // com.android.launcher3.pageindicators.PageIndicator
    public void setScroll(int i10, int i11) {
        int i12 = this.mNumPages;
        if (i12 > 1) {
            if (this.mIsRtl) {
                i10 = i11 - i10;
            }
            int i13 = i11 / (i12 - 1);
            int i14 = i10 / i13;
            int i15 = i14 * i13;
            int i16 = i15 + i13;
            float f10 = i13 * 0.1f;
            float f11 = i10;
            if (f11 < i15 + f10) {
                animateToPosition(i14);
            } else if (f11 > i16 - f10) {
                animateToPosition(i14 + 1);
            } else {
                animateToPosition(i14 + 0.5f);
            }
        }
    }

    public void stopAllAnimations() {
        ObjectAnimator objectAnimator = this.mAnimator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.mAnimator = null;
        }
        float f10 = this.mActivePage;
        this.mFinalPosition = f10;
        CURRENT_POSITION.set(this, Float.valueOf(f10));
    }

    public PageIndicatorDots(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PageIndicatorDots(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Paint paint = new Paint(1);
        this.mCirclePaint = paint;
        paint.setStyle(Paint.Style.FILL);
        this.mDotRadius = getResources().getDimension(R.dimen.page_indicator_dot_size) / 2.0f;
        setOutlineProvider(new MyOutlineProver());
        this.mActiveColor = Themes.getAttrColor(context, android.R.attr.colorAccent);
        this.mInActiveColor = Themes.getAttrColor(context, android.R.attr.colorControlHighlight);
        this.mIsRtl = Utilities.isRtl(getResources());
    }
}
