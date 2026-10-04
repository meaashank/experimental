package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes7.dex */
public final class Q<T> extends AbstractC4648a<T, T> {

    public static final class a<T> implements hc.G<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hc.G<? super T> f206185a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public io.reactivex.disposables.b f206186b;

        public a(hc.G<? super T> g10) {
            this.f206185a = g10;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f206186b.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f206186b.isDisposed();
        }

        @Override // hc.G
        public void onComplete() {
            this.f206185a.onComplete();
        }

        @Override // hc.G
        public void onError(Throwable th) {
            this.f206185a.onError(th);
        }

        @Override // hc.G
        public void onNext(T t10) {
            this.f206185a.onNext(t10);
        }

        @Override // hc.G
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f206186b, bVar)) {
                this.f206186b = bVar;
                this.f206185a.onSubscribe(this);
            }
        }
    }

    public Q(hc.E<T> e10) {
        super(e10);
    }

    @Override // hc.z
    public void C5(hc.G<? super T> g10) {
        this.f206214a.a(new a(g10));
    }
}
