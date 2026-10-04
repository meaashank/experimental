package okhttp3;

import androidx.compose.runtime.R0;
import androidx.room.C2650a;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4982o;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.text.F;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class q {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final String f225815f = "([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final String f225816g = "\"([^\"]*)\"";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f225819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f225820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f225821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String[] f225822d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f225814e = new a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Pattern f225817h = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Pattern f225818i = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    public static final class a {
        public a() {
        }

        @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @InterfaceC4852c0(expression = "mediaType.toMediaType()", imports = {"okhttp3.MediaType.Companion.toMediaType"}))
        @dd.j(name = "-deprecated_get")
        @NotNull
        public final q a(@NotNull String mediaType) {
            G.p(mediaType, "mediaType");
            return c(mediaType);
        }

        @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @InterfaceC4852c0(expression = "mediaType.toMediaTypeOrNull()", imports = {"okhttp3.MediaType.Companion.toMediaTypeOrNull"}))
        @dd.j(name = "-deprecated_parse")
        @Nullable
        public final q b(@NotNull String mediaType) {
            G.p(mediaType, "mediaType");
            return d(mediaType);
        }

        @dd.o
        @dd.j(name = w7.i.f240158w)
        @NotNull
        public final q c(@NotNull String str) {
            G.p(str, "<this>");
            Matcher matcher = q.f225817h.matcher(str);
            if (!matcher.lookingAt()) {
                throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
            }
            String strGroup = matcher.group(1);
            G.o(strGroup, "typeSubtype.group(1)");
            Locale US = Locale.US;
            String strA = C2650a.a(US, "US", strGroup, US, "this as java.lang.String).toLowerCase(locale)");
            String strGroup2 = matcher.group(2);
            G.o(strGroup2, "typeSubtype.group(2)");
            G.o(US, "US");
            String lowerCase = strGroup2.toLowerCase(US);
            G.o(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            ArrayList arrayList = new ArrayList();
            Matcher matcher2 = q.f225818i.matcher(str);
            int iEnd = matcher.end();
            while (iEnd < str.length()) {
                matcher2.region(iEnd, str.length());
                if (!matcher2.lookingAt()) {
                    StringBuilder sb2 = new StringBuilder("Parameter is not formatted correctly: \"");
                    String strSubstring = str.substring(iEnd);
                    G.o(strSubstring, "this as java.lang.String).substring(startIndex)");
                    sb2.append(strSubstring);
                    sb2.append("\" for: \"");
                    throw new IllegalArgumentException(R0.a(sb2, str, '\"').toString());
                }
                String strGroup3 = matcher2.group(1);
                if (strGroup3 == null) {
                    iEnd = matcher2.end();
                } else {
                    String strGroup4 = matcher2.group(2);
                    if (strGroup4 == null) {
                        strGroup4 = matcher2.group(3);
                    } else if (F.L2(strGroup4, "'", false, 2, null) && F.d2(strGroup4, "'", false, 2, null) && strGroup4.length() > 2) {
                        strGroup4 = strGroup4.substring(1, strGroup4.length() - 1);
                        G.o(strGroup4, "this as java.lang.String…ing(startIndex, endIndex)");
                    }
                    arrayList.add(strGroup3);
                    arrayList.add(strGroup4);
                    iEnd = matcher2.end();
                }
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return new q(str, strA, lowerCase, (String[]) array);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }

        @dd.o
        @dd.j(name = "parse")
        @Nullable
        public final q d(@NotNull String str) {
            G.p(str, "<this>");
            try {
                return c(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public a(C4969v c4969v) {
        }
    }

    public /* synthetic */ q(String str, String str2, String str3, String[] strArr, C4969v c4969v) {
        this(str, str2, str3, strArr);
    }

    public static /* synthetic */ Charset g(q qVar, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = null;
        }
        return qVar.f(charset);
    }

    @dd.o
    @dd.j(name = w7.i.f240158w)
    @NotNull
    public static final q h(@NotNull String str) {
        return f225814e.c(str);
    }

    @dd.o
    @dd.j(name = "parse")
    @Nullable
    public static final q j(@NotNull String str) {
        return f225814e.d(str);
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @InterfaceC4852c0(expression = "subtype", imports = {}))
    @dd.j(name = "-deprecated_subtype")
    @NotNull
    public final String a() {
        return this.f225821c;
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @InterfaceC4852c0(expression = "type", imports = {}))
    @dd.j(name = "-deprecated_type")
    @NotNull
    public final String b() {
        return this.f225820b;
    }

    @dd.k
    @Nullable
    public final Charset e() {
        return g(this, null, 1, null);
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof q) && G.g(((q) obj).f225819a, this.f225819a);
    }

    @dd.k
    @Nullable
    public final Charset f(@Nullable Charset charset) {
        String strI = i("charset");
        if (strI == null) {
            return charset;
        }
        try {
            return Charset.forName(strI);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public int hashCode() {
        return this.f225819a.hashCode();
    }

    @Nullable
    public final String i(@NotNull String name) {
        G.p(name, "name");
        int i10 = 0;
        int iC = Xc.o.c(0, this.f225822d.length - 1, 2);
        if (iC < 0) {
            return null;
        }
        while (true) {
            int i11 = i10 + 2;
            if (F.e2(this.f225822d[i10], name, true)) {
                return this.f225822d[i10 + 1];
            }
            if (i10 == iC) {
                return null;
            }
            i10 = i11;
        }
    }

    @dd.j(name = "subtype")
    @NotNull
    public final String k() {
        return this.f225821c;
    }

    @dd.j(name = "type")
    @NotNull
    public final String l() {
        return this.f225820b;
    }

    @NotNull
    public String toString() {
        return this.f225819a;
    }

    public q(String str, String str2, String str3, String[] strArr) {
        this.f225819a = str;
        this.f225820b = str2;
        this.f225821c = str3;
        this.f225822d = strArr;
    }
}
