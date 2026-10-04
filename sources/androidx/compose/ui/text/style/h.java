package androidx.compose.ui.text.style;

import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public final class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final b f104989c = new b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f104990d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final h f104991e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f104992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f104993b;

    @dd.h
    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final C0266a f104994b = new C0266a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final float f104995c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final float f104996d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final float f104997e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final float f104998f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f104999a;

        /* JADX INFO: renamed from: androidx.compose.ui.text.style.h$a$a, reason: collision with other inner class name */
        public static final class C0266a {
            public C0266a() {
            }

            public final float a() {
                return a.f104998f;
            }

            public final float b() {
                return a.f104996d;
            }

            public final float c() {
                return a.f104997e;
            }

            public final float d() {
                return a.f104995c;
            }

            public C0266a(C4969v c4969v) {
            }
        }

        static {
            f(0.0f);
            f104995c = 0.0f;
            f(0.5f);
            f104996d = 0.5f;
            f(-1.0f);
            f104997e = -1.0f;
            f(1.0f);
            f104998f = 1.0f;
        }

        public /* synthetic */ a(float f10) {
            this.f104999a = f10;
        }

        public static final /* synthetic */ a e(float f10) {
            return new a(f10);
        }

        public static float f(float f10) {
            if ((0.0f > f10 || f10 > 1.0f) && f10 != -1.0f) {
                throw new IllegalStateException("topRatio should be in [0..1] range or -1");
            }
            return f10;
        }

        public static boolean g(float f10, Object obj) {
            return (obj instanceof a) && Float.compare(f10, ((a) obj).f104999a) == 0;
        }

        public static final boolean h(float f10, float f11) {
            return Float.compare(f10, f11) == 0;
        }

        public static int i(float f10) {
            return Float.floatToIntBits(f10);
        }

        @NotNull
        public static String j(float f10) {
            if (f10 == f104995c) {
                return "LineHeightStyle.Alignment.Top";
            }
            if (f10 == f104996d) {
                return "LineHeightStyle.Alignment.Center";
            }
            if (f10 == f104997e) {
                return "LineHeightStyle.Alignment.Proportional";
            }
            if (f10 == f104998f) {
                return "LineHeightStyle.Alignment.Bottom";
            }
            return "LineHeightStyle.Alignment(topPercentage = " + f10 + ')';
        }

        public boolean equals(Object obj) {
            return g(this.f104999a, obj);
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f104999a);
        }

        public final /* synthetic */ float k() {
            return this.f104999a;
        }

        @NotNull
        public String toString() {
            return j(this.f104999a);
        }
    }

    public static final class b {
        public b() {
        }

        @NotNull
        public final h a() {
            return h.f104991e;
        }

        public b(C4969v c4969v) {
        }
    }

    @dd.h
    public static final class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final a f105000b = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f105001c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f105002d = 16;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f105003e = 1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f105004f = 16;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f105005g = 17;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f105006h = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f105007a;

        public static final class a {
            public a() {
            }

            public final int a() {
                return c.f105005g;
            }

            public final int b() {
                return c.f105003e;
            }

            public final int c() {
                return c.f105004f;
            }

            public final int d() {
                return c.f105006h;
            }

            public a(C4969v c4969v) {
            }
        }

        public /* synthetic */ c(int i10) {
            this.f105007a = i10;
        }

        public static final /* synthetic */ c e(int i10) {
            return new c(i10);
        }

        public static int f(int i10) {
            return i10;
        }

        public static boolean g(int i10, Object obj) {
            return (obj instanceof c) && i10 == ((c) obj).f105007a;
        }

        public static final boolean h(int i10, int i11) {
            return i10 == i11;
        }

        public static int i(int i10) {
            return i10;
        }

        public static final boolean j(int i10) {
            return (i10 & 1) > 0;
        }

        public static final boolean k(int i10) {
            return (i10 & 16) > 0;
        }

        @NotNull
        public static String l(int i10) {
            return i10 == f105003e ? "LineHeightStyle.Trim.FirstLineTop" : i10 == f105004f ? "LineHeightStyle.Trim.LastLineBottom" : i10 == f105005g ? "LineHeightStyle.Trim.Both" : i10 == f105006h ? "LineHeightStyle.Trim.None" : "Invalid";
        }

        public boolean equals(Object obj) {
            return g(this.f105007a, obj);
        }

        public int hashCode() {
            return this.f105007a;
        }

        public final /* synthetic */ int m() {
            return this.f105007a;
        }

        @NotNull
        public String toString() {
            return l(this.f105007a);
        }
    }

    static {
        a.f104994b.getClass();
        float f10 = a.f104997e;
        c.f105000b.getClass();
        f104991e = new h(f10, c.f105005g);
    }

    public /* synthetic */ h(float f10, int i10, C4969v c4969v) {
        this(f10, i10);
    }

    public final float b() {
        return this.f104992a;
    }

    public final int c() {
        return this.f104993b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return a.h(this.f104992a, hVar.f104992a) && this.f104993b == hVar.f104993b;
    }

    public int hashCode() {
        return (a.i(this.f104992a) * 31) + this.f104993b;
    }

    @NotNull
    public String toString() {
        return "LineHeightStyle(alignment=" + ((Object) a.j(this.f104992a)) + ", trim=" + ((Object) c.l(this.f104993b)) + ')';
    }

    public h(float f10, int i10) {
        this.f104992a = f10;
        this.f104993b = i10;
    }
}
