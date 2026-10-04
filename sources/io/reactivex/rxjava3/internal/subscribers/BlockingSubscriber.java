package io.reactivex.rxjava3.internal.subscribers;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;
import zc.InterfaceC5907y;

/* JADX INFO: loaded from: classes7.dex */
public final class BlockingSubscriber<T> extends AtomicReference<Subscription> implements InterfaceC5907y<T>, Subscription {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f211867b = new Object();
    private static final long serialVersionUID = -4875965440900746268L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Queue<Object> f211868a;

    public BlockingSubscriber(Queue<Object> queue) {
        this.f211868a = queue;
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
        if (SubscriptionHelper.cancel(this)) {
            this.f211868a.offer(f211867b);
        }
    }

    public boolean d() {
        return get() == SubscriptionHelper.CANCELLED;
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        this.f211868a.offer(NotificationLite.complete());
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable t10) {
        this.f211868a.offer(NotificationLite.error(t10));
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t10) {
        this.f211868a.offer(NotificationLite.next(t10));
    }

    @Override // zc.InterfaceC5907y, org.reactivestreams.Subscriber
    public void onSubscribe(Subscription s10) {
        if (SubscriptionHelper.setOnce(this, s10)) {
            this.f211868a.offer(NotificationLite.subscription(this));
        }
    }

    @Override // org.reactivestreams.Subscription
    public void request(long n10) {
        get().request(n10);
    }
}
