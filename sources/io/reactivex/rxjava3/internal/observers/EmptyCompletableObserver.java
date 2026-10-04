package io.reactivex.rxjava3.internal.observers;

import Ic.a;
import io.reactivex.rxjava3.disposables.d;
import io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.observers.g;
import java.util.concurrent.atomic.AtomicReference;
import zc.InterfaceC5888e;

/* JADX INFO: loaded from: classes7.dex */
public final class EmptyCompletableObserver extends AtomicReference<d> implements InterfaceC5888e, d, g {
    private static final long serialVersionUID = -7545121636549663526L;

    @Override // io.reactivex.rxjava3.observers.g
    public boolean d() {
        return false;
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
        lazySet(DisposableHelper.DISPOSED);
    }

    @Override // zc.InterfaceC5888e
    public void onError(Throwable e10) {
        lazySet(DisposableHelper.DISPOSED);
        a.Y(new OnErrorNotImplementedException(e10));
    }

    @Override // zc.InterfaceC5888e
    public void onSubscribe(d d10) {
        DisposableHelper.setOnce(this, d10);
    }
}
