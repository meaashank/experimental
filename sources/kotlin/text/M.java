package kotlin.text;

import androidx.collection.M0;
import androidx.collection.N0;
import ed.InterfaceC4376a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4887e0;
import kotlin.InterfaceC4982o;
import kotlin.InterfaceC4984p;
import kotlin.Pair;
import kotlin.collections.C4875q;
import kotlin.sequences.InterfaceC5000m;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@kotlin.jvm.internal.V({"SMAP\nStrings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Strings.kt\nkotlin/text/StringsKt__StringsKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1660:1\n78#1,22:1661\n112#1,5:1683\n129#1,5:1688\n78#1,22:1693\n106#1:1715\n78#1,22:1716\n112#1,5:1738\n123#1:1743\n112#1,5:1744\n129#1,5:1749\n140#1:1754\n129#1,5:1755\n78#1,22:1760\n112#1,5:1782\n129#1,5:1787\n1088#2,2:1792\n13305#3,2:1794\n13305#3,2:1796\n296#4,2:1798\n296#4,2:1800\n1586#4:1803\n1661#4,3:1804\n1586#4:1807\n1661#4,3:1808\n1#5:1802\n*S KotlinDebug\n*F\n+ 1 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n106#1:1661,22\n123#1:1683,5\n140#1:1688,5\n145#1:1693,22\n150#1:1715\n150#1:1716,22\n155#1:1738,5\n160#1:1743\n160#1:1744,5\n165#1:1749,5\n170#1:1754\n170#1:1755,5\n175#1:1760,22\n186#1:1782,5\n197#1:1787,5\n310#1:1792,2\n976#1:1794,2\n1000#1:1796,2\n1039#1:1798,2\n1045#1:1800,2\n1425#1:1803\n1425#1:1804,3\n1467#1:1807\n1467#1:1808,3\n*E\n"})
public class M extends F {

    public static final class a extends kotlin.collections.F {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f218254a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CharSequence f218255b;

        public a(CharSequence charSequence) {
            this.f218255b = charSequence;
        }

        @Override // kotlin.collections.F
        public char d() {
            CharSequence charSequence = this.f218255b;
            int i10 = this.f218254a;
            this.f218254a = i10 + 1;
            return charSequence.charAt(i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f218254a < this.f218255b.length();
        }
    }

    @kotlin.jvm.internal.V({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,730:1\n1550#2:731\n*E\n"})
    public static final class b implements InterfaceC5000m<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CharSequence f218256a;

        public b(CharSequence charSequence) {
            this.f218256a = charSequence;
        }

        @Override // kotlin.sequences.InterfaceC5000m
        public Iterator<String> iterator() {
            return new C5019k(this.f218256a);
        }
    }

    public static /* synthetic */ Pair A3(CharSequence charSequence, Collection collection, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = C3(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return z3(charSequence, collection, i10, z10);
    }

    @NotNull
    public static final CharSequence A4(@NotNull CharSequence charSequence, int i10, int i11) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        if (i11 < i10) {
            throw new IndexOutOfBoundsException(M0.a("End index (", i11, ") is less than start index (", i10, ")."));
        }
        if (i11 == i10) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb2 = new StringBuilder(charSequence.length() - (i11 - i10));
        sb2.append(charSequence, 0, i10);
        sb2.append(charSequence, i11, charSequence.length());
        return sb2;
    }

    public static final boolean A5(@NotNull CharSequence charSequence, char c10, boolean z10) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        return charSequence.length() > 0 && C5012d.J(charSequence.charAt(0), c10, z10);
    }

    @NotNull
    public static final md.l B3(@NotNull CharSequence charSequence) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        return new md.l(0, charSequence.length() - 1, 1);
    }

