package androidx.compose.ui.graphics;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nFloat16.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Float16.kt\nandroidx/compose/ui/graphics/Float16Kt\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,717:1\n22#2:718\n22#2:719\n22#2:720\n*S KotlinDebug\n*F\n+ 1 Float16.kt\nandroidx/compose/ui/graphics/Float16Kt\n*L\n661#1:718\n678#1:719\n588#1:720\n*E\n"})
public final class W1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f100873c = 15;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f100874d = 32768;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f100875e = 10;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f100876f = 31;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f100877g = 1023;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f100878h = 15;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f100879i = 32767;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f100880j = 31744;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f100881k = 31;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f100882l = 23;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f100883m = 255;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f100884n = 8388607;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f100885o = 127;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f100886p = 4194304;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final short f100871a = V1.s(1.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final short f100872b = V1.s(-1.0f);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f100887q = 1056964608;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final float f100888r = Float.intBitsToFloat(f100887q);

    public static final short d(float f10) {
        int i10;
        int iFloatToRawIntBits = Float.floatToRawIntBits(f10);
        int i11 = iFloatToRawIntBits >>> 31;
        int i12 = (iFloatToRawIntBits >>> 23) & 255;
        int i13 = 8388607 & iFloatToRawIntBits;
        int i14 = 31;
        int i15 = 0;
        if (i12 != 255) {
            int i16 = i12 - 112;
            if (i16 >= 31) {
                i14 = 49;
            } else if (i16 > 0) {
                i15 = i13 >> 13;
                if ((iFloatToRawIntBits & 4096) != 0) {
                    i10 = (((i16 << 10) | i15) + 1) | (i11 << 15);
                    return (short) i10;
                }
                i14 = i16;
            } else if (i16 >= -10) {
                int i17 = (8388608 | i13) >> (1 - i16);
                if ((i17 & 4096) != 0) {
                    i17 += 8192;
                }
                i14 = 0;
                i15 = i17 >> 13;
            } else {
                i14 = 0;
            }
        } else if (i13 != 0) {
            i15 = 512;
        }
        i10 = (i11 << 15) | (i14 << 10) | i15;
        return (short) i10;
    }

    public static final float e(short s10) {
        int i10;
        int i11;
        int i12;
        int i13 = Short.MIN_VALUE & s10;
        int i14 = ((65535 & s10) >>> 10) & 31;
        int i15 = s10 & 1023;
        if (i14 != 0) {
            int i16 = i15 << 13;
            if (i14 == 31) {
                i10 = 255;
                if (i16 != 0) {
                    i16 |= 4194304;
                }
            } else {
                i10 = i14 + 112;
            }
            int i17 = i10;
            i11 = i16;
            i12 = i17;
        } else {
            if (i15 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i15 + f100887q) - f100888r;
                return i13 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i12 = 0;
            i11 = 0;
        }
        return Float.intBitsToFloat((i12 << 23) | (i13 << 16) | i11);
    }

    public static final short f(short s10, short s11) {
        if (!V1.E(s10) && !V1.E(s11)) {
            return V1.p(s10, s11) >= 0 ? s10 : s11;
        }
        V1.f100850b.getClass();
        return V1.f100859k;
    }

    public static final short g(short s10, short s11) {
        if (!V1.E(s10) && !V1.E(s11)) {
            return V1.p(s10, s11) <= 0 ? s10 : s11;
        }
        V1.f100850b.getClass();
        return V1.f100859k;
    }

    public static final int h(short s10) {
        return (s10 & kotlin.jvm.internal.T.f217907b) != 0 ? 32768 - (s10 & kotlin.H0.f217455d) : s10 & kotlin.H0.f217455d;
    }
}
