package io.reactivex.rxjava3.internal.subscribers;

import io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import zc.InterfaceC5907y;

/* JADX INFO: loaded from: classes7.dex */
public abstract class DeferredScalarSubscriber<T, R> extends DeferredScalarSubscription<R> implements InterfaceC5907y<T> {
    private static final long serialVersionUID = 2984505488220891551L;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Subscription f211876k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f211877l;

    public DeferredScalarSubscriber(Subscriber<? super R> downstream) {
        super(downstream);
    }

    @Override // io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
    public void cancel() {
        super.cancel();
        this.f211876k.cancel();
    }

    public void onComplete() {
        if (this.f211877l) {
            b(this.f211918b);
        } else {
            this.f211917a.onComplete();
        }
    }

    public void onError(Throwable t10) {
        this.f211918b = null;
        this.f211917a.onError(t10);
    }

    public void onSubscribe(Subscription s10) {
        if (SubscriptionHelper.validate(this.f211876k, s10)) {
            this.f211876k = s10;
            this.f211917a.onSubscribe(this);
            s10.request(Long.MAX_VALUE);
        }
    }
}
