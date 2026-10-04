package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
public final class ObservableUnsubscribeOn<T> extends AbstractC4740a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zc.W f210767b;

    public static final class UnsubscribeObserver<T> extends AtomicBoolean implements zc.V<T>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = 1015244841293359600L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zc.V<? super T> f210768a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final zc.W f210769b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f210770c;

        public final class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                UnsubscribeObserver.this.f210770c.dispose();
            }
        }

        public UnsubscribeObserver(zc.V<? super T> actual, zc.W scheduler) {
            this.f210768a = actual;
            this.f210769b = scheduler;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            if (compareAndSet(false, true)) {
                this.f210769b.e(new a());
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return get();
        }

        @Override // zc.V
        public void onComplete() {
            if (get()) {
                return;
            }
            this.f210768a.onComplete();
        }

        @Override // zc.V
        public void onError(Throwable t10) {
            if (get()) {
                Ic.a.Y(t10);
            } else {
                this.f210768a.onError(t10);
            }
        }

        @Override // zc.V
        public void onNext(T t10) {
            if (get()) {
                return;
            }
            this.f210768a.onNext(t10);
        }

        @Override // zc.V
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            if (DisposableHelper.validate(this.f210770c, d10)) {
                this.f210770c = d10;
                this.f210768a.onSubscribe(this);
            }
        }
    }

    public ObservableUnsubscribeOn(zc.T<T> source, zc.W scheduler) {
        super(source);
        this.f210767b = scheduler;
    }

    @Override // zc.N
    public void d6(zc.V<? super T> t10) {
        this.f210954a.a(new UnsubscribeObserver(t10, this.f210767b));
    }
}
