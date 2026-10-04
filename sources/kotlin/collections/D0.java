package kotlin.collections;

import kotlin.H0;
import kotlin.InterfaceC5045x;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class D0 {
    @InterfaceC5045x
    public static final int a(long[] jArr, int i10, int i11) {
        long j10 = jArr[(i10 + i11) / 2];
        while (i10 <= i11) {
            while (Long.compare(jArr[i10] ^ Long.MIN_VALUE, j10 ^ Long.MIN_VALUE) < 0) {
                i10++;
            }
            while (Long.compare(jArr[i11] ^ Long.MIN_VALUE, j10 ^ Long.MIN_VALUE) > 0) {
                i11--;
            }
            if (i10 <= i11) {
                long j11 = jArr[i10];
                jArr[i10] = jArr[i11];
                jArr[i11] = j11;
                i10++;
                i11--;
            }
        }
        return i10;
    }

    @InterfaceC5045x
    public static final int b(byte[] bArr, int i10, int i11) {
        int i12;
        byte b10 = bArr[(i10 + i11) / 2];
        while (i10 <= i11) {
            while (true) {
                i12 = b10 & 255;
                if (kotlin.jvm.internal.G.t(bArr[i10] & 255, i12) >= 0) {
                    break;
                }
                i10++;
            }
            while (kotlin.jvm.internal.G.t(bArr[i11] & 255, i12) > 0) {
                i11--;
            }
            if (i10 <= i11) {
                byte b11 = bArr[i10];
                bArr[i10] = bArr[i11];
                bArr[i11] = b11;
                i10++;
                i11--;
            }
        }
        return i10;
    }

    @InterfaceC5045x
    public static final int c(short[] sArr, int i10, int i11) {
        int i12;
        short s10 = sArr[(i10 + i11) / 2];
        while (i10 <= i11) {
            while (true) {
                int i13 = sArr[i10] & H0.f217455d;
                i12 = s10 & H0.f217455d;
                if (kotlin.jvm.internal.G.t(i13, i12) >= 0) {
                    break;
                }
                i10++;
            }
            while (kotlin.jvm.internal.G.t(sArr[i11] & H0.f217455d, i12) > 0) {
                i11--;
            }
            if (i10 <= i11) {
                short s11 = sArr[i10];
                sArr[i10] = sArr[i11];
                sArr[i11] = s11;
                i10++;
                i11--;
            }
        }
        return i10;
    }

    @InterfaceC5045x
    public static final int d(int[] iArr, int i10, int i11) {
        int i12 = iArr[(i10 + i11) / 2];
        while (i10 <= i11) {
            while (Integer.compare(iArr[i10] ^ Integer.MIN_VALUE, i12 ^ Integer.MIN_VALUE) < 0) {
                i10++;
            }
            while (Integer.compare(iArr[i11] ^ Integer.MIN_VALUE, i12 ^ Integer.MIN_VALUE) > 0) {
                i11--;
            }
            if (i10 <= i11) {
                int i13 = iArr[i10];
                iArr[i10] = iArr[i11];
                iArr[i11] = i13;
                i10++;
                i11--;
            }
        }
        return i10;
    }

    @InterfaceC5045x
    public static final void e(long[] jArr, int i10, int i11) {
        int iA = a(jArr, i10, i11);
        int i12 = iA - 1;
        if (i10 < i12) {
            e(jArr, i10, i12);
        }
        if (iA < i11) {
            e(jArr, iA, i11);
        }
    }

    @InterfaceC5045x
    public static final void f(byte[] bArr, int i10, int i11) {
        int iB = b(bArr, i10, i11);
        int i12 = iB - 1;
        if (i10 < i12) {
            f(bArr, i10, i12);
        }
        if (iB < i11) {
            f(bArr, iB, i11);
        }
    }

    @InterfaceC5045x
    public static final void g(short[] sArr, int i10, int i11) {
        int iC = c(sArr, i10, i11);
        int i12 = iC - 1;
        if (i10 < i12) {
            g(sArr, i10, i12);
        }
        if (iC < i11) {
            g(sArr, iC, i11);
        }
    }

    @InterfaceC5045x
    public static final void h(int[] iArr, int i10, int i11) {
        int iD = d(iArr, i10, i11);
        int i12 = iD - 1;
        if (i10 < i12) {
            h(iArr, i10, i12);
        }
        if (iD < i11) {
            h(iArr, iD, i11);
        }
    }

    @InterfaceC5045x
    public static final void i(@NotNull long[] jArr, int i10, int i11) {
        kotlin.jvm.internal.G.p(jArr, "$v$c$kotlin-ULongArray$-array$0");
        e(jArr, i10, i11 - 1);
    }

    @InterfaceC5045x
    public static final void j(@NotNull byte[] bArr, int i10, int i11) {
        kotlin.jvm.internal.G.p(bArr, "$v$c$kotlin-UByteArray$-array$0");
        f(bArr, i10, i11 - 1);
    }

    @InterfaceC5045x
    public static final void k(@NotNull short[] sArr, int i10, int i11) {
        kotlin.jvm.internal.G.p(sArr, "$v$c$kotlin-UShortArray$-array$0");
        g(sArr, i10, i11 - 1);
    }

    @InterfaceC5045x
    public static final void l(@NotNull int[] iArr, int i10, int i11) {
        kotlin.jvm.internal.G.p(iArr, "$v$c$kotlin-UIntArray$-array$0");
        h(iArr, i10, i11 - 1);
    }
}
