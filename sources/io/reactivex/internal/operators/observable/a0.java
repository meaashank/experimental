package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes7.dex */
public final class a0<T> extends AbstractC4648a<T, hc.y<T>> {

    public static final class a<T> implements hc.G<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hc.G<? super hc.y<T>> f206215a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public io.reactivex.disposables.b f206216b;

        public a(hc.G<? super hc.y<T>> g10) {
            this.f206215a = g10;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f206216b.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f206216b.isDisposed();
        }

        @Override // hc.G
        public void onComplete() {
            this.f206215a.onNext(hc.y.f202669b);
            this.f206215a.onComplete();
        }

        @Override // hc.G
        public void onError(Throwable th) {
            this.f206215a.onNext(hc.y.b(th));
            this.f206215a.onComplete();
        }

        @Override // hc.G
        public void onNext(T t10) {
            this.f206215a.onNext(hc.y.c(t10));
        }

        @Override // hc.G
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f206216b, bVar)) {
                this.f206216b = bVar;
                this.f206215a.onSubscribe(this);
            }
        }
    }

    public a0(hc.E<T> e10) {
        super(e10);
    }

    @Override // hc.z
    public void C5(hc.G<? super hc.y<T>> g10) {
        this.f206214a.a(new a(g10));
    }
}
