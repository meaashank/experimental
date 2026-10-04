package io.reactivex.rxjava3.disposables;

import U6.j;

/* JADX INFO: loaded from: classes7.dex */
final class RunnableDisposable extends ReferenceDisposable<Runnable> {
    private static final long serialVersionUID = -8219729196779211169L;

    public RunnableDisposable(Runnable value) {
        super(value);
    }

    @Override // io.reactivex.rxjava3.disposables.ReferenceDisposable
    public void a(@yc.e Runnable value) {
        value.run();
    }

    public void b(@yc.e Runnable value) {
        value.run();
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        return "RunnableDisposable(disposed=" + isDisposed() + j.f68738d + get() + ")";
    }
}
