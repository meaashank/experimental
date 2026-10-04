package Oc;

import kotlin.H0;
import kotlin.InterfaceC4887e0;
import kotlin.InterfaceC5045x;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public class n {
    @InterfaceC4887e0(version = "1.5")
    public static final short a(short s10, short s11) {
        return G.t(s10 & H0.f217455d, 65535 & s11) >= 0 ? s10 : s11;
    }

    @InterfaceC4887e0(version = "1.5")
    public static int b(int i10, int i11) {
        return Integer.compare(i10 ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE) >= 0 ? i10 : i11;
    }

    @InterfaceC4887e0(version = "1.5")
    public static final byte c(byte b10, byte b11) {
        return G.t(b10 & 255, b11 & 255) >= 0 ? b10 : b11;
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    public static final int d(int i10, @NotNull int... iArr) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-other$0");
        for (int i11 : iArr) {
            i10 = b(i10, i11);
        }
        return i10;
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    public static final long e(long j10, @NotNull long... jArr) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-other$0");
        for (long j11 : jArr) {
            j10 = j(j10, j11);
        }
        return j10;
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final short f(short s10, short s11, short s12) {
        return a(s10, a(s11, s12));
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final int g(int i10, int i11, int i12) {
        return b(i10, b(i11, i12));
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    public static final byte h(byte b10, @NotNull byte... bArr) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-other$0");
        for (byte b11 : bArr) {
            b10 = c(b10, b11);
        }
        return b10;
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final byte i(byte b10, byte b11, byte b12) {
        return c(b10, c(b11, b12));
    }

    @InterfaceC4887e0(version = "1.5")
    public static long j(long j10, long j11) {
        return Long.compare(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE) >= 0 ? j10 : j11;
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final long k(long j10, long j11, long j12) {
        return j(j10, j(j11, j12));
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    public static final short l(short s10, @NotNull short... sArr) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-other$0");
        for (short s11 : sArr) {
            s10 = a(s10, s11);
        }
        return s10;
    }

    @InterfaceC4887e0(version = "1.5")
    public static final short m(short s10, short s11) {
        return G.t(s10 & H0.f217455d, 65535 & s11) <= 0 ? s10 : s11;
    }

    @InterfaceC4887e0(version = "1.5")
    public static int n(int i10, int i11) {
        return Integer.compare(i10 ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE) <= 0 ? i10 : i11;
    }

    @InterfaceC4887e0(version = "1.5")
    public static final byte o(byte b10, byte b11) {
        return G.t(b10 & 255, b11 & 255) <= 0 ? b10 : b11;
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    public static final int p(int i10, @NotNull int... iArr) {
        G.p(iArr, "$v$c$kotlin-UIntArray$-other$0");
        for (int i11 : iArr) {
            i10 = n(i10, i11);
        }
        return i10;
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    public static final long q(long j10, @NotNull long... jArr) {
        G.p(jArr, "$v$c$kotlin-ULongArray$-other$0");
        for (long j11 : jArr) {
            j10 = v(j10, j11);
        }
        return j10;
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final short r(short s10, short s11, short s12) {
        return m(s10, m(s11, s12));
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final int s(int i10, int i11, int i12) {
        return n(i10, n(i11, i12));
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    public static final byte t(byte b10, @NotNull byte... bArr) {
        G.p(bArr, "$v$c$kotlin-UByteArray$-other$0");
        for (byte b11 : bArr) {
            b10 = o(b10, b11);
        }
        return b10;
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final byte u(byte b10, byte b11, byte b12) {
        return o(b10, o(b11, b12));
    }

    @InterfaceC4887e0(version = "1.5")
    public static long v(long j10, long j11) {
        return Long.compare(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE) <= 0 ? j10 : j11;
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final long w(long j10, long j11, long j12) {
        return v(j10, v(j11, j12));
    }

    @InterfaceC4887e0(version = "1.4")
    @InterfaceC5045x
    public static final short x(short s10, @NotNull short... sArr) {
        G.p(sArr, "$v$c$kotlin-UShortArray$-other$0");
        for (short s11 : sArr) {
            s10 = m(s10, s11);
        }
        return s10;
    }
}
