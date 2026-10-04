package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.colorspace.AbstractC2015c;
import androidx.compose.ui.graphics.colorspace.C2014b;
import androidx.compose.ui.graphics.colorspace.Rgb;
import e.InterfaceC4337k;
import e.InterfaceC4348w;
import ed.InterfaceC4376a;
import kotlin.InterfaceC4850b0;
import n0.C5238e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nColor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/graphics/InlineClassHelperKt\n+ 4 Float16.kt\nandroidx/compose/ui/graphics/Float16Kt\n*L\n1#1,723:1\n641#1:1110\n641#1:1111\n641#1:1112\n696#1:1136\n71#2,16:724\n71#2,16:740\n71#2,16:756\n71#2,16:772\n71#2,16:802\n71#2,16:856\n71#2,16:910\n71#2,16:964\n71#2,16:1094\n71#2,16:1120\n33#3,7:788\n33#3,7:795\n33#3,7:1113\n605#4,38:818\n605#4,38:872\n605#4,38:926\n605#4,38:980\n605#4,38:1018\n605#4,38:1056\n*S KotlinDebug\n*F\n+ 1 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n621#1:1110\n622#1:1111\n623#1:1112\n708#1:1136\n432#1:724,16\n433#1:740,16\n434#1:756,16\n435#1:772,16\n449#1:802,16\n450#1:856,16\n451#1:910,16\n452#1:964,16\n591#1:1094,16\n676#1:1120,16\n440#1:788,7\n445#1:795,7\n666#1:1113,7\n449#1:818,38\n450#1:872,38\n451#1:926,38\n489#1:980,38\n490#1:1018,38\n491#1:1056,38\n*E\n"})
public final class M0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f100761a = 16;

    /* JADX WARN: Removed duplicated region for block: B:102:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x010f  */
    @androidx.compose.runtime.T1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long a(float r21, float r22, float r23, float r24, @org.jetbrains.annotations.NotNull androidx.compose.ui.graphics.colorspace.AbstractC2015c r25) {
        /*
            Method dump skipped, instruction units count: 484
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.M0.a(float, float, float, float, androidx.compose.ui.graphics.colorspace.c):long");
    }

    @androidx.compose.runtime.T1
    public static final long b(@InterfaceC4337k int i10) {
        long j10 = ((long) i10) << 32;
        K0.t(j10);
        return j10;
    }

    @androidx.compose.runtime.T1
    public static final long c(@e.D(from = 0, to = androidx.collection.S0.f86828d) int i10, @e.D(from = 0, to = androidx.collection.S0.f86828d) int i11, @e.D(from = 0, to = androidx.collection.S0.f86828d) int i12, @e.D(from = 0, to = androidx.collection.S0.f86828d) int i13) {
        return b(((i10 & 255) << 16) | ((i13 & 255) << 24) | ((i11 & 255) << 8) | (i12 & 255));
    }

    @androidx.compose.runtime.T1
    public static final long d(long j10) {
        long j11 = j10 << 32;
        K0.t(j11);
        return j11;
    }

    public static long e(float f10, float f11, float f12, float f13, AbstractC2015c abstractC2015c, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            f13 = 1.0f;
        }
        if ((i10 & 16) != 0) {
            androidx.compose.ui.graphics.colorspace.h.f100991a.getClass();
            abstractC2015c = androidx.compose.ui.graphics.colorspace.h.f100996f;
        }
        return a(f10, f11, f12, f13, abstractC2015c);
    }

    public static /* synthetic */ long f(int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 8) != 0) {
            i13 = 255;
        }
        return c(i10, i11, i12, i13);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e7  */
    @androidx.compose.runtime.T1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long g(float r17, float r18, float r19, float r20, @org.jetbrains.annotations.NotNull androidx.compose.ui.graphics.colorspace.AbstractC2015c r21) {
        /*
            Method dump skipped, instruction units count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.M0.g(float, float, float, float, androidx.compose.ui.graphics.colorspace.c):long");
    }

    public static long h(float f10, float f11, float f12, float f13, AbstractC2015c abstractC2015c, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            f13 = 1.0f;
        }
        if ((i10 & 16) != 0) {
            androidx.compose.ui.graphics.colorspace.h.f100991a.getClass();
            abstractC2015c = androidx.compose.ui.graphics.colorspace.h.f100996f;
        }
        return g(f10, f11, f12, f13, abstractC2015c);
    }

    public static final float i(float f10, float f11, float f12, float f13, float f14) {
        if (f14 == 0.0f) {
            return 0.0f;
        }
        return (((1.0f - f12) * (f11 * f13)) + (f10 * f12)) / f14;
    }

    @androidx.compose.runtime.T1
    public static final long j(long j10, long j11) {
        float f10;
        float f11;
        long jU = K0.u(j10, K0.E(j11));
        float fA = K0.A(j11);
        float fA2 = K0.A(jU);
        float f12 = 1.0f - fA2;
        float f13 = (fA * f12) + fA2;
        float fI = K0.I(jU);
        float fI2 = K0.I(j11);
        float f14 = 0.0f;
        if (f13 == 0.0f) {
            f10 = 0.0f;
        } else {
            f10 = (((fI2 * fA) * f12) + (fI * fA2)) / f13;
        }
        float fG = K0.G(jU);
        float fG2 = K0.G(j11);
        if (f13 == 0.0f) {
            f11 = 0.0f;
        } else {
            f11 = (((fG2 * fA) * f12) + (fG * fA2)) / f13;
        }
        float fC = K0.C(jU);
        float fC2 = K0.C(j11);
        if (f13 != 0.0f) {
            f14 = (((fC2 * fA) * f12) + (fC * fA2)) / f13;
        }
        return g(f10, f11, f14, f13, K0.E(j11));
    }

    @e.Y(4)
    public static final float[] k(long j10) {
        return new float[]{K0.I(j10), K0.G(j10), K0.C(j10), K0.A(j10)};
    }

    @InterfaceC4850b0
    public static /* synthetic */ void l() {
    }

    public static final boolean m(long j10) {
        return j10 != 16;
    }

    @androidx.compose.runtime.T1
    public static /* synthetic */ void n(long j10) {
    }

    public static final boolean o(long j10) {
        return j10 == 16;
    }

    @androidx.compose.runtime.T1
    public static /* synthetic */ void p(long j10) {
    }

    @androidx.compose.runtime.T1
    public static final long q(long j10, long j11, @InterfaceC4348w(from = 0.0d, to = 1.0d) float f10) {
        androidx.compose.ui.graphics.colorspace.h.f100991a.getClass();
        AbstractC2015c abstractC2015c = androidx.compose.ui.graphics.colorspace.h.f101013w;
        long jU = K0.u(j10, abstractC2015c);
        long jU2 = K0.u(j11, abstractC2015c);
        float fA = K0.A(jU);
        float fI = K0.I(jU);
        float fG = K0.G(jU);
        float fC = K0.C(jU);
        float fA2 = K0.A(jU2);
        float fI2 = K0.I(jU2);
        float fG2 = K0.G(jU2);
        float fC2 = K0.C(jU2);
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        return K0.u(g(C5238e.j(fI, fI2, f10), C5238e.j(fG, fG2, f10), C5238e.j(fC, fC2, f10), C5238e.j(fA, fA2, f10), abstractC2015c), K0.E(j11));
    }

    @androidx.compose.runtime.T1
    public static final float r(long j10) {
        AbstractC2015c abstractC2015cE = K0.E(j10);
        long j11 = abstractC2015cE.f100989b;
        C2014b.f100979b.getClass();
        if (!C2014b.h(j11, C2014b.f100980c)) {
            C2037h2.b("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) C2014b.l(abstractC2015cE.f100989b)));
            throw null;
        }
        androidx.compose.ui.graphics.colorspace.k kVar = ((Rgb) abstractC2015cE).f100969s;
        double dA = kVar.a(K0.I(j10));
        float fA = (float) ((kVar.a(K0.C(j10)) * 0.0722d) + (kVar.a(K0.G(j10)) * 0.7152d) + (dA * 0.2126d));
        if (fA < 0.0f) {
            fA = 0.0f;
        }
        if (fA > 1.0f) {
            return 1.0f;
        }
        return fA;
    }

    public static final long s(long j10, @NotNull InterfaceC4376a<K0> interfaceC4376a) {
        return j10 != 16 ? j10 : interfaceC4376a.invoke().f100747a;
    }

    @androidx.compose.runtime.T1
    @InterfaceC4337k
    public static final int t(long j10) {
        androidx.compose.ui.graphics.colorspace.h.f100991a.getClass();
        return (int) (K0.u(j10, androidx.compose.ui.graphics.colorspace.h.f100996f) >>> 32);
    }
}
