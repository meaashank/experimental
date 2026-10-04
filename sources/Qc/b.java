package Qc;

import ed.l;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.InterfaceC4887e0;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@V({"SMAP\nAtomicArrays.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AtomicArrays.common.kt\nkotlin/concurrent/atomics/AtomicArraysKt__AtomicArrays_commonKt\n*L\n1#1,769:1\n667#1:770\n*S KotlinDebug\n*F\n+ 1 AtomicArrays.common.kt\nkotlin/concurrent/atomics/AtomicArraysKt__AtomicArrays_commonKt\n*L\n679#1:770\n*E\n"})
public class b {
    @InterfaceC4887e0(version = "2.1")
    @g
    public static final <T> AtomicReferenceArray<T> a(int i10, l<? super Integer, ? extends T> init) {
        G.p(init, "init");
        G.P();
        throw null;
    }

    @InterfaceC4887e0(version = "2.1")
    @g
    @NotNull
    public static final AtomicIntegerArray b(int i10, @NotNull l<? super Integer, Integer> init) {
        G.p(init, "init");
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr[i11] = init.invoke(Integer.valueOf(i11)).intValue();
        }
        return new AtomicIntegerArray(iArr);
    }

    @InterfaceC4887e0(version = "2.1")
    @g
    @NotNull
    public static final AtomicLongArray c(int i10, @NotNull l<? super Integer, Long> init) {
        G.p(init, "init");
        long[] jArr = new long[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            jArr[i11] = init.invoke(Integer.valueOf(i11)).longValue();
        }
        return new AtomicLongArray(jArr);
    }

    @InterfaceC4887e0(version = "2.2")
    @g
    public static final <T> AtomicReferenceArray<T> d(int i10) {
        G.P();
        throw null;
    }

    @InterfaceC4887e0(version = "2.1")
    @g
    public static final int e(@NotNull AtomicIntegerArray atomicIntegerArray, int i10) {
        G.p(atomicIntegerArray, "<this>");
        return atomicIntegerArray.addAndGet(i10, -1);
    }

    @InterfaceC4887e0(version = "2.1")
    @g
    public static final long f(@NotNull AtomicLongArray atomicLongArray, int i10) {
        G.p(atomicLongArray, "<this>");
        return atomicLongArray.addAndGet(i10, -1L);
    }

    @InterfaceC4887e0(version = "2.1")
    @g
    public static final int g(@NotNull AtomicIntegerArray atomicIntegerArray, int i10) {
        G.p(atomicIntegerArray, "<this>");
        return atomicIntegerArray.getAndAdd(i10, -1);
    }

    @InterfaceC4887e0(version = "2.1")
    @g
    public static final long h(@NotNull AtomicLongArray atomicLongArray, int i10) {
        G.p(atomicLongArray, "<this>");
        return atomicLongArray.getAndAdd(i10, -1L);
    }

    @InterfaceC4887e0(version = "2.1")
    @g
    public static final int i(@NotNull AtomicIntegerArray atomicIntegerArray, int i10) {
        G.p(atomicIntegerArray, "<this>");
        return atomicIntegerArray.getAndAdd(i10, 1);
    }

    @InterfaceC4887e0(version = "2.1")
    @g
    public static final long j(@NotNull AtomicLongArray atomicLongArray, int i10) {
        G.p(atomicLongArray, "<this>");
        return atomicLongArray.getAndAdd(i10, 1L);
    }

    @InterfaceC4887e0(version = "2.1")
    @g
    public static final int k(@NotNull AtomicIntegerArray atomicIntegerArray, int i10) {
        G.p(atomicIntegerArray, "<this>");
        return atomicIntegerArray.addAndGet(i10, 1);
    }

    @InterfaceC4887e0(version = "2.1")
    @g
    public static final long l(@NotNull AtomicLongArray atomicLongArray, int i10) {
        G.p(atomicLongArray, "<this>");
        return atomicLongArray.addAndGet(i10, 1L);
    }
}
