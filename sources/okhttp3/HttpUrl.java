package okhttp3;

import androidx.compose.animation.core.E0;
import com.android.launcher3.IconCache;
import com.google.common.base.Ascii;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.EOFException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4982o;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.J;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.text.F;
import kotlin.text.M;
import kotlin.text.Regex;
import kotlin.text.U;
import kotlin.text.X;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import okio.C5360j;
import org.jacoco.core.runtime.AgentOptions;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.signature.SignatureVisitor;
import s.C5555a;

/* JADX INFO: loaded from: classes5.dex */
public final class HttpUrl {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final a f225211k = new a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final char[] f225212l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', androidx.compose.ui.graphics.vector.f.f101688t, 'B', androidx.compose.ui.graphics.vector.f.f101680l, 'D', 'E', 'F'};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final String f225213m = " \"':;<=>@[]^`{}|/\\?#";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final String f225214n = " \"':;<=>@[]^`{}|/\\?#";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public static final String f225215o = " \"<>^`{}|/\\?#";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public static final String f225216p = "[]";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public static final String f225217q = " \"'<>#";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public static final String f225218r = " \"'<>#&=";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public static final String f225219s = " !\"#$&'(),/:;<=>?@[]\\^`{|}~";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public static final String f225220t = "\\^`{|}";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public static final String f225221u = " \"':;<=>@[]^`{}|/\\?#&!$(),~";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public static final String f225222v = "";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public static final String f225223w = " \"#<>\\^`{|}";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f225224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f225225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f225226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f225227d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f225228e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final List<String> f225229f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final List<String> f225230g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public final String f225231h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final String f225232i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f225233j;

    public static final class Builder {

        @NotNull
        public static final a Companion = new a();

        @NotNull
        public static final String INVALID_HOST = "Invalid URL host";

        @Nullable
        private String encodedFragment;

        @NotNull
        private final List<String> encodedPathSegments;

        @Nullable
        private List<String> encodedQueryNamesAndValues;

        @Nullable
        private String host;

        @Nullable
        private String scheme;

        @NotNull
        private String encodedUsername = "";

        @NotNull
        private String encodedPassword = "";
        private int port = -1;

        public static final class a {
            public a() {
            }

            public final int e(String str, int i10, int i11) {
                int i12;
                try {
                    i12 = Integer.parseInt(a.f(HttpUrl.f225211k, str, i10, i11, "", false, false, false, false, null, 248, null));
                } catch (NumberFormatException unused) {
                }
                if (1 > i12 || i12 >= 65536) {
                    return -1;
                }
                return i12;
            }

            public final int f(String str, int i10, int i11) {
                while (i10 < i11) {
                    char cCharAt = str.charAt(i10);
                    if (cCharAt == '[') {
                        do {
                            i10++;
                            if (i10 < i11) {
                            }
                        } while (str.charAt(i10) != ']');
                    } else if (cCharAt == ':') {
                        return i10;
                    }
                    i10++;
                }
                return i11;
            }

            public final int g(String str, int i10, int i11) {
                if (i11 - i10 < 2) {
                    return -1;
                }
                char cCharAt = str.charAt(i10);
                if ((G.t(cCharAt, 97) >= 0 && G.t(cCharAt, 122) <= 0) || (G.t(cCharAt, 65) >= 0 && G.t(cCharAt, 90) <= 0)) {
                    int i12 = i10 + 1;
                    while (true) {
                        if (i12 >= i11) {
                            break;
                        }
                        int i13 = i12 + 1;
                        char cCharAt2 = str.charAt(i12);
                        if (('a' <= cCharAt2 && cCharAt2 < '{') || (('A' <= cCharAt2 && cCharAt2 < '[') || (('0' <= cCharAt2 && cCharAt2 < ':') || cCharAt2 == '+' || cCharAt2 == '-' || cCharAt2 == '.'))) {
                            i12 = i13;
                        } else if (cCharAt2 == ':') {
                            return i12;
                        }
                    }
                }
                return -1;
            }

            public final int h(String str, int i10, int i11) {
                int i12 = 0;
                while (i10 < i11) {
                    int i13 = i10 + 1;
                    char cCharAt = str.charAt(i10);
                    if (cCharAt != '\\' && cCharAt != '/') {
                        break;
                    }
                    i12++;
                    i10 = i13;
                }
                return i12;
            }

            public a(C4969v c4969v) {
            }
        }

        public Builder() {
            ArrayList arrayList = new ArrayList();
            this.encodedPathSegments = arrayList;
            arrayList.add("");
        }

        private final int effectivePort() {
            int i10 = this.port;
            if (i10 != -1) {
                return i10;
            }
            a aVar = HttpUrl.f225211k;
            String str = this.scheme;
            G.m(str);
            return aVar.g(str);
        }

        private final boolean isDot(String str) {
            return G.g(str, IconCache.EMPTY_CLASS_NAME) || F.e2(str, "%2e", true);
        }

        private final boolean isDotDot(String str) {
            return G.g(str, "..") || F.e2(str, "%2e.", true) || F.e2(str, ".%2e", true) || F.e2(str, "%2e%2e", true);
        }

        private final void pop() {
            if (this.encodedPathSegments.remove(r0.size() - 1).length() != 0 || this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.add("");
            } else {
                this.encodedPathSegments.set(r0.size() - 1, "");
            }
        }

        private final void push(String str, int i10, int i11, boolean z10, boolean z11) {
            String strF = a.f(HttpUrl.f225211k, str, i10, i11, HttpUrl.f225215o, z11, false, false, false, null, 240, null);
            if (isDot(strF)) {
                return;
            }
            if (isDotDot(strF)) {
                pop();
                return;
            }
            if (((CharSequence) androidx.appcompat.view.menu.d.a(this.encodedPathSegments, 1)).length() == 0) {
                List<String> list = this.encodedPathSegments;
                list.set(list.size() - 1, strF);
            } else {
                this.encodedPathSegments.add(strF);
            }
            if (z10) {
                this.encodedPathSegments.add("");
            }
        }

