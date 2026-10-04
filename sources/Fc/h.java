package Fc;

import Dc.p;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.n;
import org.reactivestreams.Subscriber;
import zc.InterfaceC5907y;

/* JADX INFO: loaded from: classes7.dex */
public abstract class h<T, U, V> extends l implements InterfaceC5907y<T>, io.reactivex.rxjava3.internal.util.m<U, V> {

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final Subscriber<? super V> f39922V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final p<U> f39923W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public volatile boolean f39924X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public volatile boolean f39925Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public Throwable f39926Z;

    public h(Subscriber<? super V> actual, p<U> queue) {
        this.f39922V = actual;
        this.f39923W = queue;
    }

    @Override // io.reactivex.rxjava3.internal.util.m
    public final Throwable a() {
        return this.f39926Z;
    }

    @Override // io.reactivex.rxjava3.internal.util.m
    public final int b(int m10) {
        return this.f39973p.addAndGet(m10);
    }

    @Override // io.reactivex.rxjava3.internal.util.m
    public final boolean c() {
        return this.f39973p.getAndIncrement() == 0;
    }

    @Override // io.reactivex.rxjava3.internal.util.m
    public final boolean cancelled() {
        return this.f39924X;
    }

    @Override // io.reactivex.rxjava3.internal.util.m
    public final boolean d() {
        return this.f39925Y;
    }

    @Override // io.reactivex.rxjava3.internal.util.m
    public final long e(long n10) {
        return this.f39957F.addAndGet(-n10);
    }

    @Override // io.reactivex.rxjava3.internal.util.m
    public boolean f(Subscriber<? super V> a10, U v10) {
        return false;
    }

    @Override // io.reactivex.rxjava3.internal.util.m
    public final long g() {
        return this.f39957F.get();
    }

    public final boolean h() {
        return this.f39973p.get() == 0 && this.f39973p.compareAndSet(0, 1);
    }

    public final void i(U value, boolean delayError, io.reactivex.rxjava3.disposables.d dispose) {
        Subscriber<? super V> subscriber = this.f39922V;
        p<U> pVar = this.f39923W;
        if (h()) {
            long j10 = this.f39957F.get();
            if (j10 == 0) {
                dispose.dispose();
                subscriber.onError(new MissingBackpressureException("Could not emit buffer due to lack of requests"));
                return;
            } else {
                if (f(subscriber, value) && j10 != Long.MAX_VALUE) {
                    e(1L);
                }
                if (this.f39973p.addAndGet(-1) == 0) {
                    return;
                }
            }
        } else {
            pVar.offer(value);
            if (!c()) {
                return;
            }
        }
        n.e(pVar, subscriber, delayError, dispose, this);
    }

    public final void k(U value, boolean delayError, io.reactivex.rxjava3.disposables.d dispose) {
        Subscriber<? super V> subscriber = this.f39922V;
        p<U> pVar = this.f39923W;
        if (h()) {
            long j10 = this.f39957F.get();
            if (j10 == 0) {
                this.f39924X = true;
                dispose.dispose();
                subscriber.onError(new MissingBackpressureException("Could not emit buffer due to lack of requests"));
                return;
            } else if (pVar.isEmpty()) {
                if (f(subscriber, value) && j10 != Long.MAX_VALUE) {
                    e(1L);
                }
                if (this.f39973p.addAndGet(-1) == 0) {
                    return;
                }
            } else {
                pVar.offer(value);
            }
        } else {
            pVar.offer(value);
            if (!c()) {
                return;
            }
        }
        n.e(pVar, subscriber, delayError, dispose, this);
    }

    public final void m(long n10) {
        if (SubscriptionHelper.validate(n10)) {
            io.reactivex.rxjava3.internal.util.b.a(this.f39957F, n10);
        }
    }
}
