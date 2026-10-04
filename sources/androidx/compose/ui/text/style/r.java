package androidx.compose.ui.text.style;

import androidx.compose.animation.C1635o;
import androidx.compose.runtime.InterfaceC1924k0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
public final class r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f105045c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f105046d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final r f105047e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final r f105048f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f105049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f105050b;

    public static final class a {
        public a() {
        }

        @NotNull
        public final r a() {
            return r.f105048f;
        }

        @NotNull
        public final r b() {
            return r.f105047e;
        }

        public a(C4969v c4969v) {
        }
    }

    @dd.h
    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final a f105051b = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f105052c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f105053d = 2;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f105054e = 3;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f105055a;

        public static final class a {
            public a() {
            }

            public final int a() {
                return b.f105053d;
            }

            public final int b() {
                return b.f105052c;
            }

            public final int c() {
                return b.f105054e;
            }

            public a(C4969v c4969v) {
            }
        }

        public /* synthetic */ b(int i10) {
            this.f105055a = i10;
        }

        public static final /* synthetic */ b d(int i10) {
            return new b(i10);
        }

        public static int e(int i10) {
            return i10;
        }

        public static boolean f(int i10, Object obj) {
            return (obj instanceof b) && i10 == ((b) obj).f105055a;
        }

        public static final boolean g(int i10, int i11) {
            return i10 == i11;
        }

        public static int h(int i10) {
            return i10;
        }

        @NotNull
        public static String i(int i10) {
            return i10 == f105052c ? "Linearity.Linear" : i10 == f105053d ? "Linearity.FontHinting" : i10 == f105054e ? "Linearity.None" : "Invalid";
        }

        public boolean equals(Object obj) {
            return f(this.f105055a, obj);
        }

        public int hashCode() {
            return this.f105055a;
        }

        public final /* synthetic */ int j() {
            return this.f105055a;
        }

        @NotNull
        public String toString() {
            return i(this.f105055a);
        }
    }

    static {
        b.a aVar = b.f105051b;
        aVar.getClass();
        f105047e = new r(b.f105053d, false);
        aVar.getClass();
        f105048f = new r(b.f105052c, true);
    }

    public /* synthetic */ r(int i10, boolean z10, C4969v c4969v) {
        this(i10, z10);
    }

    public static r d(r rVar, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = rVar.f105049a;
        }
        if ((i11 & 2) != 0) {
            z10 = rVar.f105050b;
        }
        rVar.getClass();
        return new r(i10, z10);
    }

    @NotNull
    public final r c(int i10, boolean z10) {
        return new r(i10, z10);
    }

    public final int e() {
        return this.f105049a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f105049a == rVar.f105049a && this.f105050b == rVar.f105050b;
    }

    public final boolean f() {
        return this.f105050b;
    }

    public int hashCode() {
        return C1635o.a(this.f105050b) + (this.f105049a * 31);
    }

    @NotNull
    public String toString() {
        return equals(f105047e) ? "TextMotion.Static" : equals(f105048f) ? "TextMotion.Animated" : "Invalid";
    }

    public r(int i10, boolean z10) {
        this.f105049a = i10;
        this.f105050b = z10;
    }
}