        private final void removeAllCanonicalQueryParameters(String str) {
            List<String> list = this.encodedQueryNamesAndValues;
            G.m(list);
            int size = list.size() - 2;
            int iC = Xc.o.c(size, 0, -2);
            if (iC > size) {
                return;
            }
            while (true) {
                int i10 = size - 2;
                List<String> list2 = this.encodedQueryNamesAndValues;
                G.m(list2);
                if (G.g(str, list2.get(size))) {
                    List<String> list3 = this.encodedQueryNamesAndValues;
                    G.m(list3);
                    list3.remove(size + 1);
                    List<String> list4 = this.encodedQueryNamesAndValues;
                    G.m(list4);
                    list4.remove(size);
                    List<String> list5 = this.encodedQueryNamesAndValues;
                    G.m(list5);
                    if (list5.isEmpty()) {
                        this.encodedQueryNamesAndValues = null;
                        return;
                    }
                }
                if (size == iC) {
                    return;
                } else {
                    size = i10;
                }
            }
        }

        private final void resolvePath(String str, int i10, int i11) {
            if (i10 == i11) {
                return;
            }
            char cCharAt = str.charAt(i10);
            if (cCharAt == '/' || cCharAt == '\\') {
                this.encodedPathSegments.clear();
                this.encodedPathSegments.add("");
                i10++;
            } else {
                List<String> list = this.encodedPathSegments;
                list.set(list.size() - 1, "");
            }
            int i12 = i10;
            while (i12 < i11) {
                int iT = Bd.f.t(str, "/\\", i12, i11);
                boolean z10 = iT < i11;
                String str2 = str;
                push(str2, i12, iT, z10, true);
                if (z10) {
                    i12 = iT + 1;
                    str = str2;
                } else {
                    str = str2;
                    i12 = iT;
                }
            }
        }

        @NotNull
        public final Builder addEncodedPathSegment(@NotNull String encodedPathSegment) {
            G.p(encodedPathSegment, "encodedPathSegment");
            push(encodedPathSegment, 0, encodedPathSegment.length(), false, true);
            return this;
        }

        @NotNull
        public final Builder addEncodedPathSegments(@NotNull String encodedPathSegments) {
            G.p(encodedPathSegments, "encodedPathSegments");
            return addPathSegments(encodedPathSegments, true);
        }

        @NotNull
        public final Builder addEncodedQueryParameter(@NotNull String encodedName, @Nullable String str) {
            G.p(encodedName, "encodedName");
            if (getEncodedQueryNamesAndValues$okhttp() == null) {
                setEncodedQueryNamesAndValues$okhttp(new ArrayList());
            }
            List<String> encodedQueryNamesAndValues$okhttp = getEncodedQueryNamesAndValues$okhttp();
            G.m(encodedQueryNamesAndValues$okhttp);
            a aVar = HttpUrl.f225211k;
            encodedQueryNamesAndValues$okhttp.add(a.f(aVar, encodedName, 0, 0, HttpUrl.f225218r, true, false, true, false, null, 211, null));
            List<String> encodedQueryNamesAndValues$okhttp2 = getEncodedQueryNamesAndValues$okhttp();
            G.m(encodedQueryNamesAndValues$okhttp2);
            encodedQueryNamesAndValues$okhttp2.add(str == null ? null : a.f(aVar, str, 0, 0, HttpUrl.f225218r, true, false, true, false, null, 211, null));
            return this;
        }

        @NotNull
        public final Builder addPathSegment(@NotNull String pathSegment) {
            G.p(pathSegment, "pathSegment");
            push(pathSegment, 0, pathSegment.length(), false, false);
            return this;
        }

        @NotNull
        public final Builder addPathSegments(@NotNull String pathSegments) {
            G.p(pathSegments, "pathSegments");
            return addPathSegments(pathSegments, false);
        }

        @NotNull
        public final Builder addQueryParameter(@NotNull String name, @Nullable String str) {
            G.p(name, "name");
            if (getEncodedQueryNamesAndValues$okhttp() == null) {
                setEncodedQueryNamesAndValues$okhttp(new ArrayList());
            }
            List<String> encodedQueryNamesAndValues$okhttp = getEncodedQueryNamesAndValues$okhttp();
            G.m(encodedQueryNamesAndValues$okhttp);
            a aVar = HttpUrl.f225211k;
            encodedQueryNamesAndValues$okhttp.add(a.f(aVar, name, 0, 0, HttpUrl.f225219s, false, false, true, false, null, 219, null));
            List<String> encodedQueryNamesAndValues$okhttp2 = getEncodedQueryNamesAndValues$okhttp();
            G.m(encodedQueryNamesAndValues$okhttp2);
            encodedQueryNamesAndValues$okhttp2.add(str == null ? null : a.f(aVar, str, 0, 0, HttpUrl.f225219s, false, false, true, false, null, 219, null));
            return this;
        }

        @NotNull
        public final HttpUrl build() {
            ArrayList arrayList;
            String str = this.scheme;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            a aVar = HttpUrl.f225211k;
            String strN = a.n(aVar, this.encodedUsername, 0, 0, false, 7, null);
            String strN2 = a.n(aVar, this.encodedPassword, 0, 0, false, 7, null);
            String str2 = this.host;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int iEffectivePort = effectivePort();
            List<String> list = this.encodedPathSegments;
            ArrayList arrayList2 = new ArrayList(J.d0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(a.n(HttpUrl.f225211k, (String) it.next(), 0, 0, false, 7, null));
            }
            List<String> list2 = this.encodedQueryNamesAndValues;
            if (list2 == null) {
                arrayList = null;
            } else {
                List<String> list3 = list2;
                ArrayList arrayList3 = new ArrayList(J.d0(list3, 10));
                for (String str3 : list3) {
                    arrayList3.add(str3 == null ? null : a.n(HttpUrl.f225211k, str3, 0, 0, true, 3, null));
                }
                arrayList = arrayList3;
            }
            String str4 = this.encodedFragment;
            return new HttpUrl(str, strN, strN2, str2, iEffectivePort, arrayList2, arrayList, str4 != null ? a.n(HttpUrl.f225211k, str4, 0, 0, false, 7, null) : null, toString());
        }

        @NotNull
        public final Builder encodedFragment(@Nullable String str) {
            setEncodedFragment$okhttp(str == null ? null : a.f(HttpUrl.f225211k, str, 0, 0, "", true, false, false, true, null, Opcodes.PUTSTATIC, null));
            return this;
        }

        @NotNull
        public final Builder encodedPassword(@NotNull String encodedPassword) {
            G.p(encodedPassword, "encodedPassword");
            setEncodedPassword$okhttp(a.f(HttpUrl.f225211k, encodedPassword, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 243, null));
            return this;
        }

        @NotNull
        public final Builder encodedPath(@NotNull String encodedPath) {
            G.p(encodedPath, "encodedPath");
            if (!F.L2(encodedPath, RemoteSettings.FORWARD_SLASH_STRING, false, 2, null)) {
                throw new IllegalArgumentException(G.C("unexpected encodedPath: ", encodedPath).toString());
            }
            resolvePath(encodedPath, 0, encodedPath.length());
            return this;
        }

