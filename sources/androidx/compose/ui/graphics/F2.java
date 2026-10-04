package androidx.compose.ui.graphics;

import androidx.compose.runtime.InterfaceC1924k0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
@dd.h
public final class F2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f100685b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f100686c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f100687d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f100688e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f100689f = 3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f100690g = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f100691a;

    public static final class a {
        public a() {
        }

        public final int a() {
            return F2.f100686c;
        }

        public final int b() {
            return F2.f100687d;
        }

        public final int c() {
            return F2.f100690g;
        }

        public final int d() {
            return F2.f100688e;
        }

        public final int e() {
            return F2.f100689f;
        }

        public a(C4969v c4969v) {
        }
    }

    public /* synthetic */ F2(int i10) {
        this.f100691a = i10;
    }

    public static final /* synthetic */ F2 f(int i10) {
        return new F2(i10);
    }

    public static int g(int i10) {
        return i10;
    }

    public static boolean h(int i10, Object obj) {
        return (obj instanceof F2) && i10 == ((F2) obj).f100691a;
    }

    public static final boolean i(int i10, int i11) {
        return i10 == i11;
    }

    public static int j(int i10) {
        return i10;
    }

    @NotNull
    public static String k(int i10) {
        return i10 == f100686c ? "Difference" : i10 == f100687d ? "Intersect" : i10 == f100688e ? "Union" : i10 == f100689f ? "Xor" : i10 == f100690g ? "ReverseDifference" : "Unknown";
    }

    public boolean equals(Object obj) {
        return h(this.f100691a, obj);
    }

    public int hashCode() {
        return this.f100691a;
    }

    public final /* synthetic */ int l() {
        return this.f100691a;
    }

    @NotNull
    public String toString() {
        return k(this.f100691a);
    }
}
