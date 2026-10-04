package io.reactivex.observers;

import hc.G;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import oc.C5348b;

/* JADX INFO: loaded from: classes7.dex */
public abstract class i<T> implements G<T>, io.reactivex.disposables.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference<io.reactivex.disposables.b> f207231a = new AtomicReference<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5348b f207232b = new C5348b();

    public final void a(@lc.e io.reactivex.disposables.b bVar) {
        io.reactivex.internal.functions.a.g(bVar, "resource is null");
        this.f207232b.c(bVar);
    }

    public void b() {
    }

    @Override // io.reactivex.disposables.b
    public final void dispose() {
        if (DisposableHelper.dispose(this.f207231a)) {
            this.f207232b.dispose();
        }
    }

    @Override // io.reactivex.disposables.b
    public final boolean isDisposed() {
        return DisposableHelper.isDisposed(this.f207231a.get());
    }

    @Override // hc.G
    public final void onSubscribe(io.reactivex.disposables.b bVar) {
        io.reactivex.internal.util.f.c(this.f207231a, bVar, getClass());
    }
}
