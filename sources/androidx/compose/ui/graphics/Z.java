package androidx.compose.ui.graphics;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.compose.ui.graphics.F2;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathIterator;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nAndroidPath.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath\n+ 2 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n*L\n1#1,286:1\n38#2,5:287\n38#2,5:292\n*S KotlinDebug\n*F\n+ 1 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath\n*L\n205#1:287,5\n258#1:292,5\n*E\n"})
public final class Z implements Path {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final android.graphics.Path f100925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public RectF f100926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public float[] f100927d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Matrix f100928e;

    /* JADX WARN: Multi-variable type inference failed */
    public Z() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ void I() {
    }

    @Override // androidx.compose.ui.graphics.Path
    public void A(@NotNull P.l lVar, @NotNull Path.Direction direction) {
        if (this.f100926c == null) {
            this.f100926c = new RectF();
        }
        RectF rectF = this.f100926c;
        kotlin.jvm.internal.G.m(rectF);
        rectF.set(lVar.f65518a, lVar.f65519b, lVar.f65520c, lVar.f65521d);
        if (this.f100927d == null) {
            this.f100927d = new float[8];
        }
        float[] fArr = this.f100927d;
        kotlin.jvm.internal.G.m(fArr);
        fArr[0] = P.a.m(lVar.f65522e);
        fArr[1] = P.a.o(lVar.f65522e);
        fArr[2] = P.a.m(lVar.f65523f);
        fArr[3] = P.a.o(lVar.f65523f);
        fArr[4] = P.a.m(lVar.f65524g);
        fArr[5] = P.a.o(lVar.f65524g);
        fArr[6] = P.a.m(lVar.f65525h);
        fArr[7] = P.a.o(lVar.f65525h);
        android.graphics.Path path = this.f100925b;
        RectF rectF2 = this.f100926c;
        kotlin.jvm.internal.G.m(rectF2);
        float[] fArr2 = this.f100927d;
        kotlin.jvm.internal.G.m(fArr2);
        path.addRoundRect(rectF2, fArr2, C2031g0.f(direction));
    }

    @Override // androidx.compose.ui.graphics.Path
    public void B(@NotNull P.j jVar, float f10, float f11) {
        J(jVar);
        if (this.f100926c == null) {
            this.f100926c = new RectF();
        }
        RectF rectF = this.f100926c;
        kotlin.jvm.internal.G.m(rectF);
        rectF.set(jVar.f65511a, jVar.f65512b, jVar.f65513c, jVar.f65514d);
        android.graphics.Path path = this.f100925b;
        RectF rectF2 = this.f100926c;
        kotlin.jvm.internal.G.m(rectF2);
        path.addArc(rectF2, f10, f11);
    }

    @Override // androidx.compose.ui.graphics.Path
    public /* synthetic */ Path C(Path path) {
        return C2117v2.l(this, path);
    }

