package io.reactivex.internal.subscriptions;

import io.reactivex.internal.functions.a;
import io.reactivex.internal.util.b;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes7.dex */
public class SubscriptionArbiter extends AtomicInteger implements Subscription {
    private static final long serialVersionUID = -2189523197179400958L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Subscription f207176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f207177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference<Subscription> f207178c = new AtomicReference<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicLong f207179d = new AtomicLong();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicLong f207180e = new AtomicLong();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f207181f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f207182g;

    public void cancel() {
        if (this.f207181f) {
            return;
        }
        this.f207181f = true;
        d();
    }

    public final void d() {
        if (getAndIncrement() != 0) {
            return;
        }
        g();
    }

    public final void g() {
        int iAddAndGet = 1;
        long jC = 0;
        Subscription subscription = null;
        do {
            Subscription andSet = this.f207178c.get();
            if (andSet != null) {
                andSet = this.f207178c.getAndSet(null);
            }
            long andSet2 = this.f207179d.get();
            if (andSet2 != 0) {
                andSet2 = this.f207179d.getAndSet(0L);
            }
            long andSet3 = this.f207180e.get();
            if (andSet3 != 0) {
                andSet3 = this.f207180e.getAndSet(0L);
            }
            Subscription subscription2 = this.f207176a;
            if (this.f207181f) {
                if (subscription2 != null) {
                    subscription2.cancel();
                    this.f207176a = null;
                }
                if (andSet != null) {
                    andSet.cancel();
                }
            } else {
                long jC2 = this.f207177b;
                if (jC2 != Long.MAX_VALUE) {
                    jC2 = b.c(jC2, andSet2);
                    if (jC2 != Long.MAX_VALUE) {
                        jC2 -= andSet3;
                        if (jC2 < 0) {
                            SubscriptionHelper.reportMoreProduced(jC2);
                            jC2 = 0;
                        }
                    }
                    this.f207177b = jC2;
                }
                if (andSet != null) {
                    if (subscription2 != null) {
                        subscription2.cancel();
                    }
                    this.f207176a = andSet;
                    if (jC2 != 0) {
                        jC = b.c(jC, jC2);
                        subscription = andSet;
                    }
                } else if (subscription2 != null && andSet2 != 0) {
                    jC = b.c(jC, andSet2);
                    subscription = subscription2;
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
        if (jC != 0) {
            subscription.request(jC);
        }
    }

    public final boolean h() {
        return this.f207181f;
    }

    public final boolean i() {
        return this.f207182g;
    }

    public final void k(long j10) {
        if (this.f207182g) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            b.a(this.f207180e, j10);
            d();
            return;
        }
        long j11 = this.f207177b;
        if (j11 != Long.MAX_VALUE) {
            long j12 = j11 - j10;
            if (j12 < 0) {
                SubscriptionHelper.reportMoreProduced(j12);
                j12 = 0;
            }
            this.f207177b = j12;
        }
        if (decrementAndGet() == 0) {
            return;
        }
        g();
    }

    public final void l(Subscription subscription) {
        if (this.f207181f) {
            subscription.cancel();
            return;
        }
        a.g(subscription, "s is null");
        if (get() != 0 || !compareAndSet(0, 1)) {
            Subscription andSet = this.f207178c.getAndSet(subscription);
            if (andSet != null) {
                andSet.cancel();
            }
            d();
            return;
        }
        Subscription subscription2 = this.f207176a;
        if (subscription2 != null) {
            subscription2.cancel();
        }
        this.f207176a = subscription;
        long j10 = this.f207177b;
        if (decrementAndGet() != 0) {
            g();
        }
        if (j10 != 0) {
            subscription.request(j10);
        }
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j10) {
        if (!SubscriptionHelper.validate(j10) || this.f207182g) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            b.a(this.f207179d, j10);
            d();
            return;
        }
        long j11 = this.f207177b;
        if (j11 != Long.MAX_VALUE) {
            long jC = b.c(j11, j10);
            this.f207177b = jC;
            if (jC == Long.MAX_VALUE) {
                this.f207182g = true;
            }
        }
        Subscription subscription = this.f207176a;
        if (decrementAndGet() != 0) {
            g();
        }
        if (subscription != null) {
            subscription.request(j10);
        }
    }
}
