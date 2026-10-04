package androidx.compose.ui.graphics;

import kotlin.jvm.internal.C4969v;
import kotlin.text.C5011c;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.objectweb.asm.signature.SignatureVisitor;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nFloat16.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Float16.kt\nandroidx/compose/ui/graphics/Float16\n+ 2 Float16.kt\nandroidx/compose/ui/graphics/Float16Kt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,717:1\n605#2,38:718\n650#2,12:756\n662#2,17:769\n592#2,4:786\n22#3:768\n*S KotlinDebug\n*F\n+ 1 Float16.kt\nandroidx/compose/ui/graphics/Float16\n*L\n98#1:718,38\n151#1:756,12\n151#1:769,17\n217#1:786,4\n151#1:768\n*E\n"})
@dd.h
public final class V1 implements Comparable<V1> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f100850b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f100851c = 16;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final short f100852d = 5120;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f100853e = 15;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f100854f = -14;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final short f100855g = -1025;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final short f100856h = 31743;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final short f100857i = 1024;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final short f100858j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final short f100859k = 32256;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final short f100860l = -1024;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final short f100861m = Short.MIN_VALUE;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final short f100862n = 31744;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final short f100863o = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final short f100864a;

    public static final class a {
        public a() {
        }

        public final short a() {
            return V1.f100852d;
        }

        public final short b() {
            return V1.f100855g;
        }

        public final short c() {
            return V1.f100856h;
        }

        public final short d() {
            return V1.f100857i;
        }

        public final short e() {
            return V1.f100858j;
        }

        public final short f() {
            return V1.f100859k;
        }

        public final short g() {
            return V1.f100860l;
        }

        public final short h() {
            return V1.f100861m;
        }

        public final short i() {
            return V1.f100862n;
        }

        public final short j() {
            return V1.f100863o;
        }

        public a(C4969v c4969v) {
        }
    }

    public /* synthetic */ V1(short s10) {
        this.f100864a = s10;
    }

    public static final int A(short s10) {
        return s10 & 1023;
    }

    public static int B(short s10) {
        return s10;
    }

    public static final boolean C(short s10) {
        return (s10 & kotlin.jvm.internal.T.f217908c) != 31744;
    }

    public static final boolean D(short s10) {
        return (s10 & kotlin.jvm.internal.T.f217908c) == 31744;
    }

    public static final boolean E(short s10) {
        return (s10 & kotlin.jvm.internal.T.f217908c) > 31744;
    }

    public static final boolean F(short s10) {
        int i10 = s10 & 31744;
        return (i10 == 0 || i10 == 31744) ? false : true;
    }

    public static final short G(short s10) {
        int i10 = s10 & kotlin.H0.f217455d;
        int i11 = s10 & kotlin.jvm.internal.T.f217908c;
        if (i11 < 15360) {
            i10 = (s10 & kotlin.jvm.internal.T.f217907b) | ((i11 < 14336 ? 0 : 65535) & 15360);
        } else if (i11 < 25600) {
            int i12 = i11 >> 10;
            i10 = (i10 + (1 << (24 - i12))) & (~((1 << (25 - i12)) - 1));
        }
        return (short) i10;
    }

    public static final int H(short s10) {
        return E(s10) ? f100859k : s10 & kotlin.H0.f217455d;
    }

    public static final byte I(short s10) {
        return (byte) K(s10);
    }

    public static final double J(short s10) {
        return K(s10);
    }

    public static final float K(short s10) {
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
                float fIntBitsToFloat = Float.intBitsToFloat(i15 + W1.f100887q) - W1.f100888r;
                return i13 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i12 = 0;
            i11 = 0;
        }
        return Float.intBitsToFloat((i12 << 23) | (i13 << 16) | i11);
    }

    @NotNull
    public static final String L(short s10) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = 65535 & s10;
        int i11 = i10 >>> 15;
        int i12 = (i10 >>> 10) & 31;
        int i13 = s10 & 1023;
        if (i12 != 31) {
            if (i11 == 1) {
                sb2.append(SignatureVisitor.SUPER);
            }
            if (i12 != 0) {
                sb2.append("0x1.");
                C5011c.a(16);
                String string = Integer.toString(i13, 16);
                kotlin.jvm.internal.G.o(string, "toString(this, checkRadix(radix))");
                sb2.append(new Regex("0{2,}$").q(string, ""));
                sb2.append('p');
                sb2.append(String.valueOf(i12 - 15));
            } else if (i13 == 0) {
                sb2.append("0x0.0p0");
            } else {
                sb2.append("0x0.");
                C5011c.a(16);
                String string2 = Integer.toString(i13, 16);
                kotlin.jvm.internal.G.o(string2, "toString(this, checkRadix(radix))");
                sb2.append(new Regex("0{2,}$").q(string2, ""));
                sb2.append("p-14");
            }
        } else if (i13 == 0) {
            if (i11 != 0) {
                sb2.append(SignatureVisitor.SUPER);
            }
            sb2.append(kotlin.time.j.f218437k);
        } else {
            sb2.append("NaN");
        }
        return sb2.toString();
    }

    public static final int M(short s10) {
        return (int) K(s10);
    }

    public static final long N(short s10) {
        return (long) K(s10);
    }

    public static final int O(short s10) {
        return s10 & kotlin.H0.f217455d;
    }

    public static final short Q(short s10) {
        return (short) K(s10);
    }

    @NotNull
    public static String R(short s10) {
        return String.valueOf(K(s10));
    }

    public static final short S(short s10) {
        int i10 = 65535 & s10;
        int i11 = s10 & kotlin.jvm.internal.T.f217908c;
        if (i11 < 15360) {
            i10 = Short.MIN_VALUE & s10;
        } else if (i11 < 25600) {
            i10 &= ~((1 << (25 - (i11 >> 10))) - 1);
        }
        return (short) i10;
    }

    public static final short V(short s10, short s11) {
        return (short) ((s10 & kotlin.jvm.internal.T.f217908c) | (s11 & kotlin.jvm.internal.T.f217907b));
    }

    public static final short a(short s10) {
        return (short) (s10 & kotlin.jvm.internal.T.f217908c);
    }

    public static final /* synthetic */ V1 l(short s10) {
        return new V1(s10);
    }

    public static final short m(short s10) {
        int i10 = 65535 & s10;
        int i11 = s10 & kotlin.jvm.internal.T.f217908c;
        if (i11 < 15360) {
            i10 = ((-((~(i10 >> 15)) & (i11 == 0 ? 0 : 1))) & 15360) | (s10 & kotlin.jvm.internal.T.f217907b);
        } else if (i11 < 25600) {
            int i12 = (1 << (25 - (i11 >> 10))) - 1;
            i10 = (i10 + (((i10 >> 15) - 1) & i12)) & (~i12);
        }
        return (short) i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int p(short s10, short s11) {
        if (E(s10)) {
            return !E(s11) ? 1 : 0;
        }
        if (E(s11)) {
            return -1;
        }
        return kotlin.jvm.internal.G.t((s10 & kotlin.jvm.internal.T.f217907b) != 0 ? 32768 - (s10 & kotlin.H0.f217455d) : s10 & kotlin.H0.f217455d, (s11 & kotlin.jvm.internal.T.f217907b) != 0 ? 32768 - (s11 & kotlin.H0.f217455d) : s11 & kotlin.H0.f217455d);
    }

    public static short r(double d10) {
        return s((float) d10);
    }

    public static short s(float f10) {
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

    public static short t(short s10) {
        return s10;
    }

    public static boolean u(short s10, Object obj) {
        return (obj instanceof V1) && s10 == ((V1) obj).f100864a;
    }

    public static final boolean v(short s10, short s11) {
        return s10 == s11;
    }

    public static final short w(short s10) {
        int i10 = s10 & kotlin.H0.f217455d;
        int i11 = s10 & kotlin.jvm.internal.T.f217908c;
        if (i11 < 15360) {
            i10 = (s10 & kotlin.jvm.internal.T.f217907b) | ((i10 <= 32768 ? 0 : 65535) & 15360);
        } else if (i11 < 25600) {
            int i12 = (1 << (25 - (i11 >> 10))) - 1;
            i10 = (i10 + ((-(i10 >> 15)) & i12)) & (~i12);
        }
        return (short) i10;
    }

    public static final int x(short s10) {
        return ((s10 >>> 10) & 31) - 15;
    }

    public static final short z(short s10) {
        return E(s10) ? f100859k : p(s10, f100861m) < 0 ? W1.f100872b : p(s10, f100863o) > 0 ? W1.f100871a : s10;
    }

    public final /* synthetic */ short T() {
        return this.f100864a;
    }

    @Override // java.lang.Comparable
    public int compareTo(V1 v12) {
        return p(this.f100864a, v12.f100864a);
    }

    public boolean equals(Object obj) {
        return u(this.f100864a, obj);
    }

    public int hashCode() {
        return this.f100864a;
    }

    public int n(short s10) {
        return p(this.f100864a, s10);
    }

    @NotNull
    public String toString() {
        return R(this.f100864a);
    }

    public final short y() {
        return this.f100864a;
    }
}
