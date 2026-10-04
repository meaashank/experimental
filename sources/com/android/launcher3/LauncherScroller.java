package com.android.launcher3;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.compose.animation.W;
import androidx.compose.animation.X;
import i.C4541d;

/* JADX INFO: loaded from: classes2.dex */
public class LauncherScroller {
    private static final int DEFAULT_DURATION = 250;
    private static final float END_TENSION = 1.0f;
    private static final int FLING_MODE = 1;
    private static final float INFLEXION = 0.35f;
    private static final int NB_SAMPLES = 100;

    /* JADX INFO: renamed from: P1, reason: collision with root package name */
    private static final float f136878P1 = 0.175f;

    /* JADX INFO: renamed from: P2, reason: collision with root package name */
    private static final float f136879P2 = 0.35000002f;
    private static final int SCROLL_MODE = 0;
    private static final float START_TENSION = 0.5f;
    private static float sViscousFluidNormalize;
    private static float sViscousFluidScale;
    private float mCurrVelocity;
    private int mCurrX;
    private int mCurrY;
    private float mDeceleration;
    private float mDeltaX;
    private float mDeltaY;
    private int mDistance;
    private int mDuration;
    private float mDurationReciprocal;
    private int mFinalX;
    private int mFinalY;
    private boolean mFinished;
    private float mFlingFriction;
    private boolean mFlywheel;
    private TimeInterpolator mInterpolator;
    private int mMaxX;
    private int mMaxY;
    private int mMinX;
    private int mMinY;
    private int mMode;
    private float mPhysicalCoeff;
    private final float mPpi;
    private long mStartTime;
    private int mStartX;
    private int mStartY;
    private float mVelocity;
    private static float DECELERATION_RATE = (float) (Math.log(0.78d) / Math.log(0.9d));
    private static final float[] SPLINE_POSITION = new float[101];
    private static final float[] SPLINE_TIME = new float[101];

    static {
        float fA;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float fA2;
        float f15;
        float f16;
        float f17;
        float f18 = 0.0f;
        int i10 = 0;
        float f19 = 0.0f;
        while (true) {
            float f20 = 1.0f;
            if (i10 >= 100) {
                float[] fArr = SPLINE_POSITION;
                SPLINE_TIME[100] = 1.0f;
                fArr[100] = 1.0f;
                sViscousFluidScale = 8.0f;
                sViscousFluidNormalize = 1.0f;
                sViscousFluidNormalize = 1.0f / viscousFluid(1.0f);
                return;
            }
            float f21 = i10 / 100.0f;
            float f22 = 1.0f;
            while (true) {
                fA = W.a(f22, f18, 2.0f, f18);
                f10 = f20 - fA;
                f11 = fA * 3.0f * f10;
                f12 = fA * fA * fA;
                float fA3 = X.a(fA, 0.35000002f, f10 * 0.175f, f11) + f12;
                f13 = f20;
                f14 = f21;
                if (Math.abs(fA3 - f21) < 1.0E-5d) {
                    break;
                }
                if (fA3 > f14) {
                    f22 = fA;
                } else {
                    f18 = fA;
                }
                f20 = f13;
                f21 = f14;
            }
            SPLINE_POSITION[i10] = (((f10 * 0.5f) + fA) * f11) + f12;
            float f23 = f13;
            while (true) {
                fA2 = W.a(f23, f19, 2.0f, f19);
                f15 = f13 - fA2;
                f16 = fA2 * 3.0f * f15;
                f17 = fA2 * fA2 * fA2;
                float fA4 = X.a(f15, 0.5f, fA2, f16) + f17;
                if (Math.abs(fA4 - f14) < 1.0E-5d) {
                    break;
                } else if (fA4 > f14) {
                    f23 = fA2;
                } else {
                    f19 = fA2;
                }
            }
            SPLINE_TIME[i10] = (((fA2 * 0.35000002f) + (f15 * 0.175f)) * f16) + f17;
            i10++;
        }
    }

    public LauncherScroller(Context context) {
        this(context, null);
    }

    private float computeDeceleration(float f10) {
        return this.mPpi * 386.0878f * f10;
    }

    private double getSplineDeceleration(float f10) {
        return Math.log((Math.abs(f10) * 0.35f) / (this.mFlingFriction * this.mPhysicalCoeff));
    }

