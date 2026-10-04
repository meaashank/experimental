package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes7.dex */
public final class h0<T> extends AbstractC4740a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bc.o<? super Throwable, ? extends T> f211020b;

    public static final class a<T> implements zc.V<T>, io.reactivex.rxjava3.disposables.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zc.V<? super T> f211021a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Bc.o<? super Throwable, ? extends T> f211022b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f211023c;

        public a(zc.V<? super T> actual, Bc.o<? super Throwable, ? extends T> valueSupplier) {
            this.f211021a = actual;
            this.f211022b = valueSupplier;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            this.f211023c.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return this.f211023c.isDisposed();
        }

        @Override // zc.V
        public void onComplete() {
            this.f211021a.onComplete();
        }

        @Override // zc.V
        public void onError(Throwable t10) {
            try {
                T tApply = this.f211022b.apply(t10);
                if (tApply != null) {
                    this.f211021a.onNext(tApply);
                    this.f211021a.onComplete();
                } else {
                    NullPointerException nullPointerException = new NullPointerException("The supplied value is null");
                    nullPointerException.initCause(t10);
                    this.f211021a.onError(nullPointerException);
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                this.f211021a.onError(new CompositeException(t10, th));
            }
        }

        @Override // zc.V
        public void onNext(T t10) {
            this.f211021a.onNext(t10);
        }

        @Override // zc.V
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            if (DisposableHelper.validate(this.f211023c, d10)) {
                this.f211023c = d10;
                this.f211021a.onSubscribe(this);
            }
        }
    }

    public h0(zc.T<T> source, Bc.o<? super Throwable, ? extends T> valueSupplier) {
        super(source);
        this.f211020b = valueSupplier;
    }

    @Override // zc.N
    public void d6(zc.V<? super T> t10) {
        this.f210954a.a(new a(t10, this.f211020b));
    }
}
