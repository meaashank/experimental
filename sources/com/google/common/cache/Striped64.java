package com.google.common.cache;

import com.google.common.annotations.GwtIncompatible;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Random;
import javax.annotation.CheckForNull;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
@GwtIncompatible
abstract class Striped64 extends Number {
    private static final Unsafe UNSAFE;
    private static final long baseOffset;
    private static final long busyOffset;
    volatile transient long base;
    volatile transient int busy;

    @CheckForNull
    volatile transient Cell[] cells;
    static final ThreadLocal<int[]> threadHashCode = new ThreadLocal<>();
    static final Random rng = new Random();
    static final int NCPU = Runtime.getRuntime().availableProcessors();

    public static final class Cell {
        private static final Unsafe UNSAFE;
        private static final long valueOffset;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        volatile long f150939p0;

        /* JADX INFO: renamed from: p1, reason: collision with root package name */
        volatile long f150940p1;

        /* JADX INFO: renamed from: p2, reason: collision with root package name */
        volatile long f150941p2;

        /* JADX INFO: renamed from: p3, reason: collision with root package name */
        volatile long f150942p3;

        /* JADX INFO: renamed from: p4, reason: collision with root package name */
        volatile long f150943p4;

        /* JADX INFO: renamed from: p5, reason: collision with root package name */
        volatile long f150944p5;

        /* JADX INFO: renamed from: p6, reason: collision with root package name */
        volatile long f150945p6;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        volatile long f150946q0;

        /* JADX INFO: renamed from: q1, reason: collision with root package name */
        volatile long f150947q1;

        /* JADX INFO: renamed from: q2, reason: collision with root package name */
        volatile long f150948q2;

        /* JADX INFO: renamed from: q3, reason: collision with root package name */
        volatile long f150949q3;

        /* JADX INFO: renamed from: q4, reason: collision with root package name */
        volatile long f150950q4;

        /* JADX INFO: renamed from: q5, reason: collision with root package name */
        volatile long f150951q5;

        /* JADX INFO: renamed from: q6, reason: collision with root package name */
        volatile long f150952q6;
        volatile long value;

        static {
            try {
                Unsafe unsafe = Striped64.getUnsafe();
                UNSAFE = unsafe;
                valueOffset = unsafe.objectFieldOffset(Cell.class.getDeclaredField("value"));
            } catch (Exception e10) {
                throw new Error(e10);
            }
        }

        public Cell(long j10) {
            this.value = j10;
        }

        public final boolean cas(long j10, long j11) {
            return UNSAFE.compareAndSwapLong(this, valueOffset, j10, j11);
        }
    }

    static {
        try {
            Unsafe unsafe = getUnsafe();
            UNSAFE = unsafe;
            baseOffset = unsafe.objectFieldOffset(Striped64.class.getDeclaredField("base"));
            busyOffset = unsafe.objectFieldOffset(Striped64.class.getDeclaredField("busy"));
        } catch (Exception e10) {
            throw new Error(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Unsafe getUnsafe() {
        try {
            try {
                return Unsafe.getUnsafe();
            } catch (PrivilegedActionException e10) {
                throw new RuntimeException("Could not initialize intrinsics", e10.getCause());
            }
        } catch (SecurityException unused) {
            return (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: com.google.common.cache.Striped64.1
                @Override // java.security.PrivilegedExceptionAction
                public Unsafe run() throws Exception {
                    for (Field field : Unsafe.class.getDeclaredFields()) {
                        field.setAccessible(true);
                        Object obj = field.get(null);
                        if (Unsafe.class.isInstance(obj)) {
                            return (Unsafe) Unsafe.class.cast(obj);
                        }
                    }
                    throw new NoSuchFieldError("the Unsafe");
                }
            });
        }
    }

    public final boolean casBase(long j10, long j11) {
        return UNSAFE.compareAndSwapLong(this, baseOffset, j10, j11);
    }

    public final boolean casBusy() {
        return UNSAFE.compareAndSwapInt(this, busyOffset, 0, 1);
    }

    public abstract long fn(long j10, long j11);

    public final void internalReset(long j10) {
        Cell[] cellArr = this.cells;
        this.base = j10;
        if (cellArr != null) {
            for (Cell cell : cellArr) {
                if (cell != null) {
                    cell.value = j10;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0023 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00f1 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void retryUpdate(long r17, @javax.annotation.CheckForNull int[] r19, boolean r20) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.Striped64.retryUpdate(long, int[], boolean):void");
    }
}
