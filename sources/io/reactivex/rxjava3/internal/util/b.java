package io.reactivex.rxjava3.internal.util;

import androidx.collection.Q;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes7.dex */
public final class b {
    public b() {
        throw new IllegalStateException("No instances!");
    }

    public static long a(@yc.e AtomicLong requested, long n10) {
        long j10;
        do {
            j10 = requested.get();
            if (j10 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        } while (!requested.compareAndSet(j10, c(j10, n10)));
        return j10;
    }

    public static long b(@yc.e AtomicLong requested, long n10) {
        long j10;
        do {
            j10 = requested.get();
            if (j10 == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            if (j10 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        } while (!requested.compareAndSet(j10, c(j10, n10)));
        return j10;
    }

    public static long c(long a10, long b10) {
        long j10 = a10 + b10;
        if (j10 < 0) {
            return Long.MAX_VALUE;
        }
        return j10;
    }

    public static long d(long a10, long b10) {
        long j10 = a10 * b10;
        if (((a10 | b10) >>> 31) == 0 || j10 / a10 == b10) {
            return j10;
        }
        return Long.MAX_VALUE;
    }

    public static long e(@yc.e AtomicLong requested, long n10) {
        long j10;
        long j11;
        do {
            j10 = requested.get();
            if (j10 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            j11 = j10 - n10;
            if (j11 < 0) {
                Ic.a.Y(new IllegalStateException(Q.a("More produced than requested: ", j11)));
                j11 = 0;
            }
        } while (!requested.compareAndSet(j10, j11));
        return j11;
    }

    public static long f(@yc.e AtomicLong requested, long n10) {
        long j10;
        long j11;
        do {
            j10 = requested.get();
            if (j10 == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            if (j10 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            j11 = j10 - n10;
            if (j11 < 0) {
                Ic.a.Y(new IllegalStateException(Q.a("More produced than requested: ", j11)));
                j11 = 0;
            }
        } while (!requested.compareAndSet(j10, j11));
        return j11;
    }
}
