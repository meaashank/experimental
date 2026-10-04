package io.reactivex.subscribers;

import hc.InterfaceC4535o;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.NotificationLite;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import uc.C5666a;

/* JADX INFO: loaded from: classes7.dex */
public final class e<T> implements InterfaceC4535o<T>, Subscription {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f212431g = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Subscriber<? super T> f212432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f212433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Subscription f212434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f212435d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public io.reactivex.internal.util.a<Object> f212436e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f212437f;

    public e(Subscriber<? super T> subscriber) {
        this(subscriber, false);
    }

    public void a() {
        io.reactivex.internal.util.a<Object> aVar;
        do {
            synchronized (this) {
                try {
                    aVar = this.f212436e;
                    if (aVar == null) {
                        this.f212435d = false;
                        return;
                    }
                    this.f212436e = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (!aVar.b(this.f212432a));
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
        this.f212434c.cancel();
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        if (this.f212437f) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f212437f) {
                    return;
                }
                if (!this.f212435d) {
                    this.f212437f = true;
                    this.f212435d = true;
                    this.f212432a.onComplete();
                } else {
                    io.reactivex.internal.util.a<Object> aVar = this.f212436e;
                    if (aVar == null) {
                        aVar = new io.reactivex.internal.util.a<>(4);
                        this.f212436e = aVar;
                    }
                    aVar.c(NotificationLite.complete());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th) {
        if (this.f212437f) {
            C5666a.Y(th);
            return;
        }
        synchronized (this) {
            try {
                boolean z10 = true;
                if (!this.f212437f) {
                    if (this.f212435d) {
                        this.f212437f = true;
                        io.reactivex.internal.util.a<Object> aVar = this.f212436e;
                        if (aVar == null) {
                            aVar = new io.reactivex.internal.util.a<>(4);
                            this.f212436e = aVar;
                        }
                        Object objError = NotificationLite.error(th);
                        if (this.f212433b) {
                            aVar.c(objError);
                        } else {
                            aVar.f(objError);
                        }
                        return;
                    }
                    this.f212437f = true;
                    this.f212435d = true;
                    z10 = false;
                }
                if (z10) {
                    C5666a.Y(th);
                } else {
                    this.f212432a.onError(th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t10) {
        if (this.f212437f) {
            return;
        }
        if (t10 == null) {
            this.f212434c.cancel();
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        synchronized (this) {
            try {
                if (this.f212437f) {
                    return;
                }
                if (!this.f212435d) {
                    this.f212435d = true;
                    this.f212432a.onNext(t10);
                    a();
                } else {
                    io.reactivex.internal.util.a<Object> aVar = this.f212436e;
                    if (aVar == null) {
                        aVar = new io.reactivex.internal.util.a<>(4);
                        this.f212436e = aVar;
                    }
                    aVar.c(NotificationLite.next(t10));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // hc.InterfaceC4535o, org.reactivestreams.Subscriber
    public void onSubscribe(Subscription subscription) {
        if (SubscriptionHelper.validate(this.f212434c, subscription)) {
            this.f212434c = subscription;
            this.f212432a.onSubscribe(this);
        }
    }

    @Override // org.reactivestreams.Subscription
    public void request(long j10) {
        this.f212434c.request(j10);
    }

    public e(Subscriber<? super T> subscriber, boolean z10) {
        this.f212432a = subscriber;
        this.f212433b = z10;
    }
}
