package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathIterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.v2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2117v2 {
    static {
        Path.a aVar = Path.f100789a;
    }

    public static /* synthetic */ void A(Path path, P.j jVar, Path.Direction direction, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addRect");
        }
        if ((i10 & 2) != 0) {
            direction = Path.Direction.CounterClockwise;
        }
        path.d(jVar, direction);
    }

    public static /* synthetic */ void B(Path path, P.l lVar, Path.Direction direction, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addRoundRect");
        }
        if ((i10 & 2) != 0) {
            direction = Path.Direction.CounterClockwise;
        }
        path.A(lVar, direction);
    }

    public static /* synthetic */ PathIterator C(Path path, PathIterator.ConicEvaluation conicEvaluation, float f10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: iterator");
        }
        if ((i10 & 2) != 0) {
            f10 = 0.25f;
        }
        return path.w(conicEvaluation, f10);
    }

    @NotNull
    public static Path a(Path path, @NotNull Path path2) {
        Path pathA = C2031g0.a();
        F2.f100685b.getClass();
        ((Z) pathA).F(path, path2, F2.f100687d);
        return pathA;
    }

    public static void b(Path path, @NotNull P.j jVar, float f10, float f11, boolean z10) {
        path.h(jVar, f10 * 57.29578f, f11 * 57.29578f, z10);
    }

    @NotNull
    public static PathIterator c(Path path) {
        return C2019d0.b(path, null, 0.0f, 6, null);
    }

    @NotNull
    public static PathIterator d(Path path, @NotNull PathIterator.ConicEvaluation conicEvaluation, float f10) {
        return new C2010c0(path, conicEvaluation, f10);
    }

    @NotNull
    public static Path e(Path path, @NotNull Path path2) {
        Path pathA = C2031g0.a();
        F2.f100685b.getClass();
        ((Z) pathA).F(path, path2, F2.f100686c);
        return pathA;
    }

    @NotNull
    public static Path f(Path path, @NotNull Path path2) {
        return path.b(path2);
    }

    @NotNull
    public static Path g(Path path, @NotNull Path path2) {
        Path pathA = C2031g0.a();
        F2.f100685b.getClass();
        ((Z) pathA).F(path, path2, F2.f100688e);
        return pathA;
    }

    public static void h(Path path, float f10, float f11, float f12, float f13) {
        path.v(f10, f11, f12, f13);
    }

    public static void i(Path path, float f10, float f11, float f12, float f13) {
        path.g(f10, f11, f12, f13);
    }

    public static void j(Path path) {
        path.reset();
    }

    @NotNull
    public static Path l(Path path, @NotNull Path path2) {
        Path pathA = C2031g0.a();
        F2.f100685b.getClass();
        ((Z) pathA).F(path, path2, F2.f100689f);
        return pathA;
    }

    public static PathIterator p(Path path, PathIterator.ConicEvaluation conicEvaluation, float f10) {
        return new C2010c0(path, conicEvaluation, f10);
    }

    public static Path r(Path path, Path path2) {
        return path.b(path2);
    }

    public static void t(Path path, float f10, float f11, float f12, float f13) {
        path.v(f10, f11, f12, f13);
    }

    public static void u(Path path, float f10, float f11, float f12, float f13) {
        path.g(f10, f11, f12, f13);
    }

    public static void v(Path path) {
        path.reset();
    }

    public static /* synthetic */ void y(Path path, P.j jVar, Path.Direction direction, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addOval");
        }
        if ((i10 & 2) != 0) {
            direction = Path.Direction.CounterClockwise;
        }
        path.f(jVar, direction);
    }

    public static void z(Path path, Path path2, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addPath-Uv8p0NA");
        }
        if ((i10 & 2) != 0) {
            P.g.f65503b.getClass();
            j10 = P.g.f65504c;
        }
        path.r(path2, j10);
    }

    public static void k(Path path, @NotNull float[] fArr) {
    }

    public static /* synthetic */ void w(Path path, float[] fArr) {
    }
}
