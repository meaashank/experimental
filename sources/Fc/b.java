package Fc;

import Dc.n;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import zc.InterfaceC5907y;

/* JADX INFO: loaded from: classes7.dex */
public abstract class b<T, R> implements InterfaceC5907y<T>, n<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Subscriber<? super R> f39910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Subscription f39911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public n<T> f39912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f39913d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f39914e;

    public b(Subscriber<? super R> downstream) {
        this.f39910a = downstream;
    }

    public boolean b() {
        return true;
    }

    public final void c(Throwable t10) {
        io.reactivex.rxjava3.exceptions.a.b(t10);
        this.f39911b.cancel();
        onError(t10);
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
        this.f39911b.cancel();
    }

    @Override // Dc.q
    public void clear() {
        this.f39912c.clear();
    }

    public final int d(int mode) {
        n<T> nVar = this.f39912c;
        if (nVar == null || (mode & 4) != 0) {
            return 0;
        }
        int iRequestFusion = nVar.requestFusion(mode);
        if (iRequestFusion != 0) {
            this.f39914e = iRequestFusion;
        }
        return iRequestFusion;
    }

    @Override // Dc.q
    public boolean isEmpty() {
        return this.f39912c.isEmpty();
    }

    @Override // Dc.q
    public final boolean offer(R e10) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        if (this.f39913d) {
            return;
        }
        this.f39913d = true;
        this.f39910a.onComplete();
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable t10) {
        if (this.f39913d) {
            Ic.a.Y(t10);
        } else {
            this.f39913d = true;
            this.f39910a.onError(t10);
        }
    }

    @Override // zc.InterfaceC5907y, org.reactivestreams.Subscriber
    public final void onSubscribe(Subscription s10) {
        if (SubscriptionHelper.validate(this.f39911b, s10)) {
            this.f39911b = s10;
            if (s10 instanceof n) {
                this.f39912c = (n) s10;
            }
            this.f39910a.onSubscribe(this);
        }
    }

    @Override // org.reactivestreams.Subscription
    public void request(long n10) {
        this.f39911b.request(n10);
    }

    @Override // Dc.q
    public final boolean offer(R v12, R v22) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public void a() {
    }
}
