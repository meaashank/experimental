package io.reactivex.rxjava3.internal.subscribers;

import androidx.collection.Q;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.g;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import zc.InterfaceC5907y;

/* JADX INFO: loaded from: classes7.dex */
public class StrictSubscriber<T> extends AtomicInteger implements InterfaceC5907y<T>, Subscription {
    private static final long serialVersionUID = -4945028590049415624L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Subscriber<? super T> f211899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicThrowable f211900b = new AtomicThrowable();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicLong f211901c = new AtomicLong();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference<Subscription> f211902d = new AtomicReference<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f211903e = new AtomicBoolean();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f211904f;

    public StrictSubscriber(Subscriber<? super T> downstream) {
        this.f211899a = downstream;
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
        if (this.f211904f) {
            return;
        }
        SubscriptionHelper.cancel(this.f211902d);
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        this.f211904f = true;
        g.a(this.f211899a, this, this.f211900b);
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable t10) {
        this.f211904f = true;
        g.c(this.f211899a, t10, this, this.f211900b);
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t10) {
        g.f(this.f211899a, t10, this, this.f211900b);
    }

    @Override // zc.InterfaceC5907y, org.reactivestreams.Subscriber
    public void onSubscribe(Subscription s10) {
        if (this.f211903e.compareAndSet(false, true)) {
            this.f211899a.onSubscribe(this);
            SubscriptionHelper.deferredSetOnce(this.f211902d, this.f211901c, s10);
        } else {
            s10.cancel();
            cancel();
            onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
        }
    }

    @Override // org.reactivestreams.Subscription
    public void request(long n10) {
        if (n10 > 0) {
            SubscriptionHelper.deferredRequest(this.f211902d, this.f211901c, n10);
        } else {
            cancel();
            onError(new IllegalArgumentException(Q.a("§3.9 violated: positive request amount required but it was ", n10)));
        }
    }
}
