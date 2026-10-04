package rc;

import hc.InterfaceC4535o;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.CountDownLatch;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes7.dex */
public abstract class c<T> extends CountDownLatch implements InterfaceC4535o<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public T f237553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Throwable f237554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Subscription f237555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f237556d;

    public c() {
        super(1);
    }

    public final T a() {
        if (getCount() != 0) {
            try {
                io.reactivex.internal.util.c.b();
                await();
            } catch (InterruptedException e10) {
                Subscription subscription = this.f237555c;
                this.f237555c = SubscriptionHelper.CANCELLED;
                if (subscription != null) {
                    subscription.cancel();
                }
                throw ExceptionHelper.e(e10);
            }
        }
        Throwable th = this.f237554b;
        if (th == null) {
            return this.f237553a;
        }
        throw ExceptionHelper.e(th);
    }

    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
        countDown();
    }

    @Override // hc.InterfaceC4535o, org.reactivestreams.Subscriber
    public final void onSubscribe(Subscription subscription) {
        if (SubscriptionHelper.validate(this.f237555c, subscription)) {
            this.f237555c = subscription;
            if (this.f237556d) {
                return;
            }
            subscription.request(Long.MAX_VALUE);
            if (this.f237556d) {
                this.f237555c = SubscriptionHelper.CANCELLED;
                subscription.cancel();
            }
        }
    }
}
