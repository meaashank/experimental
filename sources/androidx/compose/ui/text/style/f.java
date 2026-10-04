package androidx.compose.ui.text.style;

import androidx.compose.runtime.InterfaceC1924k0;
import androidx.compose.runtime.T1;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
@dd.h
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f104965b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f104966c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f104967d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f104968e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f104969f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f104970a;

    public static final class a {
        public a() {
        }

        @T1
        public static /* synthetic */ void b() {
        }

        @T1
        public static /* synthetic */ void d() {
        }

        @T1
        public static /* synthetic */ void f() {
        }

        @T1
        public static /* synthetic */ void h() {
        }

        public final int a() {
            return f.f104967d;
        }

        public final int c() {
            return f.f104968e;
        }

        public final int e() {
            return f.f104966c;
        }

        public final int g() {
            return f.f104969f;
        }

        public a(C4969v c4969v) {
        }
    }

    @dd.h
    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final a f104971b = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f104972c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f104973d = 2;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f104974e = 3;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f104975f = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f104976a;

        public static final class a {
            public a() {
            }

            public final int a() {
                return b.f104974e;
            }

            public final int b() {
                return b.f104973d;
            }

            public final int c() {
                return b.f104972c;
            }

            public final int d() {
                return b.f104975f;
            }

            public a(C4969v c4969v) {
            }
        }

        public /* synthetic */ b(int i10) {
            this.f104976a = i10;
        }

        public static final /* synthetic */ b e(int i10) {
            return new b(i10);
        }

        public static int f(int i10) {
            return i10;
        }

        public static boolean g(int i10, Object obj) {
            return (obj instanceof b) && i10 == ((b) obj).f104976a;
        }

        public static final boolean h(int i10, int i11) {
            return i10 == i11;
        }

        public static int i(int i10) {
            return i10;
        }

        @NotNull
        public static String j(int i10) {
            return i10 == f104972c ? "Strategy.Simple" : i10 == f104973d ? "Strategy.HighQuality" : i10 == f104974e ? "Strategy.Balanced" : i10 == f104975f ? "Strategy.Unspecified" : "Invalid";
        }

        public boolean equals(Object obj) {
            return g(this.f104976a, obj);
        }

        public int hashCode() {
            return this.f104976a;
        }

        public final /* synthetic */ int k() {
            return this.f104976a;
        }

        @NotNull
        public String toString() {
            return j(this.f104976a);
        }
    }

    @dd.h
    public static final class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final a f104977b = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f104978c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f104979d = 2;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f104980e = 3;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f104981f = 4;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f104982g = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f104983a;

        public static final class a {
            public a() {
            }

            public final int a() {
                return c.f104978c;
            }

            public final int b() {
                return c.f104979d;
            }

            public final int c() {
                return c.f104980e;
            }

            public final int d() {
                return c.f104981f;
            }

            public final int e() {
                return c.f104982g;
            }

            public a(C4969v c4969v) {
            }
        }

        public /* synthetic */ c(int i10) {
            this.f104983a = i10;
        }

        public static final /* synthetic */ c f(int i10) {
            return new c(i10);
        }

        public static int g(int i10) {
            return i10;
        }

        public static boolean h(int i10, Object obj) {
            return (obj instanceof c) && i10 == ((c) obj).f104983a;
        }

        public static final boolean i(int i10, int i11) {
            return i10 == i11;
        }

        public static int j(int i10) {
            return i10;
        }

        @NotNull
        public static String k(int i10) {
            return i10 == f104978c ? "Strictness.None" : i10 == f104979d ? "Strictness.Loose" : i10 == f104980e ? "Strictness.Normal" : i10 == f104981f ? "Strictness.Strict" : i10 == f104982g ? "Strictness.Unspecified" : "Invalid";
        }

        public boolean equals(Object obj) {
            return h(this.f104983a, obj);
        }

        public int hashCode() {
            return this.f104983a;
        }

        public final /* synthetic */ int l() {
            return this.f104983a;
        }

        @NotNull
        public String toString() {
            return k(this.f104983a);
        }
    }

    @dd.h
    public static final class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final a f104984b = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f104985c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f104986d = 2;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f104987e = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f104988a;

        public static final class a {
            public a() {
            }

            public final int a() {
                return d.f104985c;
            }

            public final int b() {
                return d.f104986d;
            }

            public final int c() {
                return d.f104987e;
            }

            public a(C4969v c4969v) {
            }
        }

        public /* synthetic */ d(int i10) {
            this.f104988a = i10;
        }

        public static final /* synthetic */ d d(int i10) {
            return new d(i10);
        }

        public static int e(int i10) {
            return i10;
        }

        public static boolean f(int i10, Object obj) {
            return (obj instanceof d) && i10 == ((d) obj).f104988a;
        }

        public static final boolean g(int i10, int i11) {
            return i10 == i11;
        }

        public static int h(int i10) {
            return i10;
        }

        @NotNull
        public static String i(int i10) {
            return i10 == f104985c ? "WordBreak.None" : i10 == f104986d ? "WordBreak.Phrase" : i10 == f104987e ? "WordBreak.Unspecified" : "Invalid";
        }

        public boolean equals(Object obj) {
            return f(this.f104988a, obj);
        }

        public int hashCode() {
            return this.f104988a;
        }

        public final /* synthetic */ int j() {
            return this.f104988a;
        }

        @NotNull
        public String toString() {
            return i(this.f104988a);
        }
    }

    static {
        b.a aVar = b.f104971b;
        aVar.getClass();
        int i10 = b.f104972c;
        c.a aVar2 = c.f104977b;
        aVar2.getClass();
        int i11 = c.f104980e;
        d.a aVar3 = d.f104984b;
        aVar3.getClass();
        int i12 = d.f104985c;
        f104966c = g.e(i10, i11, i12);
        aVar.getClass();
        int i13 = b.f104974e;
        aVar2.getClass();
        int i14 = c.f104979d;
        aVar3.getClass();
        f104967d = g.e(i13, i14, d.f104986d);
        aVar.getClass();
        int i15 = b.f104973d;
        aVar2.getClass();
        int i16 = c.f104981f;
        aVar3.getClass();
        f104968e = g.e(i15, i16, i12);
        f104969f = 0;
    }

    public /* synthetic */ f(int i10) {
        this.f104970a = i10;
    }

    public static final /* synthetic */ f e(int i10) {
        return new f(i10);
    }

    public static int f(int i10) {
        return i10;
    }

    public static int g(int i10, int i11, int i12) {
        return g.e(i10, i11, i12);
    }

    public static final int h(int i10, int i11, int i12, int i13) {
        return g.e(i11, i12, i13);
    }

    public static int i(int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i11 = i10 & 255;
        }
        if ((i14 & 2) != 0) {
            i12 = g.g(i10);
        }
        if ((i14 & 4) != 0) {
            i13 = g.h(i10);
        }
        return g.e(i11, i12, i13);
    }

    public static boolean j(int i10, Object obj) {
        return (obj instanceof f) && i10 == ((f) obj).f104970a;
    }

    public static final boolean k(int i10, int i11) {
        return i10 == i11;
    }

    public static final int l(int i10) {
        return i10 & 255;
    }

    public static final int m(int i10) {
        return g.g(i10);
    }

    public static final int n(int i10) {
        return g.h(i10);
    }

    public static int o(int i10) {
        return i10;
    }

    @NotNull
    public static String p(int i10) {
        return "LineBreak(strategy=" + ((Object) b.j(i10 & 255)) + ", strictness=" + ((Object) c.k(g.g(i10))) + ", wordBreak=" + ((Object) d.i(g.h(i10))) + ')';
    }

    public boolean equals(Object obj) {
        return j(this.f104970a, obj);
    }

    public int hashCode() {
        return this.f104970a;
    }

    public final /* synthetic */ int q() {
        return this.f104970a;
    }

    @NotNull
    public String toString() {
        return p(this.f104970a);
    }
}
