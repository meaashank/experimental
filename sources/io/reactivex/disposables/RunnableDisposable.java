package io.reactivex.disposables;

import U6.j;
import lc.e;

/* JADX INFO: loaded from: classes7.dex */
final class RunnableDisposable extends ReferenceDisposable<Runnable> {
    private static final long serialVersionUID = -8219729196779211169L;

    public RunnableDisposable(Runnable runnable) {
        super(runnable);
    }

    @Override // io.reactivex.disposables.ReferenceDisposable
    public void a(@e Runnable runnable) {
        runnable.run();
    }

    public void b(@e Runnable runnable) {
        runnable.run();
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        return "RunnableDisposable(disposed=" + isDisposed() + j.f68738d + get() + ")";
    }
}
