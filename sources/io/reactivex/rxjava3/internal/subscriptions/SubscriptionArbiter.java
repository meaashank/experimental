package io.reactivex.rxjava3.internal.subscriptions;

import io.reactivex.rxjava3.internal.util.b;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes7.dex */
public class SubscriptionArbiter extends AtomicInteger implements Subscription {
    private static final long serialVersionUID = -2189523197179400958L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Subscription f211924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f211925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference<Subscription> f211926c = new AtomicReference<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicLong f211927d = new AtomicLong();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicLong f211928e = new AtomicLong();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f211929f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f211930g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f211931h;

    public SubscriptionArbiter(boolean cancelOnReplace) {
        this.f211929f = cancelOnReplace;
    }

    public void cancel() {
        if (this.f211930g) {
            return;
        }
        this.f211930g = true;
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
            Subscription andSet = this.f211926c.get();
            if (andSet != null) {
                andSet = this.f211926c.getAndSet(null);
            }
            long andSet2 = this.f211927d.get();
            if (andSet2 != 0) {
                andSet2 = this.f211927d.getAndSet(0L);
            }
            long andSet3 = this.f211928e.get();
            if (andSet3 != 0) {
                andSet3 = this.f211928e.getAndSet(0L);
            }
            Subscription subscription2 = this.f211924a;
            if (this.f211930g) {
                if (subscription2 != null) {
                    subscription2.cancel();
                    this.f211924a = null;
                }
                if (andSet != null) {
                    andSet.cancel();
                }
            } else {
                long jC2 = this.f211925b;
                if (jC2 != Long.MAX_VALUE) {
                    jC2 = b.c(jC2, andSet2);
                    if (jC2 != Long.MAX_VALUE) {
                        jC2 -= andSet3;
                        if (jC2 < 0) {
                            SubscriptionHelper.reportMoreProduced(jC2);
                            jC2 = 0;
                        }
                    }
                    this.f211925b = jC2;
                }
                if (andSet != null) {
                    if (subscription2 != null && this.f211929f) {
                        subscription2.cancel();
                    }
                    this.f211924a = andSet;
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
        return this.f211930g;
    }

    public final boolean i() {
        return this.f211931h;
    }

    public final void k(long n10) {
        if (this.f211931h) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            b.a(this.f211928e, n10);
            d();
            return;
        }
        long j10 = this.f211925b;
        if (j10 != Long.MAX_VALUE) {
            long j11 = j10 - n10;
            if (j11 < 0) {
                SubscriptionHelper.reportMoreProduced(j11);
                j11 = 0;
            }
            this.f211925b = j11;
        }
        if (decrementAndGet() == 0) {
            return;
        }
        g();
    }

    public final void l(Subscription s10) {
        if (this.f211930g) {
            s10.cancel();
            return;
        }
        Objects.requireNonNull(s10, "s is null");
        if (get() != 0 || !compareAndSet(0, 1)) {
            Subscription andSet = this.f211926c.getAndSet(s10);
            if (andSet != null && this.f211929f) {
                andSet.cancel();
            }
            d();
            return;
        }
        Subscription subscription = this.f211924a;
        if (subscription != null && this.f211929f) {
            subscription.cancel();
        }
        this.f211924a = s10;
        long j10 = this.f211925b;
        if (decrementAndGet() != 0) {
            g();
        }
        if (j10 != 0) {
            s10.request(j10);
        }
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long n10) {
        if (!SubscriptionHelper.validate(n10) || this.f211931h) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            b.a(this.f211927d, n10);
            d();
            return;
        }
        long j10 = this.f211925b;
        if (j10 != Long.MAX_VALUE) {
            long jC = b.c(j10, n10);
            this.f211925b = jC;
            if (jC == Long.MAX_VALUE) {
                this.f211931h = true;
            }
        }
        Subscription subscription = this.f211924a;
        if (decrementAndGet() != 0) {
            g();
        }
        if (subscription != null) {
            subscription.request(n10);
        }
    }
}
