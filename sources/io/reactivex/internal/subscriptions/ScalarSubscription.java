package io.reactivex.internal.subscriptions;

import java.util.concurrent.atomic.AtomicInteger;
import lc.f;
import org.reactivestreams.Subscriber;
import pc.l;

/* JADX INFO: loaded from: classes7.dex */
public final class ScalarSubscription<T> extends AtomicInteger implements l<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f207171c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f207172d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f207173e = 2;
    private static final long serialVersionUID = -3830916580126663321L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f207174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Subscriber<? super T> f207175b;

    public ScalarSubscription(Subscriber<? super T> subscriber, T t10) {
        this.f207175b = subscriber;
        this.f207174a = t10;
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
        lazySet(2);
    }

    @Override // pc.o
    public void clear() {
        lazySet(1);
    }

    public boolean d() {
        return get() == 2;
    }

    @Override // pc.o
    public boolean isEmpty() {
        return get() != 0;
    }

    @Override // pc.o
    public boolean offer(T t10) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // pc.o
    @f
    public T poll() {
        if (get() != 0) {
            return null;
        }
        lazySet(1);
        return this.f207174a;
    }

    @Override // org.reactivestreams.Subscription
    public void request(long j10) {
        if (SubscriptionHelper.validate(j10) && compareAndSet(0, 1)) {
            Subscriber<? super T> subscriber = this.f207175b;
            subscriber.onNext(this.f207174a);
            if (get() != 2) {
                subscriber.onComplete();
            }
        }
    }

    @Override // pc.k
    public int requestFusion(int i10) {
        return i10 & 1;
    }

    @Override // pc.o
    public boolean offer(T t10, T t11) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
