package org.apache.http.pool;

import java.util.concurrent.Future;
import org.apache.http.concurrent.FutureCallback;

/* JADX INFO: loaded from: classes6.dex */
public interface ConnPool<T, E> {
    Future<E> lease(T t10, Object obj, FutureCallback<E> futureCallback);

    void release(E e10, boolean z10);
}
