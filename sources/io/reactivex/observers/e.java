package io.reactivex.observers;

import hc.L;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public abstract class e<T> implements L<T>, io.reactivex.disposables.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference<io.reactivex.disposables.b> f207226a = new AtomicReference<>();

    public void a() {
    }

    @Override // io.reactivex.disposables.b
    public final void dispose() {
        DisposableHelper.dispose(this.f207226a);
    }

    @Override // io.reactivex.disposables.b
    public final boolean isDisposed() {
        return this.f207226a.get() == DisposableHelper.DISPOSED;
    }

    @Override // hc.L
    public final void onSubscribe(@lc.e io.reactivex.disposables.b bVar) {
        io.reactivex.internal.util.f.c(this.f207226a, bVar, getClass());
    }
}
