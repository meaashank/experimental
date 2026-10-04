package com.google.common.math;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Ascii;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Longs;
import com.google.common.primitives.UnsignedLongs;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import java.math.RoundingMode;
import okhttp3.internal.connection.RealConnection;
import okio.internal.ZipKt;
import org.apache.http.HttpStatus;
import org.objectweb.asm.Opcodes;

/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
public final class LongMath {

    @VisibleForTesting
    static final long FLOOR_SQRT_MAX_LONG = 3037000499L;

    @VisibleForTesting
    static final long MAX_POWER_OF_SQRT2_UNSIGNED = -5402926248376769404L;

    @VisibleForTesting
    static final long MAX_SIGNED_POWER_OF_TWO = 4611686018427387904L;
    private static final int SIEVE_30 = -545925251;

    @VisibleForTesting
    static final byte[] maxLog10ForLeadingZeros = {19, Ascii.DC2, Ascii.DC2, Ascii.DC2, Ascii.DC2, 17, 17, 17, 16, 16, 16, Ascii.SI, Ascii.SI, Ascii.SI, Ascii.SI, Ascii.SO, Ascii.SO, Ascii.SO, 13, 13, 13, 12, 12, 12, 12, 11, 11, 11, 10, 10, 10, 9, 9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0};

    @VisibleForTesting
    @GwtIncompatible
    static final long[] powersOf10 = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, RealConnection.f225578w, 100000000000L, 1000000000000L, 10000000000000L, 100000000000000L, 1000000000000000L, 10000000000000000L, 100000000000000000L, 1000000000000000000L};

    @VisibleForTesting
    @GwtIncompatible
    static final long[] halfPowersOf10 = {3, 31, 316, 3162, 31622, 316227, 3162277, 31622776, 316227766, 3162277660L, 31622776601L, 316227766016L, 3162277660168L, 31622776601683L, 316227766016837L, 3162277660168379L, 31622776601683793L, 316227766016837933L, 3162277660168379331L};
    static final long[] factorials = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600, 6227020800L, 87178291200L, 1307674368000L, 20922789888000L, 355687428096000L, 6402373705728000L, 121645100408832000L, 2432902008176640000L};
    static final int[] biggestBinomials = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 3810779, 121977, 16175, 4337, 1733, 887, 534, 361, 265, 206, Opcodes.RET, Opcodes.D2L, 125, 111, 101, 94, 88, 83, 79, 76, 74, 72, 70, 69, 68, 67, 67, 66, 66, 66, 66};

    @VisibleForTesting
    static final int[] biggestSimpleBinomials = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 2642246, 86251, 11724, 3218, 1313, 684, HttpStatus.SC_INSUFFICIENT_SPACE_ON_RESOURCE, MBSupportMuteAdType.INTERSTITIAL_VIDEO, 214, Opcodes.RET, Opcodes.F2I, 119, 105, 95, 87, 81, 76, 73, 70, 68, 66, 64, 63, 62, 62, 61, 61, 61};
    private static final long[][] millerRabinBaseSets = {new long[]{291830, 126401071349994536L}, new long[]{885594168, 725270293939359937L, 3569819667048198375L}, new long[]{273919523040L, 15, 7363882082L, 992620450144556L}, new long[]{47636622961200L, 2, 2570940, 211991001, 3749873356L}, new long[]{7999252175582850L, 2, 4130806001517L, 149795463772692060L, 186635894390467037L, 3967304179347715805L}, new long[]{585226005592931976L, 2, 123635709730000L, 9233062284813009L, 43835965440333360L, 761179012939631437L, 1263739024124850375L}, new long[]{Long.MAX_VALUE, 2, 325, 9375, 28178, 450775, 9780504, 1795265022}};

    /* JADX INFO: renamed from: com.google.common.math.LongMath$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$java$math$RoundingMode;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            $SwitchMap$java$math$RoundingMode = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.FLOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.CEILING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public enum MillerRabinTester {
        SMALL { // from class: com.google.common.math.LongMath.MillerRabinTester.1
            @Override // com.google.common.math.LongMath.MillerRabinTester
            public long mulMod(long j10, long j11, long j12) {
                return (j10 * j11) % j12;
            }

            @Override // com.google.common.math.LongMath.MillerRabinTester
            public long squareMod(long j10, long j11) {
                return (j10 * j10) % j11;
            }
        },
        LARGE { // from class: com.google.common.math.LongMath.MillerRabinTester.2
            private long plusMod(long j10, long j11, long j12) {
                long j13 = j10 + j11;
                return j10 >= j12 - j11 ? j13 - j12 : j13;
            }

            private long times2ToThe32Mod(long j10, long j11) {
                int i10 = 32;
                do {
                    int iMin = Math.min(i10, Long.numberOfLeadingZeros(j10));
                    j10 = UnsignedLongs.remainder(j10 << iMin, j11);
                    i10 -= iMin;
                } while (i10 > 0);
                return j10;
            }

            @Override // com.google.common.math.LongMath.MillerRabinTester
            public long mulMod(long j10, long j11, long j12) {
                long j13 = j10 >>> 32;
                long j14 = j11 >>> 32;
                long j15 = j10 & ZipKt.f225990j;
                long j16 = j11 & ZipKt.f225990j;
                long jTimes2ToThe32Mod = (j13 * j16) + times2ToThe32Mod(j13 * j14, j12);
                if (jTimes2ToThe32Mod < 0) {
                    jTimes2ToThe32Mod = UnsignedLongs.remainder(jTimes2ToThe32Mod, j12);
                }
                Long.signum(j15);
                return plusMod(times2ToThe32Mod((j14 * j15) + jTimes2ToThe32Mod, j12), UnsignedLongs.remainder(j15 * j16, j12), j12);
            }

            @Override // com.google.common.math.LongMath.MillerRabinTester
            public long squareMod(long j10, long j11) {
                long j12 = j10 >>> 32;
                long j13 = j10 & ZipKt.f225990j;
                long jTimes2ToThe32Mod = times2ToThe32Mod(j12 * j12, j11);
                long jRemainder = j12 * j13 * 2;
                if (jRemainder < 0) {
                    jRemainder = UnsignedLongs.remainder(jRemainder, j11);
                }
                return plusMod(times2ToThe32Mod(jTimes2ToThe32Mod + jRemainder, j11), UnsignedLongs.remainder(j13 * j13, j11), j11);
            }
        };

        private long powMod(long j10, long j11, long j12) {
            long jSquareMod = j10;
            long jMulMod = 1;
            while (j11 != 0) {
                long j13 = j12;
                if ((j11 & 1) != 0) {
                    jMulMod = mulMod(jMulMod, jSquareMod, j13);
                }
                jSquareMod = squareMod(jSquareMod, j13);
                j11 >>= 1;
                j12 = j13;
            }
            return jMulMod;
        }

        public static boolean test(long j10, long j11) {
            return (j11 <= LongMath.FLOOR_SQRT_MAX_LONG ? SMALL : LARGE).testWitness(j10, j11);
        }

        private boolean testWitness(long j10, long j11) {
            long j12 = j11 - 1;
            int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j12);
            long j13 = j12 >> iNumberOfTrailingZeros;
            long j14 = j10 % j11;
            if (j14 == 0) {
                return true;
            }
            long jPowMod = powMod(j14, j13, j11);
            if (jPowMod == 1) {
                return true;
            }
            int i10 = 0;
            while (jPowMod != j12) {
                i10++;
                if (i10 == iNumberOfTrailingZeros) {
                    return false;
                }
                jPowMod = squareMod(jPowMod, j11);
            }
            return true;
        }

        public abstract long mulMod(long j10, long j11, long j12);

        public abstract long squareMod(long j10, long j11);

        /* synthetic */ MillerRabinTester(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    private LongMath() {
    }

    public static long binomial(int i10, int i11) {
        MathPreconditions.checkNonNegative("n", i10);
        MathPreconditions.checkNonNegative("k", i11);
        Preconditions.checkArgument(i11 <= i10, "k (%s) > n (%s)", i11, i10);
        if (i11 > (i10 >> 1)) {
            i11 = i10 - i11;
        }
        long jMultiplyFraction = 1;
        if (i11 == 0) {
            return 1L;
        }
        if (i11 == 1) {
            return i10;
        }
        long[] jArr = factorials;
        if (i10 < jArr.length) {
            return jArr[i10] / (jArr[i11] * jArr[i10 - i11]);
        }
        int[] iArr = biggestBinomials;
        if (i11 >= iArr.length || i10 > iArr[i11]) {
            return Long.MAX_VALUE;
        }
        int[] iArr2 = biggestSimpleBinomials;
        if (i11 < iArr2.length && i10 <= iArr2[i11]) {
            int i12 = i10 - 1;
            long j10 = i10;
            for (int i13 = 2; i13 <= i11; i13++) {
                j10 = (j10 * ((long) i12)) / ((long) i13);
                i12--;
            }
            return j10;
        }
        long j11 = i10;
        int iLog2 = log2(j11, RoundingMode.CEILING);
        int i14 = i10 - 1;
        int i15 = iLog2;
        int i16 = 2;
        long j12 = j11;
        long j13 = 1;
        while (i16 <= i11) {
            i15 += iLog2;
            if (i15 < 63) {
                j12 *= (long) i14;
                j13 *= (long) i16;
            } else {
                jMultiplyFraction = multiplyFraction(jMultiplyFraction, j12, j13);
                j12 = i14;
                j13 = i16;
                i15 = iLog2;
            }
            i16++;
            i14--;
        }
        return multiplyFraction(jMultiplyFraction, j12, j13);
    }

    @Beta
    public static long ceilingPowerOfTwo(long j10) {
        MathPreconditions.checkPositive("x", j10);
        if (j10 <= 4611686018427387904L) {
            return 1 << (-Long.numberOfLeadingZeros(j10 - 1));
        }
        StringBuilder sb2 = new StringBuilder(70);
        sb2.append("ceilingPowerOfTwo(");
        sb2.append(j10);
        sb2.append(") is not representable as a long");
        throw new ArithmeticException(sb2.toString());
    }

    @GwtIncompatible
    public static long checkedAdd(long j10, long j11) {
        long j12 = j10 + j11;
        MathPreconditions.checkNoOverflow(((j10 ^ j11) < 0) | ((j10 ^ j12) >= 0), "checkedAdd", j10, j11);
        return j12;
    }

    public static long checkedMultiply(long j10, long j11) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(~j11) + Long.numberOfLeadingZeros(j11) + Long.numberOfLeadingZeros(~j10) + Long.numberOfLeadingZeros(j10);
        if (iNumberOfLeadingZeros > 65) {
            return j10 * j11;
        }
        MathPreconditions.checkNoOverflow(iNumberOfLeadingZeros >= 64, "checkedMultiply", j10, j11);
        MathPreconditions.checkNoOverflow((j10 >= 0) | (j11 != Long.MIN_VALUE), "checkedMultiply", j10, j11);
        long j12 = j10 * j11;
        MathPreconditions.checkNoOverflow(j10 == 0 || j12 / j10 == j11, "checkedMultiply", j10, j11);
        return j12;
    }

    @GwtIncompatible
    public static long checkedPow(long j10, int i10) {
        int i11 = i10;
        MathPreconditions.checkNonNegative("exponent", i11);
        long jCheckedMultiply = 1;
        if (!(j10 >= -2) || !(j10 <= 2)) {
            long j11 = j10;
            while (i11 != 0) {
                if (i11 == 1) {
                    return checkedMultiply(jCheckedMultiply, j11);
                }
                if ((i11 & 1) != 0) {
                    jCheckedMultiply = checkedMultiply(jCheckedMultiply, j11);
                }
                i11 >>= 1;
                if (i11 > 0) {
                    MathPreconditions.checkNoOverflow(-3037000499L <= j11 && j11 <= FLOOR_SQRT_MAX_LONG, "checkedPow", j11, i11);
                    j11 *= j11;
                }
            }
            return jCheckedMultiply;
        }
        int i12 = (int) j10;
        if (i12 == -2) {
            MathPreconditions.checkNoOverflow(i11 < 64, "checkedPow", j10, i11);
            return (i11 & 1) == 0 ? 1 << i11 : (-1) << i11;
        }
        if (i12 == -1) {
            return (i11 & 1) == 0 ? 1L : -1L;
        }
        if (i12 == 0) {
            return i11 == 0 ? 1L : 0L;
        }
        if (i12 == 1) {
            return 1L;
        }
        if (i12 != 2) {
            throw new AssertionError();
        }
        MathPreconditions.checkNoOverflow(i11 < 63, "checkedPow", j10, i11);
        return 1 << i11;
    }

    @GwtIncompatible
    public static long checkedSubtract(long j10, long j11) {
        long j12 = j10 - j11;
        MathPreconditions.checkNoOverflow(((j10 ^ j11) >= 0) | ((j10 ^ j12) >= 0), "checkedSubtract", j10, j11);
        return j12;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @GwtIncompatible
    public static long divide(long j10, long j11, RoundingMode roundingMode) {
        Preconditions.checkNotNull(roundingMode);
        long j12 = j10 / j11;
        long j13 = j10 - (j11 * j12);
        if (j13 == 0) {
            return j12;
        }
        int i10 = ((int) ((j10 ^ j11) >> 63)) | 1;
        switch (AnonymousClass1.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(j13 == 0);
                return j12;
            case 2:
                return j12;
            case 3:
                if (i10 >= 0) {
                    return j12;
                }
                return j12 + ((long) i10);
            case 4:
                return j12 + ((long) i10);
            case 5:
                if (i10 <= 0) {
                    return j12;
                }
                return j12 + ((long) i10);
            case 6:
            case 7:
            case 8:
                long jAbs = Math.abs(j13);
                long jAbs2 = jAbs - (Math.abs(j11) - jAbs);
                if (jAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j12) == 0)) {
                        return j12;
                    }
                } else if (jAbs2 <= 0) {
                    return j12;
                }
                return j12 + ((long) i10);
            default:
                throw new AssertionError();
        }
    }

    @GwtIncompatible
    public static long factorial(int i10) {
        MathPreconditions.checkNonNegative("n", i10);
        long[] jArr = factorials;
        if (i10 < jArr.length) {
            return jArr[i10];
        }
        return Long.MAX_VALUE;
    }

    public static boolean fitsInInt(long j10) {
        return ((long) ((int) j10)) == j10;
    }

    @Beta
    public static long floorPowerOfTwo(long j10) {
        MathPreconditions.checkPositive("x", j10);
        return 1 << (63 - Long.numberOfLeadingZeros(j10));
    }

    public static long gcd(long j10, long j11) {
        MathPreconditions.checkNonNegative("a", j10);
        MathPreconditions.checkNonNegative(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, j11);
        if (j10 == 0) {
            return j11;
        }
        if (j11 == 0) {
            return j10;
        }
        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j10);
        long jNumberOfTrailingZeros = j10 >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(j11);
        long j12 = j11 >> iNumberOfTrailingZeros2;
        while (jNumberOfTrailingZeros != j12) {
            long j13 = jNumberOfTrailingZeros - j12;
            long j14 = (j13 >> 63) & j13;
            long j15 = (j13 - j14) - j14;
            j12 += j14;
            jNumberOfTrailingZeros = j15 >> Long.numberOfTrailingZeros(j15);
        }
        return jNumberOfTrailingZeros << Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros2);
    }

    public static boolean isPowerOfTwo(long j10) {
        return (j10 > 0) & ((j10 & (j10 - 1)) == 0);
    }

    @Beta
    @GwtIncompatible
    public static boolean isPrime(long j10) {
        if (j10 < 2) {
            MathPreconditions.checkNonNegative("n", j10);
            return false;
        }
        if (j10 < 66) {
            return ((722865708377213483 >> (((int) j10) + (-2))) & 1) != 0;
        }
        if (((1 << ((int) (j10 % 30))) & SIEVE_30) != 0 || j10 % 7 == 0 || j10 % 11 == 0 || j10 % 13 == 0) {
            return false;
        }
        if (j10 < 289) {
            return true;
        }
        for (long[] jArr : millerRabinBaseSets) {
            if (j10 <= jArr[0]) {
                for (int i10 = 1; i10 < jArr.length; i10++) {
                    if (!MillerRabinTester.test(jArr[i10], j10)) {
                        return false;
                    }
                }
                return true;
            }
        }
        throw new AssertionError();
    }

    @VisibleForTesting
    public static int lessThanBranchFree(long j10, long j11) {
        return (int) ((~(~(j10 - j11))) >>> 63);
    }

    @GwtIncompatible
    public static int log10(long j10, RoundingMode roundingMode) {
        int iLessThanBranchFree;
        MathPreconditions.checkPositive("x", j10);
        int iLog10Floor = log10Floor(j10);
        long j11 = powersOf10[iLog10Floor];
        switch (AnonymousClass1.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(j10 == j11);
                return iLog10Floor;
            case 2:
            case 3:
                return iLog10Floor;
            case 4:
            case 5:
                iLessThanBranchFree = lessThanBranchFree(j11, j10);
                break;
            case 6:
            case 7:
            case 8:
                iLessThanBranchFree = lessThanBranchFree(halfPowersOf10[iLog10Floor], j10);
                break;
            default:
                throw new AssertionError();
        }
        return iLessThanBranchFree + iLog10Floor;
    }

    @GwtIncompatible
    public static int log10Floor(long j10) {
        byte b10 = maxLog10ForLeadingZeros[Long.numberOfLeadingZeros(j10)];
        return b10 - lessThanBranchFree(j10, powersOf10[b10]);
    }

    public static int log2(long j10, RoundingMode roundingMode) {
        MathPreconditions.checkPositive("x", j10);
        switch (AnonymousClass1.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(isPowerOfTwo(j10));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 64 - Long.numberOfLeadingZeros(j10 - 1);
            case 6:
            case 7:
            case 8:
                int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j10);
                return lessThanBranchFree(MAX_POWER_OF_SQRT2_UNSIGNED >>> iNumberOfLeadingZeros, j10) + (63 - iNumberOfLeadingZeros);
            default:
                throw new AssertionError("impossible");
        }
        return 63 - Long.numberOfLeadingZeros(j10);
    }

    public static long mean(long j10, long j11) {
        return (j10 & j11) + ((j10 ^ j11) >> 1);
    }

    @GwtIncompatible
    public static int mod(long j10, int i10) {
        return (int) mod(j10, i10);
    }

    public static long multiplyFraction(long j10, long j11, long j12) {
        if (j10 == 1) {
            return j11 / j12;
        }
        long jGcd = gcd(j10, j12);
        return (j11 / (j12 / jGcd)) * (j10 / jGcd);
    }

    @GwtIncompatible
    public static long pow(long j10, int i10) {
        MathPreconditions.checkNonNegative("exponent", i10);
        if (-2 > j10 || j10 > 2) {
            long j11 = 1;
            while (i10 != 0) {
                if (i10 == 1) {
                    return j11 * j10;
                }
                j11 *= (i10 & 1) == 0 ? 1L : j10;
                j10 *= j10;
                i10 >>= 1;
            }
            return j11;
        }
        int i11 = (int) j10;
        if (i11 == -2) {
            if (i10 < 64) {
                return (i10 & 1) == 0 ? 1 << i10 : -(1 << i10);
            }
            return 0L;
        }
        if (i11 == -1) {
            return (i10 & 1) == 0 ? 1L : -1L;
        }
        if (i11 == 0) {
            return i10 == 0 ? 1L : 0L;
        }
        if (i11 == 1) {
            return 1L;
        }
        if (i11 != 2) {
            throw new AssertionError();
        }
        if (i10 < 64) {
            return 1 << i10;
        }
        return 0L;
    }

    @GwtIncompatible
    public static double roundToDouble(long j10, RoundingMode roundingMode) {
        long j11;
        double dNextUp;
        long jCeil;
        double d10 = j10;
        long j12 = (long) d10;
        int iCompare = j12 == Long.MAX_VALUE ? -1 : Longs.compare(j10, j12);
        int[] iArr = AnonymousClass1.$SwitchMap$java$math$RoundingMode;
        switch (iArr[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(iCompare == 0);
                return d10;
            case 2:
                if (j10 >= 0) {
                    if (iCompare < 0) {
                        return DoubleUtils.nextDown(d10);
                    }
                } else if (iCompare > 0) {
                    return Math.nextUp(d10);
                }
                return d10;
            case 3:
                if (iCompare < 0) {
                    return DoubleUtils.nextDown(d10);
                }
                return d10;
            case 4:
                if (j10 >= 0) {
                    if (iCompare > 0) {
                        return Math.nextUp(d10);
                    }
                } else if (iCompare < 0) {
                    return DoubleUtils.nextDown(d10);
                }
                return d10;
            case 5:
                if (iCompare > 0) {
                    return Math.nextUp(d10);
                }
                return d10;
            case 6:
            case 7:
            case 8:
                if (iCompare >= 0) {
                    dNextUp = Math.nextUp(d10);
                    j11 = Long.MAX_VALUE;
                    jCeil = (long) Math.ceil(dNextUp);
                } else {
                    j11 = Long.MAX_VALUE;
                    double dNextDown = DoubleUtils.nextDown(d10);
                    long jFloor = (long) Math.floor(dNextDown);
                    dNextUp = d10;
                    d10 = dNextDown;
                    jCeil = j12;
                    j12 = jFloor;
                }
                long j13 = j10 - j12;
                long j14 = jCeil - j10;
                if (jCeil == j11) {
                    j14++;
                }
                int iCompare2 = Longs.compare(j13, j14);
                if (iCompare2 >= 0) {
                    if (iCompare2 <= 0) {
                        int i10 = iArr[roundingMode.ordinal()];
                        if (i10 != 6) {
                            if (i10 != 7) {
                                if (i10 != 8) {
                                    throw new AssertionError("impossible");
                                }
                                if ((DoubleUtils.getSignificand(d10) & 1) == 0) {
                                }
                            } else if (j10 >= 0) {
                            }
                        } else if (j10 >= 0) {
                        }
                    }
                    return dNextUp;
                }
                return d10;
            default:
                throw new AssertionError("impossible");
        }
    }

    @Beta
    public static long saturatedAdd(long j10, long j11) {
        long j12 = j10 + j11;
        return (((j11 ^ j10) > 0L ? 1 : ((j11 ^ j10) == 0L ? 0 : -1)) < 0) | ((j10 ^ j12) >= 0) ? j12 : ((j12 >>> 63) ^ 1) + Long.MAX_VALUE;
    }

    @Beta
    public static long saturatedMultiply(long j10, long j11) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(~j11) + Long.numberOfLeadingZeros(j11) + Long.numberOfLeadingZeros(~j10) + Long.numberOfLeadingZeros(j10);
        if (iNumberOfLeadingZeros > 65) {
            return j10 * j11;
        }
        long j12 = ((j10 ^ j11) >>> 63) + Long.MAX_VALUE;
        if (!((iNumberOfLeadingZeros < 64) | ((j11 == Long.MIN_VALUE) & (j10 < 0)))) {
            long j13 = j10 * j11;
            if (j10 == 0 || j13 / j10 == j11) {
                return j13;
            }
        }
        return j12;
    }

    @Beta
    public static long saturatedPow(long j10, int i10) {
        MathPreconditions.checkNonNegative("exponent", i10);
        long jSaturatedMultiply = 1;
        if (!(j10 >= -2) || !(j10 <= 2)) {
            long j11 = ((j10 >>> 63) & ((long) (i10 & 1))) + Long.MAX_VALUE;
            while (i10 != 0) {
                if (i10 == 1) {
                    return saturatedMultiply(jSaturatedMultiply, j10);
                }
                if ((i10 & 1) != 0) {
                    jSaturatedMultiply = saturatedMultiply(jSaturatedMultiply, j10);
                }
                i10 >>= 1;
                if (i10 > 0) {
                    if ((-3037000499L > j10) || (j10 > FLOOR_SQRT_MAX_LONG)) {
                        return j11;
                    }
                    j10 *= j10;
                }
            }
            return jSaturatedMultiply;
        }
        int i11 = (int) j10;
        if (i11 == -2) {
            return i10 >= 64 ? ((long) (i10 & 1)) + Long.MAX_VALUE : (i10 & 1) == 0 ? 1 << i10 : (-1) << i10;
        }
        if (i11 == -1) {
            return (i10 & 1) == 0 ? 1L : -1L;
        }
        if (i11 == 0) {
            return i10 == 0 ? 1L : 0L;
        }
        if (i11 == 1) {
            return 1L;
        }
        if (i11 != 2) {
            throw new AssertionError();
        }
        if (i10 >= 63) {
            return Long.MAX_VALUE;
        }
        return 1 << i10;
    }

    @Beta
    public static long saturatedSubtract(long j10, long j11) {
        long j12 = j10 - j11;
        return (((j11 ^ j10) > 0L ? 1 : ((j11 ^ j10) == 0L ? 0 : -1)) >= 0) | ((j10 ^ j12) >= 0) ? j12 : ((j12 >>> 63) ^ 1) + Long.MAX_VALUE;
    }

    @GwtIncompatible
    public static long sqrt(long j10, RoundingMode roundingMode) {
        MathPreconditions.checkNonNegative("x", j10);
        if (fitsInInt(j10)) {
            return IntMath.sqrt((int) j10, roundingMode);
        }
        long jSqrt = (long) Math.sqrt(j10);
        long j11 = jSqrt * jSqrt;
        switch (AnonymousClass1.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(j11 == j10);
                return jSqrt;
            case 2:
            case 3:
                return j10 < j11 ? jSqrt - 1 : jSqrt;
            case 4:
            case 5:
                return j10 > j11 ? jSqrt + 1 : jSqrt;
            case 6:
            case 7:
            case 8:
                long j12 = jSqrt - ((long) (j10 < j11 ? 1 : 0));
                return j12 + ((long) lessThanBranchFree((j12 * j12) + j12, j10));
            default:
                throw new AssertionError();
        }
    }

    @GwtIncompatible
    public static long mod(long j10, long j11) {
        if (j11 <= 0) {
            throw new ArithmeticException("Modulus must be positive");
        }
        long j12 = j10 % j11;
        return j12 >= 0 ? j12 : j12 + j11;
    }
}
