package io.reactivex.subscribers;

import hc.InterfaceC4535o;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.f;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import oc.C5348b;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes7.dex */
public abstract class c<T> implements InterfaceC4535o<T>, io.reactivex.disposables.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference<Subscription> f212425a = new AtomicReference<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5348b f212426b = new C5348b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicLong f212427c = new AtomicLong();

    public final void a(io.reactivex.disposables.b bVar) {
        io.reactivex.internal.functions.a.g(bVar, "resource is null");
        this.f212426b.c(bVar);
    }

    public void b() {
        c(Long.MAX_VALUE);
    }

    public final void c(long j10) {
        SubscriptionHelper.deferredRequest(this.f212425a, this.f212427c, j10);
    }

    @Override // io.reactivex.disposables.b
    public final void dispose() {
        if (SubscriptionHelper.cancel(this.f212425a)) {
            this.f212426b.dispose();
        }
    }

    @Override // io.reactivex.disposables.b
    public final boolean isDisposed() {
        return SubscriptionHelper.isCancelled(this.f212425a.get());
    }

    @Override // hc.InterfaceC4535o, org.reactivestreams.Subscriber
    public final void onSubscribe(Subscription subscription) {
        if (f.d(this.f212425a, subscription, getClass())) {
            long andSet = this.f212427c.getAndSet(0L);
            if (andSet != 0) {
                subscription.request(andSet);
            }
            b();
        }
    }
}
