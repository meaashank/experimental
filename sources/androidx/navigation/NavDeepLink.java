package androidx.navigation;

import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.navigation.NavDeepLink;
import com.google.firebase.sessions.settings.RemoteSettings;
import ed.InterfaceC4376a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.L0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C4969v;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@kotlin.jvm.internal.V({"SMAP\nNavDeepLink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDeepLink.kt\nandroidx/navigation/NavDeepLink\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,651:1\n1360#2:652\n1446#2,5:653\n1559#2:658\n1590#2,4:659\n1559#2:663\n1590#2,4:664\n1855#2:670\n1559#2:671\n1590#2,4:672\n1856#2:676\n215#3,2:668\n1#4:677\n*S KotlinDebug\n*F\n+ 1 NavDeepLink.kt\nandroidx/navigation/NavDeepLink\n*L\n85#1:652\n85#1:653,5\n229#1:658\n229#1:659,4\n247#1:663\n247#1:664,4\n295#1:670\n307#1:671\n307#1:672,4\n295#1:676\n269#1:668,2\n*E\n"})
public final class NavDeepLink {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public static final a f115050q = new a();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Pattern f115051r = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Pattern f115052s = Pattern.compile("\\{(.+?)\\}");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f115053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f115054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f115055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final List<String> f115056d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public String f115057e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final kotlin.G f115058f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final kotlin.G f115059g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final kotlin.G f115060h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f115061i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final kotlin.G f115062j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final kotlin.G f115063k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final kotlin.G f115064l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final kotlin.G f115065m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public String f115066n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final kotlin.G f115067o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f115068p;

    @kotlin.jvm.internal.V({"SMAP\nNavDeepLink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDeepLink.kt\nandroidx/navigation/NavDeepLink$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,651:1\n1#2:652\n*E\n"})
    public static final class Builder {

        @NotNull
        public static final a Companion = new a();

        @Nullable
        private String action;

        @Nullable
        private String mimeType;

        @Nullable
        private String uriPattern;

        @kotlin.jvm.internal.V({"SMAP\nNavDeepLink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDeepLink.kt\nandroidx/navigation/NavDeepLink$Builder$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,651:1\n1#2:652\n*E\n"})
        public static final class a {
            public a() {
            }

            @dd.o
            @NotNull
            public final Builder a(@NotNull String action) {
                kotlin.jvm.internal.G.p(action, "action");
                if (action.length() <= 0) {
                    throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.");
                }
                Builder builder = new Builder();
                builder.setAction(action);
                return builder;
            }

            @dd.o
            @NotNull
            public final Builder b(@NotNull String mimeType) {
                kotlin.jvm.internal.G.p(mimeType, "mimeType");
                Builder builder = new Builder();
                builder.setMimeType(mimeType);
                return builder;
            }

            @dd.o
            @NotNull
            public final Builder c(@NotNull String uriPattern) {
                kotlin.jvm.internal.G.p(uriPattern, "uriPattern");
                Builder builder = new Builder();
                builder.setUriPattern(uriPattern);
                return builder;
            }

            public a(C4969v c4969v) {
            }
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder() {
        }

        @dd.o
        @NotNull
        public static final Builder fromAction(@NotNull String str) {
            return Companion.a(str);
        }

        @dd.o
        @NotNull
        public static final Builder fromMimeType(@NotNull String str) {
            return Companion.b(str);
        }

        @dd.o
        @NotNull
        public static final Builder fromUriPattern(@NotNull String str) {
            return Companion.c(str);
        }

        @NotNull
        public final NavDeepLink build() {
            return new NavDeepLink(this.uriPattern, this.action, this.mimeType);
        }

        @NotNull
        public final Builder setAction(@NotNull String action) {
            kotlin.jvm.internal.G.p(action, "action");
            if (action.length() <= 0) {
                throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.");
            }
            this.action = action;
            return this;
        }

        @NotNull
        public final Builder setMimeType(@NotNull String mimeType) {
            kotlin.jvm.internal.G.p(mimeType, "mimeType");
            this.mimeType = mimeType;
            return this;
        }

        @NotNull
        public final Builder setUriPattern(@NotNull String uriPattern) {
            kotlin.jvm.internal.G.p(uriPattern, "uriPattern");
            this.uriPattern = uriPattern;
            return this;
        }
    }

