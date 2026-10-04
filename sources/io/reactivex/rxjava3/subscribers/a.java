package io.reactivex.rxjava3.subscribers;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.f;
import org.reactivestreams.Subscription;
import zc.InterfaceC5907y;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a<T> implements InterfaceC5907y<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Subscription f212184a;

    public final void a() {
        Subscription subscription = this.f212184a;
        this.f212184a = SubscriptionHelper.CANCELLED;
        subscription.cancel();
    }

    public void b() {
        c(Long.MAX_VALUE);
    }

    public final void c(long n10) {
        Subscription subscription = this.f212184a;
        if (subscription != null) {
            subscription.request(n10);
        }
    }

    @Override // zc.InterfaceC5907y, org.reactivestreams.Subscriber
    public final void onSubscribe(Subscription s10) {
        if (f.f(this.f212184a, s10, getClass())) {
            this.f212184a = s10;
            b();
        }
    }
}
