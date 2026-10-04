package io.reactivex.rxjava3.internal.subscribers;

import Bc.a;
import Bc.g;
import Bc.r;
import io.reactivex.rxjava3.disposables.d;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;
import zc.InterfaceC5907y;

/* JADX INFO: loaded from: classes7.dex */
public final class ForEachWhileSubscriber<T> extends AtomicReference<Subscription> implements InterfaceC5907y<T>, d {
    private static final long serialVersionUID = -4403180040475402120L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r<? super T> f211878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g<? super Throwable> f211879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f211880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f211881d;

    public ForEachWhileSubscriber(r<? super T> onNext, g<? super Throwable> onError, a onComplete) {
        this.f211878a = onNext;
        this.f211879b = onError;
        this.f211880c = onComplete;
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
        if (this.f211881d) {
            return;
        }
        this.f211881d = true;
        try {
            this.f211880c.run();
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            Ic.a.Y(th);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable t10) {
        if (this.f211881d) {
            Ic.a.Y(t10);
            return;
        }
        this.f211881d = true;
        try {
            this.f211879b.accept(t10);
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            Ic.a.Y(new CompositeException(t10, th));
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t10) {
        if (this.f211881d) {
            return;
        }
        try {
            if (this.f211878a.test(t10)) {
                return;
            }
            SubscriptionHelper.cancel(this);
            onComplete();
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            SubscriptionHelper.cancel(this);
            onError(th);
        }
    }

    @Override // zc.InterfaceC5907y, org.reactivestreams.Subscriber
    public void onSubscribe(Subscription s10) {
        SubscriptionHelper.setOnce(this, s10, Long.MAX_VALUE);
    }
}
