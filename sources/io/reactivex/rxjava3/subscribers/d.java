package io.reactivex.rxjava3.subscribers;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import zc.InterfaceC5907y;

/* JADX INFO: loaded from: classes7.dex */
public final class d<T> implements InterfaceC5907y<T>, Subscription {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Subscriber<? super T> f212189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Subscription f212190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f212191c;

    public d(@yc.e Subscriber<? super T> downstream) {
        this.f212189a = downstream;
    }

    public void a() {
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            this.f212189a.onSubscribe(EmptySubscription.INSTANCE);
            try {
                this.f212189a.onError(nullPointerException);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                Ic.a.Y(new CompositeException(nullPointerException, th));
            }
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.b(th2);
            Ic.a.Y(new CompositeException(nullPointerException, th2));
        }
    }

    public void b() {
        this.f212191c = true;
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            this.f212189a.onSubscribe(EmptySubscription.INSTANCE);
            try {
                this.f212189a.onError(nullPointerException);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                Ic.a.Y(new CompositeException(nullPointerException, th));
            }
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.b(th2);
            Ic.a.Y(new CompositeException(nullPointerException, th2));
        }
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
        try {
            this.f212190b.cancel();
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            Ic.a.Y(th);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        if (this.f212191c) {
            return;
        }
        this.f212191c = true;
        if (this.f212190b == null) {
            a();
            return;
        }
        try {
            this.f212189a.onComplete();
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            Ic.a.Y(th);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(@yc.e Throwable t10) {
        if (this.f212191c) {
            Ic.a.Y(t10);
            return;
        }
        this.f212191c = true;
        if (this.f212190b != null) {
            if (t10 == null) {
                t10 = ExceptionHelper.b("onError called with a null Throwable.");
            }
            try {
                this.f212189a.onError(t10);
                return;
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                Ic.a.Y(new CompositeException(t10, th));
                return;
            }
        }
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            this.f212189a.onSubscribe(EmptySubscription.INSTANCE);
            try {
                this.f212189a.onError(new CompositeException(t10, nullPointerException));
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.b(th2);
                Ic.a.Y(new CompositeException(t10, nullPointerException, th2));
            }
        } catch (Throwable th3) {
            io.reactivex.rxjava3.exceptions.a.b(th3);
            Ic.a.Y(new CompositeException(t10, nullPointerException, th3));
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(@yc.e T t10) {
        if (this.f212191c) {
            return;
        }
        if (this.f212190b == null) {
            b();
            return;
        }
        if (t10 == null) {
            NullPointerException nullPointerExceptionB = ExceptionHelper.b("onNext called with a null Throwable.");
            try {
                this.f212190b.cancel();
                onError(nullPointerExceptionB);
                return;
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                onError(new CompositeException(nullPointerExceptionB, th));
                return;
            }
        }
        try {
            this.f212189a.onNext(t10);
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.b(th2);
            try {
                this.f212190b.cancel();
                onError(th2);
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.b(th3);
                onError(new CompositeException(th2, th3));
            }
        }
    }

    @Override // zc.InterfaceC5907y, org.reactivestreams.Subscriber
    public void onSubscribe(@yc.e Subscription s10) {
        if (SubscriptionHelper.validate(this.f212190b, s10)) {
            this.f212190b = s10;
            try {
                this.f212189a.onSubscribe(this);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                this.f212191c = true;
                try {
                    s10.cancel();
                    Ic.a.Y(th);
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.a.b(th2);
                    Ic.a.Y(new CompositeException(th, th2));
                }
            }
        }
    }

    @Override // org.reactivestreams.Subscription
    public void request(long n10) {
        try {
            this.f212190b.request(n10);
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            try {
                this.f212190b.cancel();
                Ic.a.Y(th);
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.b(th2);
                Ic.a.Y(new CompositeException(th, th2));
            }
        }
    }
}
