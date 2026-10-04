package rc;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import org.reactivestreams.Subscription;
import pc.InterfaceC5405a;
import uc.C5666a;

/* JADX INFO: renamed from: rc.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC5549a<T, R> implements InterfaceC5405a<T>, pc.l<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC5405a<? super R> f237543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Subscription f237544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public pc.l<T> f237545c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f237546d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f237547e;

    public AbstractC5549a(InterfaceC5405a<? super R> interfaceC5405a) {
        this.f237543a = interfaceC5405a;
    }

    public boolean b() {
        return true;
    }

    public final void c(Throwable th) {
        io.reactivex.exceptions.a.b(th);
        this.f237544b.cancel();
        onError(th);
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
        this.f237544b.cancel();
    }

    @Override // pc.o
    public void clear() {
        this.f237545c.clear();
    }

    public final int d(int i10) {
        pc.l<T> lVar = this.f237545c;
        if (lVar == null || (i10 & 4) != 0) {
            return 0;
        }
        int iRequestFusion = lVar.requestFusion(i10);
        if (iRequestFusion != 0) {
            this.f237547e = iRequestFusion;
        }
        return iRequestFusion;
    }

    @Override // pc.o
    public boolean isEmpty() {
        return this.f237545c.isEmpty();
    }

    @Override // pc.o
    public final boolean offer(R r10) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        if (this.f237546d) {
            return;
        }
        this.f237546d = true;
        this.f237543a.onComplete();
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th) {
        if (this.f237546d) {
            C5666a.Y(th);
        } else {
            this.f237546d = true;
            this.f237543a.onError(th);
        }
    }

    @Override // hc.InterfaceC4535o, org.reactivestreams.Subscriber
    public final void onSubscribe(Subscription subscription) {
        if (SubscriptionHelper.validate(this.f237544b, subscription)) {
            this.f237544b = subscription;
            if (subscription instanceof pc.l) {
                this.f237545c = (pc.l) subscription;
            }
            this.f237543a.onSubscribe(this);
        }
    }

    @Override // org.reactivestreams.Subscription
    public void request(long j10) {
        this.f237544b.request(j10);
    }

    @Override // pc.o
    public final boolean offer(R r10, R r11) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public void a() {
    }
}
