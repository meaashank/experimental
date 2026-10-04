package rc;

import hc.InterfaceC4535o;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import org.reactivestreams.Subscriber;
import pc.n;

/* JADX INFO: loaded from: classes7.dex */
public abstract class h<T, U, V> extends l implements InterfaceC4535o<T>, io.reactivex.internal.util.m<U, V> {

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final Subscriber<? super V> f237560V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final n<U> f237561W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public volatile boolean f237562X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public volatile boolean f237563Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public Throwable f237564Z;

    public h(Subscriber<? super V> subscriber, n<U> nVar) {
        this.f237560V = subscriber;
        this.f237561W = nVar;
    }

    @Override // io.reactivex.internal.util.m
    public final Throwable a() {
        return this.f237564Z;
    }

    @Override // io.reactivex.internal.util.m
    public final int b(int i10) {
        return this.f237611p.addAndGet(i10);
    }

    @Override // io.reactivex.internal.util.m
    public final boolean c() {
        return this.f237611p.getAndIncrement() == 0;
    }

    @Override // io.reactivex.internal.util.m
    public final boolean cancelled() {
        return this.f237562X;
    }

    @Override // io.reactivex.internal.util.m
    public final boolean d() {
        return this.f237563Y;
    }

    @Override // io.reactivex.internal.util.m
    public final long e(long j10) {
        return this.f237595F.addAndGet(-j10);
    }

    public boolean f(Subscriber<? super V> subscriber, U u10) {
        return false;
    }

    @Override // io.reactivex.internal.util.m
    public final long g() {
        return this.f237595F.get();
    }

    public final boolean h() {
        return this.f237611p.get() == 0 && this.f237611p.compareAndSet(0, 1);
    }

    public final void i(U u10, boolean z10, io.reactivex.disposables.b bVar) {
        Subscriber<? super V> subscriber = this.f237560V;
        n<U> nVar = this.f237561W;
        if (h()) {
            long j10 = this.f237595F.get();
            if (j10 == 0) {
                bVar.dispose();
                subscriber.onError(new MissingBackpressureException("Could not emit buffer due to lack of requests"));
                return;
            } else {
                if (f(subscriber, u10) && j10 != Long.MAX_VALUE) {
                    e(1L);
                }
                if (this.f237611p.addAndGet(-1) == 0) {
                    return;
                }
            }
        } else {
            nVar.offer(u10);
            if (!c()) {
                return;
            }
        }
        io.reactivex.internal.util.n.e(nVar, subscriber, z10, bVar, this);
    }

    public final void k(U u10, boolean z10, io.reactivex.disposables.b bVar) {
        Subscriber<? super V> subscriber = this.f237560V;
        n<U> nVar = this.f237561W;
        if (h()) {
            long j10 = this.f237595F.get();
            if (j10 == 0) {
                this.f237562X = true;
                bVar.dispose();
                subscriber.onError(new MissingBackpressureException("Could not emit buffer due to lack of requests"));
                return;
            } else if (nVar.isEmpty()) {
                if (f(subscriber, u10) && j10 != Long.MAX_VALUE) {
                    e(1L);
                }
                if (this.f237611p.addAndGet(-1) == 0) {
                    return;
                }
            } else {
                nVar.offer(u10);
            }
        } else {
            nVar.offer(u10);
            if (!c()) {
                return;
            }
        }
        io.reactivex.internal.util.n.e(nVar, subscriber, z10, bVar, this);
    }

    public final void m(long j10) {
        if (SubscriptionHelper.validate(j10)) {
            io.reactivex.internal.util.b.a(this.f237595F, j10);
        }
    }
}
