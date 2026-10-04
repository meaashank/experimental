package org.javia.arity;

import C4.q;
import U6.j;
import androidx.compose.runtime.changelist.c;
import androidx.room.F;
import com.mbridge.msdk.MBridgeConstans;
import java.io.PrintStream;

/* JADX INFO: loaded from: classes6.dex */
class TestFormat {
    static FormatCase[] cases = {new FormatCase(0, 0.1d, "0.1"), new FormatCase(0, 0.12d, "0.12"), new FormatCase(0, 0.001d, "0.001"), new FormatCase(0, 0.0012d, "0.0012"), new FormatCase(0, 1.0E-7d, "1E-7"), new FormatCase(0, 1.2E-7d, "1.2E-7"), new FormatCase(0, 0.123456789012345d, "0.123456789012345"), new FormatCase(0, 0.0d, MBridgeConstans.ENDCARD_URL_TYPE_PL), new FormatCase(0, 1.0d, "1"), new FormatCase(0, 12.0d, "12"), new FormatCase(0, 1.23456789E9d, "1234567890"), new FormatCase(0, 1.0E9d, "1000000000"), new FormatCase(0, 1.23456789012345d, "1.23456789012345"), new FormatCase(0, 12345.6789012345d, "12345.6789012345"), new FormatCase(0, 1.23456789012345E9d, "1234567890.12345"), new FormatCase(0, 1.23456789012345E14d, "1.23456789012345E14"), new FormatCase(0, 1.0E14d, "1E14"), new FormatCase(0, 1.2E14d, "1.2E14"), new FormatCase(0, 1.00000000000001E14d, "1.00000000000001E14"), new FormatCase(2, 0.1d, "0.1"), new FormatCase(2, 1.2E-7d, "1.2E-7"), new FormatCase(2, 0.123456789012345d, "0.12345678901235"), new FormatCase(2, 0.0d, MBridgeConstans.ENDCARD_URL_TYPE_PL), new FormatCase(2, 1.23456789012345d, "1.2345678901235"), new FormatCase(3, 1.23456789012345d, "1.234567890123"), new FormatCase(0, 12345.6789012345d, "12345.6789012345"), new FormatCase(2, 1.23456789012345E9d, "1234567890.1235"), new FormatCase(3, 1.23456789012345E14d, "1.234567890123E14"), new FormatCase(2, 1.00000000000001E14d, "1E14"), new FormatCase(0, 1.2345678901234568E16d, "1.2345678901234568E16"), new FormatCase(2, 1.2345678901234568E16d, "1.2345678901235E16"), new FormatCase(0, 1.0E17d, "1E17"), new FormatCase(0, 1.0E16d, "1E16"), new FormatCase(0, 9.99999999999999E14d, "9.99999999999999E14"), new FormatCase(2, 9.99999999999999E14d, "1E15"), new FormatCase(2, 9.99999999999994E14d, "9.9999999999999E14"), new FormatCase(2, MoreMath.log2(1.00002d), "0.000028853612282487"), new FormatCase(0, 4.0E-4d, "0.0004"), new FormatCase(0, 1.0E30d, "1E30")};
    static SizeCase[] sizeCases = {new SizeCase(9, "1111111110", "1.11111E9"), new SizeCase(10, "1111111110", "1111111110"), new SizeCase(10, "11111111110", "1.11111E10"), new SizeCase(10, "12.11111E9", "12.11111E9"), new SizeCase(9, "12.34567E9", "12.3456E9"), new SizeCase(9, "12345678E3", "1.2345E10"), new SizeCase(9, "-12345678E3", "-1.234E10"), new SizeCase(9, "-0.00000007", "-0.000000"), new SizeCase(5, "-1.23E123", "-1.23E123"), new SizeCase(5, "-1.2E123", "-1.2E123"), new SizeCase(5, "-1E123", "-1E123"), new SizeCase(2, "-1", "-1"), new SizeCase(1, "-1", "-1"), new SizeCase(1, "-0.02", "-0.02"), new SizeCase(1, "0.02", MBridgeConstans.ENDCARD_URL_TYPE_PL)};

    public static boolean testFormat() {
        boolean z10 = true;
        int i10 = 0;
        while (true) {
            FormatCase[] formatCaseArr = cases;
            if (i10 >= formatCaseArr.length) {
                return z10;
            }
            FormatCase formatCase = formatCaseArr[i10];
            double d10 = Double.parseDouble(formatCase.res);
            if (formatCase.rounding == 0 && d10 != formatCase.val) {
                System.out.println("wrong test? " + formatCase.res + q.f17581a + d10 + q.f17581a + formatCase.val);
            }
            String strDoubleToString = Util.doubleToString(formatCase.val, formatCase.rounding);
            if (!strDoubleToString.equals(formatCase.res)) {
                PrintStream printStream = System.out;
                StringBuilder sb2 = new StringBuilder("Expected '");
                F.a(sb2, formatCase.res, "', got '", strDoubleToString, "'. ");
                sb2.append(Double.toString(formatCase.val));
                printStream.println(sb2.toString());
                z10 = false;
            }
            i10++;
        }
    }

    public static boolean testSizeCases() {
        boolean z10 = true;
        for (SizeCase sizeCase : sizeCases) {
            String strSizeTruncate = Util.sizeTruncate(sizeCase.val, sizeCase.size);
            if (!strSizeTruncate.equals(sizeCase.res)) {
                PrintStream printStream = System.out;
                StringBuilder sb2 = new StringBuilder("sizeTruncate(");
                sb2.append(sizeCase.val);
                sb2.append(j.f68738d);
                c.a(sb2, sizeCase.size, "): got '", strSizeTruncate, "' expected '");
                sb2.append(sizeCase.res);
                sb2.append("'");
                printStream.println(sb2.toString());
                z10 = false;
            }
        }
        return z10;
    }
}
