package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes7.dex */
public final class y<T> extends AbstractC4725a<T, T> {

    public static final class a<T> implements zc.F<T>, io.reactivex.rxjava3.disposables.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zc.F<? super T> f209683a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f209684b;

        public a(zc.F<? super T> downstream) {
            this.f209683a = downstream;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            this.f209684b.dispose();
            this.f209684b = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return this.f209684b.isDisposed();
        }

        @Override // zc.F, zc.InterfaceC5888e
        public void onComplete() {
            this.f209683a.onComplete();
        }

        @Override // zc.F, zc.a0, zc.InterfaceC5888e
        public void onError(Throwable e10) {
            this.f209683a.onError(e10);
        }

        @Override // zc.F, zc.a0, zc.InterfaceC5888e
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            if (DisposableHelper.validate(this.f209684b, d10)) {
                this.f209684b = d10;
                this.f209683a.onSubscribe(this);
            }
        }

        @Override // zc.F, zc.a0
        public void onSuccess(T value) {
            this.f209683a.onSuccess(value);
        }
    }

    public y(zc.I<T> source) {
        super(source);
    }

    @Override // zc.AbstractC5881C
    public void U1(zc.F<? super T> observer) {
        this.f209610a.b(new a(observer));
    }
}
