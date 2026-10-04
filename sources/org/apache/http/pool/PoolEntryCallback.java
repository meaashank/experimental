package org.apache.http.pool;

/* JADX INFO: loaded from: classes6.dex */
public interface PoolEntryCallback<T, C> {
    void process(PoolEntry<T, C> poolEntry);
}
