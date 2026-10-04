package kotlin.text;

import androidx.compose.animation.core.C1610t;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4887e0;
import kotlin.InterfaceC4982o;
import kotlin.InterfaceC4984p;
import kotlin.collections.AbstractC4859d;
import kotlin.collections.C4875q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@kotlin.jvm.internal.V({"SMAP\nStringsJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringsJVM.kt\nkotlin/text/StringsKt__StringsJVMKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,894:1\n1198#2,2:895\n1#3:897\n*S KotlinDebug\n*F\n+ 1 StringsJVM.kt\nkotlin/text/StringsKt__StringsJVMKt\n*L\n73#1:895,2\n*E\n"})
public class F extends E {
    @Xc.f
    public static final String A1(byte[] bytes, int i10, int i11) {
        kotlin.jvm.internal.G.p(bytes, "bytes");
        return new String(bytes, i10, i11, C5013e.f218326b);
    }

    public static /* synthetic */ String A2(String str, char c10, char c11, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return y2(str, c10, c11, z10);
    }

    @Xc.f
    public static final String B1(byte[] bytes, int i10, int i11, Charset charset) {
        kotlin.jvm.internal.G.p(bytes, "bytes");
        kotlin.jvm.internal.G.p(charset, "charset");
        return new String(bytes, i10, i11, charset);
    }

    public static /* synthetic */ String B2(String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return z2(str, str2, str3, z10);
    }

    @Xc.f
    public static final String C1(byte[] bytes, Charset charset) {
        kotlin.jvm.internal.G.p(bytes, "bytes");
        kotlin.jvm.internal.G.p(charset, "charset");
        return new String(bytes, charset);
    }

    @NotNull
    public static final String C2(@NotNull String str, char c10, char c11, boolean z10) {
        kotlin.jvm.internal.G.p(str, "<this>");
        int iK3 = M.K3(str, c10, 0, z10, 2, null);
        return iK3 < 0 ? str : M.f5(str, iK3, iK3 + 1, String.valueOf(c11)).toString();
    }

    @Xc.f
    public static final String D1(char[] chars) {
        kotlin.jvm.internal.G.p(chars, "chars");
        return new String(chars);
    }

    @NotNull
    public static final String D2(@NotNull String str, @NotNull String oldValue, @NotNull String newValue, boolean z10) {
        kotlin.jvm.internal.G.p(str, "<this>");
        kotlin.jvm.internal.G.p(oldValue, "oldValue");
        kotlin.jvm.internal.G.p(newValue, "newValue");
        int iL3 = M.L3(str, oldValue, 0, z10, 2, null);
        return iL3 < 0 ? str : M.f5(str, iL3, oldValue.length() + iL3, newValue).toString();
    }

    @Xc.f
    public static final String E1(char[] chars, int i10, int i11) {
        kotlin.jvm.internal.G.p(chars, "chars");
        return new String(chars, i10, i11);
    }

    public static /* synthetic */ String E2(String str, char c10, char c11, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return C2(str, c10, c11, z10);
    }

    @Xc.f
    public static final String F1(int[] codePoints, int i10, int i11) {
        kotlin.jvm.internal.G.p(codePoints, "codePoints");
        return new String(codePoints, i10, i11);
    }

    public static /* synthetic */ String F2(String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return D2(str, str2, str3, z10);
    }

    @InterfaceC4982o(message = "Use replaceFirstChar instead.", replaceWith = @InterfaceC4852c0(expression = "replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }", imports = {"java.util.Locale"}))
    @InterfaceC4984p(warningSince = "1.5")
    @NotNull
    public static final String G1(@NotNull String str) {
        kotlin.jvm.internal.G.p(str, "<this>");
        Locale locale = Locale.getDefault();
        kotlin.jvm.internal.G.o(locale, "getDefault(...)");
        return H1(str, locale);
    }

