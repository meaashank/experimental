package io.reactivex.internal.subscribers;

import hc.InterfaceC4535o;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.b;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes7.dex */
public abstract class SinglePostCompleteSubscriber<T, R> extends AtomicLong implements InterfaceC4535o<T>, Subscription {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f207145e = Long.MIN_VALUE;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f207146f = Long.MAX_VALUE;
    private static final long serialVersionUID = 7917814472626990048L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Subscriber<? super R> f207147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Subscription f207148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public R f207149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f207150d;

    public SinglePostCompleteSubscriber(Subscriber<? super R> subscriber) {
        this.f207147a = subscriber;
    }

    public final void a(R r10) {
        long j10 = this.f207150d;
        if (j10 != 0) {
            b.e(this, j10);
        }
        while (true) {
            long j11 = get();
            if ((j11 & Long.MIN_VALUE) != 0) {
                b(r10);
                return;
            }
            if ((j11 & Long.MAX_VALUE) != 0) {
                lazySet(-9223372036854775807L);
                this.f207147a.onNext(r10);
                this.f207147a.onComplete();
                return;
            } else {
                this.f207149c = r10;
                if (compareAndSet(0L, Long.MIN_VALUE)) {
                    return;
                } else {
                    this.f207149c = null;
                }
            }
        }
    }

    public void b(R r10) {
    }

    public void cancel() {
        this.f207148b.cancel();
    }

    @Override // hc.InterfaceC4535o, org.reactivestreams.Subscriber
    public void onSubscribe(Subscription subscription) {
        if (SubscriptionHelper.validate(this.f207148b, subscription)) {
            this.f207148b = subscription;
            this.f207147a.onSubscribe(this);
        }
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j10) {
        long j11;
        if (SubscriptionHelper.validate(j10)) {
            do {
                j11 = get();
                if ((j11 & Long.MIN_VALUE) != 0) {
                    if (compareAndSet(Long.MIN_VALUE, -9223372036854775807L)) {
                        this.f207147a.onNext(this.f207149c);
                        this.f207147a.onComplete();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(j11, b.c(j11, j10)));
            this.f207148b.request(j10);
        }
    }
}
