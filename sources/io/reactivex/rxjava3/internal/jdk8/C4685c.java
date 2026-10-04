package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.NoSuchElementException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicReference;
import zc.InterfaceC5888e;
import zc.a0;

/* JADX INFO: renamed from: io.reactivex.rxjava3.internal.jdk8.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4685c<T> extends CompletableFuture<T> implements zc.F<T>, a0<T>, InterfaceC5888e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference<io.reactivex.rxjava3.disposables.d> f207530a = new AtomicReference<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f207531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final T f207532c;

    public C4685c(boolean hasDefault, T defaultItem) {
        this.f207531b = hasDefault;
        this.f207532c = defaultItem;
    }

    public void a() {
        DisposableHelper.dispose(this.f207530a);
    }

    public void b() {
        this.f207530a.lazySet(DisposableHelper.DISPOSED);
    }

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
    public boolean cancel(boolean mayInterruptIfRunning) {
        a();
        return super.cancel(mayInterruptIfRunning);
    }

    @Override // java.util.concurrent.CompletableFuture
    public boolean complete(T value) {
        a();
        return super.complete(value);
    }

    @Override // java.util.concurrent.CompletableFuture
    public boolean completeExceptionally(Throwable ex) {
        a();
        return super.completeExceptionally(ex);
    }

    @Override // zc.F, zc.InterfaceC5888e
    public void onComplete() {
        if (this.f207531b) {
            complete(this.f207532c);
        } else {
            completeExceptionally(new NoSuchElementException("The source was empty"));
        }
    }

    @Override // zc.F, zc.a0, zc.InterfaceC5888e
    public void onError(Throwable t10) {
        b();
        if (completeExceptionally(t10)) {
            return;
        }
        Ic.a.Y(t10);
    }

    @Override // zc.F, zc.a0, zc.InterfaceC5888e
    public void onSubscribe(@yc.e io.reactivex.rxjava3.disposables.d d10) {
        DisposableHelper.setOnce(this.f207530a, d10);
    }

    @Override // zc.F, zc.a0
    public void onSuccess(@yc.e T t10) {
        b();
        complete(t10);
    }
}
