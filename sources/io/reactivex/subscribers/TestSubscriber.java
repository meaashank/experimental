package io.reactivex.subscribers;

import androidx.collection.N0;
import androidx.compose.animation.core.C1598m0;
import hc.InterfaceC4535o;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.observers.BaseTestConsumer;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC5271g;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import pc.l;

/* JADX INFO: loaded from: classes7.dex */
public class TestSubscriber<T> extends BaseTestConsumer<T, TestSubscriber<T>> implements InterfaceC4535o<T>, Subscription, io.reactivex.disposables.b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Subscriber<? super T> f212418k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile boolean f212419l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final AtomicReference<Subscription> f212420m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final AtomicLong f212421n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public l<T> f212422o;

    public enum EmptySubscriber implements InterfaceC4535o<Object> {
        INSTANCE;

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
        }

        @Override // hc.InterfaceC4535o, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription subscription) {
        }
    }

    public TestSubscriber() {
        this(EmptySubscriber.INSTANCE, Long.MAX_VALUE);
    }

    public static <T> TestSubscriber<T> i0() {
        return new TestSubscriber<>();
    }

    public static <T> TestSubscriber<T> j0(long j10) {
        return new TestSubscriber<>(j10);
    }

    public static <T> TestSubscriber<T> k0(Subscriber<? super T> subscriber) {
        return new TestSubscriber<>(subscriber);
    }

    public static String l0(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? N0.a("Unknown(", i10, ")") : "ASYNC" : "SYNC" : "NONE";
    }

    public final TestSubscriber<T> c0() {
        if (this.f212422o != null) {
            return this;
        }
        throw new AssertionError("Upstream is not fuseable.");
    }

    @Override // org.reactivestreams.Subscription
    public final void cancel() {
        if (this.f212419l) {
            return;
        }
        this.f212419l = true;
        SubscriptionHelper.cancel(this.f212420m);
    }

    public final TestSubscriber<T> d0(int i10) {
        int i11 = this.f207216h;
        if (i11 == i10) {
            return this;
        }
        if (this.f212422o == null) {
            throw T("Upstream is not fuseable");
        }
        throw new AssertionError("Fusion mode different. Expected: " + l0(i10) + ", actual: " + l0(i11));
    }

    @Override // io.reactivex.disposables.b
    public final void dispose() {
        cancel();
    }

    public final TestSubscriber<T> e0() {
        if (this.f212422o == null) {
            return this;
        }
        throw new AssertionError("Upstream is fuseable.");
    }

    public final TestSubscriber<T> f0() {
        if (this.f212420m.get() != null) {
            throw T("Subscribed!");
        }
        if (this.f207211c.isEmpty()) {
            return this;
        }
        throw T("Not subscribed but errors found");
    }

    public final TestSubscriber<T> g0(InterfaceC5271g<? super TestSubscriber<T>> interfaceC5271g) {
        try {
            interfaceC5271g.accept(this);
            return this;
        } catch (Throwable th) {
            throw ExceptionHelper.e(th);
        }
    }

    public final TestSubscriber<T> h0() {
        if (this.f212420m.get() != null) {
            return this;
        }
        throw T("Not subscribed!");
    }

    @Override // io.reactivex.disposables.b
    public final boolean isDisposed() {
        return this.f212419l;
    }

    public final boolean m0() {
        return this.f212420m.get() != null;
    }

    public final boolean n0() {
        return this.f212419l;
    }

    public void o0() {
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        if (!this.f207214f) {
            this.f207214f = true;
            if (this.f212420m.get() == null) {
                this.f207211c.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.f207213e = Thread.currentThread();
            this.f207212d++;
            this.f212418k.onComplete();
        } finally {
            this.f207209a.countDown();
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th) {
        if (!this.f207214f) {
            this.f207214f = true;
            if (this.f212420m.get() == null) {
                this.f207211c.add(new NullPointerException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.f207213e = Thread.currentThread();
            this.f207211c.add(th);
            if (th == null) {
                this.f207211c.add(new IllegalStateException("onError received a null Throwable"));
            }
            this.f212418k.onError(th);
            this.f207209a.countDown();
        } catch (Throwable th2) {
            this.f207209a.countDown();
            throw th2;
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t10) {
        if (!this.f207214f) {
            this.f207214f = true;
            if (this.f212420m.get() == null) {
                this.f207211c.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        this.f207213e = Thread.currentThread();
        if (this.f207216h != 2) {
            this.f207210b.add(t10);
            if (t10 == null) {
                this.f207211c.add(new NullPointerException("onNext received a null value"));
            }
            this.f212418k.onNext(t10);
            return;
        }
        while (true) {
            try {
                T tPoll = this.f212422o.poll();
                if (tPoll == null) {
                    return;
                } else {
                    this.f207210b.add(tPoll);
                }
            } catch (Throwable th) {
                this.f207211c.add(th);
                this.f212422o.cancel();
                return;
            }
        }
    }

    @Override // hc.InterfaceC4535o, org.reactivestreams.Subscriber
    public void onSubscribe(Subscription subscription) {
        this.f207213e = Thread.currentThread();
        if (subscription == null) {
            this.f207211c.add(new NullPointerException("onSubscribe received a null Subscription"));
            return;
        }
        if (!C1598m0.a(this.f212420m, null, subscription)) {
            subscription.cancel();
            if (this.f212420m.get() != SubscriptionHelper.CANCELLED) {
                this.f207211c.add(new IllegalStateException("onSubscribe received multiple subscriptions: " + subscription));
                return;
            }
            return;
        }
        int i10 = this.f207215g;
        if (i10 != 0 && (subscription instanceof l)) {
            l<T> lVar = (l) subscription;
            this.f212422o = lVar;
            int iRequestFusion = lVar.requestFusion(i10);
            this.f207216h = iRequestFusion;
            if (iRequestFusion == 1) {
                this.f207214f = true;
                this.f207213e = Thread.currentThread();
                while (true) {
                    try {
                        T tPoll = this.f212422o.poll();
                        if (tPoll == null) {
                            this.f207212d++;
                            return;
                        }
                        this.f207210b.add(tPoll);
                    } catch (Throwable th) {
                        this.f207211c.add(th);
                        return;
                    }
                }
            }
        }
        this.f212418k.onSubscribe(subscription);
        long andSet = this.f212421n.getAndSet(0L);
        if (andSet != 0) {
            subscription.request(andSet);
        }
    }

    public final TestSubscriber<T> p0(long j10) {
        request(j10);
        return this;
    }

    @Override // io.reactivex.observers.BaseTestConsumer
    public /* bridge */ /* synthetic */ BaseTestConsumer q() {
        f0();
        return this;
    }

    public final TestSubscriber<T> q0(int i10) {
        this.f207215g = i10;
        return this;
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j10) {
        SubscriptionHelper.deferredRequest(this.f212420m, this.f212421n, j10);
    }

    @Override // io.reactivex.observers.BaseTestConsumer
    public /* bridge */ /* synthetic */ BaseTestConsumer t() {
        h0();
        return this;
    }

    public TestSubscriber(long j10) {
        this(EmptySubscriber.INSTANCE, j10);
    }

    public TestSubscriber(Subscriber<? super T> subscriber) {
        this(subscriber, Long.MAX_VALUE);
    }

    public TestSubscriber(Subscriber<? super T> subscriber, long j10) {
        if (j10 >= 0) {
            this.f212418k = subscriber;
            this.f212420m = new AtomicReference<>();
            this.f212421n = new AtomicLong(j10);
            return;
        }
        throw new IllegalArgumentException("Negative initial request not allowed");
    }
}
