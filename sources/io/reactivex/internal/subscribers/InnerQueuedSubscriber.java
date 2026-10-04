package io.reactivex.internal.subscribers;

import hc.InterfaceC4535o;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.n;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;
import pc.l;
import pc.o;
import rc.g;

/* JADX INFO: loaded from: classes7.dex */
public final class InnerQueuedSubscriber<T> extends AtomicReference<Subscription> implements InterfaceC4535o<T>, Subscription {
    private static final long serialVersionUID = 22876611072430776L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g<T> f207134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f207135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f207136c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile o<T> f207137d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f207138e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f207139f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f207140g;

    public InnerQueuedSubscriber(g<T> gVar, int i10) {
        this.f207134a = gVar;
        this.f207135b = i10;
        this.f207136c = i10 - (i10 >> 2);
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
        SubscriptionHelper.cancel(this);
    }

    public boolean d() {
        return this.f207138e;
    }

    public o<T> g() {
        return this.f207137d;
    }

    public void h() {
        if (this.f207140g != 1) {
            long j10 = this.f207139f + 1;
            if (j10 != this.f207136c) {
                this.f207139f = j10;
            } else {
                this.f207139f = 0L;
                get().request(j10);
            }
        }
    }

    public void i() {
        this.f207138e = true;
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        this.f207134a.a(this);
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th) {
        this.f207134a.b(this, th);
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t10) {
        if (this.f207140g == 0) {
            this.f207134a.c(this, t10);
        } else {
            this.f207134a.d();
        }
    }

    @Override // hc.InterfaceC4535o, org.reactivestreams.Subscriber
    public void onSubscribe(Subscription subscription) {
        if (SubscriptionHelper.setOnce(this, subscription)) {
            if (subscription instanceof l) {
                l lVar = (l) subscription;
                int iRequestFusion = lVar.requestFusion(3);
                if (iRequestFusion == 1) {
                    this.f207140g = iRequestFusion;
                    this.f207137d = lVar;
                    this.f207138e = true;
                    this.f207134a.a(this);
                    return;
                }
                if (iRequestFusion == 2) {
                    this.f207140g = iRequestFusion;
                    this.f207137d = lVar;
                    n.j(subscription, this.f207135b);
                    return;
                }
            }
            this.f207137d = n.c(this.f207135b);
            n.j(subscription, this.f207135b);
        }
    }

    @Override // org.reactivestreams.Subscription
    public void request(long j10) {
        if (this.f207140g != 1) {
            long j11 = this.f207139f + j10;
            if (j11 < this.f207136c) {
                this.f207139f = j11;
            } else {
                this.f207139f = 0L;
                get().request(j11);
            }
        }
    }
}
