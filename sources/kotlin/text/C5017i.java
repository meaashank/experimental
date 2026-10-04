package kotlin.text;

import androidx.collection.LruCacheKt;
import com.google.common.base.Ascii;
import java.util.Arrays;
import kotlin.H0;
import kotlin.InterfaceC4887e0;
import kotlin.InterfaceC5043v;
import kotlin.KotlinNothingValueException;
import kotlin.N0;
import kotlin.O0;
import kotlin.collections.AbstractC4859d;
import kotlin.text.HexFormat;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kotlin.text.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@kotlin.jvm.internal.V({"SMAP\nHexExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HexExtensions.kt\nkotlin/text/HexExtensionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,1260:1\n1211#1,7:1262\n1211#1,7:1269\n1211#1,7:1276\n1211#1,7:1283\n1211#1,7:1290\n1211#1,7:1297\n1211#1,7:1304\n1211#1,7:1311\n1221#1,5:1318\n1221#1,5:1323\n1211#1,7:1328\n1211#1,7:1335\n1181#1,3:1342\n1221#1,5:1345\n1185#1:1350\n1221#1,5:1351\n1201#1,3:1356\n1229#1,5:1359\n1205#1:1364\n1229#1,5:1365\n1#2:1261\n1207#3,3:1370\n1207#3,3:1373\n1207#3,3:1376\n1207#3,3:1379\n*S KotlinDebug\n*F\n+ 1 HexExtensions.kt\nkotlin/text/HexExtensionsKt\n*L\n450#1:1262,7\n482#1:1269,7\n486#1:1276,7\n489#1:1283,7\n529#1:1290,7\n532#1:1297,7\n537#1:1304,7\n542#1:1311,7\n549#1:1318,5\n550#1:1323,5\n1141#1:1328,7\n1143#1:1335,7\n1169#1:1342,3\n1169#1:1345,5\n1169#1:1350\n1183#1:1351,5\n1189#1:1356,3\n1189#1:1359,5\n1189#1:1364\n1203#1:1365,5\n42#1:1370,3\n43#1:1373,3\n54#1:1376,3\n55#1:1379,3\n*E\n"})
public final class C5017i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final String f218345a = "0123456789abcdef";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final String f218346b = "0123456789ABCDEF";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final int[] f218347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final int[] f218348d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final int[] f218349e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final long[] f218350f;

    static {
        int[] iArr = new int[256];
        int i10 = 0;
        for (int i11 = 0; i11 < 256; i11++) {
            iArr[i11] = f218345a.charAt(i11 & 15) | (f218345a.charAt(i11 >> 4) << '\b');
        }
        f218347c = iArr;
        int[] iArr2 = new int[256];
        for (int i12 = 0; i12 < 256; i12++) {
            iArr2[i12] = f218346b.charAt(i12 & 15) | (f218346b.charAt(i12 >> 4) << '\b');
        }
        f218348d = iArr2;
        int[] iArr3 = new int[256];
        for (int i13 = 0; i13 < 256; i13++) {
            iArr3[i13] = -1;
        }
        int i14 = 0;
        int i15 = 0;
        while (i14 < f218345a.length()) {
            iArr3[f218345a.charAt(i14)] = i15;
            i14++;
            i15++;
        }
        int i16 = 0;
        int i17 = 0;
        while (i16 < f218346b.length()) {
            iArr3[f218346b.charAt(i16)] = i17;
            i16++;
            i17++;
        }
        f218349e = iArr3;
        long[] jArr = new long[256];
        for (int i18 = 0; i18 < 256; i18++) {
            jArr[i18] = -1;
        }
        int i19 = 0;
        int i20 = 0;
        while (i19 < f218345a.length()) {
            jArr[f218345a.charAt(i19)] = i20;
            i19++;
            i20++;
        }
        int i21 = 0;
        while (i10 < f218346b.length()) {
            jArr[f218346b.charAt(i10)] = i21;
            i10++;
            i21++;
        }
        f218350f = jArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0137 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final byte[] A(java.lang.String r19, int r20, int r21, kotlin.text.HexFormat.BytesHexFormat r22) {
        /*
            Method dump skipped, instruction units count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.C5017i.A(java.lang.String, int, int, kotlin.text.HexFormat$BytesHexFormat):byte[]");
    }

    public static final int B(@NotNull String str, int i10, int i11, @NotNull HexFormat format) {
        kotlin.jvm.internal.G.p(str, "<this>");
        kotlin.jvm.internal.G.p(format, "format");
        return F(str, i10, i11, format, 8);
    }

    @InterfaceC4887e0(version = "2.2")
    @O0(markerClass = {InterfaceC5043v.class})
    public static final int C(@NotNull String str, @NotNull HexFormat format) {
        kotlin.jvm.internal.G.p(str, "<this>");
        kotlin.jvm.internal.G.p(format, "format");
        return B(str, 0, str.length(), format);
    }

    public static int D(String str, int i10, int i11, HexFormat hexFormat, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        if ((i12 & 4) != 0) {
            HexFormat.f218225d.getClass();
            hexFormat = HexFormat.f218226e;
        }
        return B(str, i10, i11, hexFormat);
    }

    public static int E(String str, HexFormat hexFormat, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            HexFormat.f218225d.getClass();
            hexFormat = HexFormat.f218226e;
        }
        return C(str, hexFormat);
    }

    public static final int F(String str, int i10, int i11, HexFormat hexFormat, int i12) {
        AbstractC4859d.f217603a.a(i10, i11, str.length());
        HexFormat.NumberHexFormat numberHexFormat = hexFormat.f218230c;
        if (numberHexFormat.f218248e) {
            g(str, i10, i11, i12);
            return T(str, i10, i11);
        }
        String str2 = numberHexFormat.f218244a;
        String str3 = numberHexFormat.f218245b;
        h(str, i10, i11, str2, str3, numberHexFormat.f218250g, i12);
        return T(str, str2.length() + i10, i11 - str3.length());
    }

    public static final long G(@NotNull String str, int i10, int i11, @NotNull HexFormat format) {
        kotlin.jvm.internal.G.p(str, "<this>");
        kotlin.jvm.internal.G.p(format, "format");
        return K(str, i10, i11, format, 16);
    }

    @InterfaceC4887e0(version = "2.2")
    @O0(markerClass = {InterfaceC5043v.class})
    public static final long H(@NotNull String str, @NotNull HexFormat format) {
        kotlin.jvm.internal.G.p(str, "<this>");
        kotlin.jvm.internal.G.p(format, "format");
        return G(str, 0, str.length(), format);
    }

    public static long I(String str, int i10, int i11, HexFormat hexFormat, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        if ((i12 & 4) != 0) {
            HexFormat.f218225d.getClass();
            hexFormat = HexFormat.f218226e;
        }
        return G(str, i10, i11, hexFormat);
    }

    public static long J(String str, HexFormat hexFormat, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            HexFormat.f218225d.getClass();
            hexFormat = HexFormat.f218226e;
        }
        return H(str, hexFormat);
    }

    public static final long K(String str, int i10, int i11, HexFormat hexFormat, int i12) {
        AbstractC4859d.f217603a.a(i10, i11, str.length());
        HexFormat.NumberHexFormat numberHexFormat = hexFormat.f218230c;
        if (numberHexFormat.f218248e) {
            g(str, i10, i11, i12);
            return U(str, i10, i11);
        }
        String str2 = numberHexFormat.f218244a;
        String str3 = numberHexFormat.f218245b;
        h(str, i10, i11, str2, str3, numberHexFormat.f218250g, i12);
        return U(str, str2.length() + i10, i11 - str3.length());
    }

    public static final short L(String str, int i10, int i11, HexFormat hexFormat) {
        return (short) F(str, i10, i11, hexFormat, 4);
    }

    @InterfaceC4887e0(version = "2.2")
    @O0(markerClass = {InterfaceC5043v.class})
    public static final short M(@NotNull String str, @NotNull HexFormat format) {
        kotlin.jvm.internal.G.p(str, "<this>");
        kotlin.jvm.internal.G.p(format, "format");
        return (short) F(str, 0, str.length(), format, 4);
    }

    public static short N(String str, int i10, int i11, HexFormat hexFormat, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        if ((i12 & 4) != 0) {
            HexFormat.f218225d.getClass();
            hexFormat = HexFormat.f218226e;
        }
        return (short) F(str, i10, i11, hexFormat, 4);
    }

    public static short O(String str, HexFormat hexFormat, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            HexFormat.f218225d.getClass();
            hexFormat = HexFormat.f218226e;
        }
        return M(str, hexFormat);
    }

    public static final long P(String str, int i10, ed.p pVar) {
        char cCharAt = str.charAt(i10);
        if ((cCharAt >>> '\b') == 0) {
            long j10 = f218350f[cCharAt];
            if (j10 >= 0) {
                return j10;
            }
        }
        pVar.invoke(str, Integer.valueOf(i10));
        throw new KotlinNothingValueException();
    }

    public static final byte Q(String str, int i10) {
        int[] iArr;
        int i11;
        int i12;
        char cCharAt = str.charAt(i10);
        if ((cCharAt >>> '\b') != 0 || (i11 = (iArr = f218349e)[cCharAt]) < 0) {
            W(str, i10);
            throw null;
        }
        int i13 = i10 + 1;
        char cCharAt2 = str.charAt(i13);
        if ((cCharAt2 >>> '\b') == 0 && (i12 = iArr[cCharAt2]) >= 0) {
            return (byte) ((i11 << 4) | i12);
        }
        W(str, i13);
        throw null;
    }

    public static final int R(@NotNull String str, int i10, int i11, @NotNull ed.p onError) {
        int i12;
        kotlin.jvm.internal.G.p(str, "<this>");
        kotlin.jvm.internal.G.p(onError, "onError");
        int i13 = 0;
        while (i10 < i11) {
            int i14 = i13 << 4;
            char cCharAt = str.charAt(i10);
            if ((cCharAt >>> '\b') != 0 || (i12 = f218349e[cCharAt]) < 0) {
                onError.invoke(str, Integer.valueOf(i10));
                throw new KotlinNothingValueException();
            }
            i13 = i14 | i12;
            i10++;
        }
        return i13;
    }

    public static final long S(@NotNull String str, int i10, int i11, @NotNull ed.p onError) {
        kotlin.jvm.internal.G.p(str, "<this>");
        kotlin.jvm.internal.G.p(onError, "onError");
        long j10 = 0;
        while (i10 < i11) {
            long j11 = j10 << 4;
            char cCharAt = str.charAt(i10);
            if ((cCharAt >>> '\b') == 0) {
                long j12 = f218350f[cCharAt];
                if (j12 >= 0) {
                    j10 = j11 | j12;
                    i10++;
                }
            }
            onError.invoke(str, Integer.valueOf(i10));
            throw new KotlinNothingValueException();
        }
        return j10;
    }

    public static final int T(String str, int i10, int i11) {
        int i12;
        int i13 = 0;
        while (i10 < i11) {
            int i14 = i13 << 4;
            char cCharAt = str.charAt(i10);
            if ((cCharAt >>> '\b') != 0 || (i12 = f218349e[cCharAt]) < 0) {
                W(str, i10);
                throw null;
            }
            i13 = i14 | i12;
            i10++;
        }
        return i13;
    }

    public static final long U(String str, int i10, int i11) {
        long j10 = 0;
        while (i10 < i11) {
            long j11 = j10 << 4;
            char cCharAt = str.charAt(i10);
            if ((cCharAt >>> '\b') == 0) {
                long j12 = f218350f[cCharAt];
                if (j12 >= 0) {
                    j10 = j11 | j12;
                    i10++;
                }
            }
            W(str, i10);
            throw null;
        }
        return j10;
    }

    public static final int V(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        long jC;
        if (i10 <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        long j10 = ((long) i15) + 2 + ((long) i16);
        long jC2 = c(j10, i12, i14);
        if (i11 <= i12) {
            jC = c(j10, i11, i14);
        } else {
            jC = c(jC2, i11 / i12, i13);
            int i17 = i11 % i12;
            if (i17 != 0) {
                jC = c(j10, i17, i14) + jC + ((long) i13);
            }
        }
        long j11 = i10;
        long jS0 = s0(j11, jC, 1);
        long j12 = j11 - ((jC + 1) * jS0);
        long jS02 = s0(j12, jC2, i13);
        long j13 = j12 - ((jC2 + ((long) i13)) * jS02);
        long jS03 = s0(j13, j10, i14);
        return (int) ((jS02 * ((long) i12)) + (jS0 * ((long) i11)) + jS03 + ((long) (j13 - ((j10 + ((long) i14)) * jS03) > 0 ? 1 : 0)));
    }

    public static final Void W(String str, int i10) {
        StringBuilder sbA = android.support.v4.media.a.a("Expected a hexadecimal digit at index ", i10, ", but was ");
        sbA.append(str.charAt(i10));
        throw new NumberFormatException(sbA.toString());
    }

    public static final void X(String str, int i10, int i11, String str2, int i12) {
        kotlin.jvm.internal.G.n(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(i10, i11);
        kotlin.jvm.internal.G.o(strSubstring, "substring(...)");
        throw new NumberFormatException("Expected " + str2 + ' ' + i12 + " hexadecimal digits at index " + i10 + ", but was \"" + strSubstring + "\" of length " + (i11 - i10));
    }

    public static final void Y(String str, int i10, int i11, String str2, String str3) {
        kotlin.jvm.internal.G.n(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(i10, i11);
        kotlin.jvm.internal.G.o(strSubstring, "substring(...)");
        StringBuilder sbA = androidx.constraintlayout.core.parser.b.a("Expected a hexadecimal number with prefix \"", str2, "\" and suffix \"", str3, "\", but was ");
        sbA.append(strSubstring);
        throw new NumberFormatException(sbA.toString());
    }

    public static final void Z(String str, int i10, int i11, String str2, String str3) {
        int length = str2.length() + i10;
        if (length <= i11) {
            i11 = length;
        }
        kotlin.jvm.internal.G.n(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(i10, i11);
        kotlin.jvm.internal.G.o(strSubstring, "substring(...)");
        StringBuilder sbA = androidx.constraintlayout.core.parser.b.a("Expected ", str3, " \"", str2, "\" at index ");
        sbA.append(i10);
        sbA.append(", but was ");
        sbA.append(strSubstring);
        throw new NumberFormatException(sbA.toString());
    }

    public static final int a0(String str, char[] cArr, int i10) {
        int length = str.length();
        if (length != 0) {
            if (length != 1) {
                str.getChars(0, str.length(), cArr, i10);
            } else {
                cArr[i10] = str.charAt(0);
            }
        }
        return str.length() + i10;
    }

    @InterfaceC4887e0(version = "2.2")
    @O0(markerClass = {InterfaceC5043v.class})
    @NotNull
    public static final String b0(byte b10, @NotNull HexFormat format) {
        kotlin.jvm.internal.G.p(format, "format");
        String str = format.f218228a ? f218346b : f218345a;
        HexFormat.NumberHexFormat numberHexFormat = format.f218230c;
        if (!numberHexFormat.f218249f) {
            return n0(b10, numberHexFormat, str, 8);
        }
        char[] cArr = {str.charAt((b10 >> 4) & 15), str.charAt(b10 & Ascii.SI)};
        if (!numberHexFormat.f218246c) {
            return F.N1(cArr);
        }
        int iNumberOfLeadingZeros = (Integer.numberOfLeadingZeros(b10 & 255) - 24) >> 2;
        return F.P1(cArr, iNumberOfLeadingZeros <= 1 ? iNumberOfLeadingZeros : 1, 0, 2, null);
    }

    public static final long c(long j10, int i10, int i11) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        long j11 = i10;
        return ((j11 - 1) * ((long) i11)) + (j10 * j11);
    }

    @InterfaceC4887e0(version = "2.2")
    @O0(markerClass = {InterfaceC5043v.class})
    @NotNull
    public static final String c0(int i10, @NotNull HexFormat format) {
        kotlin.jvm.internal.G.p(format, "format");
        String str = format.f218228a ? f218346b : f218345a;
        HexFormat.NumberHexFormat numberHexFormat = format.f218230c;
        if (!numberHexFormat.f218249f) {
            return n0(i10, numberHexFormat, str, 32);
        }
        char[] cArr = {str.charAt((i10 >> 28) & 15), str.charAt((i10 >> 24) & 15), str.charAt((i10 >> 20) & 15), str.charAt((i10 >> 16) & 15), str.charAt((i10 >> 12) & 15), str.charAt((i10 >> 8) & 15), str.charAt((i10 >> 4) & 15), str.charAt(i10 & 15)};
        if (!numberHexFormat.f218246c) {
            return F.N1(cArr);
        }
        int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i10) >> 2;
        return F.P1(cArr, iNumberOfLeadingZeros <= 7 ? iNumberOfLeadingZeros : 7, 0, 2, null);
    }

    @kotlin.C
    public static final int d(String str, int i10, int i11, String str2, boolean z10, String str3) {
        if (str2.length() == 0) {
            return i10;
        }
        int length = str2.length();
        for (int i12 = 0; i12 < length; i12++) {
            if (!C5012d.J(str2.charAt(i12), str.charAt(i10 + i12), z10)) {
                Z(str, i10, i11, str2, str3);
                throw null;
            }
        }
        return str2.length() + i10;
    }

    @InterfaceC4887e0(version = "2.2")
    @O0(markerClass = {InterfaceC5043v.class})
    @NotNull
    public static final String d0(long j10, @NotNull HexFormat format) {
        kotlin.jvm.internal.G.p(format, "format");
        String str = format.f218228a ? f218346b : f218345a;
        HexFormat.NumberHexFormat numberHexFormat = format.f218230c;
        if (!numberHexFormat.f218249f) {
            return n0(j10, numberHexFormat, str, 64);
        }
        char[] cArr = {str.charAt((int) ((j10 >> 60) & 15)), str.charAt((int) ((j10 >> 56) & 15)), str.charAt((int) ((j10 >> 52) & 15)), str.charAt((int) ((j10 >> 48) & 15)), str.charAt((int) ((j10 >> 44) & 15)), str.charAt((int) ((j10 >> 40) & 15)), str.charAt((int) ((j10 >> 36) & 15)), str.charAt((int) ((j10 >> 32) & 15)), str.charAt((int) ((j10 >> 28) & 15)), str.charAt((int) ((j10 >> 24) & 15)), str.charAt((int) ((j10 >> 20) & 15)), str.charAt((int) ((j10 >> 16) & 15)), str.charAt((int) ((j10 >> 12) & 15)), str.charAt((int) ((j10 >> 8) & 15)), str.charAt((int) ((j10 >> 4) & 15)), str.charAt((int) (j10 & 15))};
        if (!numberHexFormat.f218246c) {
            return F.N1(cArr);
        }
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j10) >> 2;
        return F.P1(cArr, iNumberOfLeadingZeros <= 15 ? iNumberOfLeadingZeros : 15, 0, 2, null);
    }

    public static final int e(long j10) {
        if (0 <= j10 && j10 <= LruCacheKt.f86729a) {
            return (int) j10;
        }
        throw new IllegalArgumentException("The resulting string length is too big: " + ((Object) N0.t(j10, 10)));
    }

    @InterfaceC4887e0(version = "2.2")
    @O0(markerClass = {InterfaceC5043v.class})
    @NotNull
    public static final String e0(short s10, @NotNull HexFormat format) {
        kotlin.jvm.internal.G.p(format, "format");
        String str = format.f218228a ? f218346b : f218345a;
        HexFormat.NumberHexFormat numberHexFormat = format.f218230c;
        if (!numberHexFormat.f218249f) {
            return n0(s10, numberHexFormat, str, 16);
        }
        char[] cArr = {str.charAt((s10 >> 12) & 15), str.charAt((s10 >> 8) & 15), str.charAt((s10 >> 4) & 15), str.charAt(s10 & 15)};
        if (!numberHexFormat.f218246c) {
            return F.N1(cArr);
        }
        int iNumberOfLeadingZeros = (Integer.numberOfLeadingZeros(s10 & H0.f217455d) - 16) >> 2;
        return F.P1(cArr, iNumberOfLeadingZeros <= 3 ? iNumberOfLeadingZeros : 3, 0, 2, null);
    }

    public static final int f(String str, int i10, int i11) {
        if (str.charAt(i10) == '\r') {
            int i12 = i10 + 1;
            return (i12 >= i11 || str.charAt(i12) != '\n') ? i12 : i10 + 2;
        }
        if (str.charAt(i10) == '\n') {
            return i10 + 1;
        }
        StringBuilder sbA = android.support.v4.media.a.a("Expected a new line at index ", i10, ", but was ");
        sbA.append(str.charAt(i10));
        throw new NumberFormatException(sbA.toString());
    }

    @InterfaceC4887e0(version = "2.2")
    @O0(markerClass = {InterfaceC5043v.class})
    @NotNull
    public static final String f0(@NotNull byte[] bArr, int i10, int i11, @NotNull HexFormat format) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(format, "format");
        AbstractC4859d.f217603a.a(i10, i11, bArr.length);
        if (i10 == i11) {
            return "";
        }
        int[] iArr = format.f218228a ? f218348d : f218347c;
        HexFormat.BytesHexFormat bytesHexFormat = format.f218229b;
        return bytesHexFormat.f218239g ? o0(bArr, i10, i11, bytesHexFormat, iArr) : r0(bArr, i10, i11, bytesHexFormat, iArr);
    }

    public static final void g(String str, int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if (i13 < 1) {
            X(str, i10, i11, "at least", 1);
            throw null;
        }
        if (i13 > i12) {
            i(str, i10, (i13 + i10) - i12);
        }
    }

    @InterfaceC4887e0(version = "2.2")
    @O0(markerClass = {InterfaceC5043v.class})
    @NotNull
    public static final String g0(@NotNull byte[] bArr, @NotNull HexFormat format) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        kotlin.jvm.internal.G.p(format, "format");
        return f0(bArr, 0, bArr.length, format);
    }

    public static final void h(String str, int i10, int i11, String str2, String str3, boolean z10, int i12) {
        if ((i11 - i10) - str2.length() <= str3.length()) {
            Y(str, i10, i11, str2, str3);
            throw null;
        }
        if (str2.length() != 0) {
            int length = str2.length();
            for (int i13 = 0; i13 < length; i13++) {
                if (!C5012d.J(str2.charAt(i13), str.charAt(i10 + i13), z10)) {
                    Z(str, i10, i11, str2, "prefix");
                    throw null;
                }
            }
            i10 += str2.length();
        }
        int length2 = i11 - str3.length();
        if (str3.length() != 0) {
            int length3 = str3.length();
            for (int i14 = 0; i14 < length3; i14++) {
                if (!C5012d.J(str3.charAt(i14), str.charAt(length2 + i14), z10)) {
                    Z(str, length2, i11, str3, "suffix");
                    throw null;
                }
            }
        }
        g(str, i10, length2, i12);
    }

    public static String h0(byte b10, HexFormat hexFormat, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            HexFormat.f218225d.getClass();
            hexFormat = HexFormat.f218226e;
        }
        return b0(b10, hexFormat);
    }

    public static final void i(String str, int i10, int i11) {
        while (i10 < i11) {
            if (str.charAt(i10) != '0') {
                StringBuilder sbA = android.support.v4.media.a.a("Expected the hexadecimal digit '0' at index ", i10, ", but was '");
                sbA.append(str.charAt(i10));
                sbA.append("'.\nThe result won't fit the type being parsed.");
                throw new NumberFormatException(sbA.toString());
            }
            i10++;
        }
    }

    public static String i0(int i10, HexFormat hexFormat, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            HexFormat.f218225d.getClass();
            hexFormat = HexFormat.f218226e;
        }
        return c0(i10, hexFormat);
    }

    public static final int j(String str, int i10, ed.p pVar) {
        int i11;
        char cCharAt = str.charAt(i10);
        if ((cCharAt >>> '\b') == 0 && (i11 = f218349e[cCharAt]) >= 0) {
            return i11;
        }
        pVar.invoke(str, Integer.valueOf(i10));
        throw new KotlinNothingValueException();
    }

    public static String j0(long j10, HexFormat hexFormat, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            HexFormat.f218225d.getClass();
            hexFormat = HexFormat.f218226e;
        }
        return d0(j10, hexFormat);
    }

    public static final int k(byte[] bArr, int i10, String str, String str2, int[] iArr, char[] cArr, int i11) {
        return a0(str2, cArr, l(bArr, i10, iArr, cArr, a0(str, cArr, i11)));
    }

    public static String k0(short s10, HexFormat hexFormat, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            HexFormat.f218225d.getClass();
            hexFormat = HexFormat.f218226e;
        }
        return e0(s10, hexFormat);
    }

    public static final int l(byte[] bArr, int i10, int[] iArr, char[] cArr, int i11) {
        int i12 = iArr[bArr[i10] & 255];
        cArr[i11] = (char) (i12 >> 8);
        cArr[i11 + 1] = (char) (i12 & 255);
        return i11 + 2;
    }

    public static String l0(byte[] bArr, int i10, int i11, HexFormat hexFormat, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = bArr.length;
        }
        if ((i12 & 4) != 0) {
            HexFormat.f218225d.getClass();
            hexFormat = HexFormat.f218226e;
        }
        return f0(bArr, i10, i11, hexFormat);
    }

    public static final int m(int i10, int i11, int i12, int i13) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        long j10 = i11;
        return e((((long) i10) * (((((long) i12) + 2) + ((long) i13)) + j10)) - j10);
    }

    public static String m0(byte[] bArr, HexFormat hexFormat, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            HexFormat.f218225d.getClass();
            hexFormat = HexFormat.f218226e;
        }
        return g0(bArr, hexFormat);
    }

    public static final int n(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i17 = i10 - 1;
        int i18 = i17 / i11;
        int i19 = (i11 - 1) / i12;
        int i20 = i10 % i11;
        if (i20 != 0) {
            i11 = i20;
        }
        int i21 = (i19 * i18) + ((i11 - 1) / i12);
        return e(((((long) i15) + 2 + ((long) i16)) * ((long) i10)) + (((long) ((i17 - i18) - i21)) * ((long) i14)) + (((long) i21) * ((long) i13)) + ((long) i18));
    }

    public static final String n0(long j10, HexFormat.NumberHexFormat numberHexFormat, String str, int i10) {
        if ((i10 & 3) != 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i11 = i10 >> 2;
        int i12 = numberHexFormat.f218247d;
        int i13 = i12 - i11;
        if (i13 < 0) {
            i13 = 0;
        }
        String str2 = numberHexFormat.f218244a;
        String str3 = numberHexFormat.f218245b;
        boolean z10 = numberHexFormat.f218246c;
        int iE = e(((long) str2.length()) + ((long) i13) + ((long) i11) + ((long) str3.length()));
        char[] cArr = new char[iE];
        int iA0 = a0(str2, cArr, 0);
        if (i13 > 0) {
            int i14 = i13 + iA0;
            Arrays.fill(cArr, iA0, i14, str.charAt(0));
            iA0 = i14;
        }
        boolean z11 = z10;
        int i15 = i10;
        for (int i16 = 0; i16 < i11; i16++) {
            i15 -= 4;
            int i17 = (int) ((j10 >> i15) & 15);
            z11 = z11 && i17 == 0 && (i15 >> 2) >= i12;
            if (!z11) {
                cArr[iA0] = str.charAt(i17);
                iA0++;
            }
        }
        int iA02 = a0(str3, cArr, iA0);
        return iA02 == iE ? F.N1(cArr) : F.P1(cArr, 0, iA02, 1, null);
    }

    @NotNull
    public static final int[] o() {
        return f218347c;
    }

    public static final String o0(byte[] bArr, int i10, int i11, HexFormat.BytesHexFormat bytesHexFormat, int[] iArr) {
        return bytesHexFormat.f218240h ? q0(bArr, i10, i11, bytesHexFormat, iArr) : p0(bArr, i10, i11, bytesHexFormat, iArr);
    }

    public static final byte p(String str, int i10, int i11, HexFormat hexFormat) {
        return (byte) F(str, i10, i11, hexFormat, 2);
    }

    public static final String p0(byte[] bArr, int i10, int i11, HexFormat.BytesHexFormat bytesHexFormat, int[] iArr) {
        String str = bytesHexFormat.f218237e;
        String str2 = bytesHexFormat.f218238f;
        String str3 = bytesHexFormat.f218236d;
        char[] cArr = new char[m(i11 - i10, str3.length(), str.length(), str2.length())];
        int iA0 = a0(str2, cArr, l(bArr, i10, iArr, cArr, a0(str, cArr, 0)));
        while (true) {
            i10++;
            if (i10 >= i11) {
                return F.N1(cArr);
            }
            iA0 = a0(str2, cArr, l(bArr, i10, iArr, cArr, a0(str, cArr, a0(str3, cArr, iA0))));
        }
    }

    @InterfaceC4887e0(version = "2.2")
    @O0(markerClass = {InterfaceC5043v.class})
    public static final byte q(@NotNull String str, @NotNull HexFormat format) {
        kotlin.jvm.internal.G.p(str, "<this>");
        kotlin.jvm.internal.G.p(format, "format");
        return (byte) F(str, 0, str.length(), format, 2);
    }

    public static final String q0(byte[] bArr, int i10, int i11, HexFormat.BytesHexFormat bytesHexFormat, int[] iArr) {
        int length = bytesHexFormat.f218236d.length();
        if (length > 1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i12 = i11 - i10;
        int iL = 0;
        if (length == 0) {
            char[] cArr = new char[e(((long) i12) * 2)];
            while (i10 < i11) {
                iL = l(bArr, i10, iArr, cArr, iL);
                i10++;
            }
            return F.N1(cArr);
        }
        char[] cArr2 = new char[e((((long) i12) * 3) - 1)];
        char cCharAt = bytesHexFormat.f218236d.charAt(0);
        int iL2 = l(bArr, i10, iArr, cArr2, 0);
        for (int i13 = i10 + 1; i13 < i11; i13++) {
            cArr2[iL2] = cCharAt;
            iL2 = l(bArr, i13, iArr, cArr2, iL2 + 1);
        }
        return F.N1(cArr2);
    }

    public static byte r(String str, int i10, int i11, HexFormat hexFormat, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        if ((i12 & 4) != 0) {
            HexFormat.f218225d.getClass();
            hexFormat = HexFormat.f218226e;
        }
        return (byte) F(str, i10, i11, hexFormat, 2);
    }

    public static final String r0(byte[] bArr, int i10, int i11, HexFormat.BytesHexFormat bytesHexFormat, int[] iArr) {
        int i12 = bytesHexFormat.f218233a;
        int i13 = bytesHexFormat.f218234b;
        String str = bytesHexFormat.f218237e;
        String str2 = bytesHexFormat.f218238f;
        String str3 = bytesHexFormat.f218236d;
        String str4 = bytesHexFormat.f218235c;
        int iN = n(i11 - i10, i12, i13, str4.length(), str3.length(), str.length(), str2.length());
        char[] cArr = new char[iN];
        int iA0 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i10 < i11) {
            if (i14 == i12) {
                cArr[iA0] = '\n';
                i15 = 0;
                iA0++;
                i14 = 0;
            } else if (i15 == i13) {
                iA0 = a0(str4, cArr, iA0);
                i15 = 0;
            }
            if (i15 != 0) {
                iA0 = a0(str3, cArr, iA0);
            }
            iA0 = a0(str2, cArr, l(bArr, i10, iArr, cArr, a0(str, cArr, iA0)));
            i15++;
            i14++;
            i10++;
        }
        if (iA0 == iN) {
            return F.N1(cArr);
        }
        throw new IllegalStateException("Check failed.");
    }

    public static byte s(String str, HexFormat hexFormat, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            HexFormat.f218225d.getClass();
            hexFormat = HexFormat.f218226e;
        }
        return q(str, hexFormat);
    }

    public static final long s0(long j10, long j11, int i10) {
        if (j10 <= 0 || j11 <= 0) {
            return 0L;
        }
        long j12 = i10;
        return (j10 + j12) / (j11 + j12);
    }

    public static final byte[] t(String str, int i10, int i11, HexFormat hexFormat) {
        byte[] bArrX;
        AbstractC4859d.f217603a.a(i10, i11, str.length());
        if (i10 == i11) {
            return new byte[0];
        }
        HexFormat.BytesHexFormat bytesHexFormat = hexFormat.f218229b;
        return (!bytesHexFormat.f218239g || (bArrX = x(str, i10, i11, bytesHexFormat)) == null) ? A(str, i10, i11, bytesHexFormat) : bArrX;
    }

    @InterfaceC4887e0(version = "2.2")
    @O0(markerClass = {InterfaceC5043v.class})
    @NotNull
    public static final byte[] u(@NotNull String str, @NotNull HexFormat format) {
        kotlin.jvm.internal.G.p(str, "<this>");
        kotlin.jvm.internal.G.p(format, "format");
        return t(str, 0, str.length(), format);
    }

    public static byte[] v(String str, int i10, int i11, HexFormat hexFormat, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        if ((i12 & 4) != 0) {
            HexFormat.f218225d.getClass();
            hexFormat = HexFormat.f218226e;
        }
        return t(str, i10, i11, hexFormat);
    }

    public static byte[] w(String str, HexFormat hexFormat, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            HexFormat.f218225d.getClass();
            hexFormat = HexFormat.f218226e;
        }
        return u(str, hexFormat);
    }

    public static final byte[] x(String str, int i10, int i11, HexFormat.BytesHexFormat bytesHexFormat) {
        return bytesHexFormat.f218240h ? z(str, i10, i11, bytesHexFormat) : y(str, i10, i11, bytesHexFormat);
    }

    public static final byte[] y(String str, int i10, int i11, HexFormat.BytesHexFormat bytesHexFormat) {
        String str2 = bytesHexFormat.f218237e;
        String str3 = bytesHexFormat.f218238f;
        String str4 = bytesHexFormat.f218236d;
        long length = str4.length();
        long length2 = ((long) str2.length()) + 2 + ((long) str3.length()) + length;
        long j10 = i11 - i10;
        int i12 = (int) ((j10 + length) / length2);
        if ((((long) i12) * length2) - length != j10) {
            return null;
        }
        boolean z10 = bytesHexFormat.f218241i;
        byte[] bArr = new byte[i12];
        if (str2.length() != 0) {
            int length3 = str2.length();
            for (int i13 = 0; i13 < length3; i13++) {
                if (!C5012d.J(str2.charAt(i13), str.charAt(i10 + i13), z10)) {
                    Z(str, i10, i11, str2, "byte prefix");
                    throw null;
                }
            }
            i10 += str2.length();
        }
        String strA = androidx.concurrent.futures.a.a(str3, str4, str2);
        int i14 = i12 - 1;
        for (int i15 = 0; i15 < i14; i15++) {
            bArr[i15] = Q(str, i10);
            i10 += 2;
            if (strA.length() != 0) {
                int length4 = strA.length();
                for (int i16 = 0; i16 < length4; i16++) {
                    if (!C5012d.J(strA.charAt(i16), str.charAt(i10 + i16), z10)) {
                        Z(str, i10, i11, strA, "byte suffix + byte separator + byte prefix");
                        throw null;
                    }
                }
                i10 = strA.length() + i10;
            }
        }
        bArr[i14] = Q(str, i10);
        int i17 = i10 + 2;
        if (str3.length() == 0) {
            return bArr;
        }
        int length5 = str3.length();
        for (int i18 = 0; i18 < length5; i18++) {
            if (!C5012d.J(str3.charAt(i18), str.charAt(i17 + i18), z10)) {
                Z(str, i17, i11, str3, "byte suffix");
                throw null;
            }
        }
        return bArr;
    }

    public static final byte[] z(String str, int i10, int i11, HexFormat.BytesHexFormat bytesHexFormat) {
        int length = bytesHexFormat.f218236d.length();
        if (length > 1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i12 = i11 - i10;
        int i13 = 2;
        if (length == 0) {
            if ((i12 & 1) != 0) {
                return null;
            }
            int i14 = i12 >> 1;
            byte[] bArr = new byte[i14];
            int i15 = 0;
            for (int i16 = 0; i16 < i14; i16++) {
                bArr[i16] = Q(str, i15);
                i15 += 2;
            }
            return bArr;
        }
        if (i12 % 3 != 2) {
            return null;
        }
        int i17 = (i12 / 3) + 1;
        byte[] bArr2 = new byte[i17];
        char cCharAt = bytesHexFormat.f218236d.charAt(0);
        bArr2[0] = Q(str, 0);
        for (int i18 = 1; i18 < i17; i18++) {
            if (str.charAt(i13) != cCharAt) {
                String str2 = bytesHexFormat.f218236d;
                boolean z10 = bytesHexFormat.f218241i;
                if (str2.length() == 0) {
                    continue;
                } else {
                    int length2 = str2.length();
                    for (int i19 = 0; i19 < length2; i19++) {
                        if (!C5012d.J(str2.charAt(i19), str.charAt(i13 + i19), z10)) {
                            Z(str, i13, i11, str2, "byte separator");
                            throw null;
                        }
                    }
                    str2.length();
                }
            }
            bArr2[i18] = Q(str, i13 + 1);
            i13 += 3;
        }
        return bArr2;
    }
}
