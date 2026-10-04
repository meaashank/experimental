package org.apache.commons.lang3.concurrent;

import androidx.compose.animation.core.C1598m0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public abstract class AtomicInitializer<T> implements ConcurrentInitializer<T> {
    private final AtomicReference<T> reference = new AtomicReference<>();

    @Override // org.apache.commons.lang3.concurrent.ConcurrentInitializer
    public T get() throws ConcurrentException {
        T t10 = this.reference.get();
        if (t10 != null) {
            return t10;
        }
        T tInitialize = initialize();
        return !C1598m0.a(this.reference, null, tInitialize) ? this.reference.get() : tInitialize;
    }

    public abstract T initialize() throws ConcurrentException;
}
