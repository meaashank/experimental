package io.reactivex.rxjava3.internal.subscriptions;

import Dc.n;
import org.reactivestreams.Subscriber;
import yc.f;

/* JADX INFO: loaded from: classes7.dex */
public enum EmptySubscription implements n<Object> {
    INSTANCE;

    public static void complete(Subscriber<?> s10) {
        s10.onSubscribe(INSTANCE);
        s10.onComplete();
    }

    public static void error(Throwable e10, Subscriber<?> s10) {
        s10.onSubscribe(INSTANCE);
        s10.onError(e10);
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
    }

    @Override // Dc.q
    public void clear() {
    }

    @Override // Dc.q
    public boolean isEmpty() {
        return true;
    }

    @Override // Dc.q
    public boolean offer(Object value) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // Dc.q
    @f
    public Object poll() {
        return null;
    }

    @Override // org.reactivestreams.Subscription
    public void request(long n10) {
        SubscriptionHelper.validate(n10);
    }

    @Override // Dc.m
    public int requestFusion(int mode) {
        return mode & 2;
    }

    @Override // java.lang.Enum
    public String toString() {
        return "EmptySubscription";
    }

    @Override // Dc.q
    public boolean offer(Object v12, Object v22) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
