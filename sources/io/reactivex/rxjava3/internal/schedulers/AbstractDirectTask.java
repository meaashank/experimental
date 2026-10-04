package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.internal.functions.Functions;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
abstract class AbstractDirectTask extends AtomicReference<Future<?>> implements io.reactivex.rxjava3.disposables.d, Jc.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final FutureTask<Void> f211722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final FutureTask<Void> f211723d;
    private static final long serialVersionUID = 1811839108042568751L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f211724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Thread f211725b;

    static {
        Runnable runnable = Functions.f207353b;
        f211722c = new FutureTask<>(runnable, null);
        f211723d = new FutureTask<>(runnable, null);
    }

    public AbstractDirectTask(Runnable runnable) {
        this.f211724a = runnable;
    }

    public final void a(Future<?> future) {
        Future<?> future2;
        do {
            future2 = get();
            if (future2 == f211722c) {
                return;
            }
            if (future2 == f211723d) {
                future.cancel(this.f211725b != Thread.currentThread());
                return;
            }
        } while (!compareAndSet(future2, future));
    }

    @Override // Jc.a
    public Runnable d() {
        return this.f211724a;
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final void dispose() {
        FutureTask<Void> futureTask;
        Future<?> future = get();
        if (future == f211722c || future == (futureTask = f211723d) || !compareAndSet(future, futureTask) || future == null) {
            return;
        }
        future.cancel(this.f211725b != Thread.currentThread());
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final boolean isDisposed() {
        Future<?> future = get();
        return future == f211722c || future == f211723d;
    }
}
