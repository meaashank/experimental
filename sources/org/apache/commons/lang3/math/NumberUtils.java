package org.apache.commons.lang3.math;

import java.math.BigDecimal;
import java.math.BigInteger;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes6.dex */
public class NumberUtils {
    public static final Long LONG_ZERO = new Long(0);
    public static final Long LONG_ONE = new Long(1);
    public static final Long LONG_MINUS_ONE = new Long(-1);
    public static final Integer INTEGER_ZERO = new Integer(0);
    public static final Integer INTEGER_ONE = new Integer(1);
    public static final Integer INTEGER_MINUS_ONE = new Integer(-1);
    public static final Short SHORT_ZERO = new Short((short) 0);
    public static final Short SHORT_ONE = new Short((short) 1);
    public static final Short SHORT_MINUS_ONE = new Short((short) -1);
    public static final Byte BYTE_ZERO = (byte) 0;
    public static final Byte BYTE_ONE = (byte) 1;
    public static final Byte BYTE_MINUS_ONE = (byte) -1;
    public static final Double DOUBLE_ZERO = new Double(0.0d);
    public static final Double DOUBLE_ONE = new Double(1.0d);
    public static final Double DOUBLE_MINUS_ONE = new Double(-1.0d);
    public static final Float FLOAT_ZERO = new Float(0.0f);
    public static final Float FLOAT_ONE = new Float(1.0f);
    public static final Float FLOAT_MINUS_ONE = new Float(-1.0f);

    public static BigDecimal createBigDecimal(String str) {
        if (str == null) {
            return null;
        }
        if (StringUtils.isBlank(str)) {
            throw new NumberFormatException("A blank string is not a valid number");
        }
        return new BigDecimal(str);
    }

    public static BigInteger createBigInteger(String str) {
        if (str == null) {
            return null;
        }
        return new BigInteger(str);
    }

    public static Double createDouble(String str) {
        if (str == null) {
            return null;
        }
        return Double.valueOf(str);
    }

    public static Float createFloat(String str) {
        if (str == null) {
            return null;
        }
        return Float.valueOf(str);
    }

    public static Integer createInteger(String str) {
        if (str == null) {
            return null;
        }
        return Integer.decode(str);
    }

