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
public final class BoundedSubscriber<T> extends AtomicReference<Subscription> implements InterfaceC5907y<T>, Subscription, d, g {
    private static final long serialVersionUID = -7251123623727029452L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bc.g<? super T> f211869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bc.g<? super Throwable> f211870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f211871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bc.g<? super Subscription> f211872d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f211873e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f211874f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f211875g;

    public BoundedSubscriber(Bc.g<? super T> onNext, Bc.g<? super Throwable> onError, a onComplete, Bc.g<? super Subscription> onSubscribe, int bufferSize) {
        this.f211869a = onNext;
        this.f211870b = onError;
        this.f211871c = onComplete;
        this.f211872d = onSubscribe;
        this.f211873e = bufferSize;
        this.f211875g = bufferSize - (bufferSize >> 2);
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
        SubscriptionHelper.cancel(this);
    }

    @Override // io.reactivex.rxjava3.observers.g
    public boolean d() {
        return this.f211870b != Functions.f207357f;
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
                this.f211871c.run();
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
            this.f211870b.accept(t10);
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
            this.f211869a.accept(t10);
            int i10 = this.f211874f + 1;
            if (i10 != this.f211875g) {
                this.f211874f = i10;
            } else {
                this.f211874f = 0;
                get().request(this.f211875g);
            }
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
                this.f211872d.accept(this);
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
