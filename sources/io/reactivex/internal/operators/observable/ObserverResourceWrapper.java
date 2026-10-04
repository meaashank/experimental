package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class ObserverResourceWrapper<T> extends AtomicReference<io.reactivex.disposables.b> implements hc.G<T>, io.reactivex.disposables.b {
    private static final long serialVersionUID = -8612022020200669122L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hc.G<? super T> f206173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference<io.reactivex.disposables.b> f206174b = new AtomicReference<>();

    public ObserverResourceWrapper(hc.G<? super T> g10) {
        this.f206173a = g10;
    }

    public void a(io.reactivex.disposables.b bVar) {
        DisposableHelper.set(this, bVar);
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
        DisposableHelper.dispose(this.f206174b);
        DisposableHelper.dispose(this);
    }

    @Override // io.reactivex.disposables.b
    public boolean isDisposed() {
        return this.f206174b.get() == DisposableHelper.DISPOSED;
    }

    @Override // hc.G
    public void onComplete() {
        dispose();
        this.f206173a.onComplete();
    }

    @Override // hc.G
    public void onError(Throwable th) {
        dispose();
        this.f206173a.onError(th);
    }

    @Override // hc.G
    public void onNext(T t10) {
        this.f206173a.onNext(t10);
    }

    @Override // hc.G
    public void onSubscribe(io.reactivex.disposables.b bVar) {
        if (DisposableHelper.setOnce(this.f206174b, bVar)) {
            this.f206173a.onSubscribe(this);
        }
    }
}
