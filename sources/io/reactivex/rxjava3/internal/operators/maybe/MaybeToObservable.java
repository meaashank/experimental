package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.DeferredScalarDisposable;
import zc.V;

/* JADX INFO: loaded from: classes7.dex */
public final class MaybeToObservable<T> extends zc.N<T> implements Dc.h<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zc.I<T> f209584a;

    public static final class MaybeToObservableObserver<T> extends DeferredScalarDisposable<T> implements zc.F<T> {
        private static final long serialVersionUID = 7603343402964826922L;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f209585h;

        public MaybeToObservableObserver(V<? super T> downstream) {
            super(downstream);
        }

        @Override // io.reactivex.rxjava3.internal.observers.DeferredScalarDisposable, io.reactivex.rxjava3.disposables.d
        public void dispose() {
            super.dispose();
            this.f209585h.dispose();
        }

        @Override // zc.F, zc.InterfaceC5888e
        public void onComplete() {
            d();
        }

        @Override // zc.F, zc.a0, zc.InterfaceC5888e
        public void onError(Throwable e10) {
            f(e10);
        }

        @Override // zc.F, zc.a0, zc.InterfaceC5888e
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            if (DisposableHelper.validate(this.f209585h, d10)) {
                this.f209585h = d10;
                this.f207590a.onSubscribe(this);
            }
        }

        @Override // zc.F, zc.a0
        public void onSuccess(T value) {
            e(value);
        }
    }

    public MaybeToObservable(zc.I<T> source) {
        this.f209584a = source;
    }

    public static <T> zc.F<T> A8(V<? super T> downstream) {
        return new MaybeToObservableObserver(downstream);
    }

    @Override // zc.N
    public void d6(V<? super T> observer) {
        this.f209584a.b(new MaybeToObservableObserver(observer));
    }

    @Override // Dc.h
    public zc.I<T> source() {
        return this.f209584a;
    }
}
