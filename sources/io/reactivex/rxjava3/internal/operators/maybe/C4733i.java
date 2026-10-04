package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.maybe.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4733i<T> extends AbstractC4725a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bc.b<? super T, ? super Throwable> f209636b;

    /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.maybe.i$a */
    public static final class a<T> implements zc.F<T>, io.reactivex.rxjava3.disposables.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zc.F<? super T> f209637a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Bc.b<? super T, ? super Throwable> f209638b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f209639c;

        public a(zc.F<? super T> actual, Bc.b<? super T, ? super Throwable> onEvent) {
            this.f209637a = actual;
            this.f209638b = onEvent;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            this.f209639c.dispose();
            this.f209639c = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return this.f209639c.isDisposed();
        }

        @Override // zc.F, zc.InterfaceC5888e
        public void onComplete() {
            this.f209639c = DisposableHelper.DISPOSED;
            try {
                this.f209638b.accept(null, null);
                this.f209637a.onComplete();
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                this.f209637a.onError(th);
            }
        }

        @Override // zc.F, zc.a0, zc.InterfaceC5888e
        public void onError(Throwable e10) {
            this.f209639c = DisposableHelper.DISPOSED;
            try {
                this.f209638b.accept(null, e10);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                e10 = new CompositeException(e10, th);
            }
            this.f209637a.onError(e10);
        }

        @Override // zc.F, zc.a0, zc.InterfaceC5888e
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            if (DisposableHelper.validate(this.f209639c, d10)) {
                this.f209639c = d10;
                this.f209637a.onSubscribe(this);
            }
        }

        @Override // zc.F, zc.a0
        public void onSuccess(T value) {
            this.f209639c = DisposableHelper.DISPOSED;
            try {
                this.f209638b.accept(value, null);
                this.f209637a.onSuccess(value);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                this.f209637a.onError(th);
            }
        }
    }

    public C4733i(zc.I<T> source, Bc.b<? super T, ? super Throwable> onEvent) {
        super(source);
        this.f209636b = onEvent;
    }

    @Override // zc.AbstractC5881C
    public void U1(zc.F<? super T> observer) {
        this.f209610a.b(new a(observer, this.f209636b));
    }
}
