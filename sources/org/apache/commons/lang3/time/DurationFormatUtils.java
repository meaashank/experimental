package org.apache.commons.lang3.time;

import C4.q;
import G0.F;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import org.apache.commons.lang3.StringUtils;
import t1.b;
import w.y;

/* JADX INFO: loaded from: classes6.dex */
public class DurationFormatUtils {
    public static final String ISO_EXTENDED_FORMAT_PATTERN = "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    static final Object f226128y = "y";

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    static final Object f226123M = "M";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final Object f226125d = DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    static final Object f226122H = "H";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final Object f226126m = F.f40036b;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    static final Object f226127s = "s";

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    static final Object f226124S = b.f238816R4;

    public static String format(Token[] tokenArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, boolean z10) {
        StringBuffer stringBuffer = new StringBuffer();
        int i17 = i16;
        boolean z11 = false;
        for (Token token : tokenArr) {
            Object value = token.getValue();
            int count = token.getCount();
            if (value instanceof StringBuffer) {
                stringBuffer.append(value.toString());
            } else {
                if (value == f226128y) {
                    String string = Integer.toString(i10);
                    if (z10) {
                        string = StringUtils.leftPad(string, count, '0');
                    }
                    stringBuffer.append(string);
                } else if (value == f226123M) {
                    String string2 = Integer.toString(i11);
                    if (z10) {
                        string2 = StringUtils.leftPad(string2, count, '0');
                    }
                    stringBuffer.append(string2);
                } else if (value == f226125d) {
                    String string3 = Integer.toString(i12);
                    if (z10) {
                        string3 = StringUtils.leftPad(string3, count, '0');
                    }
                    stringBuffer.append(string3);
                } else if (value == f226122H) {
                    String string4 = Integer.toString(i13);
                    if (z10) {
                        string4 = StringUtils.leftPad(string4, count, '0');
                    }
                    stringBuffer.append(string4);
                } else if (value == f226126m) {
                    String string5 = Integer.toString(i14);
                    if (z10) {
                        string5 = StringUtils.leftPad(string5, count, '0');
                    }
                    stringBuffer.append(string5);
                } else if (value == f226127s) {
                    String string6 = Integer.toString(i15);
                    if (z10) {
                        string6 = StringUtils.leftPad(string6, count, '0');
                    }
                    stringBuffer.append(string6);
                    z11 = true;
                } else if (value == f226124S) {
                    if (z11) {
                        i17 += 1000;
                        String string7 = Integer.toString(i17);
                        if (z10) {
                            string7 = StringUtils.leftPad(string7, count, '0');
                        }
                        stringBuffer.append(string7.substring(1));
                    } else {
                        String string8 = Integer.toString(i17);
                        if (z10) {
                            string8 = StringUtils.leftPad(string8, count, '0');
                        }
                        stringBuffer.append(string8);
                    }
                }
                z11 = false;
            }
        }
        return stringBuffer.toString();
    }

    public static String formatDuration(long j10, String str) {
        return formatDuration(j10, str, true);
    }

    public static String formatDurationHMS(long j10) {
        return formatDuration(j10, "H:mm:ss.SSS");
    }

    public static String formatDurationISO(long j10) {
        return formatDuration(j10, ISO_EXTENDED_FORMAT_PATTERN, false);
    }

