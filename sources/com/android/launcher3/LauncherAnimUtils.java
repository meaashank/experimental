package com.android.launcher3;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.HashSet;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class LauncherAnimUtils {
    public static final int ALL_APPS_TRANSITION_MS = 320;
    public static final float MIN_PROGRESS_TO_ALL_APPS = 0.5f;
    public static final int OVERVIEW_TRANSITION_MS = 250;
    public static final int SPRING_LOADED_EXIT_DELAY = 500;
    public static final int SPRING_LOADED_TRANSITION_MS = 150;
    static WeakHashMap<Animator, Object> sAnimators = new WeakHashMap<>();
    static Animator.AnimatorListener sEndAnimListener = new AnonymousClass1();
    public static final Property<Drawable, Integer> DRAWABLE_ALPHA = new AnonymousClass3(Integer.TYPE, "drawableAlpha");
    public static final Property<View, Float> SCALE_PROPERTY = new AnonymousClass4(Float.class, "scale");

    /* JADX INFO: renamed from: com.android.launcher3.LauncherAnimUtils$1, reason: invalid class name */
    public class AnonymousClass1 implements Animator.AnimatorListener {
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            LauncherAnimUtils.sAnimators.remove(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            LauncherAnimUtils.sAnimators.remove(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            LauncherAnimUtils.sAnimators.put(animator, null);
        }
    }

    /* JADX INFO: renamed from: com.android.launcher3.LauncherAnimUtils$3, reason: invalid class name */
    public class AnonymousClass3 extends Property<Drawable, Integer> {
        public AnonymousClass3(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Integer get(Drawable drawable) {
            return Integer.valueOf(drawable.getAlpha());
        }

        @Override // android.util.Property
        public void set(Drawable drawable, Integer num) {
            drawable.setAlpha(num.intValue());
        }
    }

    /* JADX INFO: renamed from: com.android.launcher3.LauncherAnimUtils$4, reason: invalid class name */
    public class AnonymousClass4 extends Property<View, Float> {
        public AnonymousClass4(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Float get(View view) {
            return Float.valueOf(view.getScaleX());
        }

        @Override // android.util.Property
        public void set(View view, Float f10) {
            view.setScaleX(f10.floatValue());
            view.setScaleY(f10.floatValue());
        }
    }

    public static int blockedFlingDurationFactor(float f10) {
        return (int) Utilities.boundToRange(Math.abs(f10) / 2.0f, 2.0f, 6.0f);
    }

    public static void cancelOnDestroyActivity(Animator animator) {
        animator.addListener(sEndAnimListener);
    }

    public static AnimatorSet createAnimatorSet() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.addListener(sEndAnimListener);
        return animatorSet;
    }

    public static ValueAnimator ofFloat(float... fArr) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setFloatValues(fArr);
        valueAnimator.addListener(sEndAnimListener);
        return valueAnimator;
    }

    public static ObjectAnimator ofPropertyValuesHolder(View view, PropertyValuesHolder... propertyValuesHolderArr) {
        return ofPropertyValuesHolder(view, view, propertyValuesHolderArr);
    }

    public static ObjectAnimator ofViewAlphaAndScale(View view, float f10, float f11, float f12) {
        return ofPropertyValuesHolder(view, view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, f10), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, f11), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, f12));
    }

    public static void onDestroyActivity() {
        for (Animator animator : new HashSet(sAnimators.keySet())) {
            if (animator.isRunning()) {
                animator.cancel();
            }
            sAnimators.remove(animator);
        }
    }

    public static void startAnimationAfterNextDraw(final Animator animator, final View view) {
        view.getViewTreeObserver().addOnDrawListener(new ViewTreeObserver.OnDrawListener() { // from class: com.android.launcher3.LauncherAnimUtils.2
            private boolean mStarted = false;

            @Override // android.view.ViewTreeObserver.OnDrawListener
            public void onDraw() {
                if (this.mStarted) {
                    return;
                }
                this.mStarted = true;
                if (animator.getDuration() == 0) {
                    return;
                }
                animator.start();
                view.post(new Runnable() { // from class: com.android.launcher3.LauncherAnimUtils.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        view.getViewTreeObserver().removeOnDrawListener(this);
                    }
                });
            }
        });
    }

    public static ObjectAnimator ofPropertyValuesHolder(Object obj, View view, PropertyValuesHolder... propertyValuesHolderArr) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(obj, propertyValuesHolderArr);
        cancelOnDestroyActivity(objectAnimatorOfPropertyValuesHolder);
        new FirstFrameAnimatorHelper(objectAnimatorOfPropertyValuesHolder, view);
        return objectAnimatorOfPropertyValuesHolder;
    }

    public static ObjectAnimator ofFloat(View view, Property<View, Float> property, float... fArr) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, property, fArr);
        cancelOnDestroyActivity(objectAnimatorOfFloat);
        new FirstFrameAnimatorHelper(objectAnimatorOfFloat, view);
        return objectAnimatorOfFloat;
    }
}
