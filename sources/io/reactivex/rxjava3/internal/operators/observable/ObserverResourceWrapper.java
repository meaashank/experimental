package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class ObserverResourceWrapper<T> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements zc.V<T>, io.reactivex.rxjava3.disposables.d {
    private static final long serialVersionUID = -8612022020200669122L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zc.V<? super T> f210921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference<io.reactivex.rxjava3.disposables.d> f210922b = new AtomicReference<>();

    public ObserverResourceWrapper(zc.V<? super T> downstream) {
        this.f210921a = downstream;
    }

    public void a(io.reactivex.rxjava3.disposables.d resource) {
        DisposableHelper.set(this, resource);
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public void dispose() {
        DisposableHelper.dispose(this.f210922b);
        DisposableHelper.dispose(this);
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public boolean isDisposed() {
        return this.f210922b.get() == DisposableHelper.DISPOSED;
    }

    @Override // zc.V
    public void onComplete() {
        dispose();
        this.f210921a.onComplete();
    }

    @Override // zc.V
    public void onError(Throwable t10) {
        dispose();
        this.f210921a.onError(t10);
    }

    @Override // zc.V
    public void onNext(T t10) {
        this.f210921a.onNext(t10);
    }

    @Override // zc.V
    public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
        if (DisposableHelper.setOnce(this.f210922b, d10)) {
            this.f210921a.onSubscribe(this);
        }
    }
}
