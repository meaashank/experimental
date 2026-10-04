package org.apache.commons.lang3.concurrent;

/* JADX INFO: loaded from: classes6.dex */
public abstract class LazyInitializer<T> implements ConcurrentInitializer<T> {
    private volatile T object;

    @Override // org.apache.commons.lang3.concurrent.ConcurrentInitializer
    public T get() throws ConcurrentException {
        T tInitialize;
        T t10 = this.object;
        if (t10 != null) {
            return t10;
        }
        synchronized (this) {
            try {
                tInitialize = this.object;
                if (tInitialize == null) {
                    tInitialize = initialize();
                    this.object = tInitialize;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return tInitialize;
    }

    public abstract T initialize() throws ConcurrentException;
}
