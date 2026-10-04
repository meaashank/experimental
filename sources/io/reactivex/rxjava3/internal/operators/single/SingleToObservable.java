package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.DeferredScalarDisposable;
import zc.N;
import zc.V;
import zc.a0;
import zc.d0;

/* JADX INFO: loaded from: classes7.dex */
public final class SingleToObservable<T> extends N<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0<? extends T> f211580a;

    public static final class SingleToObservableObserver<T> extends DeferredScalarDisposable<T> implements a0<T> {
        private static final long serialVersionUID = 3786543492451018833L;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f211581h;

        public SingleToObservableObserver(V<? super T> downstream) {
            super(downstream);
        }

        @Override // io.reactivex.rxjava3.internal.observers.DeferredScalarDisposable, io.reactivex.rxjava3.disposables.d
        public void dispose() {
            super.dispose();
            this.f211581h.dispose();
        }

        @Override // zc.a0, zc.InterfaceC5888e
        public void onError(Throwable e10) {
            f(e10);
        }

        @Override // zc.a0, zc.InterfaceC5888e
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            if (DisposableHelper.validate(this.f211581h, d10)) {
                this.f211581h = d10;
                this.f207590a.onSubscribe(this);
            }
        }

        @Override // zc.a0
        public void onSuccess(T value) {
            e(value);
        }
    }

    public SingleToObservable(d0<? extends T> source) {
        this.f211580a = source;
    }

    public static <T> a0<T> A8(V<? super T> downstream) {
        return new SingleToObservableObserver(downstream);
    }

    @Override // zc.N
    public void d6(final V<? super T> observer) {
        this.f211580a.d(new SingleToObservableObserver(observer));
    }
}
