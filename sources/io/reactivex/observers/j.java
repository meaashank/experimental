package io.reactivex.observers;

import hc.L;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import oc.C5348b;

/* JADX INFO: loaded from: classes7.dex */
public abstract class j<T> implements L<T>, io.reactivex.disposables.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference<io.reactivex.disposables.b> f207233a = new AtomicReference<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5348b f207234b = new C5348b();

    public final void a(@lc.e io.reactivex.disposables.b bVar) {
        io.reactivex.internal.functions.a.g(bVar, "resource is null");
        this.f207234b.c(bVar);
    }

    public void b() {
    }

    @Override // io.reactivex.disposables.b
    public final void dispose() {
        if (DisposableHelper.dispose(this.f207233a)) {
            this.f207234b.dispose();
        }
    }

    @Override // io.reactivex.disposables.b
    public final boolean isDisposed() {
        return DisposableHelper.isDisposed(this.f207233a.get());
    }

    @Override // hc.L
    public final void onSubscribe(@lc.e io.reactivex.disposables.b bVar) {
        io.reactivex.internal.util.f.c(this.f207233a, bVar, getClass());
    }
}
