package io.reactivex.rxjava3.internal.schedulers;

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

    @Override // io.reactivex.rxjava3.internal.schedulers.AbstractDirectTask, Jc.a
    public Runnable d() {
        return this.f211724a;
    }

    public Void g() {
        this.f211725b = Thread.currentThread();
        try {
            this.f211724a.run();
            return null;
        } finally {
            lazySet(AbstractDirectTask.f211722c);
            this.f211725b = null;
        }
    }
}
