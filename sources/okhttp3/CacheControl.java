package okhttp3;

import androidx.collection.LruCacheKt;
import java.util.concurrent.TimeUnit;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4982o;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.text.M;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class CacheControl {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final a f225146n = new a();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dd.g
    @NotNull
    public static final CacheControl f225147o = new Builder().noCache().build();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dd.g
    @NotNull
    public static final CacheControl f225148p = new Builder().onlyIfCached().maxStale(Integer.MAX_VALUE, TimeUnit.SECONDS).build();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f225149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f225150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f225151c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f225152d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f225153e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f225154f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f225155g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f225156h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f225157i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f225158j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f225159k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f225160l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public String f225161m;

    public static final class Builder {
        private boolean immutable;
        private int maxAgeSeconds = -1;
        private int maxStaleSeconds = -1;
        private int minFreshSeconds = -1;
        private boolean noCache;
        private boolean noStore;
        private boolean noTransform;
        private boolean onlyIfCached;

        private final int clampToInt(long j10) {
            if (j10 > LruCacheKt.f86729a) {
                return Integer.MAX_VALUE;
            }
            return (int) j10;
        }

        @NotNull
        public final CacheControl build() {
            return new CacheControl(this.noCache, this.noStore, this.maxAgeSeconds, -1, false, false, false, this.maxStaleSeconds, this.minFreshSeconds, this.onlyIfCached, this.noTransform, this.immutable, null);
        }

        @NotNull
        public final Builder immutable() {
            this.immutable = true;
            return this;
        }

        @NotNull
        public final Builder maxAge(int i10, @NotNull TimeUnit timeUnit) {
            G.p(timeUnit, "timeUnit");
            if (i10 < 0) {
                throw new IllegalArgumentException(G.C("maxAge < 0: ", Integer.valueOf(i10)).toString());
            }
            this.maxAgeSeconds = clampToInt(timeUnit.toSeconds(i10));
            return this;
        }

        @NotNull
        public final Builder maxStale(int i10, @NotNull TimeUnit timeUnit) {
            G.p(timeUnit, "timeUnit");
            if (i10 < 0) {
                throw new IllegalArgumentException(G.C("maxStale < 0: ", Integer.valueOf(i10)).toString());
            }
            this.maxStaleSeconds = clampToInt(timeUnit.toSeconds(i10));
            return this;
        }

        @NotNull
        public final Builder minFresh(int i10, @NotNull TimeUnit timeUnit) {
            G.p(timeUnit, "timeUnit");
            if (i10 < 0) {
                throw new IllegalArgumentException(G.C("minFresh < 0: ", Integer.valueOf(i10)).toString());
            }
            this.minFreshSeconds = clampToInt(timeUnit.toSeconds(i10));
            return this;
        }

        @NotNull
        public final Builder noCache() {
            this.noCache = true;
            return this;
        }

        @NotNull
        public final Builder noStore() {
            this.noStore = true;
            return this;
        }

        @NotNull
        public final Builder noTransform() {
            this.noTransform = true;
            return this;
        }

        @NotNull
        public final Builder onlyIfCached() {
            this.onlyIfCached = true;
            return this;
        }
    }

    public static final class a {
        public a() {
        }

        public static /* synthetic */ int b(a aVar, String str, String str2, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                i10 = 0;
            }
            return aVar.a(str, str2, i10);
        }

        public final int a(String str, String str2, int i10) {
            int length = str.length();
            while (i10 < length) {
                int i11 = i10 + 1;
                if (M.o3(str2, str.charAt(i10), false, 2, null)) {
                    return i10;
                }
                i10 = i11;
            }
            return str.length();
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
        @dd.o
        @org.jetbrains.annotations.NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final okhttp3.CacheControl c(@org.jetbrains.annotations.NotNull okhttp3.Headers r32) {
            /*
                Method dump skipped, instruction units count: 434
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.CacheControl.a.c(okhttp3.Headers):okhttp3.CacheControl");
        }

        public a(C4969v c4969v) {
        }
    }

    public /* synthetic */ CacheControl(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, String str, C4969v c4969v) {
        this(z10, z11, i10, i11, z12, z13, z14, i12, i13, z15, z16, z17, str);
    }

    @dd.o
    @NotNull
    public static final CacheControl v(@NotNull Headers headers) {
        return f225146n.c(headers);
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @InterfaceC4852c0(expression = "immutable", imports = {}))
    @dd.j(name = "-deprecated_immutable")
    public final boolean a() {
        return this.f225160l;
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @InterfaceC4852c0(expression = "maxAgeSeconds", imports = {}))
    @dd.j(name = "-deprecated_maxAgeSeconds")
    public final int b() {
        return this.f225151c;
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @InterfaceC4852c0(expression = "maxStaleSeconds", imports = {}))
    @dd.j(name = "-deprecated_maxStaleSeconds")
    public final int c() {
        return this.f225156h;
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @InterfaceC4852c0(expression = "minFreshSeconds", imports = {}))
    @dd.j(name = "-deprecated_minFreshSeconds")
    public final int d() {
        return this.f225157i;
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @InterfaceC4852c0(expression = "mustRevalidate", imports = {}))
    @dd.j(name = "-deprecated_mustRevalidate")
    public final boolean e() {
        return this.f225155g;
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @InterfaceC4852c0(expression = "noCache", imports = {}))
    @dd.j(name = "-deprecated_noCache")
    public final boolean f() {
        return this.f225149a;
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @InterfaceC4852c0(expression = "noStore", imports = {}))
    @dd.j(name = "-deprecated_noStore")
    public final boolean g() {
        return this.f225150b;
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @InterfaceC4852c0(expression = "noTransform", imports = {}))
    @dd.j(name = "-deprecated_noTransform")
    public final boolean h() {
        return this.f225159k;
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @InterfaceC4852c0(expression = "onlyIfCached", imports = {}))
    @dd.j(name = "-deprecated_onlyIfCached")
    public final boolean i() {
        return this.f225158j;
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @InterfaceC4852c0(expression = "sMaxAgeSeconds", imports = {}))
    @dd.j(name = "-deprecated_sMaxAgeSeconds")
    public final int j() {
        return this.f225152d;
    }

    @dd.j(name = "immutable")
    public final boolean k() {
        return this.f225160l;
    }

    public final boolean l() {
        return this.f225153e;
    }

    public final boolean m() {
        return this.f225154f;
    }

    @dd.j(name = "maxAgeSeconds")
    public final int n() {
        return this.f225151c;
    }

    @dd.j(name = "maxStaleSeconds")
    public final int o() {
        return this.f225156h;
    }

    @dd.j(name = "minFreshSeconds")
    public final int p() {
        return this.f225157i;
    }

    @dd.j(name = "mustRevalidate")
    public final boolean q() {
        return this.f225155g;
    }

    @dd.j(name = "noCache")
    public final boolean r() {
        return this.f225149a;
    }

    @dd.j(name = "noStore")
    public final boolean s() {
        return this.f225150b;
    }

    @dd.j(name = "noTransform")
    public final boolean t() {
        return this.f225159k;
    }

    @NotNull
    public String toString() {
        String str = this.f225161m;
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f225149a) {
            sb2.append("no-cache, ");
        }
        if (this.f225150b) {
            sb2.append("no-store, ");
        }
        if (this.f225151c != -1) {
            sb2.append("max-age=");
            sb2.append(this.f225151c);
            sb2.append(U6.j.f68738d);
        }
        if (this.f225152d != -1) {
            sb2.append("s-maxage=");
            sb2.append(this.f225152d);
            sb2.append(U6.j.f68738d);
        }
        if (this.f225153e) {
            sb2.append("private, ");
        }
        if (this.f225154f) {
            sb2.append("public, ");
        }
        if (this.f225155g) {
            sb2.append("must-revalidate, ");
        }
        if (this.f225156h != -1) {
            sb2.append("max-stale=");
            sb2.append(this.f225156h);
            sb2.append(U6.j.f68738d);
        }
        if (this.f225157i != -1) {
            sb2.append("min-fresh=");
            sb2.append(this.f225157i);
            sb2.append(U6.j.f68738d);
        }
        if (this.f225158j) {
            sb2.append("only-if-cached, ");
        }
        if (this.f225159k) {
            sb2.append("no-transform, ");
        }
        if (this.f225160l) {
            sb2.append("immutable, ");
        }
        if (sb2.length() == 0) {
            return "";
        }
        sb2.delete(sb2.length() - 2, sb2.length());
        String string = sb2.toString();
        G.o(string, "StringBuilder().apply(builderAction).toString()");
        this.f225161m = string;
        return string;
    }

    @dd.j(name = "onlyIfCached")
    public final boolean u() {
        return this.f225158j;
    }

    @dd.j(name = "sMaxAgeSeconds")
    public final int w() {
        return this.f225152d;
    }

    public CacheControl(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, String str) {
        this.f225149a = z10;
        this.f225150b = z11;
        this.f225151c = i10;
        this.f225152d = i11;
        this.f225153e = z12;
        this.f225154f = z13;
        this.f225155g = z14;
        this.f225156h = i12;
        this.f225157i = i13;
        this.f225158j = z15;
        this.f225159k = z16;
        this.f225160l = z17;
        this.f225161m = str;
    }
}
