package kotlin.text;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import kotlin.InterfaceC4887e0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@kotlin.jvm.internal.V({"SMAP\nStringNumberConversionsJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringNumberConversionsJVM.kt\nkotlin/text/StringsKt__StringNumberConversionsJVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,569:1\n267#1,7:570\n267#1,7:577\n278#1,8:584\n278#1,8:592\n1#2:600\n1656#3,3:601\n1656#3,3:604\n1656#3,3:607\n*S KotlinDebug\n*F\n+ 1 StringNumberConversionsJVM.kt\nkotlin/text/StringsKt__StringNumberConversionsJVMKt\n*L\n166#1:570,7\n173#1:577,7\n253#1:584,8\n264#1:592,8\n430#1:601,3\n439#1:604,3\n452#1:607,3\n*E\n"})
public class D extends C {
    @Xc.f
    public static final int E0(String str, int i10, int i11, boolean z10, ed.l<? super Character, Boolean> lVar) {
        boolean z11;
        int i12 = i10;
        while (i12 <= i11 && lVar.invoke(Character.valueOf(str.charAt(i12))).booleanValue()) {
            i12++;
        }
        boolean z12 = i10 != i12;
        if (i12 > i11) {
            if (z10) {
                return -1;
            }
            return i12;
        }
        if (str.charAt(i12) == '.') {
            int i13 = i12 + 1;
            int i14 = i13;
            while (i14 <= i11 && lVar.invoke(Character.valueOf(str.charAt(i14))).booleanValue()) {
                i14++;
            }
            z11 = i13 != i14;
            i12 = i14;
        } else {
            z11 = false;
        }
        if (z12 || z11) {
            return i12;
        }
        if (z10) {
            return -1;
        }
        String str2 = i11 == i12 + 2 ? "NaN" : i11 == i12 + 7 ? kotlin.time.j.f218437k : null;
        if (str2 != null && M.H3(str, str2, i12, false) == i12) {
            return i11 + 1;
        }
        return -1;
    }

    @Xc.f
    public static final int F0(String str, int i10, int i11, ed.l<? super Character, Boolean> lVar) {
        while (i10 <= i11 && lVar.invoke(Character.valueOf(str.charAt(i10))).booleanValue()) {
            i10++;
        }
        return i10;
    }

    @Xc.f
    public static final int G0(char c10) {
        return c10 | ' ';
    }

    @Xc.f
    public static final int H0(String str, int i10, int i11, ed.l<? super Character, Boolean> lVar) {
        while (i11 > i10 && lVar.invoke(Character.valueOf(str.charAt(i11))).booleanValue()) {
            i11--;
        }
        return i11;
    }

    @Xc.f
    public static final String I0(int i10, int i11) {
        if (i11 == i10 + 2) {
            return "NaN";
        }
        if (i11 == i10 + 7) {
            return kotlin.time.j.f218437k;
        }
        return null;
    }

    @Xc.f
    public static final boolean J0(char c10) {
        return ((c10 + 65488) & 65535) < 10;
    }

    @Xc.f
    public static final boolean K0(char c10) {
        return (((c10 | ' ') + (-97)) & 65535) < 6;
    }

