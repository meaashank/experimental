package io.reactivex.rxjava3.observers;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import zc.V;

/* JADX INFO: loaded from: classes7.dex */
public abstract class b<T> implements V<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public io.reactivex.rxjava3.disposables.d f211968a;

    public final void a() {
        io.reactivex.rxjava3.disposables.d dVar = this.f211968a;
        this.f211968a = DisposableHelper.DISPOSED;
        dVar.dispose();
    }

    public void b() {
    }

    @Override // zc.V
    public final void onSubscribe(@yc.e io.reactivex.rxjava3.disposables.d d10) {
        if (io.reactivex.rxjava3.internal.util.f.e(this.f211968a, d10, getClass())) {
            this.f211968a = d10;
        }
    }
}
