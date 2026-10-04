package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.disposables.d;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;
import zc.V;

/* JADX INFO: loaded from: classes7.dex */
public final class BlockingObserver<T> extends AtomicReference<d> implements V<T>, d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f207579b = new Object();
    private static final long serialVersionUID = -4875965440900746268L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Queue<Object> f207580a;

    public BlockingObserver(Queue<Object> queue) {
        this.f207580a = queue;
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public void dispose() {
        if (DisposableHelper.dispose(this)) {
            this.f207580a.offer(f207579b);
        }
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public boolean isDisposed() {
        return get() == DisposableHelper.DISPOSED;
    }

    @Override // zc.V
    public void onComplete() {
        this.f207580a.offer(NotificationLite.complete());
    }

    @Override // zc.V
    public void onError(Throwable t10) {
        this.f207580a.offer(NotificationLite.error(t10));
    }

    @Override // zc.V
    public void onNext(T t10) {
        this.f207580a.offer(NotificationLite.next(t10));
    }

    @Override // zc.V
    public void onSubscribe(d d10) {
        DisposableHelper.setOnce(this, d10);
    }
}
