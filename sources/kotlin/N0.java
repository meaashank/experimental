package kotlin;

import kotlin.text.C5011c;
import okio.internal.ZipKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@dd.j(name = "UnsignedKt")
public final class N0 {
    @InterfaceC4850b0
    public static final int a(double d10) {
        if (Double.isNaN(d10) || d10 <= 0.0d) {
            return 0;
        }
        if (d10 >= 4.294967295E9d) {
            return -1;
        }
        return d10 <= 2.147483647E9d ? (int) d10 : ((int) (d10 - ((double) Integer.MAX_VALUE))) + Integer.MAX_VALUE;
    }

    @InterfaceC4850b0
    public static final long b(double d10) {
        if (Double.isNaN(d10) || d10 <= 0.0d) {
            return 0L;
        }
        if (d10 >= 1.8446744073709552E19d) {
            return -1L;
        }
        return d10 < 9.223372036854776E18d ? (long) d10 : ((long) (d10 - 9.223372036854776E18d)) - Long.MIN_VALUE;
    }

    @InterfaceC4850b0
    @Xc.f
    public static final int c(float f10) {
        return a(f10);
    }

    @InterfaceC4850b0
    @Xc.f
    public static final long d(float f10) {
        return b(f10);
    }

    @InterfaceC4850b0
    public static final int e(int i10, int i11) {
        return kotlin.jvm.internal.G.t(i10 ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE);
    }

    @InterfaceC4850b0
    public static final int f(int i10, int i11) {
        return (int) ((((long) i10) & ZipKt.f225990j) / (((long) i11) & ZipKt.f225990j));
    }

    @InterfaceC4850b0
    public static final int g(int i10, int i11) {
        return (int) ((((long) i10) & ZipKt.f225990j) % (((long) i11) & ZipKt.f225990j));
    }

    @InterfaceC4850b0
    public static final double h(int i10) {
        return (((double) ((i10 >>> 31) << 30)) * ((double) 2)) + ((double) (Integer.MAX_VALUE & i10));
    }

    @InterfaceC4850b0
    @Xc.f
    public static final float i(int i10) {
        return (float) h(i10);
    }

    @InterfaceC4850b0
    @Xc.f
    public static final long j(int i10) {
        return ((long) i10) & ZipKt.f225990j;
    }

    @Xc.f
    public static final String k(int i10) {
        return String.valueOf(((long) i10) & ZipKt.f225990j);
    }

    @Xc.f
    public static final String l(int i10, int i11) {
        return t(((long) i10) & ZipKt.f225990j, i11);
    }

    @InterfaceC4850b0
    @Xc.f
    public static final long m(int i10) {
        return ((long) i10) & ZipKt.f225990j;
    }

    @InterfaceC4850b0
    public static final int n(long j10, long j11) {
        return kotlin.jvm.internal.G.u(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE);
    }

    @InterfaceC4850b0
    public static final long o(long j10, long j11) {
        if (j11 < 0) {
            return Long.compare(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE) < 0 ? 0L : 1L;
        }
        if (j10 >= 0) {
            return j10 / j11;
        }
        long j12 = ((j10 >>> 1) / j11) << 1;
        return j12 + ((long) (Long.compare((j10 - (j12 * j11)) ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE) < 0 ? 0 : 1));
    }

    @InterfaceC4850b0
    public static final long p(long j10, long j11) {
        if (j11 < 0) {
            return Long.compare(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE) < 0 ? j10 : j10 - j11;
        }
        if (j10 >= 0) {
            return j10 % j11;
        }
        long j12 = j10 - ((((j10 >>> 1) / j11) << 1) * j11);
        if (Long.compare(j12 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE) < 0) {
            j11 = 0;
        }
        return j12 - j11;
    }

    @InterfaceC4850b0
    public static final double q(long j10) {
        return ((j10 >>> 11) * ((double) 2048)) + (j10 & 2047);
    }

    @InterfaceC4850b0
    @Xc.f
    public static final float r(long j10) {
        return (float) q(j10);
    }

    @Xc.f
    public static final String s(long j10) {
        return t(j10, 10);
    }

    @NotNull
    public static final String t(long j10, int i10) {
        if (j10 >= 0) {
            C5011c.a(i10);
            String string = Long.toString(j10, i10);
            kotlin.jvm.internal.G.o(string, "toString(...)");
            return string;
        }
        long j11 = i10;
        long j12 = ((j10 >>> 1) / j11) << 1;
        long j13 = j10 - (j12 * j11);
        if (j13 >= j11) {
            j13 -= j11;
            j12++;
        }
        C5011c.a(i10);
        String string2 = Long.toString(j12, i10);
        kotlin.jvm.internal.G.o(string2, "toString(...)");
        C5011c.a(i10);
        String string3 = Long.toString(j13, i10);
        kotlin.jvm.internal.G.o(string3, "toString(...)");
        return string2.concat(string3);
    }
}
