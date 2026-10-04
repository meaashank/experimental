package androidx.graphics.path;

import android.graphics.Path;
import android.os.Build;
import androidx.graphics.path.PathSegment;
import dd.k;
import fd.InterfaceC4418a;
import java.util.Iterator;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class PathIterator implements Iterator<PathSegment>, InterfaceC4418a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Path f113912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ConicEvaluation f113913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f113914c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final b f113915d;

    public enum ConicEvaluation {
        AsConic,
        AsQuadratics
    }

    public PathIterator(@NotNull Path path, @NotNull ConicEvaluation conicEvaluation, float f10) {
        G.p(path, "path");
        G.p(conicEvaluation, "conicEvaluation");
        this.f113912a = path;
        this.f113913b = conicEvaluation;
        this.f113914c = f10;
        this.f113915d = Build.VERSION.SDK_INT >= 34 ? new a(path, conicEvaluation, f10) : new PathIteratorPreApi34Impl(path, conicEvaluation, f10);
    }

    public static int b(PathIterator pathIterator, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return pathIterator.f113915d.a(z10);
    }

    public static /* synthetic */ PathSegment.Type i(PathIterator pathIterator, float[] fArr, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return pathIterator.g(fArr, i10);
    }

    public final float C0() {
        return this.f113914c;
    }

    @NotNull
    public final ConicEvaluation d() {
        return this.f113913b;
    }

    @NotNull
    public final Path e() {
        return this.f113912a;
    }

    @k
    @NotNull
    public final PathSegment.Type f(@NotNull float[] points) {
        G.p(points, "points");
        return g(points, 0);
    }

    @k
    @NotNull
    public final PathSegment.Type g(@NotNull float[] points, int i10) {
        G.p(points, "points");
        return this.f113915d.g(points, i10);
    }

    @NotNull
    public PathSegment h() {
        return this.f113915d.h();
    }

    public final int h2(boolean z10) {
        return this.f113915d.a(z10);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f113915d.f();
    }

    @NotNull
    public final PathSegment.Type j() {
        return this.f113915d.j();
    }

    @Override // java.util.Iterator
    public PathSegment next() {
        return this.f113915d.h();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ PathIterator(Path path, ConicEvaluation conicEvaluation, float f10, int i10, C4969v c4969v) {
        this(path, (i10 & 2) != 0 ? ConicEvaluation.AsQuadratics : conicEvaluation, (i10 & 4) != 0 ? 0.25f : f10);
    }
}
