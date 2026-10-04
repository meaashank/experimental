package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import zc.W;

/* JADX INFO: loaded from: classes7.dex */
public final class ObservableThrottleFirstTimed<T> extends AbstractC4740a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f210701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeUnit f210702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zc.W f210703d;

    public static final class DebounceTimedObserver<T> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements zc.V<T>, io.reactivex.rxjava3.disposables.d, Runnable {
        private static final long serialVersionUID = 786994795061867455L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zc.V<? super T> f210704a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f210705b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TimeUnit f210706c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final W.c f210707d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f210708e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public volatile boolean f210709f;

        public DebounceTimedObserver(zc.V<? super T> actual, long timeout, TimeUnit unit, W.c worker) {
            this.f210704a = actual;
            this.f210705b = timeout;
            this.f210706c = unit;
            this.f210707d = worker;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            this.f210708e.dispose();
            this.f210707d.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return this.f210707d.isDisposed();
        }

        @Override // zc.V
        public void onComplete() {
            this.f210704a.onComplete();
            this.f210707d.dispose();
        }

        @Override // zc.V
        public void onError(Throwable t10) {
            this.f210704a.onError(t10);
            this.f210707d.dispose();
        }

        @Override // zc.V
        public void onNext(T t10) {
            if (this.f210709f) {
                return;
            }
            this.f210709f = true;
            this.f210704a.onNext(t10);
            io.reactivex.rxjava3.disposables.d dVar = get();
            if (dVar != null) {
                dVar.dispose();
            }
            DisposableHelper.replace(this, this.f210707d.c(this, this.f210705b, this.f210706c));
        }

        @Override // zc.V
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            if (DisposableHelper.validate(this.f210708e, d10)) {
                this.f210708e = d10;
                this.f210704a.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f210709f = false;
        }
    }

    public ObservableThrottleFirstTimed(zc.T<T> source, long timeout, TimeUnit unit, zc.W scheduler) {
        super(source);
        this.f210701b = timeout;
        this.f210702c = unit;
        this.f210703d = scheduler;
    }

    @Override // zc.N
    public void d6(zc.V<? super T> t10) {
        this.f210954a.a(new DebounceTimedObserver(new io.reactivex.rxjava3.observers.m(t10, false), this.f210701b, this.f210702c, this.f210703d.c()));
    }
}
