package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicReference;
import zc.V;

/* JADX INFO: loaded from: classes7.dex */
public abstract class E<T> extends CompletableFuture<T> implements V<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference<io.reactivex.rxjava3.disposables.d> f207400a = new AtomicReference<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public T f207401b;

    public final void a() {
        this.f207401b = null;
        this.f207400a.lazySet(DisposableHelper.DISPOSED);
    }

    public final void b() {
        DisposableHelper.dispose(this.f207400a);
    }

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
    public final boolean cancel(boolean mayInterruptIfRunning) {
        b();
        return super.cancel(mayInterruptIfRunning);
    }

    @Override // java.util.concurrent.CompletableFuture
    public final boolean complete(T value) {
        b();
        return super.complete(value);
    }

    @Override // java.util.concurrent.CompletableFuture
    public final boolean completeExceptionally(Throwable ex) {
        b();
        return super.completeExceptionally(ex);
    }

    @Override // zc.V
    public final void onError(Throwable t10) {
        a();
        if (completeExceptionally(t10)) {
            return;
        }
        Ic.a.Y(t10);
    }

    @Override // zc.V
    public final void onSubscribe(@yc.e io.reactivex.rxjava3.disposables.d d10) {
        DisposableHelper.setOnce(this.f207400a, d10);
    }
}
