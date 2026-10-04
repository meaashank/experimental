package androidx.compose.animation.core;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.animation.core.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@S
@androidx.compose.runtime.internal.r(parameters = 0)
public final class C1592j0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f88140f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final float[] f88141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final float[][] f88142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final float[][] f88143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f88144d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final float[] f88145e;

    public C1592j0(@NotNull float[] fArr, @NotNull float[][] fArr2, float f10) {
        int i10;
        int length = fArr.length;
        int i11 = 0;
        int length2 = fArr2[0].length;
        this.f88145e = new float[length2];
        int i12 = length - 1;
        float[][] fArrJ = j(i12, length2);
        float[][] fArrJ2 = j(length, length2);
        for (int i13 = 0; i13 < length2; i13++) {
            int i14 = 0;
            while (i14 < i12) {
                int i15 = i14 + 1;
                float f11 = fArr[i15] - fArr[i14];
                float[] fArr3 = fArrJ[i14];
                float f12 = (fArr2[i15][i13] - fArr2[i14][i13]) / f11;
                fArr3[i13] = f12;
                if (i14 == 0) {
                    fArrJ2[i14][i13] = f12;
                } else {
                    fArrJ2[i14][i13] = (fArrJ[i14 - 1][i13] + f12) * 0.5f;
                }
                i14 = i15;
            }
            fArrJ2[i12][i13] = fArrJ[length - 2][i13];
        }
        if (!Float.isNaN(f10)) {
            for (int i16 = 0; i16 < length2; i16++) {
                float[] fArr4 = fArrJ[length - 2];
                float f13 = (1 - f10) * fArr4[i16];
                float[] fArr5 = fArrJ[0];
                float f14 = (fArr5[i16] * f10) + f13;
                fArr5[i16] = f14;
                fArr4[i16] = f14;
                fArrJ2[i12][i16] = f14;
                fArrJ2[0][i16] = f14;
            }
        }
        int i17 = 0;
        while (i17 < i12) {
            int i18 = i11;
            while (i18 < length2) {
                float f15 = fArrJ[i17][i18];
                if (f15 == 0.0f) {
                    fArrJ2[i17][i18] = 0.0f;
                    fArrJ2[i17 + 1][i18] = 0.0f;
                    i10 = length2;
                } else {
                    float f16 = fArrJ2[i17][i18] / f15;
                    int i19 = i17 + 1;
                    float f17 = fArrJ2[i19][i18] / f15;
                    i10 = length2;
                    float fHypot = (float) Math.hypot(f16, f17);
                    if (fHypot > 9.0d) {
                        float f18 = 3.0f / fHypot;
                        float[] fArr6 = fArrJ2[i17];
                        float[] fArr7 = fArrJ[i17];
                        fArr6[i18] = f16 * f18 * fArr7[i18];
                        fArrJ2[i19][i18] = f18 * f17 * fArr7[i18];
                    }
                }
                i18++;
                length2 = i10;
            }
            i17++;
            i11 = 0;
        }
        this.f88141a = fArr;
        this.f88142b = fArr2;
        this.f88143c = fArrJ2;
    }

    public static /* synthetic */ void d(C1592j0 c1592j0, float f10, AbstractC1603p abstractC1603p, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        c1592j0.c(f10, abstractC1603p, i10);
    }

    public static /* synthetic */ void h(C1592j0 c1592j0, float f10, AbstractC1603p abstractC1603p, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        c1592j0.f(f10, abstractC1603p, i10);
    }

    public final float a(float f10, float f11, float f12, float f13, float f14, float f15) {
        float f16 = f11 * f11;
        float f17 = 6;
        float f18 = f17 * f11;
        float f19 = (((f17 * f16) * f12) + ((f13 * f18) + (((-6) * f16) * f13))) - (f18 * f12);
        float f20 = 3 * f10;
        return (f10 * f14) + (((((f20 * f14) * f16) + (((f20 * f15) * f16) + f19)) - (((2 * f10) * f15) * f11)) - (((4 * f10) * f14) * f11));
    }

    public final float b(float f10, int i10) {
        float[] fArr = this.f88141a;
        int length = fArr.length;
        int i11 = 0;
        if (this.f88144d) {
            float f11 = fArr[0];
            if (f10 <= f11) {
                return (e(f11, i10) * (f10 - f11)) + this.f88142b[0][i10];
            }
            int i12 = length - 1;
            float f12 = fArr[i12];
            if (f10 >= f12) {
                return (e(f12, i10) * (f10 - f12)) + this.f88142b[i12][i10];
            }
        } else {
            if (f10 <= fArr[0]) {
                return this.f88142b[0][i10];
            }
            int i13 = length - 1;
            if (f10 >= fArr[i13]) {
                return this.f88142b[i13][i10];
            }
        }
        int i14 = length - 1;
        while (i11 < i14) {
            float[] fArr2 = this.f88141a;
            float f13 = fArr2[i11];
            if (f10 == f13) {
                return this.f88142b[i11][i10];
            }
            int i15 = i11 + 1;
            float f14 = fArr2[i15];
            if (f10 < f14) {
                float f15 = f14 - f13;
                float f16 = (f10 - f13) / f15;
                float[][] fArr3 = this.f88142b;
                float f17 = fArr3[i11][i10];
                float f18 = fArr3[i15][i10];
                float[][] fArr4 = this.f88143c;
                return i(f15, f16, f17, f18, fArr4[i11][i10], fArr4[i15][i10]);
            }
            i11 = i15;
        }
        return 0.0f;
    }

    public final void c(float f10, @NotNull AbstractC1603p abstractC1603p, int i10) {
        float[] fArr = this.f88141a;
        int length = fArr.length;
        int i11 = 0;
        int length2 = this.f88142b[0].length;
        if (this.f88144d) {
            float f11 = fArr[0];
            if (f10 <= f11) {
                g(f11, this.f88145e);
                for (int i12 = 0; i12 < length2; i12++) {
                    abstractC1603p.e(i12, ((f10 - this.f88141a[0]) * this.f88145e[i12]) + this.f88142b[0][i12]);
                }
                return;
            }
            int i13 = length - 1;
            float f12 = fArr[i13];
            if (f10 >= f12) {
                g(f12, this.f88145e);
                while (i11 < length2) {
                    abstractC1603p.e(i11, ((f10 - this.f88141a[i13]) * this.f88145e[i11]) + this.f88142b[i13][i11]);
                    i11++;
                }
                return;
            }
        } else {
            if (f10 <= fArr[0]) {
                for (int i14 = 0; i14 < length2; i14++) {
                    abstractC1603p.e(i14, this.f88142b[0][i14]);
                }
                return;
            }
            int i15 = length - 1;
            if (f10 >= fArr[i15]) {
                while (i11 < length2) {
                    abstractC1603p.e(i11, this.f88142b[i15][i11]);
                    i11++;
                }
                return;
            }
        }
        int i16 = length - 1;
        int i17 = i10;
        while (i17 < i16) {
            if (f10 == this.f88141a[i17]) {
                for (int i18 = 0; i18 < length2; i18++) {
                    abstractC1603p.e(i18, this.f88142b[i17][i18]);
                }
            }
            float[] fArr2 = this.f88141a;
            int i19 = i17 + 1;
            float f13 = fArr2[i19];
            if (f10 < f13) {
                float f14 = fArr2[i17];
                float f15 = f13 - f14;
                float f16 = (f10 - f14) / f15;
                int i20 = 0;
                while (i20 < length2) {
                    float[][] fArr3 = this.f88142b;
                    float f17 = fArr3[i17][i20];
                    float f18 = fArr3[i19][i20];
                    float[][] fArr4 = this.f88143c;
                    float f19 = f15;
                    abstractC1603p.e(i20, i(f19, f16, f17, f18, fArr4[i17][i20], fArr4[i19][i20]));
                    i20++;
                    f15 = f19;
                }
                return;
            }
            i17 = i19;
        }
    }

    public final float e(float f10, int i10) {
        float[] fArr = this.f88141a;
        int length = fArr.length;
        int i11 = 0;
        float f11 = fArr[0];
        if (f10 < f11) {
            f10 = f11;
        } else {
            float f12 = fArr[length - 1];
            if (f10 >= f12) {
                f10 = f12;
            }
        }
        int i12 = length - 1;
        while (i11 < i12) {
            float[] fArr2 = this.f88141a;
            int i13 = i11 + 1;
            float f13 = fArr2[i13];
            if (f10 <= f13) {
                float f14 = fArr2[i11];
                float f15 = f13 - f14;
                float f16 = (f10 - f14) / f15;
                float[][] fArr3 = this.f88142b;
                float f17 = fArr3[i11][i10];
                float f18 = fArr3[i13][i10];
                float[][] fArr4 = this.f88143c;
                return a(f15, f16, f17, f18, fArr4[i11][i10], fArr4[i13][i10]) / f15;
            }
            i11 = i13;
        }
        return 0.0f;
    }

    public final void f(float f10, @NotNull AbstractC1603p abstractC1603p, int i10) {
        float[] fArr = this.f88141a;
        int length = fArr.length;
        int length2 = this.f88142b[0].length;
        if (f10 <= fArr[0]) {
            for (int i11 = 0; i11 < length2; i11++) {
                abstractC1603p.e(i11, this.f88143c[0][i11]);
            }
            return;
        }
        int i12 = length - 1;
        if (f10 >= fArr[i12]) {
            for (int i13 = 0; i13 < length2; i13++) {
                abstractC1603p.e(i13, this.f88143c[i12][i13]);
            }
            return;
        }
        int i14 = i10;
        while (i14 < i12) {
            float[] fArr2 = this.f88141a;
            int i15 = i14 + 1;
            float f11 = fArr2[i15];
            if (f10 <= f11) {
                float f12 = fArr2[i14];
                float f13 = f11 - f12;
                float f14 = (f10 - f12) / f13;
                int i16 = 0;
                while (i16 < length2) {
                    float[][] fArr3 = this.f88142b;
                    float f15 = fArr3[i14][i16];
                    float f16 = fArr3[i15][i16];
                    float[][] fArr4 = this.f88143c;
                    float f17 = f13;
                    abstractC1603p.e(i16, a(f17, f14, f15, f16, fArr4[i14][i16], fArr4[i15][i16]) / f17);
                    i16++;
                    f13 = f17;
                }
                return;
            }
            i14 = i15;
        }
    }

    public final void g(float f10, @NotNull float[] fArr) {
        float f11;
        float[] fArr2 = this.f88141a;
        int length = fArr2.length;
        int length2 = this.f88142b[0].length;
        float f12 = fArr2[0];
        if (f10 <= f12) {
            f11 = f12;
        } else {
            f11 = fArr2[length - 1];
            if (f10 < f11) {
                f11 = f10;
            }
        }
        int i10 = length - 1;
        int i11 = 0;
        while (i11 < i10) {
            float[] fArr3 = this.f88141a;
            int i12 = i11 + 1;
            float f13 = fArr3[i12];
            if (f11 <= f13) {
                float f14 = fArr3[i11];
                float f15 = f13 - f14;
                float f16 = (f11 - f14) / f15;
                int i13 = 0;
                while (i13 < length2) {
                    float[][] fArr4 = this.f88142b;
                    float f17 = fArr4[i11][i13];
                    float f18 = fArr4[i12][i13];
                    float[][] fArr5 = this.f88143c;
                    float f19 = fArr5[i11][i13];
                    float f20 = fArr5[i12][i13];
                    float f21 = f15;
                    fArr[i13] = a(f21, f16, f17, f18, f19, f20) / f21;
                    i13++;
                    f15 = f21;
                }
                return;
            }
            i11 = i12;
        }
    }

    public final float i(float f10, float f11, float f12, float f13, float f14, float f15) {
        float f16 = f11 * f11;
        float f17 = f16 * f11;
        float f18 = 3 * f16;
        float f19 = 2;
        float f20 = f15 * f10;
        float f21 = (f20 * f17) + ((((f19 * f17) * f12) + ((f13 * f18) + (((-2) * f17) * f13))) - (f18 * f12)) + f12;
        float f22 = f10 * f14;
        return (f22 * f11) + ((((f17 * f22) + f21) - (f20 * f16)) - (((f19 * f10) * f14) * f16));
    }

    public final float[][] j(int i10, int i11) {
        float[][] fArr = new float[i10][];
        for (int i12 = 0; i12 < i10; i12++) {
            fArr[i12] = new float[i11];
        }
        return fArr;
    }
}
