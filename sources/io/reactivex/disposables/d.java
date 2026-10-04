package io.reactivex.disposables;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.atomic.AtomicReference;
import lc.f;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference<b> f202940a;

    public d() {
        this.f202940a = new AtomicReference<>();
    }

    @f
    public b a() {
        b bVar = this.f202940a.get();
        return bVar == DisposableHelper.DISPOSED ? EmptyDisposable.INSTANCE : bVar;
    }

    public boolean b(@f b bVar) {
        return DisposableHelper.replace(this.f202940a, bVar);
    }

    public boolean c(@f b bVar) {
        return DisposableHelper.set(this.f202940a, bVar);
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
        DisposableHelper.dispose(this.f202940a);
    }

    @Override // io.reactivex.disposables.b
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(this.f202940a.get());
    }

    public d(@f b bVar) {
        this.f202940a = new AtomicReference<>(bVar);
    }
}
