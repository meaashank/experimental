package com.android.launcher3.anim;

import android.graphics.Path;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import android.view.animation.PathInterpolator;

/* JADX INFO: loaded from: classes2.dex */
public class Interpolators {
    public static final Interpolator EXAGGERATED_EASE;
    private static final float FAST_FLING_PX_MS = 10.0f;
    public static final Interpolator OVERSHOOT_1_2;
    public static final Interpolator SCROLL;
    public static final Interpolator SCROLL_CUBIC;
    public static final Interpolator TOUCH_RESPONSE_INTERPOLATOR;
    public static final Interpolator ZOOM_IN;
    public static final Interpolator ZOOM_OUT;
    public static final Interpolator LINEAR = new LinearInterpolator();
    public static final Interpolator ACCEL = new AccelerateInterpolator();
    public static final Interpolator ACCEL_1_5 = new AccelerateInterpolator(1.5f);
    public static final Interpolator ACCEL_2 = new AccelerateInterpolator(2.0f);
    public static final Interpolator DEACCEL = new DecelerateInterpolator();
    public static final Interpolator DEACCEL_1_5 = new DecelerateInterpolator(1.5f);
    public static final Interpolator DEACCEL_1_7 = new DecelerateInterpolator(1.7f);
    public static final Interpolator DEACCEL_2 = new DecelerateInterpolator(2.0f);
    public static final Interpolator DEACCEL_2_5 = new DecelerateInterpolator(2.5f);
    public static final Interpolator DEACCEL_3 = new DecelerateInterpolator(3.0f);
    public static final Interpolator FAST_OUT_SLOW_IN = new PathInterpolator(0.4f, 0.0f, 0.2f, 1.0f);
    public static final Interpolator AGGRESSIVE_EASE = new PathInterpolator(0.2f, 0.0f, 0.0f, 1.0f);
    public static final Interpolator AGGRESSIVE_EASE_IN_OUT = new PathInterpolator(0.6f, 0.0f, 0.4f, 1.0f);

    /* JADX INFO: renamed from: com.android.launcher3.anim.Interpolators$1, reason: invalid class name */
    public class AnonymousClass1 implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            return Interpolators.DEACCEL_3.getInterpolation(1.0f - Interpolators.ZOOM_OUT.getInterpolation(1.0f - f10));
        }
    }

    /* JADX INFO: renamed from: com.android.launcher3.anim.Interpolators$2, reason: invalid class name */
    public class AnonymousClass2 implements Interpolator {
        private static final float FOCAL_LENGTH = 0.35f;

        private float zInterpolate(float f10) {
            return (1.0f - (0.35f / (f10 + 0.35f))) / 0.7407408f;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            return zInterpolate(f10);
        }
    }

    /* JADX INFO: renamed from: com.android.launcher3.anim.Interpolators$3, reason: invalid class name */
    public class AnonymousClass3 implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    /* JADX INFO: renamed from: com.android.launcher3.anim.Interpolators$4, reason: invalid class name */
    public class AnonymousClass4 implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11) + 1.0f;
        }
    }

    static {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(0.05f, 0.0f, 0.133333f, 0.08f, 0.166666f, 0.4f);
        path.cubicTo(0.225f, 0.94f, 0.5f, 1.0f, 1.0f, 1.0f);
        EXAGGERATED_EASE = new PathInterpolator(path);
        OVERSHOOT_1_2 = new OvershootInterpolator(1.2f);
        TOUCH_RESPONSE_INTERPOLATOR = new PathInterpolator(0.3f, 0.0f, 0.1f, 1.0f);
        ZOOM_IN = new AnonymousClass1();
        ZOOM_OUT = new AnonymousClass2();
        SCROLL = new AnonymousClass3();
        SCROLL_CUBIC = new AnonymousClass4();
    }

    public static /* synthetic */ float a(float f10, float f11, Interpolator interpolator, float f12) {
        if (f12 < f10) {
            return 0.0f;
        }
        if (f12 > f11) {
            return 1.0f;
        }
        return interpolator.getInterpolation((f12 - f10) / (f11 - f10));
    }

    public static Interpolator clampToProgress(final Interpolator interpolator, final float f10, final float f11) {
        if (f11 > f10) {
            return new Interpolator() { // from class: com.android.launcher3.anim.b
                @Override // android.animation.TimeInterpolator
                public final float getInterpolation(float f12) {
                    return Interpolators.a(f10, f11, interpolator, f12);
                }
            };
        }
        throw new IllegalArgumentException("lowerBound must be less than upperBound");
    }

    public static Interpolator scrollInterpolatorForVelocity(float f10) {
        return Math.abs(f10) > 10.0f ? SCROLL : SCROLL_CUBIC;
    }
}
