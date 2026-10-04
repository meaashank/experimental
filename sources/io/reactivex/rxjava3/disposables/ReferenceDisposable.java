package io.reactivex.rxjava3.disposables;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
abstract class ReferenceDisposable<T> extends AtomicReference<T> implements d {
    private static final long serialVersionUID = 6537757548749041217L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReferenceDisposable(T value) {
        super(value);
        Objects.requireNonNull(value, "value is null");
    }

    public abstract void a(@yc.e T value);

    @Override // io.reactivex.rxjava3.disposables.d
    public final void dispose() {
        T andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        a(andSet);
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final boolean isDisposed() {
        return get() == null;
    }
}
