package org.javia.arity;

import com.prism.gaia.download.a;
import org.objectweb.asm.signature.SignatureVisitor;

/* JADX INFO: loaded from: classes6.dex */
public class Util {
    public static final int FLOAT_PRECISION = -1;
    public static final int LEN_UNLIMITED = 100;

    public static String complexToString(Complex complex, int i10, int i11) {
        int i12;
        int i13;
        if (complex.im == 0.0d) {
            return doubleToString(complex.re, i10, i11);
        }
        if (complex.isNaN()) {
            return "NaN";
        }
        double d10 = complex.re;
        double d11 = complex.im;
        if (complex.isInfinite()) {
            if (!Double.isInfinite(d10)) {
                d10 = 0.0d;
            } else if (!Double.isInfinite(d11)) {
                d11 = 0.0d;
            }
        }
        if (d11 == 0.0d) {
            return doubleToString(d10, i10, i11);
        }
        boolean z10 = d10 != 0.0d && d11 >= 0.0d;
        String strDoubleToString = d10 == 0.0d ? "" : doubleToString(d10, i11);
        String strDoubleToString2 = doubleToString(d11, i11);
        String str = Double.isInfinite(d11) ? "*" : "";
        if (strDoubleToString2.equals("1")) {
            strDoubleToString2 = "";
        }
        if (strDoubleToString2.equals("-1")) {
            strDoubleToString2 = a.f164606q;
        }
        if (i10 != 100) {
            int i14 = i10 - 1;
            if (z10) {
                i14 = i10 - 2;
            }
            int length = i14 - str.length();
            int length2 = strDoubleToString.length();
            int length3 = strDoubleToString2.length();
            int i15 = (length2 + length3) - length;
            if (i15 > 0) {
                int iAbs = Math.abs(length2 - length3);
                int i16 = i15 > iAbs ? (i15 - iAbs) / 2 : 0;
                int iMin = Math.min(i15, iAbs) + i16;
                if (length2 > length3) {
                    i12 = length2 - iMin;
                    i13 = length3 - i16;
                } else {
                    i12 = length2 - i16;
                    i13 = length3 - iMin;
                }
                if (i12 + i13 > length) {
                    i13--;
                }
                strDoubleToString = sizeTruncate(strDoubleToString, i12);
                strDoubleToString2 = sizeTruncate(strDoubleToString2, i13);
            }
        }
        StringBuilder sbA = androidx.compose.runtime.changelist.a.a(strDoubleToString);
        sbA.append(z10 ? "+" : "");
        sbA.append(strDoubleToString2);
        sbA.append(str);
        sbA.append('i');
        return sbA.toString();
    }

    public static String doubleToString(double d10, int i10) {
        int i11;
        double dAbs = Math.abs(d10);
        String string = i10 == -1 ? Float.toString((float) dAbs) : Double.toString(dAbs);
        StringBuffer stringBuffer = new StringBuffer(string);
        int i12 = (i10 <= 0 || i10 > 13) ? 17 : 16 - i10;
        int iLastIndexOf = string.lastIndexOf(69);
        int i13 = iLastIndexOf != -1 ? Integer.parseInt(string.substring(iLastIndexOf + 1)) : 0;
        if (iLastIndexOf != -1) {
            stringBuffer.setLength(iLastIndexOf);
        }
        int length = stringBuffer.length();
        int i14 = 0;
        while (i14 < length && stringBuffer.charAt(i14) != '.') {
            i14++;
        }
        int i15 = i13 + i14;
        if (i14 < length) {
            stringBuffer.deleteCharAt(i14);
            length--;
        }
        for (int i16 = 0; i16 < length && stringBuffer.charAt(i16) == '0'; i16++) {
            i12++;
        }
        if (i12 < length) {
            if (stringBuffer.charAt(i12) >= '5') {
                int i17 = i12 - 1;
                while (i17 >= 0 && stringBuffer.charAt(i17) == '9') {
                    stringBuffer.setCharAt(i17, '0');
                    i17--;
                }
                if (i17 >= 0) {
                    stringBuffer.setCharAt(i17, (char) (stringBuffer.charAt(i17) + 1));
                } else {
                    stringBuffer.insert(0, '1');
                    i12++;
                    i15++;
                }
            }
            stringBuffer.setLength(i12);
        }
        if (i15 < -5 || i15 > 10) {
            stringBuffer.insert(1, '.');
            i11 = i15 - 1;
        } else {
            while (length < i15) {
                stringBuffer.append('0');
                length++;
            }
            for (int i18 = i15; i18 <= 0; i18++) {
                stringBuffer.insert(0, '0');
            }
            if (i15 <= 0) {
                i15 = 1;
            }
            stringBuffer.insert(i15, '.');
            i11 = 0;
        }
        int length2 = stringBuffer.length() - 1;
        while (length2 >= 0 && stringBuffer.charAt(length2) == '0') {
            stringBuffer.deleteCharAt(length2);
            length2--;
        }
        if (length2 >= 0 && stringBuffer.charAt(length2) == '.') {
            stringBuffer.deleteCharAt(length2);
        }
        if (i11 != 0) {
            stringBuffer.append('E');
            stringBuffer.append(i11);
        }
        if (d10 < 0.0d) {
            stringBuffer.insert(0, SignatureVisitor.SUPER);
        }
        return stringBuffer.toString();
    }

    public static double shortApprox(double d10, double d11) {
        double dAbs = Math.abs(d10);
        double dIntExp10 = MoreMath.intExp10(MoreMath.intLog10(Math.abs(d11)));
        double dFloor = Math.floor((dAbs / dIntExp10) + 0.5d) * dIntExp10;
        return d10 < 0.0d ? -dFloor : dFloor;
    }

    public static String sizeTruncate(String str, int i10) {
        if (i10 == 100) {
            return str;
        }
        int iLastIndexOf = str.lastIndexOf(69);
        String strSubstring = iLastIndexOf != -1 ? str.substring(iLastIndexOf) : "";
        int length = strSubstring.length();
        int length2 = str.length() - length;
        int iMin = Math.min(length2, i10 - length);
        if (iMin < 1) {
            return str;
        }
        if (iMin < 2 && str.length() > 0 && str.charAt(0) == '-') {
            return str;
        }
        int iIndexOf = str.indexOf(46);
        if (iIndexOf == -1) {
            iIndexOf = length2;
        }
        if (iIndexOf <= iMin) {
            return str.substring(0, iMin) + strSubstring;
        }
        int i11 = iLastIndexOf != -1 ? Integer.parseInt(str.substring(iLastIndexOf + 1)) : 0;
        int i12 = str.charAt(0) == '-' ? 1 : 0;
        int i13 = ((iIndexOf - i12) - 1) + i11;
        StringBuilder sb2 = new StringBuilder();
        int i14 = i12 + 1;
        sb2.append(str.substring(0, i14));
        sb2.append('.');
        sb2.append(str.substring(i14, length2));
        sb2.append('E');
        sb2.append(i13);
        return sizeTruncate(sb2.toString(), i10);
    }

    public static String doubleToString(double d10, int i10, int i11) {
        return sizeTruncate(doubleToString(d10, i11), i10);
    }
}
