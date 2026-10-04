package io.reactivex.internal.subscriptions;

import java.util.concurrent.atomic.AtomicInteger;
import pc.l;

/* JADX INFO: loaded from: classes7.dex */
public abstract class BasicIntQueueSubscription<T> extends AtomicInteger implements l<T> {
    private static final long serialVersionUID = -6671519529404341862L;

    @Override // pc.o
    public final boolean offer(T t10) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // pc.o
    public final boolean offer(T t10, T t11) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
