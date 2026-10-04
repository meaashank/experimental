package qc;

import io.reactivex.internal.observers.InnerQueuedObserver;

/* JADX INFO: loaded from: classes7.dex */
public interface j<T> {
    void a(InnerQueuedObserver<T> innerQueuedObserver, Throwable th);

    void b(InnerQueuedObserver<T> innerQueuedObserver);

    void c(InnerQueuedObserver<T> innerQueuedObserver, T t10);

    void d();
}
