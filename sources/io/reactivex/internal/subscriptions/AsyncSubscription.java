package io.reactivex.internal.subscriptions;

import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes7.dex */
public final class AsyncSubscription extends AtomicLong implements Subscription, b {
    private static final long serialVersionUID = 7028635084060361255L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference<Subscription> f207159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference<b> f207160b;

    public AsyncSubscription() {
        this.f207160b = new AtomicReference<>();
        this.f207159a = new AtomicReference<>();
    }

    public boolean a(b bVar) {
        return DisposableHelper.replace(this.f207160b, bVar);
    }

    public boolean b(b bVar) {
        return DisposableHelper.set(this.f207160b, bVar);
    }

    public void c(Subscription subscription) {
        SubscriptionHelper.deferredSetOnce(this.f207159a, this, subscription);
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
        dispose();
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
        SubscriptionHelper.cancel(this.f207159a);
        DisposableHelper.dispose(this.f207160b);
    }

    @Override // io.reactivex.disposables.b
    public boolean isDisposed() {
        return this.f207159a.get() == SubscriptionHelper.CANCELLED;
    }

    @Override // org.reactivestreams.Subscription
    public void request(long j10) {
        SubscriptionHelper.deferredRequest(this.f207159a, this, j10);
    }

    public AsyncSubscription(b bVar) {
        this();
        this.f207160b.lazySet(bVar);
    }
}