    public static Long createLong(String str) {
        if (str == null) {
            return null;
        }
        return Long.valueOf(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00cc, code lost:
    
        if (r1 == 'l') goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0113 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0108 A[Catch: NumberFormatException -> 0x0113, TRY_LEAVE, TryCatch #2 {NumberFormatException -> 0x0113, blocks: (B:73:0x00fe, B:75:0x0108), top: B:138:0x00fe }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x011d A[Catch: NumberFormatException -> 0x0129, TRY_LEAVE, TryCatch #7 {NumberFormatException -> 0x0129, blocks: (B:80:0x0113, B:82:0x011d), top: B:147:0x0113 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Number createNumber(java.lang.String r15) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instruction units count: 424
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.lang3.math.NumberUtils.createNumber(java.lang.String):java.lang.Number");
    }

    private static boolean isAllZeros(String str) {
        if (str == null) {
            return true;
        }
        for (int length = str.length() - 1; length >= 0; length--) {
            if (str.charAt(length) != '0') {
                return false;
            }
        }
        return str.length() > 0;
    }

    public static boolean isDigits(String str) {
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        for (int i10 = 0; i10 < str.length(); i10++) {
            if (!Character.isDigit(str.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x00b8, code lost:
    
        return r16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean isNumber(java.lang.String r17) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.lang3.math.NumberUtils.isNumber(java.lang.String):boolean");
    }

    public static byte max(byte b10, byte b11, byte b12) {
        if (b11 > b10) {
            b10 = b11;
        }
        return b12 > b10 ? b12 : b10;
    }

    public static byte min(byte b10, byte b11, byte b12) {
        if (b11 < b10) {
            b10 = b11;
        }
        return b12 < b10 ? b12 : b10;
    }

    public static byte toByte(String str) {
        return toByte(str, (byte) 0);
    }

    public static double toDouble(String str) {
        return toDouble(str, 0.0d);
    }

    public static float toFloat(String str) {
        return toFloat(str, 0.0f);
    }

    public static int toInt(String str) {
        return toInt(str, 0);
    }

    public static long toLong(String str) {
        return toLong(str, 0L);
    }

    public static short toShort(String str) {
        return toShort(str, (short) 0);
    }

    public static int max(int i10, int i11, int i12) {
        if (i11 > i10) {
            i10 = i11;
        }
        return i12 > i10 ? i12 : i10;
    }

    public static int min(int i10, int i11, int i12) {
        if (i11 < i10) {
            i10 = i11;
        }
        return i12 < i10 ? i12 : i10;
    }

    public static byte toByte(String str, byte b10) {
        if (str == null) {
            return b10;
        }
        try {
            return Byte.parseByte(str);
        } catch (NumberFormatException unused) {
            return b10;
        }
    }

    public static double toDouble(String str, double d10) {
        if (str == null) {
            return d10;
        }
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException unused) {
            return d10;
        }
    }

    public static float toFloat(String str, float f10) {
        if (str == null) {
            return f10;
        }
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException unused) {
            return f10;
        }
    }

    public static int toInt(String str, int i10) {
        if (str == null) {
            return i10;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i10;
        }
    }

    public static long toLong(String str, long j10) {
        if (str == null) {
            return j10;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j10;
        }
    }

    public static short toShort(String str, short s10) {
        if (str == null) {
            return s10;
        }
        try {
            return Short.parseShort(str);
        } catch (NumberFormatException unused) {
            return s10;
        }
    }

    public static long max(long j10, long j11, long j12) {
        if (j11 > j10) {
            j10 = j11;
        }
        return j12 > j10 ? j12 : j10;
    }

    public static long min(long j10, long j11, long j12) {
        if (j11 < j10) {
            j10 = j11;
        }
        return j12 < j10 ? j12 : j10;
    }

    public static short max(short s10, short s11, short s12) {
        if (s11 > s10) {
            s10 = s11;
        }
        return s12 > s10 ? s12 : s10;
    }

    public static short min(short s10, short s11, short s12) {
        if (s11 < s10) {
            s10 = s11;
        }
        return s12 < s10 ? s12 : s10;
    }

    public static long max(long[] jArr) {
        if (jArr != null) {
            if (jArr.length != 0) {
                long j10 = jArr[0];
                for (int i10 = 1; i10 < jArr.length; i10++) {
                    long j11 = jArr[i10];
                    if (j11 > j10) {
                        j10 = j11;
                    }
                }
                return j10;
            }
            throw new IllegalArgumentException("Array cannot be empty.");
        }
        throw new IllegalArgumentException("The Array must not be null");
    }

    public static long min(long[] jArr) {
        if (jArr != null) {
            if (jArr.length != 0) {
                long j10 = jArr[0];
                for (int i10 = 1; i10 < jArr.length; i10++) {
                    long j11 = jArr[i10];
                    if (j11 < j10) {
                        j10 = j11;
                    }
                }
                return j10;
            }
            throw new IllegalArgumentException("Array cannot be empty.");
        }
        throw new IllegalArgumentException("The Array must not be null");
    }

    public static int max(int[] iArr) {
        if (iArr != null) {
            if (iArr.length != 0) {
                int i10 = iArr[0];
                for (int i11 = 1; i11 < iArr.length; i11++) {
                    int i12 = iArr[i11];
                    if (i12 > i10) {
                        i10 = i12;
                    }
                }
                return i10;
            }
            throw new IllegalArgumentException("Array cannot be empty.");
        }
        throw new IllegalArgumentException("The Array must not be null");
    }

    public static int min(int[] iArr) {
        if (iArr != null) {
            if (iArr.length != 0) {
                int i10 = iArr[0];
                for (int i11 = 1; i11 < iArr.length; i11++) {
                    int i12 = iArr[i11];
                    if (i12 < i10) {
                        i10 = i12;
                    }
                }
                return i10;
            }
            throw new IllegalArgumentException("Array cannot be empty.");
        }
        throw new IllegalArgumentException("The Array must not be null");
    }

    public static short max(short[] sArr) {
        if (sArr != null) {
            if (sArr.length != 0) {
                short s10 = sArr[0];
                for (int i10 = 1; i10 < sArr.length; i10++) {
                    short s11 = sArr[i10];
                    if (s11 > s10) {
                        s10 = s11;
                    }
                }
                return s10;
            }
            throw new IllegalArgumentException("Array cannot be empty.");
        }
        throw new IllegalArgumentException("The Array must not be null");
    }

    public static short min(short[] sArr) {
        if (sArr != null) {
            if (sArr.length != 0) {
                short s10 = sArr[0];
                for (int i10 = 1; i10 < sArr.length; i10++) {
                    short s11 = sArr[i10];
                    if (s11 < s10) {
                        s10 = s11;
                    }
                }
                return s10;
            }
            throw new IllegalArgumentException("Array cannot be empty.");
        }
        throw new IllegalArgumentException("The Array must not be null");
    }

    public static byte max(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length != 0) {
                byte b10 = bArr[0];
                for (int i10 = 1; i10 < bArr.length; i10++) {
                    byte b11 = bArr[i10];
                    if (b11 > b10) {
                        b10 = b11;
                    }
                }
                return b10;
            }
            throw new IllegalArgumentException("Array cannot be empty.");
        }
        throw new IllegalArgumentException("The Array must not be null");
    }

    public static byte min(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length != 0) {
                byte b10 = bArr[0];
                for (int i10 = 1; i10 < bArr.length; i10++) {
                    byte b11 = bArr[i10];
                    if (b11 < b10) {
                        b10 = b11;
                    }
                }
                return b10;
            }
            throw new IllegalArgumentException("Array cannot be empty.");
        }
        throw new IllegalArgumentException("The Array must not be null");
    }

    public static double max(double[] dArr) {
        if (dArr != null) {
            if (dArr.length != 0) {
                double d10 = dArr[0];
                for (int i10 = 1; i10 < dArr.length; i10++) {
                    if (Double.isNaN(dArr[i10])) {
                        return Double.NaN;
                    }
                    double d11 = dArr[i10];
                    if (d11 > d10) {
                        d10 = d11;
                    }
                }
                return d10;
            }
            throw new IllegalArgumentException("Array cannot be empty.");
        }
        throw new IllegalArgumentException("The Array must not be null");
    }

    public static double min(double[] dArr) {
        if (dArr != null) {
            if (dArr.length != 0) {
                double d10 = dArr[0];
                for (int i10 = 1; i10 < dArr.length; i10++) {
                    if (Double.isNaN(dArr[i10])) {
                        return Double.NaN;
                    }
                    double d11 = dArr[i10];
                    if (d11 < d10) {
                        d10 = d11;
                    }
                }
                return d10;
            }
            throw new IllegalArgumentException("Array cannot be empty.");
        }
        throw new IllegalArgumentException("The Array must not be null");
    }

    public static float max(float[] fArr) {
        if (fArr != null) {
            if (fArr.length != 0) {
                float f10 = fArr[0];
                for (int i10 = 1; i10 < fArr.length; i10++) {
                    if (Float.isNaN(fArr[i10])) {
                        return Float.NaN;
                    }
                    float f11 = fArr[i10];
                    if (f11 > f10) {
                        f10 = f11;
                    }
                }
                return f10;
            }
            throw new IllegalArgumentException("Array cannot be empty.");
        }
        throw new IllegalArgumentException("The Array must not be null");
    }

    public static float min(float[] fArr) {
        if (fArr != null) {
            if (fArr.length != 0) {
                float f10 = fArr[0];
                for (int i10 = 1; i10 < fArr.length; i10++) {
                    if (Float.isNaN(fArr[i10])) {
                        return Float.NaN;
                    }
                    float f11 = fArr[i10];
                    if (f11 < f10) {
                        f10 = f11;
                    }
                }
                return f10;
            }
            throw new IllegalArgumentException("Array cannot be empty.");
        }
        throw new IllegalArgumentException("The Array must not be null");
    }

    public static double max(double d10, double d11, double d12) {
        return Math.max(Math.max(d10, d11), d12);
    }

    public static double min(double d10, double d11, double d12) {
        return Math.min(Math.min(d10, d11), d12);
    }

    public static float max(float f10, float f11, float f12) {
        return Math.max(Math.max(f10, f11), f12);
    }

    public static float min(float f10, float f11, float f12) {
        return Math.min(Math.min(f10, f11), f12);
    }
}
