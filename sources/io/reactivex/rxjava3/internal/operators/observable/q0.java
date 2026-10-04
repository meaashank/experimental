package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes7.dex */
public final class q0<T> extends AbstractC4740a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f211148b;

    public static final class a<T> implements zc.V<T>, io.reactivex.rxjava3.disposables.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zc.V<? super T> f211149a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f211150b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f211151c;

        public a(zc.V<? super T> actual, long n10) {
            this.f211149a = actual;
            this.f211150b = n10;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            this.f211151c.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return this.f211151c.isDisposed();
        }

        @Override // zc.V
        public void onComplete() {
            this.f211149a.onComplete();
        }

        @Override // zc.V
        public void onError(Throwable t10) {
            this.f211149a.onError(t10);
        }

        @Override // zc.V
        public void onNext(T t10) {
            long j10 = this.f211150b;
            if (j10 != 0) {
                this.f211150b = j10 - 1;
            } else {
                this.f211149a.onNext(t10);
            }
        }

        @Override // zc.V
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            if (DisposableHelper.validate(this.f211151c, d10)) {
                this.f211151c = d10;
                this.f211149a.onSubscribe(this);
            }
        }
    }

    public q0(zc.T<T> source, long n10) {
        super(source);
        this.f211148b = n10;
    }

    @Override // zc.N
    public void d6(zc.V<? super T> observer) {
        this.f210954a.a(new a(observer, this.f211148b));
    }
}
