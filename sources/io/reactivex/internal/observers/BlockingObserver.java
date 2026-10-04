package io.reactivex.internal.observers;

import hc.G;
import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class BlockingObserver<T> extends AtomicReference<b> implements G<T>, b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f202990b = new Object();
    private static final long serialVersionUID = -4875965440900746268L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Queue<Object> f202991a;

    public BlockingObserver(Queue<Object> queue) {
        this.f202991a = queue;
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
        if (DisposableHelper.dispose(this)) {
            this.f202991a.offer(f202990b);
        }
    }

    @Override // io.reactivex.disposables.b
    public boolean isDisposed() {
        return get() == DisposableHelper.DISPOSED;
    }

    @Override // hc.G
    public void onComplete() {
        this.f202991a.offer(NotificationLite.complete());
    }

    @Override // hc.G
    public void onError(Throwable th) {
        this.f202991a.offer(NotificationLite.error(th));
    }

    @Override // hc.G
    public void onNext(T t10) {
        this.f202991a.offer(NotificationLite.next(t10));
    }

    @Override // hc.G
    public void onSubscribe(b bVar) {
        DisposableHelper.setOnce(this, bVar);
    }
}
