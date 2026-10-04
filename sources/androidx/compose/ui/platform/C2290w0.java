package androidx.compose.ui.platform;

import android.graphics.Matrix;
import androidx.compose.ui.graphics.C2086n2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.ui.platform.w0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class C2290w0<T> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f103936i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ed.p<T, Matrix, kotlin.L0> f103937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Matrix f103938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Matrix f103939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public float[] f103940d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public float[] f103941e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f103942f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f103943g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f103944h = true;

    /* JADX WARN: Multi-variable type inference failed */
    public C2290w0(@NotNull ed.p<? super T, ? super Matrix, kotlin.L0> pVar) {
        this.f103937a = pVar;
    }

    @Nullable
    public final float[] a(T t10) {
        float[] fArrC = this.f103941e;
        if (fArrC == null) {
            fArrC = C2086n2.c(null, 1, null);
            this.f103941e = fArrC;
        }
        if (this.f103943g) {
            this.f103944h = C2284u0.a(b(t10), fArrC);
            this.f103943g = false;
        }
        if (this.f103944h) {
            return fArrC;
        }
        return null;
    }

    @NotNull
    public final float[] b(T t10) {
        float[] fArrC = this.f103940d;
        if (fArrC == null) {
            fArrC = C2086n2.c(null, 1, null);
            this.f103940d = fArrC;
        }
        if (!this.f103942f) {
            return fArrC;
        }
        Matrix matrix = this.f103938b;
        if (matrix == null) {
            matrix = new Matrix();
            this.f103938b = matrix;
        }
        this.f103937a.invoke(t10, matrix);
        Matrix matrix2 = this.f103939c;
        if (matrix2 == null || !matrix.equals(matrix2)) {
            androidx.compose.ui.graphics.W.b(fArrC, matrix);
            this.f103938b = matrix2;
            this.f103939c = matrix;
        }
        this.f103942f = false;
        return fArrC;
    }

    public final void c() {
        this.f103942f = true;
        this.f103943g = true;
    }
}
