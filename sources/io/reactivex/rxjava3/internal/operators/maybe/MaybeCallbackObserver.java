package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.functions.Functions;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class MaybeCallbackObserver<T> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements zc.F<T>, io.reactivex.rxjava3.disposables.d, io.reactivex.rxjava3.observers.g {
    private static final long serialVersionUID = -6076952298809384986L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bc.g<? super T> f209403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bc.g<? super Throwable> f209404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bc.a f209405c;

    public MaybeCallbackObserver(Bc.g<? super T> onSuccess, Bc.g<? super Throwable> onError, Bc.a onComplete) {
        this.f209403a = onSuccess;
        this.f209404b = onError;
        this.f209405c = onComplete;
    }

    @Override // io.reactivex.rxjava3.observers.g
    public boolean d() {
        return this.f209404b != Functions.f207357f;
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(get());
    }

    @Override // zc.F, zc.InterfaceC5888e
    public void onComplete() {
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.f209405c.run();
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            Ic.a.Y(th);
        }
    }

    @Override // zc.F, zc.a0, zc.InterfaceC5888e
    public void onError(Throwable e10) {
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.f209404b.accept(e10);
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            Ic.a.Y(new CompositeException(e10, th));
        }
    }

    @Override // zc.F, zc.a0, zc.InterfaceC5888e
    public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
        DisposableHelper.setOnce(this, d10);
    }

    @Override // zc.F, zc.a0
    public void onSuccess(T value) {
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.f209403a.accept(value);
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            Ic.a.Y(th);
        }
    }
}
