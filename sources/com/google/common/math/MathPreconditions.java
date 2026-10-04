package com.google.common.math;

import U6.j;
import com.google.android.gms.ads.internal.util.d;
import com.google.android.gms.ads.internal.util.e;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.a;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.math.BigInteger;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
@CanIgnoreReturnValue
@GwtCompatible
final class MathPreconditions {
    private MathPreconditions() {
    }

    public static void checkInRangeForRoundingInputs(boolean z10, double d10, RoundingMode roundingMode) {
        if (z10) {
            return;
        }
        String strValueOf = String.valueOf(roundingMode);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 83);
        sb2.append("rounded value is out of range for input ");
        sb2.append(d10);
        sb2.append(" and rounding mode ");
        sb2.append(strValueOf);
        throw new ArithmeticException(sb2.toString());
    }

    public static void checkNoOverflow(boolean z10, String str, int i10, int i11) {
        if (z10) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(e.a(str, 36));
        sb2.append("overflow: ");
        sb2.append(str);
        sb2.append("(");
        sb2.append(i10);
        throw new ArithmeticException(d.a(sb2, j.f68738d, i11, ")"));
    }

    public static int checkNonNegative(String str, int i10) {
        if (i10 >= 0) {
            return i10;
        }
        StringBuilder sb2 = new StringBuilder(e.a(str, 27));
        sb2.append(str);
        sb2.append(" (");
        sb2.append(i10);
        sb2.append(") must be >= 0");
        throw new IllegalArgumentException(sb2.toString());
    }

    public static int checkPositive(String str, int i10) {
        if (i10 > 0) {
            return i10;
        }
        StringBuilder sb2 = new StringBuilder(e.a(str, 26));
        sb2.append(str);
        sb2.append(" (");
        sb2.append(i10);
        sb2.append(") must be > 0");
        throw new IllegalArgumentException(sb2.toString());
    }

    public static void checkRoundingUnnecessary(boolean z10) {
        if (!z10) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }

    public static long checkNonNegative(String str, long j10) {
        if (j10 >= 0) {
            return j10;
        }
        StringBuilder sb2 = new StringBuilder(e.a(str, 36));
        sb2.append(str);
        sb2.append(" (");
        sb2.append(j10);
        sb2.append(") must be >= 0");
        throw new IllegalArgumentException(sb2.toString());
    }

    public static long checkPositive(String str, long j10) {
        if (j10 > 0) {
            return j10;
        }
        StringBuilder sb2 = new StringBuilder(e.a(str, 35));
        sb2.append(str);
        sb2.append(" (");
        sb2.append(j10);
        sb2.append(") must be > 0");
        throw new IllegalArgumentException(sb2.toString());
    }

    public static BigInteger checkNonNegative(String str, BigInteger bigInteger) {
        if (bigInteger.signum() >= 0) {
            return bigInteger;
        }
        String strValueOf = String.valueOf(bigInteger);
        throw new IllegalArgumentException(a.a(strValueOf.length() + e.a(str, 16), str, " (", strValueOf, ") must be >= 0"));
    }

    public static BigInteger checkPositive(String str, BigInteger bigInteger) {
        if (bigInteger.signum() > 0) {
            return bigInteger;
        }
        String strValueOf = String.valueOf(bigInteger);
        throw new IllegalArgumentException(a.a(strValueOf.length() + e.a(str, 15), str, " (", strValueOf, ") must be > 0"));
    }

    public static void checkNoOverflow(boolean z10, String str, long j10, long j11) {
        if (z10) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(e.a(str, 54));
        sb2.append("overflow: ");
        sb2.append(str);
        sb2.append("(");
        sb2.append(j10);
        sb2.append(j.f68738d);
        sb2.append(j11);
        sb2.append(")");
        throw new ArithmeticException(sb2.toString());
    }

    public static double checkNonNegative(String str, double d10) {
        if (d10 >= 0.0d) {
            return d10;
        }
        StringBuilder sb2 = new StringBuilder(e.a(str, 40));
        sb2.append(str);
        sb2.append(" (");
        sb2.append(d10);
        sb2.append(") must be >= 0");
        throw new IllegalArgumentException(sb2.toString());
    }
}
