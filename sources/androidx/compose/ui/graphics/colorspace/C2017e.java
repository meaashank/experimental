package androidx.compose.ui.graphics.colorspace;

import androidx.collection.C1562v0;
import androidx.compose.ui.graphics.colorspace.C2014b;
import androidx.compose.ui.graphics.colorspace.i;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.colorspace.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nColorSpace.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorSpace.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpaceKt\n+ 2 Connector.kt\nandroidx/compose/ui/graphics/colorspace/ConnectorKt\n+ 3 IntObjectMap.kt\nandroidx/collection/MutableIntObjectMap\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,802:1\n347#2:803\n728#3:804\n1#4:805\n*S KotlinDebug\n*F\n+ 1 ColorSpace.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpaceKt\n*L\n460#1:803\n460#1:804\n460#1:805\n*E\n"})
public final class C2017e {
    public static final double a(double d10, double d11, double d12, double d13, double d14, double d15) {
        return Math.copySign(t(d10 < 0.0d ? -d10 : d10, d11, d12, d13, d14, d15), d10);
    }

    public static final double b(double d10, double d11, double d12, double d13, double d14, double d15) {
        return Math.copySign(v(d10 < 0.0d ? -d10 : d10, d11, d12, d13, d14, d15), d10);
    }

    @dd.k
    @NotNull
    public static final AbstractC2015c c(@NotNull AbstractC2015c abstractC2015c, @NotNull D d10) {
        return e(abstractC2015c, d10, null, 2, null);
    }

    @dd.k
    @NotNull
    public static final AbstractC2015c d(@NotNull AbstractC2015c abstractC2015c, @NotNull D d10, @NotNull AbstractC2013a abstractC2013a) {
        long j10 = abstractC2015c.f100989b;
        C2014b.f100979b.getClass();
        if (C2014b.h(j10, C2014b.f100980c)) {
            Rgb rgb = (Rgb) abstractC2015c;
            if (!h(rgb.f100957g, d10)) {
                return new Rgb(rgb, n(f(abstractC2013a.f100978a, rgb.f100957g.g(), d10.g()), rgb.f100962l), d10);
            }
        }
        return abstractC2015c;
    }

