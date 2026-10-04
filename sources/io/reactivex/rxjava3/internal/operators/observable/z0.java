package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.Collection;

/* JADX INFO: loaded from: classes7.dex */
public final class z0<T, U extends Collection<? super T>> extends AbstractC4740a<T, U> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bc.s<U> f211251b;

    public static final class a<T, U extends Collection<? super T>> implements zc.V<T>, io.reactivex.rxjava3.disposables.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zc.V<? super U> f211252a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f211253b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public U f211254c;

        public a(zc.V<? super U> actual, U collection) {
            this.f211252a = actual;
            this.f211254c = collection;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            this.f211253b.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return this.f211253b.isDisposed();
        }

        @Override // zc.V
        public void onComplete() {
            U u10 = this.f211254c;
            this.f211254c = null;
            this.f211252a.onNext(u10);
            this.f211252a.onComplete();
        }

        @Override // zc.V
        public void onError(Throwable t10) {
            this.f211254c = null;
            this.f211252a.onError(t10);
        }

        @Override // zc.V
        public void onNext(T t10) {
            this.f211254c.add(t10);
        }

        @Override // zc.V
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            if (DisposableHelper.validate(this.f211253b, d10)) {
                this.f211253b = d10;
                this.f211252a.onSubscribe(this);
            }
        }
    }

    public z0(zc.T<T> source, Bc.s<U> collectionSupplier) {
        super(source);
        this.f211251b = collectionSupplier;
    }

    @Override // zc.N
    public void d6(zc.V<? super U> t10) {
        try {
            U u10 = this.f211251b.get();
            ExceptionHelper.d(u10, "The collectionSupplier returned a null Collection.");
            this.f210954a.a(new a(t10, u10));
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            EmptyDisposable.error(th, t10);
        }
    }
}
