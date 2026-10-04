package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import zc.a0;

/* JADX INFO: loaded from: classes7.dex */
public final class I<T> extends AbstractC4725a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bc.r<? super Throwable> f209365b;

    public static final class a<T> implements zc.F<T>, a0<T>, io.reactivex.rxjava3.disposables.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zc.F<? super T> f209366a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Bc.r<? super Throwable> f209367b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f209368c;

        public a(zc.F<? super T> actual, Bc.r<? super Throwable> predicate) {
            this.f209366a = actual;
            this.f209367b = predicate;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            this.f209368c.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return this.f209368c.isDisposed();
        }

        @Override // zc.F, zc.InterfaceC5888e
        public void onComplete() {
            this.f209366a.onComplete();
        }

        @Override // zc.F, zc.a0, zc.InterfaceC5888e
        public void onError(Throwable e10) {
            try {
                if (this.f209367b.test(e10)) {
                    this.f209366a.onComplete();
                } else {
                    this.f209366a.onError(e10);
                }
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                this.f209366a.onError(new CompositeException(e10, th));
            }
        }

        @Override // zc.F, zc.a0, zc.InterfaceC5888e
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            if (DisposableHelper.validate(this.f209368c, d10)) {
                this.f209368c = d10;
                this.f209366a.onSubscribe(this);
            }
        }

        @Override // zc.F, zc.a0
        public void onSuccess(T value) {
            this.f209366a.onSuccess(value);
        }
    }

    public I(zc.I<T> source, Bc.r<? super Throwable> predicate) {
        super(source);
        this.f209365b = predicate;
    }

    @Override // zc.AbstractC5881C
    public void U1(zc.F<? super T> observer) {
        this.f209610a.b(new a(observer, this.f209365b));
    }
}
