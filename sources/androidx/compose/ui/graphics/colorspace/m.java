package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.M0;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.V;
import okio.internal.ZipKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nLab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Lab.kt\nandroidx/compose/ui/graphics/colorspace/Lab\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,142:1\n71#2,16:143\n71#2,16:159\n71#2,16:175\n71#2,16:191\n71#2,16:207\n71#2,16:226\n71#2,16:242\n71#2,16:258\n71#2,16:274\n71#2,16:290\n71#2,16:306\n71#2,16:322\n71#2,16:338\n63#3,3:223\n*S KotlinDebug\n*F\n+ 1 Lab.kt\nandroidx/compose/ui/graphics/colorspace/Lab\n*L\n48#1:143,16\n49#1:159,16\n50#1:175,16\n67#1:191,16\n68#1:207,16\n79#1:226,16\n80#1:242,16\n107#1:258,16\n108#1:274,16\n109#1:290,16\n128#1:306,16\n129#1:322,16\n130#1:338,16\n75#1:223,3\n*E\n"})
public final class m extends AbstractC2015c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final a f101037g = new a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final float f101038h = 0.008856452f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final float f101039i = 7.787037f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final float f101040j = 0.13793103f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final float f101041k = 0.20689656f;

    public static final class a {
        public a() {
        }

        public a(C4969v c4969v) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(@NotNull String str, int i10) {
        super(str, C2014b.f100982e, i10);
        C2014b.f100979b.getClass();
    }

    @Override // androidx.compose.ui.graphics.colorspace.AbstractC2015c
    @NotNull
    public float[] b(@NotNull float[] fArr) {
        float f10 = fArr[0];
        l lVar = l.f101026a;
        lVar.getClass();
        float[] fArr2 = l.f101036k;
        float f11 = f10 / fArr2[0];
        float f12 = fArr[1];
        lVar.getClass();
        float f13 = f12 / fArr2[1];
        float f14 = fArr[2];
        lVar.getClass();
        float f15 = f14 / fArr2[2];
        float fCbrt = f11 > 0.008856452f ? (float) Math.cbrt(f11) : (f11 * 7.787037f) + 0.13793103f;
        float fCbrt2 = f13 > 0.008856452f ? (float) Math.cbrt(f13) : (f13 * 7.787037f) + 0.13793103f;
        float f16 = (116.0f * fCbrt2) - 16.0f;
        float f17 = (fCbrt - fCbrt2) * 500.0f;
        float fCbrt3 = (fCbrt2 - (f15 > 0.008856452f ? (float) Math.cbrt(f15) : (f15 * 7.787037f) + 0.13793103f)) * 200.0f;
        if (f16 < 0.0f) {
            f16 = 0.0f;
        }
        if (f16 > 100.0f) {
            f16 = 100.0f;
        }
        fArr[0] = f16;
        if (f17 < -128.0f) {
            f17 = -128.0f;
        }
        if (f17 > 128.0f) {
            f17 = 128.0f;
        }
        fArr[1] = f17;
        if (fCbrt3 < -128.0f) {
            fCbrt3 = -128.0f;
        }
        fArr[2] = fCbrt3 <= 128.0f ? fCbrt3 : 128.0f;
        return fArr;
    }

    @Override // androidx.compose.ui.graphics.colorspace.AbstractC2015c
    public float e(int i10) {
        return i10 == 0 ? 100.0f : 128.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.AbstractC2015c
    public float f(int i10) {
        return i10 == 0 ? 0.0f : -128.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.AbstractC2015c
    public boolean j() {
        return true;
    }

    @Override // androidx.compose.ui.graphics.colorspace.AbstractC2015c
    public long k(float f10, float f11, float f12) {
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 100.0f) {
            f10 = 100.0f;
        }
        if (f11 < -128.0f) {
            f11 = -128.0f;
        }
        if (f11 > 128.0f) {
            f11 = 128.0f;
        }
        float f13 = (f10 + 16.0f) / 116.0f;
        float f14 = (f11 * 0.002f) + f13;
        float f15 = f14 > 0.20689656f ? f14 * f14 * f14 : (f14 - 0.13793103f) * 0.12841855f;
        float f16 = f13 > 0.20689656f ? f13 * f13 * f13 : (f13 - 0.13793103f) * 0.12841855f;
        l lVar = l.f101026a;
        lVar.getClass();
        float[] fArr = l.f101036k;
        float f17 = f15 * fArr[0];
        lVar.getClass();
        return (((long) Float.floatToRawIntBits(f16 * fArr[1])) & ZipKt.f225990j) | (((long) Float.floatToRawIntBits(f17)) << 32);
    }

    @Override // androidx.compose.ui.graphics.colorspace.AbstractC2015c
    @NotNull
    public float[] m(@NotNull float[] fArr) {
        float f10 = fArr[0];
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 100.0f) {
            f10 = 100.0f;
        }
        fArr[0] = f10;
        float f11 = fArr[1];
        if (f11 < -128.0f) {
            f11 = -128.0f;
        }
        if (f11 > 128.0f) {
            f11 = 128.0f;
        }
        fArr[1] = f11;
        float f12 = fArr[2];
        float f13 = f12 >= -128.0f ? f12 : -128.0f;
        float f14 = f13 <= 128.0f ? f13 : 128.0f;
        fArr[2] = f14;
        float f15 = (f10 + 16.0f) / 116.0f;
        float f16 = (f11 * 0.002f) + f15;
        float f17 = f15 - (f14 * 0.005f);
        float f18 = f16 > 0.20689656f ? f16 * f16 * f16 : (f16 - 0.13793103f) * 0.12841855f;
        float f19 = f15 > 0.20689656f ? f15 * f15 * f15 : (f15 - 0.13793103f) * 0.12841855f;
        float f20 = f17 > 0.20689656f ? f17 * f17 * f17 : (f17 - 0.13793103f) * 0.12841855f;
        l lVar = l.f101026a;
        lVar.getClass();
        float[] fArr2 = l.f101036k;
        fArr[0] = f18 * fArr2[0];
        lVar.getClass();
        fArr[1] = f19 * fArr2[1];
        lVar.getClass();
        fArr[2] = f20 * fArr2[2];
        return fArr;
    }

    @Override // androidx.compose.ui.graphics.colorspace.AbstractC2015c
    public float n(float f10, float f11, float f12) {
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 100.0f) {
            f10 = 100.0f;
        }
        if (f12 < -128.0f) {
            f12 = -128.0f;
        }
        if (f12 > 128.0f) {
            f12 = 128.0f;
        }
        float f13 = ((f10 + 16.0f) / 116.0f) - (f12 * 0.005f);
        float f14 = f13 > 0.20689656f ? f13 * f13 * f13 : 0.12841855f * (f13 - 0.13793103f);
        l.f101026a.getClass();
        return f14 * l.f101036k[2];
    }

    @Override // androidx.compose.ui.graphics.colorspace.AbstractC2015c
    public long o(float f10, float f11, float f12, float f13, @NotNull AbstractC2015c abstractC2015c) {
        l lVar = l.f101026a;
        lVar.getClass();
        float[] fArr = l.f101036k;
        float f14 = f10 / fArr[0];
        lVar.getClass();
        float f15 = f11 / fArr[1];
        lVar.getClass();
        float f16 = f12 / fArr[2];
        float fCbrt = f14 > 0.008856452f ? (float) Math.cbrt(f14) : (f14 * 7.787037f) + 0.13793103f;
        float fCbrt2 = f15 > 0.008856452f ? (float) Math.cbrt(f15) : (f15 * 7.787037f) + 0.13793103f;
        float f17 = (116.0f * fCbrt2) - 16.0f;
        float f18 = (fCbrt - fCbrt2) * 500.0f;
        float fCbrt3 = (fCbrt2 - (f16 > 0.008856452f ? (float) Math.cbrt(f16) : (f16 * 7.787037f) + 0.13793103f)) * 200.0f;
        if (f17 < 0.0f) {
            f17 = 0.0f;
        }
        if (f17 > 100.0f) {
            f17 = 100.0f;
        }
        if (f18 < -128.0f) {
            f18 = -128.0f;
        }
        if (f18 > 128.0f) {
            f18 = 128.0f;
        }
        if (fCbrt3 < -128.0f) {
            fCbrt3 = -128.0f;
        }
        return M0.a(f17, f18, fCbrt3 <= 128.0f ? fCbrt3 : 128.0f, f13, abstractC2015c);
    }
}
