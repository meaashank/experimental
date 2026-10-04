package androidx.graphics.path;

import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class ConicConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f113909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f113910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public float[] f113911c = new float[130];

    public static /* synthetic */ void b(ConicConverter conicConverter, float[] fArr, float f10, float f11, int i10, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            i10 = 0;
        }
        conicConverter.a(fArr, f10, f11, i10);
    }

    public static /* synthetic */ boolean f(ConicConverter conicConverter, float[] fArr, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return conicConverter.e(fArr, i10);
    }

    private final native int internalConicToQuadratics(float[] fArr, int i10, float[] fArr2, float f10, float f11);

    public final void a(@NotNull float[] points, float f10, float f11, int i10) {
        G.p(points, "points");
        int iInternalConicToQuadratics = internalConicToQuadratics(points, i10, this.f113911c, f10, f11);
        this.f113909a = iInternalConicToQuadratics;
        int i11 = (iInternalConicToQuadratics * 4) + 2;
        if (i11 > this.f113911c.length) {
            float[] fArr = new float[i11];
            this.f113911c = fArr;
            this.f113909a = internalConicToQuadratics(points, i10, fArr, f10, f11);
        }
        this.f113910b = 0;
    }

    public final int c() {
        return this.f113910b;
    }

    public final int d() {
        return this.f113909a;
    }

    public final boolean e(@NotNull float[] points, int i10) {
        G.p(points, "points");
        int i11 = this.f113910b;
        if (i11 >= this.f113909a) {
            return false;
        }
        int i12 = i11 * 4;
        float[] fArr = this.f113911c;
        points[i10] = fArr[i12];
        points[i10 + 1] = fArr[i12 + 1];
        points[i10 + 2] = fArr[i12 + 2];
        points[i10 + 3] = fArr[i12 + 3];
        points[i10 + 4] = fArr[i12 + 4];
        points[i10 + 5] = fArr[i12 + 5];
        this.f113910b = i11 + 1;
        return true;
    }

    public final void g(int i10) {
        this.f113910b = i10;
    }
}