    private double getSplineFlingDistance(float f10) {
        double splineDeceleration = getSplineDeceleration(f10);
        float f11 = DECELERATION_RATE;
        return Math.exp((((double) f11) / (((double) f11) - 1.0d)) * splineDeceleration) * ((double) (this.mFlingFriction * this.mPhysicalCoeff));
    }

    private int getSplineFlingDuration(float f10) {
        return (int) (Math.exp(getSplineDeceleration(f10) / (((double) DECELERATION_RATE) - 1.0d)) * 1000.0d);
    }

    public static float viscousFluid(float f10) {
        float f11 = f10 * sViscousFluidScale;
        return (f11 < 1.0f ? f11 - (1.0f - ((float) Math.exp(-f11))) : C4541d.a(1.0f, (float) Math.exp(1.0f - f11), 0.63212055f, 0.36787945f)) * sViscousFluidNormalize;
    }

    public void abortAnimation() {
        this.mCurrX = this.mFinalX;
        this.mCurrY = this.mFinalY;
        this.mFinished = true;
    }

    public boolean computeScrollOffset() {
        float fA;
        float f10;
        if (this.mFinished) {
            return false;
        }
        int iCurrentAnimationTimeMillis = (int) (AnimationUtils.currentAnimationTimeMillis() - this.mStartTime);
        int i10 = this.mDuration;
        if (iCurrentAnimationTimeMillis < i10) {
            int i11 = this.mMode;
            if (i11 == 0) {
                float f11 = iCurrentAnimationTimeMillis * this.mDurationReciprocal;
                TimeInterpolator timeInterpolator = this.mInterpolator;
                float fViscousFluid = timeInterpolator == null ? viscousFluid(f11) : timeInterpolator.getInterpolation(f11);
                this.mCurrX = Math.round(this.mDeltaX * fViscousFluid) + this.mStartX;
                this.mCurrY = Math.round(fViscousFluid * this.mDeltaY) + this.mStartY;
            } else if (i11 == 1) {
                float f12 = iCurrentAnimationTimeMillis / i10;
                int i12 = (int) (f12 * 100.0f);
                if (i12 < 100) {
                    float f13 = i12 / 100.0f;
                    int i13 = i12 + 1;
                    float[] fArr = SPLINE_POSITION;
                    float f14 = fArr[i12];
                    f10 = (fArr[i13] - f14) / ((i13 / 100.0f) - f13);
                    fA = C4541d.a(f12, f13, f10, f14);
                } else {
                    fA = 1.0f;
                    f10 = 0.0f;
                }
                this.mCurrVelocity = ((f10 * this.mDistance) / i10) * 1000.0f;
                int iRound = Math.round((this.mFinalX - r1) * fA) + this.mStartX;
                this.mCurrX = iRound;
                int iMin = Math.min(iRound, this.mMaxX);
                this.mCurrX = iMin;
                this.mCurrX = Math.max(iMin, this.mMinX);
                int iRound2 = Math.round(fA * (this.mFinalY - r1)) + this.mStartY;
                this.mCurrY = iRound2;
                int iMin2 = Math.min(iRound2, this.mMaxY);
                this.mCurrY = iMin2;
                int iMax = Math.max(iMin2, this.mMinY);
                this.mCurrY = iMax;
                if (this.mCurrX == this.mFinalX && iMax == this.mFinalY) {
                    this.mFinished = true;
                }
            }
        } else {
            this.mCurrX = this.mFinalX;
            this.mCurrY = this.mFinalY;
            this.mFinished = true;
        }
        return true;
    }

    public void extendDuration(int i10) {
        int iTimePassed = timePassed() + i10;
        this.mDuration = iTimePassed;
        this.mDurationReciprocal = 1.0f / iTimePassed;
        this.mFinished = false;
    }

