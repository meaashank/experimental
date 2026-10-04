package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes7.dex */
public final class w0<T> extends AbstractC4740a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bc.r<? super T> f211215b;

    public static final class a<T> implements zc.V<T>, io.reactivex.rxjava3.disposables.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zc.V<? super T> f211216a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Bc.r<? super T> f211217b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f211218c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f211219d;

        public a(zc.V<? super T> downstream, Bc.r<? super T> predicate) {
            this.f211216a = downstream;
            this.f211217b = predicate;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            this.f211218c.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return this.f211218c.isDisposed();
        }

        @Override // zc.V
        public void onComplete() {
            if (this.f211219d) {
                return;
            }
            this.f211219d = true;
            this.f211216a.onComplete();
        }

        @Override // zc.V
        public void onError(Throwable t10) {
            if (this.f211219d) {
                Ic.a.Y(t10);
            } else {
                this.f211219d = true;
                this.f211216a.onError(t10);
            }
        }

        @Override // zc.V
        public void onNext(T t10) {
            if (this.f211219d) {
                return;
            }
            this.f211216a.onNext(t10);
            try {
                if (this.f211217b.test(t10)) {
                    this.f211219d = true;
                    this.f211218c.dispose();
                    this.f211216a.onComplete();
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                this.f211218c.dispose();
                onError(th);
            }
        }

        @Override // zc.V
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            if (DisposableHelper.validate(this.f211218c, d10)) {
                this.f211218c = d10;
                this.f211216a.onSubscribe(this);
            }
        }
    }

    public w0(zc.T<T> source, Bc.r<? super T> predicate) {
        super(source);
        this.f211215b = predicate;
    }

    @Override // zc.N
    public void d6(zc.V<? super T> observer) {
        this.f210954a.a(new a(observer, this.f211215b));
    }
}
