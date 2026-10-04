package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import zc.W;

/* JADX INFO: loaded from: classes7.dex */
public final class MaybeUnsubscribeOn<T> extends AbstractC4725a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final W f209586b;

    public static final class UnsubscribeOnMaybeObserver<T> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements zc.F<T>, io.reactivex.rxjava3.disposables.d, Runnable {
        private static final long serialVersionUID = 3256698449646456986L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zc.F<? super T> f209587a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final W f209588b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f209589c;

        public UnsubscribeOnMaybeObserver(zc.F<? super T> actual, W scheduler) {
            this.f209587a = actual;
            this.f209588b = scheduler;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            io.reactivex.rxjava3.disposables.d andSet = getAndSet(disposableHelper);
            if (andSet != disposableHelper) {
                this.f209589c = andSet;
                this.f209588b.e(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // zc.F, zc.InterfaceC5888e
        public void onComplete() {
            this.f209587a.onComplete();
        }

        @Override // zc.F, zc.a0, zc.InterfaceC5888e
        public void onError(Throwable e10) {
            this.f209587a.onError(e10);
        }

        @Override // zc.F, zc.a0, zc.InterfaceC5888e
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            if (DisposableHelper.setOnce(this, d10)) {
                this.f209587a.onSubscribe(this);
            }
        }

        @Override // zc.F, zc.a0
        public void onSuccess(T value) {
            this.f209587a.onSuccess(value);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f209589c.dispose();
        }
    }

    public MaybeUnsubscribeOn(zc.I<T> source, W scheduler) {
        super(source);
        this.f209586b = scheduler;
    }

    @Override // zc.AbstractC5881C
    public void U1(zc.F<? super T> observer) {
        this.f209610a.b(new UnsubscribeOnMaybeObserver(observer, this.f209586b));
    }
}
