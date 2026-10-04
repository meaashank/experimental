package io.reactivex.rxjava3.internal.subscriptions;

import Dc.n;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes7.dex */
public abstract class BasicQueueSubscription<T> extends AtomicLong implements n<T> {
    private static final long serialVersionUID = -6671519529404341862L;

    @Override // Dc.q
    public final boolean offer(T e10) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // Dc.q
    public final boolean offer(T v12, T v22) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
