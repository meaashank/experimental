package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class ObservableSampleWithObservable<T> extends AbstractC4648a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hc.E<?> f205879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f205880c;

    public static final class SampleMainEmitLast<T> extends SampleMainObserver<T> {
        private static final long serialVersionUID = -3029755663834015785L;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final AtomicInteger f205881e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public volatile boolean f205882f;

        public SampleMainEmitLast(hc.G<? super T> g10, hc.E<?> e10) {
            super(g10, e10);
            this.f205881e = new AtomicInteger();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver
        public void g() {
            this.f205882f = true;
            if (this.f205881e.getAndIncrement() == 0) {
                i();
                this.f205883a.onComplete();
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver
        public void h() {
            this.f205882f = true;
            if (this.f205881e.getAndIncrement() == 0) {
                i();
                this.f205883a.onComplete();
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver
        public void k() {
            if (this.f205881e.getAndIncrement() == 0) {
                do {
                    boolean z10 = this.f205882f;
                    i();
                    if (z10) {
                        this.f205883a.onComplete();
                        return;
                    }
                } while (this.f205881e.decrementAndGet() != 0);
            }
        }
    }

    public static final class SampleMainNoLast<T> extends SampleMainObserver<T> {
        private static final long serialVersionUID = -3029755663834015785L;

        public SampleMainNoLast(hc.G<? super T> g10, hc.E<?> e10) {
            super(g10, e10);
        }

        @Override // io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver
        public void g() {
            this.f205883a.onComplete();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver
        public void h() {
            this.f205883a.onComplete();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver
        public void k() {
            i();
        }
    }

    public static abstract class SampleMainObserver<T> extends AtomicReference<T> implements hc.G<T>, io.reactivex.disposables.b {
        private static final long serialVersionUID = -3517602651313910099L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hc.G<? super T> f205883a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final hc.E<?> f205884b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AtomicReference<io.reactivex.disposables.b> f205885c = new AtomicReference<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public io.reactivex.disposables.b f205886d;

        public SampleMainObserver(hc.G<? super T> g10, hc.E<?> e10) {
            this.f205883a = g10;
            this.f205884b = e10;
        }

        public void d() {
            this.f205886d.dispose();
            h();
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.dispose(this.f205885c);
            this.f205886d.dispose();
        }

        public abstract void g();

        public abstract void h();

        public void i() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                this.f205883a.onNext(andSet);
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f205885c.get() == DisposableHelper.DISPOSED;
        }

        public void j(Throwable th) {
            this.f205886d.dispose();
            this.f205883a.onError(th);
        }

        public abstract void k();

        public boolean l(io.reactivex.disposables.b bVar) {
            return DisposableHelper.setOnce(this.f205885c, bVar);
        }

        @Override // hc.G
        public void onComplete() {
            DisposableHelper.dispose(this.f205885c);
            g();
        }

        @Override // hc.G
        public void onError(Throwable th) {
            DisposableHelper.dispose(this.f205885c);
            this.f205883a.onError(th);
        }

        @Override // hc.G
        public void onNext(T t10) {
            lazySet(t10);
        }

        @Override // hc.G
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f205886d, bVar)) {
                this.f205886d = bVar;
                this.f205883a.onSubscribe(this);
                if (this.f205885c.get() == null) {
                    this.f205884b.a(new a(this));
                }
            }
        }
    }

    public static final class a<T> implements hc.G<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SampleMainObserver<T> f205887a;

        public a(SampleMainObserver<T> sampleMainObserver) {
            this.f205887a = sampleMainObserver;
        }

        @Override // hc.G
        public void onComplete() {
            this.f205887a.d();
        }

        @Override // hc.G
        public void onError(Throwable th) {
            this.f205887a.j(th);
        }

        @Override // hc.G
        public void onNext(Object obj) {
            this.f205887a.k();
        }

        @Override // hc.G
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            this.f205887a.l(bVar);
        }
    }

    public ObservableSampleWithObservable(hc.E<T> e10, hc.E<?> e11, boolean z10) {
        super(e10);
        this.f205879b = e11;
        this.f205880c = z10;
    }

    @Override // hc.z
    public void C5(hc.G<? super T> g10) {
        io.reactivex.observers.l lVar = new io.reactivex.observers.l(g10, false);
        if (this.f205880c) {
            this.f206214a.a(new SampleMainEmitLast(lVar, this.f205879b));
        } else {
            this.f206214a.a(new SampleMainNoLast(lVar, this.f205879b));
        }
    }
}
