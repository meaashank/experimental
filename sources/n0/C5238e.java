package n0;

import jd.C4806d;
import kotlin.jvm.internal.V;

/* JADX INFO: renamed from: n0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nMathHelpers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,241:1\n78#1,9:243\n104#1,9:252\n28#2:242\n22#2:261\n*S KotlinDebug\n*F\n+ 1 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n71#1:243,9\n97#1:252,9\n31#1:242\n233#1:261\n*E\n"})
public final class C5238e {
    public static final float a(float f10) {
        float fIntBitsToFloat = Float.intBitsToFloat(((int) ((((long) Float.floatToRawIntBits(f10)) & 8589934591L) / ((long) 3))) + 709952852);
        float f11 = fIntBitsToFloat - ((fIntBitsToFloat - (f10 / (fIntBitsToFloat * fIntBitsToFloat))) * 0.33333334f);
        return f11 - ((f11 - (f10 / (f11 * f11))) * 0.33333334f);
    }

    public static final double b(double d10, double d11) {
        return d10 < d11 ? d11 : d10;
    }

    public static final float c(float f10, float f11) {
        return f10 < f11 ? f11 : f10;
    }

    public static final double d(double d10, double d11) {
        return d10 > d11 ? d11 : d10;
    }

    public static final float e(float f10, float f11) {
        return f10 > f11 ? f11 : f10;
    }

    public static final double f(double d10, double d11, double d12) {
        if (d10 < d11) {
            d10 = d11;
        }
        return d10 > d12 ? d12 : d10;
    }

    public static final float g(float f10, float f11, float f12) {
        if (f10 < f11) {
            f10 = f11;
        }
        return f10 > f12 ? f12 : f10;
    }

    public static final float h(float f10, float f11, float f12, float f13) {
        return Math.max(f10, Math.max(f11, Math.max(f12, f13)));
    }

    public static final float i(float f10, float f11, float f12, float f13) {
        return Math.min(f10, Math.min(f11, Math.min(f12, f13)));
    }

    public static final float j(float f10, float f11, float f12) {
        return (f12 * f11) + ((1 - f12) * f10);
    }

    public static final int k(int i10, int i11, float f10) {
        return i10 + ((int) Math.round(((double) (i11 - i10)) * ((double) f10)));
    }

    public static final long l(long j10, long j11, float f10) {
        return C4806d.M0((j11 - j10) * ((double) f10)) + j10;
    }
}
