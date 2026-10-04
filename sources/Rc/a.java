package Rc;

import androidx.compose.animation.core.C1598m0;
import com.google.common.util.concurrent.r;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.InterfaceC4850b0;
import kotlin.InterfaceC4887e0;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class a {
    @InterfaceC4887e0(version = "2.1")
    @InterfaceC4850b0
    public static final int a(@NotNull AtomicInteger atomicInteger, int i10, int i11) {
        G.p(atomicInteger, "<this>");
        do {
            int i12 = atomicInteger.get();
            if (i10 != i12) {
                return i12;
            }
        } while (!atomicInteger.compareAndSet(i10, i11));
        return i10;
    }

    @InterfaceC4887e0(version = "2.1")
    @InterfaceC4850b0
    public static final int b(@NotNull AtomicIntegerArray atomicIntegerArray, int i10, int i11, int i12) {
        G.p(atomicIntegerArray, "<this>");
        do {
            int i13 = atomicIntegerArray.get(i10);
            if (i11 != i13) {
                return i13;
            }
        } while (!atomicIntegerArray.compareAndSet(i10, i11, i12));
        return i11;
    }

    @InterfaceC4887e0(version = "2.1")
    @InterfaceC4850b0
    public static final long c(@NotNull AtomicLong atomicLong, long j10, long j11) {
        G.p(atomicLong, "<this>");
        do {
            long j12 = atomicLong.get();
            if (j10 != j12) {
                return j12;
            }
        } while (!atomicLong.compareAndSet(j10, j11));
        return j10;
    }

    @InterfaceC4887e0(version = "2.1")
    @InterfaceC4850b0
    public static final long d(@NotNull AtomicLongArray atomicLongArray, int i10, long j10, long j11) {
        G.p(atomicLongArray, "<this>");
        do {
            long j12 = atomicLongArray.get(i10);
            if (j10 != j12) {
                return j12;
            }
        } while (!atomicLongArray.compareAndSet(i10, j10, j11));
        return j10;
    }

    @InterfaceC4887e0(version = "2.1")
    @InterfaceC4850b0
    public static final <T> T e(@NotNull AtomicReference<T> atomicReference, T t10, T t11) {
        G.p(atomicReference, "<this>");
        do {
            T t12 = atomicReference.get();
            if (t10 != t12) {
                return t12;
            }
        } while (!C1598m0.a(atomicReference, t10, t11));
        return t10;
    }

    @InterfaceC4887e0(version = "2.1")
    @InterfaceC4850b0
    public static final <T> T f(@NotNull AtomicReferenceArray<T> atomicReferenceArray, int i10, T t10, T t11) {
        G.p(atomicReferenceArray, "<this>");
        do {
            T t12 = atomicReferenceArray.get(i10);
            if (t10 != t12) {
                return t12;
            }
        } while (!r.a(atomicReferenceArray, i10, t10, t11));
        return t10;
    }

    @InterfaceC4887e0(version = "2.1")
    @InterfaceC4850b0
    public static final boolean g(@NotNull AtomicBoolean atomicBoolean, boolean z10, boolean z11) {
        G.p(atomicBoolean, "<this>");
        do {
            boolean z12 = atomicBoolean.get();
            if (z10 != z12) {
                return z12;
            }
        } while (!atomicBoolean.compareAndSet(z10, z11));
        return z10;
    }
}
