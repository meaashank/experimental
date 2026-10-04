package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.maybe.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4731g<T> extends AbstractC4725a<T, T> {

    /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.maybe.g$a */
    public static final class a<T> implements zc.F<T>, io.reactivex.rxjava3.disposables.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public zc.F<? super T> f209630a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f209631b;

        public a(zc.F<? super T> downstream) {
            this.f209630a = downstream;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            this.f209630a = null;
            this.f209631b.dispose();
            this.f209631b = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return this.f209631b.isDisposed();
        }

        @Override // zc.F, zc.InterfaceC5888e
        public void onComplete() {
            this.f209631b = DisposableHelper.DISPOSED;
            zc.F<? super T> f10 = this.f209630a;
            if (f10 != null) {
                this.f209630a = null;
                f10.onComplete();
            }
        }

        @Override // zc.F, zc.a0, zc.InterfaceC5888e
        public void onError(Throwable e10) {
            this.f209631b = DisposableHelper.DISPOSED;
            zc.F<? super T> f10 = this.f209630a;
            if (f10 != null) {
                this.f209630a = null;
                f10.onError(e10);
            }
        }

        @Override // zc.F, zc.a0, zc.InterfaceC5888e
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            if (DisposableHelper.validate(this.f209631b, d10)) {
                this.f209631b = d10;
                this.f209630a.onSubscribe(this);
            }
        }

        @Override // zc.F, zc.a0
        public void onSuccess(T value) {
            this.f209631b = DisposableHelper.DISPOSED;
            zc.F<? super T> f10 = this.f209630a;
            if (f10 != null) {
                this.f209630a = null;
                f10.onSuccess(value);
            }
        }
    }

    public C4731g(zc.I<T> source) {
        super(source);
    }

    @Override // zc.AbstractC5881C
    public void U1(zc.F<? super T> observer) {
        this.f209610a.b(new a(observer));
    }
}
