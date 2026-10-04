package io.reactivex.rxjava3.internal.subscribers;

import Bc.a;
import io.reactivex.rxjava3.disposables.d;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.observers.g;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;
import zc.InterfaceC5907y;

/* JADX INFO: loaded from: classes7.dex */
public final class LambdaSubscriber<T> extends AtomicReference<Subscription> implements InterfaceC5907y<T>, Subscription, d, g {
    private static final long serialVersionUID = -7251123623727029452L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bc.g<? super T> f211889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bc.g<? super Throwable> f211890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f211891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bc.g<? super Subscription> f211892d;

    public LambdaSubscriber(Bc.g<? super T> onNext, Bc.g<? super Throwable> onError, a onComplete, Bc.g<? super Subscription> onSubscribe) {
        this.f211889a = onNext;
        this.f211890b = onError;
        this.f211891c = onComplete;
        this.f211892d = onSubscribe;
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
        SubscriptionHelper.cancel(this);
    }

    @Override // io.reactivex.rxjava3.observers.g
    public boolean d() {
        return this.f211890b != Functions.f207357f;
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public void dispose() {
        SubscriptionHelper.cancel(this);
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public boolean isDisposed() {
        return get() == SubscriptionHelper.CANCELLED;
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        Subscription subscription = get();
        SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
        if (subscription != subscriptionHelper) {
            lazySet(subscriptionHelper);
            try {
                this.f211891c.run();
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                Ic.a.Y(th);
            }
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable t10) {
        Subscription subscription = get();
        SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
        if (subscription == subscriptionHelper) {
            Ic.a.Y(t10);
            return;
        }
        lazySet(subscriptionHelper);
        try {
            this.f211890b.accept(t10);
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            Ic.a.Y(new CompositeException(t10, th));
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t10) {
        if (isDisposed()) {
            return;
        }
        try {
            this.f211889a.accept(t10);
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            get().cancel();
            onError(th);
        }
    }

    @Override // zc.InterfaceC5907y, org.reactivestreams.Subscriber
    public void onSubscribe(Subscription s10) {
        if (SubscriptionHelper.setOnce(this, s10)) {
            try {
                this.f211892d.accept(this);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                s10.cancel();
                onError(th);
            }
        }
    }

    @Override // org.reactivestreams.Subscription
    public void request(long n10) {
        get().request(n10);
    }
}
