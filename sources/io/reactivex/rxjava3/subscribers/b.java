package io.reactivex.rxjava3.subscribers;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.f;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;
import zc.InterfaceC5907y;

/* JADX INFO: loaded from: classes7.dex */
public abstract class b<T> implements InterfaceC5907y<T>, io.reactivex.rxjava3.disposables.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference<Subscription> f212185a = new AtomicReference<>();

    public final void a() {
        dispose();
    }

    public void b() {
        this.f212185a.get().request(Long.MAX_VALUE);
    }

    public final void c(long n10) {
        this.f212185a.get().request(n10);
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final void dispose() {
        SubscriptionHelper.cancel(this.f212185a);
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final boolean isDisposed() {
        return this.f212185a.get() == SubscriptionHelper.CANCELLED;
    }

    @Override // zc.InterfaceC5907y, org.reactivestreams.Subscriber
    public final void onSubscribe(Subscription s10) {
        if (f.d(this.f212185a, s10, getClass())) {
            b();
        }
    }
}
