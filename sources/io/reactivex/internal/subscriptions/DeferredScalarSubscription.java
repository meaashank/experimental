package io.reactivex.internal.subscriptions;

import lc.f;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes7.dex */
public class DeferredScalarSubscription<T> extends BasicIntQueueSubscription<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f207161c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f207162d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f207163e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f207164f = 3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f207165g = 4;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f207166h = 8;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f207167i = 16;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f207168j = 32;
    private static final long serialVersionUID = -2151279923272604993L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Subscriber<? super T> f207169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public T f207170b;

    public DeferredScalarSubscription(Subscriber<? super T> subscriber) {
        this.f207169a = subscriber;
    }

    public final void b(T t10) {
        int i10 = get();
        while (i10 != 8) {
            if ((i10 & (-3)) != 0) {
                return;
            }
            if (i10 == 2) {
                lazySet(3);
                Subscriber<? super T> subscriber = this.f207169a;
                subscriber.onNext(t10);
                if (get() != 4) {
                    subscriber.onComplete();
                    return;
                }
                return;
            }
            this.f207170b = t10;
            if (compareAndSet(0, 1)) {
                return;
            }
            i10 = get();
            if (i10 == 4) {
                this.f207170b = null;
                return;
            }
        }
        this.f207170b = t10;
        lazySet(16);
        Subscriber<? super T> subscriber2 = this.f207169a;
        subscriber2.onNext(t10);
        if (get() != 4) {
            subscriber2.onComplete();
        }
    }

    public void cancel() {
        set(4);
        this.f207170b = null;
    }

    @Override // pc.o
    public final void clear() {
        lazySet(32);
        this.f207170b = null;
    }

    @Override // pc.o
    public final boolean isEmpty() {
        return get() != 16;
    }

    public final boolean k() {
        return get() == 4;
    }

    public final boolean m() {
        return getAndSet(4) != 4;
    }

    @Override // pc.o
    @f
    public final T poll() {
        if (get() != 16) {
            return null;
        }
        lazySet(32);
        T t10 = this.f207170b;
        this.f207170b = null;
        return t10;
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j10) {
        T t10;
        if (SubscriptionHelper.validate(j10)) {
            do {
                int i10 = get();
                if ((i10 & (-2)) != 0) {
                    return;
                }
                if (i10 == 1) {
                    if (!compareAndSet(1, 3) || (t10 = this.f207170b) == null) {
                        return;
                    }
                    this.f207170b = null;
                    Subscriber<? super T> subscriber = this.f207169a;
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

    @Override // pc.k
    public final int requestFusion(int i10) {
        if ((i10 & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }
}
