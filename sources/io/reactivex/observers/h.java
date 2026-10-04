package io.reactivex.observers;

import hc.t;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import oc.C5348b;

/* JADX INFO: loaded from: classes7.dex */
public abstract class h<T> implements t<T>, io.reactivex.disposables.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference<io.reactivex.disposables.b> f207229a = new AtomicReference<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5348b f207230b = new C5348b();

    public final void a(@lc.e io.reactivex.disposables.b bVar) {
        io.reactivex.internal.functions.a.g(bVar, "resource is null");
        this.f207230b.c(bVar);
    }

    public void b() {
    }

    @Override // io.reactivex.disposables.b
    public final void dispose() {
        if (DisposableHelper.dispose(this.f207229a)) {
            this.f207230b.dispose();
        }
    }

    @Override // io.reactivex.disposables.b
    public final boolean isDisposed() {
        return DisposableHelper.isDisposed(this.f207229a.get());
    }

    @Override // hc.t
    public final void onSubscribe(@lc.e io.reactivex.disposables.b bVar) {
        io.reactivex.internal.util.f.c(this.f207229a, bVar, getClass());
    }
}
