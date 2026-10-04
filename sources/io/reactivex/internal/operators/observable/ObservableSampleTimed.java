package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class ObservableSampleTimed<T> extends AbstractC4648a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f205868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeUnit f205869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hc.H f205870d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f205871e;

    public static final class SampleTimedEmitLast<T> extends SampleTimedObserver<T> {
        private static final long serialVersionUID = -7139995637533111443L;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final AtomicInteger f205872g;

        public SampleTimedEmitLast(hc.G<? super T> g10, long j10, TimeUnit timeUnit, hc.H h10) {
            super(g10, j10, timeUnit, h10);
            this.f205872g = new AtomicInteger(1);
        }

        @Override // io.reactivex.internal.operators.observable.ObservableSampleTimed.SampleTimedObserver
        public void g() {
            h();
            if (this.f205872g.decrementAndGet() == 0) {
                this.f205873a.onComplete();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f205872g.incrementAndGet() == 2) {
                h();
                if (this.f205872g.decrementAndGet() == 0) {
                    this.f205873a.onComplete();
                }
            }
        }
    }

    public static final class SampleTimedNoLast<T> extends SampleTimedObserver<T> {
        private static final long serialVersionUID = -7139995637533111443L;

        public SampleTimedNoLast(hc.G<? super T> g10, long j10, TimeUnit timeUnit, hc.H h10) {
            super(g10, j10, timeUnit, h10);
        }

        @Override // io.reactivex.internal.operators.observable.ObservableSampleTimed.SampleTimedObserver
        public void g() {
            this.f205873a.onComplete();
        }

        @Override // java.lang.Runnable
        public void run() {
            h();
        }
    }

    public static abstract class SampleTimedObserver<T> extends AtomicReference<T> implements hc.G<T>, io.reactivex.disposables.b, Runnable {
        private static final long serialVersionUID = -3517602651313910099L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hc.G<? super T> f205873a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f205874b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TimeUnit f205875c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final hc.H f205876d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final AtomicReference<io.reactivex.disposables.b> f205877e = new AtomicReference<>();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public io.reactivex.disposables.b f205878f;

        public SampleTimedObserver(hc.G<? super T> g10, long j10, TimeUnit timeUnit, hc.H h10) {
            this.f205873a = g10;
            this.f205874b = j10;
            this.f205875c = timeUnit;
            this.f205876d = h10;
        }

        public void d() {
            DisposableHelper.dispose(this.f205877e);
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            d();
            this.f205878f.dispose();
        }

        public abstract void g();

        public void h() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                this.f205873a.onNext(andSet);
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f205878f.isDisposed();
        }

        @Override // hc.G
        public void onComplete() {
            d();
            g();
        }

        @Override // hc.G
        public void onError(Throwable th) {
            d();
            this.f205873a.onError(th);
        }

        @Override // hc.G
        public void onNext(T t10) {
            lazySet(t10);
        }

        @Override // hc.G
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f205878f, bVar)) {
                this.f205878f = bVar;
                this.f205873a.onSubscribe(this);
                hc.H h10 = this.f205876d;
                long j10 = this.f205874b;
                DisposableHelper.replace(this.f205877e, h10.g(this, j10, j10, this.f205875c));
            }
        }
    }

    public ObservableSampleTimed(hc.E<T> e10, long j10, TimeUnit timeUnit, hc.H h10, boolean z10) {
        super(e10);
        this.f205868b = j10;
        this.f205869c = timeUnit;
        this.f205870d = h10;
        this.f205871e = z10;
    }

    @Override // hc.z
    public void C5(hc.G<? super T> g10) {
        io.reactivex.observers.l lVar = new io.reactivex.observers.l(g10, false);
        if (this.f205871e) {
            this.f206214a.a(new SampleTimedEmitLast(lVar, this.f205868b, this.f205869c, this.f205870d));
        } else {
            this.f206214a.a(new SampleTimedNoLast(lVar, this.f205868b, this.f205869c, this.f205870d));
        }
    }
}
