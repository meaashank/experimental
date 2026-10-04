package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes7.dex */
public final class A<T, R> extends AbstractC4640a<T, R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nc.o<? super T, ? extends R> f204737b;

    public static final class a<T, R> implements hc.t<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hc.t<? super R> f204738a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final nc.o<? super T, ? extends R> f204739b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public io.reactivex.disposables.b f204740c;

        public a(hc.t<? super R> tVar, nc.o<? super T, ? extends R> oVar) {
            this.f204738a = tVar;
            this.f204739b = oVar;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            io.reactivex.disposables.b bVar = this.f204740c;
            this.f204740c = DisposableHelper.DISPOSED;
            bVar.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f204740c.isDisposed();
        }

        @Override // hc.t
        public void onComplete() {
            this.f204738a.onComplete();
        }

        @Override // hc.t
        public void onError(Throwable th) {
            this.f204738a.onError(th);
        }

        @Override // hc.t
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f204740c, bVar)) {
                this.f204740c = bVar;
                this.f204738a.onSubscribe(this);
            }
        }

        @Override // hc.t
        public void onSuccess(T t10) {
            try {
                R rApply = this.f204739b.apply(t10);
                io.reactivex.internal.functions.a.g(rApply, "The mapper returned a null item");
                this.f204738a.onSuccess(rApply);
            } catch (Throwable th) {
                io.reactivex.exceptions.a.b(th);
                this.f204738a.onError(th);
            }
        }
    }

    public A(hc.w<T> wVar, nc.o<? super T, ? extends R> oVar) {
        super(wVar);
        this.f204737b = oVar;
    }

    @Override // hc.q
    public void o1(hc.t<? super R> tVar) {
        this.f204988a.b(new a(tVar, this.f204737b));
    }
}
