package Qc;

import androidx.compose.animation.core.C1598m0;
import ed.l;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.InterfaceC4887e0;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public class f extends e {
    @InterfaceC4887e0(version = "2.2")
    @g
    @Xc.f
    public static final int A(AtomicInteger atomicInteger, l<? super Integer, Integer> transform) {
        int i10;
        int iIntValue;
        G.p(atomicInteger, "<this>");
        G.p(transform, "transform");
        do {
            i10 = atomicInteger.get();
            iIntValue = transform.invoke(Integer.valueOf(i10)).intValue();
        } while (!atomicInteger.compareAndSet(i10, iIntValue));
        return iIntValue;
    }

    @InterfaceC4887e0(version = "2.2")
    @g
    @Xc.f
    public static final long B(AtomicLong atomicLong, l<? super Long, Long> transform) {
        long j10;
        long jLongValue;
        G.p(atomicLong, "<this>");
        G.p(transform, "transform");
        do {
            j10 = atomicLong.get();
            jLongValue = transform.invoke(Long.valueOf(j10)).longValue();
        } while (!atomicLong.compareAndSet(j10, jLongValue));
        return jLongValue;
    }

    @InterfaceC4887e0(version = "2.2")
    @g
    @Xc.f
    public static final <T> T C(AtomicReference<T> atomicReference, l<? super T, ? extends T> transform) {
        T t10;
        T tInvoke;
        G.p(atomicReference, "<this>");
        G.p(transform, "transform");
        do {
            t10 = atomicReference.get();
            tInvoke = transform.invoke(t10);
        } while (!C1598m0.a(atomicReference, t10, tInvoke));
        return tInvoke;
    }

    @InterfaceC4887e0(version = "2.1")
    @g
    @NotNull
    public static final AtomicBoolean m(@NotNull AtomicBoolean atomicBoolean) {
        G.p(atomicBoolean, "<this>");
        return atomicBoolean;
    }

    @InterfaceC4887e0(version = "2.1")
    @g
    @NotNull
    public static final AtomicInteger n(@NotNull AtomicInteger atomicInteger) {
        G.p(atomicInteger, "<this>");
        return atomicInteger;
    }

    @InterfaceC4887e0(version = "2.1")
    @g
    @NotNull
    public static final AtomicLong o(@NotNull AtomicLong atomicLong) {
        G.p(atomicLong, "<this>");
        return atomicLong;
    }

    @InterfaceC4887e0(version = "2.1")
    @g
    @NotNull
    public static final <T> AtomicReference<T> p(@NotNull AtomicReference<T> atomicReference) {
        G.p(atomicReference, "<this>");
        return atomicReference;
    }

    @InterfaceC4887e0(version = "2.1")
    @g
    @NotNull
    public static final AtomicBoolean q(@NotNull AtomicBoolean atomicBoolean) {
        G.p(atomicBoolean, "<this>");
        return atomicBoolean;
    }

    @InterfaceC4887e0(version = "2.1")
    @g
    @NotNull
    public static final AtomicInteger r(@NotNull AtomicInteger atomicInteger) {
        G.p(atomicInteger, "<this>");
        return atomicInteger;
    }

    @InterfaceC4887e0(version = "2.1")
    @g
    @NotNull
    public static final AtomicLong s(@NotNull AtomicLong atomicLong) {
        G.p(atomicLong, "<this>");
        return atomicLong;
    }

    @InterfaceC4887e0(version = "2.1")
    @g
    @NotNull
    public static final <T> AtomicReference<T> t(@NotNull AtomicReference<T> atomicReference) {
        G.p(atomicReference, "<this>");
        return atomicReference;
    }

    @InterfaceC4887e0(version = "2.2")
    @g
    @Xc.f
    public static final int u(AtomicInteger atomicInteger, l<? super Integer, Integer> transform) {
        int i10;
        G.p(atomicInteger, "<this>");
        G.p(transform, "transform");
        do {
            i10 = atomicInteger.get();
        } while (!atomicInteger.compareAndSet(i10, transform.invoke(Integer.valueOf(i10)).intValue()));
        return i10;
    }

    @InterfaceC4887e0(version = "2.2")
    @g
    @Xc.f
    public static final long v(AtomicLong atomicLong, l<? super Long, Long> transform) {
        long j10;
        G.p(atomicLong, "<this>");
        G.p(transform, "transform");
        do {
            j10 = atomicLong.get();
        } while (!atomicLong.compareAndSet(j10, transform.invoke(Long.valueOf(j10)).longValue()));
        return j10;
    }

    @InterfaceC4887e0(version = "2.2")
    @g
    @Xc.f
    public static final <T> T w(AtomicReference<T> atomicReference, l<? super T, ? extends T> transform) {
        T t10;
        G.p(atomicReference, "<this>");
        G.p(transform, "transform");
        do {
            t10 = atomicReference.get();
        } while (!C1598m0.a(atomicReference, t10, transform.invoke(t10)));
        return t10;
    }

    @InterfaceC4887e0(version = "2.2")
    @g
    @Xc.f
    public static final void x(AtomicInteger atomicInteger, l<? super Integer, Integer> transform) {
        int i10;
        G.p(atomicInteger, "<this>");
        G.p(transform, "transform");
        do {
            i10 = atomicInteger.get();
        } while (!atomicInteger.compareAndSet(i10, transform.invoke(Integer.valueOf(i10)).intValue()));
    }

    @InterfaceC4887e0(version = "2.2")
    @g
    @Xc.f
    public static final void y(AtomicLong atomicLong, l<? super Long, Long> transform) {
        long j10;
        G.p(atomicLong, "<this>");
        G.p(transform, "transform");
        do {
            j10 = atomicLong.get();
        } while (!atomicLong.compareAndSet(j10, transform.invoke(Long.valueOf(j10)).longValue()));
    }

    @InterfaceC4887e0(version = "2.2")
    @g
    @Xc.f
    public static final <T> void z(AtomicReference<T> atomicReference, l<? super T, ? extends T> transform) {
        T t10;
        G.p(atomicReference, "<this>");
        G.p(transform, "transform");
        do {
            t10 = atomicReference.get();
        } while (!C1598m0.a(atomicReference, t10, transform.invoke(t10)));
    }
}
