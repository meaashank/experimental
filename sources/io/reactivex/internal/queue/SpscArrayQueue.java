package io.reactivex.internal.queue;

import io.reactivex.internal.util.l;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import lc.f;
import pc.n;

/* JADX INFO: loaded from: classes7.dex */
public final class SpscArrayQueue<E> extends AtomicReferenceArray<E> implements n<E> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Integer f206970f = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    private static final long serialVersionUID = -1296597691183856449L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f206971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicLong f206972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f206973c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicLong f206974d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f206975e;

    public SpscArrayQueue(int i10) {
        super(l.b(i10));
        this.f206971a = length() - 1;
        this.f206972b = new AtomicLong();
        this.f206974d = new AtomicLong();
        this.f206975e = Math.min(i10 / 4, f206970f.intValue());
    }

    public int a(long j10) {
        return ((int) j10) & this.f206971a;
    }

    public int b(long j10, int i10) {
        return ((int) j10) & i10;
    }

    public E c(int i10) {
        return get(i10);
    }

    @Override // pc.o
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    public void d(long j10) {
        this.f206974d.lazySet(j10);
    }

    public void e(int i10, E e10) {
        lazySet(i10, e10);
    }

    public void f(long j10) {
        this.f206972b.lazySet(j10);
    }

    @Override // pc.o
    public boolean isEmpty() {
        return this.f206972b.get() == this.f206974d.get();
    }

    @Override // pc.o
    public boolean offer(E e10) {
        if (e10 == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        int i10 = this.f206971a;
        long j10 = this.f206972b.get();
        int i11 = ((int) j10) & i10;
        if (j10 >= this.f206973c) {
            long j11 = ((long) this.f206975e) + j10;
            if (get(i10 & ((int) j11)) == null) {
                this.f206973c = j11;
            } else if (get(i11) != null) {
                return false;
            }
        }
        lazySet(i11, e10);
        f(j10 + 1);
        return true;
    }

    @Override // pc.n, pc.o
    @f
    public E poll() {
        long j10 = this.f206974d.get();
        int i10 = ((int) j10) & this.f206971a;
        E e10 = get(i10);
        if (e10 == null) {
            return null;
        }
        d(j10 + 1);
        lazySet(i10, null);
        return e10;
    }

    @Override // pc.o
    public boolean offer(E e10, E e11) {
        return offer(e10) && offer(e11);
    }
}
