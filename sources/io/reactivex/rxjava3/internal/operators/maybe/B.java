package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes7.dex */
public final class B<T> extends AbstractC4725a<T, Boolean> {

    public static final class a<T> implements zc.F<T>, io.reactivex.rxjava3.disposables.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zc.F<? super Boolean> f209352a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f209353b;

        public a(zc.F<? super Boolean> downstream) {
            this.f209352a = downstream;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            this.f209353b.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return this.f209353b.isDisposed();
        }

        @Override // zc.F, zc.InterfaceC5888e
        public void onComplete() {
            this.f209352a.onSuccess(Boolean.TRUE);
        }

        @Override // zc.F, zc.a0, zc.InterfaceC5888e
        public void onError(Throwable e10) {
            this.f209352a.onError(e10);
        }

        @Override // zc.F, zc.a0, zc.InterfaceC5888e
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            if (DisposableHelper.validate(this.f209353b, d10)) {
                this.f209353b = d10;
                this.f209352a.onSubscribe(this);
            }
        }

        @Override // zc.F, zc.a0
        public void onSuccess(T value) {
            this.f209352a.onSuccess(Boolean.FALSE);
        }
    }

    public B(zc.I<T> source) {
        super(source);
    }

    @Override // zc.AbstractC5881C
    public void U1(zc.F<? super Boolean> observer) {
        this.f209610a.b(new a(observer));
    }
}
