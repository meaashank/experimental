package org.apache.http.pool;

import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public interface ConnFactory<T, C> {
    C create(T t10) throws IOException;
}
