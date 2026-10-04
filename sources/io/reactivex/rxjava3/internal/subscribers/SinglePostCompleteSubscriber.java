package io.reactivex.rxjava3.internal.subscribers;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.b;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import zc.InterfaceC5907y;

/* JADX INFO: loaded from: classes7.dex */
public abstract class SinglePostCompleteSubscriber<T, R> extends AtomicLong implements InterfaceC5907y<T>, Subscription {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f211893e = Long.MIN_VALUE;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f211894f = Long.MAX_VALUE;
    private static final long serialVersionUID = 7917814472626990048L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Subscriber<? super R> f211895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Subscription f211896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public R f211897c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f211898d;

    public SinglePostCompleteSubscriber(Subscriber<? super R> downstream) {
        this.f211895a = downstream;
    }

    public final void a(R n10) {
        long j10 = this.f211898d;
        if (j10 != 0) {
            b.e(this, j10);
        }
        while (true) {
            long j11 = get();
            if ((j11 & Long.MIN_VALUE) != 0) {
                b(n10);
                return;
            }
            if ((j11 & Long.MAX_VALUE) != 0) {
                lazySet(-9223372036854775807L);
                this.f211895a.onNext(n10);
                this.f211895a.onComplete();
                return;
            } else {
                this.f211897c = n10;
                if (compareAndSet(0L, Long.MIN_VALUE)) {
                    return;
                } else {
                    this.f211897c = null;
                }
            }
        }
    }

    public void b(R n10) {
    }

    public void cancel() {
        this.f211896b.cancel();
    }

    @Override // zc.InterfaceC5907y, org.reactivestreams.Subscriber
    public void onSubscribe(Subscription s10) {
        if (SubscriptionHelper.validate(this.f211896b, s10)) {
            this.f211896b = s10;
            this.f211895a.onSubscribe(this);
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
                        this.f211895a.onNext(this.f211897c);
                        this.f211895a.onComplete();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(j11, b.c(j11, j10)));
            this.f211896b.request(j10);
        }
    }
}
