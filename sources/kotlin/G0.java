package kotlin;

/* JADX INFO: loaded from: classes7.dex */
@dd.j(name = "UNumbersKt")
public final class G0 {
    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final int A(int i10) {
        return Integer.lowestOneBit(i10);
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final short B(short s10) {
        return (short) Integer.lowestOneBit(s10 & H0.f217455d);
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final int a(byte b10) {
        return Integer.numberOfLeadingZeros(b10 & 255) - 24;
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final int b(long j10) {
        return Long.numberOfLeadingZeros(j10);
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final int c(int i10) {
        return Integer.numberOfLeadingZeros(i10);
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final int d(short s10) {
        return Integer.numberOfLeadingZeros(s10 & H0.f217455d) - 16;
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final int e(byte b10) {
        return Integer.bitCount(b10 & 255);
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final int f(long j10) {
        return Long.bitCount(j10);
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final int g(int i10) {
        return Integer.bitCount(i10);
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final int h(short s10) {
        return Integer.bitCount(s10 & H0.f217455d);
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final int i(byte b10) {
        return Integer.numberOfTrailingZeros(b10 | 256);
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final int j(long j10) {
        return Long.numberOfTrailingZeros(j10);
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final int k(int i10) {
        return Integer.numberOfTrailingZeros(i10);
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final int l(short s10) {
        return Integer.numberOfTrailingZeros(s10 | 65536);
    }

    @InterfaceC4887e0(version = "1.6")
    @Xc.f
    public static final long m(long j10, int i10) {
        return Long.rotateLeft(j10, i10);
    }

    @InterfaceC4887e0(version = "1.6")
    @Xc.f
    public static final byte n(byte b10, int i10) {
        return S.Z0(b10, i10);
    }

    @InterfaceC4887e0(version = "1.6")
    @Xc.f
    public static final int o(int i10, int i11) {
        return Integer.rotateLeft(i10, i11);
    }

    @InterfaceC4887e0(version = "1.6")
    @Xc.f
    public static final short p(short s10, int i10) {
        return S.a1(s10, i10);
    }

    @InterfaceC4887e0(version = "1.6")
    @Xc.f
    public static final long q(long j10, int i10) {
        return Long.rotateRight(j10, i10);
    }

    @InterfaceC4887e0(version = "1.6")
    @Xc.f
    public static final byte r(byte b10, int i10) {
        return S.b1(b10, i10);
    }

    @InterfaceC4887e0(version = "1.6")
    @Xc.f
    public static final int s(int i10, int i11) {
        return Integer.rotateRight(i10, i11);
    }

    @InterfaceC4887e0(version = "1.6")
    @Xc.f
    public static final short t(short s10, int i10) {
        return S.c1(s10, i10);
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final byte u(byte b10) {
        return (byte) Integer.highestOneBit(b10 & 255);
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final long v(long j10) {
        return Long.highestOneBit(j10);
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final int w(int i10) {
        return Integer.highestOneBit(i10);
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final short x(short s10) {
        return (short) Integer.highestOneBit(s10 & H0.f217455d);
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final byte y(byte b10) {
        return (byte) Integer.lowestOneBit(b10 & 255);
    }

    @InterfaceC4887e0(version = "1.5")
    @Xc.f
    public static final long z(long j10) {
        return Long.lowestOneBit(j10);
    }
}
