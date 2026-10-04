package G0;

import android.graphics.Color;
import androidx.annotation.NonNull;
import androidx.collection.S0;
import e.InterfaceC4337k;
import e.InterfaceC4348w;
import java.util.Objects;
import kotlin.jvm.internal.C4970w;
import p0.C5377a;

/* JADX INFO: renamed from: G0.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1162y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final double f40123a = 95.047d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final double f40124b = 100.0d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final double f40125c = 108.883d;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final double f40126d = 0.008856d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final double f40127e = 903.3d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f40128f = 10;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f40129g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ThreadLocal<double[]> f40130h = new ThreadLocal<>();

    /* JADX INFO: renamed from: G0.y$a */
    @e.T(26)
    public static class a {
        public static Color a(Color color, Color color2) {
            if (!Objects.equals(color.getModel(), color2.getModel())) {
                throw new IllegalArgumentException("Color models must match (" + color.getModel() + " vs. " + color2.getModel() + ")");
            }
            if (!Objects.equals(color2.getColorSpace(), color.getColorSpace())) {
                color = color.convert(color2.getColorSpace());
            }
            float[] components = color.getComponents();
            float[] components2 = color2.getComponents();
            float fAlpha = color.alpha();
            float fAlpha2 = (1.0f - fAlpha) * color2.alpha();
            int componentCount = color2.getComponentCount() - 1;
            float f10 = fAlpha + fAlpha2;
            components2[componentCount] = f10;
            if (f10 > 0.0f) {
                fAlpha /= f10;
                fAlpha2 /= f10;
            }
            for (int i10 = 0; i10 < componentCount; i10++) {
                components2[i10] = (components2[i10] * fAlpha2) + (components[i10] * fAlpha);
            }
            return Color.valueOf(components2, color2.getColorSpace());
        }
    }

    public static double A(@NonNull double[] dArr, @NonNull double[] dArr2) {
        return Math.sqrt(Math.pow(dArr[2] - dArr2[2], 2.0d) + Math.pow(dArr[1] - dArr2[1], 2.0d) + Math.pow(dArr[0] - dArr2[0], 2.0d));
    }

    public static double[] B() {
        ThreadLocal<double[]> threadLocal = f40130h;
        double[] dArr = threadLocal.get();
        if (dArr != null) {
            return dArr;
        }
        double[] dArr2 = new double[3];
        threadLocal.set(dArr2);
        return dArr2;
    }

    public static double C(double d10) {
        return d10 > 0.008856d ? Math.pow(d10, 0.3333333333333333d) : ((d10 * 903.3d) + 16.0d) / 116.0d;
    }

    @InterfaceC4337k
    public static int D(@InterfaceC4337k int i10, @e.D(from = 0, to = S0.f86828d) int i11) {
        if (i11 < 0 || i11 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i10 & 16777215) | (i11 << 24);
    }

    @InterfaceC4337k
    public static int a(@NonNull float[] fArr) {
        int iRound;
        int iRound2;
        int iRound3;
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float fAbs = (1.0f - Math.abs((f12 * 2.0f) - 1.0f)) * f11;
        float f13 = f12 - (0.5f * fAbs);
        float fAbs2 = (1.0f - Math.abs(((f10 / 60.0f) % 2.0f) - 1.0f)) * fAbs;
        switch (((int) f10) / 60) {
            case 0:
                iRound = Math.round((fAbs + f13) * 255.0f);
                iRound2 = Math.round((fAbs2 + f13) * 255.0f);
                iRound3 = Math.round(f13 * 255.0f);
                break;
            case 1:
                iRound = Math.round((fAbs2 + f13) * 255.0f);
                iRound2 = Math.round((fAbs + f13) * 255.0f);
                iRound3 = Math.round(f13 * 255.0f);
                break;
            case 2:
                iRound = Math.round(f13 * 255.0f);
                iRound2 = Math.round((fAbs + f13) * 255.0f);
                iRound3 = Math.round((fAbs2 + f13) * 255.0f);
                break;
            case 3:
                iRound = Math.round(f13 * 255.0f);
                iRound2 = Math.round((fAbs2 + f13) * 255.0f);
                iRound3 = Math.round((fAbs + f13) * 255.0f);
                break;
            case 4:
                iRound = Math.round((fAbs2 + f13) * 255.0f);
                iRound2 = Math.round(f13 * 255.0f);
                iRound3 = Math.round((fAbs + f13) * 255.0f);
                break;
            case 5:
            case 6:
                iRound = Math.round((fAbs + f13) * 255.0f);
                iRound2 = Math.round(f13 * 255.0f);
                iRound3 = Math.round((fAbs2 + f13) * 255.0f);
                break;
            default:
                iRound3 = 0;
                iRound = 0;
                iRound2 = 0;
                break;
        }
        return Color.rgb(z(iRound, 0, 255), z(iRound2, 0, 255), z(iRound3, 0, 255));
    }

    @InterfaceC4337k
    public static int b(@InterfaceC4348w(from = 0.0d, to = f40124b) double d10, @InterfaceC4348w(from = -128.0d, to = 127.0d) double d11, @InterfaceC4348w(from = -128.0d, to = 127.0d) double d12) {
        double[] dArrB = B();
        c(d10, d11, d12, dArrB);
        return h(dArrB[0], dArrB[1], dArrB[2]);
    }

    public static void c(@InterfaceC4348w(from = 0.0d, to = f40124b) double d10, @InterfaceC4348w(from = -128.0d, to = 127.0d) double d11, @InterfaceC4348w(from = -128.0d, to = 127.0d) double d12, @NonNull double[] dArr) {
        double d13 = (d10 + 16.0d) / 116.0d;
        double d14 = (d11 / 500.0d) + d13;
        double d15 = d13 - (d12 / 200.0d);
        double dPow = Math.pow(d14, 3.0d);
        if (dPow <= 0.008856d) {
            dPow = ((d14 * 116.0d) - 16.0d) / 903.3d;
        }
        double dPow2 = d10 > 7.9996247999999985d ? Math.pow(d13, 3.0d) : d10 / 903.3d;
        double dPow3 = Math.pow(d15, 3.0d);
        if (dPow3 <= 0.008856d) {
            dPow3 = ((d15 * 116.0d) - 16.0d) / 903.3d;
        }
        dArr[0] = dPow * 95.047d;
        dArr[1] = dPow2 * 100.0d;
        dArr[2] = dPow3 * 108.883d;
    }

    @InterfaceC4337k
    public static int d(@InterfaceC4348w(from = 0.0d, to = 360.0d, toInclusive = false) float f10, @InterfaceC4348w(from = 0.0d, to = C4970w.f217977d, toInclusive = false) float f11, @InterfaceC4348w(from = 0.0d, to = f40124b) float f12) {
        return D0.a.r(f10, f11, f12, D0.o.f17667k);
    }

    public static void e(@e.D(from = 0, to = S0.f86828d) int i10, @e.D(from = 0, to = S0.f86828d) int i11, @e.D(from = 0, to = S0.f86828d) int i12, @NonNull float[] fArr) {
        float fA;
        float fAbs;
        float f10 = i10 / 255.0f;
        float f11 = i11 / 255.0f;
        float f12 = i12 / 255.0f;
        float fMax = Math.max(f10, Math.max(f11, f12));
        float fMin = Math.min(f10, Math.min(f11, f12));
        float f13 = fMax - fMin;
        float f14 = (fMax + fMin) / 2.0f;
        if (fMax == fMin) {
            fA = 0.0f;
            fAbs = 0.0f;
        } else {
            fA = fMax == f10 ? ((f11 - f12) / f13) % 6.0f : fMax == f11 ? androidx.compose.animation.W.a(f12, f10, f13, 2.0f) : androidx.compose.animation.W.a(f10, f11, f13, 4.0f);
            fAbs = f13 / (1.0f - Math.abs((2.0f * f14) - 1.0f));
        }
        float f15 = (fA * 60.0f) % 360.0f;
        if (f15 < 0.0f) {
            f15 += 360.0f;
        }
        fArr[0] = y(f15, 0.0f, 360.0f);
        fArr[1] = y(fAbs, 0.0f, 1.0f);
        fArr[2] = y(f14, 0.0f, 1.0f);
    }

    public static void f(@e.D(from = 0, to = S0.f86828d) int i10, @e.D(from = 0, to = S0.f86828d) int i11, @e.D(from = 0, to = S0.f86828d) int i12, @NonNull double[] dArr) {
        g(i10, i11, i12, dArr);
        i(dArr[0], dArr[1], dArr[2], dArr);
    }

    public static void g(@e.D(from = 0, to = S0.f86828d) int i10, @e.D(from = 0, to = S0.f86828d) int i11, @e.D(from = 0, to = S0.f86828d) int i12, @NonNull double[] dArr) {
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d10 = ((double) i10) / 255.0d;
        double dPow = d10 < 0.04045d ? d10 / 12.92d : Math.pow((d10 + 0.055d) / 1.055d, 2.4d);
        double d11 = ((double) i11) / 255.0d;
        double dPow2 = d11 < 0.04045d ? d11 / 12.92d : Math.pow((d11 + 0.055d) / 1.055d, 2.4d);
        double d12 = ((double) i12) / 255.0d;
        double dPow3 = d12 < 0.04045d ? d12 / 12.92d : Math.pow((d12 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * dPow3) + (0.3576d * dPow2) + (0.4124d * dPow)) * 100.0d;
        dArr[1] = ((0.0722d * dPow3) + (0.7152d * dPow2) + (0.2126d * dPow)) * 100.0d;
        dArr[2] = ((dPow3 * 0.9505d) + (dPow2 * 0.1192d) + (dPow * 0.0193d)) * 100.0d;
    }

    @InterfaceC4337k
    public static int h(@InterfaceC4348w(from = 0.0d, to = f40123a) double d10, @InterfaceC4348w(from = 0.0d, to = f40124b) double d11, @InterfaceC4348w(from = 0.0d, to = f40125c) double d12) {
        double d13 = (((-0.4986d) * d12) + (((-1.5372d) * d11) + (3.2406d * d10))) / 100.0d;
        double d14 = ((0.0415d * d12) + ((1.8758d * d11) + ((-0.9689d) * d10))) / 100.0d;
        double d15 = ((1.057d * d12) + (((-0.204d) * d11) + (0.0557d * d10))) / 100.0d;
        return Color.rgb(z((int) Math.round((d13 > 0.0031308d ? (Math.pow(d13, 0.4166666666666667d) * 1.055d) - 0.055d : d13 * 12.92d) * 255.0d), 0, 255), z((int) Math.round((d14 > 0.0031308d ? (Math.pow(d14, 0.4166666666666667d) * 1.055d) - 0.055d : d14 * 12.92d) * 255.0d), 0, 255), z((int) Math.round((d15 > 0.0031308d ? (Math.pow(d15, 0.4166666666666667d) * 1.055d) - 0.055d : d15 * 12.92d) * 255.0d), 0, 255));
    }

    public static void i(@InterfaceC4348w(from = 0.0d, to = f40123a) double d10, @InterfaceC4348w(from = 0.0d, to = f40124b) double d11, @InterfaceC4348w(from = 0.0d, to = f40125c) double d12, @NonNull double[] dArr) {
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outLab must have a length of 3.");
        }
        double dC = C(d10 / 95.047d);
        double dC2 = C(d11 / 100.0d);
        double dC3 = C(d12 / 108.883d);
        dArr[0] = Math.max(0.0d, (116.0d * dC2) - 16.0d);
        dArr[1] = (dC - dC2) * 500.0d;
        dArr[2] = (dC2 - dC3) * 200.0d;
    }

    @InterfaceC4337k
    public static int j(@InterfaceC4337k int i10, @InterfaceC4337k int i11, @InterfaceC4348w(from = 0.0d, to = 1.0d) float f10) {
        float f11 = 1.0f - f10;
        return Color.argb((int) ((Color.alpha(i11) * f10) + (Color.alpha(i10) * f11)), (int) ((Color.red(i11) * f10) + (Color.red(i10) * f11)), (int) ((Color.green(i11) * f10) + (Color.green(i10) * f11)), (int) ((Color.blue(i11) * f10) + (Color.blue(i10) * f11)));
    }

    public static void k(@NonNull float[] fArr, @NonNull float[] fArr2, @InterfaceC4348w(from = 0.0d, to = 1.0d) float f10, @NonNull float[] fArr3) {
        if (fArr3.length != 3) {
            throw new IllegalArgumentException("result must have a length of 3.");
        }
        float f11 = 1.0f - f10;
        fArr3[0] = p(fArr[0], fArr2[0], f10);
        fArr3[1] = (fArr2[1] * f10) + (fArr[1] * f11);
        fArr3[2] = (fArr2[2] * f10) + (fArr[2] * f11);
    }

    public static void l(@NonNull double[] dArr, @NonNull double[] dArr2, @InterfaceC4348w(from = 0.0d, to = 1.0d) double d10, @NonNull double[] dArr3) {
        if (dArr3.length != 3) {
            throw new IllegalArgumentException("outResult must have a length of 3.");
        }
        double d11 = 1.0d - d10;
        dArr3[0] = (dArr2[0] * d10) + (dArr[0] * d11);
        dArr3[1] = (dArr2[1] * d10) + (dArr[1] * d11);
        dArr3[2] = (dArr2[2] * d10) + (dArr[2] * d11);
    }

    public static double m(@InterfaceC4337k int i10, @InterfaceC4337k int i11) {
        if (Color.alpha(i11) != 255) {
            throw new IllegalArgumentException(C5377a.a(i11, new StringBuilder("background can not be translucent: #")));
        }
        if (Color.alpha(i10) < 255) {
            i10 = v(i10, i11);
        }
        double dN = n(i10) + 0.05d;
        double dN2 = n(i11) + 0.05d;
        return Math.max(dN, dN2) / Math.min(dN, dN2);
    }

    @InterfaceC4348w(from = 0.0d, to = 1.0d)
    public static double n(@InterfaceC4337k int i10) {
        double[] dArrB = B();
        t(i10, dArrB);
        return dArrB[1] / 100.0d;
    }

    public static int o(@InterfaceC4337k int i10, @InterfaceC4337k int i11, float f10) {
        int i12 = 255;
        if (Color.alpha(i11) != 255) {
            throw new IllegalArgumentException(C5377a.a(i11, new StringBuilder("background can not be translucent: #")));
        }
        double d10 = f10;
        if (m(D(i10, 255), i11) < d10) {
            return -1;
        }
        int i13 = 0;
        for (int i14 = 0; i14 <= 10 && i12 - i13 > 1; i14++) {
            int i15 = (i13 + i12) / 2;
            if (m(D(i10, i15), i11) < d10) {
                i13 = i15;
            } else {
                i12 = i15;
            }
        }
        return i12;
    }

    @e.f0
    public static float p(float f10, float f11, float f12) {
        if (Math.abs(f11 - f10) > 180.0f) {
            if (f11 > f10) {
                f10 += 360.0f;
            } else {
                f11 += 360.0f;
            }
        }
        return (((f11 - f10) * f12) + f10) % 360.0f;
    }

    public static void q(@InterfaceC4337k int i10, @NonNull float[] fArr) {
        e(Color.red(i10), Color.green(i10), Color.blue(i10), fArr);
    }

    public static void r(@InterfaceC4337k int i10, @NonNull double[] dArr) {
        f(Color.red(i10), Color.green(i10), Color.blue(i10), dArr);
    }

    public static void s(@InterfaceC4337k int i10, @NonNull @e.Y(3) float[] fArr) {
        D0.a.n(i10, fArr);
    }

    public static void t(@InterfaceC4337k int i10, @NonNull double[] dArr) {
        g(Color.red(i10), Color.green(i10), Color.blue(i10), dArr);
    }

    public static int u(int i10, int i11) {
        return 255 - (((255 - i10) * (255 - i11)) / 255);
    }

    public static int v(@InterfaceC4337k int i10, @InterfaceC4337k int i11) {
        int iAlpha = Color.alpha(i11);
        int iAlpha2 = Color.alpha(i10);
        int iU = u(iAlpha2, iAlpha);
        return Color.argb(iU, x(Color.red(i10), iAlpha2, Color.red(i11), iAlpha, iU), x(Color.green(i10), iAlpha2, Color.green(i11), iAlpha, iU), x(Color.blue(i10), iAlpha2, Color.blue(i11), iAlpha, iU));
    }

    @NonNull
    @e.T(26)
    public static Color w(@NonNull Color color, @NonNull Color color2) {
        return a.a(color, color2);
    }

    public static int x(int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            return 0;
        }
        return (((255 - i11) * (i12 * i13)) + ((i10 * 255) * i11)) / (i14 * 255);
    }

    public static float y(float f10, float f11, float f12) {
        return f10 < f11 ? f11 : Math.min(f10, f12);
    }

    public static int z(int i10, int i11, int i12) {
        return i10 < i11 ? i11 : Math.min(i10, i12);
    }
}
