package io.reactivex.rxjava3.internal.subscriptions;

import io.reactivex.rxjava3.disposables.d;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes7.dex */
public final class AsyncSubscription extends AtomicLong implements Subscription, d {
    private static final long serialVersionUID = 7028635084060361255L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference<Subscription> f211907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference<d> f211908b;

    public AsyncSubscription() {
        this.f211908b = new AtomicReference<>();
        this.f211907a = new AtomicReference<>();
    }

    public boolean a(d r10) {
        return DisposableHelper.replace(this.f211908b, r10);
    }

    public boolean b(d r10) {
        return DisposableHelper.set(this.f211908b, r10);
    }

    public void c(Subscription s10) {
        SubscriptionHelper.deferredSetOnce(this.f211907a, this, s10);
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
        dispose();
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public void dispose() {
        SubscriptionHelper.cancel(this.f211907a);
        DisposableHelper.dispose(this.f211908b);
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public boolean isDisposed() {
        return this.f211907a.get() == SubscriptionHelper.CANCELLED;
    }

    @Override // org.reactivestreams.Subscription
    public void request(long n10) {
        SubscriptionHelper.deferredRequest(this.f211907a, this, n10);
    }

    public AsyncSubscription(d resource) {
        this();
        this.f211908b.lazySet(resource);
    }
}
