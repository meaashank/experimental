package O;

import androidx.compose.animation.core.C1610t;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@dd.h
public final class B {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f65066b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f65067c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f65068d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f65069e = 4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f65070f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f65071g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f65072a;

    public static final class a {
        public a() {
        }

        public final int a(int i10) {
            if (i10 == 0) {
                return B.f65071g;
            }
            if (i10 == 1) {
                return B.f65067c;
            }
            if (i10 == 2) {
                return B.f65070f;
            }
            if (i10 == 3) {
                return B.f65068d;
            }
            if (i10 == 4) {
                return B.f65069e;
            }
            throw new IllegalArgumentException(android.support.v4.media.c.a("Invalid autofill type value: ", i10));
        }

        public final int b() {
            return B.f65069e;
        }

        public final int c() {
            return B.f65068d;
        }

        public final int d() {
            return B.f65071g;
        }

        public final int e() {
            return B.f65067c;
        }

        public final int f() {
            return B.f65070f;
        }

        public a(C4969v c4969v) {
        }
    }

    public /* synthetic */ B(int i10) {
        this.f65072a = i10;
    }

    public static final /* synthetic */ B f(int i10) {
        return new B(i10);
    }

    public static boolean h(int i10, Object obj) {
        return (obj instanceof B) && i10 == ((B) obj).f65072a;
    }

    public static final boolean i(int i10, int i11) {
        return i10 == i11;
    }

    public static String l(int i10) {
        return C1610t.a("ContentDataType(dataType=", i10, ')');
    }

    public boolean equals(Object obj) {
        return h(this.f65072a, obj);
    }

    public int hashCode() {
        return this.f65072a;
    }

    public final int j() {
        return this.f65072a;
    }

    public final /* synthetic */ int m() {
        return this.f65072a;
    }

    public String toString() {
        return l(this.f65072a);
    }

    public static int g(int i10) {
        return i10;
    }

    public static int k(int i10) {
        return i10;
    }
}
