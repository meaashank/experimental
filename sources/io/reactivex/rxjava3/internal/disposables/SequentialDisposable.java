package io.reactivex.rxjava3.internal.disposables;

import io.reactivex.rxjava3.disposables.d;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class SequentialDisposable extends AtomicReference<d> implements d {
    private static final long serialVersionUID = -754898800686245608L;

    public SequentialDisposable() {
    }

    public boolean a(d next) {
        return DisposableHelper.replace(this, next);
    }

    public boolean b(d next) {
        return DisposableHelper.set(this, next);
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(get());
    }

    public SequentialDisposable(d initial) {
        lazySet(initial);
    }
}
