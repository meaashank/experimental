package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.PathIterator;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4982o;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface Path {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f100789a = a.f100790a;

    public enum Direction {
        CounterClockwise,
        Clockwise
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f100790a = new a();

        @NotNull
        public final Path a(int i10, @NotNull Path path, @NotNull Path path2) {
            Path pathA = C2031g0.a();
            if (((Z) pathA).F(path, path2, i10)) {
                return pathA;
            }
            throw new IllegalArgumentException("Path.combine() failed.  This may be due an invalid path; in particular, check for NaN values.");
        }
    }

    public static final class b {
        @Deprecated
        @NotNull
        public static Path e(@NotNull Path path, @NotNull Path path2) {
            return C2117v2.a(path, path2);
        }

        @Deprecated
        public static void f(@NotNull Path path, @NotNull P.j jVar, float f10, float f11, boolean z10) {
            C2117v2.b(path, jVar, f10, f11, z10);
        }

        @Deprecated
        @NotNull
        public static PathIterator g(@NotNull Path path) {
            return C2117v2.c(path);
        }

        @Deprecated
        @NotNull
        public static PathIterator h(@NotNull Path path, @NotNull PathIterator.ConicEvaluation conicEvaluation, float f10) {
            return C2117v2.p(path, conicEvaluation, f10);
        }

        @Deprecated
        @NotNull
        public static Path j(@NotNull Path path, @NotNull Path path2) {
            return C2117v2.e(path, path2);
        }

        @Deprecated
        @NotNull
        public static Path k(@NotNull Path path, @NotNull Path path2) {
            return C2117v2.r(path, path2);
        }

        @Deprecated
        @NotNull
        public static Path l(@NotNull Path path, @NotNull Path path2) {
            return C2117v2.g(path, path2);
        }

        @Deprecated
        public static void m(@NotNull Path path, float f10, float f11, float f12, float f13) {
            C2117v2.t(path, f10, f11, f12, f13);
        }

        @Deprecated
        public static void n(@NotNull Path path, float f10, float f11, float f12, float f13) {
            C2117v2.u(path, f10, f11, f12, f13);
        }

        @Deprecated
        public static void o(@NotNull Path path) {
            C2117v2.v(path);
        }

        @Deprecated
        public static void p(@NotNull Path path, @NotNull float[] fArr) {
            C2117v2.w(path, fArr);
        }

        @Deprecated
        @NotNull
        public static Path q(@NotNull Path path, @NotNull Path path2) {
            return C2117v2.l(path, path2);
        }
    }

    void A(@NotNull P.l lVar, @NotNull Direction direction);

    void B(@NotNull P.j jVar, float f10, float f11);

    @NotNull
    Path C(@NotNull Path path);

    @InterfaceC4982o(level = DeprecationLevel.HIDDEN, message = "Prefer usage of addRect() with a winding direction", replaceWith = @InterfaceC4852c0(expression = "addRect(rect)", imports = {}))
    /* synthetic */ void D(P.j jVar);

    void E(float f10, float f11, float f12, float f13, float f14, float f15);

    boolean F(@NotNull Path path, @NotNull Path path2, int i10);

    void G(float f10, float f11);

    void a(@NotNull float[] fArr);

    @NotNull
    Path b(@NotNull Path path);

    void c(float f10, float f11);

    void close();

    void d(@NotNull P.j jVar, @NotNull Direction direction);

    void e(float f10, float f11, float f12, float f13, float f14, float f15);

    void f(@NotNull P.j jVar, @NotNull Direction direction);

    @InterfaceC4982o(level = DeprecationLevel.WARNING, message = "Use relativeQuadraticTo() for consistency with relativeCubicTo()", replaceWith = @InterfaceC4852c0(expression = "relativeQuadraticTo(dx1, dy1, dx2, dy2)", imports = {}))
    void g(float f10, float f11, float f12, float f13);

    @NotNull
    P.j getBounds();

    void h(@NotNull P.j jVar, float f10, float f11, boolean z10);

    void i(long j10);

    boolean isEmpty();

    @NotNull
    PathIterator iterator();

    @InterfaceC4982o(level = DeprecationLevel.HIDDEN, message = "Prefer usage of addOval() with a winding direction", replaceWith = @InterfaceC4852c0(expression = "addOval(oval)", imports = {}))
    /* synthetic */ void j(P.j jVar);

    void k(float f10, float f11, float f12, float f13);

    @NotNull
    Path l(@NotNull Path path);

    @InterfaceC4982o(level = DeprecationLevel.HIDDEN, message = "Prefer usage of addRoundRect() with a winding direction", replaceWith = @InterfaceC4852c0(expression = "addRoundRect(roundRect)", imports = {}))
    /* synthetic */ void m(P.l lVar);

    void n(@NotNull P.j jVar, float f10, float f11, boolean z10);

    @NotNull
    Path o(@NotNull Path path);

    int p();

    void q(float f10, float f11);

    void r(@NotNull Path path, long j10);

    void reset();

    void rewind();

    void s(float f10, float f11);

    boolean t();

    @NotNull
    Path u(@NotNull Path path);

    @InterfaceC4982o(level = DeprecationLevel.WARNING, message = "Use quadraticTo() for consistency with cubicTo()", replaceWith = @InterfaceC4852c0(expression = "quadraticTo(x1, y1, x2, y2)", imports = {}))
    void v(float f10, float f11, float f12, float f13);

    @NotNull
    PathIterator w(@NotNull PathIterator.ConicEvaluation conicEvaluation, float f10);

    void x(int i10);

    void y(float f10, float f11, float f12, float f13);

    void z(@NotNull P.j jVar, float f10, float f11);
}
