package kotlin.text;

import java.util.Locale;
import kotlin.InterfaceC4850b0;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4887e0;
import kotlin.InterfaceC4982o;
import kotlin.InterfaceC4984p;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kotlin.text.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C5011c {
    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final String A(char c10) {
        String strValueOf = String.valueOf(c10);
        kotlin.jvm.internal.G.n(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = strValueOf.toUpperCase(Locale.ROOT);
        kotlin.jvm.internal.G.o(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    @InterfaceC4887e0(version = "1.5")
    @NotNull
    public static final String B(char c10, @NotNull Locale locale) {
        kotlin.jvm.internal.G.p(locale, "locale");
        String strValueOf = String.valueOf(c10);
        kotlin.jvm.internal.G.n(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = strValueOf.toUpperCase(locale);
        kotlin.jvm.internal.G.o(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final char C(char c10) {
        return Character.toUpperCase(c10);
    }

    @kotlin.C
    @InterfaceC4850b0
    public static int a(int i10) {
        if (2 <= i10 && i10 < 37) {
            return i10;
        }
        StringBuilder sbA = android.support.v4.media.a.a("radix ", i10, " was not in valid range ");
        sbA.append(new md.l(2, 36, 1));
        throw new IllegalArgumentException(sbA.toString());
    }

    public static final int b(char c10, int i10) {
        return Character.digit((int) c10, i10);
    }

    @NotNull
    public static final CharCategory c(char c10) {
        return CharCategory.Companion.a(Character.getType(c10));
    }

    @NotNull
    public static final CharDirectionality d(char c10) {
        return CharDirectionality.Companion.b(Character.getDirectionality(c10));
    }

    @Xc.f
    public static final boolean e(char c10) {
        return Character.isDefined(c10);
    }

    @Xc.f
    public static final boolean f(char c10) {
        return Character.isDigit(c10);
    }

    @Xc.f
    public static final boolean g(char c10) {
        return Character.isHighSurrogate(c10);
    }

    @Xc.f
    public static final boolean h(char c10) {
        return Character.isISOControl(c10);
    }

    @Xc.f
    public static final boolean i(char c10) {
        return Character.isIdentifierIgnorable(c10);
    }

    @Xc.f
    public static final boolean j(char c10) {
        return Character.isJavaIdentifierPart(c10);
    }

    @Xc.f
    public static final boolean k(char c10) {
        return Character.isJavaIdentifierStart(c10);
    }

    @Xc.f
    public static final boolean l(char c10) {
        return Character.isLetter(c10);
    }

    @Xc.f
    public static final boolean m(char c10) {
        return Character.isLetterOrDigit(c10);
    }

    @Xc.f
    public static final boolean n(char c10) {
        return Character.isLowSurrogate(c10);
    }

    @Xc.f
    public static final boolean o(char c10) {
        return Character.isLowerCase(c10);
    }

    @Xc.f
    public static final boolean p(char c10) {
        return Character.isTitleCase(c10);
    }

    @Xc.f
    public static final boolean q(char c10) {
        return Character.isUpperCase(c10);
    }

    public static boolean r(char c10) {
        return Character.isWhitespace(c10) || Character.isSpaceChar(c10);
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final String s(char c10) {
        String strValueOf = String.valueOf(c10);
        kotlin.jvm.internal.G.n(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = strValueOf.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.G.o(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @InterfaceC4887e0(version = "1.5")
    @NotNull
    public static String t(char c10, @NotNull Locale locale) {
        kotlin.jvm.internal.G.p(locale, "locale");
        String strValueOf = String.valueOf(c10);
        kotlin.jvm.internal.G.n(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = strValueOf.toLowerCase(locale);
        kotlin.jvm.internal.G.o(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final char u(char c10) {
        return Character.toLowerCase(c10);
    }

    @InterfaceC4887e0(version = "1.5")
    @NotNull
    public static String v(char c10, @NotNull Locale locale) {
        kotlin.jvm.internal.G.p(locale, "locale");
        String strB = B(c10, locale);
        if (strB.length() <= 1) {
            String strValueOf = String.valueOf(c10);
            kotlin.jvm.internal.G.n(strValueOf, "null cannot be cast to non-null type java.lang.String");
            String upperCase = strValueOf.toUpperCase(Locale.ROOT);
            kotlin.jvm.internal.G.o(upperCase, "toUpperCase(...)");
            if (strB.equals(upperCase)) {
                return String.valueOf(Character.toTitleCase(c10));
            }
        } else if (c10 != 329) {
            char cCharAt = strB.charAt(0);
            String strSubstring = strB.substring(1);
            kotlin.jvm.internal.G.o(strSubstring, "substring(...)");
            String lowerCase = strSubstring.toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.G.o(lowerCase, "toLowerCase(...)");
            return cCharAt + lowerCase;
        }
        return strB;
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final char w(char c10) {
        return Character.toTitleCase(c10);
    }

    @InterfaceC4982o(message = "Use lowercaseChar() instead.", replaceWith = @InterfaceC4852c0(expression = "lowercaseChar()", imports = {}))
    @InterfaceC4984p(errorSince = "2.1", warningSince = "1.5")
    @Xc.f
    public static final char x(char c10) {
        return Character.toLowerCase(c10);
    }

    @InterfaceC4982o(message = "Use titlecaseChar() instead.", replaceWith = @InterfaceC4852c0(expression = "titlecaseChar()", imports = {}))
    @InterfaceC4984p(errorSince = "2.1", warningSince = "1.5")
    @Xc.f
    public static final char y(char c10) {
        return Character.toTitleCase(c10);
    }

    @InterfaceC4982o(message = "Use uppercaseChar() instead.", replaceWith = @InterfaceC4852c0(expression = "uppercaseChar()", imports = {}))
    @InterfaceC4984p(errorSince = "2.1", warningSince = "1.5")
    @Xc.f
    public static final char z(char c10) {
        return Character.toUpperCase(c10);
    }
}
