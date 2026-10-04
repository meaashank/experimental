package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.i;
import dd.h;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4982o;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@h
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f102137b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f102138c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f102139d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f102140e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f102141f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f102142g = 3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f102143h = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f102144a;

    public static final class a {
        public a() {
        }

        @InterfaceC4982o(message = "This has been replaced by UserInput.", replaceWith = @InterfaceC4852c0(expression = "NestedScrollSource.UserInput", imports = {"import androidx.compose.ui.input.nestedscroll.NestedScrollSource.Companion.UserInput"}))
        public static /* synthetic */ void b() {
        }

        @InterfaceC4982o(message = "This has been replaced by SideEffect.", replaceWith = @InterfaceC4852c0(expression = "NestedScrollSource.SideEffect", imports = {"import androidx.compose.ui.input.nestedscroll.NestedScrollSource.Companion.SideEffect"}))
        public static /* synthetic */ void d() {
        }

        @InterfaceC4982o(message = "Do not use. Will be removed in the future.")
        @i
        public static /* synthetic */ void f() {
        }

        @InterfaceC4982o(message = "This has been replaced by UserInput.", replaceWith = @InterfaceC4852c0(expression = "NestedScrollSource.UserInput", imports = {"import androidx.compose.ui.input.nestedscroll.NestedScrollSource.Companion.UserInput"}))
        public static /* synthetic */ void j() {
        }

        public final int a() {
            return e.f102140e;
        }

        public final int c() {
            return e.f102141f;
        }

        @i
        public final int e() {
            return e.f102142g;
        }

        public final int g() {
            return e.f102139d;
        }

        public final int h() {
            return e.f102138c;
        }

        public final int i() {
            return e.f102143h;
        }

        public a(C4969v c4969v) {
        }
    }

    public /* synthetic */ e(int i10) {
        this.f102144a = i10;
    }

    public static final /* synthetic */ e g(int i10) {
        return new e(i10);
    }

    public static int h(int i10) {
        return i10;
    }

    public static boolean i(int i10, Object obj) {
        return (obj instanceof e) && i10 == ((e) obj).f102144a;
    }

    public static final boolean j(int i10, int i11) {
        return i10 == i11;
    }

    public static int k(int i10) {
        return i10;
    }

    @NotNull
    public static String l(int i10) {
        return i10 == f102138c ? "UserInput" : i10 == f102139d ? "SideEffect" : i10 == f102142g ? "Relocate" : "Invalid";
    }

    public boolean equals(Object obj) {
        return i(this.f102144a, obj);
    }

    public int hashCode() {
        return this.f102144a;
    }

    public final /* synthetic */ int m() {
        return this.f102144a;
    }

    @NotNull
    public String toString() {
        return l(this.f102144a);
    }
}
