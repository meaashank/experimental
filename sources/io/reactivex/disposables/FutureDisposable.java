package io.reactivex.disposables;

import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
final class FutureDisposable extends AtomicReference<Future<?>> implements b {
    private static final long serialVersionUID = 6545242830671168775L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f202937a;

    public FutureDisposable(Future<?> future, boolean z10) {
        super(future);
        this.f202937a = z10;
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
        Future<?> andSet = getAndSet(null);
        if (andSet != null) {
            andSet.cancel(this.f202937a);
        }
    }

    @Override // io.reactivex.disposables.b
    public boolean isDisposed() {
        Future<?> future = get();
        return future == null || future.isDone();
    }
}
