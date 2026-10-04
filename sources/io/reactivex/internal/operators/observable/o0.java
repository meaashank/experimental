package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes7.dex */
public final class o0<T> extends AbstractC4648a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nc.r<? super T> f206400b;

    public static final class a<T> implements hc.G<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hc.G<? super T> f206401a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final nc.r<? super T> f206402b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public io.reactivex.disposables.b f206403c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f206404d;

        public a(hc.G<? super T> g10, nc.r<? super T> rVar) {
            this.f206401a = g10;
            this.f206402b = rVar;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f206403c.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f206403c.isDisposed();
        }

        @Override // hc.G
        public void onComplete() {
            this.f206401a.onComplete();
        }

        @Override // hc.G
        public void onError(Throwable th) {
            this.f206401a.onError(th);
        }

        @Override // hc.G
        public void onNext(T t10) {
            if (this.f206404d) {
                this.f206401a.onNext(t10);
                return;
            }
            try {
                if (this.f206402b.test(t10)) {
                    return;
                }
                this.f206404d = true;
                this.f206401a.onNext(t10);
            } catch (Throwable th) {
                io.reactivex.exceptions.a.b(th);
                this.f206403c.dispose();
                this.f206401a.onError(th);
            }
        }

        @Override // hc.G
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f206403c, bVar)) {
                this.f206403c = bVar;
                this.f206401a.onSubscribe(this);
            }
        }
    }

    public o0(hc.E<T> e10, nc.r<? super T> rVar) {
        super(e10);
        this.f206400b = rVar;
    }

    @Override // hc.z
    public void C5(hc.G<? super T> g10) {
        this.f206214a.a(new a(g10, this.f206400b));
    }
}
