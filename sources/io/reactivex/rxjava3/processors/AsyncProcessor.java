package io.reactivex.rxjava3.processors;

import androidx.compose.animation.core.C1598m0;
import io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import yc.c;
import yc.e;
import yc.f;

/* JADX INFO: loaded from: classes7.dex */
public final class AsyncProcessor<T> extends a<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AsyncSubscription[] f211991e = new AsyncSubscription[0];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AsyncSubscription[] f211992f = new AsyncSubscription[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference<AsyncSubscription<T>[]> f211993b = new AtomicReference<>(f211991e);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Throwable f211994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public T f211995d;

    public static final class AsyncSubscription<T> extends DeferredScalarSubscription<T> {
        private static final long serialVersionUID = 5629876084736248016L;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final AsyncProcessor<T> f211996k;

        public AsyncSubscription(Subscriber<? super T> actual, AsyncProcessor<T> parent) {
            super(actual);
            this.f211996k = parent;
        }

        @Override // io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public void cancel() {
            if (m()) {
                this.f211996k.o9(this);
            }
        }

        public void onComplete() {
            if (k()) {
                return;
            }
            this.f211917a.onComplete();
        }

        public void onError(Throwable t10) {
            if (k()) {
                Ic.a.Y(t10);
            } else {
                this.f211917a.onError(t10);
            }
        }
    }

    @e
    @c
    public static <T> AsyncProcessor<T> l9() {
        return new AsyncProcessor<>();
    }

    @Override // zc.AbstractC5902t
    public void G6(@e Subscriber<? super T> s10) {
        AsyncSubscription<T> asyncSubscription = new AsyncSubscription<>(s10, this);
        s10.onSubscribe(asyncSubscription);
        if (k9(asyncSubscription)) {
            if (asyncSubscription.k()) {
                o9(asyncSubscription);
                return;
            }
            return;
        }
        Throwable th = this.f211994c;
        if (th != null) {
            s10.onError(th);
            return;
        }
        T t10 = this.f211995d;
        if (t10 != null) {
            asyncSubscription.b(t10);
        } else {
            asyncSubscription.onComplete();
        }
    }

    @Override // io.reactivex.rxjava3.processors.a
    @f
    @c
    public Throwable f9() {
        if (this.f211993b.get() == f211992f) {
            return this.f211994c;
        }
        return null;
    }

    @Override // io.reactivex.rxjava3.processors.a
    @c
    public boolean g9() {
        return this.f211993b.get() == f211992f && this.f211994c == null;
    }

    @Override // io.reactivex.rxjava3.processors.a
    @c
    public boolean h9() {
        return this.f211993b.get().length != 0;
    }

    @Override // io.reactivex.rxjava3.processors.a
    @c
    public boolean i9() {
        return this.f211993b.get() == f211992f && this.f211994c != null;
    }

    public boolean k9(AsyncSubscription<T> ps) {
        AsyncSubscription<T>[] asyncSubscriptionArr;
        AsyncSubscription[] asyncSubscriptionArr2;
        do {
            asyncSubscriptionArr = this.f211993b.get();
            if (asyncSubscriptionArr == f211992f) {
                return false;
            }
            int length = asyncSubscriptionArr.length;
            asyncSubscriptionArr2 = new AsyncSubscription[length + 1];
            System.arraycopy(asyncSubscriptionArr, 0, asyncSubscriptionArr2, 0, length);
            asyncSubscriptionArr2[length] = ps;
        } while (!C1598m0.a(this.f211993b, asyncSubscriptionArr, asyncSubscriptionArr2));
        return true;
    }

    @f
    @c
    public T m9() {
        if (this.f211993b.get() == f211992f) {
            return this.f211995d;
        }
        return null;
    }

    @c
    public boolean n9() {
        return this.f211993b.get() == f211992f && this.f211995d != null;
    }

    public void o9(AsyncSubscription<T> ps) {
        AsyncSubscription<T>[] asyncSubscriptionArr;
        AsyncSubscription[] asyncSubscriptionArr2;
        do {
            asyncSubscriptionArr = this.f211993b.get();
            int length = asyncSubscriptionArr.length;
            if (length == 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    i10 = -1;
                    break;
                } else if (asyncSubscriptionArr[i10] == ps) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 < 0) {
                return;
            }
            if (length == 1) {
                asyncSubscriptionArr2 = f211991e;
            } else {
                AsyncSubscription[] asyncSubscriptionArr3 = new AsyncSubscription[length - 1];
                System.arraycopy(asyncSubscriptionArr, 0, asyncSubscriptionArr3, 0, i10);
                System.arraycopy(asyncSubscriptionArr, i10 + 1, asyncSubscriptionArr3, i10, (length - i10) - 1);
                asyncSubscriptionArr2 = asyncSubscriptionArr3;
            }
        } while (!C1598m0.a(this.f211993b, asyncSubscriptionArr, asyncSubscriptionArr2));
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        AsyncSubscription<T>[] asyncSubscriptionArr = this.f211993b.get();
        AsyncSubscription<T>[] asyncSubscriptionArr2 = f211992f;
        if (asyncSubscriptionArr == asyncSubscriptionArr2) {
            return;
        }
        T t10 = this.f211995d;
        AsyncSubscription<T>[] andSet = this.f211993b.getAndSet(asyncSubscriptionArr2);
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
    public void onError(@e Throwable t10) {
        ExceptionHelper.d(t10, "onError called with a null Throwable.");
        AsyncSubscription<T>[] asyncSubscriptionArr = this.f211993b.get();
        AsyncSubscription<T>[] asyncSubscriptionArr2 = f211992f;
        if (asyncSubscriptionArr == asyncSubscriptionArr2) {
            Ic.a.Y(t10);
            return;
        }
        this.f211995d = null;
        this.f211994c = t10;
        for (AsyncSubscription<T> asyncSubscription : this.f211993b.getAndSet(asyncSubscriptionArr2)) {
            asyncSubscription.onError(t10);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(@e T t10) {
        ExceptionHelper.d(t10, "onNext called with a null value.");
        if (this.f211993b.get() == f211992f) {
            return;
        }
        this.f211995d = t10;
    }

    @Override // org.reactivestreams.Subscriber
    public void onSubscribe(@e Subscription s10) {
        if (this.f211993b.get() == f211992f) {
            s10.cancel();
        } else {
            s10.request(Long.MAX_VALUE);
        }
    }
}
