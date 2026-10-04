package androidx.graphics.path;

import android.graphics.Path;
import androidx.graphics.path.PathIterator;
import androidx.graphics.path.PathSegment;
import dalvik.annotation.optimization.FastNative;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class PathIteratorPreApi34Impl extends b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f113916f;

    public /* synthetic */ PathIteratorPreApi34Impl(Path path, PathIterator.ConicEvaluation conicEvaluation, float f10, int i10, C4969v c4969v) {
        this(path, (i10 & 2) != 0 ? PathIterator.ConicEvaluation.AsQuadratics : conicEvaluation, (i10 & 4) != 0 ? 0.25f : f10);
    }

    private final native long createInternalPathIterator(Path path, int i10, float f10);

    private final native void destroyInternalPathIterator(long j10);

    @FastNative
    private final native boolean internalPathIteratorHasNext(long j10);

    @FastNative
    private final native int internalPathIteratorNext(long j10, float[] fArr, int i10);

    @FastNative
    private final native int internalPathIteratorPeek(long j10);

    @FastNative
    private final native int internalPathIteratorRawSize(long j10);

    @FastNative
    private final native int internalPathIteratorSize(long j10);

    @Override // androidx.graphics.path.b
    public int a(boolean z10) {
        return (!z10 || this.f113924b == PathIterator.ConicEvaluation.AsConic) ? internalPathIteratorRawSize(this.f113916f) : internalPathIteratorSize(this.f113916f);
    }

    @Override // androidx.graphics.path.b
    public boolean f() {
        return internalPathIteratorHasNext(this.f113916f);
    }

    public final void finalize() {
        destroyInternalPathIterator(this.f113916f);
    }

    @Override // androidx.graphics.path.b
    @NotNull
    public PathSegment.Type g(@NotNull float[] points, int i10) {
        G.p(points, "points");
        return c.f113928a[internalPathIteratorNext(this.f113916f, points, i10)];
    }

    @Override // androidx.graphics.path.b
    @NotNull
    public PathSegment.Type j() {
        return c.f113928a[internalPathIteratorPeek(this.f113916f)];
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PathIteratorPreApi34Impl(@NotNull Path path, @NotNull PathIterator.ConicEvaluation conicEvaluation, float f10) {
        super(path, conicEvaluation, f10);
        G.p(path, "path");
        G.p(conicEvaluation, "conicEvaluation");
        this.f113916f = createInternalPathIterator(path, conicEvaluation.ordinal(), f10);
    }
}
