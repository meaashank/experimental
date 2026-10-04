package io.reactivex.internal.schedulers;

import androidx.compose.animation.core.C1598m0;
import io.reactivex.internal.functions.Functions;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;
import uc.C5666a;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements Callable<Void>, io.reactivex.disposables.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final FutureTask<Void> f207054f = new FutureTask<>(Functions.f202948b, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f207055a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ExecutorService f207058d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Thread f207059e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference<Future<?>> f207057c = new AtomicReference<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference<Future<?>> f207056b = new AtomicReference<>();

    public d(Runnable runnable, ExecutorService executorService) {
        this.f207055a = runnable;
        this.f207058d = executorService;
    }

    public Void a() throws Exception {
        this.f207059e = Thread.currentThread();
        try {
            this.f207055a.run();
            c(this.f207058d.submit(this));
            this.f207059e = null;
        } catch (Throwable th) {
            this.f207059e = null;
            C5666a.Y(th);
        }
        return null;
    }

    public void b(Future<?> future) {
        Future<?> future2;
        do {
            future2 = this.f207057c.get();
            if (future2 == f207054f) {
                future.cancel(this.f207059e != Thread.currentThread());
                return;
            }
        } while (!C1598m0.a(this.f207057c, future2, future));
    }

    public void c(Future<?> future) {
        Future<?> future2;
        do {
            future2 = this.f207056b.get();
            if (future2 == f207054f) {
                future.cancel(this.f207059e != Thread.currentThread());
                return;
            }
        } while (!C1598m0.a(this.f207056b, future2, future));
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Void call() throws Exception {
        a();
        return null;
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
        AtomicReference<Future<?>> atomicReference = this.f207057c;
        FutureTask<Void> futureTask = f207054f;
        Future<?> andSet = atomicReference.getAndSet(futureTask);
        if (andSet != null && andSet != futureTask) {
            andSet.cancel(this.f207059e != Thread.currentThread());
        }
        Future<?> andSet2 = this.f207056b.getAndSet(futureTask);
        if (andSet2 == null || andSet2 == futureTask) {
            return;
        }
        andSet2.cancel(this.f207059e != Thread.currentThread());
    }

    @Override // io.reactivex.disposables.b
    public boolean isDisposed() {
        return this.f207057c.get() == f207054f;
    }
}
