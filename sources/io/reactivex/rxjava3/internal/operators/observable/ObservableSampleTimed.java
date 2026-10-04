package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class ObservableSampleTimed<T> extends AbstractC4740a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f210567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeUnit f210568c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zc.W f210569d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f210570e;

    public static final class SampleTimedEmitLast<T> extends SampleTimedObserver<T> {
        private static final long serialVersionUID = -7139995637533111443L;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final AtomicInteger f210571g;

        public SampleTimedEmitLast(zc.V<? super T> actual, long period, TimeUnit unit, zc.W scheduler) {
            super(actual, period, unit, scheduler);
            this.f210571g = new AtomicInteger(1);
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableSampleTimed.SampleTimedObserver
        public void g() {
            h();
            if (this.f210571g.decrementAndGet() == 0) {
                this.f210572a.onComplete();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f210571g.incrementAndGet() == 2) {
                h();
                if (this.f210571g.decrementAndGet() == 0) {
                    this.f210572a.onComplete();
                }
            }
        }
    }

    public static final class SampleTimedNoLast<T> extends SampleTimedObserver<T> {
        private static final long serialVersionUID = -7139995637533111443L;

        public SampleTimedNoLast(zc.V<? super T> actual, long period, TimeUnit unit, zc.W scheduler) {
            super(actual, period, unit, scheduler);
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableSampleTimed.SampleTimedObserver
        public void g() {
            this.f210572a.onComplete();
        }

        @Override // java.lang.Runnable
        public void run() {
            h();
        }
    }

    public static abstract class SampleTimedObserver<T> extends AtomicReference<T> implements zc.V<T>, io.reactivex.rxjava3.disposables.d, Runnable {
        private static final long serialVersionUID = -3517602651313910099L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zc.V<? super T> f210572a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f210573b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TimeUnit f210574c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final zc.W f210575d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final AtomicReference<io.reactivex.rxjava3.disposables.d> f210576e = new AtomicReference<>();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f210577f;

        public SampleTimedObserver(zc.V<? super T> actual, long period, TimeUnit unit, zc.W scheduler) {
            this.f210572a = actual;
            this.f210573b = period;
            this.f210574c = unit;
            this.f210575d = scheduler;
        }

        public void d() {
            DisposableHelper.dispose(this.f210576e);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            d();
            this.f210577f.dispose();
        }

        public abstract void g();

        public void h() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                this.f210572a.onNext(andSet);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return this.f210577f.isDisposed();
        }

        @Override // zc.V
        public void onComplete() {
            d();
            g();
        }

        @Override // zc.V
        public void onError(Throwable t10) {
            d();
            this.f210572a.onError(t10);
        }

        @Override // zc.V
        public void onNext(T t10) {
            lazySet(t10);
        }

        @Override // zc.V
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            if (DisposableHelper.validate(this.f210577f, d10)) {
                this.f210577f = d10;
                this.f210572a.onSubscribe(this);
                zc.W w10 = this.f210575d;
                long j10 = this.f210573b;
                DisposableHelper.replace(this.f210576e, w10.g(this, j10, j10, this.f210574c));
            }
        }
    }

    public ObservableSampleTimed(zc.T<T> source, long period, TimeUnit unit, zc.W scheduler, boolean emitLast) {
        super(source);
        this.f210567b = period;
        this.f210568c = unit;
        this.f210569d = scheduler;
        this.f210570e = emitLast;
    }

    @Override // zc.N
    public void d6(zc.V<? super T> t10) {
        io.reactivex.rxjava3.observers.m mVar = new io.reactivex.rxjava3.observers.m(t10, false);
        if (this.f210570e) {
            this.f210954a.a(new SampleTimedEmitLast(mVar, this.f210567b, this.f210568c, this.f210569d));
        } else {
            this.f210954a.a(new SampleTimedNoLast(mVar, this.f210567b, this.f210568c, this.f210569d));
        }
    }
}
