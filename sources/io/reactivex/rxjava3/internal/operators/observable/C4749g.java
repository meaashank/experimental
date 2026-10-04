package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.observable.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4749g<T> extends AbstractC4740a<T, Boolean> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bc.r<? super T> f211003b;

    /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.observable.g$a */
    public static final class a<T> implements zc.V<T>, io.reactivex.rxjava3.disposables.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zc.V<? super Boolean> f211004a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Bc.r<? super T> f211005b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f211006c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f211007d;

        public a(zc.V<? super Boolean> actual, Bc.r<? super T> predicate) {
            this.f211004a = actual;
            this.f211005b = predicate;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            this.f211006c.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return this.f211006c.isDisposed();
        }

        @Override // zc.V
        public void onComplete() {
            if (this.f211007d) {
                return;
            }
            this.f211007d = true;
            this.f211004a.onNext(Boolean.FALSE);
            this.f211004a.onComplete();
        }

        @Override // zc.V
        public void onError(Throwable t10) {
            if (this.f211007d) {
                Ic.a.Y(t10);
            } else {
                this.f211007d = true;
                this.f211004a.onError(t10);
            }
        }

        @Override // zc.V
        public void onNext(T t10) {
            if (this.f211007d) {
                return;
            }
            try {
                if (this.f211005b.test(t10)) {
                    this.f211007d = true;
                    this.f211006c.dispose();
                    this.f211004a.onNext(Boolean.TRUE);
                    this.f211004a.onComplete();
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                this.f211006c.dispose();
                onError(th);
            }
        }

        @Override // zc.V
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            if (DisposableHelper.validate(this.f211006c, d10)) {
                this.f211006c = d10;
                this.f211004a.onSubscribe(this);
            }
        }
    }

    public C4749g(zc.T<T> source, Bc.r<? super T> predicate) {
        super(source);
        this.f211003b = predicate;
    }

    @Override // zc.N
    public void d6(zc.V<? super Boolean> t10) {
        this.f210954a.a(new a(t10, this.f211003b));
    }
}