    public void fling(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        if (this.mFlywheel && !this.mFinished) {
            float currVelocity = getCurrVelocity();
            float f10 = this.mFinalX - this.mStartX;
            float f11 = this.mFinalY - this.mStartY;
            float fHypot = (float) Math.hypot(f10, f11);
            float f12 = (f10 / fHypot) * currVelocity;
            float f13 = (f11 / fHypot) * currVelocity;
            float f14 = i12;
            if (Math.signum(f14) == Math.signum(f12)) {
                float f15 = i13;
                if (Math.signum(f15) == Math.signum(f13)) {
                    i12 = (int) (f14 + f12);
                    i13 = (int) (f15 + f13);
                }
            }
        }
        this.mMode = 1;
        this.mFinished = false;
        float fHypot2 = (float) Math.hypot(i12, i13);
        this.mVelocity = fHypot2;
        this.mDuration = getSplineFlingDuration(fHypot2);
        this.mStartTime = AnimationUtils.currentAnimationTimeMillis();
        this.mStartX = i10;
        this.mStartY = i11;
        float f16 = fHypot2 == 0.0f ? 1.0f : i12 / fHypot2;
        float f17 = fHypot2 != 0.0f ? i13 / fHypot2 : 1.0f;
        double splineFlingDistance = getSplineFlingDistance(fHypot2);
        this.mDistance = (int) (((double) Math.signum(fHypot2)) * splineFlingDistance);
        this.mMinX = i14;
        this.mMaxX = i15;
        this.mMinY = i16;
        this.mMaxY = i17;
        int iRound = i10 + ((int) Math.round(((double) f16) * splineFlingDistance));
        this.mFinalX = iRound;
        int iMin = Math.min(iRound, this.mMaxX);
        this.mFinalX = iMin;
        this.mFinalX = Math.max(iMin, this.mMinX);
        int iRound2 = i11 + ((int) Math.round(splineFlingDistance * ((double) f17)));
        this.mFinalY = iRound2;
        int iMin2 = Math.min(iRound2, this.mMaxY);
        this.mFinalY = iMin2;
        this.mFinalY = Math.max(iMin2, this.mMinY);
    }

    public final void forceFinished(boolean z10) {
        this.mFinished = z10;
    }

    public float getCurrVelocity() {
        return this.mMode == 1 ? this.mCurrVelocity : this.mVelocity - ((this.mDeceleration * timePassed()) / 2000.0f);
    }

    public final int getCurrX() {
        return this.mCurrX;
    }

    public final int getCurrY() {
        return this.mCurrY;
    }

    public final int getDuration() {
        return this.mDuration;
    }

    public final int getFinalX() {
        return this.mFinalX;
    }

    public final int getFinalY() {
        return this.mFinalY;
    }

    public final int getStartX() {
        return this.mStartX;
    }

    public final int getStartY() {
        return this.mStartY;
    }

    public final boolean isFinished() {
        return this.mFinished;
    }

    public boolean isScrollingInDirection(float f10, float f11) {
        return !this.mFinished && Math.signum(f10) == Math.signum((float) (this.mFinalX - this.mStartX)) && Math.signum(f11) == Math.signum((float) (this.mFinalY - this.mStartY));
    }

    public void setFinalX(int i10) {
        this.mFinalX = i10;
        this.mDeltaX = i10 - this.mStartX;
        this.mFinished = false;
    }

    public void setFinalY(int i10) {
        this.mFinalY = i10;
        this.mDeltaY = i10 - this.mStartY;
        this.mFinished = false;
    }

    public final void setFriction(float f10) {
        this.mDeceleration = computeDeceleration(f10);
        this.mFlingFriction = f10;
    }

    public void setInterpolator(TimeInterpolator timeInterpolator) {
        this.mInterpolator = timeInterpolator;
    }

    public void startScroll(int i10, int i11, int i12, int i13) {
        startScroll(i10, i11, i12, i13, 250);
    }

    public int timePassed() {
        return (int) (AnimationUtils.currentAnimationTimeMillis() - this.mStartTime);
    }

    public LauncherScroller(Context context, Interpolator interpolator) {
        this(context, interpolator, context.getApplicationInfo().targetSdkVersion >= 11);
    }

    public void startScroll(int i10, int i11, int i12, int i13, int i14) {
        this.mMode = 0;
        this.mFinished = false;
        this.mDuration = i14;
        this.mStartTime = AnimationUtils.currentAnimationTimeMillis();
        this.mStartX = i10;
        this.mStartY = i11;
        this.mFinalX = i10 + i12;
        this.mFinalY = i11 + i13;
        this.mDeltaX = i12;
        this.mDeltaY = i13;
        this.mDurationReciprocal = 1.0f / this.mDuration;
    }

    public LauncherScroller(Context context, Interpolator interpolator, boolean z10) {
        this.mFlingFriction = ViewConfiguration.getScrollFriction();
        this.mFinished = true;
        this.mInterpolator = interpolator;
        this.mPpi = context.getResources().getDisplayMetrics().density * 160.0f;
        this.mDeceleration = computeDeceleration(ViewConfiguration.getScrollFriction());
        this.mFlywheel = z10;
        this.mPhysicalCoeff = computeDeceleration(0.84f);
    }
}
