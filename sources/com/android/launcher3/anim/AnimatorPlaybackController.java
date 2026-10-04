package com.android.launcher3.anim;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AnimatorPlaybackController implements ValueAnimator.AnimatorUpdateListener {
    protected final AnimatorSet mAnim;
    private final ValueAnimator mAnimationPlayer;
    protected float mCurrentFraction;
    private final long mDuration;
    private Runnable mEndAction;
    protected Runnable mOnCancelRunnable;
    protected boolean mTargetCancelled = false;

    public static class AnimatorPlaybackControllerVL extends AnimatorPlaybackController {
        private final ValueAnimator[] mChildAnimations;

        private void getAnimationsRecur(AnimatorSet animatorSet, ArrayList<ValueAnimator> arrayList) {
            long duration = animatorSet.getDuration();
            TimeInterpolator interpolator = animatorSet.getInterpolator();
            ArrayList<Animator> childAnimations = animatorSet.getChildAnimations();
            int size = childAnimations.size();
            int i10 = 0;
            while (i10 < size) {
                Animator animator = childAnimations.get(i10);
                i10++;
                Animator animator2 = animator;
                if (duration > 0) {
                    animator2.setDuration(duration);
                }
                if (interpolator != null) {
                    animator2.setInterpolator(interpolator);
                }
                if (animator2 instanceof ValueAnimator) {
                    arrayList.add((ValueAnimator) animator2);
                } else {
                    if (!(animator2 instanceof AnimatorSet)) {
                        throw new RuntimeException("Unknown animation type " + animator2);
                    }
                    getAnimationsRecur((AnimatorSet) animator2, arrayList);
                }
            }
        }

        @Override // com.android.launcher3.anim.AnimatorPlaybackController
        public void setPlayFraction(float f10) {
            this.mCurrentFraction = f10;
            if (this.mTargetCancelled) {
                return;
            }
            long jClampDuration = clampDuration(f10);
            for (ValueAnimator valueAnimator : this.mChildAnimations) {
                valueAnimator.setCurrentPlayTime(Math.min(jClampDuration, valueAnimator.getDuration()));
            }
        }

        private AnimatorPlaybackControllerVL(AnimatorSet animatorSet, long j10, Runnable runnable) {
            super(animatorSet, j10, runnable);
            ArrayList<ValueAnimator> arrayList = new ArrayList<>();
            getAnimationsRecur(animatorSet, arrayList);
            this.mChildAnimations = (ValueAnimator[]) arrayList.toArray(new ValueAnimator[arrayList.size()]);
        }
    }

    public class OnAnimationEndDispatcher extends AnimationSuccessListener {
        private void dispatchOnEndRecursively(Animator animator) {
            List listeners = animator.getListeners();
            if (listeners == null) {
                listeners = Collections.EMPTY_LIST;
            }
            Iterator it = listeners.iterator();
            while (it.hasNext()) {
                ((Animator.AnimatorListener) it.next()).onAnimationEnd(animator);
            }
            if (animator instanceof AnimatorSet) {
                List childAnimations = ((AnimatorSet) animator).getChildAnimations();
                if (childAnimations == null) {
                    childAnimations = Collections.EMPTY_LIST;
                }
                Iterator it2 = childAnimations.iterator();
                while (it2.hasNext()) {
                    dispatchOnEndRecursively((Animator) it2.next());
                }
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.mCancelled = false;
        }

        @Override // com.android.launcher3.anim.AnimationSuccessListener
        public void onAnimationSuccess(Animator animator) {
            dispatchOnEndRecursively(AnimatorPlaybackController.this.mAnim);
            if (AnimatorPlaybackController.this.mEndAction != null) {
                AnimatorPlaybackController.this.mEndAction.run();
            }
        }

        private OnAnimationEndDispatcher() {
        }
    }

    public AnimatorPlaybackController(AnimatorSet animatorSet, long j10, Runnable runnable) {
        this.mAnim = animatorSet;
        this.mDuration = j10;
        this.mOnCancelRunnable = runnable;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.mAnimationPlayer = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setInterpolator(Interpolators.LINEAR);
        valueAnimatorOfFloat.addListener(new OnAnimationEndDispatcher());
        valueAnimatorOfFloat.addUpdateListener(this);
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.android.launcher3.anim.AnimatorPlaybackController.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                AnimatorPlaybackController animatorPlaybackController = AnimatorPlaybackController.this;
                animatorPlaybackController.mTargetCancelled = true;
                Runnable runnable2 = animatorPlaybackController.mOnCancelRunnable;
                if (runnable2 != null) {
                    runnable2.run();
                    AnimatorPlaybackController.this.mOnCancelRunnable = null;
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                AnimatorPlaybackController animatorPlaybackController = AnimatorPlaybackController.this;
                animatorPlaybackController.mTargetCancelled = false;
                animatorPlaybackController.mOnCancelRunnable = null;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                AnimatorPlaybackController.this.mTargetCancelled = false;
            }
        });
    }

    public static List b(ArrayList arrayList) {
        return arrayList == null ? Collections.EMPTY_LIST : arrayList;
    }

    private void dispatchOnCancelRecursively(Animator animator) {
        List listeners = animator.getListeners();
        if (listeners == null) {
            listeners = Collections.EMPTY_LIST;
        }
        Iterator it = listeners.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationCancel(animator);
        }
        if (animator instanceof AnimatorSet) {
            List childAnimations = ((AnimatorSet) animator).getChildAnimations();
            if (childAnimations == null) {
                childAnimations = Collections.EMPTY_LIST;
            }
            Iterator it2 = childAnimations.iterator();
            while (it2.hasNext()) {
                dispatchOnCancelRecursively((Animator) it2.next());
            }
        }
    }

    private void dispatchOnStartRecursively(Animator animator) {
        List listeners = animator.getListeners();
        if (listeners == null) {
            listeners = Collections.EMPTY_LIST;
        }
        Iterator it = listeners.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationStart(animator);
        }
        if (animator instanceof AnimatorSet) {
            List childAnimations = ((AnimatorSet) animator).getChildAnimations();
            if (childAnimations == null) {
                childAnimations = Collections.EMPTY_LIST;
            }
            Iterator it2 = childAnimations.iterator();
            while (it2.hasNext()) {
                dispatchOnStartRecursively((Animator) it2.next());
            }
        }
    }

    private static <T> List<T> nonNullList(ArrayList<T> arrayList) {
        return arrayList == null ? Collections.EMPTY_LIST : arrayList;
    }

    public static AnimatorPlaybackController wrap(AnimatorSet animatorSet, long j10) {
        return wrap(animatorSet, j10, null);
    }

    public long clampDuration(float f10) {
        long j10 = this.mDuration;
        float f11 = j10 * f10;
        if (f11 <= 0.0f) {
            return 0L;
        }
        return Math.min((long) f11, j10);
    }

    public void dispatchOnCancel() {
        dispatchOnCancelRecursively(this.mAnim);
    }

    public void dispatchOnStart() {
        dispatchOnStartRecursively(this.mAnim);
    }

    public ValueAnimator getAnimationPlayer() {
        return this.mAnimationPlayer;
    }

    public long getDuration() {
        return this.mDuration;
    }

    public Runnable getOnCancelRunnable() {
        return this.mOnCancelRunnable;
    }

    public float getProgressFraction() {
        return this.mCurrentFraction;
    }

    public AnimatorSet getTarget() {
        return this.mAnim;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        setPlayFraction(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public void pause() {
        this.mAnimationPlayer.cancel();
    }

    public void reverse() {
        this.mAnimationPlayer.setFloatValues(this.mCurrentFraction, 0.0f);
        this.mAnimationPlayer.setDuration(clampDuration(this.mCurrentFraction));
        this.mAnimationPlayer.start();
    }

    public void setEndAction(Runnable runnable) {
        this.mEndAction = runnable;
    }

    public void setOnCancelRunnable(Runnable runnable) {
        this.mOnCancelRunnable = runnable;
    }

    public abstract void setPlayFraction(float f10);

    public void start() {
        this.mAnimationPlayer.setFloatValues(this.mCurrentFraction, 1.0f);
        this.mAnimationPlayer.setDuration(clampDuration(1.0f - this.mCurrentFraction));
        this.mAnimationPlayer.start();
    }

    public static AnimatorPlaybackController wrap(AnimatorSet animatorSet, long j10, Runnable runnable) {
        return new AnimatorPlaybackControllerVL(animatorSet, j10, runnable);
    }
}
