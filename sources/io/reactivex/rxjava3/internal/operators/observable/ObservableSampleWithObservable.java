package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class ObservableSampleWithObservable<T> extends AbstractC4740a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zc.T<?> f210578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f210579c;

    public static final class SampleMainEmitLast<T> extends SampleMainObserver<T> {
        private static final long serialVersionUID = -3029755663834015785L;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final AtomicInteger f210580e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public volatile boolean f210581f;

        public SampleMainEmitLast(zc.V<? super T> actual, zc.T<?> other) {
            super(actual, other);
            this.f210580e = new AtomicInteger();
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver
        public void g() {
            this.f210581f = true;
            if (this.f210580e.getAndIncrement() == 0) {
                h();
                this.f210582a.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver
        public void j() {
            if (this.f210580e.getAndIncrement() == 0) {
                do {
                    boolean z10 = this.f210581f;
                    h();
                    if (z10) {
                        this.f210582a.onComplete();
                        return;
                    }
                } while (this.f210580e.decrementAndGet() != 0);
            }
        }
    }

    public static final class SampleMainNoLast<T> extends SampleMainObserver<T> {
        private static final long serialVersionUID = -3029755663834015785L;

        public SampleMainNoLast(zc.V<? super T> actual, zc.T<?> other) {
            super(actual, other);
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver
        public void g() {
            this.f210582a.onComplete();
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableSampleWithObservable.SampleMainObserver
        public void j() {
            h();
        }
    }

    public static abstract class SampleMainObserver<T> extends AtomicReference<T> implements zc.V<T>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = -3517602651313910099L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zc.V<? super T> f210582a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final zc.T<?> f210583b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AtomicReference<io.reactivex.rxjava3.disposables.d> f210584c = new AtomicReference<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f210585d;

        public SampleMainObserver(zc.V<? super T> actual, zc.T<?> other) {
            this.f210582a = actual;
            this.f210583b = other;
        }

        public void d() {
            this.f210585d.dispose();
            g();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            DisposableHelper.dispose(this.f210584c);
            this.f210585d.dispose();
        }

        public abstract void g();

        public void h() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                this.f210582a.onNext(andSet);
            }
        }

        public void i(Throwable e10) {
            this.f210585d.dispose();
            this.f210582a.onError(e10);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return this.f210584c.get() == DisposableHelper.DISPOSED;
        }

        public abstract void j();

        public boolean k(io.reactivex.rxjava3.disposables.d o10) {
            return DisposableHelper.setOnce(this.f210584c, o10);
        }

        @Override // zc.V
        public void onComplete() {
            DisposableHelper.dispose(this.f210584c);
            g();
        }

        @Override // zc.V
        public void onError(Throwable t10) {
            DisposableHelper.dispose(this.f210584c);
            this.f210582a.onError(t10);
        }

        @Override // zc.V
        public void onNext(T t10) {
            lazySet(t10);
        }

        @Override // zc.V
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            if (DisposableHelper.validate(this.f210585d, d10)) {
                this.f210585d = d10;
                this.f210582a.onSubscribe(this);
                if (this.f210584c.get() == null) {
                    this.f210583b.a(new a(this));
                }
            }
        }
    }

    public static final class a<T> implements zc.V<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SampleMainObserver<T> f210586a;

        public a(SampleMainObserver<T> parent) {
            this.f210586a = parent;
        }

        @Override // zc.V
        public void onComplete() {
            this.f210586a.d();
        }

        @Override // zc.V
        public void onError(Throwable t10) {
            this.f210586a.i(t10);
        }

        @Override // zc.V
        public void onNext(Object t10) {
            this.f210586a.j();
        }

        @Override // zc.V
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            this.f210586a.k(d10);
        }
    }

    public ObservableSampleWithObservable(zc.T<T> source, zc.T<?> other, boolean emitLast) {
        super(source);
        this.f210578b = other;
        this.f210579c = emitLast;
    }

    @Override // zc.N
    public void d6(zc.V<? super T> t10) {
        io.reactivex.rxjava3.observers.m mVar = new io.reactivex.rxjava3.observers.m(t10, false);
        if (this.f210579c) {
            this.f210954a.a(new SampleMainEmitLast(mVar, this.f210578b));
        } else {
            this.f210954a.a(new SampleMainNoLast(mVar, this.f210578b));
        }
    }
}
