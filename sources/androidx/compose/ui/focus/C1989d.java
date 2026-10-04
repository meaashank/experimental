package androidx.compose.ui.focus;

import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.ui.focus.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@dd.h
public final class C1989d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f100651b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f100652c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f100653d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f100654e = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f100655f = 4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f100656g = 5;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f100657h = 6;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f100658i = 7;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f100659j = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f100660a;

    /* JADX INFO: renamed from: androidx.compose.ui.focus.d$a */
    public static final class a {
        public a() {
        }

        @androidx.compose.ui.i
        public static /* synthetic */ void c() {
        }

        @androidx.compose.ui.i
        public static /* synthetic */ void e() {
        }

        public final int a() {
            return C1989d.f100657h;
        }

        @androidx.compose.ui.i
        public final int b() {
            return C1989d.f100658i;
        }

        @androidx.compose.ui.i
        public final int d() {
            return C1989d.f100659j;
        }

        public final int f() {
            return C1989d.f100654e;
        }

        public final int g() {
            return C1989d.f100652c;
        }

        public final int h() {
            return C1989d.f100653d;
        }

        public final int i() {
            return C1989d.f100655f;
        }

        public final int j() {
            return C1989d.f100656g;
        }

        public a(C4969v c4969v) {
        }
    }

    public /* synthetic */ C1989d(int i10) {
        this.f100660a = i10;
    }

    public static final /* synthetic */ C1989d i(int i10) {
        return new C1989d(i10);
    }

    public static int j(int i10) {
        return i10;
    }

    public static boolean k(int i10, Object obj) {
        return (obj instanceof C1989d) && i10 == ((C1989d) obj).f100660a;
    }

    public static final boolean l(int i10, int i11) {
        return i10 == i11;
    }

    public static int m(int i10) {
        return i10;
    }

    @NotNull
    public static String n(int i10) {
        return i10 == f100652c ? "Next" : i10 == f100653d ? "Previous" : i10 == f100654e ? "Left" : i10 == f100655f ? "Right" : i10 == f100656g ? "Up" : i10 == f100657h ? "Down" : i10 == f100658i ? "Enter" : i10 == f100659j ? "Exit" : "Invalid FocusDirection";
    }

    public boolean equals(Object obj) {
        return k(this.f100660a, obj);
    }

    public int hashCode() {
        return this.f100660a;
    }

    public final /* synthetic */ int o() {
        return this.f100660a;
    }

    @NotNull
    public String toString() {
        return n(this.f100660a);
    }
}
