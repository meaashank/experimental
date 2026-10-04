package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.Objects;

/* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.observable.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4755m<T, U> extends AbstractC4740a<T, U> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bc.s<? extends U> f211095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bc.b<? super U, ? super T> f211096c;

    /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.observable.m$a */
    public static final class a<T, U> implements zc.V<T>, io.reactivex.rxjava3.disposables.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zc.V<? super U> f211097a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Bc.b<? super U, ? super T> f211098b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final U f211099c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f211100d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f211101e;

        public a(zc.V<? super U> actual, U u10, Bc.b<? super U, ? super T> collector) {
            this.f211097a = actual;
            this.f211098b = collector;
            this.f211099c = u10;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            this.f211100d.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return this.f211100d.isDisposed();
        }

        @Override // zc.V
        public void onComplete() {
            if (this.f211101e) {
                return;
            }
            this.f211101e = true;
            this.f211097a.onNext(this.f211099c);
            this.f211097a.onComplete();
        }

        @Override // zc.V
        public void onError(Throwable t10) {
            if (this.f211101e) {
                Ic.a.Y(t10);
            } else {
                this.f211101e = true;
                this.f211097a.onError(t10);
            }
        }

        @Override // zc.V
        public void onNext(T t10) {
            if (this.f211101e) {
                return;
            }
            try {
                this.f211098b.accept(this.f211099c, t10);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                this.f211100d.dispose();
                onError(th);
            }
        }

        @Override // zc.V
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            if (DisposableHelper.validate(this.f211100d, d10)) {
                this.f211100d = d10;
                this.f211097a.onSubscribe(this);
            }
        }
    }

    public C4755m(zc.T<T> source, Bc.s<? extends U> initialSupplier, Bc.b<? super U, ? super T> collector) {
        super(source);
        this.f211095b = initialSupplier;
        this.f211096c = collector;
    }

    @Override // zc.N
    public void d6(zc.V<? super U> t10) {
        try {
            U u10 = this.f211095b.get();
            Objects.requireNonNull(u10, "The initialSupplier returned a null value");
            this.f210954a.a(new a(t10, u10, this.f211096c));
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            EmptyDisposable.error(th, t10);
        }
    }
}
