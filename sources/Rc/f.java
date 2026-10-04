package rc;

import androidx.compose.animation.core.C1598m0;
import hc.InterfaceC4535o;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;
import uc.C5666a;

/* JADX INFO: loaded from: classes7.dex */
public final class f<T> extends CountDownLatch implements InterfaceC4535o<T>, Future<T>, Subscription {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public T f237557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Throwable f237558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference<Subscription> f237559c;

    public f() {
        super(1);
        this.f237559c = new AtomicReference<>();
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        Subscription subscription;
        SubscriptionHelper subscriptionHelper;
        do {
            subscription = this.f237559c.get();
            if (subscription == this || subscription == (subscriptionHelper = SubscriptionHelper.CANCELLED)) {
                return false;
            }
        } while (!C1598m0.a(this.f237559c, subscription, subscriptionHelper));
        if (subscription != null) {
            subscription.cancel();
        }
        countDown();
        return true;
    }

    @Override // java.util.concurrent.Future
    public T get() throws ExecutionException, InterruptedException {
        if (getCount() != 0) {
            io.reactivex.internal.util.c.b();
            await();
        }
        if (isCancelled()) {
            throw new CancellationException();
        }
        Throwable th = this.f237558b;
        if (th == null) {
            return this.f237557a;
        }
        throw new ExecutionException(th);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return SubscriptionHelper.isCancelled(this.f237559c.get());
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return getCount() == 0;
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        Subscription subscription;
        if (this.f237557a == null) {
            onError(new NoSuchElementException("The source is empty"));
            return;
        }
        do {
            subscription = this.f237559c.get();
            if (subscription == this || subscription == SubscriptionHelper.CANCELLED) {
                return;
            }
        } while (!C1598m0.a(this.f237559c, subscription, this));
        countDown();
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th) {
        Subscription subscription;
        do {
            subscription = this.f237559c.get();
            if (subscription == this || subscription == SubscriptionHelper.CANCELLED) {
                C5666a.Y(th);
                return;
            }
            this.f237558b = th;
        } while (!C1598m0.a(this.f237559c, subscription, this));
        countDown();
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t10) {
        if (this.f237557a == null) {
            this.f237557a = t10;
        } else {
            this.f237559c.get().cancel();
            onError(new IndexOutOfBoundsException("More than one element received"));
        }
    }

    @Override // hc.InterfaceC4535o, org.reactivestreams.Subscriber
    public void onSubscribe(Subscription subscription) {
        SubscriptionHelper.setOnce(this.f237559c, subscription, Long.MAX_VALUE);
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
    }

    @Override // java.util.concurrent.Future
    public T get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (getCount() != 0) {
            io.reactivex.internal.util.c.b();
            if (!await(j10, timeUnit)) {
                throw new TimeoutException();
            }
        }
        if (!isCancelled()) {
            Throwable th = this.f237558b;
            if (th == null) {
                return this.f237557a;
            }
            throw new ExecutionException(th);
        }
        throw new CancellationException();
    }

    @Override // org.reactivestreams.Subscription
    public void request(long j10) {
    }
}
