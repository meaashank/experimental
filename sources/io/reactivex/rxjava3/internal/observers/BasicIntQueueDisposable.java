package io.reactivex.rxjava3.internal.observers;

import Dc.l;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public abstract class BasicIntQueueDisposable<T> extends AtomicInteger implements l<T> {
    private static final long serialVersionUID = -1001730202384742097L;

    @Override // Dc.q
    public final boolean offer(T e10) {
        throw new UnsupportedOperationException("Should not be called");
    }

    @Override // Dc.q
    public final boolean offer(T v12, T v22) {
        throw new UnsupportedOperationException("Should not be called");
    }
}
