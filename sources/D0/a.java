package D0;

import G0.C1162y;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.compose.animation.W;
import androidx.compose.ui.graphics.colorspace.C2016d;
import e.InterfaceC4337k;
import e.InterfaceC4348w;
import e.Y;
import kotlin.jvm.internal.C4970w;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final float f17603j = 0.2f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final float f17604k = 1.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final float f17605l = 0.4f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final float f17606m = 0.01f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f17607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f17608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f17609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f17610d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f17611e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f17612f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f17613g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f17614h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f17615i;

    public a(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        this.f17607a = f10;
        this.f17608b = f11;
        this.f17609c = f12;
        this.f17610d = f13;
        this.f17611e = f14;
        this.f17612f = f15;
        this.f17613g = f16;
        this.f17614h = f17;
        this.f17615i = f18;
    }

    @Nullable
    public static a b(@InterfaceC4348w(from = 0.0d, to = 360.0d) float f10, @InterfaceC4348w(from = 0.0d, to = C4970w.f217977d, toInclusive = false) float f11, @InterfaceC4348w(from = 0.0d, to = C1162y.f40124b) float f12) {
        float f13 = 100.0f;
        float f14 = 1000.0f;
        float f15 = 0.0f;
        a aVar = null;
        float f16 = 1000.0f;
        while (Math.abs(f15 - f13) > 0.01f) {
            float fA = W.a(f13, f15, 2.0f, f15);
            o oVar = o.f17667k;
            int iS = f(fA, f11, f10, oVar).s(oVar);
            float fB = b.b(iS);
            float fAbs = Math.abs(f12 - fB);
            if (fAbs < 0.2f) {
                a aVarC = c(iS);
                float fA2 = aVarC.a(f(aVarC.f17609c, aVarC.f17608b, f10, oVar));
                if (fA2 <= 1.0f) {
                    f16 = fA2;
                    aVar = aVarC;
                    f14 = fAbs;
                }
            }
            if (f14 == 0.0f && f16 == 0.0f) {
                return aVar;
            }
            if (fB < f12) {
                f15 = fA;
            } else {
                f13 = fA;
            }
        }
        return aVar;
    }

    @NonNull
    public static a c(@InterfaceC4337k int i10) {
        float[] fArr = new float[7];
        float[] fArr2 = new float[3];
        d(i10, o.f17667k, fArr, fArr2);
        return new a(fArr2[0], fArr2[1], fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5], fArr[6]);
    }

    public static void d(@InterfaceC4337k int i10, @NonNull o oVar, @Nullable @Y(7) float[] fArr, @NonNull @Y(3) float[] fArr2) {
        b.f(i10, fArr2);
        float[][] fArr3 = b.f17616a;
        float f10 = fArr2[0];
        float[] fArr4 = fArr3[0];
        float f11 = fArr4[0] * f10;
        float f12 = fArr2[1];
        float f13 = (fArr4[1] * f12) + f11;
        float f14 = fArr2[2];
        float f15 = (fArr4[2] * f14) + f13;
        float[] fArr5 = fArr3[1];
        float f16 = (fArr5[2] * f14) + (fArr5[1] * f12) + (fArr5[0] * f10);
        float[] fArr6 = fArr3[2];
        float f17 = (f14 * fArr6[2]) + (f12 * fArr6[1]) + (f10 * fArr6[0]);
        float[] fArr7 = oVar.f17674g;
        float f18 = fArr7[0] * f15;
        float f19 = fArr7[1] * f16;
        float f20 = fArr7[2] * f17;
        float fPow = (float) Math.pow(((double) (Math.abs(f18) * oVar.f17675h)) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow(((double) (Math.abs(f19) * oVar.f17675h)) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow(((double) (Math.abs(f20) * oVar.f17675h)) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f18) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f19) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f20) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d10 = fSignum3;
        float f21 = ((float) (((((double) fSignum2) * (-12.0d)) + (((double) fSignum) * 11.0d)) + d10)) / 11.0f;
        float f22 = ((float) (((double) (fSignum + fSignum2)) - (d10 * 2.0d))) / 9.0f;
        float f23 = fSignum2 * 20.0f;
        float f24 = ((21.0f * fSignum3) + ((fSignum * 20.0f) + f23)) / 20.0f;
        float f25 = (((fSignum * 40.0f) + f23) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f22, f21)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f26 = (3.1415927f * fAtan2) / 180.0f;
        float fPow4 = ((float) Math.pow((oVar.f17669b * f25) / oVar.f17668a, oVar.f17671d * oVar.f17677j)) * 100.0f;
        float fSqrt = (oVar.f17668a + 4.0f) * (4.0f / oVar.f17671d) * ((float) Math.sqrt(fPow4 / 100.0f)) * oVar.f17676i;
        float fSqrt2 = ((float) Math.sqrt(((double) fPow4) / 100.0d)) * ((float) Math.pow(1.64d - Math.pow(0.29d, oVar.f17673f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((((double) (((double) fAtan2) < 20.14d ? 360.0f + fAtan2 : fAtan2)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * oVar.f17672e) * oVar.f17670c) * ((float) Math.sqrt((f22 * f22) + (f21 * f21)))) / (f24 + 0.305f), 0.9d));
        float f27 = oVar.f17676i * fSqrt2;
        float fSqrt3 = ((float) Math.sqrt((r8 * oVar.f17671d) / (oVar.f17668a + 4.0f))) * 50.0f;
        float f28 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((0.0228f * f27) + 1.0f)) * 43.85965f;
        double d11 = f26;
        float fCos = ((float) Math.cos(d11)) * fLog;
        float fSin = fLog * ((float) Math.sin(d11));
        fArr2[0] = fAtan2;
        fArr2[1] = fSqrt2;
        if (fArr != null) {
            fArr[0] = fPow4;
            fArr[1] = fSqrt;
            fArr[2] = f27;
            fArr[3] = fSqrt3;
            fArr[4] = f28;
            fArr[5] = fCos;
            fArr[6] = fSin;
        }
    }

    @NonNull
    public static a e(@InterfaceC4348w(from = 0.0d, to = C1162y.f40124b) float f10, @InterfaceC4348w(from = 0.0d, to = C4970w.f217977d, toInclusive = false) float f11, @InterfaceC4348w(from = 0.0d, to = 360.0d) float f12) {
        return f(f10, f11, f12, o.f17667k);
    }

    @NonNull
    public static a f(@InterfaceC4348w(from = 0.0d, to = C1162y.f40124b) float f10, @InterfaceC4348w(from = 0.0d, to = C4970w.f217977d, toInclusive = false) float f11, @InterfaceC4348w(from = 0.0d, to = 360.0d) float f12, o oVar) {
        float fSqrt = (oVar.f17668a + 4.0f) * (4.0f / oVar.f17671d) * ((float) Math.sqrt(((double) f10) / 100.0d));
        float f13 = oVar.f17676i;
        float f14 = fSqrt * f13;
        float f15 = f13 * f11;
        float fSqrt2 = ((float) Math.sqrt(((f11 / ((float) Math.sqrt(r4))) * oVar.f17671d) / (oVar.f17668a + 4.0f))) * 50.0f;
        float f16 = (1.7f * f10) / ((0.007f * f10) + 1.0f);
        float fLog = ((float) Math.log((((double) f15) * 0.0228d) + 1.0d)) * 43.85965f;
        double d10 = (3.1415927f * f12) / 180.0f;
        return new a(f12, f11, f10, f14, f15, fSqrt2, f16, ((float) Math.cos(d10)) * fLog, fLog * ((float) Math.sin(d10)));
    }

    public static void n(@InterfaceC4337k int i10, @NonNull @Y(3) float[] fArr) {
        d(i10, o.f17667k, null, fArr);
        fArr[2] = b.b(i10);
    }

    public static int q(@InterfaceC4348w(from = 0.0d, to = 360.0d) float f10, @InterfaceC4348w(from = 0.0d, to = C4970w.f217977d, toInclusive = false) float f11, @InterfaceC4348w(from = 0.0d, to = C1162y.f40124b) float f12) {
        return r(f10, f11, f12, o.f17667k);
    }

    @InterfaceC4337k
    public static int r(@InterfaceC4348w(from = 0.0d, to = 360.0d) float f10, @InterfaceC4348w(from = 0.0d, to = C4970w.f217977d, toInclusive = false) float f11, @InterfaceC4348w(from = 0.0d, to = C1162y.f40124b) float f12, @NonNull o oVar) {
        if (f11 < 1.0d || Math.round(f12) <= 0.0d || Math.round(f12) >= 100.0d) {
            return b.a(f12);
        }
        float fMin = f10 < 0.0f ? 0.0f : Math.min(360.0f, f10);
        a aVar = null;
        boolean z10 = true;
        float f13 = 0.0f;
        float fA = f11;
        while (Math.abs(f13 - f11) >= 0.4f) {
            a aVarB = b(fMin, fA, f12);
            if (!z10) {
                if (aVarB == null) {
                    f11 = fA;
                } else {
                    f13 = fA;
                    aVar = aVarB;
                }
                fA = W.a(f11, f13, 2.0f, f13);
            } else {
                if (aVarB != null) {
                    return aVarB.s(oVar);
                }
                fA = W.a(f11, f13, 2.0f, f13);
                z10 = false;
            }
        }
        return aVar == null ? b.a(f12) : aVar.s(oVar);
    }

    public float a(@NonNull a aVar) {
        float fL = l() - aVar.l();
        float fG = g() - aVar.g();
        float fH = h() - aVar.h();
        return (float) (Math.pow(Math.sqrt((fH * fH) + (fG * fG) + (fL * fL)), 0.63d) * 1.41d);
    }

    @InterfaceC4348w(from = C4970w.f217978e, fromInclusive = false, to = C4970w.f217977d, toInclusive = false)
    public float g() {
        return this.f17614h;
    }

    @InterfaceC4348w(from = C4970w.f217978e, fromInclusive = false, to = C4970w.f217977d, toInclusive = false)
    public float h() {
        return this.f17615i;
    }

    @InterfaceC4348w(from = 0.0d, to = C4970w.f217977d, toInclusive = false)
    public float i() {
        return this.f17608b;
    }

    @InterfaceC4348w(from = 0.0d, to = 360.0d, toInclusive = false)
    public float j() {
        return this.f17607a;
    }

    @InterfaceC4348w(from = 0.0d, to = C1162y.f40124b)
    public float k() {
        return this.f17609c;
    }

    @InterfaceC4348w(from = 0.0d, to = C1162y.f40124b)
    public float l() {
        return this.f17613g;
    }

    @InterfaceC4348w(from = 0.0d, to = C4970w.f217977d, toInclusive = false)
    public float m() {
        return this.f17611e;
    }

    @InterfaceC4348w(from = 0.0d, to = C4970w.f217977d, toInclusive = false)
    public float o() {
        return this.f17610d;
    }

    @InterfaceC4348w(from = 0.0d, to = C4970w.f217977d, toInclusive = false)
    public float p() {
        return this.f17612f;
    }

    @InterfaceC4337k
    public int s(@NonNull o oVar) {
        float fPow = (float) Math.pow(((double) ((((double) i()) == 0.0d || ((double) k()) == 0.0d) ? 0.0f : i() / ((float) Math.sqrt(((double) k()) / 100.0d)))) / Math.pow(1.64d - Math.pow(0.29d, oVar.f17673f), 0.73d), 1.1111111111111112d);
        double dJ = (j() * 3.1415927f) / 180.0f;
        float fCos = ((float) (Math.cos(2.0d + dJ) + 3.8d)) * 0.25f;
        float fPow2 = oVar.f17668a * ((float) Math.pow(((double) k()) / 100.0d, (1.0d / ((double) oVar.f17671d)) / ((double) oVar.f17677j)));
        float f10 = fCos * 3846.1538f * oVar.f17672e * oVar.f17670c;
        float f11 = fPow2 / oVar.f17669b;
        float fSin = (float) Math.sin(dJ);
        float fCos2 = (float) Math.cos(dJ);
        float f12 = (((0.305f + f11) * 23.0f) * fPow) / (((fPow * 108.0f) * fSin) + (((11.0f * fPow) * fCos2) + (f10 * 23.0f)));
        float f13 = fCos2 * f12;
        float f14 = f12 * fSin;
        float f15 = f11 * 460.0f;
        float fA = C2016d.a(f14, 261.0f, f15 - (891.0f * f13), 1403.0f);
        float fA2 = C2016d.a(f14, 6300.0f, f15 - (f13 * 220.0f), 1403.0f);
        float fSignum = (100.0f / oVar.f17675h) * Math.signum(((288.0f * f14) + ((451.0f * f13) + f15)) / 1403.0f) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(r2)) * 27.13d) / (400.0d - ((double) Math.abs(r2)))), 2.380952380952381d));
        float fSignum2 = (100.0f / oVar.f17675h) * Math.signum(fA) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(fA)) * 27.13d) / (400.0d - ((double) Math.abs(fA)))), 2.380952380952381d));
        float fSignum3 = (100.0f / oVar.f17675h) * Math.signum(fA2) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(fA2)) * 27.13d) / (400.0d - ((double) Math.abs(fA2)))), 2.380952380952381d));
        float[] fArr = oVar.f17674g;
        float f16 = fSignum / fArr[0];
        float f17 = fSignum2 / fArr[1];
        float f18 = fSignum3 / fArr[2];
        float[][] fArr2 = b.f17617b;
        float[] fArr3 = fArr2[0];
        float f19 = (fArr3[2] * f18) + (fArr3[1] * f17) + (fArr3[0] * f16);
        float[] fArr4 = fArr2[1];
        float f20 = (fArr4[2] * f18) + (fArr4[1] * f17) + (fArr4[0] * f16);
        float[] fArr5 = fArr2[2];
        return C1162y.h(f19, f20, (f18 * fArr5[2]) + (f17 * fArr5[1]) + (f16 * fArr5[0]));
    }

    @InterfaceC4337k
    public int t() {
        return s(o.f17667k);
    }
}
