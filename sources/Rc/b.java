package rc;

import hc.InterfaceC4535o;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import uc.C5666a;

/* JADX INFO: loaded from: classes7.dex */
public abstract class b<T, R> implements InterfaceC4535o<T>, pc.l<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Subscriber<? super R> f237548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Subscription f237549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public pc.l<T> f237550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f237551d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f237552e;

    public b(Subscriber<? super R> subscriber) {
        this.f237548a = subscriber;
    }

    public boolean b() {
        return true;
    }

    public final void c(Throwable th) {
        io.reactivex.exceptions.a.b(th);
        this.f237549b.cancel();
        onError(th);
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
        this.f237549b.cancel();
    }

    public void clear() {
        this.f237550c.clear();
    }

    public final int d(int i10) {
        pc.l<T> lVar = this.f237550c;
        if (lVar == null || (i10 & 4) != 0) {
            return 0;
        }
        int iRequestFusion = lVar.requestFusion(i10);
        if (iRequestFusion != 0) {
            this.f237552e = iRequestFusion;
        }
        return iRequestFusion;
    }

    @Override // pc.o
    public boolean isEmpty() {
        return this.f237550c.isEmpty();
    }

    @Override // pc.o
    public final boolean offer(R r10) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        if (this.f237551d) {
            return;
        }
        this.f237551d = true;
        this.f237548a.onComplete();
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th) {
        if (this.f237551d) {
            C5666a.Y(th);
        } else {
            this.f237551d = true;
            this.f237548a.onError(th);
        }
    }

    @Override // hc.InterfaceC4535o, org.reactivestreams.Subscriber
    public final void onSubscribe(Subscription subscription) {
        if (SubscriptionHelper.validate(this.f237549b, subscription)) {
            this.f237549b = subscription;
            if (subscription instanceof pc.l) {
                this.f237550c = (pc.l) subscription;
            }
            this.f237548a.onSubscribe(this);
        }
    }

    @Override // org.reactivestreams.Subscription
    public void request(long j10) {
        this.f237549b.request(j10);
    }

    @Override // pc.o
    public final boolean offer(R r10, R r11) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public void a() {
    }
}
