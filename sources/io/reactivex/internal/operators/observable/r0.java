package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes7.dex */
public final class r0<T> extends AbstractC4648a<T, T> {

    public static final class a<T> implements hc.G<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hc.G<? super T> f206434a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public io.reactivex.disposables.b f206435b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public T f206436c;

        public a(hc.G<? super T> g10) {
            this.f206434a = g10;
        }

        public void a() {
            T t10 = this.f206436c;
            if (t10 != null) {
                this.f206436c = null;
                this.f206434a.onNext(t10);
            }
            this.f206434a.onComplete();
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f206436c = null;
            this.f206435b.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f206435b.isDisposed();
        }

        @Override // hc.G
        public void onComplete() {
            a();
        }

        @Override // hc.G
        public void onError(Throwable th) {
            this.f206436c = null;
            this.f206434a.onError(th);
        }

        @Override // hc.G
        public void onNext(T t10) {
            this.f206436c = t10;
        }

        @Override // hc.G
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f206435b, bVar)) {
                this.f206435b = bVar;
                this.f206434a.onSubscribe(this);
            }
        }
    }

    public r0(hc.E<T> e10) {
        super(e10);
    }

    @Override // hc.z
    public void C5(hc.G<? super T> g10) {
        this.f206214a.a(new a(g10));
    }
}
