package okio;

import androidx.compose.animation.core.C1598m0;
import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class b0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f225923b = 65536;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f225925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final AtomicReference<a0>[] f225926e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b0 f225922a = new b0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a0 f225924c = new a0(new byte[0], 0, 0, false, false);

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f225925d = iHighestOneBit;
        AtomicReference<a0>[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i10 = 0; i10 < iHighestOneBit; i10++) {
            atomicReferenceArr[i10] = new AtomicReference<>();
        }
        f225926e = atomicReferenceArr;
    }

    @dd.o
    public static final void d(@NotNull a0 segment) {
        AtomicReference<a0> atomicReferenceA;
        a0 a0Var;
        kotlin.jvm.internal.G.p(segment, "segment");
        if (segment.f225919f != null || segment.f225920g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (segment.f225917d || (a0Var = (atomicReferenceA = f225922a.a()).get()) == f225924c) {
            return;
        }
        int i10 = a0Var != null ? a0Var.f225916c : 0;
        if (i10 >= f225923b) {
            return;
        }
        segment.f225919f = a0Var;
        segment.f225915b = 0;
        segment.f225916c = i10 + 8192;
        if (C1598m0.a(atomicReferenceA, a0Var, segment)) {
            return;
        }
        segment.f225919f = null;
    }

    @dd.o
    @NotNull
    public static final a0 e() {
        AtomicReference<a0> atomicReferenceA = f225922a.a();
        a0 a0Var = f225924c;
        a0 andSet = atomicReferenceA.getAndSet(a0Var);
        if (andSet == a0Var) {
            return new a0();
        }
        if (andSet == null) {
            atomicReferenceA.set(null);
            return new a0();
        }
        atomicReferenceA.set(andSet.f225919f);
        andSet.f225919f = null;
        andSet.f225916c = 0;
        return andSet;
    }

    public final AtomicReference<a0> a() {
        return f225926e[(int) (Thread.currentThread().getId() & (((long) f225925d) - 1))];
    }

    public final int b() {
        a0 a0Var = a().get();
        if (a0Var == null) {
            return 0;
        }
        return a0Var.f225916c;
    }

    public final int c() {
        return f225923b;
    }
}
