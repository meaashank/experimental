package io.reactivex.subscribers;

import hc.InterfaceC4535o;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.f;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a<T> implements InterfaceC4535o<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Subscription f212423a;

    public final void a() {
        Subscription subscription = this.f212423a;
        this.f212423a = SubscriptionHelper.CANCELLED;
        subscription.cancel();
    }

    public void b() {
        c(Long.MAX_VALUE);
    }

    public final void c(long j10) {
        Subscription subscription = this.f212423a;
        if (subscription != null) {
            subscription.request(j10);
        }
    }

    @Override // hc.InterfaceC4535o, org.reactivestreams.Subscriber
    public final void onSubscribe(Subscription subscription) {
        if (f.f(this.f212423a, subscription, getClass())) {
            this.f212423a = subscription;
            b();
        }
    }
}
