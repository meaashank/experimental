package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes7.dex */
public final class s0<T> extends AbstractC4740a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bc.r<? super T> f211179b;

    public static final class a<T> implements zc.V<T>, io.reactivex.rxjava3.disposables.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zc.V<? super T> f211180a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Bc.r<? super T> f211181b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f211182c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f211183d;

        public a(zc.V<? super T> actual, Bc.r<? super T> predicate) {
            this.f211180a = actual;
            this.f211181b = predicate;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            this.f211182c.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return this.f211182c.isDisposed();
        }

        @Override // zc.V
        public void onComplete() {
            this.f211180a.onComplete();
        }

        @Override // zc.V
        public void onError(Throwable t10) {
            this.f211180a.onError(t10);
        }

        @Override // zc.V
        public void onNext(T t10) {
            if (this.f211183d) {
                this.f211180a.onNext(t10);
                return;
            }
            try {
                if (this.f211181b.test(t10)) {
                    return;
                }
                this.f211183d = true;
                this.f211180a.onNext(t10);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                this.f211182c.dispose();
                this.f211180a.onError(th);
            }
        }

        @Override // zc.V
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            if (DisposableHelper.validate(this.f211182c, d10)) {
                this.f211182c = d10;
                this.f211180a.onSubscribe(this);
            }
        }
    }

    public s0(zc.T<T> source, Bc.r<? super T> predicate) {
        super(source);
        this.f211179b = predicate;
    }

    @Override // zc.N
    public void d6(zc.V<? super T> observer) {
        this.f210954a.a(new a(observer, this.f211179b));
    }
}
