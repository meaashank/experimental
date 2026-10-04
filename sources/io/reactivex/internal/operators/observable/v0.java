package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.Functions;
import java.util.Collection;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes7.dex */
public final class v0<T, U extends Collection<? super T>> extends AbstractC4648a<T, U> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Callable<U> f206480b;

    public static final class a<T, U extends Collection<? super T>> implements hc.G<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public U f206481a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final hc.G<? super U> f206482b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public io.reactivex.disposables.b f206483c;

        public a(hc.G<? super U> g10, U u10) {
            this.f206482b = g10;
            this.f206481a = u10;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f206483c.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f206483c.isDisposed();
        }

        @Override // hc.G
        public void onComplete() {
            U u10 = this.f206481a;
            this.f206481a = null;
            this.f206482b.onNext(u10);
            this.f206482b.onComplete();
        }

        @Override // hc.G
        public void onError(Throwable th) {
            this.f206481a = null;
            this.f206482b.onError(th);
        }

        @Override // hc.G
        public void onNext(T t10) {
            this.f206481a.add(t10);
        }

        @Override // hc.G
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f206483c, bVar)) {
                this.f206483c = bVar;
                this.f206482b.onSubscribe(this);
            }
        }
    }

    public v0(hc.E<T> e10, int i10) {
        super(e10);
        this.f206480b = new Functions.CallableC4612j(i10);
    }

    @Override // hc.z
    public void C5(hc.G<? super U> g10) {
        try {
            U uCall = this.f206480b.call();
            io.reactivex.internal.functions.a.g(uCall, "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
            this.f206214a.a(new a(g10, uCall));
        } catch (Throwable th) {
            io.reactivex.exceptions.a.b(th);
            EmptyDisposable.error(th, g10);
        }
    }

    public v0(hc.E<T> e10, Callable<U> callable) {
        super(e10);
        this.f206480b = callable;
    }
}
