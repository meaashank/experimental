package androidx.compose.ui.graphics;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class B0 {
    public static void a(C0 c02, @NotNull P.j jVar, int i10) {
        c02.b(jVar.f65511a, jVar.f65512b, jVar.f65513c, jVar.f65514d, i10);
    }

    public static void b(C0 c02, @NotNull P.j jVar, float f10, float f11, boolean z10, @NotNull InterfaceC2105s2 interfaceC2105s2) {
        c02.k(jVar.f65511a, jVar.f65512b, jVar.f65513c, jVar.f65514d, f10, f11, z10, interfaceC2105s2);
    }

    public static void c(C0 c02, @NotNull P.j jVar, float f10, float f11, boolean z10, @NotNull InterfaceC2105s2 interfaceC2105s2) {
        c02.j(jVar, f10 * 57.29578f, f11 * 57.29578f, z10, interfaceC2105s2);
    }

    public static void d(C0 c02, @NotNull P.j jVar, @NotNull InterfaceC2105s2 interfaceC2105s2) {
        c02.p(jVar.f65511a, jVar.f65512b, jVar.f65513c, jVar.f65514d, interfaceC2105s2);
    }

    public static void e(C0 c02, @NotNull P.j jVar, @NotNull InterfaceC2105s2 interfaceC2105s2) {
        c02.o(jVar.f65511a, jVar.f65512b, jVar.f65513c, jVar.f65514d, interfaceC2105s2);
    }

    public static void f(C0 c02, float f10, float f11) {
        c02.z(f10 * 57.29578f, f11 * 57.29578f);
    }

    public static void m(C0 c02, Path path, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
        }
        if ((i11 & 2) != 0) {
            J0.f100729b.getClass();
            i10 = J0.f100731d;
        }
        c02.d(path, i10);
    }

    public static void n(C0 c02, float f10, float f11, float f12, float f13, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
        }
        if ((i11 & 16) != 0) {
            J0.f100729b.getClass();
            i10 = J0.f100731d;
        }
        c02.b(f10, f11, f12, f13, i10);
    }

    public static void o(C0 c02, P.j jVar, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-mtrdD-E");
        }
        if ((i11 & 2) != 0) {
            J0.f100729b.getClass();
            i10 = J0.f100731d;
        }
        c02.l(jVar, i10);
    }

    public static void p(C0 c02, InterfaceC2025e2 interfaceC2025e2, long j10, long j11, long j12, long j13, InterfaceC2105s2 interfaceC2105s2, int i10, Object obj) {
        long j14;
        long j15;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImageRect-HPBpro0");
        }
        if ((i10 & 2) != 0) {
            k0.t.f214328b.getClass();
            j14 = k0.t.f214329c;
        } else {
            j14 = j10;
        }
        long jA = (i10 & 4) != 0 ? k0.y.a(interfaceC2025e2.getWidth(), interfaceC2025e2.getHeight()) : j11;
        if ((i10 & 8) != 0) {
            k0.t.f214328b.getClass();
            j15 = k0.t.f214329c;
        } else {
            j15 = j12;
        }
        c02.f(interfaceC2025e2, j14, jA, j15, (i10 & 16) != 0 ? jA : j13, interfaceC2105s2);
    }

    public static /* synthetic */ void q(C0 c02, float f10, float f11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scale");
        }
        if ((i10 & 2) != 0) {
            f11 = f10;
        }
        c02.n(f10, f11);
    }
}
