package Ec;

import zc.V;

/* JADX INFO: loaded from: classes7.dex */
public abstract class l<T, U, V> extends n implements V<T>, io.reactivex.rxjava3.internal.util.j<U, V> {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final V<? super V> f33833F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final Dc.p<U> f33834G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public volatile boolean f33835H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public volatile boolean f33836I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public Throwable f33837J;

    public l(V<? super V> actual, Dc.p<U> queue) {
        this.f33833F = actual;
        this.f33834G = queue;
    }

    @Override // io.reactivex.rxjava3.internal.util.j
    public final Throwable a() {
        return this.f33837J;
    }

    @Override // io.reactivex.rxjava3.internal.util.j
    public final int b(int m10) {
        return this.f33868p.addAndGet(m10);
    }

    @Override // io.reactivex.rxjava3.internal.util.j
    public final boolean c() {
        return this.f33868p.getAndIncrement() == 0;
    }

    @Override // io.reactivex.rxjava3.internal.util.j
    public final boolean cancelled() {
        return this.f33835H;
    }

    @Override // io.reactivex.rxjava3.internal.util.j
    public final boolean d() {
        return this.f33836I;
    }

    public final void f(U value, boolean delayError, io.reactivex.rxjava3.disposables.d dispose) {
        V<? super V> v10 = this.f33833F;
        Dc.p<U> pVar = this.f33834G;
        if (this.f33868p.get() == 0 && this.f33868p.compareAndSet(0, 1)) {
            e(v10, value);
            if (this.f33868p.addAndGet(-1) == 0) {
                return;
            }
        } else {
            pVar.offer(value);
            if (!c()) {
                return;
            }
        }
        io.reactivex.rxjava3.internal.util.n.d(pVar, v10, delayError, dispose, this);
    }

    public final void g(U value, boolean delayError, io.reactivex.rxjava3.disposables.d disposable) {
        V<? super V> v10 = this.f33833F;
        Dc.p<U> pVar = this.f33834G;
        if (this.f33868p.get() != 0 || !this.f33868p.compareAndSet(0, 1)) {
            pVar.offer(value);
            if (!c()) {
                return;
            }
        } else if (pVar.isEmpty()) {
            e(v10, value);
            if (this.f33868p.addAndGet(-1) == 0) {
                return;
            }
        } else {
            pVar.offer(value);
        }
        io.reactivex.rxjava3.internal.util.n.d(pVar, v10, delayError, disposable, this);
    }

    @Override // io.reactivex.rxjava3.internal.util.j
    public void e(V<? super V> a10, U v10) {
    }
}
