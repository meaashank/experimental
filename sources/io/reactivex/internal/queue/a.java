package io.reactivex.internal.queue;

import io.reactivex.internal.util.l;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import lc.f;
import pc.n;

/* JADX INFO: loaded from: classes7.dex */
public final class a<T> implements n<T> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f206976i = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f206977j = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f206979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f206980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f206981d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AtomicReferenceArray<Object> f206982e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f206983f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AtomicReferenceArray<Object> f206984g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicLong f206978a = new AtomicLong();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicLong f206985h = new AtomicLong();

    public a(int i10) {
        int iB = l.b(Math.max(8, i10));
        int i11 = iB - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(iB + 1);
        this.f206982e = atomicReferenceArray;
        this.f206981d = i11;
        a(iB);
        this.f206984g = atomicReferenceArray;
        this.f206983f = i11;
        this.f206980c = iB - 2;
        t(0L);
    }

    private void a(int i10) {
        this.f206979b = Math.min(i10 / 4, f206976i);
    }

    private static int b(int i10) {
        return i10;
    }

    private static int c(long j10, int i10) {
        return ((int) j10) & i10;
    }

    private long d() {
        return this.f206985h.get();
    }

    private long e() {
        return this.f206978a.get();
    }

    private long f() {
        return this.f206985h.get();
    }

    private static <E> Object j(AtomicReferenceArray<Object> atomicReferenceArray, int i10) {
        return atomicReferenceArray.get(i10);
    }

    private AtomicReferenceArray<Object> k(AtomicReferenceArray<Object> atomicReferenceArray, int i10) {
        AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(i10);
        atomicReferenceArray.lazySet(i10, null);
        return atomicReferenceArray2;
    }

    private long l() {
        return this.f206978a.get();
    }

    private T m(AtomicReferenceArray<Object> atomicReferenceArray, long j10, int i10) {
        this.f206984g = atomicReferenceArray;
        return (T) atomicReferenceArray.get(((int) j10) & i10);
    }

    private T n(AtomicReferenceArray<Object> atomicReferenceArray, long j10, int i10) {
        this.f206984g = atomicReferenceArray;
        int i11 = i10 & ((int) j10);
        T t10 = (T) atomicReferenceArray.get(i11);
        if (t10 != null) {
            atomicReferenceArray.lazySet(i11, null);
            q(j10 + 1);
        }
        return t10;
    }

    private void o(AtomicReferenceArray<Object> atomicReferenceArray, long j10, int i10, T t10, long j11) {
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f206982e = atomicReferenceArray2;
        this.f206980c = (j11 + j10) - 1;
        atomicReferenceArray2.lazySet(i10, t10);
        s(atomicReferenceArray, atomicReferenceArray2);
        atomicReferenceArray.lazySet(i10, f206977j);
        t(j10 + 1);
    }

    private void q(long j10) {
        this.f206985h.lazySet(j10);
    }

    private static void r(AtomicReferenceArray<Object> atomicReferenceArray, int i10, Object obj) {
        atomicReferenceArray.lazySet(i10, obj);
    }

    private void s(AtomicReferenceArray<Object> atomicReferenceArray, AtomicReferenceArray<Object> atomicReferenceArray2) {
        atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
    }

    private void t(long j10) {
        this.f206978a.lazySet(j10);
    }

    private boolean u(AtomicReferenceArray<Object> atomicReferenceArray, T t10, long j10, int i10) {
        atomicReferenceArray.lazySet(i10, t10);
        t(j10 + 1);
        return true;
    }

    @Override // pc.o
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // pc.o
    public boolean isEmpty() {
        return this.f206978a.get() == this.f206985h.get();
    }

    @Override // pc.o
    public boolean offer(T t10) {
        if (t10 == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicReferenceArray<Object> atomicReferenceArray = this.f206982e;
        long j10 = this.f206978a.get();
        int i10 = this.f206981d;
        int i11 = ((int) j10) & i10;
        if (j10 < this.f206980c) {
            u(atomicReferenceArray, t10, j10, i11);
            return true;
        }
        long j11 = ((long) this.f206979b) + j10;
        if (atomicReferenceArray.get(((int) j11) & i10) == null) {
            this.f206980c = j11 - 1;
            u(atomicReferenceArray, t10, j10, i11);
            return true;
        }
        if (atomicReferenceArray.get(((int) (j10 + 1)) & i10) == null) {
            u(atomicReferenceArray, t10, j10, i11);
            return true;
        }
        o(atomicReferenceArray, j10, i11, t10, i10);
        return true;
    }

    public int p() {
        long j10 = this.f206985h.get();
        while (true) {
            long j11 = this.f206978a.get();
            long j12 = this.f206985h.get();
            if (j10 == j12) {
                return (int) (j11 - j12);
            }
            j10 = j12;
        }
    }

    public T peek() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f206984g;
        long j10 = this.f206985h.get();
        int i10 = this.f206983f;
        T t10 = (T) atomicReferenceArray.get(((int) j10) & i10);
        if (t10 != f206977j) {
            return t10;
        }
        int i11 = i10 + 1;
        AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(i11);
        atomicReferenceArray.lazySet(i11, null);
        return m(atomicReferenceArray2, j10, i10);
    }

    @Override // pc.n, pc.o
    @f
    public T poll() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f206984g;
        long j10 = this.f206985h.get();
        int i10 = this.f206983f;
        int i11 = ((int) j10) & i10;
        T t10 = (T) atomicReferenceArray.get(i11);
        boolean z10 = t10 == f206977j;
        if (t10 != null && !z10) {
            atomicReferenceArray.lazySet(i11, null);
            q(j10 + 1);
            return t10;
        }
        if (!z10) {
            return null;
        }
        int i12 = i10 + 1;
        AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(i12);
        atomicReferenceArray.lazySet(i12, null);
        return n(atomicReferenceArray2, j10, i10);
    }

    @Override // pc.o
    public boolean offer(T t10, T t11) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f206982e;
        long j10 = this.f206978a.get();
        int i10 = this.f206981d;
        long j11 = 2 + j10;
        if (atomicReferenceArray.get(((int) j11) & i10) == null) {
            int i11 = ((int) j10) & i10;
            atomicReferenceArray.lazySet(i11 + 1, t11);
            atomicReferenceArray.lazySet(i11, t10);
            t(j11);
            return true;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f206982e = atomicReferenceArray2;
        int i12 = ((int) j10) & i10;
        atomicReferenceArray2.lazySet(i12 + 1, t11);
        atomicReferenceArray2.lazySet(i12, t10);
        s(atomicReferenceArray, atomicReferenceArray2);
        atomicReferenceArray.lazySet(i12, f206977j);
        t(j11);
        return true;
    }
}