    @NotNull
    public static final List<String> G2(@NotNull CharSequence charSequence, @NotNull Pattern regex, int i10) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(regex, "regex");
        M.j5(i10);
        if (i10 == 0) {
            i10 = -1;
        }
        String[] strArrSplit = regex.split(charSequence, i10);
        kotlin.jvm.internal.G.o(strArrSplit, "split(...)");
        return C4875q.t(strArrSplit);
    }

    @InterfaceC4887e0(version = "1.4")
    @NotNull
    @Xc.i
    @InterfaceC4982o(message = "Use replaceFirstChar instead.", replaceWith = @InterfaceC4852c0(expression = "replaceFirstChar { if (it.isLowerCase()) it.titlecase(locale) else it.toString() }", imports = {}))
    @InterfaceC4984p(warningSince = "1.5")
    public static final String H1(@NotNull String str, @NotNull Locale locale) {
        kotlin.jvm.internal.G.p(str, "<this>");
        kotlin.jvm.internal.G.p(locale, "locale");
        if (str.length() <= 0) {
            return str;
        }
        char cCharAt = str.charAt(0);
        if (!Character.isLowerCase(cCharAt)) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        char titleCase = Character.toTitleCase(cCharAt);
        if (titleCase != Character.toUpperCase(cCharAt)) {
            sb2.append(titleCase);
        } else {
            String strSubstring = str.substring(0, 1);
            kotlin.jvm.internal.G.o(strSubstring, "substring(...)");
            String upperCase = strSubstring.toUpperCase(locale);
            kotlin.jvm.internal.G.o(upperCase, "toUpperCase(...)");
            sb2.append(upperCase);
        }
        String strSubstring2 = str.substring(1);
        kotlin.jvm.internal.G.o(strSubstring2, "substring(...)");
        sb2.append(strSubstring2);
        return sb2.toString();
    }

    public static /* synthetic */ List H2(CharSequence charSequence, Pattern pattern, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return G2(charSequence, pattern, i10);
    }

    @Xc.f
    public static final int I1(String str, int i10) {
        kotlin.jvm.internal.G.p(str, "<this>");
        return str.codePointAt(i10);
    }

    public static boolean I2(@NotNull String str, @NotNull String prefix, int i10, boolean z10) {
        kotlin.jvm.internal.G.p(str, "<this>");
        kotlin.jvm.internal.G.p(prefix, "prefix");
        return !z10 ? str.startsWith(prefix, i10) : u2(str, i10, prefix, 0, prefix.length(), z10);
    }

    @Xc.f
    public static final int J1(String str, int i10) {
        kotlin.jvm.internal.G.p(str, "<this>");
        return str.codePointBefore(i10);
    }

    public static boolean J2(@NotNull String str, @NotNull String prefix, boolean z10) {
        kotlin.jvm.internal.G.p(str, "<this>");
        kotlin.jvm.internal.G.p(prefix, "prefix");
        return !z10 ? str.startsWith(prefix) : u2(str, 0, prefix, 0, prefix.length(), z10);
    }

    @Xc.f
    public static final int K1(String str, int i10, int i11) {
        kotlin.jvm.internal.G.p(str, "<this>");
        return str.codePointCount(i10, i11);
    }

    public static /* synthetic */ boolean K2(String str, String str2, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return I2(str, str2, i10, z10);
    }

    public static final int L1(@NotNull String str, @NotNull String other, boolean z10) {
        kotlin.jvm.internal.G.p(str, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        return z10 ? str.compareToIgnoreCase(other) : str.compareTo(other);
    }

    public static /* synthetic */ boolean L2(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return J2(str, str2, z10);
    }

    public static /* synthetic */ int M1(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return L1(str, str2, z10);
    }

    @Xc.f
    public static final String M2(String str, int i10) {
        kotlin.jvm.internal.G.p(str, "<this>");
        String strSubstring = str.substring(i10);
        kotlin.jvm.internal.G.o(strSubstring, "substring(...)");
        return strSubstring;
    }

    @InterfaceC4887e0(version = "1.4")
    @NotNull
    public static String N1(@NotNull char[] cArr) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        return new String(cArr);
    }

    @Xc.f
    public static final String N2(String str, int i10, int i11) {
        kotlin.jvm.internal.G.p(str, "<this>");
        String strSubstring = str.substring(i10, i11);
        kotlin.jvm.internal.G.o(strSubstring, "substring(...)");
        return strSubstring;
    }

    @InterfaceC4887e0(version = "1.4")
    @NotNull
    public static String O1(@NotNull char[] cArr, int i10, int i11) {
        kotlin.jvm.internal.G.p(cArr, "<this>");
        AbstractC4859d.f217603a.a(i10, i11, cArr.length);
        return new String(cArr, i10, i11 - i10);
    }

    @Xc.f
    public static final byte[] O2(String str, Charset charset) {
        kotlin.jvm.internal.G.p(str, "<this>");
        kotlin.jvm.internal.G.p(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        kotlin.jvm.internal.G.o(bytes, "getBytes(...)");
        return bytes;
    }

    public static /* synthetic */ String P1(char[] cArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = cArr.length;
        }
        return O1(cArr, i10, i11);
    }

    public static /* synthetic */ byte[] P2(String str, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = C5013e.f218326b;
        }
        kotlin.jvm.internal.G.p(str, "<this>");
        kotlin.jvm.internal.G.p(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        kotlin.jvm.internal.G.o(bytes, "getBytes(...)");
        return bytes;
    }

    @InterfaceC4887e0(version = "1.5")
    public static boolean Q1(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2) {
        return (!(charSequence instanceof String) || charSequence2 == null) ? M.r3(charSequence, charSequence2) : ((String) charSequence).contentEquals(charSequence2);
    }

    @Xc.f
    public static final char[] Q2(String str) {
        kotlin.jvm.internal.G.p(str, "<this>");
        char[] charArray = str.toCharArray();
        kotlin.jvm.internal.G.o(charArray, "toCharArray(...)");
        return charArray;
    }

    @InterfaceC4887e0(version = "1.5")
    public static final boolean R1(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2, boolean z10) {
        return z10 ? M.q3(charSequence, charSequence2) : Q1(charSequence, charSequence2);
    }

    @InterfaceC4887e0(version = "1.4")
    @NotNull
    public static final char[] R2(@NotNull String str, int i10, int i11) {
        kotlin.jvm.internal.G.p(str, "<this>");
        AbstractC4859d.f217603a.a(i10, i11, str.length());
        char[] cArr = new char[i11 - i10];
        str.getChars(i10, i11, cArr, 0);
        return cArr;
    }

    @Xc.f
    public static final boolean S1(String str, CharSequence charSequence) {
        kotlin.jvm.internal.G.p(str, "<this>");
        kotlin.jvm.internal.G.p(charSequence, "charSequence");
        return str.contentEquals(charSequence);
    }

    @kotlin.C
    @Xc.f
    public static final char[] S2(String str, char[] destination, int i10, int i11, int i12) {
        kotlin.jvm.internal.G.p(str, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        str.getChars(i11, i12, destination, i10);
        return destination;
    }

    @Xc.f
    public static final boolean T1(String str, StringBuffer stringBuilder) {
        kotlin.jvm.internal.G.p(str, "<this>");
        kotlin.jvm.internal.G.p(stringBuilder, "stringBuilder");
        return str.contentEquals(stringBuilder);
    }

    public static /* synthetic */ char[] T2(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return R2(str, i10, i11);
    }

    @InterfaceC4982o(message = "Use replaceFirstChar instead.", replaceWith = @InterfaceC4852c0(expression = "replaceFirstChar { it.lowercase(Locale.getDefault()) }", imports = {"java.util.Locale"}))
    @InterfaceC4984p(warningSince = "1.5")
    @NotNull
    public static final String U1(@NotNull String str) {
        kotlin.jvm.internal.G.p(str, "<this>");
        if (str.length() <= 0 || Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        String strSubstring = str.substring(0, 1);
        kotlin.jvm.internal.G.o(strSubstring, "substring(...)");
        Locale locale = Locale.getDefault();
        kotlin.jvm.internal.G.o(locale, "getDefault(...)");
        String lowerCase = strSubstring.toLowerCase(locale);
        kotlin.jvm.internal.G.o(lowerCase, "toLowerCase(...)");
        String strSubstring2 = str.substring(1);
        kotlin.jvm.internal.G.o(strSubstring2, "substring(...)");
        return lowerCase.concat(strSubstring2);
    }

    public static /* synthetic */ char[] U2(String str, char[] destination, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = str.length();
        }
        kotlin.jvm.internal.G.p(str, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        str.getChars(i11, i12, destination, i10);
        return destination;
    }

    @InterfaceC4887e0(version = "1.4")
    @NotNull
    @Xc.i
    @InterfaceC4982o(message = "Use replaceFirstChar instead.", replaceWith = @InterfaceC4852c0(expression = "replaceFirstChar { it.lowercase(locale) }", imports = {}))
    @InterfaceC4984p(warningSince = "1.5")
    public static final String V1(@NotNull String str, @NotNull Locale locale) {
        kotlin.jvm.internal.G.p(str, "<this>");
        kotlin.jvm.internal.G.p(locale, "locale");
        if (str.length() <= 0 || Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        String strSubstring = str.substring(0, 1);
        kotlin.jvm.internal.G.o(strSubstring, "substring(...)");
        String lowerCase = strSubstring.toLowerCase(locale);
        kotlin.jvm.internal.G.o(lowerCase, "toLowerCase(...)");
        String strSubstring2 = str.substring(1);
        kotlin.jvm.internal.G.o(strSubstring2, "substring(...)");
        return lowerCase.concat(strSubstring2);
    }

    @InterfaceC4982o(message = "Use lowercase() instead.", replaceWith = @InterfaceC4852c0(expression = "lowercase(Locale.getDefault())", imports = {"java.util.Locale"}))
    @InterfaceC4984p(errorSince = "2.1", warningSince = "1.5")
    @Xc.f
    public static final String V2(String str) {
        kotlin.jvm.internal.G.p(str, "<this>");
        String lowerCase = str.toLowerCase();
        kotlin.jvm.internal.G.o(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @InterfaceC4887e0(version = "1.4")
    @NotNull
    public static String W1(@NotNull byte[] bArr) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        return new String(bArr, C5013e.f218326b);
    }

    @InterfaceC4982o(message = "Use lowercase() instead.", replaceWith = @InterfaceC4852c0(expression = "lowercase(locale)", imports = {}))
    @InterfaceC4984p(errorSince = "2.1", warningSince = "1.5")
    @Xc.f
    public static final String W2(String str, Locale locale) {
        kotlin.jvm.internal.G.p(str, "<this>");
        kotlin.jvm.internal.G.p(locale, "locale");
        String lowerCase = str.toLowerCase(locale);
        kotlin.jvm.internal.G.o(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @InterfaceC4887e0(version = "1.4")
    @NotNull
    public static final String X1(@NotNull byte[] bArr, int i10, int i11, boolean z10) {
        kotlin.jvm.internal.G.p(bArr, "<this>");
        AbstractC4859d.f217603a.a(i10, i11, bArr.length);
        if (!z10) {
            return new String(bArr, i10, i11 - i10, C5013e.f218326b);
        }
        CharsetDecoder charsetDecoderNewDecoder = C5013e.f218326b.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        String string = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).decode(ByteBuffer.wrap(bArr, i10, i11 - i10)).toString();
        kotlin.jvm.internal.G.o(string, "toString(...)");
        return string;
    }

    @Xc.f
    public static final Pattern X2(String str, int i10) {
        kotlin.jvm.internal.G.p(str, "<this>");
        Pattern patternCompile = Pattern.compile(str, i10);
        kotlin.jvm.internal.G.o(patternCompile, "compile(...)");
        return patternCompile;
    }

    public static /* synthetic */ String Y1(byte[] bArr, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = bArr.length;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        return X1(bArr, i10, i11, z10);
    }

    public static /* synthetic */ Pattern Y2(String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        kotlin.jvm.internal.G.p(str, "<this>");
        Pattern patternCompile = Pattern.compile(str, i10);
        kotlin.jvm.internal.G.o(patternCompile, "compile(...)");
        return patternCompile;
    }

    @InterfaceC4887e0(version = "1.4")
    @NotNull
    public static byte[] Z1(@NotNull String str) {
        kotlin.jvm.internal.G.p(str, "<this>");
        byte[] bytes = str.getBytes(C5013e.f218326b);
        kotlin.jvm.internal.G.o(bytes, "getBytes(...)");
        return bytes;
    }

    @InterfaceC4982o(message = "Use uppercase() instead.", replaceWith = @InterfaceC4852c0(expression = "uppercase(Locale.getDefault())", imports = {"java.util.Locale"}))
    @InterfaceC4984p(errorSince = "2.1", warningSince = "1.5")
    @Xc.f
    public static final String Z2(String str) {
        kotlin.jvm.internal.G.p(str, "<this>");
        String upperCase = str.toUpperCase();
        kotlin.jvm.internal.G.o(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    @InterfaceC4887e0(version = "1.4")
    @NotNull
    public static final byte[] a2(@NotNull String str, int i10, int i11, boolean z10) throws CharacterCodingException {
        kotlin.jvm.internal.G.p(str, "<this>");
        AbstractC4859d.f217603a.a(i10, i11, str.length());
        if (!z10) {
            String strSubstring = str.substring(i10, i11);
            kotlin.jvm.internal.G.o(strSubstring, "substring(...)");
            byte[] bytes = strSubstring.getBytes(C5013e.f218326b);
            kotlin.jvm.internal.G.o(bytes, "getBytes(...)");
            return bytes;
        }
        CharsetEncoder charsetEncoderNewEncoder = C5013e.f218326b.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        ByteBuffer byteBufferEncode = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).encode(CharBuffer.wrap(str, i10, i11));
        if (byteBufferEncode.hasArray() && byteBufferEncode.arrayOffset() == 0) {
            int iRemaining = byteBufferEncode.remaining();
            byte[] bArrArray = byteBufferEncode.array();
            kotlin.jvm.internal.G.m(bArrArray);
            if (iRemaining == bArrArray.length) {
                byte[] bArrArray2 = byteBufferEncode.array();
                kotlin.jvm.internal.G.m(bArrArray2);
                return bArrArray2;
            }
        }
        byte[] bArr = new byte[byteBufferEncode.remaining()];
        byteBufferEncode.get(bArr);
        return bArr;
    }

    @InterfaceC4982o(message = "Use uppercase() instead.", replaceWith = @InterfaceC4852c0(expression = "uppercase(locale)", imports = {}))
    @InterfaceC4984p(errorSince = "2.1", warningSince = "1.5")
    @Xc.f
    public static final String a3(String str, Locale locale) {
        kotlin.jvm.internal.G.p(str, "<this>");
        kotlin.jvm.internal.G.p(locale, "locale");
        String upperCase = str.toUpperCase(locale);
        kotlin.jvm.internal.G.o(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    public static /* synthetic */ byte[] b2(String str, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        return a2(str, i10, i11, z10);
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final String b3(String str) {
        kotlin.jvm.internal.G.p(str, "<this>");
        String upperCase = str.toUpperCase(Locale.ROOT);
        kotlin.jvm.internal.G.o(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    public static boolean c2(@NotNull String str, @NotNull String suffix, boolean z10) {
        kotlin.jvm.internal.G.p(str, "<this>");
        kotlin.jvm.internal.G.p(suffix, "suffix");
        return !z10 ? str.endsWith(suffix) : u2(str, str.length() - suffix.length(), suffix, 0, suffix.length(), true);
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final String c3(String str, Locale locale) {
        kotlin.jvm.internal.G.p(str, "<this>");
        kotlin.jvm.internal.G.p(locale, "locale");
        String upperCase = str.toUpperCase(locale);
        kotlin.jvm.internal.G.o(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    public static /* synthetic */ boolean d2(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return c2(str, str2, z10);
    }

    public static boolean e2(@Nullable String str, @Nullable String str2, boolean z10) {
        return str == null ? str2 == null : !z10 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static /* synthetic */ boolean f2(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return e2(str, str2, z10);
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final String g2(String str, Locale locale, Object... args) {
        kotlin.jvm.internal.G.p(str, "<this>");
        kotlin.jvm.internal.G.p(args, "args");
        return String.format(locale, str, Arrays.copyOf(args, args.length));
    }

    @Xc.f
    public static final String h2(String str, Object... args) {
        kotlin.jvm.internal.G.p(str, "<this>");
        kotlin.jvm.internal.G.p(args, "args");
        return String.format(str, Arrays.copyOf(args, args.length));
    }

    @Xc.f
    public static final String i2(kotlin.jvm.internal.X x10, String format, Object... args) {
        kotlin.jvm.internal.G.p(x10, "<this>");
        kotlin.jvm.internal.G.p(format, "format");
        kotlin.jvm.internal.G.p(args, "args");
        return String.format(format, Arrays.copyOf(args, args.length));
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final String j2(kotlin.jvm.internal.X x10, Locale locale, String format, Object... args) {
        kotlin.jvm.internal.G.p(x10, "<this>");
        kotlin.jvm.internal.G.p(format, "format");
        kotlin.jvm.internal.G.p(args, "args");
        return String.format(locale, format, Arrays.copyOf(args, args.length));
    }

    @NotNull
    public static Comparator<String> k2(@NotNull kotlin.jvm.internal.X x10) {
        kotlin.jvm.internal.G.p(x10, "<this>");
        Comparator<String> CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
        kotlin.jvm.internal.G.o(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
        return CASE_INSENSITIVE_ORDER;
    }

    @Xc.f
    public static final String l2(String str) {
        kotlin.jvm.internal.G.p(str, "<this>");
        String strIntern = str.intern();
        kotlin.jvm.internal.G.o(strIntern, "intern(...)");
        return strIntern;
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final String m2(String str) {
        kotlin.jvm.internal.G.p(str, "<this>");
        String lowerCase = str.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.G.o(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final String n2(String str, Locale locale) {
        kotlin.jvm.internal.G.p(str, "<this>");
        kotlin.jvm.internal.G.p(locale, "locale");
        String lowerCase = str.toLowerCase(locale);
        kotlin.jvm.internal.G.o(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @Xc.f
    public static final int o2(String str, char c10, int i10) {
        kotlin.jvm.internal.G.p(str, "<this>");
        return str.indexOf(c10, i10);
    }

    @Xc.f
    public static final int p2(String str, String str2, int i10) {
        kotlin.jvm.internal.G.p(str, "<this>");
        kotlin.jvm.internal.G.p(str2, "str");
        return str.indexOf(str2, i10);
    }

    @Xc.f
    public static final int q2(String str, char c10, int i10) {
        kotlin.jvm.internal.G.p(str, "<this>");
        return str.lastIndexOf(c10, i10);
    }

    @Xc.f
    public static final int r2(String str, String str2, int i10) {
        kotlin.jvm.internal.G.p(str, "<this>");
        kotlin.jvm.internal.G.p(str2, "str");
        return str.lastIndexOf(str2, i10);
    }

    @Xc.f
    public static final int s2(String str, int i10, int i11) {
        kotlin.jvm.internal.G.p(str, "<this>");
        return str.offsetByCodePoints(i10, i11);
    }

    public static final boolean t2(@NotNull CharSequence charSequence, int i10, @NotNull CharSequence other, int i11, int i12, boolean z10) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        return ((charSequence instanceof String) && (other instanceof String)) ? u2((String) charSequence, i10, (String) other, i11, i12, z10) : M.x4(charSequence, i10, other, i11, i12, z10);
    }

    public static boolean u2(@NotNull String str, int i10, @NotNull String other, int i11, int i12, boolean z10) {
        kotlin.jvm.internal.G.p(str, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        return !z10 ? str.regionMatches(i10, other, i11, i12) : str.regionMatches(z10, i10, other, i11, i12);
    }

    public static /* synthetic */ boolean v2(CharSequence charSequence, int i10, CharSequence charSequence2, int i11, int i12, boolean z10, int i13, Object obj) {
        if ((i13 & 16) != 0) {
            z10 = false;
        }
        return t2(charSequence, i10, charSequence2, i11, i12, z10);
    }

    public static /* synthetic */ boolean w2(String str, int i10, String str2, int i11, int i12, boolean z10, int i13, Object obj) {
        if ((i13 & 16) != 0) {
            z10 = false;
        }
        return u2(str, i10, str2, i11, i12, z10);
    }

    @Xc.f
    public static final String x1(StringBuffer stringBuffer) {
        kotlin.jvm.internal.G.p(stringBuffer, "stringBuffer");
        return new String(stringBuffer);
    }

    @NotNull
    public static String x2(@NotNull CharSequence charSequence, int i10) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(C1610t.a("Count 'n' must be non-negative, but was ", i10, '.').toString());
        }
        if (i10 == 0) {
            return "";
        }
        int i11 = 1;
        if (i10 == 1) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char cCharAt = charSequence.charAt(0);
            char[] cArr = new char[i10];
            for (int i12 = 0; i12 < i10; i12++) {
                cArr[i12] = cCharAt;
            }
            return new String(cArr);
        }
        StringBuilder sb2 = new StringBuilder(charSequence.length() * i10);
        if (1 <= i10) {
            while (true) {
                sb2.append(charSequence);
                if (i11 == i10) {
                    break;
                }
                i11++;
            }
        }
        String string = sb2.toString();
        kotlin.jvm.internal.G.m(string);
        return string;
    }

    @Xc.f
    public static final String y1(StringBuilder stringBuilder) {
        kotlin.jvm.internal.G.p(stringBuilder, "stringBuilder");
        return new String(stringBuilder);
    }

    @NotNull
    public static final String y2(@NotNull String str, char c10, char c11, boolean z10) {
        kotlin.jvm.internal.G.p(str, "<this>");
        if (!z10) {
            String strReplace = str.replace(c10, c11);
            kotlin.jvm.internal.G.o(strReplace, "replace(...)");
            return strReplace;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (C5012d.J(cCharAt, c10, z10)) {
                cCharAt = c11;
            }
            sb2.append(cCharAt);
        }
        return sb2.toString();
    }

    @Xc.f
    public static final String z1(byte[] bytes) {
        kotlin.jvm.internal.G.p(bytes, "bytes");
        return new String(bytes, C5013e.f218326b);
    }

    @NotNull
    public static final String z2(@NotNull String str, @NotNull String oldValue, @NotNull String newValue, boolean z10) {
        kotlin.jvm.internal.G.p(str, "<this>");
        kotlin.jvm.internal.G.p(oldValue, "oldValue");
        kotlin.jvm.internal.G.p(newValue, "newValue");
        int i10 = 0;
        int iH3 = M.H3(str, oldValue, 0, z10);
        if (iH3 < 0) {
            return str;
        }
        int length = oldValue.length();
        int i11 = length >= 1 ? length : 1;
        int length2 = newValue.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb2 = new StringBuilder(length2);
        do {
            sb2.append((CharSequence) str, i10, iH3);
            sb2.append(newValue);
            i10 = iH3 + length;
            if (iH3 >= str.length()) {
                break;
            }
            iH3 = M.H3(str, oldValue, iH3 + i11, z10);
        } while (iH3 > 0);
        sb2.append((CharSequence) str, i10, str.length());
        String string = sb2.toString();
        kotlin.jvm.internal.G.o(string, "toString(...)");
        return string;
    }
}
