package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.disposables.d;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.a;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.observers.g;
import java.util.concurrent.atomic.AtomicReference;
import zc.a0;

/* JADX INFO: loaded from: classes7.dex */
public final class ConsumerSingleObserver<T> extends AtomicReference<d> implements a0<T>, d, g {
    private static final long serialVersionUID = -7012088219455310787L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bc.g<? super T> f207583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bc.g<? super Throwable> f207584b;

    public ConsumerSingleObserver(Bc.g<? super T> onSuccess, Bc.g<? super Throwable> onError) {
        this.f207583a = onSuccess;
        this.f207584b = onError;
    }

    @Override // io.reactivex.rxjava3.observers.g
    public boolean d() {
        return this.f207584b != Functions.f207357f;
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
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.f207584b.accept(e10);
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
        lazySet(DisposableHelper.DISPOSED);
        try {
            this.f207583a.accept(value);
        } catch (Throwable th) {
            a.b(th);
            Ic.a.Y(th);
        }
    }
}
