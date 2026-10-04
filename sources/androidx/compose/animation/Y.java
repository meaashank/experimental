package androidx.compose.animation;

import k0.InterfaceC4814e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f87540a = 0.35f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f87541b = 0.5f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f87542c = 1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f87543d = 0.175f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f87544e = 0.35000002f;

    public static final void b(float[] fArr, float[] fArr2, int i10) {
        float fA;
        float f10;
        float f11;
        float f12;
        float f13;
        float fA2;
        float f14;
        float f15;
        float f16;
        float f17 = 0.0f;
        int i11 = 0;
        float f18 = 0.0f;
        while (true) {
            float f19 = 1.0f;
            if (i11 >= i10) {
                fArr2[i10] = 1.0f;
                fArr[i10] = 1.0f;
                return;
            }
            float f20 = i11 / i10;
            float f21 = 1.0f;
            while (true) {
                fA = W.a(f21, f17, 2.0f, f17);
                f10 = f19 - fA;
                f11 = fA * 3.0f * f10;
                f12 = fA * fA * fA;
                float fA3 = X.a(fA, 0.35000002f, f10 * 0.175f, f11) + f12;
                f13 = f19;
                if (Math.abs(fA3 - f20) < 1.0E-5d) {
                    break;
                }
                if (fA3 > f20) {
                    f21 = fA;
                } else {
                    f17 = fA;
                }
                f19 = f13;
            }
            float f22 = 0.5f;
            fArr[i11] = (((f10 * 0.5f) + fA) * f11) + f12;
            float f23 = f13;
            while (true) {
                fA2 = W.a(f23, f18, 2.0f, f18);
                f14 = f13 - fA2;
                f15 = fA2 * 3.0f * f14;
                f16 = fA2 * fA2 * fA2;
                float fA4 = X.a(f14, f22, fA2, f15) + f16;
                float f24 = f20;
                if (Math.abs(fA4 - f20) >= 1.0E-5d) {
                    if (fA4 > f24) {
                        f23 = fA2;
                    } else {
                        f18 = fA2;
                    }
                    f20 = f24;
                    f22 = 0.5f;
                }
            }
            fArr2[i11] = (((fA2 * 0.35000002f) + (f14 * 0.175f)) * f15) + f16;
            i11++;
        }
    }

    @NotNull
    public static final <T> androidx.compose.animation.core.C<T> c(@NotNull InterfaceC4814e interfaceC4814e) {
        return new androidx.compose.animation.core.D(new Z(interfaceC4814e));
    }
}
