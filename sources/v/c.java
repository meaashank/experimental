package V;

import P.g;
import androidx.compose.ui.i;
import androidx.compose.ui.input.pointer.A;
import androidx.compose.ui.input.pointer.C2140g;
import androidx.compose.ui.input.pointer.r;
import java.util.List;
import kotlin.collections.C4875q;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nVelocityTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VelocityTracker.kt\nandroidx/compose/ui/input/pointer/util/VelocityTrackerKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,734:1\n696#1:747\n703#1,2:748\n699#1,6:750\n696#1:756\n696#1:757\n691#1:758\n677#1:760\n677#1:761\n33#2,6:735\n33#2,6:741\n78#3:759\n*S KotlinDebug\n*F\n+ 1 VelocityTracker.kt\nandroidx/compose/ui/input/pointer/util/VelocityTrackerKt\n*L\n498#1:747\n500#1:748,2\n502#1:750,6\n509#1:756\n511#1:757\n524#1:758\n661#1:760\n667#1:761\n396#1:735,6\n432#1:741,6\n524#1:759\n*E\n"})
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f74447a = 40;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f74448b = 20;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f74449c = 100;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f74450d = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f74451e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f74452f;

    public static final float[][] a(int i10, int i11) {
        float[][] fArr = new float[i10][];
        for (int i12 = 0; i12 < i10; i12++) {
            fArr[i12] = new float[i11];
        }
        return fArr;
    }

    public static final void d(@NotNull androidx.compose.ui.input.pointer.util.a aVar, @NotNull A a10) {
        if (f74451e) {
            f(aVar, a10);
        } else {
            e(aVar, a10);
        }
    }

    public static final void e(androidx.compose.ui.input.pointer.util.a aVar, A a10) {
        if (r.c(a10)) {
            aVar.f102346d = a10.f102148c;
            aVar.g();
        }
        long j10 = a10.f102152g;
        List<C2140g> listP = a10.p();
        int size = listP.size();
        int i10 = 0;
        while (i10 < size) {
            C2140g c2140g = listP.get(i10);
            long jU = g.u(c2140g.f102287b, j10);
            long j11 = c2140g.f102287b;
            long jV = g.v(aVar.f102346d, jU);
            aVar.f102346d = jV;
            aVar.a(c2140g.f102286a, jV);
            i10++;
            j10 = j11;
        }
        long jV2 = g.v(aVar.f102346d, g.u(a10.f102148c, j10));
        aVar.f102346d = jV2;
        aVar.a(a10.f102147b, jV2);
    }

    public static final void f(androidx.compose.ui.input.pointer.util.a aVar, A a10) {
        if (r.c(a10)) {
            aVar.g();
        }
        if (!r.e(a10)) {
            List<C2140g> listP = a10.p();
            int size = listP.size();
            for (int i10 = 0; i10 < size; i10++) {
                C2140g c2140g = listP.get(i10);
                aVar.a(c2140g.f102286a, c2140g.f102288c);
            }
            aVar.a(a10.f102147b, a10.f102157l);
        }
        if (r.e(a10) && a10.f102147b - aVar.f102347e > 40) {
            aVar.g();
        }
        aVar.f102347e = a10.f102147b;
    }

    public static final float g(float[] fArr, float[] fArr2, int i10, boolean z10) {
        int i11 = i10 - 1;
        float f10 = fArr2[i11];
        float f11 = 0.0f;
        int i12 = i11;
        while (i12 > 0) {
            int i13 = i12 - 1;
            float f12 = fArr2[i13];
            if (f10 != f12) {
                float f13 = (z10 ? -fArr[i13] : fArr[i12] - fArr[i13]) / (f10 - f12);
                float fAbs = (Math.abs(f13) * (f13 - (Math.signum(f11) * ((float) Math.sqrt(Math.abs(f11) * 2))))) + f11;
                if (i12 == i11) {
                    fAbs *= 0.5f;
                }
                f11 = fAbs;
            }
            i12--;
            f10 = f12;
        }
        return Math.signum(f11) * ((float) Math.sqrt(Math.abs(f11) * 2));
    }

    public static final float h(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < length; i10++) {
            f10 += fArr[i10] * fArr2[i10];
        }
        return f10;
    }

    public static final float i(float[][] fArr, int i10, int i11) {
        return fArr[i10][i11];
    }

    @i
    public static final boolean j() {
        return f74451e;
    }

    @i
    public static final boolean l() {
        return f74452f;
    }

    public static final float n(float f10) {
        return Math.signum(f10) * ((float) Math.sqrt(Math.abs(f10) * 2));
    }

    public static final float o(float[] fArr) {
        return (float) Math.sqrt(h(fArr, fArr));
    }

    @NotNull
    public static final float[] p(@NotNull float[] fArr, @NotNull float[] fArr2, int i10, int i11, @NotNull float[] fArr3) {
        int i12 = i11;
        if (i12 < 1) {
            W.a.f("The degree must be at positive integer");
            throw null;
        }
        if (i10 == 0) {
            W.a.f("At least one point must be provided");
            throw null;
        }
        if (i12 >= i10) {
            i12 = i10 - 1;
        }
        int i13 = i12 + 1;
        float[][] fArr4 = new float[i13][];
        for (int i14 = 0; i14 < i13; i14++) {
            fArr4[i14] = new float[i10];
        }
        for (int i15 = 0; i15 < i10; i15++) {
            fArr4[0][i15] = 1.0f;
            for (int i16 = 1; i16 < i13; i16++) {
                fArr4[i16][i15] = fArr4[i16 - 1][i15] * fArr[i15];
            }
        }
        float[][] fArr5 = new float[i13][];
        for (int i17 = 0; i17 < i13; i17++) {
            fArr5[i17] = new float[i10];
        }
        float[][] fArr6 = new float[i13][];
        for (int i18 = 0; i18 < i13; i18++) {
            fArr6[i18] = new float[i13];
        }
        int i19 = 0;
        while (i19 < i13) {
            float[] fArr7 = fArr5[i19];
            C4875q.y0(fArr4[i19], fArr7, 0, 0, i10);
            for (int i20 = 0; i20 < i19; i20++) {
                float[] fArr8 = fArr5[i20];
                float fH = h(fArr7, fArr8);
                for (int i21 = 0; i21 < i10; i21++) {
                    fArr7[i21] = fArr7[i21] - (fArr8[i21] * fH);
                }
            }
            float fSqrt = (float) Math.sqrt(h(fArr7, fArr7));
            if (fSqrt < 1.0E-6f) {
                fSqrt = 1.0E-6f;
            }
            float f10 = 1.0f / fSqrt;
            for (int i22 = 0; i22 < i10; i22++) {
                fArr7[i22] = fArr7[i22] * f10;
            }
            float[] fArr9 = fArr6[i19];
            int i23 = 0;
            while (i23 < i13) {
                fArr9[i23] = i23 < i19 ? 0.0f : h(fArr7, fArr4[i23]);
                i23++;
            }
            i19++;
        }
        for (int i24 = i12; -1 < i24; i24--) {
            float fH2 = h(fArr5[i24], fArr2);
            float[] fArr10 = fArr6[i24];
            int i25 = i24 + 1;
            if (i25 <= i12) {
                int i26 = i12;
                while (true) {
                    fH2 -= fArr10[i26] * fArr3[i26];
                    if (i26 != i25) {
                        i26--;
                    }
                }
            }
            fArr3[i24] = fH2 / fArr10[i24];
        }
        return fArr3;
    }

    public static float[] q(float[] fArr, float[] fArr2, int i10, int i11, float[] fArr3, int i12, Object obj) {
        if ((i12 & 16) != 0) {
            int i13 = i11 + 1;
            if (i13 < 0) {
                i13 = 0;
            }
            fArr3 = new float[i13];
        }
        p(fArr, fArr2, i10, i11, fArr3);
        return fArr3;
    }

    public static final void r(a[] aVarArr, int i10, long j10, float f10) {
        a aVar = aVarArr[i10];
        if (aVar == null) {
            aVarArr[i10] = new a(j10, f10);
        } else {
            aVar.f74442a = j10;
            aVar.f74443b = f10;
        }
    }

    public static final void s(float[][] fArr, int i10, int i11, float f10) {
        fArr[i10][i11] = f10;
    }

    @i
    public static final void t(boolean z10) {
        f74451e = z10;
    }

    @i
    public static final void u(boolean z10) {
        f74452f = z10;
    }

    @i
    public static /* synthetic */ void k() {
    }

    @i
    public static /* synthetic */ void m() {
    }
}
