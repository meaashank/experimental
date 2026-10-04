package okhttp3;

import androidx.room.C2650a;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4982o;
import kotlin.collections.n0;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f225362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f225363b;

    public f(@NotNull String scheme, @NotNull Map<String, String> authParams) {
        String strA;
        G.p(scheme, "scheme");
        G.p(authParams, "authParams");
        this.f225362a = scheme;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : authParams.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key == null) {
                strA = null;
            } else {
                Locale locale = Locale.US;
                strA = C2650a.a(locale, "US", key, locale, "this as java.lang.String).toLowerCase(locale)");
            }
            linkedHashMap.put(strA, value);
        }
        Map<String, String> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        G.o(mapUnmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.f225363b = mapUnmodifiableMap;
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @InterfaceC4852c0(expression = "authParams", imports = {}))
    @dd.j(name = "-deprecated_authParams")
    @NotNull
    public final Map<String, String> a() {
        return this.f225363b;
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @InterfaceC4852c0(expression = "charset", imports = {}))
    @dd.j(name = "-deprecated_charset")
    @NotNull
    public final Charset b() {
        return f();
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @InterfaceC4852c0(expression = "realm", imports = {}))
    @dd.j(name = "-deprecated_realm")
    @Nullable
    public final String c() {
        return g();
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @InterfaceC4852c0(expression = "scheme", imports = {}))
    @dd.j(name = "-deprecated_scheme")
    @NotNull
    public final String d() {
        return this.f225362a;
    }

    @dd.j(name = "authParams")
    @NotNull
    public final Map<String, String> e() {
        return this.f225363b;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return G.g(fVar.f225362a, this.f225362a) && G.g(fVar.f225363b, this.f225363b);
    }

    @dd.j(name = "charset")
    @NotNull
    public final Charset f() {
        String str = this.f225363b.get("charset");
        if (str != null) {
            try {
                Charset charsetForName = Charset.forName(str);
                G.o(charsetForName, "forName(charset)");
                return charsetForName;
            } catch (Exception unused) {
            }
        }
        Charset ISO_8859_1 = StandardCharsets.ISO_8859_1;
        G.o(ISO_8859_1, "ISO_8859_1");
        return ISO_8859_1;
    }

    @dd.j(name = "realm")
    @Nullable
    public final String g() {
        return this.f225363b.get("realm");
    }

    @dd.j(name = "scheme")
    @NotNull
    public final String h() {
        return this.f225362a;
    }

    public int hashCode() {
        return this.f225363b.hashCode() + androidx.compose.foundation.text.modifiers.l.a(this.f225362a, 899, 31);
    }

    @NotNull
    public final f i(@NotNull Charset charset) {
        G.p(charset, "charset");
        Map mapJ0 = n0.J0(this.f225363b);
        String strName = charset.name();
        G.o(strName, "charset.name()");
        mapJ0.put("charset", strName);
        return new f(this.f225362a, (Map<String, String>) mapJ0);
    }

    @NotNull
    public String toString() {
        return this.f225362a + " authParams=" + this.f225363b;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public f(@NotNull String scheme, @NotNull String realm) {
        G.p(scheme, "scheme");
        G.p(realm, "realm");
        Map mapSingletonMap = Collections.singletonMap("realm", realm);
        G.o(mapSingletonMap, "singletonMap(\"realm\", realm)");
        this(scheme, (Map<String, String>) mapSingletonMap);
    }
}
