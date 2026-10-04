package androidx.compose.ui.layout;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.ui.layout.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2187w {
    public static boolean a(InterfaceC2188x interfaceC2188x) {
        return false;
    }

    public static long b(InterfaceC2188x interfaceC2188x, @NotNull InterfaceC2188x interfaceC2188x2, long j10, boolean z10) {
        throw new UnsupportedOperationException("localPositionOf is not implemented on this LayoutCoordinates");
    }

    public static long c(InterfaceC2188x interfaceC2188x, long j10) {
        P.g.f65503b.getClass();
        return P.g.f65506e;
    }

    public static long d(InterfaceC2188x interfaceC2188x, long j10) {
        P.g.f65503b.getClass();
        return P.g.f65506e;
    }

    public static void e(InterfaceC2188x interfaceC2188x, @NotNull InterfaceC2188x interfaceC2188x2, @NotNull float[] fArr) {
        throw new UnsupportedOperationException("transformFrom is not implemented on this LayoutCoordinates");
    }

    public static void f(InterfaceC2188x interfaceC2188x, @NotNull float[] fArr) {
        throw new UnsupportedOperationException("transformToScreen is not implemented on this LayoutCoordinates");
    }

    public static /* synthetic */ boolean g(InterfaceC2188x interfaceC2188x) {
        return false;
    }

    public static /* synthetic */ long h(InterfaceC2188x interfaceC2188x, InterfaceC2188x interfaceC2188x2, long j10, boolean z10) {
        b(interfaceC2188x, interfaceC2188x2, j10, z10);
        throw null;
    }

    public static /* synthetic */ void k(InterfaceC2188x interfaceC2188x, InterfaceC2188x interfaceC2188x2, float[] fArr) {
        e(interfaceC2188x, interfaceC2188x2, fArr);
        throw null;
    }

    public static /* synthetic */ void l(InterfaceC2188x interfaceC2188x, float[] fArr) {
        f(interfaceC2188x, fArr);
        throw null;
    }

    public static /* synthetic */ P.j m(InterfaceC2188x interfaceC2188x, InterfaceC2188x interfaceC2188x2, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: localBoundingBoxOf");
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return interfaceC2188x.a0(interfaceC2188x2, z10);
    }

    public static long n(InterfaceC2188x interfaceC2188x, InterfaceC2188x interfaceC2188x2, long j10, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: localPositionOf-S_NoaFU");
        }
        if ((i10 & 2) != 0) {
            P.g.f65503b.getClass();
            j10 = P.g.f65504c;
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        return interfaceC2188x.R(interfaceC2188x2, j10, z10);
    }
}
