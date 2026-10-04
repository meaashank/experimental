package io.reactivex.internal.subscribers;

import hc.InterfaceC4535o;
import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes7.dex */
public final class SubscriberResourceWrapper<T> extends AtomicReference<b> implements InterfaceC4535o<T>, b, Subscription {
    private static final long serialVersionUID = -8612022020200669122L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Subscriber<? super T> f207157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference<Subscription> f207158b = new AtomicReference<>();

    public SubscriberResourceWrapper(Subscriber<? super T> subscriber) {
        this.f207157a = subscriber;
    }

    public void a(b bVar) {
        DisposableHelper.set(this, bVar);
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
        dispose();
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
        SubscriptionHelper.cancel(this.f207158b);
        DisposableHelper.dispose(this);
    }

    @Override // io.reactivex.disposables.b
    public boolean isDisposed() {
        return this.f207158b.get() == SubscriptionHelper.CANCELLED;
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        DisposableHelper.dispose(this);
        this.f207157a.onComplete();
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th) {
        DisposableHelper.dispose(this);
        this.f207157a.onError(th);
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t10) {
        this.f207157a.onNext(t10);
    }

    @Override // hc.InterfaceC4535o, org.reactivestreams.Subscriber
    public void onSubscribe(Subscription subscription) {
        if (SubscriptionHelper.setOnce(this.f207158b, subscription)) {
            this.f207157a.onSubscribe(this);
        }
    }

    @Override // org.reactivestreams.Subscription
    public void request(long j10) {
        if (SubscriptionHelper.validate(j10)) {
            this.f207158b.get().request(j10);
        }
    }
}
