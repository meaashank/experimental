package Fc;

import Dc.n;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a<T, R> implements Dc.c<T>, n<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Dc.c<? super R> f39905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Subscription f39906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public n<T> f39907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f39908d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f39909e;

    public a(Dc.c<? super R> downstream) {
        this.f39905a = downstream;
    }

    public boolean b() {
        return true;
    }

    public final void c(Throwable t10) {
        io.reactivex.rxjava3.exceptions.a.b(t10);
        this.f39906b.cancel();
        onError(t10);
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
        this.f39906b.cancel();
    }

    @Override // Dc.q
    public void clear() {
        this.f39907c.clear();
    }

    public final int d(int mode) {
        n<T> nVar = this.f39907c;
        if (nVar == null || (mode & 4) != 0) {
            return 0;
        }
        int iRequestFusion = nVar.requestFusion(mode);
        if (iRequestFusion != 0) {
            this.f39909e = iRequestFusion;
        }
        return iRequestFusion;
    }

    @Override // Dc.q
    public boolean isEmpty() {
        return this.f39907c.isEmpty();
    }

    @Override // Dc.q
    public final boolean offer(R e10) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        if (this.f39908d) {
            return;
        }
        this.f39908d = true;
        this.f39905a.onComplete();
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable t10) {
        if (this.f39908d) {
            Ic.a.Y(t10);
        } else {
            this.f39908d = true;
            this.f39905a.onError(t10);
        }
    }

    @Override // zc.InterfaceC5907y, org.reactivestreams.Subscriber
    public final void onSubscribe(Subscription s10) {
        if (SubscriptionHelper.validate(this.f39906b, s10)) {
            this.f39906b = s10;
            if (s10 instanceof n) {
                this.f39907c = (n) s10;
            }
            this.f39905a.onSubscribe(this);
        }
    }

    @Override // org.reactivestreams.Subscription
    public void request(long n10) {
        this.f39906b.request(n10);
    }

    @Override // Dc.q
    public final boolean offer(R v12, R v22) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public void a() {
    }
}
