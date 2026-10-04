package k0;

import androidx.compose.runtime.T1;
import l0.C5131b;
import l0.InterfaceC5130a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o {
    @T1
    public static float a(p pVar, long j10) {
        long jM = B.m(j10);
        D.f214274b.getClass();
        if (!D.g(jM, D.f214276d)) {
            s.d("Only Sp can convert to Px");
            throw null;
        }
        C5131b c5131b = C5131b.f220897a;
        if (!c5131b.h(pVar.m0())) {
            return pVar.m0() * B.n(j10);
        }
        InterfaceC5130a interfaceC5130aB = c5131b.b(pVar.m0());
        if (interfaceC5130aB != null) {
            return interfaceC5130aB.b(B.n(j10));
        }
        return pVar.m0() * B.n(j10);
    }

    @T1
    public static long b(p pVar, float f10) {
        C5131b c5131b = C5131b.f220897a;
        if (!c5131b.h(pVar.m0())) {
            return C.v(4294967296L, f10 / pVar.m0());
        }
        InterfaceC5130a interfaceC5130aB = c5131b.b(pVar.m0());
        return C.v(4294967296L, interfaceC5130aB != null ? interfaceC5130aB.a(f10) : f10 / pVar.m0());
    }
}
