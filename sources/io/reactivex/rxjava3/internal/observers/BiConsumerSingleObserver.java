package io.reactivex.rxjava3.internal.observers;

import Bc.b;
import io.reactivex.rxjava3.disposables.d;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.a;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import zc.a0;

/* JADX INFO: loaded from: classes7.dex */
public final class BiConsumerSingleObserver<T> extends AtomicReference<d> implements a0<T>, d {
    private static final long serialVersionUID = 4943102778943297569L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b<? super T, ? super Throwable> f207578a;

    public BiConsumerSingleObserver(b<? super T, ? super Throwable> onCallback) {
        this.f207578a = onCallback;
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public boolean isDisposed() {
        return get() == DisposableHelper.DISPOSED;
    }

    @Override // zc.a0, zc.InterfaceC5888e
    public void onError(Throwable e10) {
        try {
            lazySet(DisposableHelper.DISPOSED);
            this.f207578a.accept(null, e10);
        } catch (Throwable th) {
            a.b(th);
            Ic.a.Y(new CompositeException(e10, th));
        }
    }

    @Override // zc.a0, zc.InterfaceC5888e
    public void onSubscribe(d d10) {
        DisposableHelper.setOnce(this, d10);
    }

    @Override // zc.a0
    public void onSuccess(T value) {
        try {
            lazySet(DisposableHelper.DISPOSED);
            this.f207578a.accept(value, null);
        } catch (Throwable th) {
            a.b(th);
            Ic.a.Y(th);
        }
    }
}
