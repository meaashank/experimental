package io.reactivex.rxjava3.internal.observers;

import Bc.a;
import Bc.g;
import io.reactivex.rxjava3.disposables.d;
import io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import zc.InterfaceC5888e;

/* JADX INFO: loaded from: classes7.dex */
public final class CallbackCompletableObserver extends AtomicReference<d> implements InterfaceC5888e, d, g<Throwable>, io.reactivex.rxjava3.observers.g {
    private static final long serialVersionUID = -4361286194466301354L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g<? super Throwable> f207581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f207582b;

    public CallbackCompletableObserver(a onComplete) {
        this.f207581a = this;
        this.f207582b = onComplete;
    }

    @Override // Bc.g
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void accept(Throwable e10) {
        Ic.a.Y(new OnErrorNotImplementedException(e10));
    }

    @Override // io.reactivex.rxjava3.observers.g
    public boolean d() {
        return this.f207581a != this;
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public boolean isDisposed() {
        return get() == DisposableHelper.DISPOSED;
    }

    @Override // zc.InterfaceC5888e
    public void onComplete() {
        try {
            this.f207582b.run();
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            Ic.a.Y(th);
        }
        lazySet(DisposableHelper.DISPOSED);
    }

    @Override // zc.InterfaceC5888e
    public void onError(Throwable e10) {
        try {
            this.f207581a.accept(e10);
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            Ic.a.Y(th);
        }
        lazySet(DisposableHelper.DISPOSED);
    }

    @Override // zc.InterfaceC5888e
    public void onSubscribe(d d10) {
        DisposableHelper.setOnce(this, d10);
    }

    public CallbackCompletableObserver(g<? super Throwable> onError, a onComplete) {
        this.f207581a = onError;
        this.f207582b = onComplete;
    }
}
