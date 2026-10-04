package com.android.launcher3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public class InterruptibleInOutAnimator {
    private static final int IN = 1;
    private static final int OUT = 2;
    private static final int STOPPED = 0;
    private ValueAnimator mAnimator;
    private long mOriginalDuration;
    private float mOriginalFromValue;
    private float mOriginalToValue;
    private boolean mFirstRun = true;
    private Object mTag = null;
    int mDirection = 0;

    public InterruptibleInOutAnimator(View view, long j10, float f10, float f11) {
        ValueAnimator duration = LauncherAnimUtils.ofFloat(f10, f11).setDuration(j10);
        this.mAnimator = duration;
        this.mOriginalDuration = j10;
        this.mOriginalFromValue = f10;
        this.mOriginalToValue = f11;
        duration.addListener(new AnimatorListenerAdapter() { // from class: com.android.launcher3.InterruptibleInOutAnimator.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                InterruptibleInOutAnimator.this.mDirection = 0;
            }
        });
    }

    private void animate(int i10) {
        long currentPlayTime = this.mAnimator.getCurrentPlayTime();
        float f10 = i10 == 1 ? this.mOriginalToValue : this.mOriginalFromValue;
        float fFloatValue = this.mFirstRun ? this.mOriginalFromValue : ((Float) this.mAnimator.getAnimatedValue()).floatValue();
        cancel();
        this.mDirection = i10;
        long j10 = this.mOriginalDuration;
        this.mAnimator.setDuration(Math.max(0L, Math.min(j10 - currentPlayTime, j10)));
        this.mAnimator.setFloatValues(fFloatValue, f10);
        this.mAnimator.start();
        this.mFirstRun = false;
    }

    public void animateIn() {
        animate(1);
    }

    public void animateOut() {
        animate(2);
    }

    public void cancel() {
        this.mAnimator.cancel();
        this.mDirection = 0;
    }

    public void end() {
        this.mAnimator.end();
        this.mDirection = 0;
    }

    public ValueAnimator getAnimator() {
        return this.mAnimator;
    }

    public Object getTag() {
        return this.mTag;
    }

    public boolean isStopped() {
        return this.mDirection == 0;
    }

    public void setTag(Object obj) {
        this.mTag = obj;
    }
}
