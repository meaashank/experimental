package io.reactivex.rxjava3.observers;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import zc.V;

/* JADX INFO: loaded from: classes7.dex */
public abstract class e<T> implements V<T>, io.reactivex.rxjava3.disposables.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference<io.reactivex.rxjava3.disposables.d> f211971a = new AtomicReference<>();

    public void a() {
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final void dispose() {
        DisposableHelper.dispose(this.f211971a);
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final boolean isDisposed() {
        return this.f211971a.get() == DisposableHelper.DISPOSED;
    }

    @Override // zc.V
    public final void onSubscribe(@yc.e io.reactivex.rxjava3.disposables.d d10) {
        io.reactivex.rxjava3.internal.util.f.c(this.f211971a, d10, getClass());
    }
}
