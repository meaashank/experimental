package io.reactivex.rxjava3.internal.operators.observable;

/* JADX INFO: loaded from: classes7.dex */
public final class V<T> extends AbstractC4740a<T, T> {

    public static final class a<T> implements zc.V<T>, io.reactivex.rxjava3.disposables.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zc.V<? super T> f210938a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f210939b;

        public a(zc.V<? super T> t10) {
            this.f210938a = t10;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            this.f210939b.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return this.f210939b.isDisposed();
        }

        @Override // zc.V
        public void onComplete() {
            this.f210938a.onComplete();
        }

        @Override // zc.V
        public void onError(Throwable e10) {
            this.f210938a.onError(e10);
        }

        @Override // zc.V
        public void onNext(T v10) {
        }

        @Override // zc.V
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            this.f210939b = d10;
            this.f210938a.onSubscribe(this);
        }
    }

    public V(zc.T<T> source) {
        super(source);
    }

    @Override // zc.N
    public void d6(final zc.V<? super T> t10) {
        this.f210954a.a(new a(t10));
    }
}
