package io.reactivex.rxjava3.internal.schedulers;

import androidx.compose.animation.core.C1598m0;
import io.reactivex.rxjava3.internal.functions.Functions;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements Callable<Void>, io.reactivex.rxjava3.disposables.d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final FutureTask<Void> f211802f = new FutureTask<>(Functions.f207353b, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f211803a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ExecutorService f211806d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Thread f211807e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference<Future<?>> f211805c = new AtomicReference<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference<Future<?>> f211804b = new AtomicReference<>();

    public d(Runnable task, ExecutorService executor) {
        this.f211803a = task;
        this.f211806d = executor;
    }

    public Void a() {
        this.f211807e = Thread.currentThread();
        try {
            this.f211803a.run();
            c(this.f211806d.submit(this));
            this.f211807e = null;
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            this.f211807e = null;
            Ic.a.Y(th);
        }
        return null;
    }

    public void b(Future<?> f10) {
        Future<?> future;
        do {
            future = this.f211805c.get();
            if (future == f211802f) {
                f10.cancel(this.f211807e != Thread.currentThread());
                return;
            }
        } while (!C1598m0.a(this.f211805c, future, f10));
    }

    public void c(Future<?> f10) {
        Future<?> future;
        do {
            future = this.f211804b.get();
            if (future == f211802f) {
                f10.cancel(this.f211807e != Thread.currentThread());
                return;
            }
        } while (!C1598m0.a(this.f211804b, future, f10));
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Void call() throws Exception {
        a();
        return null;
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public void dispose() {
        AtomicReference<Future<?>> atomicReference = this.f211805c;
        FutureTask<Void> futureTask = f211802f;
        Future<?> andSet = atomicReference.getAndSet(futureTask);
        if (andSet != null && andSet != futureTask) {
            andSet.cancel(this.f211807e != Thread.currentThread());
        }
        Future<?> andSet2 = this.f211804b.getAndSet(futureTask);
        if (andSet2 == null || andSet2 == futureTask) {
            return;
        }
        andSet2.cancel(this.f211807e != Thread.currentThread());
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public boolean isDisposed() {
        return this.f211805c.get() == f211802f;
    }
}
