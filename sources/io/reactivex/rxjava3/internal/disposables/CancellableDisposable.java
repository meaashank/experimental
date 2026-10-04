package io.reactivex.rxjava3.internal.disposables;

import Bc.f;
import io.reactivex.rxjava3.disposables.d;
import io.reactivex.rxjava3.exceptions.a;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class CancellableDisposable extends AtomicReference<f> implements d {
    private static final long serialVersionUID = 5718521705281392066L;

    public CancellableDisposable(f cancellable) {
        super(cancellable);
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public void dispose() {
        f andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        try {
            andSet.cancel();
        } catch (Throwable th) {
            a.b(th);
            Ic.a.Y(th);
        }
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public boolean isDisposed() {
        return get() == null;
    }
}
