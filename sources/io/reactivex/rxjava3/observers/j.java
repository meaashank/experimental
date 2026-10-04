package io.reactivex.rxjava3.observers;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import zc.V;

/* JADX INFO: loaded from: classes7.dex */
public abstract class j<T> implements V<T>, io.reactivex.rxjava3.disposables.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference<io.reactivex.rxjava3.disposables.d> f211977a = new AtomicReference<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Cc.a f211978b = new Cc.a();

    public final void a(@yc.e io.reactivex.rxjava3.disposables.d resource) {
        Objects.requireNonNull(resource, "resource is null");
        this.f211978b.a(resource);
    }

    public void b() {
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final void dispose() {
        if (DisposableHelper.dispose(this.f211977a)) {
            this.f211978b.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final boolean isDisposed() {
        return DisposableHelper.isDisposed(this.f211977a.get());
    }

    @Override // zc.V
    public final void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
        io.reactivex.rxjava3.internal.util.f.c(this.f211977a, d10, getClass());
    }
}
