package io.reactivex.subscribers;

import hc.InterfaceC4535o;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.f;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes7.dex */
public abstract class b<T> implements InterfaceC4535o<T>, io.reactivex.disposables.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference<Subscription> f212424a = new AtomicReference<>();

    public final void a() {
        dispose();
    }

    public void b() {
        this.f212424a.get().request(Long.MAX_VALUE);
    }

    public final void c(long j10) {
        this.f212424a.get().request(j10);
    }

    @Override // io.reactivex.disposables.b
    public final void dispose() {
        SubscriptionHelper.cancel(this.f212424a);
    }

    @Override // io.reactivex.disposables.b
    public final boolean isDisposed() {
        return this.f212424a.get() == SubscriptionHelper.CANCELLED;
    }

    @Override // hc.InterfaceC4535o, org.reactivestreams.Subscriber
    public final void onSubscribe(Subscription subscription) {
        if (f.d(this.f212424a, subscription, getClass())) {
            b();
        }
    }
}
