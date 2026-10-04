package rc;

import io.reactivex.internal.subscribers.InnerQueuedSubscriber;

/* JADX INFO: loaded from: classes7.dex */
public interface g<T> {
    void a(InnerQueuedSubscriber<T> innerQueuedSubscriber);

    void b(InnerQueuedSubscriber<T> innerQueuedSubscriber, Throwable th);

    void c(InnerQueuedSubscriber<T> innerQueuedSubscriber, T t10);

    void d();
}
