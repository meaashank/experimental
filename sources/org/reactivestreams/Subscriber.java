package org.reactivestreams;

/* JADX INFO: loaded from: classes8.dex */
public interface Subscriber<T> {
    void onComplete();

    void onError(Throwable th);

    void onNext(T t10);

    void onSubscribe(Subscription subscription);
}
