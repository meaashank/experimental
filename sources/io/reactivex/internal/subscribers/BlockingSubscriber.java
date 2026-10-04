package io.reactivex.internal.subscribers;

import hc.InterfaceC4535o;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes7.dex */
public final class BlockingSubscriber<T> extends AtomicReference<Subscription> implements InterfaceC4535o<T>, Subscription {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f207119b = new Object();
    private static final long serialVersionUID = -4875965440900746268L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Queue<Object> f207120a;

    public BlockingSubscriber(Queue<Object> queue) {
        this.f207120a = queue;
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
        if (SubscriptionHelper.cancel(this)) {
            this.f207120a.offer(f207119b);
        }
    }

    public boolean d() {
        return get() == SubscriptionHelper.CANCELLED;
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        this.f207120a.offer(NotificationLite.complete());
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th) {
        this.f207120a.offer(NotificationLite.error(th));
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t10) {
        this.f207120a.offer(NotificationLite.next(t10));
    }

    @Override // hc.InterfaceC4535o, org.reactivestreams.Subscriber
    public void onSubscribe(Subscription subscription) {
        if (SubscriptionHelper.setOnce(this, subscription)) {
            this.f207120a.offer(NotificationLite.subscription(this));
        }
    }

    @Override // org.reactivestreams.Subscription
    public void request(long j10) {
        get().request(j10);
    }
}
