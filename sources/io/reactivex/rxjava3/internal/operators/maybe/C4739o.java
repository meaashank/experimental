package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.maybe.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4739o<T> extends AbstractC4725a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bc.r<? super T> f209653b;

    /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.maybe.o$a */
    public static final class a<T> implements zc.F<T>, io.reactivex.rxjava3.disposables.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zc.F<? super T> f209654a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Bc.r<? super T> f209655b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f209656c;

        public a(zc.F<? super T> actual, Bc.r<? super T> predicate) {
            this.f209654a = actual;
            this.f209655b = predicate;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            io.reactivex.rxjava3.disposables.d dVar = this.f209656c;
            this.f209656c = DisposableHelper.DISPOSED;
            dVar.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return this.f209656c.isDisposed();
        }

        @Override // zc.F, zc.InterfaceC5888e
        public void onComplete() {
            this.f209654a.onComplete();
        }

        @Override // zc.F, zc.a0, zc.InterfaceC5888e
        public void onError(Throwable e10) {
            this.f209654a.onError(e10);
        }

        @Override // zc.F, zc.a0, zc.InterfaceC5888e
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            if (DisposableHelper.validate(this.f209656c, d10)) {
                this.f209656c = d10;
                this.f209654a.onSubscribe(this);
            }
        }

        @Override // zc.F, zc.a0
        public void onSuccess(T value) {
            try {
                if (this.f209655b.test(value)) {
                    this.f209654a.onSuccess(value);
                } else {
                    this.f209654a.onComplete();
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                this.f209654a.onError(th);
            }
        }
    }

    public C4739o(zc.I<T> source, Bc.r<? super T> predicate) {
        super(source);
        this.f209653b = predicate;
    }

    @Override // zc.AbstractC5881C
    public void U1(zc.F<? super T> observer) {
        this.f209610a.b(new a(observer, this.f209653b));
    }
}
