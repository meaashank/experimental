package okhttp3;

import androidx.collection.C1550p;
import androidx.compose.animation.C1635o;
import com.android.launcher3.IconCache;
import com.google.common.net.HttpHeaders;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4982o;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.text.F;
import kotlin.text.M;
import kotlin.text.Regex;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.signature.SignatureVisitor;

/* JADX INFO: loaded from: classes5.dex */
public final class Cookie {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final a f225183j = new a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Pattern f225184k = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Pattern f225185l = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Pattern f225186m = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Pattern f225187n = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f225188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f225189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f225190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f225191d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f225192e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f225193f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f225194g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f225195h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f225196i;

    public static final class Builder {

        @Nullable
        private String domain;
        private boolean hostOnly;
        private boolean httpOnly;

        @Nullable
        private String name;
        private boolean persistent;
        private boolean secure;

        @Nullable
        private String value;
        private long expiresAt = Fd.c.f39976a;

        @NotNull
        private String path = RemoteSettings.FORWARD_SLASH_STRING;

        @NotNull
        public final Cookie build() {
            String str = this.name;
            if (str == null) {
                throw new NullPointerException("builder.name == null");
            }
            String str2 = this.value;
            if (str2 == null) {
                throw new NullPointerException("builder.value == null");
            }
            long j10 = this.expiresAt;
            String str3 = this.domain;
            if (str3 != null) {
                return new Cookie(str, str2, j10, str3, this.path, this.secure, this.httpOnly, this.persistent, this.hostOnly);
            }
            throw new NullPointerException("builder.domain == null");
        }

        @NotNull
        public final Builder domain(@NotNull String domain) {
            G.p(domain, "domain");
            return domain(domain, false);
        }

        @NotNull
        public final Builder expiresAt(long j10) {
            if (j10 <= 0) {
                j10 = Long.MIN_VALUE;
            }
            if (j10 > Fd.c.f39976a) {
                j10 = 253402300799999L;
            }
            this.expiresAt = j10;
            this.persistent = true;
            return this;
        }

        @NotNull
        public final Builder hostOnlyDomain(@NotNull String domain) {
            G.p(domain, "domain");
            return domain(domain, true);
        }

        @NotNull
        public final Builder httpOnly() {
            this.httpOnly = true;
            return this;
        }

        @NotNull
        public final Builder name(@NotNull String name) {
            G.p(name, "name");
            if (!G.g(M.e6(name).toString(), name)) {
                throw new IllegalArgumentException("name is not trimmed");
            }
            this.name = name;
            return this;
        }

        @NotNull
        public final Builder path(@NotNull String path) {
            G.p(path, "path");
            if (!F.L2(path, RemoteSettings.FORWARD_SLASH_STRING, false, 2, null)) {
                throw new IllegalArgumentException("path must start with '/'");
            }
            this.path = path;
            return this;
        }

        @NotNull
        public final Builder secure() {
            this.secure = true;
            return this;
        }

        @NotNull
        public final Builder value(@NotNull String value) {
            G.p(value, "value");
            if (!G.g(M.e6(value).toString(), value)) {
                throw new IllegalArgumentException("value is not trimmed");
            }
            this.value = value;
            return this;
        }

        private final Builder domain(String str, boolean z10) {
            String strE = Bd.a.e(str);
            if (strE == null) {
                throw new IllegalArgumentException(G.C("unexpected domain: ", str));
            }
            this.domain = strE;
            this.hostOnly = z10;
            return this;
        }
    }

    public static final class a {
        public a() {
        }

