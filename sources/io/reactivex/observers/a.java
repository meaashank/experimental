package io.reactivex.observers;

import hc.G;
import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a<T> implements G<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public io.reactivex.disposables.b f207222a;

    public final void a() {
        io.reactivex.disposables.b bVar = this.f207222a;
        this.f207222a = DisposableHelper.DISPOSED;
        bVar.dispose();
    }

    public void b() {
    }

    @Override // hc.G
    public final void onSubscribe(@lc.e io.reactivex.disposables.b bVar) {
        if (io.reactivex.internal.util.f.e(this.f207222a, bVar, getClass())) {
            this.f207222a = bVar;
        }
    }
}
