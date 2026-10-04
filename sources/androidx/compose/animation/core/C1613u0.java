package androidx.compose.animation.core;

import androidx.annotation.RestrictTo;

/* JADX INFO: renamed from: androidx.compose.animation.core.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nSpringEstimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpringEstimation.kt\nandroidx/compose/animation/core/SpringEstimationKt\n+ 2 ComplexDouble.kt\nandroidx/compose/animation/core/ComplexDoubleKt\n+ 3 ComplexDouble.kt\nandroidx/compose/animation/core/ComplexDouble\n*L\n1#1,344:1\n343#1:377\n343#1:378\n339#1:379\n343#1:380\n343#1:381\n339#1:382\n103#2:345\n107#2:351\n103#2:355\n103#2:361\n107#2:367\n103#2:371\n35#3,2:346\n54#3,3:348\n66#3,3:352\n35#3,2:356\n54#3,3:358\n35#3,2:362\n54#3,3:364\n66#3,3:368\n35#3,2:372\n54#3,3:374\n*S KotlinDebug\n*F\n+ 1 SpringEstimation.kt\nandroidx/compose/animation/core/SpringEstimationKt\n*L\n164#1:377\n165#1:378\n203#1:379\n236#1:380\n237#1:381\n281#1:382\n74#1:345\n75#1:351\n75#1:355\n105#1:361\n106#1:367\n106#1:371\n74#1:346,2\n74#1:348,3\n75#1:352,3\n75#1:356,2\n75#1:358,3\n105#1:362,2\n105#1:364,3\n106#1:368,3\n106#1:372,2\n106#1:374,3\n*E\n"})
public final class C1613u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f88201a = 9223372036854L;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final long a(double d10, double d11, double d12, double d13, double d14) {
        double dSqrt = Math.sqrt(d10) * 2.0d * d11;
        double d15 = (dSqrt * dSqrt) - (d10 * 4.0d);
        double d16 = -dSqrt;
        C1620y c1620yB = C1622z.b(d15);
        c1620yB.f88254a = (c1620yB.f88254a + d16) * 0.5d;
        c1620yB.f88255b *= 0.5d;
        C1620y c1620yB2 = C1622z.b(d15);
        double d17 = -1;
        double d18 = c1620yB2.f88254a * d17;
        double d19 = c1620yB2.f88255b * d17;
        c1620yB2.f88254a = (d18 + d16) * 0.5d;
        c1620yB2.f88255b = d19 * 0.5d;
        return e(c1620yB, c1620yB2, d11, d12, d13, d14);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final long b(double d10, double d11, double d12, double d13, double d14, double d15) {
        double dSqrt = d11 / (Math.sqrt(d10 * d12) * 2.0d);
        double d16 = (d11 * d11) - ((4.0d * d12) * d10);
        double d17 = 1.0d / (2.0d * d12);
        double d18 = -d11;
        C1620y c1620yB = C1622z.b(d16);
        c1620yB.f88254a = (c1620yB.f88254a + d18) * d17;
        c1620yB.f88255b *= d17;
        C1620y c1620yB2 = C1622z.b(d16);
        double d19 = -1;
        double d20 = c1620yB2.f88254a * d19;
        double d21 = c1620yB2.f88255b * d19;
        c1620yB2.f88254a = (d20 + d18) * d17;
        c1620yB2.f88255b = d21 * d17;
        return e(c1620yB, c1620yB2, dSqrt, d13, d14, d15);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final long c(float f10, float f11, float f12, float f13, float f14) {
        if (f11 == 0.0f) {
            return 9223372036854L;
        }
        return a(f10, f11, f12, f13, f14);
    }

    public static final double d(C1620y c1620y, double d10, double d11, double d12) {
        double d13;
        double d14 = c1620y.f88254a;
        double d15 = d14 * d10;
        double d16 = d11 - d15;
        double dLog = Math.log(Math.abs(d12 / d10)) / d14;
        double dLog2 = Math.log(Math.abs(d12 / d16));
        double dLog3 = dLog2;
        for (int i10 = 0; i10 < 6; i10++) {
            dLog3 = dLog2 - Math.log(Math.abs(dLog3 / d14));
        }
        double d17 = dLog3 / d14;
        if (!((Double.isInfinite(dLog) || Double.isNaN(dLog)) ? false : true)) {
            dLog = d17;
        } else if ((Double.isInfinite(d17) || Double.isNaN(d17)) ? false : true) {
            dLog = Math.max(dLog, d17);
        }
        double d18 = (-(d15 + d16)) / (d14 * d16);
        double d19 = d14 * d18;
        double dExp = (Math.exp(d19) * d16 * d18) + (Math.exp(d19) * d10);
        if (Double.isNaN(d18) || d18 <= 0.0d) {
            d13 = -d12;
        } else if (d18 <= 0.0d || (-dExp) >= d12) {
            dLog = (-(2.0d / d14)) - (d10 / d16);
            d13 = d12;
        } else {
            if (d16 < 0.0d && d10 > 0.0d) {
                dLog = 0.0d;
            }
            d13 = -d12;
        }
        double dAbs = Double.MAX_VALUE;
        int i11 = 0;
        while (dAbs > 0.001d && i11 < 100) {
            i11++;
            double d20 = d14 * dLog;
            double dExp2 = dLog - (((Math.exp(d20) * ((d16 * dLog) + d10)) + d13) / (Math.exp(d20) * (((((double) 1) + d20) * d16) + d15)));
            dAbs = Math.abs(dLog - dExp2);
            dLog = dExp2;
        }
        return dLog;
    }

    public static final long e(C1620y c1620y, C1620y c1620y2, double d10, double d11, double d12, double d13) {
        if (d12 == 0.0d && d11 == 0.0d) {
            return 0L;
        }
        if (d12 < 0.0d) {
            d11 = -d11;
        }
        double d14 = d11;
        double dAbs = Math.abs(d12);
        return (long) ((d10 > 1.0d ? f(c1620y, c1620y2, dAbs, d14, d13) : d10 < 1.0d ? h(c1620y, dAbs, d14, d13) : d(c1620y, dAbs, d14, d13)) * 1000.0d);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00c6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final double f(androidx.compose.animation.core.C1620y r28, androidx.compose.animation.core.C1620y r29, double r30, double r32, double r34) {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.C1613u0.f(androidx.compose.animation.core.y, androidx.compose.animation.core.y, double, double, double):double");
    }

    public static final double g(double d10, double d11, double d12, double d13, double d14) {
        return (Math.exp(d14 * d12) * d13) + (Math.exp(d11 * d12) * d10);
    }

    public static final double h(C1620y c1620y, double d10, double d11, double d12) {
        double d13 = c1620y.f88254a;
        double d14 = (d11 - (d13 * d10)) / c1620y.f88255b;
        return Math.log(d12 / Math.sqrt((d14 * d14) + (d10 * d10))) / d13;
    }

    public static final boolean i(double d10) {
        return !((Double.isInfinite(d10) || Double.isNaN(d10)) ? false : true);
    }

    public static final double j(double d10, ed.l<? super Double, Double> lVar, ed.l<? super Double, Double> lVar2) {
        return d10 - (lVar.invoke(Double.valueOf(d10)).doubleValue() / lVar2.invoke(Double.valueOf(d10)).doubleValue());
    }
}
