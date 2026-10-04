package io.reactivex.rxjava3.disposables;

import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
final class FutureDisposable extends AtomicReference<Future<?>> implements d {
    private static final long serialVersionUID = 6545242830671168775L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f207342a;

    public FutureDisposable(Future<?> run, boolean allowInterrupt) {
        super(run);
        this.f207342a = allowInterrupt;
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public void dispose() {
        Future<?> andSet = getAndSet(null);
        if (andSet != null) {
            andSet.cancel(this.f207342a);
        }
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public boolean isDisposed() {
        Future<?> future = get();
        return future == null || future.isDone();
    }
}