    public static final boolean L0(String str) {
        int i10;
        if (str.length() == 0) {
            return false;
        }
        int i11 = (str.charAt(0) == '-' || str.charAt(0) == '+') ? 1 : 0;
        int i12 = i11;
        while (i12 < str.length() && Character.isDigit(str.charAt(i12))) {
            i12++;
        }
        if (i12 == str.length()) {
            return i12 - i11 > 0;
        }
        if (str.charAt(i12) == '.') {
            i12++;
            if (i12 == str.length()) {
                return i12 - i11 > 1;
            }
            while (i12 < str.length() && Character.isDigit(str.charAt(i12))) {
                i12++;
            }
        }
        if (i12 == str.length()) {
            return true;
        }
        if ((str.charAt(i12) != 'e' && str.charAt(i12) != 'E') || (i10 = i12 + 1) == str.length()) {
            return false;
        }
        if (str.charAt(i10) == '+' || str.charAt(i10) == '-') {
            i10 = i12 + 2;
        }
        if (i10 == str.length()) {
            return false;
        }
        while (i10 < str.length() && Character.isDigit(str.charAt(i10))) {
            i10++;
        }
        return i10 == str.length();
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean M0(java.lang.String r19) {
        /*
            Method dump skipped, instruction units count: 379
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.D.M0(java.lang.String):boolean");
    }

    public static final <T> T N0(String str, ed.l<? super String, ? extends T> lVar) {
        try {
            if (L0(str)) {
                return lVar.invoke(str);
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    public static final <T> T O0(String str, ed.l<? super String, ? extends T> lVar) {
        try {
            if (M0(str)) {
                return lVar.invoke(str);
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    @InterfaceC4887e0(version = "1.2")
    @Xc.f
    public static final BigDecimal P0(String str) {
        kotlin.jvm.internal.G.p(str, "<this>");
        return new BigDecimal(str);
    }

    @InterfaceC4887e0(version = "1.2")
    @Xc.f
    public static final BigDecimal Q0(String str, MathContext mathContext) {
        kotlin.jvm.internal.G.p(str, "<this>");
        kotlin.jvm.internal.G.p(mathContext, "mathContext");
        return new BigDecimal(str, mathContext);
    }

    @InterfaceC4887e0(version = "1.2")
    @Nullable
    public static final BigDecimal R0(@NotNull String str) {
        kotlin.jvm.internal.G.p(str, "<this>");
        try {
            if (L0(str)) {
                return new BigDecimal(str);
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    @InterfaceC4887e0(version = "1.2")
    @Nullable
    public static final BigDecimal S0(@NotNull String str, @NotNull MathContext mathContext) {
        kotlin.jvm.internal.G.p(str, "<this>");
        kotlin.jvm.internal.G.p(mathContext, "mathContext");
        try {
            if (L0(str)) {
                return new BigDecimal(str, mathContext);
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    @InterfaceC4887e0(version = "1.2")
    @Xc.f
    public static final BigInteger T0(String str) {
        kotlin.jvm.internal.G.p(str, "<this>");
        return new BigInteger(str);
    }

    @InterfaceC4887e0(version = "1.2")
    @Xc.f
    public static final BigInteger U0(String str, int i10) {
        kotlin.jvm.internal.G.p(str, "<this>");
        C5011c.a(i10);
        return new BigInteger(str, i10);
    }

    @InterfaceC4887e0(version = "1.2")
    @Nullable
    public static final BigInteger V0(@NotNull String str) {
        kotlin.jvm.internal.G.p(str, "<this>");
        return W0(str, 10);
    }

    @InterfaceC4887e0(version = "1.2")
    @Nullable
    public static final BigInteger W0(@NotNull String str, int i10) {
        kotlin.jvm.internal.G.p(str, "<this>");
        C5011c.a(i10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        if (length != 1) {
            for (int i11 = str.charAt(0) == '-' ? 1 : 0; i11 < length; i11++) {
                if (Character.digit((int) str.charAt(i11), i10) < 0) {
                    return null;
                }
            }
        } else if (Character.digit((int) str.charAt(0), i10) < 0) {
            return null;
        }
        C5011c.a(i10);
        return new BigInteger(str, i10);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final boolean X0(String str) {
        return Boolean.parseBoolean(str);
    }

    @Xc.f
    public static final byte Y0(String str) {
        kotlin.jvm.internal.G.p(str, "<this>");
        return Byte.parseByte(str);
    }

    @InterfaceC4887e0(version = "1.1")
    @Xc.f
    public static final byte Z0(String str, int i10) {
        kotlin.jvm.internal.G.p(str, "<this>");
        C5011c.a(i10);
        return Byte.parseByte(str, i10);
    }

    @Xc.f
    public static final double a1(String str) {
        kotlin.jvm.internal.G.p(str, "<this>");
        return Double.parseDouble(str);
    }

    @InterfaceC4887e0(version = "1.1")
    @Nullable
    public static final Double b1(@NotNull String str) {
        kotlin.jvm.internal.G.p(str, "<this>");
        try {
            if (M0(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    @Xc.f
    public static final float c1(String str) {
        kotlin.jvm.internal.G.p(str, "<this>");
        return Float.parseFloat(str);
    }

    @InterfaceC4887e0(version = "1.1")
    @Nullable
    public static final Float d1(@NotNull String str) {
        kotlin.jvm.internal.G.p(str, "<this>");
        try {
            if (M0(str)) {
                return Float.valueOf(Float.parseFloat(str));
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    @Xc.f
    public static final int e1(String str) {
        kotlin.jvm.internal.G.p(str, "<this>");
        return Integer.parseInt(str);
    }

    @InterfaceC4887e0(version = "1.1")
    @Xc.f
    public static final int f1(String str, int i10) {
        kotlin.jvm.internal.G.p(str, "<this>");
        C5011c.a(i10);
        return Integer.parseInt(str, i10);
    }

    @Xc.f
    public static final long g1(String str) {
        kotlin.jvm.internal.G.p(str, "<this>");
        return Long.parseLong(str);
    }

    @InterfaceC4887e0(version = "1.1")
    @Xc.f
    public static final long h1(String str, int i10) {
        kotlin.jvm.internal.G.p(str, "<this>");
        C5011c.a(i10);
        return Long.parseLong(str, i10);
    }

    @Xc.f
    public static final short i1(String str) {
        kotlin.jvm.internal.G.p(str, "<this>");
        return Short.parseShort(str);
    }

    @InterfaceC4887e0(version = "1.1")
    @Xc.f
    public static final short j1(String str, int i10) {
        kotlin.jvm.internal.G.p(str, "<this>");
        C5011c.a(i10);
        return Short.parseShort(str, i10);
    }

    @InterfaceC4887e0(version = "1.1")
    @Xc.f
    public static final String k1(byte b10, int i10) {
        C5011c.a(i10);
        String string = Integer.toString(b10, i10);
        kotlin.jvm.internal.G.o(string, "toString(...)");
        return string;
    }

    @InterfaceC4887e0(version = "1.1")
    @Xc.f
    public static final String l1(int i10, int i11) {
        C5011c.a(i11);
        String string = Integer.toString(i10, i11);
        kotlin.jvm.internal.G.o(string, "toString(...)");
        return string;
    }

    @InterfaceC4887e0(version = "1.1")
    @Xc.f
    public static final String m1(long j10, int i10) {
        C5011c.a(i10);
        String string = Long.toString(j10, i10);
        kotlin.jvm.internal.G.o(string, "toString(...)");
        return string;
    }

    @InterfaceC4887e0(version = "1.1")
    @Xc.f
    public static final String n1(short s10, int i10) {
        C5011c.a(i10);
        String string = Integer.toString(s10, i10);
        kotlin.jvm.internal.G.o(string, "toString(...)");
        return string;
    }
}
