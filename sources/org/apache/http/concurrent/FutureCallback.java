package org.apache.http.concurrent;

/* JADX INFO: loaded from: classes6.dex */
public interface FutureCallback<T> {
    void cancelled();

    void completed(T t10);

    void failed(Exception exc);
}
