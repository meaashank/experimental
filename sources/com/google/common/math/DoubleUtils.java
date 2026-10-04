package com.google.common.math;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
@GwtIncompatible
final class DoubleUtils {
    static final int EXPONENT_BIAS = 1023;
    static final long EXPONENT_MASK = 9218868437227405312L;
    static final long IMPLICIT_BIT = 4503599627370496L;

    @VisibleForTesting
    static final long ONE_BITS = 4607182418800017408L;
    static final int SIGNIFICAND_BITS = 52;
    static final long SIGNIFICAND_MASK = 4503599627370495L;
    static final long SIGN_MASK = Long.MIN_VALUE;

    private DoubleUtils() {
    }

    public static double bigToDouble(BigInteger bigInteger) {
        BigInteger bigIntegerAbs = bigInteger.abs();
        int iBitLength = bigIntegerAbs.bitLength();
        int i10 = iBitLength - 1;
        if (i10 < 63) {
            return bigInteger.longValue();
        }
        if (i10 > 1023) {
            return ((double) bigInteger.signum()) * Double.POSITIVE_INFINITY;
        }
        int i11 = iBitLength - 54;
        long jLongValue = bigIntegerAbs.shiftRight(i11).longValue();
        long j10 = jLongValue >> 1;
        long j11 = SIGNIFICAND_MASK & j10;
        if ((jLongValue & 1) != 0 && ((j10 & 1) != 0 || bigIntegerAbs.getLowestSetBit() < i11)) {
            j11++;
        }
        return Double.longBitsToDouble(((((long) (iBitLength + 1022)) << 52) + j11) | (((long) bigInteger.signum()) & Long.MIN_VALUE));
    }

    public static double ensureNonNegative(double d10) {
        Preconditions.checkArgument(!Double.isNaN(d10));
        return Math.max(d10, 0.0d);
    }

    public static long getSignificand(double d10) {
        Preconditions.checkArgument(isFinite(d10), "not a normal value");
        int exponent = Math.getExponent(d10);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d10) & SIGNIFICAND_MASK;
        return exponent == -1023 ? jDoubleToRawLongBits << 1 : jDoubleToRawLongBits | IMPLICIT_BIT;
    }

    public static boolean isFinite(double d10) {
        return Math.getExponent(d10) <= 1023;
    }

    public static boolean isNormal(double d10) {
        return Math.getExponent(d10) >= -1022;
    }

    public static double nextDown(double d10) {
        return -Math.nextUp(-d10);
    }

    public static double scaleNormalize(double d10) {
        return Double.longBitsToDouble((Double.doubleToRawLongBits(d10) & SIGNIFICAND_MASK) | ONE_BITS);
    }
}
