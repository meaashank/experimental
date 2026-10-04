package io.reactivex.internal.operators.maybe;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes7.dex */
public final class D<T> extends AbstractC4640a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nc.o<? super Throwable, ? extends T> f204746b;

    public static final class a<T> implements hc.t<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hc.t<? super T> f204747a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final nc.o<? super Throwable, ? extends T> f204748b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public io.reactivex.disposables.b f204749c;

        public a(hc.t<? super T> tVar, nc.o<? super Throwable, ? extends T> oVar) {
            this.f204747a = tVar;
            this.f204748b = oVar;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f204749c.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f204749c.isDisposed();
        }

        @Override // hc.t
        public void onComplete() {
            this.f204747a.onComplete();
        }

        @Override // hc.t
        public void onError(Throwable th) {
            try {
                T tApply = this.f204748b.apply(th);
                io.reactivex.internal.functions.a.g(tApply, "The valueSupplier returned a null value");
                this.f204747a.onSuccess(tApply);
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f204747a.onError(new CompositeException(th, th2));
            }
        }

        @Override // hc.t
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f204749c, bVar)) {
                this.f204749c = bVar;
                this.f204747a.onSubscribe(this);
            }
        }

        @Override // hc.t
        public void onSuccess(T t10) {
            this.f204747a.onSuccess(t10);
        }
    }

    public D(hc.w<T> wVar, nc.o<? super Throwable, ? extends T> oVar) {
        super(wVar);
        this.f204746b = oVar;
    }

    @Override // hc.q
    public void o1(hc.t<? super T> tVar) {
        this.f204988a.b(new a(tVar, this.f204746b));
    }
}
