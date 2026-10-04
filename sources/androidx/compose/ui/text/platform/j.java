package androidx.compose.ui.text.platform;

import androidx.compose.ui.text.F;
import java.util.Locale;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import kotlin.text.C5011c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nAndroidStringDelegate.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidStringDelegate.android.kt\nandroidx/compose/ui/text/platform/AndroidStringDelegate\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,45:1\n1#2:46\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 1)
public final class j implements F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f104920a = 0;

    @Override // androidx.compose.ui.text.F
    @NotNull
    public String a(@NotNull String str, @NotNull Locale locale) {
        String lowerCase = str.toLowerCase(locale);
        G.o(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    @Override // androidx.compose.ui.text.F
    @NotNull
    public String b(@NotNull String str, @NotNull Locale locale) {
        String upperCase = str.toUpperCase(locale);
        G.o(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }

    @Override // androidx.compose.ui.text.F
    @NotNull
    public String c(@NotNull String str, @NotNull Locale locale) {
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) C5011c.t(str.charAt(0), locale));
        String strSubstring = str.substring(1);
        G.o(strSubstring, "this as java.lang.String).substring(startIndex)");
        sb2.append(strSubstring);
        return sb2.toString();
    }

    @Override // androidx.compose.ui.text.F
    @NotNull
    public String d(@NotNull String str, @NotNull Locale locale) {
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        char cCharAt = str.charAt(0);
        sb2.append((Object) (Character.isLowerCase(cCharAt) ? C5011c.v(cCharAt, locale) : String.valueOf(cCharAt)));
        String strSubstring = str.substring(1);
        G.o(strSubstring, "this as java.lang.String).substring(startIndex)");
        sb2.append(strSubstring);
        return sb2.toString();
    }
}
