package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes7.dex */
public final class f0<T> extends AbstractC4740a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bc.r<? super Throwable> f210999b;

    public static final class a<T> implements zc.V<T>, io.reactivex.rxjava3.disposables.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zc.V<? super T> f211000a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Bc.r<? super Throwable> f211001b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f211002c;

        public a(zc.V<? super T> actual, Bc.r<? super Throwable> predicate) {
            this.f211000a = actual;
            this.f211001b = predicate;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            this.f211002c.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return this.f211002c.isDisposed();
        }

        @Override // zc.V
        public void onComplete() {
            this.f211000a.onComplete();
        }

        @Override // zc.V
        public void onError(Throwable e10) {
            try {
                if (this.f211001b.test(e10)) {
                    this.f211000a.onComplete();
                } else {
                    this.f211000a.onError(e10);
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                this.f211000a.onError(new CompositeException(e10, th));
            }
        }

        @Override // zc.V
        public void onNext(T value) {
            this.f211000a.onNext(value);
        }

        @Override // zc.V
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            if (DisposableHelper.validate(this.f211002c, d10)) {
                this.f211002c = d10;
                this.f211000a.onSubscribe(this);
            }
        }
    }

    public f0(zc.T<T> source, Bc.r<? super Throwable> predicate) {
        super(source);
        this.f210999b = predicate;
    }

    @Override // zc.N
    public void d6(zc.V<? super T> observer) {
        this.f210954a.a(new a(observer, this.f210999b));
    }
}
