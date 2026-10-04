package Qc;

import com.google.common.util.concurrent.r;
import ed.l;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.InterfaceC4887e0;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public class c extends b {
    @InterfaceC4887e0(version = "2.2")
    @g
    @Xc.f
    public static final <T> void A(AtomicReferenceArray<T> atomicReferenceArray, int i10, l<? super T, ? extends T> transform) {
        T t10;
        G.p(atomicReferenceArray, "<this>");
        G.p(transform, "transform");
        do {
            t10 = atomicReferenceArray.get(i10);
        } while (!r.a(atomicReferenceArray, i10, t10, transform.invoke(t10)));
    }

    @InterfaceC4887e0(version = "2.1")
    @g
    @NotNull
    public static final AtomicIntegerArray m(@NotNull AtomicIntegerArray atomicIntegerArray) {
        G.p(atomicIntegerArray, "<this>");
        return atomicIntegerArray;
    }

    @InterfaceC4887e0(version = "2.1")
    @g
    @NotNull
    public static final AtomicLongArray n(@NotNull AtomicLongArray atomicLongArray) {
        G.p(atomicLongArray, "<this>");
        return atomicLongArray;
    }

    @InterfaceC4887e0(version = "2.1")
    @g
    @NotNull
    public static final <T> AtomicReferenceArray<T> o(@NotNull AtomicReferenceArray<T> atomicReferenceArray) {
        G.p(atomicReferenceArray, "<this>");
        return atomicReferenceArray;
    }

    @InterfaceC4887e0(version = "2.1")
    @g
    @NotNull
    public static final AtomicIntegerArray p(@NotNull AtomicIntegerArray atomicIntegerArray) {
        G.p(atomicIntegerArray, "<this>");
        return atomicIntegerArray;
    }

    @InterfaceC4887e0(version = "2.1")
    @g
    @NotNull
    public static final AtomicLongArray q(@NotNull AtomicLongArray atomicLongArray) {
        G.p(atomicLongArray, "<this>");
        return atomicLongArray;
    }

    @InterfaceC4887e0(version = "2.1")
    @g
    @NotNull
    public static final <T> AtomicReferenceArray<T> r(@NotNull AtomicReferenceArray<T> atomicReferenceArray) {
        G.p(atomicReferenceArray, "<this>");
        return atomicReferenceArray;
    }

    @InterfaceC4887e0(version = "2.2")
    @g
    @Xc.f
    public static final int s(AtomicIntegerArray atomicIntegerArray, int i10, l<? super Integer, Integer> transform) {
        int i11;
        G.p(atomicIntegerArray, "<this>");
        G.p(transform, "transform");
        do {
            i11 = atomicIntegerArray.get(i10);
        } while (!atomicIntegerArray.compareAndSet(i10, i11, transform.invoke(Integer.valueOf(i11)).intValue()));
        return i11;
    }

    @InterfaceC4887e0(version = "2.2")
    @g
    @Xc.f
    public static final long t(AtomicLongArray atomicLongArray, int i10, l<? super Long, Long> transform) {
        G.p(atomicLongArray, "<this>");
        G.p(transform, "transform");
        while (true) {
            long j10 = atomicLongArray.get(i10);
            AtomicLongArray atomicLongArray2 = atomicLongArray;
            int i11 = i10;
            if (atomicLongArray2.compareAndSet(i11, j10, transform.invoke(Long.valueOf(j10)).longValue())) {
                return j10;
            }
            atomicLongArray = atomicLongArray2;
            i10 = i11;
        }
    }

    @InterfaceC4887e0(version = "2.2")
    @g
    @Xc.f
    public static final <T> T u(AtomicReferenceArray<T> atomicReferenceArray, int i10, l<? super T, ? extends T> transform) {
        T t10;
        G.p(atomicReferenceArray, "<this>");
        G.p(transform, "transform");
        do {
            t10 = atomicReferenceArray.get(i10);
        } while (!r.a(atomicReferenceArray, i10, t10, transform.invoke(t10)));
        return t10;
    }

    @InterfaceC4887e0(version = "2.2")
    @g
    @Xc.f
    public static final int v(AtomicIntegerArray atomicIntegerArray, int i10, l<? super Integer, Integer> transform) {
        int i11;
        int iIntValue;
        G.p(atomicIntegerArray, "<this>");
        G.p(transform, "transform");
        do {
            i11 = atomicIntegerArray.get(i10);
            iIntValue = transform.invoke(Integer.valueOf(i11)).intValue();
        } while (!atomicIntegerArray.compareAndSet(i10, i11, iIntValue));
        return iIntValue;
    }

    @InterfaceC4887e0(version = "2.2")
    @g
    @Xc.f
    public static final long w(AtomicLongArray atomicLongArray, int i10, l<? super Long, Long> transform) {
        G.p(atomicLongArray, "<this>");
        G.p(transform, "transform");
        while (true) {
            long j10 = atomicLongArray.get(i10);
            long jLongValue = transform.invoke(Long.valueOf(j10)).longValue();
            AtomicLongArray atomicLongArray2 = atomicLongArray;
            int i11 = i10;
            if (atomicLongArray2.compareAndSet(i11, j10, jLongValue)) {
                return jLongValue;
            }
            atomicLongArray = atomicLongArray2;
            i10 = i11;
        }
    }

    @InterfaceC4887e0(version = "2.2")
    @g
    @Xc.f
    public static final <T> T x(AtomicReferenceArray<T> atomicReferenceArray, int i10, l<? super T, ? extends T> transform) {
        T t10;
        T tInvoke;
        G.p(atomicReferenceArray, "<this>");
        G.p(transform, "transform");
        do {
            t10 = atomicReferenceArray.get(i10);
            tInvoke = transform.invoke(t10);
        } while (!r.a(atomicReferenceArray, i10, t10, tInvoke));
        return tInvoke;
    }

    @InterfaceC4887e0(version = "2.2")
    @g
    @Xc.f
    public static final void y(AtomicIntegerArray atomicIntegerArray, int i10, l<? super Integer, Integer> transform) {
        int i11;
        G.p(atomicIntegerArray, "<this>");
        G.p(transform, "transform");
        do {
            i11 = atomicIntegerArray.get(i10);
        } while (!atomicIntegerArray.compareAndSet(i10, i11, transform.invoke(Integer.valueOf(i11)).intValue()));
    }

    @InterfaceC4887e0(version = "2.2")
    @g
    @Xc.f
    public static final void z(AtomicLongArray atomicLongArray, int i10, l<? super Long, Long> transform) {
        G.p(atomicLongArray, "<this>");
        G.p(transform, "transform");
        while (true) {
            long j10 = atomicLongArray.get(i10);
            AtomicLongArray atomicLongArray2 = atomicLongArray;
            int i11 = i10;
            if (atomicLongArray2.compareAndSet(i11, j10, transform.invoke(Long.valueOf(j10)).longValue())) {
                return;
            }
            atomicLongArray = atomicLongArray2;
            i10 = i11;
        }
    }
}