        @NotNull
        public final Builder encodedQuery(@Nullable String str) {
            List<String> listP;
            if (str == null) {
                listP = null;
            } else {
                a aVar = HttpUrl.f225211k;
                listP = aVar.p(a.f(aVar, str, 0, 0, HttpUrl.f225217q, true, false, true, false, null, 211, null));
            }
            setEncodedQueryNamesAndValues$okhttp(listP);
            return this;
        }

        @NotNull
        public final Builder encodedUsername(@NotNull String encodedUsername) {
            G.p(encodedUsername, "encodedUsername");
            setEncodedUsername$okhttp(a.f(HttpUrl.f225211k, encodedUsername, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 243, null));
            return this;
        }

        @NotNull
        public final Builder fragment(@Nullable String str) {
            setEncodedFragment$okhttp(str == null ? null : a.f(HttpUrl.f225211k, str, 0, 0, "", false, false, false, true, null, Opcodes.NEW, null));
            return this;
        }

        @Nullable
        public final String getEncodedFragment$okhttp() {
            return this.encodedFragment;
        }

        @NotNull
        public final String getEncodedPassword$okhttp() {
            return this.encodedPassword;
        }

        @NotNull
        public final List<String> getEncodedPathSegments$okhttp() {
            return this.encodedPathSegments;
        }

        @Nullable
        public final List<String> getEncodedQueryNamesAndValues$okhttp() {
            return this.encodedQueryNamesAndValues;
        }

        @NotNull
        public final String getEncodedUsername$okhttp() {
            return this.encodedUsername;
        }

        @Nullable
        public final String getHost$okhttp() {
            return this.host;
        }

        public final int getPort$okhttp() {
            return this.port;
        }

        @Nullable
        public final String getScheme$okhttp() {
            return this.scheme;
        }

        @NotNull
        public final Builder host(@NotNull String host) {
            G.p(host, "host");
            String strE = Bd.a.e(a.n(HttpUrl.f225211k, host, 0, 0, false, 7, null));
            if (strE == null) {
                throw new IllegalArgumentException(G.C("unexpected host: ", host));
            }
            setHost$okhttp(strE);
            return this;
        }

