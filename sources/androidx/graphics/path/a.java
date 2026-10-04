package androidx.graphics.path;

import android.graphics.Path;
import androidx.graphics.path.PathIterator;
import androidx.graphics.path.PathSegment;
import e.T;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@T(34)
public final class a extends b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final android.graphics.PathIterator f113920f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final ConicConverter f113921g;

    public /* synthetic */ a(Path path, PathIterator.ConicEvaluation conicEvaluation, float f10, int i10, C4969v c4969v) {
        this(path, (i10 & 2) != 0 ? PathIterator.ConicEvaluation.AsQuadratics : conicEvaluation, (i10 & 4) != 0 ? 0.25f : f10);
    }

    @Override // androidx.graphics.path.b
    public int a(boolean z10) {
        boolean z11 = z10 && this.f113924b == PathIterator.ConicEvaluation.AsQuadratics;
        android.graphics.PathIterator pathIterator = this.f113923a.getPathIterator();
        G.o(pathIterator, "path.pathIterator");
        float[] fArr = new float[8];
        int i10 = 0;
        while (pathIterator.hasNext()) {
            if (pathIterator.next(fArr, 0) == 3 && z11) {
                ConicConverter conicConverter = this.f113921g;
                ConicConverter.b(conicConverter, fArr, fArr[6], this.f113925c, 0, 8, null);
                i10 += conicConverter.f113909a;
            } else {
                i10++;
            }
        }
        return i10;
    }

    @Override // androidx.graphics.path.b
    public boolean f() {
        return this.f113920f.hasNext();
    }

    @Override // androidx.graphics.path.b
    @NotNull
    public PathSegment.Type g(@NotNull float[] points, int i10) {
        G.p(points, "points");
        ConicConverter conicConverter = this.f113921g;
        if (conicConverter.f113910b < conicConverter.f113909a) {
            conicConverter.e(points, i10);
            return PathSegment.Type.Quadratic;
        }
        PathSegment.Type typeC = c.c(this.f113920f.next(points, i10));
        if (typeC != PathSegment.Type.Conic || this.f113924b != PathIterator.ConicEvaluation.AsQuadratics) {
            return typeC;
        }
        ConicConverter conicConverter2 = this.f113921g;
        conicConverter2.a(points, points[i10 + 6], this.f113925c, i10);
        if (conicConverter2.f113909a > 0) {
            conicConverter2.e(points, i10);
        }
        return PathSegment.Type.Quadratic;
    }

    @Override // androidx.graphics.path.b
    @NotNull
    public PathSegment.Type j() {
        return c.c(this.f113920f.peek());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull Path path, @NotNull PathIterator.ConicEvaluation conicEvaluation, float f10) {
        super(path, conicEvaluation, f10);
        G.p(path, "path");
        G.p(conicEvaluation, "conicEvaluation");
        android.graphics.PathIterator pathIterator = path.getPathIterator();
        G.o(pathIterator, "path.pathIterator");
        this.f113920f = pathIterator;
        this.f113921g = new ConicConverter();
    }
}
