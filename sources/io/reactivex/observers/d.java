package io.reactivex.observers;

import hc.G;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public abstract class d<T> implements G<T>, io.reactivex.disposables.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference<io.reactivex.disposables.b> f207225a = new AtomicReference<>();

    public void a() {
    }

    @Override // io.reactivex.disposables.b
    public final void dispose() {
        DisposableHelper.dispose(this.f207225a);
    }

    @Override // io.reactivex.disposables.b
    public final boolean isDisposed() {
        return this.f207225a.get() == DisposableHelper.DISPOSED;
    }

    @Override // hc.G
    public final void onSubscribe(@lc.e io.reactivex.disposables.b bVar) {
        io.reactivex.internal.util.f.c(this.f207225a, bVar, getClass());
    }
}
