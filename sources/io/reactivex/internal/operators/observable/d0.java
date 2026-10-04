package io.reactivex.internal.operators.observable;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes7.dex */
public final class d0<T> extends AbstractC4648a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nc.o<? super Throwable, ? extends T> f206245b;

    public static final class a<T> implements hc.G<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hc.G<? super T> f206246a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final nc.o<? super Throwable, ? extends T> f206247b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public io.reactivex.disposables.b f206248c;

        public a(hc.G<? super T> g10, nc.o<? super Throwable, ? extends T> oVar) {
            this.f206246a = g10;
            this.f206247b = oVar;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f206248c.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f206248c.isDisposed();
        }

        @Override // hc.G
        public void onComplete() {
            this.f206246a.onComplete();
        }

        @Override // hc.G
        public void onError(Throwable th) {
            try {
                T tApply = this.f206247b.apply(th);
                if (tApply != null) {
                    this.f206246a.onNext(tApply);
                    this.f206246a.onComplete();
                } else {
                    NullPointerException nullPointerException = new NullPointerException("The supplied value is null");
                    nullPointerException.initCause(th);
                    this.f206246a.onError(nullPointerException);
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f206246a.onError(new CompositeException(th, th2));
            }
        }

        @Override // hc.G
        public void onNext(T t10) {
            this.f206246a.onNext(t10);
        }

        @Override // hc.G
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f206248c, bVar)) {
                this.f206248c = bVar;
                this.f206246a.onSubscribe(this);
            }
        }
    }

    public d0(hc.E<T> e10, nc.o<? super Throwable, ? extends T> oVar) {
        super(e10);
        this.f206245b = oVar;
    }

    @Override // hc.z
    public void C5(hc.G<? super T> g10) {
        this.f206214a.a(new a(g10, this.f206245b));
    }
}
