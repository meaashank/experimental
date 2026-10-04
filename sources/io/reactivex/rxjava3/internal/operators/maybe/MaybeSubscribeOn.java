package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicReference;
import zc.W;

/* JADX INFO: loaded from: classes7.dex */
public final class MaybeSubscribeOn<T> extends AbstractC4725a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final W f209538b;

    public static final class SubscribeOnMaybeObserver<T> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements zc.F<T>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = 8571289934935992137L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SequentialDisposable f209539a = new SequentialDisposable();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final zc.F<? super T> f209540b;

        public SubscribeOnMaybeObserver(zc.F<? super T> downstream) {
            this.f209540b = downstream;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            DisposableHelper.dispose(this);
            SequentialDisposable sequentialDisposable = this.f209539a;
            sequentialDisposable.getClass();
            DisposableHelper.dispose(sequentialDisposable);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // zc.F, zc.InterfaceC5888e
        public void onComplete() {
            this.f209540b.onComplete();
        }

        @Override // zc.F, zc.a0, zc.InterfaceC5888e
        public void onError(Throwable e10) {
            this.f209540b.onError(e10);
        }

        @Override // zc.F, zc.a0, zc.InterfaceC5888e
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            DisposableHelper.setOnce(this, d10);
        }

        @Override // zc.F, zc.a0
        public void onSuccess(T value) {
            this.f209540b.onSuccess(value);
        }
    }

    public static final class a<T> implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zc.F<? super T> f209541a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final zc.I<T> f209542b;

        public a(zc.F<? super T> observer, zc.I<T> source) {
            this.f209541a = observer;
            this.f209542b = source;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f209542b.b(this.f209541a);
        }
    }

    public MaybeSubscribeOn(zc.I<T> source, W scheduler) {
        super(source);
        this.f209538b = scheduler;
    }

    @Override // zc.AbstractC5881C
    public void U1(zc.F<? super T> observer) {
        SubscribeOnMaybeObserver subscribeOnMaybeObserver = new SubscribeOnMaybeObserver(observer);
        observer.onSubscribe(subscribeOnMaybeObserver);
        SequentialDisposable sequentialDisposable = subscribeOnMaybeObserver.f209539a;
        io.reactivex.rxjava3.disposables.d dVarE = this.f209538b.e(new a(subscribeOnMaybeObserver, this.f209610a));
        sequentialDisposable.getClass();
        DisposableHelper.replace(sequentialDisposable, dVarE);
    }
}
