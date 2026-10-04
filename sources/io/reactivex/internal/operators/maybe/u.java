package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes7.dex */
public final class u<T> extends AbstractC4640a<T, T> {

    public static final class a<T> implements hc.t<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hc.t<? super T> f205042a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public io.reactivex.disposables.b f205043b;

        public a(hc.t<? super T> tVar) {
            this.f205042a = tVar;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f205043b.dispose();
            this.f205043b = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f205043b.isDisposed();
        }

        @Override // hc.t
        public void onComplete() {
            this.f205043b = DisposableHelper.DISPOSED;
            this.f205042a.onComplete();
        }

        @Override // hc.t
        public void onError(Throwable th) {
            this.f205043b = DisposableHelper.DISPOSED;
            this.f205042a.onError(th);
        }

        @Override // hc.t
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f205043b, bVar)) {
                this.f205043b = bVar;
                this.f205042a.onSubscribe(this);
            }
        }

        @Override // hc.t
        public void onSuccess(T t10) {
            this.f205043b = DisposableHelper.DISPOSED;
            this.f205042a.onComplete();
        }
    }

    public u(hc.w<T> wVar) {
        super(wVar);
    }

    @Override // hc.q
    public void o1(hc.t<? super T> tVar) {
        this.f204988a.b(new a(tVar));
    }
}
