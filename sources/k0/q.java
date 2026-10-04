package k0;

import androidx.compose.runtime.T1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q {
    @T1
    public static float a(r rVar, long j10) {
        long jM = B.m(j10);
        D.f214274b.getClass();
        if (!D.g(jM, D.f214276d)) {
            throw new IllegalStateException("Only Sp can convert to Px");
        }
        return rVar.m0() * B.n(j10);
    }

    @T1
    public static long b(r rVar, float f10) {
        return C.v(4294967296L, f10 / rVar.m0());
    }
}
