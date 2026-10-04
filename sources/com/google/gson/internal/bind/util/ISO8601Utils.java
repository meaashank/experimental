package com.google.gson.internal.bind.util;

import androidx.compose.ui.graphics.vector.f;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import org.objectweb.asm.signature.SignatureVisitor;

/* JADX INFO: loaded from: classes5.dex */
public class ISO8601Utils {
    private static final String UTC_ID = "UTC";
    private static final TimeZone TIMEZONE_UTC = TimeZone.getTimeZone(UTC_ID);

    private static boolean checkOffset(String str, int i10, char c10) {
        return i10 < str.length() && str.charAt(i10) == c10;
    }

    public static String format(Date date) {
        return format(date, false, TIMEZONE_UTC);
    }

    private static int indexOfNonDigit(String str, int i10) {
        while (i10 < str.length()) {
            char cCharAt = str.charAt(i10);
            if (cCharAt < '0' || cCharAt > '9') {
                return i10;
            }
            i10++;
        }
        return str.length();
    }

    private static void padInt(StringBuilder sb2, int i10, int i11) {
        String string = Integer.toString(i10);
        for (int length = i11 - string.length(); length > 0; length--) {
            sb2.append('0');
        }
        sb2.append(string);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00e7 A[Catch: IllegalArgumentException -> 0x0052, NumberFormatException -> 0x0055, IndexOutOfBoundsException -> 0x0058, TryCatch #2 {IndexOutOfBoundsException -> 0x0058, NumberFormatException -> 0x0055, IllegalArgumentException -> 0x0052, blocks: (B:3:0x000c, B:5:0x001f, B:6:0x0021, B:8:0x002d, B:9:0x002f, B:11:0x003e, B:13:0x0044, B:23:0x0061, B:25:0x0071, B:26:0x0073, B:28:0x007f, B:29:0x0082, B:31:0x0088, B:35:0x0092, B:40:0x00a2, B:42:0x00aa, B:54:0x00e1, B:56:0x00e7, B:58:0x00ed, B:84:0x017e, B:64:0x00fe, B:65:0x0114, B:66:0x0115, B:70:0x0125, B:72:0x0132, B:75:0x013b, B:77:0x014d, B:80:0x015c, B:81:0x0179, B:83:0x017c, B:69:0x0121, B:86:0x01b0, B:87:0x01b7, B:47:0x00c4, B:48:0x00c7), top: B:98:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b0 A[Catch: IllegalArgumentException -> 0x0052, NumberFormatException -> 0x0055, IndexOutOfBoundsException -> 0x0058, TryCatch #2 {IndexOutOfBoundsException -> 0x0058, NumberFormatException -> 0x0055, IllegalArgumentException -> 0x0052, blocks: (B:3:0x000c, B:5:0x001f, B:6:0x0021, B:8:0x002d, B:9:0x002f, B:11:0x003e, B:13:0x0044, B:23:0x0061, B:25:0x0071, B:26:0x0073, B:28:0x007f, B:29:0x0082, B:31:0x0088, B:35:0x0092, B:40:0x00a2, B:42:0x00aa, B:54:0x00e1, B:56:0x00e7, B:58:0x00ed, B:84:0x017e, B:64:0x00fe, B:65:0x0114, B:66:0x0115, B:70:0x0125, B:72:0x0132, B:75:0x013b, B:77:0x014d, B:80:0x015c, B:81:0x0179, B:83:0x017c, B:69:0x0121, B:86:0x01b0, B:87:0x01b7, B:47:0x00c4, B:48:0x00c7), top: B:98:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Date parse(java.lang.String r19, java.text.ParsePosition r20) throws java.text.ParseException {
        /*
            Method dump skipped, instruction units count: 523
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.util.ISO8601Utils.parse(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    private static int parseInt(String str, int i10, int i11) throws NumberFormatException {
        int i12;
        int i13;
        if (i10 < 0 || i11 > str.length() || i10 > i11) {
            throw new NumberFormatException(str);
        }
        if (i10 < i11) {
            i13 = i10 + 1;
            int iDigit = Character.digit(str.charAt(i10), 10);
            if (iDigit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i10, i11));
            }
            i12 = -iDigit;
        } else {
            i12 = 0;
            i13 = i10;
        }
        while (i13 < i11) {
            int i14 = i13 + 1;
            int iDigit2 = Character.digit(str.charAt(i13), 10);
            if (iDigit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i10, i11));
            }
            i12 = (i12 * 10) - iDigit2;
            i13 = i14;
        }
        return -i12;
    }

    public static String format(Date date, boolean z10) {
        return format(date, z10, TIMEZONE_UTC);
    }

    public static String format(Date date, boolean z10, TimeZone timeZone) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb2 = new StringBuilder(19 + (z10 ? 4 : 0) + (timeZone.getRawOffset() == 0 ? 1 : 6));
        padInt(sb2, gregorianCalendar.get(1), 4);
        char c10 = SignatureVisitor.SUPER;
        sb2.append(SignatureVisitor.SUPER);
        padInt(sb2, gregorianCalendar.get(2) + 1, 2);
        sb2.append(SignatureVisitor.SUPER);
        padInt(sb2, gregorianCalendar.get(5), 2);
        sb2.append(f.f101686r);
        padInt(sb2, gregorianCalendar.get(11), 2);
        sb2.append(':');
        padInt(sb2, gregorianCalendar.get(12), 2);
        sb2.append(':');
        padInt(sb2, gregorianCalendar.get(13), 2);
        if (z10) {
            sb2.append('.');
            padInt(sb2, gregorianCalendar.get(14), 3);
        }
        int offset = timeZone.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i10 = offset / 60000;
            int iAbs = Math.abs(i10 / 60);
            int iAbs2 = Math.abs(i10 % 60);
            if (offset >= 0) {
                c10 = SignatureVisitor.EXTENDS;
            }
            sb2.append(c10);
            padInt(sb2, iAbs, 2);
            sb2.append(':');
            padInt(sb2, iAbs2, 2);
        } else {
            sb2.append(f.f101670b);
        }
        return sb2.toString();
    }
}
