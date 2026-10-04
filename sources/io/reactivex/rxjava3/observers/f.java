package io.reactivex.rxjava3.observers;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import zc.a0;

/* JADX INFO: loaded from: classes7.dex */
public abstract class f<T> implements a0<T>, io.reactivex.rxjava3.disposables.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference<io.reactivex.rxjava3.disposables.d> f211972a = new AtomicReference<>();

    public void a() {
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final void dispose() {
        DisposableHelper.dispose(this.f211972a);
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final boolean isDisposed() {
        return this.f211972a.get() == DisposableHelper.DISPOSED;
    }

    @Override // zc.a0, zc.InterfaceC5888e
    public final void onSubscribe(@yc.e io.reactivex.rxjava3.disposables.d d10) {
        io.reactivex.rxjava3.internal.util.f.c(this.f211972a, d10, getClass());
    }
}
