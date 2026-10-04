package io.reactivex.processors;

import androidx.compose.animation.core.C1598m0;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import lc.InterfaceC5190c;
import lc.e;
import lc.f;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import uc.C5666a;

/* JADX INFO: loaded from: classes7.dex */
public final class AsyncProcessor<T> extends a<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AsyncSubscription[] f207245e = new AsyncSubscription[0];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AsyncSubscription[] f207246f = new AsyncSubscription[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference<AsyncSubscription<T>[]> f207247b = new AtomicReference<>(f207245e);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Throwable f207248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public T f207249d;

    public static final class AsyncSubscription<T> extends DeferredScalarSubscription<T> {
        private static final long serialVersionUID = 5629876084736248016L;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final AsyncProcessor<T> f207250k;

        public AsyncSubscription(Subscriber<? super T> subscriber, AsyncProcessor<T> asyncProcessor) {
            super(subscriber);
            this.f207250k = asyncProcessor;
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public void cancel() {
            if (m()) {
                this.f207250k.Q8(this);
            }
        }

        public void onComplete() {
            if (k()) {
                return;
            }
            this.f207169a.onComplete();
        }

        public void onError(Throwable th) {
            if (k()) {
                C5666a.Y(th);
            } else {
                this.f207169a.onError(th);
            }
        }
    }

    @e
    @InterfaceC5190c
    public static <T> AsyncProcessor<T> L8() {
        return new AsyncProcessor<>();
    }

    @Override // io.reactivex.processors.a
    @f
    public Throwable F8() {
        if (this.f207247b.get() == f207246f) {
            return this.f207248c;
        }
        return null;
    }

    @Override // io.reactivex.processors.a
    public boolean G8() {
        return this.f207247b.get() == f207246f && this.f207248c == null;
    }

    @Override // io.reactivex.processors.a
    public boolean H8() {
        return this.f207247b.get().length != 0;
    }

    @Override // io.reactivex.processors.a
    public boolean I8() {
        return this.f207247b.get() == f207246f && this.f207248c != null;
    }

    public boolean K8(AsyncSubscription<T> asyncSubscription) {
        AsyncSubscription<T>[] asyncSubscriptionArr;
        AsyncSubscription[] asyncSubscriptionArr2;
        do {
            asyncSubscriptionArr = this.f207247b.get();
            if (asyncSubscriptionArr == f207246f) {
                return false;
            }
            int length = asyncSubscriptionArr.length;
            asyncSubscriptionArr2 = new AsyncSubscription[length + 1];
            System.arraycopy(asyncSubscriptionArr, 0, asyncSubscriptionArr2, 0, length);
            asyncSubscriptionArr2[length] = asyncSubscription;
        } while (!C1598m0.a(this.f207247b, asyncSubscriptionArr, asyncSubscriptionArr2));
        return true;
    }

    @f
    public T M8() {
        if (this.f207247b.get() == f207246f) {
            return this.f207249d;
        }
        return null;
    }

    @Deprecated
    public Object[] N8() {
        T tM8 = M8();
        return tM8 != null ? new Object[]{tM8} : new Object[0];
    }

    @Deprecated
    public T[] O8(T[] tArr) {
        T tM8 = M8();
        if (tM8 == null) {
            if (tArr.length != 0) {
                tArr[0] = null;
            }
            return tArr;
        }
        if (tArr.length == 0) {
            tArr = (T[]) Arrays.copyOf(tArr, 1);
        }
        tArr[0] = tM8;
        if (tArr.length != 1) {
            tArr[1] = null;
        }
        return tArr;
    }

    public boolean P8() {
        return this.f207247b.get() == f207246f && this.f207249d != null;
    }

    public void Q8(AsyncSubscription<T> asyncSubscription) {
        AsyncSubscription<T>[] asyncSubscriptionArr;
        AsyncSubscription[] asyncSubscriptionArr2;
        do {
            asyncSubscriptionArr = this.f207247b.get();
            int length = asyncSubscriptionArr.length;
            if (length == 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    i10 = -1;
                    break;
                } else if (asyncSubscriptionArr[i10] == asyncSubscription) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 < 0) {
                return;
            }
            if (length == 1) {
                asyncSubscriptionArr2 = f207245e;
            } else {
                AsyncSubscription[] asyncSubscriptionArr3 = new AsyncSubscription[length - 1];
                System.arraycopy(asyncSubscriptionArr, 0, asyncSubscriptionArr3, 0, i10);
                System.arraycopy(asyncSubscriptionArr, i10 + 1, asyncSubscriptionArr3, i10, (length - i10) - 1);
                asyncSubscriptionArr2 = asyncSubscriptionArr3;
            }
        } while (!C1598m0.a(this.f207247b, asyncSubscriptionArr, asyncSubscriptionArr2));
    }

    @Override // hc.AbstractC4530j
    public void d6(Subscriber<? super T> subscriber) {
        AsyncSubscription<T> asyncSubscription = new AsyncSubscription<>(subscriber, this);
        subscriber.onSubscribe(asyncSubscription);
        if (K8(asyncSubscription)) {
            if (asyncSubscription.k()) {
                Q8(asyncSubscription);
                return;
            }
            return;
        }
        Throwable th = this.f207248c;
        if (th != null) {
            subscriber.onError(th);
            return;
        }
        T t10 = this.f207249d;
        if (t10 != null) {
            asyncSubscription.b(t10);
        } else {
            asyncSubscription.onComplete();
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        AsyncSubscription<T>[] asyncSubscriptionArr = this.f207247b.get();
        AsyncSubscription<T>[] asyncSubscriptionArr2 = f207246f;
        if (asyncSubscriptionArr == asyncSubscriptionArr2) {
            return;
        }
        T t10 = this.f207249d;
        AsyncSubscription<T>[] andSet = this.f207247b.getAndSet(asyncSubscriptionArr2);
        int i10 = 0;
        if (t10 == null) {
            int length = andSet.length;
            while (i10 < length) {
                andSet[i10].onComplete();
                i10++;
            }
            return;
        }
        int length2 = andSet.length;
        while (i10 < length2) {
            andSet[i10].b(t10);
            i10++;
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th) {
        io.reactivex.internal.functions.a.g(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        AsyncSubscription<T>[] asyncSubscriptionArr = this.f207247b.get();
        AsyncSubscription<T>[] asyncSubscriptionArr2 = f207246f;
        if (asyncSubscriptionArr == asyncSubscriptionArr2) {
            C5666a.Y(th);
            return;
        }
        this.f207249d = null;
        this.f207248c = th;
        for (AsyncSubscription<T> asyncSubscription : this.f207247b.getAndSet(asyncSubscriptionArr2)) {
            asyncSubscription.onError(th);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t10) {
        io.reactivex.internal.functions.a.g(t10, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f207247b.get() == f207246f) {
            return;
        }
        this.f207249d = t10;
    }

    @Override // org.reactivestreams.Subscriber
    public void onSubscribe(Subscription subscription) {
        if (this.f207247b.get() == f207246f) {
            subscription.cancel();
        } else {
            subscription.request(Long.MAX_VALUE);
        }
    }
}
