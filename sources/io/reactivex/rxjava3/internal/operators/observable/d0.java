package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes7.dex */
public final class d0<T> extends AbstractC4740a<T, zc.K<T>> {

    public static final class a<T> implements zc.V<T>, io.reactivex.rxjava3.disposables.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zc.V<? super zc.K<T>> f210985a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f210986b;

        public a(zc.V<? super zc.K<T>> downstream) {
            this.f210985a = downstream;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            this.f210986b.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return this.f210986b.isDisposed();
        }

        @Override // zc.V
        public void onComplete() {
            this.f210985a.onNext(zc.K.f241332b);
            this.f210985a.onComplete();
        }

        @Override // zc.V
        public void onError(Throwable t10) {
            this.f210985a.onNext(zc.K.b(t10));
            this.f210985a.onComplete();
        }

        @Override // zc.V
        public void onNext(T t10) {
            this.f210985a.onNext(zc.K.c(t10));
        }

        @Override // zc.V
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            if (DisposableHelper.validate(this.f210986b, d10)) {
                this.f210986b = d10;
                this.f210985a.onSubscribe(this);
            }
        }
    }

    public d0(zc.T<T> source) {
        super(source);
    }

    @Override // zc.N
    public void d6(zc.V<? super zc.K<T>> t10) {
        this.f210954a.a(new a(t10));
    }
}
