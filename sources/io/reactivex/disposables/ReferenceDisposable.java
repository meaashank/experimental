package io.reactivex.disposables;

import java.util.concurrent.atomic.AtomicReference;
import lc.e;

/* JADX INFO: loaded from: classes7.dex */
abstract class ReferenceDisposable<T> extends AtomicReference<T> implements b {
    private static final long serialVersionUID = 6537757548749041217L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReferenceDisposable(T t10) {
        super(t10);
        io.reactivex.internal.functions.a.g(t10, "value is null");
    }

    public abstract void a(@e T t10);

    @Override // io.reactivex.disposables.b
    public final void dispose() {
        T andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        a(andSet);
    }

    @Override // io.reactivex.disposables.b
    public final boolean isDisposed() {
        return get() == null;
    }
}
