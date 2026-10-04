package io.reactivex.rxjava3.internal.queue;

import Dc.p;
import io.reactivex.rxjava3.internal.util.l;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import yc.f;

/* JADX INFO: loaded from: classes7.dex */
public final class a<T> implements p<T> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f211712i = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f211713j = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f211715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f211716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f211717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AtomicReferenceArray<Object> f211718e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f211719f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AtomicReferenceArray<Object> f211720g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicLong f211714a = new AtomicLong();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicLong f211721h = new AtomicLong();

    public a(final int bufferSize) {
        int iB = l.b(Math.max(8, bufferSize));
        int i10 = iB - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(iB + 1);
        this.f211718e = atomicReferenceArray;
        this.f211717d = i10;
        a(iB);
        this.f211720g = atomicReferenceArray;
        this.f211719f = i10;
        this.f211716c = iB - 2;
        t(0L);
    }

    public static int b(int index) {
        return index;
    }

    public static int c(long index, int mask) {
        return ((int) index) & mask;
    }

    public static Object j(AtomicReferenceArray<Object> buffer, int offset) {
        return buffer.get(offset);
    }

    private void q(long v10) {
        this.f211721h.lazySet(v10);
    }

    public static void r(AtomicReferenceArray<Object> buffer, int offset, Object e10) {
        buffer.lazySet(offset, e10);
    }

    private void t(long v10) {
        this.f211714a.lazySet(v10);
    }

    public final void a(int capacity) {
        this.f211715b = Math.min(capacity / 4, f211712i);
    }

    @Override // Dc.q
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    public final long d() {
        return this.f211721h.get();
    }

    public final long e() {
        return this.f211714a.get();
    }

    public final long f() {
        return this.f211721h.get();
    }

    @Override // Dc.q
    public boolean isEmpty() {
        return this.f211714a.get() == this.f211721h.get();
    }

    public final AtomicReferenceArray<Object> k(AtomicReferenceArray<Object> curr, int nextIndex) {
        AtomicReferenceArray<Object> atomicReferenceArray = (AtomicReferenceArray) curr.get(nextIndex);
        curr.lazySet(nextIndex, null);
        return atomicReferenceArray;
    }

    public final long l() {
        return this.f211714a.get();
    }

    public final T m(AtomicReferenceArray<Object> atomicReferenceArray, long j10, int i10) {
        this.f211720g = atomicReferenceArray;
        return (T) atomicReferenceArray.get(((int) j10) & i10);
    }

    public final T n(AtomicReferenceArray<Object> atomicReferenceArray, long j10, int i10) {
        this.f211720g = atomicReferenceArray;
        int i11 = i10 & ((int) j10);
        T t10 = (T) atomicReferenceArray.get(i11);
        if (t10 != null) {
            atomicReferenceArray.lazySet(i11, null);
            q(j10 + 1);
        }
        return t10;
    }

    public final void o(final AtomicReferenceArray<Object> oldBuffer, final long currIndex, final int offset, final T e10, final long mask) {
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(oldBuffer.length());
        this.f211718e = atomicReferenceArray;
        this.f211716c = (mask + currIndex) - 1;
        atomicReferenceArray.lazySet(offset, e10);
        s(oldBuffer, atomicReferenceArray);
        oldBuffer.lazySet(offset, f211713j);
        t(currIndex + 1);
    }

    @Override // Dc.q
    public boolean offer(final T e10) {
        if (e10 == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicReferenceArray<Object> atomicReferenceArray = this.f211718e;
        long j10 = this.f211714a.get();
        int i10 = this.f211717d;
        int i11 = ((int) j10) & i10;
        if (j10 < this.f211716c) {
            u(atomicReferenceArray, e10, j10, i11);
            return true;
        }
        long j11 = ((long) this.f211715b) + j10;
        if (atomicReferenceArray.get(((int) j11) & i10) == null) {
            this.f211716c = j11 - 1;
            u(atomicReferenceArray, e10, j10, i11);
            return true;
        }
        if (atomicReferenceArray.get(((int) (j10 + 1)) & i10) == null) {
            u(atomicReferenceArray, e10, j10, i11);
            return true;
        }
        o(atomicReferenceArray, j10, i11, e10, i10);
        return true;
    }

    public int p() {
        long j10 = this.f211721h.get();
        while (true) {
            long j11 = this.f211714a.get();
            long j12 = this.f211721h.get();
            if (j10 == j12) {
                return (int) (j11 - j12);
            }
            j10 = j12;
        }
    }

    public T peek() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f211720g;
        long j10 = this.f211721h.get();
        int i10 = this.f211719f;
        T t10 = (T) atomicReferenceArray.get(((int) j10) & i10);
        if (t10 != f211713j) {
            return t10;
        }
        int i11 = i10 + 1;
        AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(i11);
        atomicReferenceArray.lazySet(i11, null);
        return m(atomicReferenceArray2, j10, i10);
    }

    @Override // Dc.p, Dc.q
    @f
    public T poll() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f211720g;
        long j10 = this.f211721h.get();
        int i10 = this.f211719f;
        int i11 = ((int) j10) & i10;
        T t10 = (T) atomicReferenceArray.get(i11);
        boolean z10 = t10 == f211713j;
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

    public final void s(AtomicReferenceArray<Object> curr, AtomicReferenceArray<Object> next) {
        curr.lazySet(curr.length() - 1, next);
    }

    public final boolean u(final AtomicReferenceArray<Object> buffer, final T e10, final long index, final int offset) {
        buffer.lazySet(offset, e10);
        t(index + 1);
        return true;
    }

    @Override // Dc.q
    public boolean offer(T first, T second) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f211718e;
        long j10 = this.f211714a.get();
        int i10 = this.f211717d;
        long j11 = 2 + j10;
        if (atomicReferenceArray.get(((int) j11) & i10) == null) {
            int i11 = ((int) j10) & i10;
            atomicReferenceArray.lazySet(i11 + 1, second);
            atomicReferenceArray.lazySet(i11, first);
            t(j11);
            return true;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f211718e = atomicReferenceArray2;
        int i12 = ((int) j10) & i10;
        atomicReferenceArray2.lazySet(i12 + 1, second);
        atomicReferenceArray2.lazySet(i12, first);
        s(atomicReferenceArray, atomicReferenceArray2);
        atomicReferenceArray.lazySet(i12, f211713j);
        t(j11);
        return true;
    }
}
