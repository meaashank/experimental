package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;
import zc.InterfaceC5907y;

/* JADX INFO: loaded from: classes7.dex */
public abstract class r<T> extends CompletableFuture<T> implements InterfaceC5907y<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference<Subscription> f207551a = new AtomicReference<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public T f207552b;

    public abstract void a(Subscription s10);

    public final void b() {
        SubscriptionHelper.cancel(this.f207551a);
    }

    public final void c() {
        this.f207552b = null;
        this.f207551a.lazySet(SubscriptionHelper.CANCELLED);
    }

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
    public final boolean cancel(boolean mayInterruptIfRunning) {
        b();
        return super.cancel(mayInterruptIfRunning);
    }

    @Override // java.util.concurrent.CompletableFuture
    public final boolean complete(T value) {
        b();
        return super.complete(value);
    }

    @Override // java.util.concurrent.CompletableFuture
    public final boolean completeExceptionally(Throwable ex) {
        b();
        return super.completeExceptionally(ex);
    }

    @Override // org.reactivestreams.Subscriber
    public final void onError(Throwable t10) {
        c();
        if (completeExceptionally(t10)) {
            return;
        }
        Ic.a.Y(t10);
    }

    @Override // zc.InterfaceC5907y, org.reactivestreams.Subscriber
    public final void onSubscribe(@yc.e Subscription s10) {
        if (SubscriptionHelper.setOnce(this.f207551a, s10)) {
            a(s10);
        }
    }
}
