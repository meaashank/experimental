package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes7.dex */
public final class m0<T> extends AbstractC4648a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f206370b;

    public static final class a<T> implements hc.G<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hc.G<? super T> f206371a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f206372b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public io.reactivex.disposables.b f206373c;

        public a(hc.G<? super T> g10, long j10) {
            this.f206371a = g10;
            this.f206372b = j10;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f206373c.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f206373c.isDisposed();
        }

        @Override // hc.G
        public void onComplete() {
            this.f206371a.onComplete();
        }

        @Override // hc.G
        public void onError(Throwable th) {
            this.f206371a.onError(th);
        }

        @Override // hc.G
        public void onNext(T t10) {
            long j10 = this.f206372b;
            if (j10 != 0) {
                this.f206372b = j10 - 1;
            } else {
                this.f206371a.onNext(t10);
            }
        }

        @Override // hc.G
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f206373c, bVar)) {
                this.f206373c = bVar;
                this.f206371a.onSubscribe(this);
            }
        }
    }

    public m0(hc.E<T> e10, long j10) {
        super(e10);
        this.f206370b = j10;
    }

    @Override // hc.z
    public void C5(hc.G<? super T> g10) {
        this.f206214a.a(new a(g10, this.f206370b));
    }
}
