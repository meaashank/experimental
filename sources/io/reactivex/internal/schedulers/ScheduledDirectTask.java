package io.reactivex.internal.schedulers;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes7.dex */
public final class ScheduledDirectTask extends AbstractDirectTask implements Callable<Void> {
    private static final long serialVersionUID = 1811839108042568751L;

    public ScheduledDirectTask(Runnable runnable) {
        super(runnable);
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Void call() throws Exception {
        g();
        return null;
    }

    @Override // io.reactivex.internal.schedulers.AbstractDirectTask, Kc.a
    public Runnable d() {
        return this.f206988a;
    }

    public Void g() throws Exception {
        this.f206989b = Thread.currentThread();
        try {
            this.f206988a.run();
            return null;
        } finally {
            lazySet(AbstractDirectTask.f206986c);
            this.f206989b = null;
        }
    }
}
