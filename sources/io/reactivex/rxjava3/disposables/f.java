package io.reactivex.rxjava3.disposables;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference<d> f207346a;

    public f() {
        this.f207346a = new AtomicReference<>();
    }

    @yc.f
    public d a() {
        d dVar = this.f207346a.get();
        return dVar == DisposableHelper.DISPOSED ? EmptyDisposable.INSTANCE : dVar;
    }

    public boolean b(@yc.f d next) {
        return DisposableHelper.replace(this.f207346a, next);
    }

    public boolean c(@yc.f d next) {
        return DisposableHelper.set(this.f207346a, next);
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public void dispose() {
        DisposableHelper.dispose(this.f207346a);
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(this.f207346a.get());
    }

    public f(@yc.f d initialDisposable) {
        this.f207346a = new AtomicReference<>(initialDisposable);
    }
}
