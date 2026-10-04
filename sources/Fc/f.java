package Fc;

import androidx.compose.animation.core.C1598m0;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;
import zc.InterfaceC5907y;

/* JADX INFO: loaded from: classes7.dex */
public final class f<T> extends CountDownLatch implements InterfaceC5907y<T>, Future<T>, Subscription {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public T f39919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Throwable f39920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference<Subscription> f39921c;

    public f() {
        super(1);
        this.f39921c = new AtomicReference<>();
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean mayInterruptIfRunning) {
        Subscription subscription;
        SubscriptionHelper subscriptionHelper;
        do {
            subscription = this.f39921c.get();
            if (subscription == this || subscription == (subscriptionHelper = SubscriptionHelper.CANCELLED)) {
                return false;
            }
        } while (!C1598m0.a(this.f39921c, subscription, subscriptionHelper));
        if (subscription != null) {
            subscription.cancel();
        }
        countDown();
        return true;
    }

    @Override // java.util.concurrent.Future
    public T get() throws ExecutionException, InterruptedException {
        if (getCount() != 0) {
            io.reactivex.rxjava3.internal.util.c.b();
            await();
        }
        if (isCancelled()) {
            throw new CancellationException();
        }
        Throwable th = this.f39920b;
        if (th == null) {
            return this.f39919a;
        }
        throw new ExecutionException(th);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f39921c.get() == SubscriptionHelper.CANCELLED;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return getCount() == 0;
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        if (this.f39919a == null) {
            onError(new NoSuchElementException("The source is empty"));
            return;
        }
        Subscription subscription = this.f39921c.get();
        if (subscription == this || subscription == SubscriptionHelper.CANCELLED || !C1598m0.a(this.f39921c, subscription, this)) {
            return;
        }
        countDown();
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable t10) {
        Subscription subscription;
        if (this.f39920b != null || (subscription = this.f39921c.get()) == this || subscription == SubscriptionHelper.CANCELLED || !C1598m0.a(this.f39921c, subscription, this)) {
            Ic.a.Y(t10);
        } else {
            this.f39920b = t10;
            countDown();
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t10) {
        if (this.f39919a == null) {
            this.f39919a = t10;
        } else {
            this.f39921c.get().cancel();
            onError(new IndexOutOfBoundsException("More than one element received"));
        }
    }

    @Override // zc.InterfaceC5907y, org.reactivestreams.Subscriber
    public void onSubscribe(Subscription s10) {
        SubscriptionHelper.setOnce(this.f39921c, s10, Long.MAX_VALUE);
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
    }

    @Override // java.util.concurrent.Future
    public T get(long timeout, @yc.e TimeUnit unit) throws ExecutionException, InterruptedException, TimeoutException {
        if (getCount() != 0) {
            io.reactivex.rxjava3.internal.util.c.b();
            if (!await(timeout, unit)) {
                throw new TimeoutException(ExceptionHelper.h(timeout, unit));
            }
        }
        if (!isCancelled()) {
            Throwable th = this.f39920b;
            if (th == null) {
                return this.f39919a;
            }
            throw new ExecutionException(th);
        }
        throw new CancellationException();
    }

    @Override // org.reactivestreams.Subscription
    public void request(long n10) {
    }
}
