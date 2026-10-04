package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.PathIterator;
import androidx.compose.ui.graphics.PathSegment;
import androidx.graphics.path.PathIterator;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nAndroidPathIterator.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPathIterator.android.kt\nandroidx/compose/ui/graphics/AndroidPathIterator\n+ 2 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n*L\n1#1,86:1\n38#2,5:87\n*S KotlinDebug\n*F\n+ 1 AndroidPathIterator.android.kt\nandroidx/compose/ui/graphics/AndroidPathIterator\n*L\n37#1:87,5\n*E\n"})
public final class C2010c0 implements PathIterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Path f100935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final PathIterator.ConicEvaluation f100936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f100937c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final float[] f100938d = new float[8];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final androidx.graphics.path.PathIterator f100939e;

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.c0$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f100940a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f100941b;

        static {
            int[] iArr = new int[PathIterator.ConicEvaluation.values().length];
            try {
                iArr[PathIterator.ConicEvaluation.AsConic.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PathIterator.ConicEvaluation.AsQuadratics.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f100940a = iArr;
            int[] iArr2 = new int[PathSegment.Type.values().length];
            try {
                iArr2[PathSegment.Type.Move.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[PathSegment.Type.Line.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[PathSegment.Type.Quadratic.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[PathSegment.Type.Conic.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[PathSegment.Type.Cubic.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            f100941b = iArr2;
        }
    }

    public C2010c0(@NotNull Path path, @NotNull PathIterator.ConicEvaluation conicEvaluation, float f10) {
        PathIterator.ConicEvaluation conicEvaluation2;
        this.f100935a = path;
        this.f100936b = conicEvaluation;
        this.f100937c = f10;
        if (!(path instanceof Z)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        android.graphics.Path path2 = ((Z) path).f100925b;
        int i10 = a.f100940a[conicEvaluation.ordinal()];
        if (i10 == 1) {
            conicEvaluation2 = PathIterator.ConicEvaluation.AsConic;
        } else {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            conicEvaluation2 = PathIterator.ConicEvaluation.AsQuadratics;
        }
        this.f100939e = new androidx.graphics.path.PathIterator(path2, conicEvaluation2, f10);
    }

    @Override // androidx.compose.ui.graphics.PathIterator
    public float C0() {
        return this.f100937c;
    }

    @Override // androidx.compose.ui.graphics.PathIterator
    @NotNull
    public PathIterator.ConicEvaluation N0() {
        return this.f100936b;
    }

    @Override // androidx.compose.ui.graphics.PathIterator
    @NotNull
    public PathSegment.Type X0(@NotNull float[] fArr, int i10) {
        return C2019d0.d(this.f100939e.g(fArr, i10));
    }

    @Override // androidx.compose.ui.graphics.PathIterator
    @NotNull
    public Path getPath() {
        return this.f100935a;
    }

    @Override // androidx.compose.ui.graphics.PathIterator
    public int h2(boolean z10) {
        return this.f100939e.f113915d.a(z10);
    }

    @Override // androidx.compose.ui.graphics.PathIterator, java.util.Iterator
    public boolean hasNext() {
        return this.f100939e.f113915d.f();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bf  */
    @Override // java.util.Iterator
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public androidx.compose.ui.graphics.PathSegment next() {
        /*
            r11 = this;
            float[] r0 = r11.f100938d
            androidx.graphics.path.PathIterator r1 = r11.f100939e
            r2 = 0
            androidx.graphics.path.PathSegment$Type r1 = r1.g(r0, r2)
            androidx.compose.ui.graphics.PathSegment$Type r1 = androidx.compose.ui.graphics.C2019d0.d(r1)
            androidx.compose.ui.graphics.PathSegment$Type r3 = androidx.compose.ui.graphics.PathSegment.Type.Done
            if (r1 != r3) goto L16
            androidx.compose.ui.graphics.PathSegment r0 = androidx.compose.ui.graphics.H2.b()
            return r0
        L16:
            androidx.compose.ui.graphics.PathSegment$Type r3 = androidx.compose.ui.graphics.PathSegment.Type.Close
            if (r1 != r3) goto L1f
            androidx.compose.ui.graphics.PathSegment r0 = androidx.compose.ui.graphics.H2.a()
            return r0
        L1f:
            int[] r3 = androidx.compose.ui.graphics.C2010c0.a.f100941b
            int r4 = r1.ordinal()
            r3 = r3[r4]
            r4 = 6
            r5 = 2
            r6 = 1
            if (r3 == r6) goto Lab
            r7 = 4
            r8 = 3
            if (r3 == r5) goto L98
            r9 = 5
            if (r3 == r8) goto L7d
            if (r3 == r7) goto L62
            if (r3 == r9) goto L3b
            float[] r2 = new float[r2]
            goto Lb6
        L3b:
            r3 = 8
            float[] r3 = new float[r3]
            r10 = r0[r2]
            r3[r2] = r10
            r2 = r0[r6]
            r3[r6] = r2
            r2 = r0[r5]
            r3[r5] = r2
            r2 = r0[r8]
            r3[r8] = r2
            r2 = r0[r7]
            r3[r7] = r2
            r2 = r0[r9]
            r3[r9] = r2
            r2 = r0[r4]
            r3[r4] = r2
            r2 = 7
            r5 = r0[r2]
            r3[r2] = r5
        L60:
            r2 = r3
            goto Lb6
        L62:
            float[] r3 = new float[r4]
            r10 = r0[r2]
            r3[r2] = r10
            r2 = r0[r6]
            r3[r6] = r2
            r2 = r0[r5]
            r3[r5] = r2
            r2 = r0[r8]
            r3[r8] = r2
            r2 = r0[r7]
            r3[r7] = r2
            r2 = r0[r9]
            r3[r9] = r2
            goto L60
        L7d:
            float[] r3 = new float[r4]
            r10 = r0[r2]
            r3[r2] = r10
            r2 = r0[r6]
            r3[r6] = r2
            r2 = r0[r5]
            r3[r5] = r2
            r2 = r0[r8]
            r3[r8] = r2
            r2 = r0[r7]
            r3[r7] = r2
            r2 = r0[r9]
            r3[r9] = r2
            goto L60
        L98:
            float[] r3 = new float[r7]
            r7 = r0[r2]
            r3[r2] = r7
            r2 = r0[r6]
            r3[r6] = r2
            r2 = r0[r5]
            r3[r5] = r2
            r2 = r0[r8]
            r3[r8] = r2
            goto L60
        Lab:
            float[] r3 = new float[r5]
            r5 = r0[r2]
            r3[r2] = r5
            r2 = r0[r6]
            r3[r6] = r2
            goto L60
        Lb6:
            androidx.compose.ui.graphics.PathSegment r3 = new androidx.compose.ui.graphics.PathSegment
            androidx.compose.ui.graphics.PathSegment$Type r5 = androidx.compose.ui.graphics.PathSegment.Type.Conic
            if (r1 != r5) goto Lbf
            r0 = r0[r4]
            goto Lc0
        Lbf:
            r0 = 0
        Lc0:
            r3.<init>(r1, r2, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.C2010c0.next():androidx.compose.ui.graphics.PathSegment");
    }
}
