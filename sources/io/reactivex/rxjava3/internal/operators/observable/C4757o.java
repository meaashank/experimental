package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.observable.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4757o<T> extends AbstractC4740a<T, Long> {

    /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.observable.o$a */
    public static final class a implements zc.V<Object>, io.reactivex.rxjava3.disposables.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zc.V<? super Long> f211117a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f211118b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f211119c;

        public a(zc.V<? super Long> downstream) {
            this.f211117a = downstream;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            this.f211118b.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return this.f211118b.isDisposed();
        }

        @Override // zc.V
        public void onComplete() {
            this.f211117a.onNext(Long.valueOf(this.f211119c));
            this.f211117a.onComplete();
        }

        @Override // zc.V
        public void onError(Throwable t10) {
            this.f211117a.onError(t10);
        }

        @Override // zc.V
        public void onNext(Object t10) {
            this.f211119c++;
        }

        @Override // zc.V
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            if (DisposableHelper.validate(this.f211118b, d10)) {
                this.f211118b = d10;
                this.f211117a.onSubscribe(this);
            }
        }
    }

    public C4757o(zc.T<T> source) {
        super(source);
    }

    @Override // zc.N
    public void d6(zc.V<? super Long> t10) {
        this.f210954a.a(new a(t10));
    }
}