    public static String formatDurationWords(long j10, boolean z10, boolean z11) {
        String duration = formatDuration(j10, "d' days 'H' hours 'm' minutes 's' seconds'");
        if (z10) {
            duration = y.a(q.f17581a, duration);
            String strReplaceOnce = StringUtils.replaceOnce(duration, " 0 days", "");
            if (strReplaceOnce.length() != duration.length()) {
                String strReplaceOnce2 = StringUtils.replaceOnce(strReplaceOnce, " 0 hours", "");
                if (strReplaceOnce2.length() != strReplaceOnce.length()) {
                    duration = StringUtils.replaceOnce(strReplaceOnce2, " 0 minutes", "");
                    if (duration.length() != duration.length()) {
                        duration = StringUtils.replaceOnce(duration, " 0 seconds", "");
                    }
                } else {
                    duration = strReplaceOnce;
                }
            }
            if (duration.length() != 0) {
                duration = duration.substring(1);
            }
        }
        if (z11) {
            String strReplaceOnce3 = StringUtils.replaceOnce(duration, " 0 seconds", "");
            if (strReplaceOnce3.length() != duration.length()) {
                duration = StringUtils.replaceOnce(strReplaceOnce3, " 0 minutes", "");
                if (duration.length() != strReplaceOnce3.length()) {
                    String strReplaceOnce4 = StringUtils.replaceOnce(duration, " 0 hours", "");
                    if (strReplaceOnce4.length() != duration.length()) {
                        duration = StringUtils.replaceOnce(strReplaceOnce4, " 0 days", "");
                    }
                } else {
                    duration = strReplaceOnce3;
                }
            }
        }
        return StringUtils.replaceOnce(StringUtils.replaceOnce(StringUtils.replaceOnce(StringUtils.replaceOnce(q.f17581a + duration, " 1 seconds", " 1 second"), " 1 minutes", " 1 minute"), " 1 hours", " 1 hour"), " 1 days", " 1 day").trim();
    }

    public static String formatPeriod(long j10, long j11, String str) {
        return formatPeriod(j10, j11, str, true, TimeZone.getDefault());
    }