    @Override // androidx.compose.ui.graphics.Path
    public /* synthetic */ void D(P.j jVar) {
        d(jVar, Path.Direction.CounterClockwise);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void E(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f100925b.cubicTo(f10, f11, f12, f13, f14, f15);
    }

    @Override // androidx.compose.ui.graphics.Path
    public boolean F(@NotNull Path path, @NotNull Path path2, int i10) {
        Path.Op op;
        F2.a aVar = F2.f100685b;
        aVar.getClass();
        if (i10 == F2.f100686c) {
            op = Path.Op.DIFFERENCE;
        } else {
            aVar.getClass();
            if (i10 == F2.f100687d) {
                op = Path.Op.INTERSECT;
            } else {
                aVar.getClass();
                if (i10 == F2.f100690g) {
                    op = Path.Op.REVERSE_DIFFERENCE;
                } else {
                    aVar.getClass();
                    op = i10 == F2.f100688e ? Path.Op.UNION : Path.Op.XOR;
                }
            }
        }
        android.graphics.Path path3 = this.f100925b;
        if (!(path instanceof Z)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        android.graphics.Path path4 = ((Z) path).f100925b;
        if (path2 instanceof Z) {
            return path3.op(path4, ((Z) path2).f100925b, op);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // androidx.compose.ui.graphics.Path
    public void G(float f10, float f11) {
        this.f100925b.rLineTo(f10, f11);
    }

    @NotNull
    public final android.graphics.Path H() {
        return this.f100925b;
    }

    public final void J(P.j jVar) {
        if (Float.isNaN(jVar.f65511a) || Float.isNaN(jVar.f65512b) || Float.isNaN(jVar.f65513c) || Float.isNaN(jVar.f65514d)) {
            C2031g0.e("Invalid rectangle, make sure no value is NaN");
            throw null;
        }
    }

    @Override // androidx.compose.ui.graphics.Path
    public void a(@NotNull float[] fArr) {
        if (this.f100928e == null) {
            this.f100928e = new Matrix();
        }
        Matrix matrix = this.f100928e;
        kotlin.jvm.internal.G.m(matrix);
        W.a(matrix, fArr);
        android.graphics.Path path = this.f100925b;
        Matrix matrix2 = this.f100928e;
        kotlin.jvm.internal.G.m(matrix2);
        path.transform(matrix2);
    }

    @Override // androidx.compose.ui.graphics.Path
    public /* synthetic */ Path b(Path path) {
        return C2117v2.g(this, path);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void c(float f10, float f11) {
        this.f100925b.rMoveTo(f10, f11);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void close() {
        this.f100925b.close();
    }

    @Override // androidx.compose.ui.graphics.Path
    public void d(@NotNull P.j jVar, @NotNull Path.Direction direction) {
        J(jVar);
        if (this.f100926c == null) {
            this.f100926c = new RectF();
        }
        RectF rectF = this.f100926c;
        kotlin.jvm.internal.G.m(rectF);
        rectF.set(jVar.f65511a, jVar.f65512b, jVar.f65513c, jVar.f65514d);
        android.graphics.Path path = this.f100925b;
        RectF rectF2 = this.f100926c;
        kotlin.jvm.internal.G.m(rectF2);
        path.addRect(rectF2, C2031g0.f(direction));
    }

    @Override // androidx.compose.ui.graphics.Path
    public void e(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f100925b.rCubicTo(f10, f11, f12, f13, f14, f15);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void f(@NotNull P.j jVar, @NotNull Path.Direction direction) {
        if (this.f100926c == null) {
            this.f100926c = new RectF();
        }
        RectF rectF = this.f100926c;
        kotlin.jvm.internal.G.m(rectF);
        rectF.set(jVar.f65511a, jVar.f65512b, jVar.f65513c, jVar.f65514d);
        android.graphics.Path path = this.f100925b;
        RectF rectF2 = this.f100926c;
        kotlin.jvm.internal.G.m(rectF2);
        path.addOval(rectF2, C2031g0.f(direction));
    }

    @Override // androidx.compose.ui.graphics.Path
    public void g(float f10, float f11, float f12, float f13) {
        this.f100925b.rQuadTo(f10, f11, f12, f13);
    }

    @Override // androidx.compose.ui.graphics.Path
    @NotNull
    public P.j getBounds() {
        if (this.f100926c == null) {
            this.f100926c = new RectF();
        }
        RectF rectF = this.f100926c;
        kotlin.jvm.internal.G.m(rectF);
        this.f100925b.computeBounds(rectF, true);
        return new P.j(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void h(@NotNull P.j jVar, float f10, float f11, boolean z10) {
        float f12 = jVar.f65511a;
        float f13 = jVar.f65512b;
        float f14 = jVar.f65513c;
        float f15 = jVar.f65514d;
        if (this.f100926c == null) {
            this.f100926c = new RectF();
        }
        RectF rectF = this.f100926c;
        kotlin.jvm.internal.G.m(rectF);
        rectF.set(f12, f13, f14, f15);
        android.graphics.Path path = this.f100925b;
        RectF rectF2 = this.f100926c;
        kotlin.jvm.internal.G.m(rectF2);
        path.arcTo(rectF2, f10, f11, z10);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void i(long j10) {
        Matrix matrix = this.f100928e;
        if (matrix == null) {
            this.f100928e = new Matrix();
        } else {
            kotlin.jvm.internal.G.m(matrix);
            matrix.reset();
        }
        Matrix matrix2 = this.f100928e;
        kotlin.jvm.internal.G.m(matrix2);
        matrix2.setTranslate(P.g.p(j10), P.g.r(j10));
        android.graphics.Path path = this.f100925b;
        Matrix matrix3 = this.f100928e;
        kotlin.jvm.internal.G.m(matrix3);
        path.transform(matrix3);
    }

    @Override // androidx.compose.ui.graphics.Path
    public boolean isEmpty() {
        return this.f100925b.isEmpty();
    }

    @Override // androidx.compose.ui.graphics.Path
    public /* synthetic */ PathIterator iterator() {
        return C2117v2.c(this);
    }

    @Override // androidx.compose.ui.graphics.Path
    public /* synthetic */ void j(P.j jVar) {
        f(jVar, Path.Direction.CounterClockwise);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void k(float f10, float f11, float f12, float f13) {
        this.f100925b.rQuadTo(f10, f11, f12, f13);
    }

    @Override // androidx.compose.ui.graphics.Path
    public /* synthetic */ Path l(Path path) {
        return C2117v2.a(this, path);
    }

    @Override // androidx.compose.ui.graphics.Path
    public /* synthetic */ void m(P.l lVar) {
        A(lVar, Path.Direction.CounterClockwise);
    }

    @Override // androidx.compose.ui.graphics.Path
    public /* synthetic */ void n(P.j jVar, float f10, float f11, boolean z10) {
        C2117v2.b(this, jVar, f10, f11, z10);
    }

    @Override // androidx.compose.ui.graphics.Path
    public /* synthetic */ Path o(Path path) {
        return C2117v2.f(this, path);
    }

    @Override // androidx.compose.ui.graphics.Path
    public int p() {
        if (this.f100925b.getFillType() == Path.FillType.EVEN_ODD) {
            C2125x2.f101785b.getClass();
            return C2125x2.f101787d;
        }
        C2125x2.f101785b.getClass();
        return C2125x2.f101786c;
    }

    @Override // androidx.compose.ui.graphics.Path
    public void q(float f10, float f11) {
        this.f100925b.moveTo(f10, f11);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void r(@NotNull Path path, long j10) {
        android.graphics.Path path2 = this.f100925b;
        if (!(path instanceof Z)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        path2.addPath(((Z) path).f100925b, P.g.p(j10), P.g.r(j10));
    }

    @Override // androidx.compose.ui.graphics.Path
    public void reset() {
        this.f100925b.reset();
    }

    @Override // androidx.compose.ui.graphics.Path
    public void rewind() {
        this.f100925b.rewind();
    }

    @Override // androidx.compose.ui.graphics.Path
    public void s(float f10, float f11) {
        this.f100925b.lineTo(f10, f11);
    }

    @Override // androidx.compose.ui.graphics.Path
    public boolean t() {
        return this.f100925b.isConvex();
    }

    @Override // androidx.compose.ui.graphics.Path
    public /* synthetic */ Path u(Path path) {
        return C2117v2.e(this, path);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void v(float f10, float f11, float f12, float f13) {
        this.f100925b.quadTo(f10, f11, f12, f13);
    }

    @Override // androidx.compose.ui.graphics.Path
    public /* synthetic */ PathIterator w(PathIterator.ConicEvaluation conicEvaluation, float f10) {
        return C2117v2.d(this, conicEvaluation, f10);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void x(int i10) {
        android.graphics.Path path = this.f100925b;
        C2125x2.f101785b.getClass();
        path.setFillType(i10 == C2125x2.f101787d ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void y(float f10, float f11, float f12, float f13) {
        this.f100925b.quadTo(f10, f11, f12, f13);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void z(@NotNull P.j jVar, float f10, float f11) {
        B(jVar, f10 * 57.29578f, f11 * 57.29578f);
    }

    public Z(@NotNull android.graphics.Path path) {
        this.f100925b = path;
    }

    public /* synthetic */ Z(android.graphics.Path path, int i10, C4969v c4969v) {
        this((i10 & 1) != 0 ? new android.graphics.Path() : path);
    }
}