    public static final class a {
        public a() {
        }

        public a(C4969v c4969v) {
        }
    }

    @kotlin.jvm.internal.V({"SMAP\nNavDeepLink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDeepLink.kt\nandroidx/navigation/NavDeepLink$MimeType\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,651:1\n731#2,9:652\n*S KotlinDebug\n*F\n+ 1 NavDeepLink.kt\nandroidx/navigation/NavDeepLink$MimeType\n*L\n412#1:652,9\n*E\n"})
    public static final class b implements Comparable<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public String f115069a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public String f115070b;

        public b(@NotNull String mimeType) {
            List listO5;
            kotlin.jvm.internal.G.p(mimeType, "mimeType");
            List<String> listR = new Regex(RemoteSettings.FORWARD_SLASH_STRING).r(mimeType, 0);
            if (listR.isEmpty()) {
                listO5 = EmptyList.f217510a;
            } else {
                ListIterator<String> listIterator = listR.listIterator(listR.size());
                while (listIterator.hasPrevious()) {
                    if (listIterator.previous().length() != 0) {
                        listO5 = kotlin.collections.U.O5(listR, listIterator.nextIndex() + 1);
                        break;
                    }
                }
                listO5 = EmptyList.f217510a;
            }
            this.f115069a = (String) listO5.get(0);
            this.f115070b = (String) listO5.get(1);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(@NotNull b other) {
            kotlin.jvm.internal.G.p(other, "other");
            int i10 = kotlin.jvm.internal.G.g(this.f115069a, other.f115069a) ? 2 : 0;
            return kotlin.jvm.internal.G.g(this.f115070b, other.f115070b) ? i10 + 1 : i10;
        }

        @NotNull
        public final String b() {
            return this.f115070b;
        }

        @NotNull
        public final String c() {
            return this.f115069a;
        }

        public final void d(@NotNull String str) {
            kotlin.jvm.internal.G.p(str, "<set-?>");
            this.f115070b = str;
        }

        public final void e(@NotNull String str) {
            kotlin.jvm.internal.G.p(str, "<set-?>");
            this.f115069a = str;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public String f115071a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final List<String> f115072b = new ArrayList();

        public final void a(@NotNull String name) {
            kotlin.jvm.internal.G.p(name, "name");
            this.f115072b.add(name);
        }

        @NotNull
        public final String b(int i10) {
            return this.f115072b.get(i10);
        }

        @NotNull
        public final List<String> c() {
            return this.f115072b;
        }

        @Nullable
        public final String d() {
            return this.f115071a;
        }

        public final void e(@Nullable String str) {
            this.f115071a = str;
        }

        public final int f() {
            return this.f115072b.size();
        }
    }

    public NavDeepLink(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.f115053a = str;
        this.f115054b = str2;
        this.f115055c = str3;
        this.f115056d = new ArrayList();
        this.f115058f = kotlin.I.a(new InterfaceC4376a<Pattern>() { // from class: androidx.navigation.NavDeepLink$pathPattern$2
            {
                super(0);
            }

            @Override // ed.InterfaceC4376a
            @Nullable
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Pattern invoke() {
                String str4 = this.f115080d.f115057e;
                if (str4 != null) {
                    return Pattern.compile(str4, 2);
                }
                return null;
            }
        });
        this.f115059g = kotlin.I.a(new InterfaceC4376a<Boolean>() { // from class: androidx.navigation.NavDeepLink$isParameterizedQuery$2
            {
                super(0);
            }

            @Override // ed.InterfaceC4376a
            @NotNull
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                String str4 = this.f115078d.f115053a;
                return Boolean.valueOf((str4 == null || Uri.parse(str4).getQuery() == null) ? false : true);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f115060h = kotlin.I.c(lazyThreadSafetyMode, new InterfaceC4376a<Map<String, c>>() { // from class: androidx.navigation.NavDeepLink$queryArgsMap$2
            {
                super(0);
            }

            @NotNull
            public final Map<String, NavDeepLink.c> g() {
                return this.f115081d.M();
            }

            @Override // ed.InterfaceC4376a
            public Map<String, NavDeepLink.c> invoke() {
                return this.f115081d.M();
            }
        });
        this.f115062j = kotlin.I.c(lazyThreadSafetyMode, new InterfaceC4376a<Pair<? extends List<String>, ? extends String>>() { // from class: androidx.navigation.NavDeepLink$fragArgsAndRegex$2
            {
                super(0);
            }

            @Nullable
            public final Pair<List<String>, String> g() {
                return this.f115074d.I();
            }

            @Override // ed.InterfaceC4376a
            public Pair<? extends List<String>, ? extends String> invoke() {
                return this.f115074d.I();
            }
        });
        this.f115063k = kotlin.I.c(lazyThreadSafetyMode, new InterfaceC4376a<List<String>>() { // from class: androidx.navigation.NavDeepLink$fragArgs$2
            {
                super(0);
            }

            @Override // ed.InterfaceC4376a
            @NotNull
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final List<String> invoke() {
                List<String> list;
                Pair pairL = this.f115073d.l();
                return (pairL == null || (list = (List) pairL.f217467a) == null) ? new ArrayList() : list;
            }
        });
        this.f115064l = kotlin.I.c(lazyThreadSafetyMode, new InterfaceC4376a<String>() { // from class: androidx.navigation.NavDeepLink$fragRegex$2
            {
                super(0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // ed.InterfaceC4376a
            @Nullable
            public final String invoke() {
                Pair pairL = this.f115076d.l();
                if (pairL != null) {
                    return (String) pairL.f217468b;
                }
                return null;
            }
        });
        this.f115065m = kotlin.I.a(new InterfaceC4376a<Pattern>() { // from class: androidx.navigation.NavDeepLink$fragPattern$2
            {
                super(0);
            }

            @Override // ed.InterfaceC4376a
            @Nullable
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Pattern invoke() {
                String strN = this.f115075d.n();
                if (strN != null) {
                    return Pattern.compile(strN, 2);
                }
                return null;
            }
        });
        this.f115067o = kotlin.I.a(new InterfaceC4376a<Pattern>() { // from class: androidx.navigation.NavDeepLink$mimeTypePattern$2
            {
                super(0);
            }

            @Override // ed.InterfaceC4376a
            @Nullable
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Pattern invoke() {
                String str4 = this.f115079d.f115066n;
                if (str4 != null) {
                    return Pattern.compile(str4);
                }
                return null;
            }
        });
        L();
        K();
    }

    public final boolean A() {
        return ((Boolean) this.f115059g.getValue()).booleanValue();
    }

    public final boolean B(String str) {
        boolean z10 = str == null;
        String str2 = this.f115054b;
        if (z10 == (str2 != null)) {
            return false;
        }
        return str == null || kotlin.jvm.internal.G.g(str2, str);
    }

    public final boolean C(String str) {
        if ((str == null) == (this.f115055c != null)) {
            return false;
        }
        if (str != null) {
            Pattern patternV = v();
            kotlin.jvm.internal.G.m(patternV);
            if (!patternV.matcher(str).matches()) {
                return false;
            }
        }
        return true;
    }

    public final boolean D(Uri uri) {
        if ((uri == null) == (w() != null)) {
            return false;
        }
        if (uri != null) {
            Pattern patternW = w();
            kotlin.jvm.internal.G.m(patternW);
            if (!patternW.matcher(uri.toString()).matches()) {
                return false;
            }
        }
        return true;
    }

    public final boolean E(@NotNull Uri uri) {
        kotlin.jvm.internal.G.p(uri, "uri");
        return F(new NavDeepLinkRequest(uri, null, null));
    }

    public final boolean F(@NotNull NavDeepLinkRequest deepLinkRequest) {
        kotlin.jvm.internal.G.p(deepLinkRequest, "deepLinkRequest");
        if (D(deepLinkRequest.c()) && B(deepLinkRequest.a())) {
            return C(deepLinkRequest.b());
        }
        return false;
    }

    public final boolean G(Bundle bundle, String str, String str2, NavArgument navArgument) {
        if (navArgument != null) {
            navArgument.f114943a.g(bundle, str, str2);
            return false;
        }
        bundle.putString(str, str2);
        return false;
    }

    public final boolean H(Bundle bundle, String str, String str2, NavArgument navArgument) {
        if (!bundle.containsKey(str)) {
            return true;
        }
        if (navArgument == null) {
            return false;
        }
        L<Object> l10 = navArgument.f114943a;
        l10.h(bundle, str, str2, l10.b(bundle, str));
        return false;
    }

    public final Pair<List<String>, String> I() {
        String str = this.f115053a;
        if (str == null || Uri.parse(str).getFragment() == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        String fragment = Uri.parse(this.f115053a).getFragment();
        StringBuilder sb2 = new StringBuilder();
        kotlin.jvm.internal.G.m(fragment);
        g(fragment, arrayList, sb2);
        String string = sb2.toString();
        kotlin.jvm.internal.G.o(string, "fragRegex.toString()");
        return new Pair<>(arrayList, string);
    }

    public final boolean J(List<String> list, c cVar, Bundle bundle, Map<String, NavArgument> map) {
        ArrayList arrayList;
        if (list == null) {
            return true;
        }
        for (String str : list) {
            String str2 = cVar.f115071a;
            Matcher matcher = str2 != null ? Pattern.compile(str2, 32).matcher(str) : null;
            int i10 = 0;
            if (matcher == null || !matcher.matches()) {
                return false;
            }
            Bundle bundle2 = new Bundle();
            try {
                List<String> list2 = cVar.f115072b;
                arrayList = new ArrayList(kotlin.collections.J.d0(list2, 10));
            } catch (IllegalArgumentException unused) {
            }
            for (Object obj : list2) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    kotlin.collections.I.b0();
                    throw null;
                }
                String str3 = (String) obj;
                String strGroup = matcher.group(i11);
                if (strGroup == null) {
                    strGroup = "";
                }
                NavArgument navArgument = map.get(str3);
                if (H(bundle, str3, strGroup, navArgument)) {
                    if (!strGroup.equals('{' + str3 + '}')) {
                        G(bundle2, str3, strGroup, navArgument);
                    }
                }
                arrayList.add(L0.f217464a);
                i10 = i11;
            }
            bundle.putAll(bundle2);
        }
        return true;
    }

    public final void K() {
        if (this.f115055c == null) {
            return;
        }
        if (!Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(this.f115055c).matches()) {
            throw new IllegalArgumentException(android.support.v4.media.e.a(new StringBuilder("The given mimeType "), this.f115055c, " does not match to required \"type/subtype\" format").toString());
        }
        b bVar = new b(this.f115055c);
        StringBuilder sb2 = new StringBuilder("^(");
        sb2.append(bVar.f115069a);
        sb2.append("|[*]+)/(");
        this.f115066n = kotlin.text.F.B2(android.support.v4.media.e.a(sb2, bVar.f115070b, "|[*]+)$"), "*|[*]", "[\\s\\S]", false, 4, null);
    }

    public final void L() {
        if (this.f115053a == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("^");
        if (!f115051r.matcher(this.f115053a).find()) {
            sb2.append("http[s]?://");
        }
        Matcher matcher = Pattern.compile("(\\?|\\#|$)").matcher(this.f115053a);
        matcher.find();
        boolean z10 = false;
        String strSubstring = this.f115053a.substring(0, matcher.start());
        kotlin.jvm.internal.G.o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        g(strSubstring, this.f115056d, sb2);
        if (!kotlin.text.M.p3(sb2, ".*", false, 2, null) && !kotlin.text.M.p3(sb2, "([^/]+?)", false, 2, null)) {
            z10 = true;
        }
        this.f115068p = z10;
        sb2.append("($|(\\?(.)*)|(\\#(.)*))");
        String string = sb2.toString();
        kotlin.jvm.internal.G.o(string, "uriRegex.toString()");
        this.f115057e = kotlin.text.F.B2(string, ".*", "\\E.*\\Q", false, 4, null);
    }

    public final Map<String, c> M() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (A()) {
            Uri uri = Uri.parse(this.f115053a);
            for (String paramName : uri.getQueryParameterNames()) {
                StringBuilder sb2 = new StringBuilder();
                List<String> queryParameters = uri.getQueryParameters(paramName);
                if (queryParameters.size() > 1) {
                    throw new IllegalArgumentException(android.support.v4.media.e.a(androidx.activity.result.i.a("Query parameter ", paramName, " must only be present once in "), this.f115053a, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                }
                String queryParam = (String) kotlin.collections.U.L2(queryParameters);
                if (queryParam == null) {
                    this.f115061i = true;
                    queryParam = paramName;
                }
                Matcher matcher = f115052s.matcher(queryParam);
                c cVar = new c();
                int iEnd = 0;
                while (matcher.find()) {
                    String strGroup = matcher.group(1);
                    kotlin.jvm.internal.G.n(strGroup, "null cannot be cast to non-null type kotlin.String");
                    cVar.a(strGroup);
                    kotlin.jvm.internal.G.o(queryParam, "queryParam");
                    String strSubstring = queryParam.substring(iEnd, matcher.start());
                    kotlin.jvm.internal.G.o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    sb2.append(Pattern.quote(strSubstring));
                    sb2.append("(.+?)?");
                    iEnd = matcher.end();
                }
                if (iEnd < queryParam.length()) {
                    String strSubstring2 = queryParam.substring(iEnd);
                    kotlin.jvm.internal.G.o(strSubstring2, "this as java.lang.String).substring(startIndex)");
                    sb2.append(Pattern.quote(strSubstring2));
                }
                String string = sb2.toString();
                kotlin.jvm.internal.G.o(string, "argRegex.toString()");
                cVar.f115071a = kotlin.text.F.B2(string, ".*", "\\E.*\\Q", false, 4, null);
                kotlin.jvm.internal.G.o(paramName, "paramName");
                linkedHashMap.put(paramName, cVar);
            }
        }
        return linkedHashMap;
    }

    public final void N(boolean z10) {
        this.f115068p = z10;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj != null && (obj instanceof NavDeepLink)) {
            NavDeepLink navDeepLink = (NavDeepLink) obj;
            if (kotlin.jvm.internal.G.g(this.f115053a, navDeepLink.f115053a) && kotlin.jvm.internal.G.g(this.f115054b, navDeepLink.f115054b) && kotlin.jvm.internal.G.g(this.f115055c, navDeepLink.f115055c)) {
                return true;
            }
        }
        return false;
    }

    public final void g(String str, List<String> list, StringBuilder sb2) {
        Matcher matcher = f115052s.matcher(str);
        int iEnd = 0;
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            kotlin.jvm.internal.G.n(strGroup, "null cannot be cast to non-null type kotlin.String");
            list.add(strGroup);
            if (matcher.start() > iEnd) {
                String strSubstring = str.substring(iEnd, matcher.start());
                kotlin.jvm.internal.G.o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb2.append(Pattern.quote(strSubstring));
            }
            sb2.append("([^/]+?)");
            iEnd = matcher.end();
        }
        if (iEnd < str.length()) {
            String strSubstring2 = str.substring(iEnd);
            kotlin.jvm.internal.G.o(strSubstring2, "this as java.lang.String).substring(startIndex)");
            sb2.append(Pattern.quote(strSubstring2));
        }
    }

    public final int h(@Nullable Uri uri) {
        if (uri == null || this.f115053a == null) {
            return 0;
        }
        List<String> requestedPathSegments = uri.getPathSegments();
        List<String> uriPathSegments = Uri.parse(this.f115053a).getPathSegments();
        kotlin.jvm.internal.G.o(requestedPathSegments, "requestedPathSegments");
        kotlin.jvm.internal.G.o(uriPathSegments, "uriPathSegments");
        return kotlin.collections.U.n3(requestedPathSegments, uriPathSegments).size();
    }

    public int hashCode() {
        String str = this.f115053a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f115054b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f115055c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Nullable
    public final String i() {
        return this.f115054b;
    }

    @NotNull
    public final List<String> j() {
        List<String> list = this.f115056d;
        Collection<c> collectionValues = x().values();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            kotlin.collections.N.s0(arrayList, ((c) it.next()).f115072b);
        }
        return kotlin.collections.U.I4(kotlin.collections.U.I4(list, arrayList), k());
    }

    public final List<String> k() {
        return (List) this.f115063k.getValue();
    }

    public final Pair<List<String>, String> l() {
        return (Pair) this.f115062j.getValue();
    }

    public final Pattern m() {
        return (Pattern) this.f115065m.getValue();
    }

    public final String n() {
        return (String) this.f115064l.getValue();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Nullable
    public final Bundle o(@NotNull Uri deepLink, @NotNull Map<String, NavArgument> arguments) {
        kotlin.jvm.internal.G.p(deepLink, "deepLink");
        kotlin.jvm.internal.G.p(arguments, "arguments");
        Pattern patternW = w();
        Matcher matcher = patternW != null ? patternW.matcher(deepLink.toString()) : null;
        if (matcher == null || !matcher.matches()) {
            return null;
        }
        final Bundle bundle = new Bundle();
        if (!q(matcher, bundle, arguments)) {
            return null;
        }
        if (A() && !r(deepLink, bundle, arguments)) {
            return null;
        }
        s(deepLink.getFragment(), bundle, arguments);
        if (C2628p.a(arguments, new ed.l<String, Boolean>() { // from class: androidx.navigation.NavDeepLink$getMatchingArguments$missingRequiredArguments$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // ed.l
            @NotNull
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@NotNull String argName) {
                kotlin.jvm.internal.G.p(argName, "argName");
                return Boolean.valueOf(!bundle.containsKey(argName));
            }
        }).isEmpty()) {
            return bundle;
        }
        return null;
    }

    @NotNull
    public final Bundle p(@Nullable Uri uri, @NotNull Map<String, NavArgument> arguments) {
        kotlin.jvm.internal.G.p(arguments, "arguments");
        Bundle bundle = new Bundle();
        if (uri != null) {
            Pattern patternW = w();
            Matcher matcher = patternW != null ? patternW.matcher(uri.toString()) : null;
            if (matcher != null && matcher.matches()) {
                q(matcher, bundle, arguments);
                if (A()) {
                    r(uri, bundle, arguments);
                }
            }
        }
        return bundle;
    }

    public final boolean q(Matcher matcher, Bundle bundle, Map<String, NavArgument> map) {
        List<String> list = this.f115056d;
        ArrayList arrayList = new ArrayList(kotlin.collections.J.d0(list, 10));
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                kotlin.collections.I.b0();
                throw null;
            }
            String str = (String) obj;
            String value = Uri.decode(matcher.group(i11));
            NavArgument navArgument = map.get(str);
            try {
                kotlin.jvm.internal.G.o(value, "value");
                G(bundle, str, value, navArgument);
                arrayList.add(L0.f217464a);
                i10 = i11;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    public final boolean r(Uri uri, Bundle bundle, Map<String, NavArgument> map) {
        String query;
        for (Map.Entry<String, c> entry : x().entrySet()) {
            String key = entry.getKey();
            c value = entry.getValue();
            List<String> queryParameters = uri.getQueryParameters(key);
            if (this.f115061i && (query = uri.getQuery()) != null && !query.equals(uri.toString())) {
                queryParameters = kotlin.collections.H.l(query);
            }
            if (!J(queryParameters, value, bundle, map)) {
                return false;
            }
        }
        return true;
    }

    public final void s(String str, Bundle bundle, Map<String, NavArgument> map) {
        Pattern patternM = m();
        Matcher matcher = patternM != null ? patternM.matcher(String.valueOf(str)) : null;
        if (matcher != null && matcher.matches()) {
            List<String> listK = k();
            ArrayList arrayList = new ArrayList(kotlin.collections.J.d0(listK, 10));
            int i10 = 0;
            for (Object obj : listK) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    kotlin.collections.I.b0();
                    throw null;
                }
                String str2 = (String) obj;
                String value = Uri.decode(matcher.group(i11));
                NavArgument navArgument = map.get(str2);
                try {
                    kotlin.jvm.internal.G.o(value, "value");
                    G(bundle, str2, value, navArgument);
                    arrayList.add(L0.f217464a);
                    i10 = i11;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            }
        }
    }

    @Nullable
    public final String t() {
        return this.f115055c;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final int u(@NotNull String mimeType) {
        kotlin.jvm.internal.G.p(mimeType, "mimeType");
        if (this.f115055c == null) {
            return -1;
        }
        Pattern patternV = v();
        kotlin.jvm.internal.G.m(patternV);
        if (patternV.matcher(mimeType).matches()) {
            return new b(this.f115055c).compareTo(new b(mimeType));
        }
        return -1;
    }

    public final Pattern v() {
        return (Pattern) this.f115067o.getValue();
    }

    public final Pattern w() {
        return (Pattern) this.f115058f.getValue();
    }

    public final Map<String, c> x() {
        return (Map) this.f115060h.getValue();
    }

    @Nullable
    public final String y() {
        return this.f115053a;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean z() {
        return this.f115068p;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public NavDeepLink(@NotNull String uri) {
        this(uri, null, null);
        kotlin.jvm.internal.G.p(uri, "uri");
    }
}
