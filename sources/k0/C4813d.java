package k0;

import androidx.compose.runtime.T1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: k0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4813d {
    @T1
    public static int a(InterfaceC4814e interfaceC4814e, long j10) {
        return Math.round(interfaceC4814e.M1(j10));
    }

    @T1
    public static int b(InterfaceC4814e interfaceC4814e, float f10) {
        float fL2 = interfaceC4814e.l2(f10);
        if (Float.isInfinite(fL2)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(fL2);
    }

    @T1
    public static float c(InterfaceC4814e interfaceC4814e, float f10) {
        return f10 / interfaceC4814e.a();
    }

    @T1
    public static float d(InterfaceC4814e interfaceC4814e, int i10) {
        return i10 / interfaceC4814e.a();
    }

    @T1
    public static long e(InterfaceC4814e interfaceC4814e, long j10) {
        if (j10 != P.d.f65493d) {
            return j.b(interfaceC4814e.W(P.n.t(j10)), interfaceC4814e.W(P.n.m(j10)));
        }
        m.f214323b.getClass();
        return m.f214325d;
    }

    @T1
    public static float f(InterfaceC4814e interfaceC4814e, long j10) {
        long jM = B.m(j10);
        D.f214274b.getClass();
        if (D.g(jM, D.f214276d)) {
            return interfaceC4814e.l2(interfaceC4814e.k(j10));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    @T1
    public static float g(InterfaceC4814e interfaceC4814e, float f10) {
        return interfaceC4814e.a() * f10;
    }

    @T1
    @NotNull
    public static P.j h(InterfaceC4814e interfaceC4814e, @NotNull l lVar) {
        return new P.j(interfaceC4814e.l2(lVar.f214319a), interfaceC4814e.l2(lVar.f214320b), interfaceC4814e.l2(lVar.f214321c), interfaceC4814e.l2(lVar.f214322d));
    }

    @T1
    public static long i(InterfaceC4814e interfaceC4814e, long j10) {
        if (j10 != P.d.f65493d) {
            return P.o.a(interfaceC4814e.l2(m.p(j10)), interfaceC4814e.l2(m.m(j10)));
        }
        P.n.f65527b.getClass();
        return P.n.f65529d;
    }

    @T1
    public static long j(InterfaceC4814e interfaceC4814e, float f10) {
        return interfaceC4814e.s(interfaceC4814e.W(f10));
    }

    @T1
    public static long k(InterfaceC4814e interfaceC4814e, int i10) {
        return interfaceC4814e.s(interfaceC4814e.V(i10));
    }

    public static float o(InterfaceC4814e interfaceC4814e, float f10) {
        return f10 / interfaceC4814e.a();
    }

    public static float s(InterfaceC4814e interfaceC4814e, float f10) {
        return interfaceC4814e.a() * f10;
    }
}
