package D0;

import androidx.annotation.NonNull;
import androidx.compose.animation.X;
import androidx.compose.ui.graphics.C2082m2;

/* JADX INFO: loaded from: classes2.dex */
public final class o {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final o f17667k = k(b.f17618c, (float) ((((double) b.h(50.0f)) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f17668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f17669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f17670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f17671d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f17672e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f17673f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float[] f17674g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f17675h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f17676i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f17677j;

    public o(float f10, float f11, float f12, float f13, float f14, float f15, float[] fArr, float f16, float f17, float f18) {
        this.f17673f = f10;
        this.f17668a = f11;
        this.f17669b = f12;
        this.f17670c = f13;
        this.f17671d = f14;
        this.f17672e = f15;
        this.f17674g = fArr;
        this.f17675h = f16;
        this.f17676i = f17;
        this.f17677j = f18;
    }

    @NonNull
    public static o k(@NonNull float[] fArr, float f10, float f11, float f12, boolean z10) {
        float[][] fArr2 = b.f17616a;
        float f13 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f14 = fArr3[0] * f13;
        float f15 = fArr[1];
        float f16 = (fArr3[1] * f15) + f14;
        float f17 = fArr[2];
        float f18 = (fArr3[2] * f17) + f16;
        float[] fArr4 = fArr2[1];
        float f19 = (fArr4[2] * f17) + (fArr4[1] * f15) + (fArr4[0] * f13);
        float[] fArr5 = fArr2[2];
        float f20 = (f17 * fArr5[2]) + (f15 * fArr5[1]) + (f13 * fArr5[0]);
        float f21 = (f12 / 10.0f) + 0.8f;
        float fD = ((double) f21) >= 0.9d ? b.d(0.59f, 0.69f, (f21 - 0.9f) * 10.0f) : b.d(0.525f, 0.59f, (f21 - 0.8f) * 10.0f);
        float fA = z10 ? 1.0f : C2082m2.a((float) Math.exp(((-f10) - 42.0f) / 92.0f), 0.2777778f, 1.0f, f21);
        double d10 = fA;
        if (d10 > 1.0d) {
            fA = 1.0f;
        } else if (d10 < 0.0d) {
            fA = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f18) * fA) + 1.0f) - fA, (((100.0f / f19) * fA) + 1.0f) - fA, (((100.0f / f20) * fA) + 1.0f) - fA};
        float f22 = 1.0f / ((5.0f * f10) + 1.0f);
        float f23 = f22 * f22 * f22 * f22;
        float f24 = 1.0f - f23;
        float fCbrt = (0.1f * f24 * f24 * ((float) Math.cbrt(((double) f10) * 5.0d))) + (f23 * f10);
        float fH = b.h(f11) / fArr[1];
        double d11 = fH;
        float fSqrt = ((float) Math.sqrt(d11)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d11, 0.2d));
        float[] fArr7 = {(float) Math.pow(((double) ((fArr6[0] * fCbrt) * f18)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[1] * fCbrt) * f19)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[2] * fCbrt) * f20)) / 100.0d, 0.42d)};
        float f25 = fArr7[0];
        float f26 = (f25 * 400.0f) / (f25 + 27.13f);
        float f27 = fArr7[1];
        float f28 = (f27 * 400.0f) / (f27 + 27.13f);
        float f29 = fArr7[2];
        float[] fArr8 = {f26, f28, (400.0f * f29) / (f29 + 27.13f)};
        return new o(fH, X.a(fArr8[2], 0.05f, (fArr8[0] * 2.0f) + fArr8[1], fPow), fPow, fPow, fD, f21, fArr6, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    public float a() {
        return this.f17668a;
    }

    public float b() {
        return this.f17671d;
    }

    public float c() {
        return this.f17675h;
    }

    public float d() {
        return this.f17676i;
    }

    public float e() {
        return this.f17673f;
    }

    public float f() {
        return this.f17669b;
    }

    public float g() {
        return this.f17672e;
    }

    public float h() {
        return this.f17670c;
    }

    @NonNull
    public float[] i() {
        return this.f17674g;
    }

    public float j() {
        return this.f17677j;
    }
}
