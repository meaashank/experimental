package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes7.dex */
public final class k<T> extends AbstractC4640a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nc.r<? super T> f205011b;

    public static final class a<T> implements hc.t<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hc.t<? super T> f205012a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final nc.r<? super T> f205013b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public io.reactivex.disposables.b f205014c;

        public a(hc.t<? super T> tVar, nc.r<? super T> rVar) {
            this.f205012a = tVar;
            this.f205013b = rVar;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            io.reactivex.disposables.b bVar = this.f205014c;
            this.f205014c = DisposableHelper.DISPOSED;
            bVar.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f205014c.isDisposed();
        }

        @Override // hc.t
        public void onComplete() {
            this.f205012a.onComplete();
        }

        @Override // hc.t
        public void onError(Throwable th) {
            this.f205012a.onError(th);
        }

        @Override // hc.t
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f205014c, bVar)) {
                this.f205014c = bVar;
                this.f205012a.onSubscribe(this);
            }
        }

        @Override // hc.t
        public void onSuccess(T t10) {
            try {
                if (this.f205013b.test(t10)) {
                    this.f205012a.onSuccess(t10);
                } else {
                    this.f205012a.onComplete();
                }
            } catch (Throwable th) {
                io.reactivex.exceptions.a.b(th);
                this.f205012a.onError(th);
            }
        }
    }

    public k(hc.w<T> wVar, nc.r<? super T> rVar) {
        super(wVar);
        this.f205011b = rVar;
    }

    @Override // hc.q
    public void o1(hc.t<? super T> tVar) {
        this.f204988a.b(new a(tVar, this.f205011b));
    }
}
