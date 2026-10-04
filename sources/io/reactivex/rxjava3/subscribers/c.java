package io.reactivex.rxjava3.subscribers;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.f;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;
import zc.InterfaceC5907y;

/* JADX INFO: loaded from: classes7.dex */
public abstract class c<T> implements InterfaceC5907y<T>, io.reactivex.rxjava3.disposables.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference<Subscription> f212186a = new AtomicReference<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Cc.a f212187b = new Cc.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicLong f212188c = new AtomicLong();

    public final void a(io.reactivex.rxjava3.disposables.d resource) {
        Objects.requireNonNull(resource, "resource is null");
        this.f212187b.a(resource);
    }

    public void b() {
        c(Long.MAX_VALUE);
    }

    public final void c(long n10) {
        SubscriptionHelper.deferredRequest(this.f212186a, this.f212188c, n10);
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final void dispose() {
        if (SubscriptionHelper.cancel(this.f212186a)) {
            this.f212187b.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final boolean isDisposed() {
        return this.f212186a.get() == SubscriptionHelper.CANCELLED;
    }

    @Override // zc.InterfaceC5907y, org.reactivestreams.Subscriber
    public final void onSubscribe(Subscription s10) {
        if (f.d(this.f212186a, s10, getClass())) {
            long andSet = this.f212188c.getAndSet(0L);
            if (andSet != 0) {
                s10.request(andSet);
            }
            b();
        }
    }
}
