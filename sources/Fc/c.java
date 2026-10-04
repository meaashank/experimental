package Fc;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.concurrent.CountDownLatch;
import org.reactivestreams.Subscription;
import zc.InterfaceC5907y;

/* JADX INFO: loaded from: classes7.dex */
public abstract class c<T> extends CountDownLatch implements InterfaceC5907y<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public T f39915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Throwable f39916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Subscription f39917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f39918d;

    public c() {
        super(1);
    }

    public final T a() {
        if (getCount() != 0) {
            try {
                io.reactivex.rxjava3.internal.util.c.b();
                await();
            } catch (InterruptedException e10) {
                Subscription subscription = this.f39917c;
                this.f39917c = SubscriptionHelper.CANCELLED;
                if (subscription != null) {
                    subscription.cancel();
                }
                throw ExceptionHelper.i(e10);
            }
        }
        Throwable th = this.f39916b;
        if (th == null) {
            return this.f39915a;
        }
        throw ExceptionHelper.i(th);
    }

    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
        countDown();
    }

    @Override // zc.InterfaceC5907y, org.reactivestreams.Subscriber
    public final void onSubscribe(Subscription s10) {
        if (SubscriptionHelper.validate(this.f39917c, s10)) {
            this.f39917c = s10;
            if (this.f39918d) {
                return;
            }
            s10.request(Long.MAX_VALUE);
            if (this.f39918d) {
                this.f39917c = SubscriptionHelper.CANCELLED;
                s10.cancel();
            }
        }
    }
}
