package Xc;

import kotlin.C4985p0;
import kotlin.InterfaceC4850b0;
import kotlin.InterfaceC4887e0;
import kotlin.q0;

/* JADX INFO: loaded from: classes7.dex */
public final class t {
    public static final int a(int i10, int i11, int i12) {
        int iA = C4985p0.a(i10, i12);
        int iA2 = C4985p0.a(i11, i12);
        int iCompare = Integer.compare(iA ^ Integer.MIN_VALUE, iA2 ^ Integer.MIN_VALUE);
        int i13 = iA - iA2;
        return iCompare >= 0 ? i13 : i13 + i12;
    }

    public static final long b(long j10, long j11, long j12) {
        long jA = q0.a(j10, j12);
        long jA2 = q0.a(j11, j12);
        int iCompare = Long.compare(jA ^ Long.MIN_VALUE, jA2 ^ Long.MIN_VALUE);
        long j13 = jA - jA2;
        return iCompare >= 0 ? j13 : j13 + j12;
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC4850b0
    public static final long c(long j10, long j11, long j12) {
        if (j12 > 0) {
            return Long.compare(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE) >= 0 ? j11 : j11 - b(j11, j10, j12);
        }
        if (j12 < 0) {
            return Long.compare(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE) <= 0 ? j11 : j11 + b(j10, j11, -j12);
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    @InterfaceC4887e0(version = "1.3")
    @InterfaceC4850b0
    public static final int d(int i10, int i11, int i12) {
        if (i12 > 0) {
            if (Integer.compare(i10 ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE) < 0) {
                return i11 - a(i11, i10, i12);
            }
        } else {
            if (i12 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (Integer.compare(i10 ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE) > 0) {
                return a(i10, i11, -i12) + i11;
            }
        }
        return i11;
    }
}
