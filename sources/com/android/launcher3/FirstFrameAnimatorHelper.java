package com.android.launcher3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.Log;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes2.dex */
public class FirstFrameAnimatorHelper extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
    private static final boolean DEBUG = false;
    private static final int MAX_DELAY = 1000;
    private static final String TAG = "FirstFrameAnimatorHlpr";
    private static ViewTreeObserver.OnDrawListener sGlobalDrawListener;
    static long sGlobalFrameCounter;
    private static boolean sVisible;
    private boolean mAdjustedSecondFrameTime;
    private boolean mHandlingOnAnimationUpdate;
    private long mStartFrame;
    private long mStartTime = -1;
    private final View mTarget;

    public FirstFrameAnimatorHelper(ValueAnimator valueAnimator, View view) {
        this.mTarget = view;
        valueAnimator.addUpdateListener(this);
    }

    public static /* synthetic */ void a() {
        sGlobalFrameCounter++;
    }

    public static void initializeDrawListener(View view) {
        if (sGlobalDrawListener != null) {
            view.getViewTreeObserver().removeOnDrawListener(sGlobalDrawListener);
        }
        sGlobalDrawListener = new ViewTreeObserverOnDrawListenerC3084h();
        view.getViewTreeObserver().addOnDrawListener(sGlobalDrawListener);
        sVisible = true;
    }

    public static void setIsVisible(boolean z10) {
        sVisible = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        ValueAnimator valueAnimator = (ValueAnimator) animator;
        valueAnimator.addUpdateListener(this);
        onAnimationUpdate(valueAnimator);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0087  */
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onAnimationUpdate(final android.animation.ValueAnimator r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = r0.mStartTime
            r6 = -1
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L16
            long r4 = com.android.launcher3.FirstFrameAnimatorHelper.sGlobalFrameCounter
            r0.mStartFrame = r4
            r0.mStartTime = r2
        L16:
            long r4 = r1.getCurrentPlayTime()
            r6 = 1065353216(0x3f800000, float:1.0)
            float r7 = r1.getAnimatedFraction()
            int r6 = java.lang.Float.compare(r6, r7)
            r7 = 0
            r8 = 1
            if (r6 != 0) goto L2a
            r6 = r8
            goto L2b
        L2a:
            r6 = r7
        L2b:
            boolean r9 = r0.mHandlingOnAnimationUpdate
            if (r9 != 0) goto L95
            boolean r9 = com.android.launcher3.FirstFrameAnimatorHelper.sVisible
            if (r9 == 0) goto L95
            long r9 = r1.getDuration()
            int r9 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r9 >= 0) goto L95
            if (r6 != 0) goto L95
            r0.mHandlingOnAnimationUpdate = r8
            long r9 = com.android.launcher3.FirstFrameAnimatorHelper.sGlobalFrameCounter
            long r11 = r0.mStartFrame
            long r9 = r9 - r11
            r11 = 0
            int r6 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            r15 = 1000(0x3e8, double:4.94E-321)
            if (r6 != 0) goto L64
            long r13 = r0.mStartTime
            long r13 = r13 + r15
            int r6 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r6 >= 0) goto L64
            int r6 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r6 <= 0) goto L64
            android.view.View r2 = r0.mTarget
            android.view.View r2 = r2.getRootView()
            r2.invalidate()
            r1.setCurrentPlayTime(r11)
            goto L93
        L64:
            r11 = 1
            int r6 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r6 != 0) goto L87
            long r9 = r0.mStartTime
            long r13 = r9 + r15
            int r11 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r11 >= 0) goto L87
            boolean r11 = r0.mAdjustedSecondFrameTime
            if (r11 != 0) goto L87
            r11 = 16
            long r9 = r9 + r11
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 <= 0) goto L87
            int r2 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r2 <= 0) goto L87
            r1.setCurrentPlayTime(r11)
            r0.mAdjustedSecondFrameTime = r8
            goto L93
        L87:
            if (r6 <= 0) goto L93
            android.view.View r2 = r0.mTarget
            com.android.launcher3.FirstFrameAnimatorHelper$1 r3 = new com.android.launcher3.FirstFrameAnimatorHelper$1
            r3.<init>()
            r2.post(r3)
        L93:
            r0.mHandlingOnAnimationUpdate = r7
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.launcher3.FirstFrameAnimatorHelper.onAnimationUpdate(android.animation.ValueAnimator):void");
    }

    public void print(ValueAnimator valueAnimator) {
        Log.d(TAG, sGlobalFrameCounter + "(" + (sGlobalFrameCounter - this.mStartFrame) + ") " + this.mTarget + " dirty? " + this.mTarget.isDirty() + C4.q.f17581a + (valueAnimator.getCurrentPlayTime() / valueAnimator.getDuration()) + C4.q.f17581a + this + C4.q.f17581a + valueAnimator);
    }

    public FirstFrameAnimatorHelper(ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.mTarget = view;
        viewPropertyAnimator.setListener(this);
    }
}
