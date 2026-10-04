package Ec;

import io.reactivex.rxjava3.internal.observers.InnerQueuedObserver;

/* JADX INFO: loaded from: classes7.dex */
public interface k<T> {
    void d();

    void e(InnerQueuedObserver<T> inner, T value);

    void f(InnerQueuedObserver<T> inner);

    void g(InnerQueuedObserver<T> inner, Throwable e10);
}
