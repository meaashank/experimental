package io.reactivex.internal.operators.single;

import hc.G;
import hc.L;
import hc.O;
import hc.z;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.DeferredScalarDisposable;

/* JADX INFO: loaded from: classes7.dex */
public final class SingleToObservable<T> extends z<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final O<? extends T> f206860a;

    public static final class SingleToObservableObserver<T> extends DeferredScalarDisposable<T> implements L<T> {
        private static final long serialVersionUID = 3786543492451018833L;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public io.reactivex.disposables.b f206861h;

        public SingleToObservableObserver(G<? super T> g10) {
            super(g10);
        }

        @Override // io.reactivex.internal.observers.DeferredScalarDisposable, io.reactivex.disposables.b
        public void dispose() {
            super.dispose();
            this.f206861h.dispose();
        }

        @Override // hc.L
        public void onError(Throwable th) {
            f(th);
        }

        @Override // hc.L
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f206861h, bVar)) {
                this.f206861h = bVar;
                this.f203001a.onSubscribe(this);
            }
        }

        @Override // hc.L
        public void onSuccess(T t10) {
            e(t10);
        }
    }

    public SingleToObservable(O<? extends T> o10) {
        this.f206860a = o10;
    }

    public static <T> L<T> c8(G<? super T> g10) {
        return new SingleToObservableObserver(g10);
    }

    @Override // hc.z
    public void C5(G<? super T> g10) {
        this.f206860a.d(new SingleToObservableObserver(g10));
    }
}
