package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.J0;
import androidx.compose.ui.graphics.Path;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l {
    public static long a(m mVar) {
        float f10 = 2;
        return P.h.a(P.n.t(mVar.e()) / f10, P.n.m(mVar.e()) / f10);
    }

    public static void c(m mVar, Path path, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
        }
        if ((i11 & 2) != 0) {
            J0.f100729b.getClass();
            i10 = J0.f100731d;
        }
        mVar.d(path, i10);
    }

    public static void d(m mVar, float f10, float f11, float f12, float f13, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
        }
        if ((i11 & 1) != 0) {
            f10 = 0.0f;
        }
        if ((i11 & 2) != 0) {
            f11 = 0.0f;
        }
        if ((i11 & 4) != 0) {
            f12 = P.n.t(mVar.e());
        }
        if ((i11 & 8) != 0) {
            f13 = P.n.m(mVar.e());
        }
        if ((i11 & 16) != 0) {
            J0.f100729b.getClass();
            i10 = J0.f100731d;
        }
        mVar.b(f10, f11, f12, f13, i10);
    }

    public static /* synthetic */ void e(m mVar, float f10, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rotate-Uv8p0NA");
        }
        if ((i10 & 2) != 0) {
            j10 = mVar.Y();
        }
        mVar.g(f10, j10);
    }

    public static /* synthetic */ void f(m mVar, float f10, float f11, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scale-0AR0LA0");
        }
        if ((i10 & 4) != 0) {
            j10 = mVar.Y();
        }
        mVar.f(f10, f11, j10);
    }

    public static /* synthetic */ void g(m mVar, float f10, float f11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: translate");
        }
        if ((i10 & 1) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        mVar.c(f10, f11);
    }
}
