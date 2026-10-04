package io.reactivex.internal.subscribers;

import androidx.collection.Q;
import hc.InterfaceC4535o;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.g;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes7.dex */
public class StrictSubscriber<T> extends AtomicInteger implements InterfaceC4535o<T>, Subscription {
    private static final long serialVersionUID = -4945028590049415624L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Subscriber<? super T> f207151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicThrowable f207152b = new AtomicThrowable();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicLong f207153c = new AtomicLong();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference<Subscription> f207154d = new AtomicReference<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f207155e = new AtomicBoolean();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f207156f;

    public StrictSubscriber(Subscriber<? super T> subscriber) {
        this.f207151a = subscriber;
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
        if (this.f207156f) {
            return;
        }
        SubscriptionHelper.cancel(this.f207154d);
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        this.f207156f = true;
        g.b(this.f207151a, this, this.f207152b);
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th) {
        this.f207156f = true;
        g.d(this.f207151a, th, this, this.f207152b);
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t10) {
        g.f(this.f207151a, t10, this, this.f207152b);
    }

    @Override // hc.InterfaceC4535o, org.reactivestreams.Subscriber
    public void onSubscribe(Subscription subscription) {
        if (this.f207155e.compareAndSet(false, true)) {
            this.f207151a.onSubscribe(this);
            SubscriptionHelper.deferredSetOnce(this.f207154d, this.f207153c, subscription);
        } else {
            subscription.cancel();
            cancel();
            onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
        }
    }

    @Override // org.reactivestreams.Subscription
    public void request(long j10) {
        if (j10 > 0) {
            SubscriptionHelper.deferredRequest(this.f207154d, this.f207153c, j10);
        } else {
            cancel();
            onError(new IllegalArgumentException(Q.a("§3.9 violated: positive request amount required but it was ", j10)));
        }
    }
}
