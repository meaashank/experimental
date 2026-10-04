package Fc;

import io.reactivex.rxjava3.internal.subscribers.InnerQueuedSubscriber;

/* JADX INFO: loaded from: classes7.dex */
public interface g<T> {
    void a(InnerQueuedSubscriber<T> inner, T value);

    void b(InnerQueuedSubscriber<T> inner);

    void c(InnerQueuedSubscriber<T> inner, Throwable e10);

    void d();
}
