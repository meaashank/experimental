package kotlin.text;

import java.util.Locale;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class a0 {
    @NotNull
    public static final String a(char c10) {
        String strValueOf = String.valueOf(c10);
        kotlin.jvm.internal.G.n(strValueOf, "null cannot be cast to non-null type java.lang.String");
        Locale locale = Locale.ROOT;
        String upperCase = strValueOf.toUpperCase(locale);
        kotlin.jvm.internal.G.o(upperCase, "toUpperCase(...)");
        if (upperCase.length() <= 1) {
            return String.valueOf(Character.toTitleCase(c10));
        }
        if (c10 == 329) {
            return upperCase;
        }
        char cCharAt = upperCase.charAt(0);
        String strSubstring = upperCase.substring(1);
        kotlin.jvm.internal.G.o(strSubstring, "substring(...)");
        String lowerCase = strSubstring.toLowerCase(locale);
        kotlin.jvm.internal.G.o(lowerCase, "toLowerCase(...)");
        return cCharAt + lowerCase;
    }
}
