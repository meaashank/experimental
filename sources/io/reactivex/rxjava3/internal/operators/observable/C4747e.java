package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.observable.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4747e<T> extends AbstractC4740a<T, Boolean> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bc.r<? super T> f210987b;

    /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.observable.e$a */
    public static final class a<T> implements zc.V<T>, io.reactivex.rxjava3.disposables.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zc.V<? super Boolean> f210988a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Bc.r<? super T> f210989b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f210990c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f210991d;

        public a(zc.V<? super Boolean> actual, Bc.r<? super T> predicate) {
            this.f210988a = actual;
            this.f210989b = predicate;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            this.f210990c.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return this.f210990c.isDisposed();
        }

        @Override // zc.V
        public void onComplete() {
            if (this.f210991d) {
                return;
            }
            this.f210991d = true;
            this.f210988a.onNext(Boolean.TRUE);
            this.f210988a.onComplete();
        }

        @Override // zc.V
        public void onError(Throwable t10) {
            if (this.f210991d) {
                Ic.a.Y(t10);
            } else {
                this.f210991d = true;
                this.f210988a.onError(t10);
            }
        }

        @Override // zc.V
        public void onNext(T t10) {
            if (this.f210991d) {
                return;
            }
            try {
                if (this.f210989b.test(t10)) {
                    return;
                }
                this.f210991d = true;
                this.f210990c.dispose();
                this.f210988a.onNext(Boolean.FALSE);
                this.f210988a.onComplete();
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                this.f210990c.dispose();
                onError(th);
            }
        }

        @Override // zc.V
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            if (DisposableHelper.validate(this.f210990c, d10)) {
                this.f210990c = d10;
                this.f210988a.onSubscribe(this);
            }
        }
    }

    public C4747e(zc.T<T> source, Bc.r<? super T> predicate) {
        super(source);
        this.f210987b = predicate;
    }

    @Override // zc.N
    public void d6(zc.V<? super Boolean> t10) {
        this.f210954a.a(new a(t10, this.f210987b));
    }
}
