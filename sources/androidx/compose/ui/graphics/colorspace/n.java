package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.M0;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.V;
import n0.C5238e;
import okio.internal.ZipKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nOklab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Oklab.kt\nandroidx/compose/ui/graphics/colorspace/Oklab\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 3 ColorSpace.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpaceKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,171:1\n71#2,16:172\n71#2,16:188\n71#2,16:204\n71#2,16:220\n71#2,16:236\n71#2,16:252\n71#2,16:276\n71#2,16:292\n71#2,16:308\n716#3:268\n735#3:269\n754#3:270\n716#3:271\n735#3:272\n716#3:324\n735#3:325\n754#3:326\n754#3:327\n716#3:328\n735#3:329\n754#3:330\n716#3:331\n735#3:332\n754#3:333\n63#4,3:273\n*S KotlinDebug\n*F\n+ 1 Oklab.kt\nandroidx/compose/ui/graphics/colorspace/Oklab\n*L\n48#1:172,16\n49#1:188,16\n50#1:204,16\n62#1:220,16\n63#1:236,16\n64#1:252,16\n81#1:276,16\n82#1:292,16\n83#1:308,16\n66#1:268\n67#1:269\n68#1:270\n74#1:271\n75#1:272\n85#1:324\n86#1:325\n87#1:326\n93#1:327\n105#1:328\n106#1:329\n107#1:330\n113#1:331\n114#1:332\n115#1:333\n77#1:273,3\n*E\n"})
public final class n extends AbstractC2015c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final a f101042g = new a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final float[] f101043h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final float[] f101044i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final float[] f101045j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final float[] f101046k;

    public static final class a {
        public a() {
        }

        public a(C4969v c4969v) {
        }
    }

    static {
        AbstractC2013a.f100974b.getClass();
        float[] fArr = AbstractC2013a.f100975c.f100978a;
        l lVar = l.f101026a;
        lVar.getClass();
        float[] fArrG = l.f101030e.g();
        lVar.getClass();
        float[] fArrN = C2017e.n(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, C2017e.f(fArr, fArrG, l.f101033h.g()));
        f101043h = fArrN;
        float[] fArr2 = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f101044i = fArr2;
        f101045j = C2017e.m(fArrN);
        f101046k = C2017e.m(fArr2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(@NotNull String str, int i10) {
        super(str, C2014b.f100982e, i10);
        C2014b.f100979b.getClass();
    }

    @Override // androidx.compose.ui.graphics.colorspace.AbstractC2015c
    @NotNull
    public float[] b(@NotNull float[] fArr) {
        C2017e.p(f101043h, fArr);
        fArr[0] = C5238e.a(fArr[0]);
        fArr[1] = C5238e.a(fArr[1]);
        fArr[2] = C5238e.a(fArr[2]);
        C2017e.p(f101044i, fArr);
        return fArr;
    }

    @Override // androidx.compose.ui.graphics.colorspace.AbstractC2015c
    public float e(int i10) {
        return i10 == 0 ? 1.0f : 0.5f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.AbstractC2015c
    public float f(int i10) {
        return i10 == 0 ? 0.0f : -0.5f;
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
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        if (f11 < -0.5f) {
            f11 = -0.5f;
        }
        if (f11 > 0.5f) {
            f11 = 0.5f;
        }
        if (f12 < -0.5f) {
            f12 = -0.5f;
        }
        float f13 = f12 <= 0.5f ? f12 : 0.5f;
        float[] fArr = f101046k;
        float f14 = (fArr[6] * f13) + (fArr[3] * f11) + (fArr[0] * f10);
        float f15 = (fArr[7] * f13) + (fArr[4] * f11) + (fArr[1] * f10);
        float f16 = (fArr[8] * f13) + (fArr[5] * f11) + (fArr[2] * f10);
        float f17 = f14 * f14 * f14;
        float f18 = f15 * f15 * f15;
        float f19 = f16 * f16 * f16;
        float[] fArr2 = f101045j;
        return (((long) Float.floatToRawIntBits((fArr2[7] * f19) + (fArr2[4] * f18) + (fArr2[1] * f17))) & ZipKt.f225990j) | (((long) Float.floatToRawIntBits((fArr2[6] * f19) + ((fArr2[3] * f18) + (fArr2[0] * f17)))) << 32);
    }

    @Override // androidx.compose.ui.graphics.colorspace.AbstractC2015c
    @NotNull
    public float[] m(@NotNull float[] fArr) {
        float f10 = fArr[0];
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        fArr[0] = f10;
        float f11 = fArr[1];
        if (f11 < -0.5f) {
            f11 = -0.5f;
        }
        if (f11 > 0.5f) {
            f11 = 0.5f;
        }
        fArr[1] = f11;
        float f12 = fArr[2];
        float f13 = f12 >= -0.5f ? f12 : -0.5f;
        fArr[2] = f13 <= 0.5f ? f13 : 0.5f;
        C2017e.p(f101046k, fArr);
        float f14 = fArr[0];
        fArr[0] = f14 * f14 * f14;
        float f15 = fArr[1];
        fArr[1] = f15 * f15 * f15;
        float f16 = fArr[2];
        fArr[2] = f16 * f16 * f16;
        C2017e.p(f101045j, fArr);
        return fArr;
    }

    @Override // androidx.compose.ui.graphics.colorspace.AbstractC2015c
    public float n(float f10, float f11, float f12) {
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        if (f11 < -0.5f) {
            f11 = -0.5f;
        }
        if (f11 > 0.5f) {
            f11 = 0.5f;
        }
        if (f12 < -0.5f) {
            f12 = -0.5f;
        }
        float f13 = f12 <= 0.5f ? f12 : 0.5f;
        float[] fArr = f101046k;
        float f14 = (fArr[6] * f13) + (fArr[3] * f11) + (fArr[0] * f10);
        float f15 = (fArr[7] * f13) + (fArr[4] * f11) + (fArr[1] * f10);
        float f16 = (fArr[8] * f13) + (fArr[5] * f11) + (fArr[2] * f10);
        float f17 = f14 * f14 * f14;
        float f18 = f15 * f15 * f15;
        float f19 = f16 * f16 * f16;
        float[] fArr2 = f101045j;
        return (fArr2[8] * f19) + (fArr2[5] * f18) + (fArr2[2] * f17);
    }

    @Override // androidx.compose.ui.graphics.colorspace.AbstractC2015c
    public long o(float f10, float f11, float f12, float f13, @NotNull AbstractC2015c abstractC2015c) {
        float[] fArr = f101043h;
        float f14 = (fArr[6] * f12) + (fArr[3] * f11) + (fArr[0] * f10);
        float f15 = (fArr[7] * f12) + (fArr[4] * f11) + (fArr[1] * f10);
        float f16 = (fArr[8] * f12) + (fArr[5] * f11) + (fArr[2] * f10);
        float fA = C5238e.a(f14);
        float fA2 = C5238e.a(f15);
        float fA3 = C5238e.a(f16);
        float[] fArr2 = f101044i;
        return M0.a((fArr2[6] * fA3) + (fArr2[3] * fA2) + (fArr2[0] * fA), (fArr2[7] * fA3) + (fArr2[4] * fA2) + (fArr2[1] * fA), (fArr2[8] * fA3) + (fArr2[5] * fA2) + (fArr2[2] * fA), f13, abstractC2015c);
    }
}
