package mozilla.components.concept.fetch;

import android.net.Uri;
import androidx.compose.animation.C1635o;
import com.tencent.qcloud.core.http.f;
import ed.l;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.enums.c;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import kotlin.text.C5013e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zd.f;

/* JADX INFO: loaded from: classes5.dex */
public final class Request {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f221180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Method f221181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final f f221182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final Pair<Long, TimeUnit> f221183d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final Pair<Long, TimeUnit> f221184e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final a f221185f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Redirect f221186g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final CookiePolicy f221187h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f221188i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f221189j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public String f221190k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f221191l;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class CookiePolicy {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ CookiePolicy[] $VALUES;
        public static final CookiePolicy INCLUDE = new CookiePolicy("INCLUDE", 0);
        public static final CookiePolicy OMIT = new CookiePolicy("OMIT", 1);

        private static final /* synthetic */ CookiePolicy[] $values() {
            return new CookiePolicy[]{INCLUDE, OMIT};
        }

        static {
            CookiePolicy[] cookiePolicyArr$values = $values();
            $VALUES = cookiePolicyArr$values;
            $ENTRIES = c.c(cookiePolicyArr$values);
        }

        private CookiePolicy(String str, int i10) {
        }

        @NotNull
        public static kotlin.enums.a<CookiePolicy> getEntries() {
            return $ENTRIES;
        }

        public static CookiePolicy valueOf(String str) {
            return (CookiePolicy) Enum.valueOf(CookiePolicy.class, str);
        }

