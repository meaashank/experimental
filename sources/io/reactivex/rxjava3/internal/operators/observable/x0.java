package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes7.dex */
public final class x0<T> extends AbstractC4740a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bc.r<? super T> f211226b;

    public static final class a<T> implements zc.V<T>, io.reactivex.rxjava3.disposables.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zc.V<? super T> f211227a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Bc.r<? super T> f211228b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f211229c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f211230d;

        public a(zc.V<? super T> actual, Bc.r<? super T> predicate) {
            this.f211227a = actual;
            this.f211228b = predicate;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            this.f211229c.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return this.f211229c.isDisposed();
        }

        @Override // zc.V
        public void onComplete() {
            if (this.f211230d) {
                return;
            }
            this.f211230d = true;
            this.f211227a.onComplete();
        }

        @Override // zc.V
        public void onError(Throwable t10) {
            if (this.f211230d) {
                Ic.a.Y(t10);
            } else {
                this.f211230d = true;
                this.f211227a.onError(t10);
            }
        }

        @Override // zc.V
        public void onNext(T t10) {
            if (this.f211230d) {
                return;
            }
            try {
                if (this.f211228b.test(t10)) {
                    this.f211227a.onNext(t10);
                    return;
                }
                this.f211230d = true;
                this.f211229c.dispose();
                this.f211227a.onComplete();
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                this.f211229c.dispose();
                onError(th);
            }
        }

        @Override // zc.V
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            if (DisposableHelper.validate(this.f211229c, d10)) {
                this.f211229c = d10;
                this.f211227a.onSubscribe(this);
            }
        }
    }

    public x0(zc.T<T> source, Bc.r<? super T> predicate) {
        super(source);
        this.f211226b = predicate;
    }

    @Override // zc.N
    public void d6(zc.V<? super T> t10) {
        this.f210954a.a(new a(t10, this.f211226b));
    }
}
