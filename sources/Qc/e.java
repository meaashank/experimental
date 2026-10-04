package Qc;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.InterfaceC4887e0;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public class e {
    @InterfaceC4887e0(version = "2.1")
    @g
    public static final int a(@NotNull AtomicInteger atomicInteger) {
        G.p(atomicInteger, "<this>");
        return atomicInteger.addAndGet(-1);
    }

    @InterfaceC4887e0(version = "2.1")
    @g
    public static final long b(@NotNull AtomicLong atomicLong) {
        G.p(atomicLong, "<this>");
        return atomicLong.addAndGet(-1L);
    }

    @InterfaceC4887e0(version = "2.1")
    @g
    public static final int c(@NotNull AtomicInteger atomicInteger) {
        G.p(atomicInteger, "<this>");
        return atomicInteger.getAndAdd(-1);
    }

    @InterfaceC4887e0(version = "2.1")
    @g
    public static final long d(@NotNull AtomicLong atomicLong) {
        G.p(atomicLong, "<this>");
        return atomicLong.getAndAdd(-1L);
    }

    @InterfaceC4887e0(version = "2.1")
    @g
    public static final int e(@NotNull AtomicInteger atomicInteger) {
        G.p(atomicInteger, "<this>");
        return atomicInteger.getAndAdd(1);
    }

    @InterfaceC4887e0(version = "2.1")
    @g
    public static final long f(@NotNull AtomicLong atomicLong) {
        G.p(atomicLong, "<this>");
        return atomicLong.getAndAdd(1L);
    }

    @InterfaceC4887e0(version = "2.1")
    @g
    public static final int g(@NotNull AtomicInteger atomicInteger) {
        G.p(atomicInteger, "<this>");
        return atomicInteger.addAndGet(1);
    }

    @InterfaceC4887e0(version = "2.1")
    @g
    public static final long h(@NotNull AtomicLong atomicLong) {
        G.p(atomicLong, "<this>");
        return atomicLong.addAndGet(1L);
    }

    @InterfaceC4887e0(version = "2.1")
    @g
    public static final void i(@NotNull AtomicInteger atomicInteger, int i10) {
        G.p(atomicInteger, "<this>");
        atomicInteger.addAndGet(-i10);
    }

    @InterfaceC4887e0(version = "2.1")
    @g
    public static final void j(@NotNull AtomicLong atomicLong, long j10) {
        G.p(atomicLong, "<this>");
        atomicLong.addAndGet(-j10);
    }

    @InterfaceC4887e0(version = "2.1")
    @g
    public static final void k(@NotNull AtomicInteger atomicInteger, int i10) {
        G.p(atomicInteger, "<this>");
        atomicInteger.addAndGet(i10);
    }

    @InterfaceC4887e0(version = "2.1")
    @g
    public static final void l(@NotNull AtomicLong atomicLong, long j10) {
        G.p(atomicLong, "<this>");
        atomicLong.addAndGet(j10);
    }
}
