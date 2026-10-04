package io.reactivex.internal.observers;

import java.util.concurrent.atomic.AtomicInteger;
import pc.j;

/* JADX INFO: loaded from: classes7.dex */
public abstract class BasicIntQueueDisposable<T> extends AtomicInteger implements j<T> {
    private static final long serialVersionUID = -1001730202384742097L;

    @Override // pc.o
    public final boolean offer(T t10) {
        throw new UnsupportedOperationException("Should not be called");
    }

    @Override // pc.o
    public final boolean offer(T t10, T t11) {
        throw new UnsupportedOperationException("Should not be called");
    }
}
