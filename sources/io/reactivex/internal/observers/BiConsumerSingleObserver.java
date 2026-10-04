package io.reactivex.internal.observers;

import hc.L;
import io.reactivex.disposables.b;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.a;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC5266b;
import uc.C5666a;

/* JADX INFO: loaded from: classes7.dex */
public final class BiConsumerSingleObserver<T> extends AtomicReference<b> implements L<T>, b {
    private static final long serialVersionUID = 4943102778943297569L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC5266b<? super T, ? super Throwable> f202989a;

    public BiConsumerSingleObserver(InterfaceC5266b<? super T, ? super Throwable> interfaceC5266b) {
        this.f202989a = interfaceC5266b;
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // io.reactivex.disposables.b
    public boolean isDisposed() {
        return get() == DisposableHelper.DISPOSED;
    }

    @Override // hc.L
    public void onError(Throwable th) {
        try {
            lazySet(DisposableHelper.DISPOSED);
            this.f202989a.accept(null, th);
        } catch (Throwable th2) {
            a.b(th2);
            C5666a.Y(new CompositeException(th, th2));
        }
    }

    @Override // hc.L
    public void onSubscribe(b bVar) {
        DisposableHelper.setOnce(this, bVar);
    }

    @Override // hc.L
    public void onSuccess(T t10) {
        try {
            lazySet(DisposableHelper.DISPOSED);
            this.f202989a.accept(t10, null);
        } catch (Throwable th) {
            a.b(th);
            C5666a.Y(th);
        }
    }
}
