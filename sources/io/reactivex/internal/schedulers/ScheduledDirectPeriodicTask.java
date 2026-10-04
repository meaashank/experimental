package io.reactivex.internal.schedulers;

import uc.C5666a;

/* JADX INFO: loaded from: classes7.dex */
public final class ScheduledDirectPeriodicTask extends AbstractDirectTask implements Runnable {
    private static final long serialVersionUID = 1811839108042568751L;

    public ScheduledDirectPeriodicTask(Runnable runnable) {
        super(runnable);
    }

    @Override // io.reactivex.internal.schedulers.AbstractDirectTask, Kc.a
    public Runnable d() {
        return this.f206988a;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f206989b = Thread.currentThread();
        try {
            this.f206988a.run();
            this.f206989b = null;
        } catch (Throwable th) {
            this.f206989b = null;
            lazySet(AbstractDirectTask.f206986c);
            C5666a.Y(th);
        }
    }
}