        public static CookiePolicy[] values() {
            return (CookiePolicy[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Method {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ Method[] $VALUES;
        public static final Method GET = new Method("GET", 0);
        public static final Method HEAD = new Method("HEAD", 1);
        public static final Method POST = new Method("POST", 2);
        public static final Method PUT = new Method("PUT", 3);
        public static final Method DELETE = new Method("DELETE", 4);
        public static final Method CONNECT = new Method("CONNECT", 5);
        public static final Method OPTIONS = new Method("OPTIONS", 6);
        public static final Method TRACE = new Method(f.c.f194278e, 7);

        private static final /* synthetic */ Method[] $values() {
            return new Method[]{GET, HEAD, POST, PUT, DELETE, CONNECT, OPTIONS, TRACE};
        }

        static {
            Method[] methodArr$values = $values();
            $VALUES = methodArr$values;
            $ENTRIES = c.c(methodArr$values);
        }

        private Method(String str, int i10) {
        }

        @NotNull
        public static kotlin.enums.a<Method> getEntries() {
            return $ENTRIES;
        }

        public static Method valueOf(String str) {
            return (Method) Enum.valueOf(Method.class, str);
        }

        public static Method[] values() {
            return (Method[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Redirect {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ Redirect[] $VALUES;
        public static final Redirect FOLLOW = new Redirect("FOLLOW", 0);
        public static final Redirect MANUAL = new Redirect("MANUAL", 1);

        private static final /* synthetic */ Redirect[] $values() {
            return new Redirect[]{FOLLOW, MANUAL};
        }

        static {
            Redirect[] redirectArr$values = $values();
            $VALUES = redirectArr$values;
            $ENTRIES = c.c(redirectArr$values);
        }

        private Redirect(String str, int i10) {
        }

        @NotNull
        public static kotlin.enums.a<Redirect> getEntries() {
            return $ENTRIES;
        }

        public static Redirect valueOf(String str) {
            return (Redirect) Enum.valueOf(Redirect.class, str);
        }

        public static Redirect[] values() {
            return (Redirect[]) $VALUES.clone();
        }
    }

    public static final class a implements Closeable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final C0839a f221192b = new C0839a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final InputStream f221193a;

        /* JADX INFO: renamed from: mozilla.components.concept.fetch.Request$a$a, reason: collision with other inner class name */
        @V({"SMAP\nRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Request.kt\nmozilla/components/concept/fetch/Request$Body$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,191:1\n13309#2,2:192\n*S KotlinDebug\n*F\n+ 1 Request.kt\nmozilla/components/concept/fetch/Request$Body$Companion\n*L\n111#1:192,2\n*E\n"})
        public static final class C0839a {
            public C0839a() {
            }

            @NotNull
            public final a a(@NotNull File file) {
                G.p(file, "file");
                return new a(new FileInputStream(file));
            }

            @NotNull
            public final a b(@NotNull Pair<String, String>... unencodedParams) {
                G.p(unencodedParams, "unencodedParams");
                Uri.Builder builder = new Uri.Builder();
                for (Pair<String, String> pair : unencodedParams) {
                    builder.appendQueryParameter(pair.f217467a, pair.f217468b);
                }
                String encodedQuery = builder.build().getEncodedQuery();
                if (encodedQuery == null) {
                    encodedQuery = "";
                }
                byte[] bytes = encodedQuery.getBytes(C5013e.f218326b);
                G.o(bytes, "getBytes(...)");
                return new a(new ByteArrayInputStream(bytes));
            }

            @NotNull
            public final a c(@NotNull String value) {
                G.p(value, "value");
                byte[] bytes = value.getBytes(C5013e.f218326b);
                G.o(bytes, "getBytes(...)");
                return new a(new ByteArrayInputStream(bytes));
            }

            public C0839a(C4969v c4969v) {
            }
        }

        public a(@NotNull InputStream stream) {
            G.p(stream, "stream");
            this.f221193a = stream;
        }

        public final <R> R a(@NotNull l<? super InputStream, ? extends R> block) throws IOException {
            G.p(block, "block");
            try {
                R rInvoke = block.invoke(this.f221193a);
                close();
                return rInvoke;
            } finally {
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            try {
                this.f221193a.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Request(@NotNull String url, @NotNull Method method, @Nullable zd.f fVar, @Nullable Pair<Long, ? extends TimeUnit> pair, @Nullable Pair<Long, ? extends TimeUnit> pair2, @Nullable a aVar, @NotNull Redirect redirect, @NotNull CookiePolicy cookiePolicy, boolean z10, boolean z11) {
        G.p(url, "url");
        G.p(method, "method");
        G.p(redirect, "redirect");
        G.p(cookiePolicy, "cookiePolicy");
        this.f221180a = url;
        this.f221181b = method;
        this.f221182c = fVar;
        this.f221183d = pair;
        this.f221184e = pair2;
        this.f221185f = aVar;
        this.f221186g = redirect;
        this.f221187h = cookiePolicy;
        this.f221188i = z10;
        this.f221189j = z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Request l(Request request, String str, Method method, zd.f fVar, Pair pair, Pair pair2, a aVar, Redirect redirect, CookiePolicy cookiePolicy, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = request.f221180a;
        }
        if ((i10 & 2) != 0) {
            method = request.f221181b;
        }
        if ((i10 & 4) != 0) {
            fVar = request.f221182c;
        }
        if ((i10 & 8) != 0) {
            pair = request.f221183d;
        }
        if ((i10 & 16) != 0) {
            pair2 = request.f221184e;
        }
        if ((i10 & 32) != 0) {
            aVar = request.f221185f;
        }
        if ((i10 & 64) != 0) {
            redirect = request.f221186g;
        }
        if ((i10 & 128) != 0) {
            cookiePolicy = request.f221187h;
        }
        if ((i10 & 256) != 0) {
            z10 = request.f221188i;
        }
        if ((i10 & 512) != 0) {
            z11 = request.f221189j;
        }
        boolean z12 = z10;
        boolean z13 = z11;
        Redirect redirect2 = redirect;
        CookiePolicy cookiePolicy2 = cookiePolicy;
        Pair pair3 = pair2;
        a aVar2 = aVar;
        return request.k(str, method, fVar, pair, pair3, aVar2, redirect2, cookiePolicy2, z12, z13);
    }

    @NotNull
    public final String a() {
        return this.f221180a;
    }

    public final boolean b() {
        return this.f221189j;
    }

    @NotNull
    public final Method c() {
        return this.f221181b;
    }

    @Nullable
    public final zd.f d() {
        return this.f221182c;
    }

    @Nullable
    public final Pair<Long, TimeUnit> e() {
        return this.f221183d;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Request)) {
            return false;
        }
        Request request = (Request) obj;
        return G.g(this.f221180a, request.f221180a) && this.f221181b == request.f221181b && G.g(this.f221182c, request.f221182c) && G.g(this.f221183d, request.f221183d) && G.g(this.f221184e, request.f221184e) && G.g(this.f221185f, request.f221185f) && this.f221186g == request.f221186g && this.f221187h == request.f221187h && this.f221188i == request.f221188i && this.f221189j == request.f221189j;
    }

    @Nullable
    public final Pair<Long, TimeUnit> f() {
        return this.f221184e;
    }

    @Nullable
    public final a g() {
        return this.f221185f;
    }

    @NotNull
    public final Redirect h() {
        return this.f221186g;
    }

    public int hashCode() {
        int iHashCode = (this.f221181b.hashCode() + (this.f221180a.hashCode() * 31)) * 31;
        zd.f fVar = this.f221182c;
        int iHashCode2 = (iHashCode + (fVar == null ? 0 : fVar.f241374a.hashCode())) * 31;
        Pair<Long, TimeUnit> pair = this.f221183d;
        int iHashCode3 = (iHashCode2 + (pair == null ? 0 : pair.hashCode())) * 31;
        Pair<Long, TimeUnit> pair2 = this.f221184e;
        int iHashCode4 = (iHashCode3 + (pair2 == null ? 0 : pair2.hashCode())) * 31;
        a aVar = this.f221185f;
        return C1635o.a(this.f221189j) + ((C1635o.a(this.f221188i) + ((this.f221187h.hashCode() + ((this.f221186g.hashCode() + ((iHashCode4 + (aVar != null ? aVar.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }

    @NotNull
    public final CookiePolicy i() {
        return this.f221187h;
    }

    public final boolean j() {
        return this.f221188i;
    }

    @NotNull
    public final Request k(@NotNull String url, @NotNull Method method, @Nullable zd.f fVar, @Nullable Pair<Long, ? extends TimeUnit> pair, @Nullable Pair<Long, ? extends TimeUnit> pair2, @Nullable a aVar, @NotNull Redirect redirect, @NotNull CookiePolicy cookiePolicy, boolean z10, boolean z11) {
        G.p(url, "url");
        G.p(method, "method");
        G.p(redirect, "redirect");
        G.p(cookiePolicy, "cookiePolicy");
        return new Request(url, method, fVar, pair, pair2, aVar, redirect, cookiePolicy, z10, z11);
    }

    @Nullable
    public final a m() {
        return this.f221185f;
    }

    @Nullable
    public final Pair<Long, TimeUnit> n() {
        return this.f221183d;
    }

    public final boolean o() {
        return this.f221191l;
    }

    @NotNull
    public final CookiePolicy p() {
        return this.f221187h;
    }

    @Nullable
    public final zd.f q() {
        return this.f221182c;
    }

    @NotNull
    public final Method r() {
        return this.f221181b;
    }

    public final boolean s() {
        return this.f221189j;
    }

    @Nullable
    public final Pair<Long, TimeUnit> t() {
        return this.f221184e;
    }

    @NotNull
    public String toString() {
        return "Request(url=" + this.f221180a + ", method=" + this.f221181b + ", headers=" + this.f221182c + ", connectTimeout=" + this.f221183d + ", readTimeout=" + this.f221184e + ", body=" + this.f221185f + ", redirect=" + this.f221186g + ", cookiePolicy=" + this.f221187h + ", useCaches=" + this.f221188i + ", private=" + this.f221189j + ")";
    }

    @NotNull
    public final Redirect u() {
        return this.f221186g;
    }

    @Nullable
    public final String v() {
        return this.f221190k;
    }

    @NotNull
    public final String w() {
        return this.f221180a;
    }

    public final boolean x() {
        return this.f221188i;
    }

    public final void y(boolean z10) {
        this.f221191l = z10;
    }

    public final void z(@Nullable String str) {
        this.f221190k = str;
    }

    public /* synthetic */ Request(String str, Method method, zd.f fVar, Pair pair, Pair pair2, a aVar, Redirect redirect, CookiePolicy cookiePolicy, boolean z10, boolean z11, int i10, C4969v c4969v) {
        this(str, (i10 & 2) != 0 ? Method.GET : method, (i10 & 4) != 0 ? new zd.f((Pair<String, String>[]) new Pair[0]) : fVar, (i10 & 8) != 0 ? null : pair, (i10 & 16) != 0 ? null : pair2, (i10 & 32) == 0 ? aVar : null, (i10 & 64) != 0 ? Redirect.FOLLOW : redirect, (i10 & 128) != 0 ? CookiePolicy.INCLUDE : cookiePolicy, (i10 & 256) != 0 ? true : z10, (i10 & 512) != 0 ? false : z11);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ Request(java.lang.String r14, mozilla.components.concept.fetch.Request.Method r15, zd.f r16, kotlin.Pair r17, kotlin.Pair r18, mozilla.components.concept.fetch.Request.a r19, mozilla.components.concept.fetch.Request.Redirect r20, mozilla.components.concept.fetch.Request.CookiePolicy r21, boolean r22, boolean r23, java.lang.String r24, boolean r25, int r26, kotlin.jvm.internal.C4969v r27) {
        /*
            r13 = this;
            r0 = r26
            r1 = r0 & 2
            if (r1 == 0) goto L8
            mozilla.components.concept.fetch.Request$Method r15 = mozilla.components.concept.fetch.Request.Method.GET
        L8:
            r2 = r15
            r15 = r0 & 4
            r1 = 0
            if (r15 == 0) goto L17
            zd.f r15 = new zd.f
            kotlin.Pair[] r3 = new kotlin.Pair[r1]
            r15.<init>(r3)
            r3 = r15
            goto L19
        L17:
            r3 = r16
        L19:
            r15 = r0 & 8
            r4 = 0
            if (r15 == 0) goto L20
            r15 = r4
            goto L22
        L20:
            r15 = r17
        L22:
            r5 = r0 & 16
            if (r5 == 0) goto L28
            r5 = r4
            goto L2a
        L28:
            r5 = r18
        L2a:
            r6 = r0 & 32
            if (r6 == 0) goto L30
            r6 = r4
            goto L32
        L30:
            r6 = r19
        L32:
            r7 = r0 & 64
            if (r7 == 0) goto L39
            mozilla.components.concept.fetch.Request$Redirect r7 = mozilla.components.concept.fetch.Request.Redirect.FOLLOW
            goto L3b
        L39:
            r7 = r20
        L3b:
            r8 = r0 & 128(0x80, float:1.8E-43)
            if (r8 == 0) goto L42
            mozilla.components.concept.fetch.Request$CookiePolicy r8 = mozilla.components.concept.fetch.Request.CookiePolicy.INCLUDE
            goto L44
        L42:
            r8 = r21
        L44:
            r9 = r0 & 256(0x100, float:3.59E-43)
            if (r9 == 0) goto L4a
            r9 = 1
            goto L4c
        L4a:
            r9 = r22
        L4c:
            r10 = r0 & 512(0x200, float:7.17E-43)
            if (r10 == 0) goto L52
            r10 = r1
            goto L54
        L52:
            r10 = r23
        L54:
            r11 = r0 & 1024(0x400, float:1.435E-42)
            if (r11 == 0) goto L5a
            r11 = r4
            goto L5c
        L5a:
            r11 = r24
        L5c:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L65
            r12 = r1
            r0 = r13
            r4 = r15
            r1 = r14
            goto L6a
        L65:
            r12 = r25
            r0 = r13
            r1 = r14
            r4 = r15
        L6a:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mozilla.components.concept.fetch.Request.<init>(java.lang.String, mozilla.components.concept.fetch.Request$Method, zd.f, kotlin.Pair, kotlin.Pair, mozilla.components.concept.fetch.Request$a, mozilla.components.concept.fetch.Request$Redirect, mozilla.components.concept.fetch.Request$CookiePolicy, boolean, boolean, java.lang.String, boolean, int, kotlin.jvm.internal.v):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Request(@NotNull String url, @NotNull Method method, @Nullable zd.f fVar, @Nullable Pair<Long, ? extends TimeUnit> pair, @Nullable Pair<Long, ? extends TimeUnit> pair2, @Nullable a aVar, @NotNull Redirect redirect, @NotNull CookiePolicy cookiePolicy, boolean z10, boolean z11, @Nullable String str, boolean z12) {
        this(url, method, fVar, pair, pair2, aVar, redirect, cookiePolicy, z10, z11);
        G.p(url, "url");
        G.p(method, "method");
        G.p(redirect, "redirect");
        G.p(cookiePolicy, "cookiePolicy");
        this.f221190k = str;
        this.f221191l = z12;
    }
}
