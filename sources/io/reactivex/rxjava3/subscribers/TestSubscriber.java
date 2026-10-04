package io.reactivex.rxjava3.subscribers;

import androidx.compose.animation.core.C1598m0;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import zc.InterfaceC5907y;

/* JADX INFO: loaded from: classes7.dex */
public class TestSubscriber<T> extends io.reactivex.rxjava3.observers.a<T, TestSubscriber<T>> implements InterfaceC5907y<T>, Subscription {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Subscriber<? super T> f212180i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile boolean f212181j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicReference<Subscription> f212182k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicLong f212183l;

    public enum EmptySubscriber implements InterfaceC5907y<Object> {
        INSTANCE;

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable t10) {
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object t10) {
        }

        @Override // zc.InterfaceC5907y, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription s10) {
        }
    }

    public TestSubscriber() {
        this(EmptySubscriber.INSTANCE, Long.MAX_VALUE);
    }

    @yc.e
    public static <T> TestSubscriber<T> D() {
        return new TestSubscriber<>();
    }

    @yc.e
    public static <T> TestSubscriber<T> E(long initialRequested) {
        return new TestSubscriber<>(initialRequested);
    }

    public static <T> TestSubscriber<T> F(@yc.e Subscriber<? super T> delegate) {
        return new TestSubscriber<>(delegate);
    }

    public final TestSubscriber<T> C() {
        if (this.f212182k.get() != null) {
            return this;
        }
        throw y("Not subscribed!");
    }

    public final boolean G() {
        return this.f212182k.get() != null;
    }

    public final boolean H() {
        return this.f212181j;
    }

    public void I() {
    }

    public final TestSubscriber<T> J(long n10) {
        request(n10);
        return this;
    }

    @Override // org.reactivestreams.Subscription
    public final void cancel() {
        if (this.f212181j) {
            return;
        }
        this.f212181j = true;
        SubscriptionHelper.cancel(this.f212182k);
    }

    @Override // io.reactivex.rxjava3.observers.a, io.reactivex.rxjava3.disposables.d
    public final void dispose() {
        cancel();
    }

    @Override // io.reactivex.rxjava3.observers.a, io.reactivex.rxjava3.disposables.d
    public final boolean isDisposed() {
        return this.f212181j;
    }

    @Override // io.reactivex.rxjava3.observers.a
    public /* bridge */ /* synthetic */ io.reactivex.rxjava3.observers.a l() {
        C();
        return this;
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        if (!this.f211965f) {
            this.f211965f = true;
            if (this.f212182k.get() == null) {
                this.f211962c.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.f211964e = Thread.currentThread();
            this.f211963d++;
            this.f212180i.onComplete();
        } finally {
            this.f211960a.countDown();
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(@yc.e Throwable t10) {
        if (!this.f211965f) {
            this.f211965f = true;
            if (this.f212182k.get() == null) {
                this.f211962c.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.f211964e = Thread.currentThread();
            if (t10 == null) {
                this.f211962c.add(new NullPointerException("onError received a null Throwable"));
            } else {
                this.f211962c.add(t10);
            }
            this.f212180i.onError(t10);
            this.f211960a.countDown();
        } catch (Throwable th) {
            this.f211960a.countDown();
            throw th;
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(@yc.e T t10) {
        if (!this.f211965f) {
            this.f211965f = true;
            if (this.f212182k.get() == null) {
                this.f211962c.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        this.f211964e = Thread.currentThread();
        this.f211961b.add(t10);
        if (t10 == null) {
            this.f211962c.add(new NullPointerException("onNext received a null value"));
        }
        this.f212180i.onNext(t10);
    }

    @Override // zc.InterfaceC5907y, org.reactivestreams.Subscriber
    public void onSubscribe(@yc.e Subscription s10) {
        this.f211964e = Thread.currentThread();
        if (s10 == null) {
            this.f211962c.add(new NullPointerException("onSubscribe received a null Subscription"));
            return;
        }
        if (C1598m0.a(this.f212182k, null, s10)) {
            this.f212180i.onSubscribe(s10);
            long andSet = this.f212183l.getAndSet(0L);
            if (andSet != 0) {
                s10.request(andSet);
                return;
            }
            return;
        }
        s10.cancel();
        if (this.f212182k.get() != SubscriptionHelper.CANCELLED) {
            this.f211962c.add(new IllegalStateException("onSubscribe received multiple subscriptions: " + s10));
        }
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long n10) {
        SubscriptionHelper.deferredRequest(this.f212182k, this.f212183l, n10);
    }

    public TestSubscriber(long initialRequest) {
        this(EmptySubscriber.INSTANCE, initialRequest);
    }

    public TestSubscriber(@yc.e Subscriber<? super T> downstream) {
        this(downstream, Long.MAX_VALUE);
    }

    public TestSubscriber(@yc.e Subscriber<? super T> actual, long initialRequest) {
        if (initialRequest >= 0) {
            this.f212180i = actual;
            this.f212182k = new AtomicReference<>();
            this.f212183l = new AtomicLong(initialRequest);
            return;
        }
        throw new IllegalArgumentException("Negative initial request not allowed");
    }
}
