package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes7.dex */
public final class w<T> extends AbstractC4640a<T, Boolean> {

    public static final class a<T> implements hc.t<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hc.t<? super Boolean> f205047a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public io.reactivex.disposables.b f205048b;

        public a(hc.t<? super Boolean> tVar) {
            this.f205047a = tVar;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f205048b.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f205048b.isDisposed();
        }

        @Override // hc.t
        public void onComplete() {
            this.f205047a.onSuccess(Boolean.TRUE);
        }

        @Override // hc.t
        public void onError(Throwable th) {
            this.f205047a.onError(th);
        }

        @Override // hc.t
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f205048b, bVar)) {
                this.f205048b = bVar;
                this.f205047a.onSubscribe(this);
            }
        }

        @Override // hc.t
        public void onSuccess(T t10) {
            this.f205047a.onSuccess(Boolean.FALSE);
        }
    }

    public w(hc.w<T> wVar) {
        super(wVar);
    }

    @Override // hc.q
    public void o1(hc.t<? super Boolean> tVar) {
        this.f204988a.b(new a(tVar));
    }
}
