package io.reactivex.rxjava3.internal.schedulers;

/* JADX INFO: loaded from: classes7.dex */
public final class ScheduledDirectPeriodicTask extends AbstractDirectTask implements Runnable {
    private static final long serialVersionUID = 1811839108042568751L;

    public ScheduledDirectPeriodicTask(Runnable runnable) {
        super(runnable);
    }

    @Override // io.reactivex.rxjava3.internal.schedulers.AbstractDirectTask, Jc.a
    public Runnable d() {
        return this.f211724a;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f211725b = Thread.currentThread();
        try {
            this.f211724a.run();
            this.f211725b = null;
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            this.f211725b = null;
            lazySet(AbstractDirectTask.f211722c);
            Ic.a.Y(th);
        }
    }
}
