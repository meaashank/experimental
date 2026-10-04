package com.android.launcher3.keyboard;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.RectEvaluator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import com.app.hider.master.promax.R;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FocusIndicatorHelper implements View.OnFocusChangeListener, ValueAnimator.AnimatorUpdateListener {
    public static final Property<FocusIndicatorHelper, Float> ALPHA;
    private static final long ANIM_DURATION = 150;
    private static final float MIN_VISIBLE_ALPHA = 0.2f;
    private static final RectEvaluator RECT_EVALUATOR;
    public static final Property<FocusIndicatorHelper, Float> SHIFT;
    private static final Rect sTempRect1;
    private static final Rect sTempRect2;
    private float mAlpha;
    private final View mContainer;
    private ObjectAnimator mCurrentAnimation;
    private View mCurrentView;
    private final Rect mDirtyRect = new Rect();
    private boolean mIsDirty = false;
    private View mLastFocusedView;
    private final int mMaxAlpha;
    private final Paint mPaint;
    private float mShift;
    private View mTargetView;

    /* JADX INFO: renamed from: com.android.launcher3.keyboard.FocusIndicatorHelper$1, reason: invalid class name */
    public class AnonymousClass1 extends Property<FocusIndicatorHelper, Float> {
        public AnonymousClass1(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Float get(FocusIndicatorHelper focusIndicatorHelper) {
            return Float.valueOf(focusIndicatorHelper.mAlpha);
        }

        @Override // android.util.Property
        public void set(FocusIndicatorHelper focusIndicatorHelper, Float f10) {
            focusIndicatorHelper.setAlpha(f10.floatValue());
        }
    }

    /* JADX INFO: renamed from: com.android.launcher3.keyboard.FocusIndicatorHelper$2, reason: invalid class name */
    public class AnonymousClass2 extends Property<FocusIndicatorHelper, Float> {
        public AnonymousClass2(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Float get(FocusIndicatorHelper focusIndicatorHelper) {
            return Float.valueOf(focusIndicatorHelper.mShift);
        }

        @Override // android.util.Property
        public void set(FocusIndicatorHelper focusIndicatorHelper, Float f10) {
            focusIndicatorHelper.mShift = f10.floatValue();
        }
    }

    public static class SimpleFocusIndicatorHelper extends FocusIndicatorHelper {
        public SimpleFocusIndicatorHelper(View view) {
            super(view);
        }

        @Override // com.android.launcher3.keyboard.FocusIndicatorHelper
        public void viewToRect(View view, Rect rect) {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public class ViewSetListener extends AnimatorListenerAdapter {
        private final boolean mCallOnCancel;
        private boolean mCalled = false;
        private final View mViewToSet;

        public ViewSetListener(View view, boolean z10) {
            this.mViewToSet = view;
            this.mCallOnCancel = z10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.mCallOnCancel) {
                return;
            }
            this.mCalled = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.mCalled) {
                return;
            }
            FocusIndicatorHelper.this.setCurrentView(this.mViewToSet);
            this.mCalled = true;
        }
    }

    static {
        Class cls = Float.TYPE;
        ALPHA = new AnonymousClass1(cls, "alpha");
        SHIFT = new AnonymousClass2(cls, "shift");
        RECT_EVALUATOR = new RectEvaluator(new Rect());
        sTempRect1 = new Rect();
        sTempRect2 = new Rect();
    }

    public FocusIndicatorHelper(View view) {
        this.mContainer = view;
        Paint paint = new Paint(1);
        this.mPaint = paint;
        int color = view.getResources().getColor(R.color.focused_background);
        this.mMaxAlpha = Color.alpha(color);
        paint.setColor(color | (-16777216));
        setAlpha(0.0f);
        this.mShift = 0.0f;
    }

    private Rect getDrawRect() {
        View view;
        View view2 = this.mCurrentView;
        if (view2 == null || !view2.isAttachedToWindow()) {
            return null;
        }
        View view3 = this.mCurrentView;
        Rect rect = sTempRect1;
        viewToRect(view3, rect);
        if (this.mShift <= 0.0f || (view = this.mTargetView) == null) {
            return rect;
        }
        Rect rect2 = sTempRect2;
        viewToRect(view, rect2);
        return RECT_EVALUATOR.evaluate(this.mShift, rect, rect2);
    }

    public void draw(Canvas canvas) {
        Rect drawRect;
        if (this.mAlpha <= 0.0f || (drawRect = getDrawRect()) == null) {
            return;
        }
        this.mDirtyRect.set(drawRect);
        canvas.drawRect(this.mDirtyRect, this.mPaint);
        this.mIsDirty = true;
    }

    public void endCurrentAnimation() {
        ObjectAnimator objectAnimator = this.mCurrentAnimation;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.mCurrentAnimation = null;
        }
    }

    public void invalidateDirty() {
        if (this.mIsDirty) {
            this.mContainer.invalidate(this.mDirtyRect);
            this.mIsDirty = false;
        }
        Rect drawRect = getDrawRect();
        if (drawRect != null) {
            this.mContainer.invalidate(drawRect);
        }
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        invalidateDirty();
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z10) {
        if (z10) {
            endCurrentAnimation();
            if (this.mAlpha > 0.2f) {
                this.mTargetView = view;
                ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat(ALPHA, 1.0f), PropertyValuesHolder.ofFloat(SHIFT, 1.0f));
                this.mCurrentAnimation = objectAnimatorOfPropertyValuesHolder;
                objectAnimatorOfPropertyValuesHolder.addListener(new ViewSetListener(view, true));
            } else {
                setCurrentView(view);
                this.mCurrentAnimation = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat(ALPHA, 1.0f));
            }
            this.mLastFocusedView = view;
        } else if (this.mLastFocusedView == view) {
            this.mLastFocusedView = null;
            endCurrentAnimation();
            ObjectAnimator objectAnimatorOfPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat(ALPHA, 0.0f));
            this.mCurrentAnimation = objectAnimatorOfPropertyValuesHolder2;
            objectAnimatorOfPropertyValuesHolder2.addListener(new ViewSetListener(null, false));
        }
        invalidateDirty();
        if (!z10) {
            view = null;
        }
        this.mLastFocusedView = view;
        ObjectAnimator objectAnimator = this.mCurrentAnimation;
        if (objectAnimator != null) {
            objectAnimator.addUpdateListener(this);
            this.mCurrentAnimation.setDuration(150L).start();
        }
    }

    public void setAlpha(float f10) {
        this.mAlpha = f10;
        this.mPaint.setAlpha((int) (f10 * this.mMaxAlpha));
    }

    public void setCurrentView(View view) {
        this.mCurrentView = view;
        this.mShift = 0.0f;
        this.mTargetView = null;
    }

    public abstract void viewToRect(View view, Rect rect);
}
