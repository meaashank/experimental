package io.reactivex.internal.subscribers;

import hc.InterfaceC4535o;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes7.dex */
public abstract class DeferredScalarSubscriber<T, R> extends DeferredScalarSubscription<R> implements InterfaceC4535o<T> {
    private static final long serialVersionUID = 2984505488220891551L;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Subscription f207128k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f207129l;

    public DeferredScalarSubscriber(Subscriber<? super R> subscriber) {
        super(subscriber);
    }

    @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
    public void cancel() {
        super.cancel();
        this.f207128k.cancel();
    }

    public void onComplete() {
        if (this.f207129l) {
            b(this.f207170b);
        } else {
            this.f207169a.onComplete();
        }
    }

    public void onError(Throwable th) {
        this.f207170b = null;
        this.f207169a.onError(th);
    }

    public void onSubscribe(Subscription subscription) {
        if (SubscriptionHelper.validate(this.f207128k, subscription)) {
            this.f207128k = subscription;
            this.f207169a.onSubscribe(this);
            subscription.request(Long.MAX_VALUE);
        }
    }
}
