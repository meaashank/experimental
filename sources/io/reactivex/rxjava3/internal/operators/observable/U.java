package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes7.dex */
public final class U<T> extends AbstractC4740a<T, T> {

    public static final class a<T> implements zc.V<T>, io.reactivex.rxjava3.disposables.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zc.V<? super T> f210936a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f210937b;

        public a(zc.V<? super T> downstream) {
            this.f210936a = downstream;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            this.f210937b.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return this.f210937b.isDisposed();
        }

        @Override // zc.V
        public void onComplete() {
            this.f210936a.onComplete();
        }

        @Override // zc.V
        public void onError(Throwable t10) {
            this.f210936a.onError(t10);
        }

        @Override // zc.V
        public void onNext(T t10) {
            this.f210936a.onNext(t10);
        }

        @Override // zc.V
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            if (DisposableHelper.validate(this.f210937b, d10)) {
                this.f210937b = d10;
                this.f210936a.onSubscribe(this);
            }
        }
    }

    public U(zc.T<T> source) {
        super(source);
    }

    @Override // zc.N
    public void d6(zc.V<? super T> o10) {
        this.f210954a.a(new a(o10));
    }
}
