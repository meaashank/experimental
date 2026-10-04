package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class ObservableSubscribeOn<T> extends AbstractC4740a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zc.W f210650b;

    public static final class SubscribeOnObserver<T> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements zc.V<T>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = 8094547886072529208L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zc.V<? super T> f210651a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicReference<io.reactivex.rxjava3.disposables.d> f210652b = new AtomicReference<>();

        public SubscribeOnObserver(zc.V<? super T> downstream) {
            this.f210651a = downstream;
        }

        public void a(io.reactivex.rxjava3.disposables.d d10) {
            DisposableHelper.setOnce(this, d10);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            DisposableHelper.dispose(this.f210652b);
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // zc.V
        public void onComplete() {
            this.f210651a.onComplete();
        }

        @Override // zc.V
        public void onError(Throwable t10) {
            this.f210651a.onError(t10);
        }

        @Override // zc.V
        public void onNext(T t10) {
            this.f210651a.onNext(t10);
        }

        @Override // zc.V
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            DisposableHelper.setOnce(this.f210652b, d10);
        }
    }

    public final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SubscribeOnObserver<T> f210653a;

        public a(SubscribeOnObserver<T> parent) {
            this.f210653a = parent;
        }

        @Override // java.lang.Runnable
        public void run() {
            ObservableSubscribeOn.this.f210954a.a(this.f210653a);
        }
    }

    public ObservableSubscribeOn(zc.T<T> source, zc.W scheduler) {
        super(source);
        this.f210650b = scheduler;
    }

    @Override // zc.N
    public void d6(final zc.V<? super T> observer) {
        SubscribeOnObserver subscribeOnObserver = new SubscribeOnObserver(observer);
        observer.onSubscribe(subscribeOnObserver);
        DisposableHelper.setOnce(subscribeOnObserver, this.f210650b.e(new a(subscribeOnObserver)));
    }
}
