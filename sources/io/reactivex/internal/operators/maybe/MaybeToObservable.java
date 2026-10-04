package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.DeferredScalarDisposable;

/* JADX INFO: loaded from: classes7.dex */
public final class MaybeToObservable<T> extends hc.z<T> implements pc.f<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hc.w<T> f204965a;

    public static final class MaybeToObservableObserver<T> extends DeferredScalarDisposable<T> implements hc.t<T> {
        private static final long serialVersionUID = 7603343402964826922L;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public io.reactivex.disposables.b f204966h;

        public MaybeToObservableObserver(hc.G<? super T> g10) {
            super(g10);
        }

        @Override // io.reactivex.internal.observers.DeferredScalarDisposable, io.reactivex.disposables.b
        public void dispose() {
            super.dispose();
            this.f204966h.dispose();
        }

        @Override // hc.t
        public void onComplete() {
            d();
        }

        @Override // hc.t
        public void onError(Throwable th) {
            f(th);
        }

        @Override // hc.t
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f204966h, bVar)) {
                this.f204966h = bVar;
                this.f203001a.onSubscribe(this);
            }
        }

        @Override // hc.t
        public void onSuccess(T t10) {
            e(t10);
        }
    }

    public MaybeToObservable(hc.w<T> wVar) {
        this.f204965a = wVar;
    }

    public static <T> hc.t<T> c8(hc.G<? super T> g10) {
        return new MaybeToObservableObserver(g10);
    }

    @Override // hc.z
    public void C5(hc.G<? super T> g10) {
        this.f204965a.b(new MaybeToObservableObserver(g10));
    }

    @Override // pc.f
    public hc.w<T> source() {
        return this.f204965a;
    }
}
