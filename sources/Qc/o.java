package qc;

import hc.L;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class o<T> implements L<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference<io.reactivex.disposables.b> f227103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final L<? super T> f227104b;

    public o(AtomicReference<io.reactivex.disposables.b> atomicReference, L<? super T> l10) {
        this.f227103a = atomicReference;
        this.f227104b = l10;
    }

    @Override // hc.L
    public void onError(Throwable th) {
        this.f227104b.onError(th);
    }

    @Override // hc.L
    public void onSubscribe(io.reactivex.disposables.b bVar) {
        DisposableHelper.replace(this.f227103a, bVar);
    }

    @Override // hc.L
    public void onSuccess(T t10) {
        this.f227104b.onSuccess(t10);
    }
}
