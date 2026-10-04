package io.reactivex.processors;

import androidx.compose.animation.core.C1598m0;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import lc.InterfaceC5190c;
import lc.e;
import lc.f;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import uc.C5666a;

/* JADX INFO: loaded from: classes7.dex */
public final class PublishProcessor<T> extends a<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final PublishSubscription[] f207286d = new PublishSubscription[0];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final PublishSubscription[] f207287e = new PublishSubscription[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference<PublishSubscription<T>[]> f207288b = new AtomicReference<>(f207287e);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Throwable f207289c;

    public static final class PublishSubscription<T> extends AtomicLong implements Subscription {
        private static final long serialVersionUID = 3562861878281475070L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Subscriber<? super T> f207290a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PublishProcessor<T> f207291b;

        public PublishSubscription(Subscriber<? super T> subscriber, PublishProcessor<T> publishProcessor) {
            this.f207290a = subscriber;
            this.f207291b = publishProcessor;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.f207291b.N8(this);
            }
        }

        public boolean d() {
            return get() == Long.MIN_VALUE;
        }

        public boolean g() {
            return get() == 0;
        }

        public void h() {
            if (get() != Long.MIN_VALUE) {
                this.f207290a.onComplete();
            }
        }

        public void i(Throwable th) {
            if (get() != Long.MIN_VALUE) {
                this.f207290a.onError(th);
            } else {
                C5666a.Y(th);
            }
        }

        public void j(T t10) {
            long j10 = get();
            if (j10 == Long.MIN_VALUE) {
                return;
            }
            if (j10 != 0) {
                this.f207290a.onNext(t10);
                io.reactivex.internal.util.b.f(this, 1L);
            } else {
                cancel();
                this.f207290a.onError(new MissingBackpressureException("Could not emit value due to lack of requests"));
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                io.reactivex.internal.util.b.b(this, j10);
            }
        }
    }

    @e
    @InterfaceC5190c
    public static <T> PublishProcessor<T> L8() {
        return new PublishProcessor<>();
    }

    @Override // io.reactivex.processors.a
    @f
    public Throwable F8() {
        if (this.f207288b.get() == f207286d) {
            return this.f207289c;
        }
        return null;
    }

    @Override // io.reactivex.processors.a
    public boolean G8() {
        return this.f207288b.get() == f207286d && this.f207289c == null;
    }

    @Override // io.reactivex.processors.a
    public boolean H8() {
        return this.f207288b.get().length != 0;
    }

    @Override // io.reactivex.processors.a
    public boolean I8() {
        return this.f207288b.get() == f207286d && this.f207289c != null;
    }

    public boolean K8(PublishSubscription<T> publishSubscription) {
        PublishSubscription<T>[] publishSubscriptionArr;
        PublishSubscription[] publishSubscriptionArr2;
        do {
            publishSubscriptionArr = this.f207288b.get();
            if (publishSubscriptionArr == f207286d) {
                return false;
            }
            int length = publishSubscriptionArr.length;
            publishSubscriptionArr2 = new PublishSubscription[length + 1];
            System.arraycopy(publishSubscriptionArr, 0, publishSubscriptionArr2, 0, length);
            publishSubscriptionArr2[length] = publishSubscription;
        } while (!C1598m0.a(this.f207288b, publishSubscriptionArr, publishSubscriptionArr2));
        return true;
    }

    public boolean M8(T t10) {
        if (t10 == null) {
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return true;
        }
        PublishSubscription<T>[] publishSubscriptionArr = this.f207288b.get();
        for (PublishSubscription<T> publishSubscription : publishSubscriptionArr) {
            if (publishSubscription.g()) {
                return false;
            }
        }
        for (PublishSubscription<T> publishSubscription2 : publishSubscriptionArr) {
            publishSubscription2.j(t10);
        }
        return true;
    }

    public void N8(PublishSubscription<T> publishSubscription) {
        PublishSubscription<T>[] publishSubscriptionArr;
        PublishSubscription[] publishSubscriptionArr2;
        do {
            publishSubscriptionArr = this.f207288b.get();
            if (publishSubscriptionArr == f207286d || publishSubscriptionArr == f207287e) {
                return;
            }
            int length = publishSubscriptionArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    i10 = -1;
                    break;
                } else if (publishSubscriptionArr[i10] == publishSubscription) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 < 0) {
                return;
            }
            if (length == 1) {
                publishSubscriptionArr2 = f207287e;
            } else {
                PublishSubscription[] publishSubscriptionArr3 = new PublishSubscription[length - 1];
                System.arraycopy(publishSubscriptionArr, 0, publishSubscriptionArr3, 0, i10);
                System.arraycopy(publishSubscriptionArr, i10 + 1, publishSubscriptionArr3, i10, (length - i10) - 1);
                publishSubscriptionArr2 = publishSubscriptionArr3;
            }
        } while (!C1598m0.a(this.f207288b, publishSubscriptionArr, publishSubscriptionArr2));
    }

    @Override // hc.AbstractC4530j
    public void d6(Subscriber<? super T> subscriber) {
        PublishSubscription<T> publishSubscription = new PublishSubscription<>(subscriber, this);
        subscriber.onSubscribe(publishSubscription);
        if (K8(publishSubscription)) {
            if (publishSubscription.d()) {
                N8(publishSubscription);
            }
        } else {
            Throwable th = this.f207289c;
            if (th != null) {
                subscriber.onError(th);
            } else {
                subscriber.onComplete();
            }
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        PublishSubscription<T>[] publishSubscriptionArr = this.f207288b.get();
        PublishSubscription<T>[] publishSubscriptionArr2 = f207286d;
        if (publishSubscriptionArr == publishSubscriptionArr2) {
            return;
        }
        for (PublishSubscription<T> publishSubscription : this.f207288b.getAndSet(publishSubscriptionArr2)) {
            publishSubscription.h();
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th) {
        io.reactivex.internal.functions.a.g(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        PublishSubscription<T>[] publishSubscriptionArr = this.f207288b.get();
        PublishSubscription<T>[] publishSubscriptionArr2 = f207286d;
        if (publishSubscriptionArr == publishSubscriptionArr2) {
            C5666a.Y(th);
            return;
        }
        this.f207289c = th;
        for (PublishSubscription<T> publishSubscription : this.f207288b.getAndSet(publishSubscriptionArr2)) {
            publishSubscription.i(th);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t10) {
        io.reactivex.internal.functions.a.g(t10, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (PublishSubscription<T> publishSubscription : this.f207288b.get()) {
            publishSubscription.j(t10);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onSubscribe(Subscription subscription) {
        if (this.f207288b.get() == f207286d) {
            subscription.cancel();
        } else {
            subscription.request(Long.MAX_VALUE);
        }
    }
}
