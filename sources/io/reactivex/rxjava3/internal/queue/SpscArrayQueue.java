package io.reactivex.rxjava3.internal.queue;

import Dc.p;
import io.reactivex.rxjava3.internal.util.l;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import yc.f;

/* JADX INFO: loaded from: classes7.dex */
public final class SpscArrayQueue<E> extends AtomicReferenceArray<E> implements p<E> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Integer f211706f = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    private static final long serialVersionUID = -1296597691183856449L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f211707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicLong f211708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f211709c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicLong f211710d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f211711e;

    public SpscArrayQueue(int capacity) {
        super(l.b(capacity));
        this.f211707a = length() - 1;
        this.f211708b = new AtomicLong();
        this.f211710d = new AtomicLong();
        this.f211711e = Math.min(capacity / 4, f211706f.intValue());
    }

    public int a(long index) {
        return ((int) index) & this.f211707a;
    }

    public int b(long index, int mask) {
        return ((int) index) & mask;
    }

    public E c(int offset) {
        return get(offset);
    }

    @Override // Dc.q
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    public void d(long newIndex) {
        this.f211710d.lazySet(newIndex);
    }

    public void e(int offset, E value) {
        lazySet(offset, value);
    }

    public void f(long newIndex) {
        this.f211708b.lazySet(newIndex);
    }

    @Override // Dc.q
    public boolean isEmpty() {
        return this.f211708b.get() == this.f211710d.get();
    }

    @Override // Dc.q
    public boolean offer(E e10) {
        if (e10 == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        int i10 = this.f211707a;
        long j10 = this.f211708b.get();
        int i11 = ((int) j10) & i10;
        if (j10 >= this.f211709c) {
            long j11 = ((long) this.f211711e) + j10;
            if (get(i10 & ((int) j11)) == null) {
                this.f211709c = j11;
            } else if (get(i11) != null) {
                return false;
            }
        }
        lazySet(i11, e10);
        f(j10 + 1);
        return true;
    }

    @Override // Dc.p, Dc.q
    @f
    public E poll() {
        long j10 = this.f211710d.get();
        int i10 = ((int) j10) & this.f211707a;
        E e10 = get(i10);
        if (e10 == null) {
            return null;
        }
        d(j10 + 1);
        lazySet(i10, null);
        return e10;
    }

    @Override // Dc.q
    public boolean offer(E v12, E v22) {
        return offer(v12) && offer(v22);
    }
}
