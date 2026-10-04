package io.reactivex.rxjava3.processors;

import androidx.compose.animation.core.C1598m0;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import yc.c;
import yc.e;
import yc.f;

/* JADX INFO: loaded from: classes7.dex */
public final class PublishProcessor<T> extends a<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final PublishSubscription[] f212031d = new PublishSubscription[0];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final PublishSubscription[] f212032e = new PublishSubscription[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference<PublishSubscription<T>[]> f212033b = new AtomicReference<>(f212032e);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Throwable f212034c;

    public static final class PublishSubscription<T> extends AtomicLong implements Subscription {
        private static final long serialVersionUID = 3562861878281475070L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Subscriber<? super T> f212035a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PublishProcessor<T> f212036b;

        public PublishSubscription(Subscriber<? super T> actual, PublishProcessor<T> parent) {
            this.f212035a = actual;
            this.f212036b = parent;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.f212036b.n9(this);
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
                this.f212035a.onComplete();
            }
        }

        public void i(Throwable t10) {
            if (get() != Long.MIN_VALUE) {
                this.f212035a.onError(t10);
            } else {
                Ic.a.Y(t10);
            }
        }

        public void j(T t10) {
            long j10 = get();
            if (j10 == Long.MIN_VALUE) {
                return;
            }
            if (j10 != 0) {
                this.f212035a.onNext(t10);
                io.reactivex.rxjava3.internal.util.b.f(this, 1L);
            } else {
                cancel();
                this.f212035a.onError(new MissingBackpressureException("Could not emit value due to lack of requests"));
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long n10) {
            if (SubscriptionHelper.validate(n10)) {
                io.reactivex.rxjava3.internal.util.b.b(this, n10);
            }
        }
    }

    @e
    @c
    public static <T> PublishProcessor<T> l9() {
        return new PublishProcessor<>();
    }

    @Override // zc.AbstractC5902t
    public void G6(@e Subscriber<? super T> t10) {
        PublishSubscription<T> publishSubscription = new PublishSubscription<>(t10, this);
        t10.onSubscribe(publishSubscription);
        if (k9(publishSubscription)) {
            if (publishSubscription.d()) {
                n9(publishSubscription);
            }
        } else {
            Throwable th = this.f212034c;
            if (th != null) {
                t10.onError(th);
            } else {
                t10.onComplete();
            }
        }
    }

    @Override // io.reactivex.rxjava3.processors.a
    @f
    @c
    public Throwable f9() {
        if (this.f212033b.get() == f212031d) {
            return this.f212034c;
        }
        return null;
    }

    @Override // io.reactivex.rxjava3.processors.a
    @c
    public boolean g9() {
        return this.f212033b.get() == f212031d && this.f212034c == null;
    }

    @Override // io.reactivex.rxjava3.processors.a
    @c
    public boolean h9() {
        return this.f212033b.get().length != 0;
    }

    @Override // io.reactivex.rxjava3.processors.a
    @c
    public boolean i9() {
        return this.f212033b.get() == f212031d && this.f212034c != null;
    }

    public boolean k9(PublishSubscription<T> ps) {
        PublishSubscription<T>[] publishSubscriptionArr;
        PublishSubscription[] publishSubscriptionArr2;
        do {
            publishSubscriptionArr = this.f212033b.get();
            if (publishSubscriptionArr == f212031d) {
                return false;
            }
            int length = publishSubscriptionArr.length;
            publishSubscriptionArr2 = new PublishSubscription[length + 1];
            System.arraycopy(publishSubscriptionArr, 0, publishSubscriptionArr2, 0, length);
            publishSubscriptionArr2[length] = ps;
        } while (!C1598m0.a(this.f212033b, publishSubscriptionArr, publishSubscriptionArr2));
        return true;
    }

    @c
    public boolean m9(@e T t10) {
        ExceptionHelper.d(t10, "offer called with a null value.");
        PublishSubscription<T>[] publishSubscriptionArr = this.f212033b.get();
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

    public void n9(PublishSubscription<T> ps) {
        PublishSubscription<T>[] publishSubscriptionArr;
        PublishSubscription[] publishSubscriptionArr2;
        do {
            publishSubscriptionArr = this.f212033b.get();
            if (publishSubscriptionArr == f212031d || publishSubscriptionArr == f212032e) {
                return;
            }
            int length = publishSubscriptionArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    i10 = -1;
                    break;
                } else if (publishSubscriptionArr[i10] == ps) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 < 0) {
                return;
            }
            if (length == 1) {
                publishSubscriptionArr2 = f212032e;
            } else {
                PublishSubscription[] publishSubscriptionArr3 = new PublishSubscription[length - 1];
                System.arraycopy(publishSubscriptionArr, 0, publishSubscriptionArr3, 0, i10);
                System.arraycopy(publishSubscriptionArr, i10 + 1, publishSubscriptionArr3, i10, (length - i10) - 1);
                publishSubscriptionArr2 = publishSubscriptionArr3;
            }
        } while (!C1598m0.a(this.f212033b, publishSubscriptionArr, publishSubscriptionArr2));
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        PublishSubscription<T>[] publishSubscriptionArr = this.f212033b.get();
        PublishSubscription<T>[] publishSubscriptionArr2 = f212031d;
        if (publishSubscriptionArr == publishSubscriptionArr2) {
            return;
        }
        for (PublishSubscription<T> publishSubscription : this.f212033b.getAndSet(publishSubscriptionArr2)) {
            publishSubscription.h();
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(@e Throwable t10) {
        ExceptionHelper.d(t10, "onError called with a null Throwable.");
        PublishSubscription<T>[] publishSubscriptionArr = this.f212033b.get();
        PublishSubscription<T>[] publishSubscriptionArr2 = f212031d;
        if (publishSubscriptionArr == publishSubscriptionArr2) {
            Ic.a.Y(t10);
            return;
        }
        this.f212034c = t10;
        for (PublishSubscription<T> publishSubscription : this.f212033b.getAndSet(publishSubscriptionArr2)) {
            publishSubscription.i(t10);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(@e T t10) {
        ExceptionHelper.d(t10, "onNext called with a null value.");
        for (PublishSubscription<T> publishSubscription : this.f212033b.get()) {
            publishSubscription.j(t10);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onSubscribe(@e Subscription s10) {
        if (this.f212033b.get() == f212031d) {
            s10.cancel();
        } else {
            s10.request(Long.MAX_VALUE);
        }
    }
}
