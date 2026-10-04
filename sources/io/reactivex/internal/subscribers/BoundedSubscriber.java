package io.reactivex.internal.subscribers;

import hc.InterfaceC4535o;
import io.reactivex.disposables.b;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.a;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.observers.f;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC5265a;
import nc.InterfaceC5271g;
import org.reactivestreams.Subscription;
import uc.C5666a;

/* JADX INFO: loaded from: classes7.dex */
public final class BoundedSubscriber<T> extends AtomicReference<Subscription> implements InterfaceC4535o<T>, Subscription, b, f {
    private static final long serialVersionUID = -7251123623727029452L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC5271g<? super T> f207121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC5271g<? super Throwable> f207122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC5265a f207123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC5271g<? super Subscription> f207124d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f207125e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f207126f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f207127g;

    public BoundedSubscriber(InterfaceC5271g<? super T> interfaceC5271g, InterfaceC5271g<? super Throwable> interfaceC5271g2, InterfaceC5265a interfaceC5265a, InterfaceC5271g<? super Subscription> interfaceC5271g3, int i10) {
        this.f207121a = interfaceC5271g;
        this.f207122b = interfaceC5271g2;
        this.f207123c = interfaceC5265a;
        this.f207124d = interfaceC5271g3;
        this.f207125e = i10;
        this.f207127g = i10 - (i10 >> 2);
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
        SubscriptionHelper.cancel(this);
    }

    @Override // io.reactivex.observers.f
    public boolean d() {
        return this.f207122b != Functions.f202952f;
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
        SubscriptionHelper.cancel(this);
    }

    @Override // io.reactivex.disposables.b
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
                this.f207123c.run();
            } catch (Throwable th) {
                a.b(th);
                C5666a.Y(th);
            }
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th) {
        Subscription subscription = get();
        SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
        if (subscription == subscriptionHelper) {
            C5666a.Y(th);
            return;
        }
        lazySet(subscriptionHelper);
        try {
            this.f207122b.accept(th);
        } catch (Throwable th2) {
            a.b(th2);
            C5666a.Y(new CompositeException(th, th2));
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t10) {
        if (isDisposed()) {
            return;
        }
        try {
            this.f207121a.accept(t10);
            int i10 = this.f207126f + 1;
            if (i10 != this.f207127g) {
                this.f207126f = i10;
            } else {
                this.f207126f = 0;
                get().request(this.f207127g);
            }
        } catch (Throwable th) {
            a.b(th);
            get().cancel();
            onError(th);
        }
    }

    @Override // hc.InterfaceC4535o, org.reactivestreams.Subscriber
    public void onSubscribe(Subscription subscription) {
        if (SubscriptionHelper.setOnce(this, subscription)) {
            try {
                this.f207124d.accept(this);
            } catch (Throwable th) {
                a.b(th);
                subscription.cancel();
                onError(th);
            }
        }
    }

    @Override // org.reactivestreams.Subscription
    public void request(long j10) {
        get().request(j10);
    }
}