        public final int c(String str, int i10, int i11, boolean z10) {
            while (i10 < i11) {
                int i12 = i10 + 1;
                char cCharAt = str.charAt(i10);
                if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || (cCharAt <= '9' && '0' <= cCharAt) || ((cCharAt <= 'z' && 'a' <= cCharAt) || ((cCharAt <= 'Z' && 'A' <= cCharAt) || cCharAt == ':'))) == (!z10)) {
                    return i10;
                }
                i10 = i12;
            }
            return i11;
        }

        public final boolean d(String str, String str2) {
            if (G.g(str, str2)) {
                return true;
            }
            return F.d2(str, str2, false, 2, null) && str.charAt((str.length() - str2.length()) - 1) == '.' && !Bd.f.k(str);
        }

        @dd.o
        @Nullable
        public final Cookie e(@NotNull HttpUrl url, @NotNull String setCookie) {
            G.p(url, "url");
            G.p(setCookie, "setCookie");
            return f(System.currentTimeMillis(), url, setCookie);
        }

        @Nullable
        public final Cookie f(long j10, @NotNull HttpUrl url, @NotNull String setCookie) {
            long j11;
            G.p(url, "url");
            G.p(setCookie, "setCookie");
            int iU = Bd.f.u(setCookie, ';', 0, 0, 6, null);
            int iU2 = Bd.f.u(setCookie, SignatureVisitor.INSTANCEOF, 0, iU, 2, null);
            Cookie cookie = null;
            if (iU2 == iU) {
                return null;
            }
            String strM0 = Bd.f.m0(setCookie, 0, iU2, 1, null);
            if (strM0.length() == 0 || Bd.f.E(strM0) != -1) {
                return null;
            }
            String strL0 = Bd.f.l0(setCookie, iU2 + 1, iU);
            if (Bd.f.E(strL0) != -1) {
                return null;
            }
            int i10 = iU + 1;
            int length = setCookie.length();
            String str = null;
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = true;
            long j12 = -1;
            long jI = Fd.c.f39976a;
            String strH = null;
            while (i10 < length) {
                int iS = Bd.f.s(setCookie, ';', i10, length);
                int iS2 = Bd.f.s(setCookie, SignatureVisitor.INSTANCEOF, i10, iS);
                String strL02 = Bd.f.l0(setCookie, i10, iS2);
                String strL03 = iS2 < iS ? Bd.f.l0(setCookie, iS2 + 1, iS) : "";
                Cookie cookie2 = cookie;
                if (strL02.equalsIgnoreCase("expires")) {
                    try {
                        jI = i(strL03, 0, strL03.length());
                        z11 = true;
                    } catch (NumberFormatException | IllegalArgumentException unused) {
                    }
                } else if (strL02.equalsIgnoreCase("max-age")) {
                    j12 = j(strL03);
                    z11 = true;
                } else if (strL02.equalsIgnoreCase("domain")) {
                    strH = h(strL03);
                    z13 = false;
                } else if (strL02.equalsIgnoreCase("path")) {
                    str = strL03;
                } else if (strL02.equalsIgnoreCase("secure")) {
                    z12 = true;
                } else if (strL02.equalsIgnoreCase("httponly")) {
                    z10 = true;
                }
                i10 = iS + 1;
                cookie = cookie2;
            }
            Cookie cookie3 = cookie;
            if (j12 == Long.MIN_VALUE) {
                j11 = Long.MIN_VALUE;
            } else if (j12 != -1) {
                long j13 = j10 + (j12 <= 9223372036854775L ? j12 * ((long) 1000) : Long.MAX_VALUE);
                j11 = (j13 < j10 || j13 > Fd.c.f39976a) ? 253402300799999L : j13;
            } else {
                j11 = jI;
            }
            String str2 = url.f225227d;
            if (strH == null) {
                strH = str2;
            } else if (!d(str2, strH)) {
                return cookie3;
            }
            if (str2.length() != strH.length()) {
                PublicSuffixDatabase.f225779e.getClass();
                if (PublicSuffixDatabase.f225784j.c(strH) == null) {
                    return cookie3;
                }
            }
            if (str == null || !F.L2(str, RemoteSettings.FORWARD_SLASH_STRING, false, 2, cookie3)) {
                String strX = url.x();
                int iZ3 = M.Z3(strX, '/', 0, false, 6, null);
                if (iZ3 != 0) {
                    String strSubstring = strX.substring(0, iZ3);
                    G.o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    str = strSubstring;
                } else {
                    str = RemoteSettings.FORWARD_SLASH_STRING;
                }
            }
            return new Cookie(strM0, strL0, j11, strH, str, z12, z10, z11, z13);
        }

        @dd.o
        @NotNull
        public final List<Cookie> g(@NotNull HttpUrl url, @NotNull Headers headers) {
            G.p(url, "url");
            G.p(headers, "headers");
            List<String> listZ = headers.z(HttpHeaders.SET_COOKIE);
            int size = listZ.size();
            ArrayList arrayList = null;
            int i10 = 0;
            while (i10 < size) {
                int i11 = i10 + 1;
                Cookie cookieE = e(url, listZ.get(i10));
                if (cookieE != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(cookieE);
                }
                i10 = i11;
            }
            if (arrayList == null) {
                return EmptyList.f217510a;
            }
            List<Cookie> listUnmodifiableList = Collections.unmodifiableList(arrayList);
            G.o(listUnmodifiableList, "{\n        Collections.un…ableList(cookies)\n      }");
            return listUnmodifiableList;
        }

        public final String h(String str) {
            if (F.d2(str, IconCache.EMPTY_CLASS_NAME, false, 2, null)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            String strE = Bd.a.e(M.z4(str, IconCache.EMPTY_CLASS_NAME));
            if (strE != null) {
                return strE;
            }
            throw new IllegalArgumentException();
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x00b3  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final long i(java.lang.String r23, int r24, int r25) {
            /*
                Method dump skipped, instruction units count: 343
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.Cookie.a.i(java.lang.String, int, int):long");
        }

        public final long j(String str) {
            try {
                long j10 = Long.parseLong(str);
                if (j10 <= 0) {
                    return Long.MIN_VALUE;
                }
                return j10;
            } catch (NumberFormatException e10) {
                if (new Regex("-?\\d+").m(str)) {
                    return F.L2(str, com.prism.gaia.download.a.f164606q, false, 2, null) ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
                throw e10;
            }
        }

        public final boolean k(HttpUrl httpUrl, String str) {
            String strX = httpUrl.x();
            if (strX.equals(str)) {
                return true;
            }
            return F.L2(strX, str, false, 2, null) && (F.d2(str, RemoteSettings.FORWARD_SLASH_STRING, false, 2, null) || strX.charAt(str.length()) == '/');
        }

        public a(C4969v c4969v) {
        }
    }

    public /* synthetic */ Cookie(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13, C4969v c4969v) {
        this(str, str2, j10, str3, str4, z10, z11, z12, z13);
    }

    @dd.o
    @Nullable
    public static final Cookie t(@NotNull HttpUrl httpUrl, @NotNull String str) {
        return f225183j.e(httpUrl, str);
    }

    @dd.o
    @NotNull
    public static final List<Cookie> u(@NotNull HttpUrl httpUrl, @NotNull Headers headers) {
        return f225183j.g(httpUrl, headers);
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @InterfaceC4852c0(expression = "domain", imports = {}))
    @dd.j(name = "-deprecated_domain")
    @NotNull
    public final String a() {
        return this.f225191d;
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @InterfaceC4852c0(expression = "expiresAt", imports = {}))
    @dd.j(name = "-deprecated_expiresAt")
    public final long b() {
        return this.f225190c;
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @InterfaceC4852c0(expression = "hostOnly", imports = {}))
    @dd.j(name = "-deprecated_hostOnly")
    public final boolean c() {
        return this.f225196i;
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @InterfaceC4852c0(expression = "httpOnly", imports = {}))
    @dd.j(name = "-deprecated_httpOnly")
    public final boolean d() {
        return this.f225194g;
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @InterfaceC4852c0(expression = "name", imports = {}))
    @dd.j(name = "-deprecated_name")
    @NotNull
    public final String e() {
        return this.f225188a;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof Cookie)) {
            return false;
        }
        Cookie cookie = (Cookie) obj;
        return G.g(cookie.f225188a, this.f225188a) && G.g(cookie.f225189b, this.f225189b) && cookie.f225190c == this.f225190c && G.g(cookie.f225191d, this.f225191d) && G.g(cookie.f225192e, this.f225192e) && cookie.f225193f == this.f225193f && cookie.f225194g == this.f225194g && cookie.f225195h == this.f225195h && cookie.f225196i == this.f225196i;
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @InterfaceC4852c0(expression = "path", imports = {}))
    @dd.j(name = "-deprecated_path")
    @NotNull
    public final String f() {
        return this.f225192e;
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @InterfaceC4852c0(expression = "persistent", imports = {}))
    @dd.j(name = "-deprecated_persistent")
    public final boolean g() {
        return this.f225195h;
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @InterfaceC4852c0(expression = "secure", imports = {}))
    @dd.j(name = "-deprecated_secure")
    public final boolean h() {
        return this.f225193f;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        return C1635o.a(this.f225196i) + ((C1635o.a(this.f225195h) + ((C1635o.a(this.f225194g) + ((C1635o.a(this.f225193f) + androidx.compose.foundation.text.modifiers.l.a(this.f225192e, androidx.compose.foundation.text.modifiers.l.a(this.f225191d, (C1550p.a(this.f225190c) + androidx.compose.foundation.text.modifiers.l.a(this.f225189b, androidx.compose.foundation.text.modifiers.l.a(this.f225188a, 527, 31), 31)) * 31, 31), 31)) * 31)) * 31)) * 31);
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @InterfaceC4852c0(expression = "value", imports = {}))
    @dd.j(name = "-deprecated_value")
    @NotNull
    public final String i() {
        return this.f225189b;
    }

    @dd.j(name = "domain")
    @NotNull
    public final String n() {
        return this.f225191d;
    }

    @dd.j(name = "expiresAt")
    public final long o() {
        return this.f225190c;
    }

    @dd.j(name = "hostOnly")
    public final boolean p() {
        return this.f225196i;
    }

    @dd.j(name = "httpOnly")
    public final boolean q() {
        return this.f225194g;
    }

    public final boolean r(@NotNull HttpUrl url) {
        G.p(url, "url");
        if ((this.f225196i ? G.g(url.f225227d, this.f225191d) : f225183j.d(url.f225227d, this.f225191d)) && f225183j.k(url, this.f225192e)) {
            return !this.f225193f || url.f225233j;
        }
        return false;
    }

    @dd.j(name = "name")
    @NotNull
    public final String s() {
        return this.f225188a;
    }

    @NotNull
    public String toString() {
        return y(false);
    }

    @dd.j(name = "path")
    @NotNull
    public final String v() {
        return this.f225192e;
    }

    @dd.j(name = "persistent")
    public final boolean w() {
        return this.f225195h;
    }

    @dd.j(name = "secure")
    public final boolean x() {
        return this.f225193f;
    }

    @NotNull
    public final String y(boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f225188a);
        sb2.append(SignatureVisitor.INSTANCEOF);
        sb2.append(this.f225189b);
        if (this.f225195h) {
            if (this.f225190c == Long.MIN_VALUE) {
                sb2.append("; max-age=0");
            } else {
                sb2.append("; expires=");
                sb2.append(Fd.c.b(new Date(this.f225190c)));
            }
        }
        if (!this.f225196i) {
            sb2.append("; domain=");
            if (z10) {
                sb2.append(IconCache.EMPTY_CLASS_NAME);
            }
            sb2.append(this.f225191d);
        }
        sb2.append("; path=");
        sb2.append(this.f225192e);
        if (this.f225193f) {
            sb2.append("; secure");
        }
        if (this.f225194g) {
            sb2.append("; httponly");
        }
        String string = sb2.toString();
        G.o(string, "toString()");
        return string;
    }

    @dd.j(name = "value")
    @NotNull
    public final String z() {
        return this.f225189b;
    }

    public Cookie(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f225188a = str;
        this.f225189b = str2;
        this.f225190c = j10;
        this.f225191d = str3;
        this.f225192e = str4;
        this.f225193f = z10;
        this.f225194g = z11;
        this.f225195h = z12;
        this.f225196i = z13;
    }
}
