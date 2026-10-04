package io.reactivex.internal.schedulers;

import io.reactivex.internal.functions.Functions;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
abstract class AbstractDirectTask extends AtomicReference<Future<?>> implements io.reactivex.disposables.b, Kc.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final FutureTask<Void> f206986c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final FutureTask<Void> f206987d;
    private static final long serialVersionUID = 1811839108042568751L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f206988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Thread f206989b;

    static {
        Runnable runnable = Functions.f202948b;
        f206986c = new FutureTask<>(runnable, null);
        f206987d = new FutureTask<>(runnable, null);
    }

    public AbstractDirectTask(Runnable runnable) {
        this.f206988a = runnable;
    }

    public final void a(Future<?> future) {
        Future<?> future2;
        do {
            future2 = get();
            if (future2 == f206986c) {
                return;
            }
            if (future2 == f206987d) {
                future.cancel(this.f206989b != Thread.currentThread());
                return;
            }
        } while (!compareAndSet(future2, future));
    }

    @Override // Kc.a
    public Runnable d() {
        return this.f206988a;
    }

    @Override // io.reactivex.disposables.b
    public final void dispose() {
        FutureTask<Void> futureTask;
        Future<?> future = get();
        if (future == f206986c || future == (futureTask = f206987d) || !compareAndSet(future, futureTask) || future == null) {
            return;
        }
        future.cancel(this.f206989b != Thread.currentThread());
    }

    @Override // io.reactivex.disposables.b
    public final boolean isDisposed() {
        Future<?> future = get();
        return future == f206986c || future == f206987d;
    }
}
