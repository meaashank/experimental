package io.reactivex.internal.observers;

import hc.InterfaceC4524d;
import io.reactivex.disposables.b;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.observers.f;
import java.util.concurrent.atomic.AtomicReference;
import uc.C5666a;

/* JADX INFO: loaded from: classes7.dex */
public final class EmptyCompletableObserver extends AtomicReference<b> implements InterfaceC4524d, b, f {
    private static final long serialVersionUID = -7545121636549663526L;

    @Override // io.reactivex.observers.f
    public boolean d() {
        return false;
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // io.reactivex.disposables.b
    public boolean isDisposed() {
        return get() == DisposableHelper.DISPOSED;
    }

    @Override // hc.InterfaceC4524d
    public void onComplete() {
        lazySet(DisposableHelper.DISPOSED);
    }

    @Override // hc.InterfaceC4524d
    public void onError(Throwable th) {
        lazySet(DisposableHelper.DISPOSED);
        C5666a.Y(new OnErrorNotImplementedException(th));
    }

    @Override // hc.InterfaceC4524d
    public void onSubscribe(b bVar) {
        DisposableHelper.setOnce(this, bVar);
    }
}
