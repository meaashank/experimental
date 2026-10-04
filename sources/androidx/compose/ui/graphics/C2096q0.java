package androidx.compose.ui.graphics;

import androidx.annotation.RestrictTo;
import androidx.collection.C1552q;
import androidx.compose.ui.graphics.PathSegment;
import i.C4541d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C4875q;
import n0.C5238e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nBezier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Bezier.kt\nandroidx/compose/ui/graphics/BezierKt\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,1120:1\n230#1:1121\n571#1,7:1122\n571#1,7:1129\n571#1,7:1136\n571#1,7:1143\n571#1,7:1150\n560#1:1157\n560#1:1158\n560#1:1159\n571#1,7:1160\n571#1,7:1167\n571#1,7:1174\n571#1,7:1197\n571#1,7:1204\n571#1,7:1211\n571#1,7:1218\n571#1,7:1225\n571#1,7:1232\n359#1:1239\n359#1:1240\n1094#1:1241\n1094#1:1242\n1108#1:1243\n1108#1:1244\n359#1:1245\n571#1,7:1246\n563#1:1253\n563#1:1256\n97#2,16:1181\n49#2:1254\n60#2:1255\n71#2,16:1257\n*S KotlinDebug\n*F\n+ 1 Bezier.kt\nandroidx/compose/ui/graphics/BezierKt\n*L\n201#1:1121\n201#1:1122,7\n230#1:1129,7\n254#1:1136,7\n257#1:1143,7\n259#1:1150,7\n293#1:1157\n295#1:1158\n297#1:1159\n300#1:1160,7\n305#1:1167,7\n308#1:1174,7\n329#1:1197,7\n332#1:1204,7\n335#1:1211,7\n339#1:1218,7\n342#1:1225,7\n349#1:1232,7\n442#1:1239\n461#1:1240\n484#1:1241\n485#1:1242\n511#1:1243\n512#1:1244\n544#1:1245\n586#1:1246,7\n726#1:1253\n910#1:1256\n325#1:1181,16\n889#1:1254\n892#1:1255\n950#1:1257,16\n*E\n"})
public final class C2096q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final double f101389a = 6.283185307179586d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final double f101390b = 1.0E-7d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f101391c = 8.34465E-7f;

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.q0$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f101392a;

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
            try {
                iArr[PathSegment.Type.Close.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PathSegment.Type.Done.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f101392a = iArr;
        }
    }

    public static /* synthetic */ int A(float f10, float f11, float[] fArr, int i10, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            i10 = 0;
        }
        return Q((-f10) / (f11 - f10), fArr, i10);
    }

    public static final int B(float f10, float f11, float f12, float[] fArr, int i10) {
        double d10 = f10;
        double d11 = f11;
        double d12 = f12;
        double d13 = d11 * 2.0d;
        double d14 = (d10 - d13) + d12;
        if (d14 == 0.0d) {
            if (d11 == d12) {
                return 0;
            }
            return Q((float) ((d13 - d12) / (d13 - (d12 * 2.0d))), fArr, i10);
        }
        double d15 = -Math.sqrt((d11 * d11) - (d12 * d10));
        double d16 = (-d10) + d11;
        int iQ = Q((float) ((-(d15 + d16)) / d14), fArr, i10);
        int iQ2 = Q((float) ((d15 - d16) / d14), fArr, i10 + iQ) + iQ;
        if (iQ2 <= 1) {
            return iQ2;
        }
        float f13 = fArr[i10];
        int i11 = i10 + 1;
        float f14 = fArr[i11];
        if (f13 <= f14) {
            return f13 == f14 ? iQ2 - 1 : iQ2;
        }
        fArr[i10] = f14;
        fArr[i11] = f13;
        return iQ2;
    }

    public static /* synthetic */ int C(float f10, float f11, float f12, float[] fArr, int i10, int i11, Object obj) {
        if ((i11 & 16) != 0) {
            i10 = 0;
        }
        return B(f10, f11, f12, fArr, i10);
    }

    public static final float D(PathSegment pathSegment) {
        float[] fArr = pathSegment.f100792b;
        char c10 = 4;
        switch (a.f101392a[pathSegment.f100791a.ordinal()]) {
            case 1:
            case 6:
            case 7:
                c10 = 0;
                break;
            case 2:
                c10 = 2;
                break;
            case 3:
            case 4:
                break;
            case 5:
                c10 = 6;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return fArr[c10];
    }

    public static final float E(PathSegment pathSegment) {
        float[] fArr = pathSegment.f100792b;
        char c10 = 5;
        switch (a.f101392a[pathSegment.f100791a.ordinal()]) {
            case 1:
            case 6:
            case 7:
                c10 = 0;
                break;
            case 2:
                c10 = 3;
                break;
            case 3:
            case 4:
                break;
            case 5:
                c10 = 7;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return fArr[c10];
    }

    public static final float F(PathSegment pathSegment) {
        return pathSegment.f100792b[0];
    }

    public static final float G(PathSegment pathSegment) {
        return pathSegment.f100792b[1];
    }

    public static final boolean H(float f10, float f11, float f12) {
        return !(Math.signum(f11 - f12) + Math.signum(f10 - f11) == 0.0f);
    }

    public static final int I(@NotNull float[] fArr, float f10, float f11) {
        int i10;
        float f12;
        float f13 = fArr[0];
        float f14 = fArr[1];
        float f15 = fArr[2];
        float f16 = fArr[3];
        float f17 = f16 - f14;
        if (f14 > f16) {
            i10 = -1;
            f12 = f14;
        } else {
            i10 = 1;
            f12 = f16;
            f16 = f14;
        }
        if (f11 < f16 || f11 >= f12) {
            return 0;
        }
        float f18 = ((f11 - f14) * (f15 - f13)) - ((f10 - f13) * f17);
        if (f18 == 0.0f || ((int) Math.signum(f18)) == i10) {
            return 0;
        }
        return i10;
    }

    public static final int J(float[] fArr, int i10, float f10, float f11) {
        int i11;
        int i12 = i10 + 1;
        float f12 = fArr[i12];
        int i13 = i10 + 7;
        float f13 = fArr[i13];
        if (f12 > f13) {
            i11 = -1;
            f13 = f12;
            f12 = f13;
        } else {
            i11 = 1;
        }
        if (f11 >= f12 && f11 < f13) {
            float f14 = fArr[i10];
            float f15 = fArr[i10 + 2];
            float f16 = fArr[i10 + 4];
            float f17 = fArr[i10 + 6];
            if (f10 < Math.min(f14, Math.min(f15, Math.min(f16, f17)))) {
                return 0;
            }
            if (f10 <= Math.max(f14, Math.max(f15, Math.max(f16, f17)))) {
                float f18 = fArr[i12];
                float f19 = fArr[i10 + 3];
                float f20 = fArr[i10 + 5];
                float f21 = fArr[i13];
                float fV = v(f18 - f11, f19 - f11, f20 - f11, f21 - f11);
                if (Float.isNaN(fV)) {
                    return 0;
                }
                float fO = o(f14, f15, f16, f17, fV);
                if ((Math.abs(fO - f10) >= 8.34465E-7f || (f10 == f17 && f11 == f21)) && fO < f10) {
                }
            }
            return i11;
        }
        return 0;
    }

    public static final int K(float[] fArr, int i10, float f10, float f11, float[] fArr2) {
        int i11;
        float f12;
        float f13;
        float f14 = fArr[i10 + 1];
        float f15 = fArr[i10 + 5];
        if (f14 > f15) {
            i11 = -1;
            f13 = f14;
            f12 = f15;
        } else {
            i11 = 1;
            f12 = f14;
            f13 = f15;
        }
        if (f11 >= f12 && f11 < f13) {
            float f16 = fArr[i10 + 3];
            float fQ = C((f14 - (f16 * 2.0f)) + f15, (f16 - f14) * 2.0f, f14 - f11, fArr2, 0, 16, null) == 0 ? fArr[(1 - i11) * 2] : q(fArr[0], fArr[2], fArr[4], fArr2[0]);
            if ((Math.abs(fQ - f10) >= 8.34465E-7f || (f10 == fArr[4] && f11 == f15)) && fQ < f10) {
                return i11;
            }
        }
        return 0;
    }

    public static final int L(float[] fArr, float[] fArr2) {
        float f10 = fArr[1];
        float f11 = fArr[3];
        float f12 = fArr[5];
        if (!H(f10, f11, f12)) {
            float f13 = f10 - f11;
            float fP = P(f13, (f13 - f11) + f12);
            if (!Float.isNaN(fP)) {
                O(fArr, fArr2, fP);
                return 1;
            }
            if (Math.abs(f13) >= Math.abs(f11 - f12)) {
                f10 = f12;
            }
            f11 = f10;
        }
        C4875q.y0(fArr, fArr2, 0, 0, 6);
        fArr2[3] = f11;
        return 0;
    }

    public static final int M(@NotNull float[] fArr, float f10, float f11, @NotNull float[] fArr2, @NotNull float[] fArr3) {
        if (H(fArr[1], fArr[3], fArr[5])) {
            return K(fArr, 0, f10, f11, fArr3);
        }
        int iL = L(fArr, fArr2);
        int iK = K(fArr2, 0, f10, f11, fArr3);
        return iL > 0 ? K(fArr2, 4, f10, f11, fArr3) + iK : iK;
    }

    public static final void N(float[] fArr, int i10, float[] fArr2, int i11, float f10) {
        if (f10 >= 1.0f) {
            C4875q.y0(fArr, fArr2, i11, i10, 8);
            float f11 = fArr[i10 + 6];
            float f12 = fArr[i10 + 7];
            fArr2[i11 + 8] = f11;
            fArr2[i11 + 9] = f12;
            fArr2[i11 + 10] = f11;
            fArr2[i11 + 11] = f12;
            fArr2[i11 + 12] = f11;
            fArr2[i11 + 13] = f12;
            return;
        }
        float f13 = fArr[i10];
        float f14 = fArr[i10 + 1];
        fArr2[i11] = f13;
        fArr2[i11 + 1] = f14;
        float f15 = fArr[i10 + 2];
        float f16 = fArr[i10 + 3];
        float fJ = C5238e.j(f13, f15, f10);
        float fJ2 = C5238e.j(f14, f16, f10);
        fArr2[i11 + 2] = fJ;
        fArr2[i11 + 3] = fJ2;
        float f17 = fArr[i10 + 4];
        float f18 = fArr[i10 + 5];
        float fJ3 = C5238e.j(f15, f17, f10);
        float fJ4 = C5238e.j(f16, f18, f10);
        float fJ5 = C5238e.j(fJ, fJ3, f10);
        float fJ6 = C5238e.j(fJ2, fJ4, f10);
        fArr2[i11 + 4] = fJ5;
        fArr2[i11 + 5] = fJ6;
        float f19 = fArr[i10 + 6];
        float f20 = fArr[i10 + 7];
        float fJ7 = C5238e.j(f17, f19, f10);
        float fJ8 = C5238e.j(f18, f20, f10);
        float fJ9 = C5238e.j(fJ3, fJ7, f10);
        float fJ10 = C5238e.j(fJ4, fJ8, f10);
        float fJ11 = C5238e.j(fJ5, fJ9, f10);
        float fJ12 = C5238e.j(fJ6, fJ10, f10);
        fArr2[i11 + 6] = fJ11;
        fArr2[i11 + 7] = fJ12;
        fArr2[i11 + 8] = fJ9;
        fArr2[i11 + 9] = fJ10;
        fArr2[i11 + 10] = fJ7;
        fArr2[i11 + 11] = fJ8;
        fArr2[i11 + 12] = f19;
        fArr2[i11 + 13] = f20;
    }

    public static final void O(float[] fArr, float[] fArr2, float f10) {
        float f11 = fArr[0];
        float f12 = fArr[1];
        float f13 = fArr[2];
        float f14 = fArr[3];
        float f15 = fArr[4];
        float f16 = fArr[5];
        float fJ = C5238e.j(f11, f13, f10);
        float fJ2 = C5238e.j(f12, f14, f10);
        fArr2[0] = f11;
        fArr2[1] = f12;
        fArr2[2] = fJ;
        fArr2[3] = fJ2;
        float fJ3 = C5238e.j(f13, f15, f10);
        float fJ4 = C5238e.j(f14, f16, f10);
        float fJ5 = C5238e.j(fJ, fJ3, f10);
        float fJ6 = C5238e.j(fJ2, fJ4, f10);
        fArr2[4] = fJ5;
        fArr2[5] = fJ6;
        fArr2[6] = fJ3;
        fArr2[7] = fJ4;
        fArr2[8] = f15;
        fArr2[9] = f16;
    }

    public static final float P(float f10, float f11) {
        if (f10 < 0.0f) {
            f10 = -f10;
            f11 = -f11;
        }
        if (f11 == 0.0f || f10 == 0.0f || f10 >= f11) {
            return Float.NaN;
        }
        float f12 = f10 / f11;
        if (f12 == 0.0f) {
            return Float.NaN;
        }
        return f12;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000d A[PHI: r0
      0x000d: PHI (r0v2 float) = (r0v1 float), (r0v0 float) binds: [B:11:0x001c, B:5:0x000b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int Q(float r3, float[] r4, int r5) {
        /*
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            r2 = 2143289344(0x7fc00000, float:NaN)
            if (r1 >= 0) goto L11
            r1 = -1251999744(0xffffffffb5600000, float:-8.34465E-7)
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 < 0) goto Lf
        Ld:
            r3 = r0
            goto L1f
        Lf:
            r3 = r2
            goto L1f
        L11:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto L1f
            r1 = 1065353223(0x3f800007, float:1.0000008)
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 > 0) goto Lf
            goto Ld
        L1f:
            r4[r5] = r3
            boolean r3 = java.lang.Float.isNaN(r3)
            r3 = r3 ^ 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.C2096q0.Q(float, float[], int):int");
    }

    public static final float b(float f10) {
        return f10 < 0.0f ? f10 >= -8.34465E-7f ? 0.0f : Float.NaN : f10 > 1.0f ? f10 <= 1.0000008f ? 1.0f : Float.NaN : f10;
    }

    public static final boolean c(double d10, double d11) {
        return Math.abs(d10 - d11) < 1.0E-7d;
    }

    public static final boolean d(float f10, float f11) {
        return Math.abs(f10 - f11) < 8.34465E-7f;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final long e(float f10, float f11, float f12, float f13, @NotNull float[] fArr, int i10) {
        float f14 = (f11 - f10) * 3.0f;
        float f15 = (f12 - f11) * 3.0f;
        float f16 = (f13 - f12) * 3.0f;
        int iB = B(f14, f15, f16, fArr, i10);
        float f17 = (f15 - f14) * 2.0f;
        int iQ = Q((-f17) / (((f16 - f15) * 2.0f) - f17), fArr, i10 + iB) + iB;
        float fMin = Math.min(f10, f13);
        float fMax = Math.max(f10, f13);
        for (int i11 = 0; i11 < iQ; i11++) {
            float fO = o(f10, f11, f12, f13, fArr[i11]);
            fMin = Math.min(fMin, fO);
            fMax = Math.max(fMax, fO);
        }
        return C1552q.d(fMin, fMax);
    }

    public static /* synthetic */ long f(float f10, float f11, float f12, float f13, float[] fArr, int i10, int i11, Object obj) {
        if ((i11 & 32) != 0) {
            i10 = 0;
        }
        return e(f10, f11, f12, f13, fArr, i10);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final long g(@NotNull PathSegment pathSegment, @NotNull float[] fArr, int i10) {
        int iU = u(pathSegment, true, fArr, i10);
        float fMin = Math.min(pathSegment.f100792b[0], D(pathSegment));
        float fMax = Math.max(pathSegment.f100792b[0], D(pathSegment));
        for (int i11 = 0; i11 < iU; i11++) {
            float fR = r(pathSegment, fArr[i11]);
            fMin = Math.min(fMin, fR);
            fMax = Math.max(fMax, fR);
        }
        return C1552q.d(fMin, fMax);
    }

    public static /* synthetic */ long h(PathSegment pathSegment, float[] fArr, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return g(pathSegment, fArr, i10);
    }

    public static final long i(@NotNull PathSegment pathSegment, @NotNull float[] fArr, int i10) {
        int iU = u(pathSegment, false, fArr, i10);
        float fMin = Math.min(pathSegment.f100792b[1], E(pathSegment));
        float fMax = Math.max(pathSegment.f100792b[1], E(pathSegment));
        for (int i11 = 0; i11 < iU; i11++) {
            float fS = s(pathSegment, fArr[i11]);
            fMin = Math.min(fMin, fS);
            fMax = Math.max(fMax, fS);
        }
        return C1552q.d(fMin, fMax);
    }

    public static /* synthetic */ long j(PathSegment pathSegment, float[] fArr, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return i(pathSegment, fArr, i10);
    }

    public static final float k(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        return ((((((f10 / 3.0f) + f14) * f17) + (C4541d.a(f10, f14, f13, ((f12 + f14) * (f17 - f11)) - ((f13 + f15) * (f16 - f10))) - ((f11 - f15) * f12))) - (((f11 / 3.0f) + f15) * f16)) * 3.0f) / 20.0f;
    }

    public static final int l(float[] fArr, float[] fArr2, float[] fArr3) {
        int iT = t(fArr, fArr3);
        int i10 = 0;
        if (iT == 0) {
            C4875q.y0(fArr, fArr2, 0, 0, 8);
            return iT;
        }
        int i11 = 0;
        float f10 = 0.0f;
        while (i10 < iT) {
            float f11 = (fArr3[i10] - f10) / (1.0f - f10);
            if (f11 < 0.0f) {
                f11 = 0.0f;
            }
            f10 = f11 > 1.0f ? 1.0f : f11;
            N(fArr, i11, fArr2, i11, f10);
            i11 += 6;
            i10++;
            fArr = fArr2;
        }
        return iT;
    }

    public static final int m(@NotNull float[] fArr, float f10, float f11, @NotNull float[] fArr2, @NotNull float[] fArr3) {
        int iL = l(fArr, fArr2, fArr3);
        int iJ = 0;
        if (iL >= 0) {
            int i10 = 0;
            while (true) {
                iJ += J(fArr2, i10 * 6, f10, f11);
                if (i10 == iL) {
                    break;
                }
                i10++;
            }
        }
        return iJ;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final float n(float f10, float f11, float f12) {
        return ((((((f10 - f11) + 0.33333334f) * f12) + (f11 - (2.0f * f10))) * f12) + f10) * 3.0f * f12;
    }

    public static final float o(float f10, float f11, float f12, float f13, float f14) {
        float f15 = (((f11 - f12) * 3.0f) + f13) - f10;
        return (((((f15 * f14) + (((f12 - (2.0f * f11)) + f10) * 3.0f)) * f14) + ((f11 - f10) * 3.0f)) * f14) + f10;
    }

    public static final float p(float f10, float f11, float f12) {
        return C4541d.a(f11, f10, f12, f10);
    }

    public static final float q(float f10, float f11, float f12, float f13) {
        return (((((f12 - (f11 * 2.0f)) + f10) * f13) + ((f11 - f10) * 2.0f)) * f13) + f10;
    }

    public static final float r(PathSegment pathSegment, float f10) {
        float[] fArr = pathSegment.f100792b;
        switch (a.f101392a[pathSegment.f100791a.ordinal()]) {
            case 1:
                return fArr[0];
            case 2:
                return p(fArr[0], fArr[2], f10);
            case 3:
                return q(fArr[0], fArr[2], fArr[4], f10);
            case 4:
                return Float.NaN;
            case 5:
                return o(fArr[0], fArr[2], fArr[4], fArr[6], f10);
            case 6:
            case 7:
                return Float.NaN;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final float s(@NotNull PathSegment pathSegment, float f10) {
        float[] fArr = pathSegment.f100792b;
        switch (a.f101392a[pathSegment.f100791a.ordinal()]) {
            case 1:
                return fArr[1];
            case 2:
                return p(fArr[1], fArr[3], f10);
            case 3:
                return q(fArr[1], fArr[3], fArr[5], f10);
            case 4:
                return Float.NaN;
            case 5:
                return o(fArr[1], fArr[3], fArr[5], fArr[7], f10);
            case 6:
            case 7:
                return Float.NaN;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final int t(float[] fArr, float[] fArr2) {
        float f10 = fArr[1];
        float f11 = fArr[3];
        float f12 = fArr[5];
        return B(C4541d.a(f11, f12, 3.0f, fArr[7] - f10), (((f10 - f11) - f11) - f12) * 2.0f, f11 - f10, fArr2, 0);
    }

    public static final int u(PathSegment pathSegment, boolean z10, float[] fArr, int i10) {
        int i11 = !z10 ? 1 : 0;
        float[] fArr2 = pathSegment.f100792b;
        switch (a.f101392a[pathSegment.f100791a.ordinal()]) {
            case 1:
            case 2:
                return 0;
            case 3:
                float f10 = 2;
                float f11 = fArr2[i11 + 2];
                float f12 = (f11 - fArr2[i11]) * f10;
                return Q((-f12) / (((fArr2[i11 + 4] - f11) * f10) - f12), fArr, i10);
            case 4:
                return 0;
            case 5:
                float f13 = fArr2[i11 + 2];
                float f14 = (f13 - fArr2[i11]) * 3.0f;
                float f15 = fArr2[i11 + 4];
                float f16 = (f15 - f13) * 3.0f;
                float f17 = (fArr2[i11 + 6] - f15) * 3.0f;
                int iB = B(f14, f16, f17, fArr, i10);
                float f18 = (f16 - f14) * 2.0f;
                return Q((-f18) / (((f17 - f16) * 2.0f) - f18), fArr, i10 + iB) + iB;
            case 6:
            case 7:
                return 0;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x013d  */
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final float v(float r22, float r23, float r24, float r25) {
        /*
            Method dump skipped, instruction units count: 479
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.C2096q0.v(float, float, float, float):float");
    }

    public static final float w(float f10, float f11) {
        float f12 = (-f10) / (f11 - f10);
        return f12 < 0.0f ? f12 >= -8.34465E-7f ? 0.0f : Float.NaN : f12 > 1.0f ? f12 <= 1.0000008f ? 1.0f : Float.NaN : f12;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final float x(float r18, float r19, float r20) {
        /*
            r0 = r18
            double r0 = (double) r0
            r2 = r19
            double r2 = (double) r2
            r4 = r20
            double r4 = (double) r4
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r8 = r2 * r6
            double r10 = r0 - r8
            double r10 = r10 + r4
            r12 = 0
            int r12 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            r13 = 1065353223(0x3f800007, float:1.0000008)
            r14 = -1251999744(0xffffffffb5600000, float:-8.34465E-7)
            r15 = 1065353216(0x3f800000, float:1.0)
            r16 = 0
            r17 = 2143289344(0x7fc00000, float:NaN)
            if (r12 != 0) goto L41
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L26
            return r17
        L26:
            double r0 = r8 - r4
            double r4 = r4 * r6
            double r8 = r8 - r4
            double r0 = r0 / r8
            float r0 = (float) r0
            int r1 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r1 >= 0) goto L36
            int r0 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r0 < 0) goto L35
            return r16
        L35:
            return r17
        L36:
            int r1 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r1 <= 0) goto L40
            int r0 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r0 > 0) goto L3f
            return r15
        L3f:
            return r17
        L40:
            return r0
        L41:
            double r6 = r2 * r2
            double r4 = r4 * r0
            double r6 = r6 - r4
            double r4 = java.lang.Math.sqrt(r6)
            double r4 = -r4
            double r0 = -r0
            double r0 = r0 + r2
            double r2 = r4 + r0
            double r2 = -r2
            double r2 = r2 / r10
            float r2 = (float) r2
            int r3 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r3 >= 0) goto L5f
            int r2 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r2 < 0) goto L5c
            r2 = r16
            goto L68
        L5c:
            r2 = r17
            goto L68
        L5f:
            int r3 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r3 <= 0) goto L68
            int r2 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r2 > 0) goto L5c
            r2 = r15
        L68:
            boolean r3 = java.lang.Float.isNaN(r2)
            if (r3 != 0) goto L6f
            return r2
        L6f:
            double r4 = r4 - r0
            double r4 = r4 / r10
            float r0 = (float) r4
            int r1 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r1 >= 0) goto L7c
            int r0 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r0 < 0) goto L7b
            return r16
        L7b:
            return r17
        L7c:
            int r1 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r1 <= 0) goto L86
            int r0 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r0 > 0) goto L85
            return r15
        L85:
            return r17
        L86:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.C2096q0.x(float, float, float):float");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final float y(@NotNull PathSegment pathSegment, float f10) {
        float[] fArr = pathSegment.f100792b;
        switch (a.f101392a[pathSegment.f100791a.ordinal()]) {
            case 1:
                return Float.NaN;
            case 2:
                float f11 = fArr[0] - f10;
                float f12 = (-f11) / ((fArr[2] - f10) - f11);
                return f12 < 0.0f ? f12 >= -8.34465E-7f ? 0.0f : Float.NaN : f12 > 1.0f ? f12 <= 1.0000008f ? 1.0f : Float.NaN : f12;
            case 3:
                return x(fArr[0] - f10, fArr[2] - f10, fArr[4] - f10);
            case 4:
                return Float.NaN;
            case 5:
                return v(fArr[0] - f10, fArr[2] - f10, fArr[4] - f10, fArr[6] - f10);
            case 6:
            case 7:
                return Float.NaN;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final int z(float f10, float f11, float[] fArr, int i10) {
        return Q((-f10) / (f11 - f10), fArr, i10);
    }
}