    public static AbstractC2015c e(AbstractC2015c abstractC2015c, D d10, AbstractC2013a abstractC2013a, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            AbstractC2013a.f100974b.getClass();
            abstractC2013a = AbstractC2013a.f100975c;
        }
        return d(abstractC2015c, d10, abstractC2013a);
    }

    @NotNull
    public static final float[] f(@NotNull float[] fArr, @NotNull float[] fArr2, @NotNull float[] fArr3) {
        p(fArr, fArr2);
        p(fArr, fArr3);
        return n(m(fArr), o(new float[]{fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]}, fArr));
    }

    public static final boolean g(@NotNull C c10, @Nullable C c11) {
        return c11 != null && Math.abs(c10.f100947b - c11.f100947b) < 0.001d && Math.abs(c10.f100948c - c11.f100948c) < 0.001d && Math.abs(c10.f100949d - c11.f100949d) < 0.001d && Math.abs(c10.f100950e - c11.f100950e) < 0.002d && Math.abs(c10.f100951f - c11.f100951f) < 0.001d && Math.abs(c10.f100952g - c11.f100952g) < 0.001d && Math.abs(c10.f100946a - c11.f100946a) < 0.001d;
    }

    public static final boolean h(@NotNull D d10, @NotNull D d11) {
        if (d10 == d11) {
            return true;
        }
        return Math.abs(d10.f100953a - d11.f100953a) < 0.001f && Math.abs(d10.f100954b - d11.f100954b) < 0.001f;
    }

    public static final boolean i(@NotNull float[] fArr, @NotNull float[] fArr2) {
        if (fArr == fArr2) {
            return true;
        }
        int length = fArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (Float.compare(fArr[i10], fArr2[i10]) != 0 && Math.abs(fArr[i10] - fArr2[i10]) > 0.001f) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public static final i j(@NotNull AbstractC2015c abstractC2015c, @NotNull AbstractC2015c abstractC2015c2, int i10) {
        int i11 = abstractC2015c.f100990c;
        int i12 = abstractC2015c2.f100990c;
        if ((i11 | i12) < 0) {
            return l(abstractC2015c, abstractC2015c2, i10);
        }
        C1562v0<i> c1562v0B = j.b();
        int i13 = i11 | (i12 << 6) | (i10 << 12);
        i iVarN = c1562v0B.n(i13);
        if (iVarN == null) {
            iVarN = l(abstractC2015c, abstractC2015c2, i10);
            c1562v0B.j0(i13, iVarN);
        }
        return iVarN;
    }

    public static i k(AbstractC2015c abstractC2015c, AbstractC2015c abstractC2015c2, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            h.f100991a.getClass();
            abstractC2015c2 = h.f100996f;
        }
        if ((i11 & 2) != 0) {
            o.f101047b.getClass();
            i10 = o.f101048c;
        }
        return j(abstractC2015c, abstractC2015c2, i10);
    }

    public static final i l(AbstractC2015c abstractC2015c, AbstractC2015c abstractC2015c2, int i10) {
        if (abstractC2015c == abstractC2015c2) {
            return i.f101015g.c(abstractC2015c);
        }
        long j10 = abstractC2015c.f100989b;
        C2014b.a aVar = C2014b.f100979b;
        aVar.getClass();
        if (C2014b.h(j10, C2014b.f100980c)) {
            long j11 = abstractC2015c2.f100989b;
            aVar.getClass();
            if (C2014b.h(j11, C2014b.f100980c)) {
                return new i.b((Rgb) abstractC2015c, (Rgb) abstractC2015c2, i10);
            }
        }
        return new i(abstractC2015c, abstractC2015c2, i10);
    }

    @NotNull
    public static final float[] m(@NotNull float[] fArr) {
        float f10 = fArr[0];
        float f11 = fArr[3];
        float f12 = fArr[6];
        float f13 = fArr[1];
        float f14 = fArr[4];
        float f15 = fArr[7];
        float f16 = fArr[2];
        float f17 = fArr[5];
        float f18 = fArr[8];
        float f19 = (f14 * f18) - (f15 * f17);
        float f20 = (f15 * f16) - (f13 * f18);
        float f21 = (f13 * f17) - (f14 * f16);
        float f22 = (f12 * f21) + (f11 * f20) + (f10 * f19);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f19 / f22;
        fArr2[1] = f20 / f22;
        fArr2[2] = f21 / f22;
        fArr2[3] = C2016d.a(f11, f18, f12 * f17, f22);
        fArr2[4] = C2016d.a(f12, f16, f18 * f10, f22);
        fArr2[5] = C2016d.a(f10, f17, f16 * f11, f22);
        fArr2[6] = C2016d.a(f12, f14, f11 * f15, f22);
        fArr2[7] = C2016d.a(f10, f15, f12 * f13, f22);
        fArr2[8] = C2016d.a(f11, f13, f10 * f14, f22);
        return fArr2;
    }

    @NotNull
    public static final float[] n(@NotNull float[] fArr, @NotNull float[] fArr2) {
        float f10 = fArr[0];
        float f11 = fArr2[0];
        float f12 = fArr[3];
        float f13 = fArr2[1];
        float f14 = fArr[6];
        float f15 = fArr2[2];
        float f16 = (f14 * f15) + (f12 * f13) + (f10 * f11);
        float f17 = fArr[1];
        float f18 = fArr[4];
        float f19 = fArr[7];
        float f20 = (f19 * f15) + (f18 * f13) + (f17 * f11);
        float f21 = fArr[2];
        float f22 = fArr[5];
        float f23 = fArr[8];
        float f24 = (f15 * f23) + (f13 * f22) + (f11 * f21);
        float f25 = fArr2[3];
        float f26 = fArr2[4];
        float f27 = fArr2[5];
        float f28 = (f14 * f27) + (f12 * f26) + (f10 * f25);
        float f29 = (f19 * f27) + (f18 * f26) + (f17 * f25);
        float f30 = (f27 * f23) + (f26 * f22) + (f25 * f21);
        float f31 = fArr2[6];
        float f32 = fArr2[7];
        float f33 = (f12 * f32) + (f10 * f31);
        float f34 = fArr2[8];
        return new float[]{f16, f20, f24, f28, f29, f30, (f14 * f34) + f33, (f19 * f34) + (f18 * f32) + (f17 * f31), (f23 * f34) + (f22 * f32) + (f21 * f31)};
    }

    @NotNull
    public static final float[] o(@NotNull float[] fArr, @NotNull float[] fArr2) {
        float f10 = fArr[0];
        float f11 = fArr2[0] * f10;
        float f12 = fArr[1];
        float f13 = fArr2[1] * f12;
        float f14 = fArr[2];
        return new float[]{f11, f13, fArr2[2] * f14, fArr2[3] * f10, fArr2[4] * f12, fArr2[5] * f14, f10 * fArr2[6], f12 * fArr2[7], f14 * fArr2[8]};
    }

    @NotNull
    public static final float[] p(@NotNull float[] fArr, @NotNull float[] fArr2) {
        float f10 = fArr2[0];
        float f11 = fArr2[1];
        float f12 = fArr2[2];
        fArr2[0] = (fArr[6] * f12) + (fArr[3] * f11) + (fArr[0] * f10);
        fArr2[1] = (fArr[7] * f12) + (fArr[4] * f11) + (fArr[1] * f10);
        fArr2[2] = (fArr[8] * f12) + (fArr[5] * f11) + (fArr[2] * f10);
        return fArr2;
    }

    public static final float q(@NotNull float[] fArr, float f10, float f11, float f12) {
        return (fArr[6] * f12) + (fArr[3] * f11) + (fArr[0] * f10);
    }

    public static final float r(@NotNull float[] fArr, float f10, float f11, float f12) {
        return (fArr[7] * f12) + (fArr[4] * f11) + (fArr[1] * f10);
    }

    public static final float s(@NotNull float[] fArr, float f10, float f11, float f12) {
        return (fArr[8] * f12) + (fArr[5] * f11) + (fArr[2] * f10);
    }

    public static final double t(double d10, double d11, double d12, double d13, double d14, double d15) {
        return d10 >= d14 * d13 ? (Math.pow(d10, 1.0d / d15) - d12) / d11 : d10 / d13;
    }

    public static final double u(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        return d10 >= d14 * d13 ? (Math.pow(d10 - d15, 1.0d / d17) - d12) / d11 : (d10 - d16) / d13;
    }

    public static final double v(double d10, double d11, double d12, double d13, double d14, double d15) {
        return d10 >= d14 ? Math.pow((d11 * d10) + d12, d15) : d13 * d10;
    }

    public static final double w(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        return d10 >= d14 ? Math.pow((d11 * d10) + d12, d17) + d15 : (d13 * d10) + d16;
    }
}
