package io.reactivex.rxjava3.internal.subscriptions;

import org.reactivestreams.Subscriber;
import yc.f;

/* JADX INFO: loaded from: classes7.dex */
public class DeferredScalarSubscription<T> extends BasicIntQueueSubscription<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f211909c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f211910d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f211911e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f211912f = 3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f211913g = 4;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f211914h = 8;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f211915i = 16;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f211916j = 32;
    private static final long serialVersionUID = -2151279923272604993L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Subscriber<? super T> f211917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public T f211918b;

    public DeferredScalarSubscription(Subscriber<? super T> downstream) {
        this.f211917a = downstream;
    }

    public final void b(T v10) {
        int i10 = get();
        while (i10 != 8) {
            if ((i10 & (-3)) != 0) {
                return;
            }
            if (i10 == 2) {
                lazySet(3);
                Subscriber<? super T> subscriber = this.f211917a;
                subscriber.onNext(v10);
                if (get() != 4) {
                    subscriber.onComplete();
                    return;
                }
                return;
            }
            this.f211918b = v10;
            if (compareAndSet(0, 1)) {
                return;
            }
            i10 = get();
            if (i10 == 4) {
                this.f211918b = null;
                return;
            }
        }
        this.f211918b = v10;
        lazySet(16);
        Subscriber<? super T> subscriber2 = this.f211917a;
        subscriber2.onNext(v10);
        if (get() != 4) {
            subscriber2.onComplete();
        }
    }

    public void cancel() {
        set(4);
        this.f211918b = null;
    }

    @Override // Dc.q
    public final void clear() {
        lazySet(32);
        this.f211918b = null;
    }

    @Override // Dc.q
    public final boolean isEmpty() {
        return get() != 16;
    }

    public final boolean k() {
        return get() == 4;
    }

    public final boolean m() {
        return getAndSet(4) != 4;
    }

    @Override // Dc.q
    @f
    public final T poll() {
        if (get() != 16) {
            return null;
        }
        lazySet(32);
        T t10 = this.f211918b;
        this.f211918b = null;
        return t10;
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long n10) {
        T t10;
        if (SubscriptionHelper.validate(n10)) {
            do {
                int i10 = get();
                if ((i10 & (-2)) != 0) {
                    return;
                }
                if (i10 == 1) {
                    if (!compareAndSet(1, 3) || (t10 = this.f211918b) == null) {
                        return;
                    }
                    this.f211918b = null;
                    Subscriber<? super T> subscriber = this.f211917a;
                    subscriber.onNext(t10);
                    if (get() != 4) {
                        subscriber.onComplete();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(0, 2));
        }
    }

    @Override // Dc.m
    public final int requestFusion(int mode) {
        if ((mode & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }
}
