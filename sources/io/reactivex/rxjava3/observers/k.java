package io.reactivex.rxjava3.observers;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import zc.a0;

/* JADX INFO: loaded from: classes7.dex */
public abstract class k<T> implements a0<T>, io.reactivex.rxjava3.disposables.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference<io.reactivex.rxjava3.disposables.d> f211979a = new AtomicReference<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Cc.a f211980b = new Cc.a();

    public final void a(@yc.e io.reactivex.rxjava3.disposables.d resource) {
        Objects.requireNonNull(resource, "resource is null");
        this.f211980b.a(resource);
    }

    public void b() {
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final void dispose() {
        if (DisposableHelper.dispose(this.f211979a)) {
            this.f211980b.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final boolean isDisposed() {
        return DisposableHelper.isDisposed(this.f211979a.get());
    }

    @Override // zc.a0, zc.InterfaceC5888e
    public final void onSubscribe(@yc.e io.reactivex.rxjava3.disposables.d d10) {
        io.reactivex.rxjava3.internal.util.f.c(this.f211979a, d10, getClass());
    }
}
