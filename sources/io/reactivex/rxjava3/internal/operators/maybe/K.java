package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;

/* JADX INFO: loaded from: classes7.dex */
public final class K<T> extends AbstractC4725a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bc.g<? super io.reactivex.rxjava3.disposables.d> f209373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bc.g<? super T> f209374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bc.g<? super Throwable> f209375d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bc.a f209376e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Bc.a f209377f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bc.a f209378g;

    public static final class a<T> implements zc.F<T>, io.reactivex.rxjava3.disposables.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zc.F<? super T> f209379a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final K<T> f209380b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f209381c;

        public a(zc.F<? super T> actual, K<T> parent) {
            this.f209379a = actual;
            this.f209380b = parent;
        }

        public void a() {
            try {
                this.f209380b.f209377f.run();
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                Ic.a.Y(th);
            }
        }

        public void b(Throwable e10) {
            try {
                this.f209380b.f209375d.accept(e10);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                e10 = new CompositeException(e10, th);
            }
            this.f209381c = DisposableHelper.DISPOSED;
            this.f209379a.onError(e10);
            a();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            try {
                this.f209380b.f209378g.run();
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                Ic.a.Y(th);
            }
            this.f209381c.dispose();
            this.f209381c = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return this.f209381c.isDisposed();
        }

        @Override // zc.F, zc.InterfaceC5888e
        public void onComplete() {
            io.reactivex.rxjava3.disposables.d dVar = this.f209381c;
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (dVar == disposableHelper) {
                return;
            }
            try {
                this.f209380b.f209376e.run();
                this.f209381c = disposableHelper;
                this.f209379a.onComplete();
                a();
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                b(th);
            }
        }

        @Override // zc.F, zc.a0, zc.InterfaceC5888e
        public void onError(Throwable e10) {
            if (this.f209381c == DisposableHelper.DISPOSED) {
                Ic.a.Y(e10);
            } else {
                b(e10);
            }
        }

        @Override // zc.F, zc.a0, zc.InterfaceC5888e
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            if (DisposableHelper.validate(this.f209381c, d10)) {
                try {
                    this.f209380b.f209373b.accept(d10);
                    this.f209381c = d10;
                    this.f209379a.onSubscribe(this);
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.a.b(th);
                    d10.dispose();
                    this.f209381c = DisposableHelper.DISPOSED;
                    EmptyDisposable.error(th, this.f209379a);
                }
            }
        }

        @Override // zc.F, zc.a0
        public void onSuccess(T value) {
            io.reactivex.rxjava3.disposables.d dVar = this.f209381c;
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (dVar == disposableHelper) {
                return;
            }
            try {
                this.f209380b.f209374c.accept(value);
                this.f209381c = disposableHelper;
                this.f209379a.onSuccess(value);
                a();
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                b(th);
            }
        }
    }

    public K(zc.I<T> source, Bc.g<? super io.reactivex.rxjava3.disposables.d> onSubscribeCall, Bc.g<? super T> onSuccessCall, Bc.g<? super Throwable> onErrorCall, Bc.a onCompleteCall, Bc.a onAfterTerminate, Bc.a onDispose) {
        super(source);
        this.f209373b = onSubscribeCall;
        this.f209374c = onSuccessCall;
        this.f209375d = onErrorCall;
        this.f209376e = onCompleteCall;
        this.f209377f = onAfterTerminate;
        this.f209378g = onDispose;
    }

    @Override // zc.AbstractC5881C
    public void U1(zc.F<? super T> observer) {
        this.f209610a.b(new a(observer, this));
    }
}