    public static String formatPeriodISO(long j10, long j11) {
        return formatPeriod(j10, j11, ISO_EXTENDED_FORMAT_PATTERN, false, TimeZone.getDefault());
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0093 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.apache.commons.lang3.time.DurationFormatUtils.Token[] lexx(java.lang.String r10) {
        /*
            char[] r10 = r10.toCharArray()
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r10.length
            r0.<init>(r1)
            int r1 = r10.length
            r2 = 0
            r3 = 0
            r4 = r2
            r5 = r4
            r6 = r3
            r7 = r6
        L11:
            if (r4 >= r1) goto L97
            char r8 = r10[r4]
            r9 = 39
            if (r5 == 0) goto L20
            if (r8 == r9) goto L20
            r6.append(r8)
            goto L93
        L20:
            if (r8 == r9) goto L67
            r9 = 72
            if (r8 == r9) goto L64
            r9 = 77
            if (r8 == r9) goto L61
            r9 = 83
            if (r8 == r9) goto L5e
            r9 = 100
            if (r8 == r9) goto L5b
            r9 = 109(0x6d, float:1.53E-43)
            if (r8 == r9) goto L58
            r9 = 115(0x73, float:1.61E-43)
            if (r8 == r9) goto L55
            r9 = 121(0x79, float:1.7E-43)
            if (r8 == r9) goto L52
            if (r6 != 0) goto L4d
            java.lang.StringBuffer r6 = new java.lang.StringBuffer
            r6.<init>()
            org.apache.commons.lang3.time.DurationFormatUtils$Token r9 = new org.apache.commons.lang3.time.DurationFormatUtils$Token
            r9.<init>(r6)
            r0.add(r9)
        L4d:
            r6.append(r8)
        L50:
            r8 = r3
            goto L7c
        L52:
            java.lang.Object r8 = org.apache.commons.lang3.time.DurationFormatUtils.f226128y
            goto L7c
        L55:
            java.lang.Object r8 = org.apache.commons.lang3.time.DurationFormatUtils.f226127s
            goto L7c
        L58:
            java.lang.Object r8 = org.apache.commons.lang3.time.DurationFormatUtils.f226126m
            goto L7c
        L5b:
            java.lang.Object r8 = org.apache.commons.lang3.time.DurationFormatUtils.f226125d
            goto L7c
        L5e:
            java.lang.Object r8 = org.apache.commons.lang3.time.DurationFormatUtils.f226124S
            goto L7c
        L61:
            java.lang.Object r8 = org.apache.commons.lang3.time.DurationFormatUtils.f226123M
            goto L7c
        L64:
            java.lang.Object r8 = org.apache.commons.lang3.time.DurationFormatUtils.f226122H
            goto L7c
        L67:
            if (r5 == 0) goto L6d
            r5 = r2
            r6 = r3
            r8 = r6
            goto L7c
        L6d:
            java.lang.StringBuffer r6 = new java.lang.StringBuffer
            r6.<init>()
            org.apache.commons.lang3.time.DurationFormatUtils$Token r5 = new org.apache.commons.lang3.time.DurationFormatUtils$Token
            r5.<init>(r6)
            r0.add(r5)
            r5 = 1
            goto L50
        L7c:
            if (r8 == 0) goto L93
            if (r7 == 0) goto L8a
            java.lang.Object r6 = r7.getValue()
            if (r6 != r8) goto L8a
            r7.increment()
            goto L92
        L8a:
            org.apache.commons.lang3.time.DurationFormatUtils$Token r7 = new org.apache.commons.lang3.time.DurationFormatUtils$Token
            r7.<init>(r8)
            r0.add(r7)
        L92:
            r6 = r3
        L93:
            int r4 = r4 + 1
            goto L11
        L97:
            int r10 = r0.size()
            org.apache.commons.lang3.time.DurationFormatUtils$Token[] r10 = new org.apache.commons.lang3.time.DurationFormatUtils.Token[r10]
            java.lang.Object[] r10 = r0.toArray(r10)
            org.apache.commons.lang3.time.DurationFormatUtils$Token[] r10 = (org.apache.commons.lang3.time.DurationFormatUtils.Token[]) r10
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.lang3.time.DurationFormatUtils.lexx(java.lang.String):org.apache.commons.lang3.time.DurationFormatUtils$Token[]");
    }

    public static String formatDuration(long j10, String str, boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13;
        Token[] tokenArrLexx = lexx(str);
        if (Token.containsTokenWithValue(tokenArrLexx, f226125d)) {
            int i14 = (int) (j10 / 86400000);
            j10 -= ((long) i14) * 86400000;
            i10 = i14;
        } else {
            i10 = 0;
        }
        if (Token.containsTokenWithValue(tokenArrLexx, f226122H)) {
            int i15 = (int) (j10 / 3600000);
            j10 -= ((long) i15) * 3600000;
            i11 = i15;
        } else {
            i11 = 0;
        }
        if (Token.containsTokenWithValue(tokenArrLexx, f226126m)) {
            int i16 = (int) (j10 / 60000);
            j10 -= ((long) i16) * 60000;
            i12 = i16;
        } else {
            i12 = 0;
        }
        if (Token.containsTokenWithValue(tokenArrLexx, f226127s)) {
            int i17 = (int) (j10 / 1000);
            j10 -= ((long) i17) * 1000;
            i13 = i17;
        } else {
            i13 = 0;
        }
        return format(tokenArrLexx, 0, 0, i10, i11, i12, i13, Token.containsTokenWithValue(tokenArrLexx, f226124S) ? (int) j10 : 0, z10);
    }

    public static String formatPeriod(long j10, long j11, String str, boolean z10, TimeZone timeZone) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Token[] tokenArrLexx = lexx(str);
        Calendar calendar = Calendar.getInstance(timeZone);
        calendar.setTime(new Date(j10));
        Calendar calendar2 = Calendar.getInstance(timeZone);
        calendar2.setTime(new Date(j11));
        int i15 = calendar2.get(14) - calendar.get(14);
        int i16 = calendar2.get(13) - calendar.get(13);
        int i17 = calendar2.get(12) - calendar.get(12);
        int i18 = calendar2.get(11) - calendar.get(11);
        int actualMaximum = calendar2.get(5) - calendar.get(5);
        int i19 = calendar2.get(2) - calendar.get(2);
        int i20 = calendar2.get(1) - calendar.get(1);
        while (i15 < 0) {
            i15 += 1000;
            i16--;
        }
        while (i16 < 0) {
            i16 += 60;
            i17--;
        }
        while (i17 < 0) {
            i17 += 60;
            i18--;
        }
        while (i18 < 0) {
            i18 += 24;
            actualMaximum--;
        }
        if (Token.containsTokenWithValue(tokenArrLexx, f226123M)) {
            while (actualMaximum < 0) {
                actualMaximum += calendar.getActualMaximum(5);
                i19--;
                calendar.add(2, 1);
            }
            while (i19 < 0) {
                i19 += 12;
                i20--;
            }
            if (!Token.containsTokenWithValue(tokenArrLexx, f226128y) && i20 != 0) {
                while (i20 != 0) {
                    i19 += i20 * 12;
                    i20 = 0;
                }
            }
        } else {
            if (!Token.containsTokenWithValue(tokenArrLexx, f226128y)) {
                int i21 = calendar2.get(1);
                if (i19 < 0) {
                    i21--;
                }
                while (calendar.get(1) != i21) {
                    int actualMaximum2 = (calendar.getActualMaximum(6) - calendar.get(6)) + actualMaximum;
                    if ((calendar instanceof GregorianCalendar) && calendar.get(2) == 1 && calendar.get(5) == 29) {
                        actualMaximum2++;
                    }
                    calendar.add(1, 1);
                    actualMaximum = calendar.get(6) + actualMaximum2;
                }
                i20 = 0;
            }
            while (calendar.get(2) != calendar2.get(2)) {
                actualMaximum += calendar.getActualMaximum(5);
                calendar.add(2, 1);
            }
            i19 = 0;
            while (actualMaximum < 0) {
                actualMaximum += calendar.getActualMaximum(5);
                i19--;
                calendar.add(2, 1);
            }
        }
        int i22 = i19;
        int i23 = i20;
        if (Token.containsTokenWithValue(tokenArrLexx, f226125d)) {
            i10 = actualMaximum;
        } else {
            i18 += actualMaximum * 24;
            i10 = 0;
        }
        if (!Token.containsTokenWithValue(tokenArrLexx, f226122H)) {
            i17 += i18 * 60;
            i18 = 0;
        }
        if (!Token.containsTokenWithValue(tokenArrLexx, f226126m)) {
            i16 += i17 * 60;
            i17 = 0;
        }
        if (Token.containsTokenWithValue(tokenArrLexx, f226127s)) {
            int i24 = i18;
            i11 = i15;
            i12 = i24;
            int i25 = i17;
            i13 = i16;
            i14 = i25;
        } else {
            int i26 = i15 + (i16 * 1000);
            int i27 = i18;
            i11 = i26;
            i12 = i27;
            i14 = i17;
            i13 = 0;
        }
        return format(tokenArrLexx, i23, i22, i10, i12, i14, i13, i11, z10);
    }

    public static class Token {
        private int count;
        private final Object value;

        public Token(Object obj) {
            this.value = obj;
            this.count = 1;
        }

        public static boolean containsTokenWithValue(Token[] tokenArr, Object obj) {
            for (Token token : tokenArr) {
                if (token.getValue() == obj) {
                    return true;
                }
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (obj instanceof Token) {
                Token token = (Token) obj;
                if (this.value.getClass() != token.value.getClass() || this.count != token.count) {
                    return false;
                }
                Object obj2 = this.value;
                if (obj2 instanceof StringBuffer) {
                    return obj2.toString().equals(token.value.toString());
                }
                if (obj2 instanceof Number) {
                    return obj2.equals(token.value);
                }
                if (obj2 == token.value) {
                    return true;
                }
            }
            return false;
        }

        public int getCount() {
            return this.count;
        }

        public Object getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public void increment() {
            this.count++;
        }

        public String toString() {
            return StringUtils.repeat(this.value.toString(), this.count);
        }

        public Token(Object obj, int i10) {
            this.value = obj;
            this.count = i10;
        }
    }
}
