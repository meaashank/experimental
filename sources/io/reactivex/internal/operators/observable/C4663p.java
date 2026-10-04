package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: renamed from: io.reactivex.internal.operators.observable.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4663p<T> extends AbstractC4648a<T, Long> {

    /* JADX INFO: renamed from: io.reactivex.internal.operators.observable.p$a */
    public static final class a implements hc.G<Object>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hc.G<? super Long> f206405a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public io.reactivex.disposables.b f206406b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f206407c;

        public a(hc.G<? super Long> g10) {
            this.f206405a = g10;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f206406b.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f206406b.isDisposed();
        }

        @Override // hc.G
        public void onComplete() {
            this.f206405a.onNext(Long.valueOf(this.f206407c));
            this.f206405a.onComplete();
        }

        @Override // hc.G
        public void onError(Throwable th) {
            this.f206405a.onError(th);
        }

        @Override // hc.G
        public void onNext(Object obj) {
            this.f206407c++;
        }

        @Override // hc.G
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f206406b, bVar)) {
                this.f206406b = bVar;
                this.f206405a.onSubscribe(this);
            }
        }
    }

    public C4663p(hc.E<T> e10) {
        super(e10);
    }

    @Override // hc.z
    public void C5(hc.G<? super Long> g10) {
        this.f206214a.a(new a(g10));
    }
}
