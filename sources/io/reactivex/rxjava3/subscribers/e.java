package io.reactivex.rxjava3.subscribers;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import zc.InterfaceC5907y;

/* JADX INFO: loaded from: classes7.dex */
public final class e<T> implements InterfaceC5907y<T>, Subscription {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f212192g = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Subscriber<? super T> f212193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f212194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Subscription f212195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f212196d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public io.reactivex.rxjava3.internal.util.a<Object> f212197e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f212198f;

    public e(Subscriber<? super T> downstream) {
        this(downstream, false);
    }

    public void a() {
        io.reactivex.rxjava3.internal.util.a<Object> aVar;
        do {
            synchronized (this) {
                try {
                    aVar = this.f212197e;
                    if (aVar == null) {
                        this.f212196d = false;
                        return;
                    }
                    this.f212197e = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (!aVar.a(this.f212193a));
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
        this.f212195c.cancel();
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        if (this.f212198f) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f212198f) {
                    return;
                }
                if (!this.f212196d) {
                    this.f212198f = true;
                    this.f212196d = true;
                    this.f212193a.onComplete();
                } else {
                    io.reactivex.rxjava3.internal.util.a<Object> aVar = this.f212197e;
                    if (aVar == null) {
                        aVar = new io.reactivex.rxjava3.internal.util.a<>(4);
                        this.f212197e = aVar;
                    }
                    aVar.c(NotificationLite.complete());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable t10) {
        if (this.f212198f) {
            Ic.a.Y(t10);
            return;
        }
        synchronized (this) {
            try {
                boolean z10 = true;
                if (!this.f212198f) {
                    if (this.f212196d) {
                        this.f212198f = true;
                        io.reactivex.rxjava3.internal.util.a<Object> aVar = this.f212197e;
                        if (aVar == null) {
                            aVar = new io.reactivex.rxjava3.internal.util.a<>(4);
                            this.f212197e = aVar;
                        }
                        Object objError = NotificationLite.error(t10);
                        if (this.f212194b) {
                            aVar.c(objError);
                        } else {
                            aVar.f(objError);
                        }
                        return;
                    }
                    this.f212198f = true;
                    this.f212196d = true;
                    z10 = false;
                }
                if (z10) {
                    Ic.a.Y(t10);
                } else {
                    this.f212193a.onError(t10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(@yc.e T t10) {
        if (this.f212198f) {
            return;
        }
        if (t10 == null) {
            this.f212195c.cancel();
            onError(ExceptionHelper.b("onNext called with a null value."));
            return;
        }
        synchronized (this) {
            try {
                if (this.f212198f) {
                    return;
                }
                if (!this.f212196d) {
                    this.f212196d = true;
                    this.f212193a.onNext(t10);
                    a();
                } else {
                    io.reactivex.rxjava3.internal.util.a<Object> aVar = this.f212197e;
                    if (aVar == null) {
                        aVar = new io.reactivex.rxjava3.internal.util.a<>(4);
                        this.f212197e = aVar;
                    }
                    aVar.c(NotificationLite.next(t10));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // zc.InterfaceC5907y, org.reactivestreams.Subscriber
    public void onSubscribe(@yc.e Subscription s10) {
        if (SubscriptionHelper.validate(this.f212195c, s10)) {
            this.f212195c = s10;
            this.f212193a.onSubscribe(this);
        }
    }

    @Override // org.reactivestreams.Subscription
    public void request(long n10) {
        this.f212195c.request(n10);
    }

    public e(@yc.e Subscriber<? super T> actual, boolean delayError) {
        this.f212193a = actual;
        this.f212194b = delayError;
    }
}
