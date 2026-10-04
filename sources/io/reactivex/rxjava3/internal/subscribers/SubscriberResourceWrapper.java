package io.reactivex.rxjava3.internal.subscribers;

import io.reactivex.rxjava3.disposables.d;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import zc.InterfaceC5907y;

/* JADX INFO: loaded from: classes7.dex */
public final class SubscriberResourceWrapper<T> extends AtomicReference<d> implements InterfaceC5907y<T>, d, Subscription {
    private static final long serialVersionUID = -8612022020200669122L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Subscriber<? super T> f211905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference<Subscription> f211906b = new AtomicReference<>();

    public SubscriberResourceWrapper(Subscriber<? super T> downstream) {
        this.f211905a = downstream;
    }

    public void a(d resource) {
        DisposableHelper.set(this, resource);
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
        dispose();
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public void dispose() {
        SubscriptionHelper.cancel(this.f211906b);
        DisposableHelper.dispose(this);
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public boolean isDisposed() {
        return this.f211906b.get() == SubscriptionHelper.CANCELLED;
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        DisposableHelper.dispose(this);
        this.f211905a.onComplete();
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable t10) {
        DisposableHelper.dispose(this);
        this.f211905a.onError(t10);
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t10) {
        this.f211905a.onNext(t10);
    }

    @Override // zc.InterfaceC5907y, org.reactivestreams.Subscriber
    public void onSubscribe(Subscription s10) {
        if (SubscriptionHelper.setOnce(this.f211906b, s10)) {
            this.f211905a.onSubscribe(this);
        }
    }

    @Override // org.reactivestreams.Subscription
    public void request(long n10) {
        if (SubscriptionHelper.validate(n10)) {
            this.f211906b.get().request(n10);
        }
    }
}
