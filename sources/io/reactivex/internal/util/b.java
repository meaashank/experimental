package io.reactivex.internal.util;

import androidx.collection.Q;
import java.util.concurrent.atomic.AtomicLong;
import uc.C5666a;

/* JADX INFO: loaded from: classes7.dex */
public final class b {
    public b() {
        throw new IllegalStateException("No instances!");
    }

    public static long a(AtomicLong atomicLong, long j10) {
        long j11;
        do {
            j11 = atomicLong.get();
            if (j11 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(j11, c(j11, j10)));
        return j11;
    }

    public static long b(AtomicLong atomicLong, long j10) {
        long j11;
        do {
            j11 = atomicLong.get();
            if (j11 == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            if (j11 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(j11, c(j11, j10)));
        return j11;
    }

    public static long c(long j10, long j11) {
        long j12 = j10 + j11;
        if (j12 < 0) {
            return Long.MAX_VALUE;
        }
        return j12;
    }

    public static long d(long j10, long j11) {
        long j12 = j10 * j11;
        if (((j10 | j11) >>> 31) == 0 || j12 / j10 == j11) {
            return j12;
        }
        return Long.MAX_VALUE;
    }

    public static long e(AtomicLong atomicLong, long j10) {
        long j11;
        long j12;
        do {
            j11 = atomicLong.get();
            if (j11 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            j12 = j11 - j10;
            if (j12 < 0) {
                C5666a.Y(new IllegalStateException(Q.a("More produced than requested: ", j12)));
                j12 = 0;
            }
        } while (!atomicLong.compareAndSet(j11, j12));
        return j12;
    }

    public static long f(AtomicLong atomicLong, long j10) {
        long j11;
        long j12;
        do {
            j11 = atomicLong.get();
            if (j11 == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            if (j11 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            j12 = j11 - j10;
            if (j12 < 0) {
                C5666a.Y(new IllegalStateException(Q.a("More produced than requested: ", j12)));
                j12 = 0;
            }
        } while (!atomicLong.compareAndSet(j11, j12));
        return j12;
    }
}
