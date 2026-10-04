package io.reactivex.internal.subscribers;

import hc.InterfaceC4535o;
import io.reactivex.disposables.b;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.a;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC5265a;
import nc.InterfaceC5271g;
import nc.r;
import org.reactivestreams.Subscription;
import uc.C5666a;

/* JADX INFO: loaded from: classes7.dex */
public final class ForEachWhileSubscriber<T> extends AtomicReference<Subscription> implements InterfaceC4535o<T>, b {
    private static final long serialVersionUID = -4403180040475402120L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r<? super T> f207130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC5271g<? super Throwable> f207131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC5265a f207132c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f207133d;

    public ForEachWhileSubscriber(r<? super T> rVar, InterfaceC5271g<? super Throwable> interfaceC5271g, InterfaceC5265a interfaceC5265a) {
        this.f207130a = rVar;
        this.f207131b = interfaceC5271g;
        this.f207132c = interfaceC5265a;
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
        SubscriptionHelper.cancel(this);
    }

    @Override // io.reactivex.disposables.b
    public boolean isDisposed() {
        return SubscriptionHelper.isCancelled(get());
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        if (this.f207133d) {
            return;
        }
        this.f207133d = true;
        try {
            this.f207132c.run();
        } catch (Throwable th) {
            a.b(th);
            C5666a.Y(th);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th) {
        if (this.f207133d) {
            C5666a.Y(th);
            return;
        }
        this.f207133d = true;
        try {
            this.f207131b.accept(th);
        } catch (Throwable th2) {
            a.b(th2);
            C5666a.Y(new CompositeException(th, th2));
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t10) {
        if (this.f207133d) {
            return;
        }
        try {
            if (this.f207130a.test(t10)) {
                return;
            }
            SubscriptionHelper.cancel(this);
            onComplete();
        } catch (Throwable th) {
            a.b(th);
            SubscriptionHelper.cancel(this);
            onError(th);
        }
    }

    @Override // hc.InterfaceC4535o, org.reactivestreams.Subscriber
    public void onSubscribe(Subscription subscription) {
        SubscriptionHelper.setOnce(this, subscription, Long.MAX_VALUE);
    }
}