    @NotNull
    public static final CharSequence B4(@NotNull CharSequence charSequence, @NotNull md.l range) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(range, "range");
        return A4(charSequence, range.f221139a, range.f221140b + 1);
    }

    public static final boolean B5(@NotNull CharSequence charSequence, @NotNull CharSequence prefix, int i10, boolean z10) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(prefix, "prefix");
        return (!z10 && (charSequence instanceof String) && (prefix instanceof String)) ? F.K2((String) charSequence, (String) prefix, i10, false, 4, null) : x4(charSequence, i10, prefix, 0, prefix.length(), z10);
    }

    public static int C3(@NotNull CharSequence charSequence) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    @Xc.f
    public static final String C4(String str, int i10, int i11) {
        kotlin.jvm.internal.G.p(str, "<this>");
        return A4(str, i10, i11).toString();
    }

    public static final boolean C5(@NotNull CharSequence charSequence, @NotNull CharSequence prefix, boolean z10) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(prefix, "prefix");
        return (!z10 && (charSequence instanceof String) && (prefix instanceof String)) ? F.L2((String) charSequence, (String) prefix, false, 2, null) : x4(charSequence, 0, prefix, 0, prefix.length(), z10);
    }

    public static final boolean D3(@NotNull CharSequence charSequence, int i10) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        return i10 >= 0 && i10 <= charSequence.length() + (-2) && Character.isHighSurrogate(charSequence.charAt(i10)) && Character.isLowSurrogate(charSequence.charAt(i10 + 1));
    }

    @Xc.f
    public static final String D4(String str, md.l range) {
        kotlin.jvm.internal.G.p(str, "<this>");
        kotlin.jvm.internal.G.p(range, "range");
        return B4(str, range).toString();
    }

    public static /* synthetic */ boolean D5(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return A5(charSequence, c10, z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC4887e0(version = "1.3")
    @Xc.f
    public static final <C extends CharSequence & R, R> R E3(C c10, InterfaceC4376a<? extends R> defaultValue) {
        kotlin.jvm.internal.G.p(defaultValue, "defaultValue");
        return Q3(c10) ? defaultValue.invoke() : c10;
    }

    @NotNull
    public static final CharSequence E4(@NotNull CharSequence charSequence, @NotNull CharSequence suffix) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(suffix, "suffix");
        return v3(charSequence, suffix, false, 2, null) ? charSequence.subSequence(0, charSequence.length() - suffix.length()) : charSequence.subSequence(0, charSequence.length());
    }

    public static /* synthetic */ boolean E5(CharSequence charSequence, CharSequence charSequence2, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return B5(charSequence, charSequence2, i10, z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC4887e0(version = "1.3")
    @Xc.f
    public static final <C extends CharSequence & R, R> R F3(C c10, InterfaceC4376a<? extends R> defaultValue) {
        kotlin.jvm.internal.G.p(defaultValue, "defaultValue");
        return c10.length() == 0 ? defaultValue.invoke() : c10;
    }

    @NotNull
    public static String F4(@NotNull String str, @NotNull CharSequence suffix) {
        kotlin.jvm.internal.G.p(str, "<this>");
        kotlin.jvm.internal.G.p(suffix, "suffix");
        if (!v3(str, suffix, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - suffix.length());
        kotlin.jvm.internal.G.o(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ boolean F5(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return C5(charSequence, charSequence2, z10);
    }

    public static final int G3(@NotNull CharSequence charSequence, char c10, int i10, boolean z10) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        return (z10 || !(charSequence instanceof String)) ? N3(charSequence, new char[]{c10}, i10, z10) : ((String) charSequence).indexOf(c10, i10);
    }

    @NotNull
    public static final CharSequence G4(@NotNull CharSequence charSequence, @NotNull CharSequence delimiter) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(delimiter, "delimiter");
        return H4(charSequence, delimiter, delimiter);
    }

    @NotNull
    public static final CharSequence G5(@NotNull CharSequence charSequence, @NotNull md.l range) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(range, "range");
        return charSequence.subSequence(range.f221139a, range.f221140b + 1);
    }

    public static final int H3(@NotNull CharSequence charSequence, @NotNull String string, int i10, boolean z10) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(string, "string");
        return (z10 || !(charSequence instanceof String)) ? J3(charSequence, string, i10, charSequence.length(), z10, false, 16, null) : ((String) charSequence).indexOf(string, i10);
    }

    @NotNull
    public static final CharSequence H4(@NotNull CharSequence charSequence, @NotNull CharSequence prefix, @NotNull CharSequence suffix) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(prefix, "prefix");
        kotlin.jvm.internal.G.p(suffix, "suffix");
        return (charSequence.length() >= suffix.length() + prefix.length() && F5(charSequence, prefix, false, 2, null) && v3(charSequence, suffix, false, 2, null)) ? charSequence.subSequence(prefix.length(), charSequence.length() - suffix.length()) : charSequence.subSequence(0, charSequence.length());
    }

    @InterfaceC4982o(message = "Use parameters named startIndex and endIndex.", replaceWith = @InterfaceC4852c0(expression = "subSequence(startIndex = start, endIndex = end)", imports = {}))
    @InterfaceC4984p(errorSince = "2.3", warningSince = "1.0")
    @Xc.f
    public static final CharSequence H5(String str, int i10, int i11) {
        kotlin.jvm.internal.G.p(str, "<this>");
        return str.subSequence(i10, i11);
    }

    public static final int I3(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11) {
        md.j jVarM0;
        if (z11) {
            int iC3 = C3(charSequence);
            if (i10 > iC3) {
                i10 = iC3;
            }
            if (i11 < 0) {
                i11 = 0;
            }
            jVarM0 = md.u.m0(i10, i11);
        } else {
            if (i10 < 0) {
                i10 = 0;
            }
            int length = charSequence.length();
            if (i11 > length) {
                i11 = length;
            }
            jVarM0 = new md.l(i10, i11, 1);
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int i12 = jVarM0.f221139a;
            int i13 = jVarM0.f221140b;
            int i14 = jVarM0.f221141c;
            if ((i14 <= 0 || i12 > i13) && (i14 >= 0 || i13 > i12)) {
                return -1;
            }
            int i15 = i12;
            while (true) {
                String str = (String) charSequence2;
                boolean z12 = z10;
                if (F.u2(str, 0, (String) charSequence, i15, str.length(), z12)) {
                    return i15;
                }
                if (i15 == i13) {
                    return -1;
                }
                i15 += i14;
                z10 = z12;
            }
        } else {
            boolean z13 = z10;
            int i16 = jVarM0.f221139a;
            int i17 = jVarM0.f221140b;
            int i18 = jVarM0.f221141c;
            if ((i18 <= 0 || i16 > i17) && (i18 >= 0 || i17 > i16)) {
                return -1;
            }
            int i19 = i16;
            while (true) {
                boolean z14 = z13;
                CharSequence charSequence3 = charSequence;
                CharSequence charSequence4 = charSequence2;
                z13 = z14;
                if (x4(charSequence4, 0, charSequence3, i19, charSequence2.length(), z14)) {
                    return i19;
                }
                if (i19 == i17) {
                    return -1;
                }
                i19 += i18;
                charSequence2 = charSequence4;
                charSequence = charSequence3;
            }
        }
    }

    @NotNull
    public static String I4(@NotNull String str, @NotNull CharSequence delimiter) {
        kotlin.jvm.internal.G.p(str, "<this>");
        kotlin.jvm.internal.G.p(delimiter, "delimiter");
        return J4(str, delimiter, delimiter);
    }

    @Xc.f
    public static final String I5(CharSequence charSequence, int i10, int i11) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        return charSequence.subSequence(i10, i11).toString();
    }

    public static /* synthetic */ int J3(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11, int i12, Object obj) {
        if ((i12 & 16) != 0) {
            z11 = false;
        }
        return I3(charSequence, charSequence2, i10, i11, z10, z11);
    }

    @NotNull
    public static final String J4(@NotNull String str, @NotNull CharSequence prefix, @NotNull CharSequence suffix) {
        kotlin.jvm.internal.G.p(str, "<this>");
        kotlin.jvm.internal.G.p(prefix, "prefix");
        kotlin.jvm.internal.G.p(suffix, "suffix");
        if (str.length() < suffix.length() + prefix.length() || !F5(str, prefix, false, 2, null) || !v3(str, suffix, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(prefix.length(), str.length() - suffix.length());
        kotlin.jvm.internal.G.o(strSubstring, "substring(...)");
        return strSubstring;
    }

    @NotNull
    public static final String J5(@NotNull CharSequence charSequence, @NotNull md.l range) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(range, "range");
        return charSequence.subSequence(range.f221139a, range.f221140b + 1).toString();
    }

    public static /* synthetic */ int K3(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return G3(charSequence, c10, i10, z10);
    }

    @Xc.f
    public static final String K4(CharSequence charSequence, Regex regex, ed.l<? super InterfaceC5023o, ? extends CharSequence> transform) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(regex, "regex");
        kotlin.jvm.internal.G.p(transform, "transform");
        return regex.o(charSequence, transform);
    }

    @NotNull
    public static String K5(@NotNull String str, @NotNull md.l range) {
        kotlin.jvm.internal.G.p(str, "<this>");
        kotlin.jvm.internal.G.p(range, "range");
        String strSubstring = str.substring(range.f221139a, range.f221140b + 1);
        kotlin.jvm.internal.G.o(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ int L3(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return H3(charSequence, str, i10, z10);
    }

    @Xc.f
    public static final String L4(CharSequence charSequence, Regex regex, String replacement) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(regex, "regex");
        kotlin.jvm.internal.G.p(replacement, "replacement");
        return regex.p(charSequence, replacement);
    }

    public static /* synthetic */ String L5(CharSequence charSequence, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = charSequence.length();
        }
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        return charSequence.subSequence(i10, i11).toString();
    }

    public static final int M3(@NotNull CharSequence charSequence, @NotNull Collection<String> strings, int i10, boolean z10) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(strings, "strings");
        Pair<Integer, String> pairX3 = x3(charSequence, strings, i10, z10, false);
        if (pairX3 != null) {
            return pairX3.f217467a.intValue();
        }
        return -1;
    }

    @NotNull
    public static final String M4(@NotNull String str, char c10, @NotNull String replacement, @NotNull String missingDelimiterValue) {
        kotlin.jvm.internal.G.p(str, "<this>");
        kotlin.jvm.internal.G.p(replacement, "replacement");
        kotlin.jvm.internal.G.p(missingDelimiterValue, "missingDelimiterValue");
        int iK3 = K3(str, c10, 0, false, 6, null);
        return iK3 == -1 ? missingDelimiterValue : f5(str, iK3 + 1, str.length(), replacement).toString();
    }

    @NotNull
    public static final String M5(@NotNull String str, char c10, @NotNull String missingDelimiterValue) {
        kotlin.jvm.internal.G.p(str, "<this>");
        kotlin.jvm.internal.G.p(missingDelimiterValue, "missingDelimiterValue");
        int iK3 = K3(str, c10, 0, false, 6, null);
        if (iK3 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iK3 + 1, str.length());
        kotlin.jvm.internal.G.o(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final int N3(@NotNull CharSequence charSequence, @NotNull char[] chars, int i10, boolean z10) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(chars, "chars");
        if (!z10 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(kotlin.collections.B.qt(chars), i10);
        }
        if (i10 < 0) {
            i10 = 0;
        }
        int iC3 = C3(charSequence);
        if (i10 > iC3) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i10);
            for (char c10 : chars) {
                if (C5012d.J(c10, cCharAt, z10)) {
                    return i10;
                }
            }
            if (i10 == iC3) {
                return -1;
            }
            i10++;
        }
    }

    @NotNull
    public static final String N4(@NotNull String str, @NotNull String delimiter, @NotNull String replacement, @NotNull String missingDelimiterValue) {
        kotlin.jvm.internal.G.p(str, "<this>");
        kotlin.jvm.internal.G.p(delimiter, "delimiter");
        kotlin.jvm.internal.G.p(replacement, "replacement");
        kotlin.jvm.internal.G.p(missingDelimiterValue, "missingDelimiterValue");
        int iL3 = L3(str, delimiter, 0, false, 6, null);
        return iL3 == -1 ? missingDelimiterValue : f5(str, delimiter.length() + iL3, str.length(), replacement).toString();
    }

    @NotNull
    public static final String N5(@NotNull String str, @NotNull String delimiter, @NotNull String missingDelimiterValue) {
        kotlin.jvm.internal.G.p(str, "<this>");
        kotlin.jvm.internal.G.p(delimiter, "delimiter");
        kotlin.jvm.internal.G.p(missingDelimiterValue, "missingDelimiterValue");
        int iL3 = L3(str, delimiter, 0, false, 6, null);
        if (iL3 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(delimiter.length() + iL3, str.length());
        kotlin.jvm.internal.G.o(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ int O3(CharSequence charSequence, Collection collection, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return M3(charSequence, collection, i10, z10);
    }

    public static /* synthetic */ String O4(String str, char c10, String str2, String str3, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str3 = str;
        }
        return M4(str, c10, str2, str3);
    }

    public static /* synthetic */ String O5(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return M5(str, c10, str2);
    }

    public static /* synthetic */ int P3(CharSequence charSequence, char[] cArr, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return N3(charSequence, cArr, i10, z10);
    }

    public static /* synthetic */ String P4(String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str4 = str;
        }
        return N4(str, str2, str3, str4);
    }

    public static /* synthetic */ String P5(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return N5(str, str2, str3);
    }

    public static boolean Q3(@NotNull CharSequence charSequence) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            if (!C5011c.r(charSequence.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public static final String Q4(@NotNull String str, char c10, @NotNull String replacement, @NotNull String missingDelimiterValue) {
        kotlin.jvm.internal.G.p(str, "<this>");
        kotlin.jvm.internal.G.p(replacement, "replacement");
        kotlin.jvm.internal.G.p(missingDelimiterValue, "missingDelimiterValue");
        int iZ3 = Z3(str, c10, 0, false, 6, null);
        return iZ3 == -1 ? missingDelimiterValue : f5(str, iZ3 + 1, str.length(), replacement).toString();
    }

    @NotNull
    public static String Q5(@NotNull String str, char c10, @NotNull String missingDelimiterValue) {
        kotlin.jvm.internal.G.p(str, "<this>");
        kotlin.jvm.internal.G.p(missingDelimiterValue, "missingDelimiterValue");
        int iZ3 = Z3(str, c10, 0, false, 6, null);
        if (iZ3 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iZ3 + 1, str.length());
        kotlin.jvm.internal.G.o(strSubstring, "substring(...)");
        return strSubstring;
    }

    @Xc.f
    public static final boolean R3(CharSequence charSequence) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        return charSequence.length() == 0;
    }

    @NotNull
    public static final String R4(@NotNull String str, @NotNull String delimiter, @NotNull String replacement, @NotNull String missingDelimiterValue) {
        kotlin.jvm.internal.G.p(str, "<this>");
        kotlin.jvm.internal.G.p(delimiter, "delimiter");
        kotlin.jvm.internal.G.p(replacement, "replacement");
        kotlin.jvm.internal.G.p(missingDelimiterValue, "missingDelimiterValue");
        int iA4 = a4(str, delimiter, 0, false, 6, null);
        return iA4 == -1 ? missingDelimiterValue : f5(str, delimiter.length() + iA4, str.length(), replacement).toString();
    }

    @NotNull
    public static String R5(@NotNull String str, @NotNull String delimiter, @NotNull String missingDelimiterValue) {
        kotlin.jvm.internal.G.p(str, "<this>");
        kotlin.jvm.internal.G.p(delimiter, "delimiter");
        kotlin.jvm.internal.G.p(missingDelimiterValue, "missingDelimiterValue");
        int iA4 = a4(str, delimiter, 0, false, 6, null);
        if (iA4 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(delimiter.length() + iA4, str.length());
        kotlin.jvm.internal.G.o(strSubstring, "substring(...)");
        return strSubstring;
    }

    @Xc.f
    public static final boolean S3(CharSequence charSequence) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        return !Q3(charSequence);
    }

    public static /* synthetic */ String S4(String str, char c10, String str2, String str3, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str3 = str;
        }
        return Q4(str, c10, str2, str3);
    }

    public static /* synthetic */ String S5(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return Q5(str, c10, str2);
    }

    @Xc.f
    public static final boolean T3(CharSequence charSequence) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        return charSequence.length() > 0;
    }

    public static /* synthetic */ String T4(String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str4 = str;
        }
        return R4(str, str2, str3, str4);
    }

    public static /* synthetic */ String T5(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return R5(str, str2, str3);
    }

    @Xc.f
    public static final boolean U3(CharSequence charSequence) {
        return charSequence == null || Q3(charSequence);
    }

    @NotNull
    public static final String U4(@NotNull String str, char c10, @NotNull String replacement, @NotNull String missingDelimiterValue) {
        kotlin.jvm.internal.G.p(str, "<this>");
        kotlin.jvm.internal.G.p(replacement, "replacement");
        kotlin.jvm.internal.G.p(missingDelimiterValue, "missingDelimiterValue");
        int iK3 = K3(str, c10, 0, false, 6, null);
        return iK3 == -1 ? missingDelimiterValue : f5(str, 0, iK3, replacement).toString();
    }

    @NotNull
    public static final String U5(@NotNull String str, char c10, @NotNull String missingDelimiterValue) {
        kotlin.jvm.internal.G.p(str, "<this>");
        kotlin.jvm.internal.G.p(missingDelimiterValue, "missingDelimiterValue");
        int iK3 = K3(str, c10, 0, false, 6, null);
        if (iK3 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iK3);
        kotlin.jvm.internal.G.o(strSubstring, "substring(...)");
        return strSubstring;
    }

    @Xc.f
    public static final boolean V3(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    @NotNull
    public static final String V4(@NotNull String str, @NotNull String delimiter, @NotNull String replacement, @NotNull String missingDelimiterValue) {
        kotlin.jvm.internal.G.p(str, "<this>");
        kotlin.jvm.internal.G.p(delimiter, "delimiter");
        kotlin.jvm.internal.G.p(replacement, "replacement");
        kotlin.jvm.internal.G.p(missingDelimiterValue, "missingDelimiterValue");
        int iL3 = L3(str, delimiter, 0, false, 6, null);
        return iL3 == -1 ? missingDelimiterValue : f5(str, 0, iL3, replacement).toString();
    }

    @NotNull
    public static final String V5(@NotNull String str, @NotNull String delimiter, @NotNull String missingDelimiterValue) {
        kotlin.jvm.internal.G.p(str, "<this>");
        kotlin.jvm.internal.G.p(delimiter, "delimiter");
        kotlin.jvm.internal.G.p(missingDelimiterValue, "missingDelimiterValue");
        int iL3 = L3(str, delimiter, 0, false, 6, null);
        if (iL3 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iL3);
        kotlin.jvm.internal.G.o(strSubstring, "substring(...)");
        return strSubstring;
    }

    @NotNull
    public static final kotlin.collections.F W3(@NotNull CharSequence charSequence) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        return new a(charSequence);
    }

    public static /* synthetic */ String W4(String str, char c10, String str2, String str3, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str3 = str;
        }
        return U4(str, c10, str2, str3);
    }

    public static /* synthetic */ String W5(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return U5(str, c10, str2);
    }

    public static final int X3(@NotNull CharSequence charSequence, char c10, int i10, boolean z10) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        return (z10 || !(charSequence instanceof String)) ? c4(charSequence, new char[]{c10}, i10, z10) : ((String) charSequence).lastIndexOf(c10, i10);
    }

    public static /* synthetic */ String X4(String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str4 = str;
        }
        return V4(str, str2, str3, str4);
    }

    public static /* synthetic */ String X5(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return V5(str, str2, str3);
    }

    public static final int Y3(@NotNull CharSequence charSequence, @NotNull String string, int i10, boolean z10) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(string, "string");
        return (z10 || !(charSequence instanceof String)) ? I3(charSequence, string, i10, 0, z10, true) : ((String) charSequence).lastIndexOf(string, i10);
    }

    @NotNull
    public static final String Y4(@NotNull String str, char c10, @NotNull String replacement, @NotNull String missingDelimiterValue) {
        kotlin.jvm.internal.G.p(str, "<this>");
        kotlin.jvm.internal.G.p(replacement, "replacement");
        kotlin.jvm.internal.G.p(missingDelimiterValue, "missingDelimiterValue");
        int iZ3 = Z3(str, c10, 0, false, 6, null);
        return iZ3 == -1 ? missingDelimiterValue : f5(str, 0, iZ3, replacement).toString();
    }

    @NotNull
    public static final String Y5(@NotNull String str, char c10, @NotNull String missingDelimiterValue) {
        kotlin.jvm.internal.G.p(str, "<this>");
        kotlin.jvm.internal.G.p(missingDelimiterValue, "missingDelimiterValue");
        int iZ3 = Z3(str, c10, 0, false, 6, null);
        if (iZ3 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iZ3);
        kotlin.jvm.internal.G.o(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ int Z3(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = C3(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return X3(charSequence, c10, i10, z10);
    }

    @NotNull
    public static final String Z4(@NotNull String str, @NotNull String delimiter, @NotNull String replacement, @NotNull String missingDelimiterValue) {
        kotlin.jvm.internal.G.p(str, "<this>");
        kotlin.jvm.internal.G.p(delimiter, "delimiter");
        kotlin.jvm.internal.G.p(replacement, "replacement");
        kotlin.jvm.internal.G.p(missingDelimiterValue, "missingDelimiterValue");
        int iA4 = a4(str, delimiter, 0, false, 6, null);
        return iA4 == -1 ? missingDelimiterValue : f5(str, 0, iA4, replacement).toString();
    }

    @NotNull
    public static final String Z5(@NotNull String str, @NotNull String delimiter, @NotNull String missingDelimiterValue) {
        kotlin.jvm.internal.G.p(str, "<this>");
        kotlin.jvm.internal.G.p(delimiter, "delimiter");
        kotlin.jvm.internal.G.p(missingDelimiterValue, "missingDelimiterValue");
        int iA4 = a4(str, delimiter, 0, false, 6, null);
        if (iA4 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iA4);
        kotlin.jvm.internal.G.o(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ int a4(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = C3(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return Y3(charSequence, str, i10, z10);
    }

    public static /* synthetic */ String a5(String str, char c10, String str2, String str3, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str3 = str;
        }
        return Y4(str, c10, str2, str3);
    }

    public static /* synthetic */ String a6(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return Y5(str, c10, str2);
    }

    public static final int b4(@NotNull CharSequence charSequence, @NotNull Collection<String> strings, int i10, boolean z10) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(strings, "strings");
        Pair<Integer, String> pairX3 = x3(charSequence, strings, i10, z10, true);
        if (pairX3 != null) {
            return pairX3.f217467a.intValue();
        }
        return -1;
    }

    public static /* synthetic */ String b5(String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str4 = str;
        }
        return Z4(str, str2, str3, str4);
    }

    public static /* synthetic */ String b6(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return Z5(str, str2, str3);
    }

    public static final int c4(@NotNull CharSequence charSequence, @NotNull char[] chars, int i10, boolean z10) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(chars, "chars");
        if (!z10 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(kotlin.collections.B.qt(chars), i10);
        }
        int iC3 = C3(charSequence);
        if (i10 > iC3) {
            i10 = iC3;
        }
        while (-1 < i10) {
            char cCharAt = charSequence.charAt(i10);
            for (char c10 : chars) {
                if (C5012d.J(c10, cCharAt, z10)) {
                    return i10;
                }
            }
            i10--;
        }
        return -1;
    }

    @Xc.f
    public static final String c5(CharSequence charSequence, Regex regex, String replacement) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(regex, "regex");
        kotlin.jvm.internal.G.p(replacement, "replacement");
        return regex.q(charSequence, replacement);
    }

    @InterfaceC4887e0(version = "1.5")
    public static final boolean c6(@NotNull String str) {
        kotlin.jvm.internal.G.p(str, "<this>");
        if (str.equals("true")) {
            return true;
        }
        if (str.equals("false")) {
            return false;
        }
        throw new IllegalArgumentException("The string doesn't represent a boolean value: ".concat(str));
    }

    public static /* synthetic */ int d4(CharSequence charSequence, Collection collection, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = C3(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return b4(charSequence, collection, i10, z10);
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    @dd.j(name = "replaceFirstCharWithChar")
    @kotlin.V
    public static final String d5(String str, ed.l<? super Character, Character> transform) {
        kotlin.jvm.internal.G.p(str, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        if (str.length() <= 0) {
            return str;
        }
        char cCharValue = transform.invoke(Character.valueOf(str.charAt(0))).charValue();
        String strSubstring = str.substring(1);
        kotlin.jvm.internal.G.o(strSubstring, "substring(...)");
        return cCharValue + strSubstring;
    }

    @InterfaceC4887e0(version = "1.5")
    @Nullable
    public static final Boolean d6(@NotNull String str) {
        kotlin.jvm.internal.G.p(str, "<this>");
        if (str.equals("true")) {
            return Boolean.TRUE;
        }
        if (str.equals("false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static /* synthetic */ int e4(CharSequence charSequence, char[] cArr, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = C3(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return c4(charSequence, cArr, i10, z10);
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    @dd.j(name = "replaceFirstCharWithCharSequence")
    @kotlin.V
    public static final String e5(String str, ed.l<? super Character, ? extends CharSequence> transform) {
        kotlin.jvm.internal.G.p(str, "<this>");
        kotlin.jvm.internal.G.p(transform, "transform");
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) transform.invoke(Character.valueOf(str.charAt(0))));
        String strSubstring = str.substring(1);
        kotlin.jvm.internal.G.o(strSubstring, "substring(...)");
        sb2.append(strSubstring);
        return sb2.toString();
    }

    @NotNull
    public static CharSequence e6(@NotNull CharSequence charSequence) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean zR = C5011c.r(charSequence.charAt(!z10 ? i10 : length));
            if (z10) {
                if (!zR) {
                    break;
                }
                length--;
            } else if (zR) {
                i10++;
            } else {
                z10 = true;
            }
        }
        return charSequence.subSequence(i10, length + 1);
    }

    @NotNull
    public static final InterfaceC5000m<String> f4(@NotNull CharSequence charSequence) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        return new b(charSequence);
    }

    @NotNull
    public static CharSequence f5(@NotNull CharSequence charSequence, int i10, int i11, @NotNull CharSequence replacement) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(replacement, "replacement");
        if (i11 < i10) {
            throw new IndexOutOfBoundsException(M0.a("End index (", i11, ") is less than start index (", i10, ")."));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(charSequence, 0, i10);
        sb2.append(replacement);
        sb2.append(charSequence, i11, charSequence.length());
        return sb2;
    }

    @NotNull
    public static final CharSequence f6(@NotNull CharSequence charSequence, @NotNull ed.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = charSequence.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean zBooleanValue = ((Boolean) L.a(charSequence, !z10 ? i10 : length, predicate)).booleanValue();
            if (z10) {
                if (!zBooleanValue) {
                    break;
                }
                length--;
            } else if (zBooleanValue) {
                i10++;
            } else {
                z10 = true;
            }
        }
        return charSequence.subSequence(i10, length + 1);
    }

    @NotNull
    public static final List<String> g4(@NotNull CharSequence charSequence) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        return SequencesKt___SequencesKt.I3(f4(charSequence));
    }

    @NotNull
    public static final CharSequence g5(@NotNull CharSequence charSequence, @NotNull md.l range, @NotNull CharSequence replacement) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(range, "range");
        kotlin.jvm.internal.G.p(replacement, "replacement");
        return f5(charSequence, range.f221139a, range.f221140b + 1, replacement);
    }

    @NotNull
    public static final CharSequence g6(@NotNull CharSequence charSequence, @NotNull char... chars) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(chars, "chars");
        int length = charSequence.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean zW8 = kotlin.collections.B.w8(chars, charSequence.charAt(!z10 ? i10 : length));
            if (z10) {
                if (!zW8) {
                    break;
                }
                length--;
            } else if (zW8) {
                i10++;
            } else {
                z10 = true;
            }
        }
        return charSequence.subSequence(i10, length + 1);
    }

    @NotNull
    public static final String h3(@NotNull CharSequence charSequence, @NotNull CharSequence other, boolean z10) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        int iMin = Math.min(charSequence.length(), other.length());
        int i10 = 0;
        while (i10 < iMin && C5012d.J(charSequence.charAt(i10), other.charAt(i10), z10)) {
            i10++;
        }
        int i11 = i10 - 1;
        if (D3(charSequence, i11) || D3(other, i11)) {
            i10--;
        }
        return charSequence.subSequence(0, i10).toString();
    }

    @Xc.f
    public static final boolean h4(CharSequence charSequence, Regex regex) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(regex, "regex");
        return regex.m(charSequence);
    }

    @Xc.f
    public static final String h5(String str, int i10, int i11, CharSequence replacement) {
        kotlin.jvm.internal.G.p(str, "<this>");
        kotlin.jvm.internal.G.p(replacement, "replacement");
        return f5(str, i10, i11, replacement).toString();
    }

    @Xc.f
    public static final String h6(String str) {
        kotlin.jvm.internal.G.p(str, "<this>");
        return e6(str).toString();
    }

    public static /* synthetic */ String i3(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return h3(charSequence, charSequence2, z10);
    }

    @Xc.f
    public static final String i4(String str) {
        return str == null ? "" : str;
    }

    @Xc.f
    public static final String i5(String str, md.l range, CharSequence replacement) {
        kotlin.jvm.internal.G.p(str, "<this>");
        kotlin.jvm.internal.G.p(range, "range");
        kotlin.jvm.internal.G.p(replacement, "replacement");
        return g5(str, range, replacement).toString();
    }

    @NotNull
    public static final String i6(@NotNull String str, @NotNull ed.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.G.p(str, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = str.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean zBooleanValue = predicate.invoke(Character.valueOf(str.charAt(!z10 ? i10 : length))).booleanValue();
            if (z10) {
                if (!zBooleanValue) {
                    break;
                }
                length--;
            } else if (zBooleanValue) {
                i10++;
            } else {
                z10 = true;
            }
        }
        return str.subSequence(i10, length + 1).toString();
    }

    @NotNull
    public static final String j3(@NotNull CharSequence charSequence, @NotNull CharSequence other, boolean z10) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        int length = charSequence.length();
        int iMin = Math.min(length, other.length());
        int i10 = 0;
        while (i10 < iMin && C5012d.J(charSequence.charAt((length - i10) - 1), other.charAt((r1 - i10) - 1), z10)) {
            i10++;
        }
        if (D3(charSequence, (length - i10) - 1) || D3(other, (r1 - i10) - 1)) {
            i10--;
        }
        return charSequence.subSequence(length - i10, length).toString();
    }

    @NotNull
    public static final CharSequence j4(@NotNull CharSequence charSequence, int i10, char c10) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(N0.a("Desired length ", i10, " is less than zero."));
        }
        if (i10 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb2 = new StringBuilder(i10);
        sb2.append(charSequence);
        int length = i10 - charSequence.length();
        int i11 = 1;
        if (1 <= length) {
            while (true) {
                sb2.append(c10);
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        return sb2;
    }

    public static final void j5(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.c.a("Limit must be non-negative, but was ", i10).toString());
        }
    }

    @NotNull
    public static final String j6(@NotNull String str, @NotNull char... chars) {
        kotlin.jvm.internal.G.p(str, "<this>");
        kotlin.jvm.internal.G.p(chars, "chars");
        int length = str.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean zW8 = kotlin.collections.B.w8(chars, str.charAt(!z10 ? i10 : length));
            if (z10) {
                if (!zW8) {
                    break;
                }
                length--;
            } else if (zW8) {
                i10++;
            } else {
                z10 = true;
            }
        }
        return str.subSequence(i10, length + 1).toString();
    }

    public static /* synthetic */ String k3(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return j3(charSequence, charSequence2, z10);
    }

    @NotNull
    public static final String k4(@NotNull String str, int i10, char c10) {
        kotlin.jvm.internal.G.p(str, "<this>");
        return j4(str, i10, c10).toString();
    }

    public static final int k5(@NotNull String str, int i10, @NotNull ed.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.G.p(str, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        while (i10 < str.length() && predicate.invoke(Character.valueOf(str.charAt(i10))).booleanValue()) {
            i10++;
        }
        return i10;
    }

    @NotNull
    public static final CharSequence k6(@NotNull CharSequence charSequence) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        int length = charSequence.length() - 1;
        if (length < 0) {
            return "";
        }
        while (true) {
            int i10 = length - 1;
            if (!C5011c.r(charSequence.charAt(length))) {
                return charSequence.subSequence(0, length + 1);
            }
            if (i10 < 0) {
                return "";
            }
            length = i10;
        }
    }

    public static final boolean l3(@NotNull CharSequence charSequence, char c10, boolean z10) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        return K3(charSequence, c10, 0, z10, 2, null) >= 0;
    }

    public static /* synthetic */ CharSequence l4(CharSequence charSequence, int i10, char c10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            c10 = ' ';
        }
        return j4(charSequence, i10, c10);
    }

    @Xc.f
    public static final List<String> l5(CharSequence charSequence, Regex regex, int i10) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(regex, "regex");
        return regex.r(charSequence, i10);
    }

    @NotNull
    public static final CharSequence l6(@NotNull CharSequence charSequence, @NotNull ed.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = charSequence.length() - 1;
        if (length < 0) {
            return "";
        }
        while (true) {
            int i10 = length - 1;
            if (!((Boolean) L.a(charSequence, length, predicate)).booleanValue()) {
                return charSequence.subSequence(0, length + 1);
            }
            if (i10 < 0) {
                return "";
            }
            length = i10;
        }
    }

    public static boolean m3(@NotNull CharSequence charSequence, @NotNull CharSequence other, boolean z10) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        return other instanceof String ? L3(charSequence, (String) other, 0, z10, 2, null) >= 0 : J3(charSequence, other, 0, charSequence.length(), z10, false, 16, null) >= 0;
    }

    public static /* synthetic */ String m4(String str, int i10, char c10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            c10 = ' ';
        }
        return k4(str, i10, c10);
    }

    @NotNull
    public static final List<String> m5(@NotNull CharSequence charSequence, @NotNull char[] delimiters, boolean z10, int i10) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(delimiters, "delimiters");
        if (delimiters.length == 1) {
            return o5(charSequence, String.valueOf(delimiters[0]), z10, i10);
        }
        Iterable iterableL0 = SequencesKt___SequencesKt.l0(t4(charSequence, delimiters, 0, z10, i10, 2, null));
        ArrayList arrayList = new ArrayList(kotlin.collections.J.d0(iterableL0, 10));
        Iterator it = ((SequencesKt___SequencesKt.a) iterableL0).f218097a.iterator();
        while (it.hasNext()) {
            arrayList.add(J5(charSequence, (md.l) it.next()));
        }
        return arrayList;
    }

    @NotNull
    public static final CharSequence m6(@NotNull CharSequence charSequence, @NotNull char... chars) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(chars, "chars");
        int length = charSequence.length() - 1;
        if (length < 0) {
            return "";
        }
        while (true) {
            int i10 = length - 1;
            if (!kotlin.collections.B.w8(chars, charSequence.charAt(length))) {
                return charSequence.subSequence(0, length + 1);
            }
            if (i10 < 0) {
                return "";
            }
            length = i10;
        }
    }

    @Xc.f
    public static final boolean n3(CharSequence charSequence, Regex regex) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(regex, "regex");
        return regex.c(charSequence);
    }

    @NotNull
    public static final CharSequence n4(@NotNull CharSequence charSequence, int i10, char c10) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(N0.a("Desired length ", i10, " is less than zero."));
        }
        if (i10 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb2 = new StringBuilder(i10);
        int length = i10 - charSequence.length();
        int i11 = 1;
        if (1 <= length) {
            while (true) {
                sb2.append(c10);
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        sb2.append(charSequence);
        return sb2;
    }

    @NotNull
    public static final List<String> n5(@NotNull CharSequence charSequence, @NotNull String[] delimiters, boolean z10, int i10) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(delimiters, "delimiters");
        if (delimiters.length == 1) {
            String str = delimiters[0];
            if (str.length() != 0) {
                return o5(charSequence, str, z10, i10);
            }
        }
        Iterable iterableL0 = SequencesKt___SequencesKt.l0(u4(charSequence, delimiters, 0, z10, i10, 2, null));
        ArrayList arrayList = new ArrayList(kotlin.collections.J.d0(iterableL0, 10));
        Iterator it = ((SequencesKt___SequencesKt.a) iterableL0).f218097a.iterator();
        while (it.hasNext()) {
            arrayList.add(J5(charSequence, (md.l) it.next()));
        }
        return arrayList;
    }

    @Xc.f
    public static final String n6(String str) {
        kotlin.jvm.internal.G.p(str, "<this>");
        return k6(str).toString();
    }

    public static /* synthetic */ boolean o3(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return l3(charSequence, c10, z10);
    }

    @NotNull
    public static String o4(@NotNull String str, int i10, char c10) {
        kotlin.jvm.internal.G.p(str, "<this>");
        return n4(str, i10, c10).toString();
    }

    public static final List<String> o5(CharSequence charSequence, String str, boolean z10, int i10) {
        j5(i10);
        int length = 0;
        int iH3 = H3(charSequence, str, 0, z10);
        if (iH3 == -1 || i10 == 1) {
            return kotlin.collections.H.l(charSequence.toString());
        }
        boolean z11 = i10 > 0;
        int i11 = 10;
        if (z11 && i10 <= 10) {
            i11 = i10;
        }
        ArrayList arrayList = new ArrayList(i11);
        do {
            arrayList.add(charSequence.subSequence(length, iH3).toString());
            length = str.length() + iH3;
            if (z11 && arrayList.size() == i10 - 1) {
                break;
            }
            iH3 = H3(charSequence, str, length, z10);
        } while (iH3 != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    @NotNull
    public static final String o6(@NotNull String str, @NotNull ed.l<? super Character, Boolean> predicate) {
        CharSequence charSequenceSubSequence;
        kotlin.jvm.internal.G.p(str, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (!predicate.invoke(Character.valueOf(str.charAt(length))).booleanValue()) {
                    charSequenceSubSequence = str.subSequence(0, length + 1);
                    break;
                }
                if (i10 < 0) {
                    break;
                }
                length = i10;
            }
            charSequenceSubSequence = "";
        } else {
            charSequenceSubSequence = "";
        }
        return charSequenceSubSequence.toString();
    }

    public static /* synthetic */ boolean p3(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return m3(charSequence, charSequence2, z10);
    }

    public static /* synthetic */ CharSequence p4(CharSequence charSequence, int i10, char c10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            c10 = ' ';
        }
        return n4(charSequence, i10, c10);
    }

    public static /* synthetic */ List p5(CharSequence charSequence, Regex regex, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(regex, "regex");
        return regex.r(charSequence, i10);
    }

    @NotNull
    public static final String p6(@NotNull String str, @NotNull char... chars) {
        CharSequence charSequenceSubSequence;
        kotlin.jvm.internal.G.p(str, "<this>");
        kotlin.jvm.internal.G.p(chars, "chars");
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (!kotlin.collections.B.w8(chars, str.charAt(length))) {
                    charSequenceSubSequence = str.subSequence(0, length + 1);
                    break;
                }
                if (i10 < 0) {
                    break;
                }
                length = i10;
            }
            charSequenceSubSequence = "";
        } else {
            charSequenceSubSequence = "";
        }
        return charSequenceSubSequence.toString();
    }

    public static final boolean q3(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return F.e2((String) charSequence, (String) charSequence2, true);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!C5012d.J(charSequence.charAt(i10), charSequence2.charAt(i10), true)) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ String q4(String str, int i10, char c10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            c10 = ' ';
        }
        return o4(str, i10, c10);
    }

    public static /* synthetic */ List q5(CharSequence charSequence, char[] cArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return m5(charSequence, cArr, z10, i10);
    }

    @NotNull
    public static final CharSequence q6(@NotNull CharSequence charSequence) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!C5011c.r(charSequence.charAt(i10))) {
                return charSequence.subSequence(i10, charSequence.length());
            }
        }
        return "";
    }

    public static final boolean r3(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return kotlin.jvm.internal.G.g(charSequence, charSequence2);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (charSequence.charAt(i10) != charSequence2.charAt(i10)) {
                return false;
            }
        }
        return true;
    }

    public static final InterfaceC5000m<md.l> r4(CharSequence charSequence, final char[] cArr, int i10, final boolean z10, int i11) {
        j5(i11);
        return new C5015g(charSequence, i10, i11, new ed.p() { // from class: kotlin.text.H
            @Override // ed.p
            public final Object invoke(Object obj, Object obj2) {
                return M.v4(cArr, z10, (CharSequence) obj, ((Integer) obj2).intValue());
            }
        });
    }

    public static /* synthetic */ List r5(CharSequence charSequence, String[] strArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return n5(charSequence, strArr, z10, i10);
    }

    @NotNull
    public static final CharSequence r6(@NotNull CharSequence charSequence, @NotNull ed.l<? super Character, Boolean> lVar) {
        int iA = K.a(charSequence, "<this>", lVar, "predicate");
        for (int i10 = 0; i10 < iA; i10++) {
            if (!((Boolean) L.a(charSequence, i10, lVar)).booleanValue()) {
                return charSequence.subSequence(i10, charSequence.length());
            }
        }
        return "";
    }

    public static final boolean s3(@NotNull CharSequence charSequence, char c10, boolean z10) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        return charSequence.length() > 0 && C5012d.J(charSequence.charAt(C3(charSequence)), c10, z10);
    }

    public static final InterfaceC5000m<md.l> s4(CharSequence charSequence, String[] strArr, int i10, final boolean z10, int i11) {
        j5(i11);
        final List listT = C4875q.t(strArr);
        return new C5015g(charSequence, i10, i11, new ed.p() { // from class: kotlin.text.I
            @Override // ed.p
            public final Object invoke(Object obj, Object obj2) {
                return M.w4(listT, z10, (CharSequence) obj, ((Integer) obj2).intValue());
            }
        });
    }

    @InterfaceC4887e0(version = "1.6")
    @Xc.f
    public static final InterfaceC5000m<String> s5(CharSequence charSequence, Regex regex, int i10) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(regex, "regex");
        return regex.t(charSequence, i10);
    }

    @NotNull
    public static final CharSequence s6(@NotNull CharSequence charSequence, @NotNull char... chars) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(chars, "chars");
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!kotlin.collections.B.w8(chars, charSequence.charAt(i10))) {
                return charSequence.subSequence(i10, charSequence.length());
            }
        }
        return "";
    }

    public static final boolean t3(@NotNull CharSequence charSequence, @NotNull CharSequence suffix, boolean z10) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(suffix, "suffix");
        return (!z10 && (charSequence instanceof String) && (suffix instanceof String)) ? F.d2((String) charSequence, (String) suffix, false, 2, null) : x4(charSequence, charSequence.length() - suffix.length(), suffix, 0, suffix.length(), z10);
    }

    public static /* synthetic */ InterfaceC5000m t4(CharSequence charSequence, char[] cArr, int i10, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return r4(charSequence, cArr, i10, z10, i11);
    }

    @NotNull
    public static final InterfaceC5000m<String> t5(@NotNull final CharSequence charSequence, @NotNull char[] delimiters, boolean z10, int i10) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(delimiters, "delimiters");
        return SequencesKt___SequencesKt.N1(t4(charSequence, delimiters, 0, z10, i10, 2, null), new ed.l() { // from class: kotlin.text.G
            @Override // ed.l
            public final Object invoke(Object obj) {
                return M.z5(charSequence, (md.l) obj);
            }
        });
    }

    @Xc.f
    public static final String t6(String str) {
        kotlin.jvm.internal.G.p(str, "<this>");
        return q6(str).toString();
    }

    public static /* synthetic */ boolean u3(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return s3(charSequence, c10, z10);
    }

    public static /* synthetic */ InterfaceC5000m u4(CharSequence charSequence, String[] strArr, int i10, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return s4(charSequence, strArr, i10, z10, i11);
    }

    @NotNull
    public static final InterfaceC5000m<String> u5(@NotNull final CharSequence charSequence, @NotNull String[] delimiters, boolean z10, int i10) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(delimiters, "delimiters");
        return SequencesKt___SequencesKt.N1(u4(charSequence, delimiters, 0, z10, i10, 2, null), new ed.l() { // from class: kotlin.text.J
            @Override // ed.l
            public final Object invoke(Object obj) {
                return M.y5(charSequence, (md.l) obj);
            }
        });
    }

    @NotNull
    public static final String u6(@NotNull String str, @NotNull ed.l<? super Character, Boolean> predicate) {
        CharSequence charSequenceSubSequence;
        kotlin.jvm.internal.G.p(str, "<this>");
        kotlin.jvm.internal.G.p(predicate, "predicate");
        int length = str.length();
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                charSequenceSubSequence = "";
                break;
            }
            if (!predicate.invoke(Character.valueOf(str.charAt(i10))).booleanValue()) {
                charSequenceSubSequence = str.subSequence(i10, str.length());
                break;
            }
            i10++;
        }
        return charSequenceSubSequence.toString();
    }

    public static /* synthetic */ boolean v3(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return t3(charSequence, charSequence2, z10);
    }

    public static final Pair v4(char[] cArr, boolean z10, CharSequence DelimitedRangesSequence, int i10) {
        kotlin.jvm.internal.G.p(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
        int iN3 = N3(DelimitedRangesSequence, cArr, i10, z10);
        if (iN3 < 0) {
            return null;
        }
        return new Pair(Integer.valueOf(iN3), 1);
    }

    public static /* synthetic */ InterfaceC5000m v5(CharSequence charSequence, Regex regex, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(regex, "regex");
        return regex.t(charSequence, i10);
    }

    @NotNull
    public static final String v6(@NotNull String str, @NotNull char... chars) {
        CharSequence charSequenceSubSequence;
        kotlin.jvm.internal.G.p(str, "<this>");
        kotlin.jvm.internal.G.p(chars, "chars");
        int length = str.length();
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                charSequenceSubSequence = "";
                break;
            }
            if (!kotlin.collections.B.w8(chars, str.charAt(i10))) {
                charSequenceSubSequence = str.subSequence(i10, str.length());
                break;
            }
            i10++;
        }
        return charSequenceSubSequence.toString();
    }

    @Nullable
    public static final Pair<Integer, String> w3(@NotNull CharSequence charSequence, @NotNull Collection<String> strings, int i10, boolean z10) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(strings, "strings");
        return x3(charSequence, strings, i10, z10, false);
    }

    public static final Pair w4(List list, boolean z10, CharSequence DelimitedRangesSequence, int i10) {
        kotlin.jvm.internal.G.p(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
        Pair<Integer, String> pairX3 = x3(DelimitedRangesSequence, list, i10, z10, false);
        if (pairX3 != null) {
            return new Pair(pairX3.f217467a, Integer.valueOf(pairX3.f217468b.length()));
        }
        return null;
    }

    public static /* synthetic */ InterfaceC5000m w5(CharSequence charSequence, char[] cArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return t5(charSequence, cArr, z10, i10);
    }

    public static final Pair<Integer, String> x3(CharSequence charSequence, Collection<String> collection, int i10, boolean z10, boolean z11) {
        md.j jVarM0;
        Object next;
        boolean z12;
        Object next2;
        if (!z10 && collection.size() == 1) {
            String str = (String) kotlin.collections.U.k5(collection);
            int iL3 = !z11 ? L3(charSequence, str, i10, false, 4, null) : a4(charSequence, str, i10, false, 4, null);
            if (iL3 < 0) {
                return null;
            }
            return new Pair<>(Integer.valueOf(iL3), str);
        }
        if (z11) {
            int iC3 = C3(charSequence);
            if (i10 <= iC3) {
                iC3 = i10;
            }
            jVarM0 = md.u.m0(iC3, 0);
        } else {
            jVarM0 = new md.l(i10 >= 0 ? i10 : 0, charSequence.length(), 1);
        }
        if (charSequence instanceof String) {
            int i11 = jVarM0.f221139a;
            int i12 = jVarM0.f221140b;
            int i13 = jVarM0.f221141c;
            if ((i13 > 0 && i11 <= i12) || (i13 < 0 && i12 <= i11)) {
                int i14 = i11;
                while (true) {
                    Iterator<T> it = collection.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z12 = z10;
                            next2 = null;
                            break;
                        }
                        next2 = it.next();
                        String str2 = (String) next2;
                        z12 = z10;
                        if (F.u2(str2, 0, (String) charSequence, i14, str2.length(), z12)) {
                            break;
                        }
                        z10 = z12;
                    }
                    String str3 = (String) next2;
                    if (str3 == null) {
                        if (i14 == i12) {
                            break;
                        }
                        i14 += i13;
                        z10 = z12;
                    } else {
                        return new Pair<>(Integer.valueOf(i14), str3);
                    }
                }
            }
        } else {
            boolean z13 = z10;
            int i15 = jVarM0.f221139a;
            int i16 = jVarM0.f221140b;
            int i17 = jVarM0.f221141c;
            if ((i17 > 0 && i15 <= i16) || (i17 < 0 && i16 <= i15)) {
                int i18 = i15;
                while (true) {
                    Iterator<T> it2 = collection.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        String str4 = (String) next;
                        boolean z14 = z13;
                        z13 = z14;
                        if (x4(str4, 0, charSequence, i18, str4.length(), z14)) {
                            break;
                        }
                    }
                    String str5 = (String) next;
                    if (str5 == null) {
                        if (i18 == i16) {
                            break;
                        }
                        i18 += i17;
                    } else {
                        return new Pair<>(Integer.valueOf(i18), str5);
                    }
                }
            }
        }
        return null;
    }

    public static final boolean x4(@NotNull CharSequence charSequence, int i10, @NotNull CharSequence other, int i11, int i12, boolean z10) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(other, "other");
        if (i11 < 0 || i10 < 0 || i10 > charSequence.length() - i12 || i11 > other.length() - i12) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (!C5012d.J(charSequence.charAt(i10 + i13), other.charAt(i11 + i13), z10)) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ InterfaceC5000m x5(CharSequence charSequence, String[] strArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return u5(charSequence, strArr, z10, i10);
    }

    public static /* synthetic */ Pair y3(CharSequence charSequence, Collection collection, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return w3(charSequence, collection, i10, z10);
    }

    @NotNull
    public static final CharSequence y4(@NotNull CharSequence charSequence, @NotNull CharSequence prefix) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(prefix, "prefix");
        return F5(charSequence, prefix, false, 2, null) ? charSequence.subSequence(prefix.length(), charSequence.length()) : charSequence.subSequence(0, charSequence.length());
    }

    public static final String y5(CharSequence charSequence, md.l it) {
        kotlin.jvm.internal.G.p(it, "it");
        return J5(charSequence, it);
    }

    @Nullable
    public static final Pair<Integer, String> z3(@NotNull CharSequence charSequence, @NotNull Collection<String> strings, int i10, boolean z10) {
        kotlin.jvm.internal.G.p(charSequence, "<this>");
        kotlin.jvm.internal.G.p(strings, "strings");
        return x3(charSequence, strings, i10, z10, true);
    }

    @NotNull
    public static String z4(@NotNull String str, @NotNull CharSequence prefix) {
        kotlin.jvm.internal.G.p(str, "<this>");
        kotlin.jvm.internal.G.p(prefix, "prefix");
        if (!F5(str, prefix, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(prefix.length());
        kotlin.jvm.internal.G.o(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final String z5(CharSequence charSequence, md.l it) {
        kotlin.jvm.internal.G.p(it, "it");
        return J5(charSequence, it);
    }
}
