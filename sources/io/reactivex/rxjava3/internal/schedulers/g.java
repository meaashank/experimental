package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import zc.W;

/* JADX INFO: loaded from: classes7.dex */
public class g extends W.c implements io.reactivex.rxjava3.disposables.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f211836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f211837b;

    public g(ThreadFactory threadFactory) {
        this.f211836a = j.a(threadFactory);
    }

    @Override // zc.W.c
    @yc.e
    public io.reactivex.rxjava3.disposables.d b(@yc.e final Runnable run) {
        return c(run, 0L, null);
    }

    @Override // zc.W.c
    @yc.e
    public io.reactivex.rxjava3.disposables.d c(@yc.e final Runnable action, long delayTime, @yc.e TimeUnit unit) {
        return this.f211837b ? EmptyDisposable.INSTANCE : e(action, delayTime, unit, null);
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public void dispose() {
        if (this.f211837b) {
            return;
        }
        this.f211837b = true;
        this.f211836a.shutdownNow();
    }

    @yc.e
    public ScheduledRunnable e(final Runnable run, long delayTime, @yc.e TimeUnit unit, @yc.f io.reactivex.rxjava3.disposables.e parent) {
        ScheduledRunnable scheduledRunnable = new ScheduledRunnable(Ic.a.b0(run), parent);
        if (parent != null && !parent.a(scheduledRunnable)) {
            return scheduledRunnable;
        }
        try {
            scheduledRunnable.a(delayTime <= 0 ? this.f211836a.submit((Callable) scheduledRunnable) : this.f211836a.schedule((Callable) scheduledRunnable, delayTime, unit));
            return scheduledRunnable;
        } catch (RejectedExecutionException e10) {
            if (parent != null) {
                parent.c(scheduledRunnable);
            }
            Ic.a.Y(e10);
            return scheduledRunnable;
        }
    }

    public io.reactivex.rxjava3.disposables.d f(final Runnable run, long delayTime, TimeUnit unit) {
        ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(Ic.a.b0(run));
        try {
            scheduledDirectTask.a(delayTime <= 0 ? this.f211836a.submit(scheduledDirectTask) : this.f211836a.schedule(scheduledDirectTask, delayTime, unit));
            return scheduledDirectTask;
        } catch (RejectedExecutionException e10) {
            Ic.a.Y(e10);
            return EmptyDisposable.INSTANCE;
        }
    }

    public io.reactivex.rxjava3.disposables.d g(Runnable run, long initialDelay, long period, TimeUnit unit) {
        Runnable runnableB0 = Ic.a.b0(run);
        if (period <= 0) {
            d dVar = new d(runnableB0, this.f211836a);
            try {
                dVar.b(initialDelay <= 0 ? this.f211836a.submit(dVar) : this.f211836a.schedule(dVar, initialDelay, unit));
                return dVar;
            } catch (RejectedExecutionException e10) {
                Ic.a.Y(e10);
                return EmptyDisposable.INSTANCE;
            }
        }
        ScheduledDirectPeriodicTask scheduledDirectPeriodicTask = new ScheduledDirectPeriodicTask(runnableB0);
        try {
            scheduledDirectPeriodicTask.a(this.f211836a.scheduleAtFixedRate(scheduledDirectPeriodicTask, initialDelay, period, unit));
            return scheduledDirectPeriodicTask;
        } catch (RejectedExecutionException e11) {
            Ic.a.Y(e11);
            return EmptyDisposable.INSTANCE;
        }
    }

    public void h() {
        if (this.f211837b) {
            return;
        }
        this.f211837b = true;
        this.f211836a.shutdown();
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public boolean isDisposed() {
        return this.f211837b;
    }
}
