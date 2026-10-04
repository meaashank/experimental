package io.reactivex.subscribers;

import hc.InterfaceC4535o;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import uc.C5666a;

/* JADX INFO: loaded from: classes7.dex */
public final class d<T> implements InterfaceC4535o<T>, Subscription {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Subscriber<? super T> f212428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Subscription f212429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f212430c;

    public d(Subscriber<? super T> subscriber) {
        this.f212428a = subscriber;
    }

    public void a() {
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            this.f212428a.onSubscribe(EmptySubscription.INSTANCE);
            try {
                this.f212428a.onError(nullPointerException);
            } catch (Throwable th) {
                io.reactivex.exceptions.a.b(th);
                C5666a.Y(new CompositeException(nullPointerException, th));
            }
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            C5666a.Y(new CompositeException(nullPointerException, th2));
        }
    }

    public void b() {
        this.f212430c = true;
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            this.f212428a.onSubscribe(EmptySubscription.INSTANCE);
            try {
                this.f212428a.onError(nullPointerException);
            } catch (Throwable th) {
                io.reactivex.exceptions.a.b(th);
                C5666a.Y(new CompositeException(nullPointerException, th));
            }
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            C5666a.Y(new CompositeException(nullPointerException, th2));
        }
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
        try {
            this.f212429b.cancel();
        } catch (Throwable th) {
            io.reactivex.exceptions.a.b(th);
            C5666a.Y(th);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        if (this.f212430c) {
            return;
        }
        this.f212430c = true;
        if (this.f212429b == null) {
            a();
            return;
        }
        try {
            this.f212428a.onComplete();
        } catch (Throwable th) {
            io.reactivex.exceptions.a.b(th);
            C5666a.Y(th);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th) {
        if (this.f212430c) {
            C5666a.Y(th);
            return;
        }
        this.f212430c = true;
        if (this.f212429b != null) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            try {
                this.f212428a.onError(th);
                return;
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                C5666a.Y(new CompositeException(th, th2));
                return;
            }
        }
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            this.f212428a.onSubscribe(EmptySubscription.INSTANCE);
            try {
                this.f212428a.onError(new CompositeException(th, nullPointerException));
            } catch (Throwable th3) {
                io.reactivex.exceptions.a.b(th3);
                C5666a.Y(new CompositeException(th, nullPointerException, th3));
            }
        } catch (Throwable th4) {
            io.reactivex.exceptions.a.b(th4);
            C5666a.Y(new CompositeException(th, nullPointerException, th4));
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t10) {
        if (this.f212430c) {
            return;
        }
        if (this.f212429b == null) {
            b();
            return;
        }
        if (t10 == null) {
            NullPointerException nullPointerException = new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
            try {
                this.f212429b.cancel();
                onError(nullPointerException);
                return;
            } catch (Throwable th) {
                io.reactivex.exceptions.a.b(th);
                onError(new CompositeException(nullPointerException, th));
                return;
            }
        }
        try {
            this.f212428a.onNext(t10);
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            try {
                this.f212429b.cancel();
                onError(th2);
            } catch (Throwable th3) {
                io.reactivex.exceptions.a.b(th3);
                onError(new CompositeException(th2, th3));
            }
        }
    }

    @Override // hc.InterfaceC4535o, org.reactivestreams.Subscriber
    public void onSubscribe(Subscription subscription) {
        if (SubscriptionHelper.validate(this.f212429b, subscription)) {
            this.f212429b = subscription;
            try {
                this.f212428a.onSubscribe(this);
            } catch (Throwable th) {
                io.reactivex.exceptions.a.b(th);
                this.f212430c = true;
                try {
                    subscription.cancel();
                    C5666a.Y(th);
                } catch (Throwable th2) {
                    io.reactivex.exceptions.a.b(th2);
                    C5666a.Y(new CompositeException(th, th2));
                }
            }
        }
    }

    @Override // org.reactivestreams.Subscription
    public void request(long j10) {
        try {
            this.f212429b.request(j10);
        } catch (Throwable th) {
            io.reactivex.exceptions.a.b(th);
            try {
                this.f212429b.cancel();
                C5666a.Y(th);
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                C5666a.Y(new CompositeException(th, th2));
            }
        }
    }
}
