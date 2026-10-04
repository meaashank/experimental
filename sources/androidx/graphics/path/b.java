package androidx.graphics.path;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.graphics.path.PathIterator;
import androidx.graphics.path.PathSegment;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@V({"SMAP\nPathIteratorImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathIteratorImpl.kt\nandroidx/graphics/path/PathIteratorImpl\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,304:1\n26#2:305\n*S KotlinDebug\n*F\n+ 1 PathIteratorImpl.kt\nandroidx/graphics/path/PathIteratorImpl\n*L\n104#1:305\n*E\n"})
public abstract class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f113922e = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Path f113923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final PathIterator.ConicEvaluation f113924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f113925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final float[] f113926d;

    public static final class a {
        public a() {
        }

        public a(C4969v c4969v) {
        }
    }

    /* JADX INFO: renamed from: androidx.graphics.path.b$b, reason: collision with other inner class name */
    public /* synthetic */ class C0300b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f113927a;

        static {
            int[] iArr = new int[PathSegment.Type.values().length];
            try {
                iArr[PathSegment.Type.Move.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PathSegment.Type.Line.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PathSegment.Type.Quadratic.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PathSegment.Type.Conic.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PathSegment.Type.Cubic.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f113927a = iArr;
        }
    }

    static {
        System.loadLibrary("androidx.graphics.path");
    }

    public b(@NotNull Path path, @NotNull PathIterator.ConicEvaluation conicEvaluation, float f10) {
        G.p(path, "path");
        G.p(conicEvaluation, "conicEvaluation");
        this.f113923a = path;
        this.f113924b = conicEvaluation;
        this.f113925c = f10;
        this.f113926d = new float[8];
    }

    public static /* synthetic */ PathSegment.Type i(b bVar, float[] fArr, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: next");
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return bVar.g(fArr, i10);
    }

    public abstract int a(boolean z10);

    public final PointF[] b(float[] fArr, PathSegment.Type type) {
        int i10 = C0300b.f113927a[type.ordinal()];
        return i10 != 1 ? i10 != 2 ? (i10 == 3 || i10 == 4) ? new PointF[]{new PointF(fArr[0], fArr[1]), new PointF(fArr[2], fArr[3]), new PointF(fArr[4], fArr[5])} : i10 != 5 ? new PointF[0] : new PointF[]{new PointF(fArr[0], fArr[1]), new PointF(fArr[2], fArr[3]), new PointF(fArr[4], fArr[5]), new PointF(fArr[6], fArr[7])} : new PointF[]{new PointF(fArr[0], fArr[1]), new PointF(fArr[2], fArr[3])} : new PointF[]{new PointF(fArr[0], fArr[1])};
    }

    @NotNull
    public final PathIterator.ConicEvaluation c() {
        return this.f113924b;
    }

    @NotNull
    public final Path d() {
        return this.f113923a;
    }

    public final float e() {
        return this.f113925c;
    }

    public abstract boolean f();

    @NotNull
    public abstract PathSegment.Type g(@NotNull float[] fArr, int i10);

    @NotNull
    public final PathSegment h() {
        PathSegment.Type typeG = g(this.f113926d, 0);
        if (typeG == PathSegment.Type.Done) {
            return d.b();
        }
        if (typeG == PathSegment.Type.Close) {
            return d.a();
        }
        return new PathSegment(typeG, b(this.f113926d, typeG), typeG == PathSegment.Type.Conic ? this.f113926d[6] : 0.0f);
    }

    @NotNull
    public abstract PathSegment.Type j();

    public /* synthetic */ b(Path path, PathIterator.ConicEvaluation conicEvaluation, float f10, int i10, C4969v c4969v) {
        this(path, (i10 & 2) != 0 ? PathIterator.ConicEvaluation.AsQuadratics : conicEvaluation, (i10 & 4) != 0 ? 0.25f : f10);
    }
}