        @NotNull
        public final Builder parse$okhttp(@Nullable HttpUrl httpUrl, @NotNull String str) {
            int iT;
            int i10;
            String str2;
            int i11;
            String str3;
            boolean z10;
            int i12;
            int i13;
            int i14;
            char c10;
            int i15;
            String input = str;
            G.p(input, "input");
            int iG = Bd.f.G(input, 0, 0, 3, null);
            int I10 = Bd.f.I(input, iG, 0, 2, null);
            a aVar = Companion;
            int iG2 = aVar.g(input, iG, I10);
            String str4 = "this as java.lang.String…ing(startIndex, endIndex)";
            boolean z11 = true;
            int i16 = -1;
            if (iG2 != -1) {
                if (F.I2(input, "https:", iG, true)) {
                    this.scheme = "https";
                    iG += 6;
                } else {
                    if (!F.I2(input, "http:", iG, true)) {
                        StringBuilder sb2 = new StringBuilder("Expected URL scheme 'http' or 'https' but was '");
                        String strSubstring = input.substring(0, iG2);
                        G.o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb2.append(strSubstring);
                        sb2.append('\'');
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    this.scheme = "http";
                    iG += 5;
                }
            } else {
                if (httpUrl == null) {
                    throw new IllegalArgumentException(G.C("Expected URL scheme 'http' or 'https' but no scheme was found for ", input.length() > 6 ? G.C(U.D9(input, 6), "...") : input));
                }
                this.scheme = httpUrl.f225224a;
            }
            int iH = aVar.h(input, iG, I10);
            int i17 = 63;
            int i18 = 35;
            if (iH >= 2 || httpUrl == null || !G.g(httpUrl.f225224a, this.scheme)) {
                boolean z12 = false;
                boolean z13 = false;
                int i19 = iG + iH;
                while (true) {
                    iT = Bd.f.t(input, "@/\\?#", i19, I10);
                    int iCharAt = iT != I10 ? input.charAt(iT) : i16;
                    if (iCharAt == i16 || iCharAt == i18 || iCharAt == 47 || iCharAt == 92 || iCharAt == i17) {
                        break;
                    }
                    if (iCharAt == 64) {
                        if (z12) {
                            i11 = I10;
                            str3 = str4;
                            z10 = z11;
                            i12 = i16;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(this.encodedPassword);
                            sb3.append("%40");
                            input = str;
                            i13 = iT;
                            sb3.append(a.f(HttpUrl.f225211k, input, i19, iT, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null));
                            this.encodedPassword = sb3.toString();
                        } else {
                            int iS = Bd.f.s(input, ':', i19, iT);
                            a aVar2 = HttpUrl.f225211k;
                            str3 = str4;
                            z10 = z11;
                            i12 = i16;
                            i11 = I10;
                            String strF = a.f(aVar2, input, i19, iS, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                            if (z13) {
                                strF = E0.a(new StringBuilder(), this.encodedUsername, "%40", strF);
                            }
                            this.encodedUsername = strF;
                            if (iS != iT) {
                                i14 = iT;
                                this.encodedPassword = a.f(aVar2, str, iS + 1, i14, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                                z12 = z10;
                            } else {
                                i14 = iT;
                            }
                            input = str;
                            i13 = i14;
                            z13 = z10;
                        }
                        i19 = i13 + 1;
                        i16 = i12;
                        I10 = i11;
                        str4 = str3;
                        z11 = z10;
                        i17 = 63;
                        i18 = 35;
                    }
                }
                i10 = I10;
                String str5 = str4;
                int i20 = i16;
                a aVar3 = Companion;
                int iF = aVar3.f(input, i19, iT);
                int i21 = iF + 1;
                if (i21 < iT) {
                    this.host = Bd.a.e(a.n(HttpUrl.f225211k, input, i19, iF, false, 4, null));
                    int iE = aVar3.e(input, i21, iT);
                    this.port = iE;
                    if (iE == i20) {
                        StringBuilder sb4 = new StringBuilder("Invalid URL port: \"");
                        String strSubstring2 = input.substring(i21, iT);
                        G.o(strSubstring2, str5);
                        sb4.append(strSubstring2);
                        sb4.append('\"');
                        throw new IllegalArgumentException(sb4.toString().toString());
                    }
                    str2 = str5;
                } else {
                    str2 = str5;
                    a aVar4 = HttpUrl.f225211k;
                    this.host = Bd.a.e(a.n(aVar4, input, i19, iF, false, 4, null));
                    String str6 = this.scheme;
                    G.m(str6);
                    this.port = aVar4.g(str6);
                }
                if (this.host == null) {
                    StringBuilder sb5 = new StringBuilder("Invalid URL host: \"");
                    String strSubstring3 = input.substring(i19, iF);
                    G.o(strSubstring3, str2);
                    sb5.append(strSubstring3);
                    sb5.append('\"');
                    throw new IllegalArgumentException(sb5.toString().toString());
                }
                iG = iT;
            } else {
                this.encodedUsername = httpUrl.A();
                this.encodedPassword = httpUrl.w();
                this.host = httpUrl.f225227d;
                this.port = httpUrl.f225228e;
                this.encodedPathSegments.clear();
                this.encodedPathSegments.addAll(httpUrl.y());
                if (iG == I10 || input.charAt(iG) == '#') {
                    encodedQuery(httpUrl.z());
                }
                i10 = I10;
            }
            int i22 = i10;
            int iT2 = Bd.f.t(input, "?#", iG, i22);
            resolvePath(input, iG, iT2);
            if (iT2 >= i22 || input.charAt(iT2) != '?') {
                c10 = H3.b.f45548j;
                i15 = iT2;
            } else {
                c10 = H3.b.f45548j;
                int iS2 = Bd.f.s(input, H3.b.f45548j, iT2, i22);
                a aVar5 = HttpUrl.f225211k;
                this.encodedQueryNamesAndValues = aVar5.p(a.f(aVar5, input, iT2 + 1, iS2, HttpUrl.f225217q, true, false, true, false, null, 208, null));
                i15 = iS2;
            }
            if (i15 < i22 && input.charAt(i15) == c10) {
                this.encodedFragment = a.f(HttpUrl.f225211k, input, i15 + 1, i22, "", true, false, false, true, null, Opcodes.ARETURN, null);
            }
            return this;
        }

        @NotNull
        public final Builder password(@NotNull String password) {
            G.p(password, "password");
            setEncodedPassword$okhttp(a.f(HttpUrl.f225211k, password, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null));
            return this;
        }

        @NotNull
        public final Builder port(int i10) {
            if (1 > i10 || i10 >= 65536) {
                throw new IllegalArgumentException(G.C("unexpected port: ", Integer.valueOf(i10)).toString());
            }
            setPort$okhttp(i10);
            return this;
        }

        @NotNull
        public final Builder query(@Nullable String str) {
            List<String> listP;
            if (str == null) {
                listP = null;
            } else {
                a aVar = HttpUrl.f225211k;
                listP = aVar.p(a.f(aVar, str, 0, 0, HttpUrl.f225217q, false, false, true, false, null, 219, null));
            }
            setEncodedQueryNamesAndValues$okhttp(listP);
            return this;
        }

        @NotNull
        public final Builder reencodeForUri$okhttp() {
            String host$okhttp = getHost$okhttp();
            setHost$okhttp(host$okhttp == null ? null : new Regex("[\"<>^`{|}]").p(host$okhttp, ""));
            int size = getEncodedPathSegments$okhttp().size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                getEncodedPathSegments$okhttp().set(i11, a.f(HttpUrl.f225211k, getEncodedPathSegments$okhttp().get(i11), 0, 0, HttpUrl.f225216p, true, true, false, false, null, 227, null));
            }
            List<String> encodedQueryNamesAndValues$okhttp = getEncodedQueryNamesAndValues$okhttp();
            if (encodedQueryNamesAndValues$okhttp != null) {
                int size2 = encodedQueryNamesAndValues$okhttp.size();
                while (i10 < size2) {
                    int i12 = i10 + 1;
                    String str = encodedQueryNamesAndValues$okhttp.get(i10);
                    encodedQueryNamesAndValues$okhttp.set(i10, str == null ? null : a.f(HttpUrl.f225211k, str, 0, 0, HttpUrl.f225220t, true, true, true, false, null, 195, null));
                    i10 = i12;
                }
            }
            String encodedFragment$okhttp = getEncodedFragment$okhttp();
            setEncodedFragment$okhttp(encodedFragment$okhttp != null ? a.f(HttpUrl.f225211k, encodedFragment$okhttp, 0, 0, HttpUrl.f225223w, true, true, false, true, null, Opcodes.IF_ICMPGT, null) : null);
            return this;
        }

        @NotNull
        public final Builder removeAllEncodedQueryParameters(@NotNull String encodedName) {
            G.p(encodedName, "encodedName");
            if (getEncodedQueryNamesAndValues$okhttp() == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(a.f(HttpUrl.f225211k, encodedName, 0, 0, HttpUrl.f225218r, true, false, true, false, null, 211, null));
            return this;
        }

        @NotNull
        public final Builder removeAllQueryParameters(@NotNull String name) {
            G.p(name, "name");
            if (getEncodedQueryNamesAndValues$okhttp() == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(a.f(HttpUrl.f225211k, name, 0, 0, HttpUrl.f225219s, false, false, true, false, null, 219, null));
            return this;
        }

        @NotNull
        public final Builder removePathSegment(int i10) {
            getEncodedPathSegments$okhttp().remove(i10);
            if (getEncodedPathSegments$okhttp().isEmpty()) {
                getEncodedPathSegments$okhttp().add("");
            }
            return this;
        }

        @NotNull
        public final Builder scheme(@NotNull String scheme) {
            G.p(scheme, "scheme");
            if (scheme.equalsIgnoreCase("http")) {
                setScheme$okhttp("http");
                return this;
            }
            if (!scheme.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException(G.C("unexpected scheme: ", scheme));
            }
            setScheme$okhttp("https");
            return this;
        }

        public final void setEncodedFragment$okhttp(@Nullable String str) {
            this.encodedFragment = str;
        }

        public final void setEncodedPassword$okhttp(@NotNull String str) {
            G.p(str, "<set-?>");
            this.encodedPassword = str;
        }

        @NotNull
        public final Builder setEncodedPathSegment(int i10, @NotNull String encodedPathSegment) {
            G.p(encodedPathSegment, "encodedPathSegment");
            String strF = a.f(HttpUrl.f225211k, encodedPathSegment, 0, 0, HttpUrl.f225215o, true, false, false, false, null, 243, null);
            getEncodedPathSegments$okhttp().set(i10, strF);
            if (isDot(strF) || isDotDot(strF)) {
                throw new IllegalArgumentException(G.C("unexpected path segment: ", encodedPathSegment).toString());
            }
            return this;
        }

        public final void setEncodedQueryNamesAndValues$okhttp(@Nullable List<String> list) {
            this.encodedQueryNamesAndValues = list;
        }

        @NotNull
        public final Builder setEncodedQueryParameter(@NotNull String encodedName, @Nullable String str) {
            G.p(encodedName, "encodedName");
            removeAllEncodedQueryParameters(encodedName);
            addEncodedQueryParameter(encodedName, str);
            return this;
        }

        public final void setEncodedUsername$okhttp(@NotNull String str) {
            G.p(str, "<set-?>");
            this.encodedUsername = str;
        }

        public final void setHost$okhttp(@Nullable String str) {
            this.host = str;
        }

        @NotNull
        public final Builder setPathSegment(int i10, @NotNull String pathSegment) {
            G.p(pathSegment, "pathSegment");
            String strF = a.f(HttpUrl.f225211k, pathSegment, 0, 0, HttpUrl.f225215o, false, false, false, false, null, 251, null);
            if (isDot(strF) || isDotDot(strF)) {
                throw new IllegalArgumentException(G.C("unexpected path segment: ", pathSegment).toString());
            }
            getEncodedPathSegments$okhttp().set(i10, strF);
            return this;
        }

        public final void setPort$okhttp(int i10) {
            this.port = i10;
        }

        @NotNull
        public final Builder setQueryParameter(@NotNull String name, @Nullable String str) {
            G.p(name, "name");
            removeAllQueryParameters(name);
            addQueryParameter(name, str);
            return this;
        }

        public final void setScheme$okhttp(@Nullable String str) {
            this.scheme = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x00a9  */
        @org.jetbrains.annotations.NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String toString() {
            /*
                Method dump skipped, instruction units count: 233
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Builder.toString():java.lang.String");
        }

        @NotNull
        public final Builder username(@NotNull String username) {
            G.p(username, "username");
            setEncodedUsername$okhttp(a.f(HttpUrl.f225211k, username, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null));
            return this;
        }

        private final Builder addPathSegments(String str, boolean z10) {
            boolean z11;
            Builder builder;
            String str2;
            boolean z12;
            int i10 = 0;
            while (true) {
                int iT = Bd.f.t(str, "/\\", i10, str.length());
                if (iT < str.length()) {
                    z11 = true;
                    str2 = str;
                    z12 = z10;
                    builder = this;
                } else {
                    z11 = false;
                    builder = this;
                    str2 = str;
                    z12 = z10;
                }
                builder.push(str2, i10, iT, z11, z12);
                i10 = iT + 1;
                if (i10 > str2.length()) {
                    return builder;
                }
                str = str2;
                z10 = z12;
            }
        }
    }

    public static final class a {
        public a() {
        }

        public static /* synthetic */ String f(a aVar, String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = str.length();
            }
            if ((i12 & 8) != 0) {
                z10 = false;
            }
            if ((i12 & 16) != 0) {
                z11 = false;
            }
            if ((i12 & 32) != 0) {
                z12 = false;
            }
            if ((i12 & 64) != 0) {
                z13 = false;
            }
            if ((i12 & 128) != 0) {
                charset = null;
            }
            return aVar.e(str, i10, i11, str2, z10, z11, z12, z13, charset);
        }

        public static /* synthetic */ String n(a aVar, String str, int i10, int i11, boolean z10, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = str.length();
            }
            if ((i12 & 4) != 0) {
                z10 = false;
            }
            return aVar.m(str, i10, i11, z10);
        }

        @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @InterfaceC4852c0(expression = "url.toHttpUrl()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrl"}))
        @dd.j(name = "-deprecated_get")
        @NotNull
        public final HttpUrl a(@NotNull String url) {
            G.p(url, "url");
            return h(url);
        }

        @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @InterfaceC4852c0(expression = "uri.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
        @dd.j(name = "-deprecated_get")
        @Nullable
        public final HttpUrl b(@NotNull URI uri) {
            G.p(uri, "uri");
            return i(uri);
        }

        @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @InterfaceC4852c0(expression = "url.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
        @dd.j(name = "-deprecated_get")
        @Nullable
        public final HttpUrl c(@NotNull URL url) {
            G.p(url, "url");
            return j(url);
        }

        @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @InterfaceC4852c0(expression = "url.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
        @dd.j(name = "-deprecated_parse")
        @Nullable
        public final HttpUrl d(@NotNull String url) {
            G.p(url, "url");
            return l(url);
        }

        @NotNull
        public final String e(@NotNull String str, int i10, int i11, @NotNull String encodeSet, boolean z10, boolean z11, boolean z12, boolean z13, @Nullable Charset charset) throws EOFException {
            G.p(str, "<this>");
            G.p(encodeSet, "encodeSet");
            int iCharCount = i10;
            while (iCharCount < i11) {
                int iCodePointAt = str.codePointAt(iCharCount);
                if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z13) || M.o3(encodeSet, (char) iCodePointAt, false, 2, null) || ((iCodePointAt == 37 && (!z10 || (z11 && !k(str, iCharCount, i11)))) || (iCodePointAt == 43 && z12)))) {
                    C5360j c5360j = new C5360j();
                    c5360j.n4(str, i10, iCharCount);
                    r(c5360j, str, iCharCount, i11, encodeSet, z10, z11, z12, z13, charset);
                    return c5360j.a2();
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
            String strSubstring = str.substring(i10, i11);
            G.o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }

        @dd.o
        public final int g(@NotNull String scheme) {
            G.p(scheme, "scheme");
            if (scheme.equals("http")) {
                return 80;
            }
            return scheme.equals("https") ? 443 : -1;
        }

        @dd.o
        @dd.j(name = w7.i.f240158w)
        @NotNull
        public final HttpUrl h(@NotNull String str) {
            G.p(str, "<this>");
            return new Builder().parse$okhttp(null, str).build();
        }

        @dd.o
        @dd.j(name = w7.i.f240158w)
        @Nullable
        public final HttpUrl i(@NotNull URI uri) {
            G.p(uri, "<this>");
            String string = uri.toString();
            G.o(string, "toString()");
            return l(string);
        }

        @dd.o
        @dd.j(name = w7.i.f240158w)
        @Nullable
        public final HttpUrl j(@NotNull URL url) {
            G.p(url, "<this>");
            String string = url.toString();
            G.o(string, "toString()");
            return l(string);
        }

        public final boolean k(String str, int i10, int i11) {
            int i12 = i10 + 2;
            return i12 < i11 && str.charAt(i10) == '%' && Bd.f.R(str.charAt(i10 + 1)) != -1 && Bd.f.R(str.charAt(i12)) != -1;
        }

        @dd.o
        @dd.j(name = "parse")
        @Nullable
        public final HttpUrl l(@NotNull String str) {
            G.p(str, "<this>");
            try {
                return h(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        @NotNull
        public final String m(@NotNull String str, int i10, int i11, boolean z10) {
            G.p(str, "<this>");
            int i12 = i10;
            while (i12 < i11) {
                int i13 = i12 + 1;
                char cCharAt = str.charAt(i12);
                if (cCharAt == '%' || (cCharAt == '+' && z10)) {
                    C5360j c5360j = new C5360j();
                    c5360j.n4(str, i10, i12);
                    s(c5360j, str, i12, i11, z10);
                    return c5360j.a2();
                }
                i12 = i13;
            }
            String strSubstring = str.substring(i10, i11);
            G.o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }

        public final void o(@NotNull List<String> list, @NotNull StringBuilder out) {
            G.p(list, "<this>");
            G.p(out, "out");
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                out.append('/');
                out.append(list.get(i10));
            }
        }

        @NotNull
        public final List<String> p(@NotNull String str) {
            G.p(str, "<this>");
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (i10 <= str.length()) {
                String str2 = str;
                int iK3 = M.K3(str2, X.f218302d, i10, false, 4, null);
                if (iK3 == -1) {
                    iK3 = str2.length();
                }
                int iK32 = M.K3(str2, SignatureVisitor.INSTANCEOF, i10, false, 4, null);
                if (iK32 == -1 || iK32 > iK3) {
                    String strSubstring = str2.substring(i10, iK3);
                    G.o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring);
                    arrayList.add(null);
                } else {
                    String strSubstring2 = str2.substring(i10, iK32);
                    G.o(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring2);
                    String strSubstring3 = str2.substring(iK32 + 1, iK3);
                    G.o(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring3);
                }
                i10 = iK3 + 1;
                str = str2;
            }
            return arrayList;
        }

        public final void q(@NotNull List<String> list, @NotNull StringBuilder out) {
            G.p(list, "<this>");
            G.p(out, "out");
            md.j jVarD1 = md.u.D1(md.u.Y1(0, list.size()), 2);
            int i10 = jVarD1.f221139a;
            int i11 = jVarD1.f221140b;
            int i12 = jVarD1.f221141c;
            if ((i12 <= 0 || i10 > i11) && (i12 >= 0 || i11 > i10)) {
                return;
            }
            while (true) {
                int i13 = i10 + i12;
                String str = list.get(i10);
                String str2 = list.get(i10 + 1);
                if (i10 > 0) {
                    out.append(X.f218302d);
                }
                out.append(str);
                if (str2 != null) {
                    out.append(SignatureVisitor.INSTANCEOF);
                    out.append(str2);
                }
                if (i10 == i11) {
                    return;
                } else {
                    i10 = i13;
                }
            }
        }

        public final void r(C5360j c5360j, String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) throws EOFException {
            int iCharCount = i10;
            C5360j c5360j2 = null;
            while (iCharCount < i11) {
                int iCodePointAt = str.codePointAt(iCharCount);
                if (!z10 || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                    if (iCodePointAt == 43 && z12) {
                        c5360j.m4(z10 ? "+" : "%2B");
                    } else {
                        if (iCodePointAt >= 32 && iCodePointAt != 127 && (iCodePointAt < 128 || z13)) {
                            if (!M.o3(str2, (char) iCodePointAt, false, 2, null) && (iCodePointAt != 37 || (z10 && (!z11 || k(str, iCharCount, i11))))) {
                                c5360j.o4(iCodePointAt);
                            }
                        }
                        if (c5360j2 == null) {
                            c5360j2 = new C5360j();
                        }
                        if (charset == null || charset.equals(StandardCharsets.UTF_8)) {
                            c5360j2.o4(iCodePointAt);
                        } else {
                            c5360j2.h4(str, iCharCount, Character.charCount(iCodePointAt) + iCharCount, charset);
                        }
                        while (!c5360j2.r3()) {
                            byte b10 = c5360j2.readByte();
                            c5360j.Y3(37);
                            char[] cArr = HttpUrl.f225212l;
                            c5360j.Y3(cArr[((b10 & 255) >> 4) & 15]);
                            c5360j.Y3(cArr[b10 & Ascii.SI]);
                        }
                    }
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
        }

        public final void s(C5360j c5360j, String str, int i10, int i11, boolean z10) {
            int i12;
            while (i10 < i11) {
                int iCodePointAt = str.codePointAt(i10);
                if (iCodePointAt == 37 && (i12 = i10 + 2) < i11) {
                    int iR = Bd.f.R(str.charAt(i10 + 1));
                    int iR2 = Bd.f.R(str.charAt(i12));
                    if (iR == -1 || iR2 == -1) {
                        c5360j.o4(iCodePointAt);
                        i10 += Character.charCount(iCodePointAt);
                    } else {
                        c5360j.Y3((iR << 4) + iR2);
                        i10 = Character.charCount(iCodePointAt) + i12;
                    }
                } else if (iCodePointAt == 43 && z10) {
                    c5360j.Y3(32);
                    i10++;
                } else {
                    c5360j.o4(iCodePointAt);
                    i10 += Character.charCount(iCodePointAt);
                }
            }
        }

        public a(C4969v c4969v) {
        }
    }

    public HttpUrl(@NotNull String scheme, @NotNull String username, @NotNull String password, @NotNull String host, int i10, @NotNull List<String> pathSegments, @Nullable List<String> list, @Nullable String str, @NotNull String url) {
        G.p(scheme, "scheme");
        G.p(username, "username");
        G.p(password, "password");
        G.p(host, "host");
        G.p(pathSegments, "pathSegments");
        G.p(url, "url");
        this.f225224a = scheme;
        this.f225225b = username;
        this.f225226c = password;
        this.f225227d = host;
        this.f225228e = i10;
        this.f225229f = pathSegments;
        this.f225230g = list;
        this.f225231h = str;
        this.f225232i = url;
        this.f225233j = G.g(scheme, "https");
    }

    @dd.o
    @dd.j(name = w7.i.f240158w)
    @NotNull
    public static final HttpUrl C(@NotNull String str) {
        return f225211k.h(str);
    }

    @dd.o
    @dd.j(name = w7.i.f240158w)
    @Nullable
    public static final HttpUrl D(@NotNull URI uri) {
        return f225211k.i(uri);
    }

    @dd.o
    @dd.j(name = w7.i.f240158w)
    @Nullable
    public static final HttpUrl E(@NotNull URL url) {
        return f225211k.j(url);
    }

    @dd.o
    @dd.j(name = "parse")
    @Nullable
    public static final HttpUrl J(@NotNull String str) {
        return f225211k.l(str);
    }

    @dd.o
    public static final int u(@NotNull String str) {
        return f225211k.g(str);
    }

    @dd.j(name = "encodedUsername")
    @NotNull
    public final String A() {
        if (this.f225225b.length() == 0) {
            return "";
        }
        int length = this.f225224a.length() + 3;
        String str = this.f225232i;
        String strSubstring = this.f225232i.substring(length, Bd.f.t(str, ":@", length, str.length()));
        G.o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @dd.j(name = "fragment")
    @Nullable
    public final String B() {
        return this.f225231h;
    }

    @dd.j(name = Hd.d.f50815k)
    @NotNull
    public final String F() {
        return this.f225227d;
    }

    public final boolean G() {
        return this.f225233j;
    }

    @NotNull
    public final Builder H() {
        Builder builder = new Builder();
        builder.setScheme$okhttp(this.f225224a);
        builder.setEncodedUsername$okhttp(A());
        builder.setEncodedPassword$okhttp(w());
        builder.setHost$okhttp(this.f225227d);
        builder.setPort$okhttp(this.f225228e != f225211k.g(this.f225224a) ? this.f225228e : -1);
        builder.getEncodedPathSegments$okhttp().clear();
        builder.getEncodedPathSegments$okhttp().addAll(y());
        builder.encodedQuery(z());
        builder.setEncodedFragment$okhttp(v());
        return builder;
    }

    @Nullable
    public final Builder I(@NotNull String link) {
        G.p(link, "link");
        try {
            return new Builder().parse$okhttp(this, link);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @dd.j(name = "password")
    @NotNull
    public final String K() {
        return this.f225226c;
    }

    @dd.j(name = "pathSegments")
    @NotNull
    public final List<String> L() {
        return this.f225229f;
    }

    @dd.j(name = "pathSize")
    public final int M() {
        return this.f225229f.size();
    }

    @dd.j(name = AgentOptions.PORT)
    public final int N() {
        return this.f225228e;
    }

    @dd.j(name = "query")
    @Nullable
    public final String O() {
        if (this.f225230g == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        f225211k.q(this.f225230g, sb2);
        return sb2.toString();
    }

    @Nullable
    public final String P(@NotNull String name) {
        G.p(name, "name");
        List<String> list = this.f225230g;
        if (list == null) {
            return null;
        }
        md.j jVarD1 = md.u.D1(md.u.Y1(0, list.size()), 2);
        int i10 = jVarD1.f221139a;
        int i11 = jVarD1.f221140b;
        int i12 = jVarD1.f221141c;
        if ((i12 > 0 && i10 <= i11) || (i12 < 0 && i11 <= i10)) {
            while (true) {
                int i13 = i10 + i12;
                if (name.equals(this.f225230g.get(i10))) {
                    return this.f225230g.get(i10 + 1);
                }
                if (i10 == i11) {
                    break;
                }
                i10 = i13;
            }
        }
        return null;
    }

    @NotNull
    public final String Q(int i10) {
        List<String> list = this.f225230g;
        if (list == null) {
            throw new IndexOutOfBoundsException();
        }
        String str = list.get(i10 * 2);
        G.m(str);
        return str;
    }

    @dd.j(name = "queryParameterNames")
    @NotNull
    public final Set<String> R() {
        if (this.f225230g == null) {
            return EmptySet.f217512a;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        md.j jVarD1 = md.u.D1(md.u.Y1(0, this.f225230g.size()), 2);
        int i10 = jVarD1.f221139a;
        int i11 = jVarD1.f221140b;
        int i12 = jVarD1.f221141c;
        if ((i12 > 0 && i10 <= i11) || (i12 < 0 && i11 <= i10)) {
            while (true) {
                int i13 = i10 + i12;
                String str = this.f225230g.get(i10);
                G.m(str);
                linkedHashSet.add(str);
                if (i10 == i11) {
                    break;
                }
                i10 = i13;
            }
        }
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        G.o(setUnmodifiableSet, "unmodifiableSet(result)");
        return setUnmodifiableSet;
    }

    @Nullable
    public final String S(int i10) {
        List<String> list = this.f225230g;
        if (list != null) {
            return list.get((i10 * 2) + 1);
        }
        throw new IndexOutOfBoundsException();
    }

    @NotNull
    public final List<String> T(@NotNull String name) {
        G.p(name, "name");
        if (this.f225230g == null) {
            return EmptyList.f217510a;
        }
        ArrayList arrayList = new ArrayList();
        md.j jVarD1 = md.u.D1(md.u.Y1(0, this.f225230g.size()), 2);
        int i10 = jVarD1.f221139a;
        int i11 = jVarD1.f221140b;
        int i12 = jVarD1.f221141c;
        if ((i12 > 0 && i10 <= i11) || (i12 < 0 && i11 <= i10)) {
            while (true) {
                int i13 = i10 + i12;
                if (name.equals(this.f225230g.get(i10))) {
                    arrayList.add(this.f225230g.get(i10 + 1));
                }
                if (i10 == i11) {
                    break;
                }
                i10 = i13;
            }
        }
        List<String> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        G.o(listUnmodifiableList, "unmodifiableList(result)");
        return listUnmodifiableList;
    }

    @dd.j(name = "querySize")
    public final int U() {
        List<String> list = this.f225230g;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    @NotNull
    public final String V() {
        Builder builderI = I("/...");
        G.m(builderI);
        return builderI.username("").password("").build().f225232i;
    }

    @Nullable
    public final HttpUrl W(@NotNull String link) {
        G.p(link, "link");
        Builder builderI = I(link);
        if (builderI == null) {
            return null;
        }
        return builderI.build();
    }

    @dd.j(name = "scheme")
    @NotNull
    public final String X() {
        return this.f225224a;
    }

    @Nullable
    public final String Y() {
        if (Bd.f.k(this.f225227d)) {
            return null;
        }
        PublicSuffixDatabase.f225779e.getClass();
        return PublicSuffixDatabase.f225784j.c(this.f225227d);
    }

    @dd.j(name = "uri")
    @NotNull
    public final URI Z() {
        String string = H().reencodeForUri$okhttp().toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e10) {
            try {
                URI uriCreate = URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").p(string, ""));
                G.o(uriCreate, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e10);
            }
        }
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @InterfaceC4852c0(expression = "encodedFragment", imports = {}))
    @dd.j(name = "-deprecated_encodedFragment")
    @Nullable
    public final String a() {
        return v();
    }

    @dd.j(name = "url")
    @NotNull
    public final URL a0() {
        try {
            return new URL(this.f225232i);
        } catch (MalformedURLException e10) {
            throw new RuntimeException(e10);
        }
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @InterfaceC4852c0(expression = "encodedPassword", imports = {}))
    @dd.j(name = "-deprecated_encodedPassword")
    @NotNull
    public final String b() {
        return w();
    }

    @dd.j(name = C5555a.f237758c)
    @NotNull
    public final String b0() {
        return this.f225225b;
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @InterfaceC4852c0(expression = "encodedPath", imports = {}))
    @dd.j(name = "-deprecated_encodedPath")
    @NotNull
    public final String c() {
        return x();
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @InterfaceC4852c0(expression = "encodedPathSegments", imports = {}))
    @dd.j(name = "-deprecated_encodedPathSegments")
    @NotNull
    public final List<String> d() {
        return y();
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @InterfaceC4852c0(expression = "encodedQuery", imports = {}))
    @dd.j(name = "-deprecated_encodedQuery")
    @Nullable
    public final String e() {
        return z();
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof HttpUrl) && G.g(((HttpUrl) obj).f225232i, this.f225232i);
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @InterfaceC4852c0(expression = "encodedUsername", imports = {}))
    @dd.j(name = "-deprecated_encodedUsername")
    @NotNull
    public final String f() {
        return A();
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @InterfaceC4852c0(expression = "fragment", imports = {}))
    @dd.j(name = "-deprecated_fragment")
    @Nullable
    public final String g() {
        return this.f225231h;
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @InterfaceC4852c0(expression = Hd.d.f50815k, imports = {}))
    @dd.j(name = "-deprecated_host")
    @NotNull
    public final String h() {
        return this.f225227d;
    }

    public int hashCode() {
        return this.f225232i.hashCode();
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @InterfaceC4852c0(expression = "password", imports = {}))
    @dd.j(name = "-deprecated_password")
    @NotNull
    public final String i() {
        return this.f225226c;
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @InterfaceC4852c0(expression = "pathSegments", imports = {}))
    @dd.j(name = "-deprecated_pathSegments")
    @NotNull
    public final List<String> j() {
        return this.f225229f;
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @InterfaceC4852c0(expression = "pathSize", imports = {}))
    @dd.j(name = "-deprecated_pathSize")
    public final int k() {
        return this.f225229f.size();
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @InterfaceC4852c0(expression = AgentOptions.PORT, imports = {}))
    @dd.j(name = "-deprecated_port")
    public final int l() {
        return this.f225228e;
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @InterfaceC4852c0(expression = "query", imports = {}))
    @dd.j(name = "-deprecated_query")
    @Nullable
    public final String m() {
        return O();
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @InterfaceC4852c0(expression = "queryParameterNames", imports = {}))
    @dd.j(name = "-deprecated_queryParameterNames")
    @NotNull
    public final Set<String> n() {
        return R();
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @InterfaceC4852c0(expression = "querySize", imports = {}))
    @dd.j(name = "-deprecated_querySize")
    public final int o() {
        return U();
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @InterfaceC4852c0(expression = "scheme", imports = {}))
    @dd.j(name = "-deprecated_scheme")
    @NotNull
    public final String p() {
        return this.f225224a;
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to toUri()", replaceWith = @InterfaceC4852c0(expression = "toUri()", imports = {}))
    @dd.j(name = "-deprecated_uri")
    @NotNull
    public final URI q() {
        return Z();
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to toUrl()", replaceWith = @InterfaceC4852c0(expression = "toUrl()", imports = {}))
    @dd.j(name = "-deprecated_url")
    @NotNull
    public final URL r() {
        return a0();
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @InterfaceC4852c0(expression = C5555a.f237758c, imports = {}))
    @dd.j(name = "-deprecated_username")
    @NotNull
    public final String s() {
        return this.f225225b;
    }

    @NotNull
    public String toString() {
        return this.f225232i;
    }

    @dd.j(name = "encodedFragment")
    @Nullable
    public final String v() {
        if (this.f225231h == null) {
            return null;
        }
        String strSubstring = this.f225232i.substring(M.K3(this.f225232i, H3.b.f45548j, 0, false, 6, null) + 1);
        G.o(strSubstring, "this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    @dd.j(name = "encodedPassword")
    @NotNull
    public final String w() {
        if (this.f225226c.length() == 0) {
            return "";
        }
        String strSubstring = this.f225232i.substring(M.K3(this.f225232i, ':', this.f225224a.length() + 3, false, 4, null) + 1, M.K3(this.f225232i, '@', 0, false, 6, null));
        G.o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @dd.j(name = "encodedPath")
    @NotNull
    public final String x() {
        int iK3 = M.K3(this.f225232i, '/', this.f225224a.length() + 3, false, 4, null);
        String str = this.f225232i;
        String strSubstring = this.f225232i.substring(iK3, Bd.f.t(str, "?#", iK3, str.length()));
        G.o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @dd.j(name = "encodedPathSegments")
    @NotNull
    public final List<String> y() {
        int iK3 = M.K3(this.f225232i, '/', this.f225224a.length() + 3, false, 4, null);
        String str = this.f225232i;
        int iT = Bd.f.t(str, "?#", iK3, str.length());
        ArrayList arrayList = new ArrayList();
        while (iK3 < iT) {
            int i10 = iK3 + 1;
            int iS = Bd.f.s(this.f225232i, '/', i10, iT);
            String strSubstring = this.f225232i.substring(i10, iS);
            G.o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(strSubstring);
            iK3 = iS;
        }
        return arrayList;
    }

    @dd.j(name = "encodedQuery")
    @Nullable
    public final String z() {
        if (this.f225230g == null) {
            return null;
        }
        int iK3 = M.K3(this.f225232i, '?', 0, false, 6, null) + 1;
        String str = this.f225232i;
        String strSubstring = this.f225232i.substring(iK3, Bd.f.s(str, H3.b.f45548j, iK3, str.length()));
        G.o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }
}
