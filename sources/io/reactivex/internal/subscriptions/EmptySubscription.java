package io.reactivex.internal.subscriptions;

import lc.f;
import org.reactivestreams.Subscriber;
import pc.l;

/* JADX INFO: loaded from: classes7.dex */
public enum EmptySubscription implements l<Object> {
    INSTANCE;

    public static void complete(Subscriber<?> subscriber) {
        subscriber.onSubscribe(INSTANCE);
        subscriber.onComplete();
    }

    public static void error(Throwable th, Subscriber<?> subscriber) {
        subscriber.onSubscribe(INSTANCE);
        subscriber.onError(th);
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
    }

    @Override // pc.o
    public void clear() {
    }

    @Override // pc.o
    public boolean isEmpty() {
        return true;
    }

    @Override // pc.o
    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // pc.o
    @f
    public Object poll() {
        return null;
    }

    @Override // org.reactivestreams.Subscription
    public void request(long j10) {
        SubscriptionHelper.validate(j10);
    }

    @Override // pc.k
    public int requestFusion(int i10) {
        return i10 & 2;
    }

    @Override // java.lang.Enum
    public String toString() {
        return "EmptySubscription";
    }

    @Override // pc.o
    public boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
