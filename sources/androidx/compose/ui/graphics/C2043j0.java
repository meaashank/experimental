package androidx.compose.ui.graphics;

import android.graphics.BitmapShader;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.os.Build;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nAndroidShader.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidShader.android.kt\nandroidx/compose/ui/graphics/AndroidShader_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,206:1\n69#2,6:207\n*S KotlinDebug\n*F\n+ 1 AndroidShader.android.kt\nandroidx/compose/ui/graphics/AndroidShader_androidKt\n*L\n141#1:207,6\n*E\n"})
public final class C2043j0 {
    @NotNull
    public static final Shader a(@NotNull InterfaceC2025e2 interfaceC2025e2, int i10, int i11) {
        return new BitmapShader(V.b(interfaceC2025e2), C2051l0.b(i10), C2051l0.b(i11));
    }

    @NotNull
    public static final Shader b(long j10, long j11, @NotNull List<K0> list, @Nullable List<Float> list2, int i10) {
        h(list, list2);
        int iE = e(list);
        return new LinearGradient(P.g.p(j10), P.g.r(j10), P.g.p(j11), P.g.r(j11), f(list, iE), g(list2, list, iE), C2051l0.b(i10));
    }

    @NotNull
    public static final Shader c(long j10, float f10, @NotNull List<K0> list, @Nullable List<Float> list2, int i10) {
        h(list, list2);
        int iE = e(list);
        return new RadialGradient(P.g.p(j10), P.g.r(j10), f10, f(list, iE), g(list2, list, iE), C2051l0.b(i10));
    }

    @NotNull
    public static final Shader d(long j10, @NotNull List<K0> list, @Nullable List<Float> list2) {
        h(list, list2);
        int iE = e(list);
        return new SweepGradient(P.g.p(j10), P.g.r(j10), f(list, iE), g(list2, list, iE));
    }

    @e.f0
    public static final int e(@NotNull List<K0> list) {
        int i10 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            return 0;
        }
        int iL = kotlin.collections.I.L(list);
        for (int i11 = 1; i11 < iL; i11++) {
            if (K0.A(list.get(i11).f100747a) == 0.0f) {
                i10++;
            }
        }
        return i10;
    }

    @e.f0
    @NotNull
    public static final int[] f(@NotNull List<K0> list, int i10) {
        int i11;
        int i12 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            int size = list.size();
            int[] iArr = new int[size];
            while (i12 < size) {
                iArr[i12] = M0.t(list.get(i12).f100747a);
                i12++;
            }
            return iArr;
        }
        int[] iArr2 = new int[list.size() + i10];
        int iL = kotlin.collections.I.L(list);
        int size2 = list.size();
        int i13 = 0;
        while (i12 < size2) {
            long j10 = list.get(i12).f100747a;
            if (K0.A(j10) == 0.0f) {
                if (i12 == 0) {
                    i11 = i13 + 1;
                    iArr2[i13] = M0.t(K0.w(list.get(1).f100747a, 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                } else if (i12 == iL) {
                    i11 = i13 + 1;
                    iArr2[i13] = M0.t(K0.w(list.get(i12 - 1).f100747a, 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                } else {
                    int i14 = i13 + 1;
                    iArr2[i13] = M0.t(K0.w(list.get(i12 - 1).f100747a, 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                    i13 += 2;
                    iArr2[i14] = M0.t(K0.w(list.get(i12 + 1).f100747a, 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                }
                i13 = i11;
            } else {
                iArr2[i13] = M0.t(j10);
                i13++;
            }
            i12++;
        }
        return iArr2;
    }

    @e.f0
    @Nullable
    public static final float[] g(@Nullable List<Float> list, @NotNull List<K0> list2, int i10) {
        if (i10 == 0) {
            if (list != null) {
                return kotlin.collections.U.X5(list);
            }
            return null;
        }
        float[] fArr = new float[list2.size() + i10];
        fArr[0] = list != null ? list.get(0).floatValue() : 0.0f;
        int iL = kotlin.collections.I.L(list2);
        int i11 = 1;
        for (int i12 = 1; i12 < iL; i12++) {
            long j10 = list2.get(i12).f100747a;
            float fFloatValue = list != null ? list.get(i12).floatValue() : i12 / kotlin.collections.I.L(list2);
            int i13 = i11 + 1;
            fArr[i11] = fFloatValue;
            if (K0.A(j10) == 0.0f) {
                i11 += 2;
                fArr[i13] = fFloatValue;
            } else {
                i11 = i13;
            }
        }
        fArr[i11] = list != null ? list.get(kotlin.collections.I.L(list2)).floatValue() : 1.0f;
        return fArr;
    }

    public static final void h(List<K0> list, List<Float> list2) {
        if (list2 == null) {
            if (list.size() < 2) {
                throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (list.size() != list2.size()) {
            throw new IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
    }
}
