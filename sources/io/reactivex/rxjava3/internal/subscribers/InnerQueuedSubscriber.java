package io.reactivex.rxjava3.internal.subscribers;

import Dc.n;
import Dc.q;
import Fc.g;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;
import zc.InterfaceC5907y;

/* JADX INFO: loaded from: classes7.dex */
public final class InnerQueuedSubscriber<T> extends AtomicReference<Subscription> implements InterfaceC5907y<T>, Subscription {
    private static final long serialVersionUID = 22876611072430776L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g<T> f211882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f211883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f211884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile q<T> f211885d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f211886e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f211887f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f211888g;

    public InnerQueuedSubscriber(g<T> parent, int prefetch) {
        this.f211882a = parent;
        this.f211883b = prefetch;
        this.f211884c = prefetch - (prefetch >> 2);
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
        SubscriptionHelper.cancel(this);
    }

    public boolean d() {
        return this.f211886e;
    }

    public q<T> g() {
        return this.f211885d;
    }

    public void h() {
        this.f211886e = true;
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        this.f211882a.b(this);
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable t10) {
        this.f211882a.c(this, t10);
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t10) {
        if (this.f211888g == 0) {
            this.f211882a.a(this, t10);
        } else {
            this.f211882a.d();
        }
    }

    @Override // zc.InterfaceC5907y, org.reactivestreams.Subscriber
    public void onSubscribe(Subscription s10) {
        if (SubscriptionHelper.setOnce(this, s10)) {
            if (s10 instanceof n) {
                n nVar = (n) s10;
                int iRequestFusion = nVar.requestFusion(3);
                if (iRequestFusion == 1) {
                    this.f211888g = iRequestFusion;
                    this.f211885d = nVar;
                    this.f211886e = true;
                    this.f211882a.b(this);
                    return;
                }
                if (iRequestFusion == 2) {
                    this.f211888g = iRequestFusion;
                    this.f211885d = nVar;
                    io.reactivex.rxjava3.internal.util.n.j(s10, this.f211883b);
                    return;
                }
            }
            this.f211885d = io.reactivex.rxjava3.internal.util.n.c(this.f211883b);
            io.reactivex.rxjava3.internal.util.n.j(s10, this.f211883b);
        }
    }

    @Override // org.reactivestreams.Subscription
    public void request(long n10) {
        if (this.f211888g != 1) {
            long j10 = this.f211887f + n10;
            if (j10 < this.f211884c) {
                this.f211887f = j10;
            } else {
                this.f211887f = 0L;
                get().request(j10);
            }
        }
    }
}
