package kotlin.text;

import kotlin.InterfaceC4887e0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public class E extends D {
    @NotNull
    public static final Void o1(@NotNull String input) {
        kotlin.jvm.internal.G.p(input, "input");
        throw new NumberFormatException("Invalid number format: '" + input + '\'');
    }

    @InterfaceC4887e0(version = "1.1")
    @Nullable
    public static final Byte p1(@NotNull String str) {
        kotlin.jvm.internal.G.p(str, "<this>");
        return q1(str, 10);
    }

    @InterfaceC4887e0(version = "1.1")
    @Nullable
    public static final Byte q1(@NotNull String str, int i10) {
        int iIntValue;
        kotlin.jvm.internal.G.p(str, "<this>");
        Integer numS1 = s1(str, i10);
        if (numS1 == null || (iIntValue = numS1.intValue()) < -128 || iIntValue > 127) {
            return null;
        }
        return Byte.valueOf((byte) iIntValue);
    }

    @InterfaceC4887e0(version = "1.1")
    @Nullable
    public static Integer r1(@NotNull String str) {
        kotlin.jvm.internal.G.p(str, "<this>");
        return s1(str, 10);
    }

    @InterfaceC4887e0(version = "1.1")
    @Nullable
    public static final Integer s1(@NotNull String str, int i10) {
        boolean z10;
        int i11;
        int i12;
        kotlin.jvm.internal.G.p(str, "<this>");
        C5011c.a(i10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i13 = 0;
        char cCharAt = str.charAt(0);
        int i14 = -2147483647;
        if (kotlin.jvm.internal.G.t(cCharAt, 48) < 0) {
            i11 = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z10 = false;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                i14 = Integer.MIN_VALUE;
                z10 = true;
            }
        } else {
            z10 = false;
            i11 = 0;
        }
        int i15 = -59652323;
        while (i11 < length) {
            int iDigit = Character.digit((int) str.charAt(i11), i10);
            if (iDigit < 0) {
                return null;
            }
            if ((i13 < i15 && (i15 != -59652323 || i13 < (i15 = i14 / i10))) || (i12 = i13 * i10) < i14 + iDigit) {
                return null;
            }
            i13 = i12 - iDigit;
            i11++;
        }
        return z10 ? Integer.valueOf(i13) : Integer.valueOf(-i13);
    }

    @InterfaceC4887e0(version = "1.1")
    @Nullable
    public static Long t1(@NotNull String str) {
        kotlin.jvm.internal.G.p(str, "<this>");
        return u1(str, 10);
    }

    @InterfaceC4887e0(version = "1.1")
    @Nullable
    public static final Long u1(@NotNull String str, int i10) {
        boolean z10;
        kotlin.jvm.internal.G.p(str, "<this>");
        C5011c.a(i10);
        int length = str.length();
        Long l10 = null;
        if (length == 0) {
            return null;
        }
        int i11 = 0;
        char cCharAt = str.charAt(0);
        long j10 = -9223372036854775807L;
        if (kotlin.jvm.internal.G.t(cCharAt, 48) < 0) {
            z10 = true;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z10 = false;
                i11 = 1;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                j10 = Long.MIN_VALUE;
                i11 = 1;
            }
        } else {
            z10 = false;
        }
        long j11 = 0;
        long j12 = -256204778801521550L;
        while (i11 < length) {
            int iDigit = Character.digit((int) str.charAt(i11), i10);
            if (iDigit < 0) {
                return l10;
            }
            if (j11 < j12) {
                if (j12 != -256204778801521550L) {
                    return l10;
                }
                j12 = j10 / ((long) i10);
                if (j11 < j12) {
                    return l10;
                }
            }
            Long l11 = l10;
            int i12 = i11;
            long j13 = j11 * ((long) i10);
            long j14 = iDigit;
            if (j13 < j10 + j14) {
                return l11;
            }
            j11 = j13 - j14;
            i11 = i12 + 1;
            l10 = l11;
        }
        return z10 ? Long.valueOf(j11) : Long.valueOf(-j11);
    }

    @InterfaceC4887e0(version = "1.1")
    @Nullable
    public static final Short v1(@NotNull String str) {
        kotlin.jvm.internal.G.p(str, "<this>");
        return w1(str, 10);
    }

    @InterfaceC4887e0(version = "1.1")
    @Nullable
    public static final Short w1(@NotNull String str, int i10) {
        int iIntValue;
        kotlin.jvm.internal.G.p(str, "<this>");
        Integer numS1 = s1(str, i10);
        if (numS1 == null || (iIntValue = numS1.intValue()) < -32768 || iIntValue > 32767) {
            return null;
        }
        return Short.valueOf((short) iIntValue);
    }
}
