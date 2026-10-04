package io.reactivex.internal.schedulers;

import hc.H;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import oc.InterfaceC5347a;
import uc.C5666a;

/* JADX INFO: loaded from: classes7.dex */
public class g extends H.c implements io.reactivex.disposables.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f207086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f207087b;

    public g(ThreadFactory threadFactory) {
        this.f207086a = j.a(threadFactory);
    }

    @Override // hc.H.c
    @lc.e
    public io.reactivex.disposables.b b(@lc.e Runnable runnable) {
        return c(runnable, 0L, null);
    }

    @Override // hc.H.c
    @lc.e
    public io.reactivex.disposables.b c(@lc.e Runnable runnable, long j10, @lc.e TimeUnit timeUnit) {
        return this.f207087b ? EmptyDisposable.INSTANCE : e(runnable, j10, timeUnit, null);
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
        if (this.f207087b) {
            return;
        }
        this.f207087b = true;
        this.f207086a.shutdownNow();
    }

    @lc.e
    public ScheduledRunnable e(Runnable runnable, long j10, @lc.e TimeUnit timeUnit, @lc.f InterfaceC5347a interfaceC5347a) {
        ScheduledRunnable scheduledRunnable = new ScheduledRunnable(C5666a.b0(runnable), interfaceC5347a);
        if (interfaceC5347a != null && !interfaceC5347a.c(scheduledRunnable)) {
            return scheduledRunnable;
        }
        try {
            scheduledRunnable.a(j10 <= 0 ? this.f207086a.submit((Callable) scheduledRunnable) : this.f207086a.schedule((Callable) scheduledRunnable, j10, timeUnit));
            return scheduledRunnable;
        } catch (RejectedExecutionException e10) {
            if (interfaceC5347a != null) {
                interfaceC5347a.a(scheduledRunnable);
            }
            C5666a.Y(e10);
            return scheduledRunnable;
        }
    }

    public io.reactivex.disposables.b f(Runnable runnable, long j10, TimeUnit timeUnit) {
        ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(C5666a.b0(runnable));
        try {
            scheduledDirectTask.a(j10 <= 0 ? this.f207086a.submit(scheduledDirectTask) : this.f207086a.schedule(scheduledDirectTask, j10, timeUnit));
            return scheduledDirectTask;
        } catch (RejectedExecutionException e10) {
            C5666a.Y(e10);
            return EmptyDisposable.INSTANCE;
        }
    }

    public io.reactivex.disposables.b g(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        Runnable runnableB0 = C5666a.b0(runnable);
        if (j11 <= 0) {
            d dVar = new d(runnableB0, this.f207086a);
            try {
                dVar.b(j10 <= 0 ? this.f207086a.submit(dVar) : this.f207086a.schedule(dVar, j10, timeUnit));
                return dVar;
            } catch (RejectedExecutionException e10) {
                C5666a.Y(e10);
                return EmptyDisposable.INSTANCE;
            }
        }
        ScheduledDirectPeriodicTask scheduledDirectPeriodicTask = new ScheduledDirectPeriodicTask(runnableB0);
        try {
            scheduledDirectPeriodicTask.a(this.f207086a.scheduleAtFixedRate(scheduledDirectPeriodicTask, j10, j11, timeUnit));
            return scheduledDirectPeriodicTask;
        } catch (RejectedExecutionException e11) {
            C5666a.Y(e11);
            return EmptyDisposable.INSTANCE;
        }
    }

    public void h() {
        if (this.f207087b) {
            return;
        }
        this.f207087b = true;
        this.f207086a.shutdown();
    }

    @Override // io.reactivex.disposables.b
    public boolean isDisposed() {
        return this.f207087b;
    }
}
