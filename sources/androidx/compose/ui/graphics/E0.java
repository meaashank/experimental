package androidx.compose.ui.graphics;

import ed.InterfaceC4376a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class E0 {
    @NotNull
    public static final C0 a(@NotNull InterfaceC2025e2 interfaceC2025e2) {
        return H.a(interfaceC2025e2);
    }

    public static final void b(@NotNull C0 c02, float f10, float f11, float f12) {
        if (f10 == 0.0f) {
            return;
        }
        c02.c(f11, f12);
        c02.y(f10);
        c02.c(-f11, -f12);
    }

    public static final void c(@NotNull C0 c02, float f10, float f11, float f12) {
        b(c02, f10 * 57.29578f, f11, f12);
    }

    public static /* synthetic */ void d(C0 c02, float f10, float f11, float f12, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            f12 = 0.0f;
        }
        c(c02, f10, f11, f12);
    }

    public static final void e(@NotNull C0 c02, float f10, float f11, float f12, float f13) {
        if (f10 == 1.0f && f11 == 1.0f) {
            return;
        }
        c02.c(f12, f13);
        c02.n(f10, f11);
        c02.c(-f12, -f13);
    }

    public static /* synthetic */ void f(C0 c02, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = f10;
        }
        e(c02, f10, f11, f12, f13);
    }

    public static final void g(@NotNull C0 c02, @NotNull InterfaceC4376a<kotlin.L0> interfaceC4376a) {
        try {
            c02.A();
            interfaceC4376a.invoke();
        } finally {
            c02.r();
        }
    }

    public static final void h(@NotNull C0 c02, @NotNull P.j jVar, @NotNull InterfaceC2105s2 interfaceC2105s2, @NotNull InterfaceC4376a<kotlin.L0> interfaceC4376a) {
        try {
            c02.i(jVar, interfaceC2105s2);
            interfaceC4376a.invoke();
        } finally {
            c02.r();
        }
    }
}
