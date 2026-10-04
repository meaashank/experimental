package C4;

import android.util.Patterns;
import android.webkit.URLUtil;
import com.cookiegames.smartcookie.html.bookmark.BookmarkPageFactory;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.G;
import kotlin.text.F;
import kotlin.text.M;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@dd.j(name = "UrlUtils")
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f17584a = Pattern.compile("(?i)((?:http|https|file)://|(?:inline|data|about|javascript):|(?:.*:.*@))(.*)");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final String f17585b = "%s";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final String f17586c = "%20";

    public static final boolean a(@Nullable String str) {
        return str != null && F.L2(str, R3.a.f67727e, false, 2, null) && F.d2(str, BookmarkPageFactory.f141292l, false, 2, null);
    }

    public static final boolean b(@Nullable String str) {
        return str != null && F.L2(str, R3.a.f67727e, false, 2, null) && F.d2(str, h4.j.f202418g, false, 2, null);
    }

    public static final boolean c(@Nullable String str) {
        return str != null && F.L2(str, R3.a.f67727e, false, 2, null) && F.d2(str, i4.k.f202837h, false, 2, null);
    }

    public static final boolean d(@Nullable String str) {
        return str != null && F.L2(str, R3.a.f67727e, false, 2, null) && (F.d2(str, BookmarkPageFactory.f141292l, false, 2, null) || F.d2(str, h4.j.f202418g, false, 2, null) || F.d2(str, i4.k.f202837h, false, 2, null) || F.d2(str, j4.j.f212544k, false, 2, null) || F.d2(str, k4.j.f214468k, false, 2, null));
    }

    public static final boolean e(@Nullable String str) {
        return str != null && F.L2(str, R3.a.f67727e, false, 2, null) && F.d2(str, j4.j.f212544k, false, 2, null);
    }

    @NotNull
    public static final String f(@NotNull String url, boolean z10, @NotNull String searchUrl) {
        G.p(url, "url");
        G.p(searchUrl, "searchUrl");
        String string = M.e6(url).toString();
        boolean zO3 = M.o3(string, ' ', false, 2, null);
        Matcher matcher = f17584a.matcher(string);
        if (matcher.matches()) {
            String strGroup = matcher.group(1);
            G.m(strGroup);
            Locale locale = Locale.getDefault();
            G.o(locale, "getDefault(...)");
            String lowerCase = strGroup.toLowerCase(locale);
            G.o(lowerCase, "toLowerCase(...)");
            if (!lowerCase.equals(strGroup)) {
                string = androidx.compose.runtime.changelist.j.a(lowerCase, matcher.group(2));
            }
            String str = string;
            return (zO3 && Patterns.WEB_URL.matcher(str).matches()) ? F.B2(str, q.f17581a, f17586c, false, 4, null) : str;
        }
        if (!zO3 && Patterns.WEB_URL.matcher(string).matches()) {
            String strGuessUrl = URLUtil.guessUrl(string);
            G.o(strGuessUrl, "guessUrl(...)");
            return strGuessUrl;
        }
        if (!z10) {
            return "";
        }
        String strComposeSearchUrl = URLUtil.composeSearchUrl(string, searchUrl, f17585b);
        G.m(strComposeSearchUrl);
        return strComposeSearchUrl;
    }
}
