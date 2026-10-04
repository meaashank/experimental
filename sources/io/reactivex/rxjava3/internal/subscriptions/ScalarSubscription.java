package io.reactivex.rxjava3.internal.subscriptions;

import Dc.n;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Subscriber;
import yc.f;

/* JADX INFO: loaded from: classes7.dex */
public final class ScalarSubscription<T> extends AtomicInteger implements n<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f211919c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f211920d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f211921e = 2;
    private static final long serialVersionUID = -3830916580126663321L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f211922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Subscriber<? super T> f211923b;

    public ScalarSubscription(Subscriber<? super T> subscriber, T value) {
        this.f211923b = subscriber;
        this.f211922a = value;
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
        lazySet(2);
    }

    @Override // Dc.q
    public void clear() {
        lazySet(1);
    }

    public boolean d() {
        return get() == 2;
    }

    @Override // Dc.q
    public boolean isEmpty() {
        return get() != 0;
    }

    @Override // Dc.q
    public boolean offer(T e10) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // Dc.q
    @f
    public T poll() {
        if (get() != 0) {
            return null;
        }
        lazySet(1);
        return this.f211922a;
    }

    @Override // org.reactivestreams.Subscription
    public void request(long j10) {
        if (SubscriptionHelper.validate(j10) && compareAndSet(0, 1)) {
            Subscriber<? super T> subscriber = this.f211923b;
            subscriber.onNext(this.f211922a);
            if (get() != 2) {
                subscriber.onComplete();
            }
        }
    }

    @Override // Dc.m
    public int requestFusion(int mode) {
        return mode & 1;
    }

    @Override // Dc.q
    public boolean offer(T v12, T v22) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
