package io.reactivex.processors;

import androidx.collection.C1522b;
import androidx.compose.animation.core.C1598m0;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.internal.util.a;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import lc.InterfaceC5190c;
import lc.e;
import lc.f;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import uc.C5666a;

/* JADX INFO: loaded from: classes7.dex */
public final class BehaviorProcessor<T> extends a<T> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Object[] f207251i = new Object[0];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final BehaviorSubscription[] f207252j = new BehaviorSubscription[0];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final BehaviorSubscription[] f207253k = new BehaviorSubscription[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference<BehaviorSubscription<T>[]> f207254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ReadWriteLock f207255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Lock f207256d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Lock f207257e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicReference<Object> f207258f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicReference<Throwable> f207259g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f207260h;

    public static final class BehaviorSubscription<T> extends AtomicLong implements Subscription, a.InterfaceC0777a<Object> {
        private static final long serialVersionUID = 3293175281126227086L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Subscriber<? super T> f207261a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BehaviorProcessor<T> f207262b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f207263c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f207264d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public io.reactivex.internal.util.a<Object> f207265e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f207266f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public volatile boolean f207267g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f207268h;

        public BehaviorSubscription(Subscriber<? super T> subscriber, BehaviorProcessor<T> behaviorProcessor) {
            this.f207261a = subscriber;
            this.f207262b = behaviorProcessor;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (this.f207267g) {
                return;
            }
            this.f207267g = true;
            this.f207262b.S8(this);
        }

        public void d() {
            if (this.f207267g) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.f207267g) {
                        return;
                    }
                    if (this.f207263c) {
                        return;
                    }
                    BehaviorProcessor<T> behaviorProcessor = this.f207262b;
                    Lock lock = behaviorProcessor.f207256d;
                    lock.lock();
                    this.f207268h = behaviorProcessor.f207260h;
                    Object obj = behaviorProcessor.f207258f.get();
                    lock.unlock();
                    this.f207264d = obj != null;
                    this.f207263c = true;
                    if (obj == null || test(obj)) {
                        return;
                    }
                    g();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void g() {
            io.reactivex.internal.util.a<Object> aVar;
            while (!this.f207267g) {
                synchronized (this) {
                    try {
                        aVar = this.f207265e;
                        if (aVar == null) {
                            this.f207264d = false;
                            return;
                        }
                        this.f207265e = null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                aVar.d(this);
            }
        }

        public void h(Object obj, long j10) {
            if (this.f207267g) {
                return;
            }
            if (!this.f207266f) {
                synchronized (this) {
                    try {
                        if (this.f207267g) {
                            return;
                        }
                        if (this.f207268h == j10) {
                            return;
                        }
                        if (this.f207264d) {
                            io.reactivex.internal.util.a<Object> aVar = this.f207265e;
                            if (aVar == null) {
                                aVar = new io.reactivex.internal.util.a<>(4);
                                this.f207265e = aVar;
                            }
                            aVar.c(obj);
                            return;
                        }
                        this.f207263c = true;
                        this.f207266f = true;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            test(obj);
        }

        public boolean i() {
            return get() == 0;
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                io.reactivex.internal.util.b.a(this, j10);
            }
        }

        @Override // io.reactivex.internal.util.a.InterfaceC0777a, nc.r
        public boolean test(Object obj) {
            if (this.f207267g) {
                return true;
            }
            if (NotificationLite.isComplete(obj)) {
                this.f207261a.onComplete();
                return true;
            }
            if (NotificationLite.isError(obj)) {
                this.f207261a.onError(NotificationLite.getError(obj));
                return true;
            }
            long j10 = get();
            if (j10 == 0) {
                cancel();
                this.f207261a.onError(new MissingBackpressureException("Could not deliver value due to lack of requests"));
                return true;
            }
            this.f207261a.onNext((Object) NotificationLite.getValue(obj));
            if (j10 == Long.MAX_VALUE) {
                return false;
            }
            decrementAndGet();
            return false;
        }
    }

    public BehaviorProcessor() {
        this.f207258f = new AtomicReference<>();
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f207255c = reentrantReadWriteLock;
        this.f207256d = reentrantReadWriteLock.readLock();
        this.f207257e = reentrantReadWriteLock.writeLock();
        this.f207254b = new AtomicReference<>(f207252j);
        this.f207259g = new AtomicReference<>();
    }

    @e
    @InterfaceC5190c
    public static <T> BehaviorProcessor<T> L8() {
        return new BehaviorProcessor<>();
    }

    @e
    @InterfaceC5190c
    public static <T> BehaviorProcessor<T> M8(T t10) {
        io.reactivex.internal.functions.a.g(t10, "defaultValue is null");
        return new BehaviorProcessor<>(t10);
    }

    @Override // io.reactivex.processors.a
    @f
    public Throwable F8() {
        Object obj = this.f207258f.get();
        if (NotificationLite.isError(obj)) {
            return NotificationLite.getError(obj);
        }
        return null;
    }

    @Override // io.reactivex.processors.a
    public boolean G8() {
        return NotificationLite.isComplete(this.f207258f.get());
    }

    @Override // io.reactivex.processors.a
    public boolean H8() {
        return this.f207254b.get().length != 0;
    }

    @Override // io.reactivex.processors.a
    public boolean I8() {
        return NotificationLite.isError(this.f207258f.get());
    }

    public boolean K8(BehaviorSubscription<T> behaviorSubscription) {
        BehaviorSubscription<T>[] behaviorSubscriptionArr;
        BehaviorSubscription[] behaviorSubscriptionArr2;
        do {
            behaviorSubscriptionArr = this.f207254b.get();
            if (behaviorSubscriptionArr == f207253k) {
                return false;
            }
            int length = behaviorSubscriptionArr.length;
            behaviorSubscriptionArr2 = new BehaviorSubscription[length + 1];
            System.arraycopy(behaviorSubscriptionArr, 0, behaviorSubscriptionArr2, 0, length);
            behaviorSubscriptionArr2[length] = behaviorSubscription;
        } while (!C1598m0.a(this.f207254b, behaviorSubscriptionArr, behaviorSubscriptionArr2));
        return true;
    }

    @f
    public T N8() {
        Object obj = this.f207258f.get();
        if (NotificationLite.isComplete(obj) || NotificationLite.isError(obj)) {
            return null;
        }
        return (T) NotificationLite.getValue(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public Object[] O8() {
        Object[] objArr = f207251i;
        Object[] objArrP8 = P8(objArr);
        return objArrP8 == objArr ? new Object[0] : objArrP8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public T[] P8(T[] tArr) {
        Object obj = this.f207258f.get();
        if (obj == null || NotificationLite.isComplete(obj) || NotificationLite.isError(obj)) {
            if (tArr.length != 0) {
                tArr[0] = 0;
            }
            return tArr;
        }
        Object value = NotificationLite.getValue(obj);
        if (tArr.length == 0) {
            T[] tArr2 = (T[]) ((Object[]) C1522b.a(tArr, 1));
            tArr2[0] = value;
            return tArr2;
        }
        tArr[0] = value;
        if (tArr.length != 1) {
            tArr[1] = 0;
        }
        return tArr;
    }

    public boolean Q8() {
        Object obj = this.f207258f.get();
        return (obj == null || NotificationLite.isComplete(obj) || NotificationLite.isError(obj)) ? false : true;
    }

    public boolean R8(T t10) {
        if (t10 == null) {
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return true;
        }
        BehaviorSubscription<T>[] behaviorSubscriptionArr = this.f207254b.get();
        for (BehaviorSubscription<T> behaviorSubscription : behaviorSubscriptionArr) {
            if (behaviorSubscription.i()) {
                return false;
            }
        }
        Object next = NotificationLite.next(t10);
        T8(next);
        for (BehaviorSubscription<T> behaviorSubscription2 : behaviorSubscriptionArr) {
            behaviorSubscription2.h(next, this.f207260h);
        }
        return true;
    }

    public void S8(BehaviorSubscription<T> behaviorSubscription) {
        BehaviorSubscription<T>[] behaviorSubscriptionArr;
        BehaviorSubscription[] behaviorSubscriptionArr2;
        do {
            behaviorSubscriptionArr = this.f207254b.get();
            int length = behaviorSubscriptionArr.length;
            if (length == 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    i10 = -1;
                    break;
                } else if (behaviorSubscriptionArr[i10] == behaviorSubscription) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 < 0) {
                return;
            }
            if (length == 1) {
                behaviorSubscriptionArr2 = f207252j;
            } else {
                BehaviorSubscription[] behaviorSubscriptionArr3 = new BehaviorSubscription[length - 1];
                System.arraycopy(behaviorSubscriptionArr, 0, behaviorSubscriptionArr3, 0, i10);
                System.arraycopy(behaviorSubscriptionArr, i10 + 1, behaviorSubscriptionArr3, i10, (length - i10) - 1);
                behaviorSubscriptionArr2 = behaviorSubscriptionArr3;
            }
        } while (!C1598m0.a(this.f207254b, behaviorSubscriptionArr, behaviorSubscriptionArr2));
    }

    public void T8(Object obj) {
        Lock lock = this.f207257e;
        lock.lock();
        this.f207260h++;
        this.f207258f.lazySet(obj);
        lock.unlock();
    }

    public int U8() {
        return this.f207254b.get().length;
    }

    public BehaviorSubscription<T>[] V8(Object obj) {
        BehaviorSubscription<T>[] andSet = this.f207254b.get();
        BehaviorSubscription<T>[] behaviorSubscriptionArr = f207253k;
        if (andSet != behaviorSubscriptionArr && (andSet = this.f207254b.getAndSet(behaviorSubscriptionArr)) != behaviorSubscriptionArr) {
            T8(obj);
        }
        return andSet;
    }

    @Override // hc.AbstractC4530j
    public void d6(Subscriber<? super T> subscriber) {
        BehaviorSubscription<T> behaviorSubscription = new BehaviorSubscription<>(subscriber, this);
        subscriber.onSubscribe(behaviorSubscription);
        if (K8(behaviorSubscription)) {
            if (behaviorSubscription.f207267g) {
                S8(behaviorSubscription);
                return;
            } else {
                behaviorSubscription.d();
                return;
            }
        }
        Throwable th = this.f207259g.get();
        if (th == ExceptionHelper.f207183a) {
            subscriber.onComplete();
        } else {
            subscriber.onError(th);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        if (C1598m0.a(this.f207259g, null, ExceptionHelper.f207183a)) {
            Object objComplete = NotificationLite.complete();
            for (BehaviorSubscription<T> behaviorSubscription : V8(objComplete)) {
                behaviorSubscription.h(objComplete, this.f207260h);
            }
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th) {
        io.reactivex.internal.functions.a.g(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!C1598m0.a(this.f207259g, null, th)) {
            C5666a.Y(th);
            return;
        }
        Object objError = NotificationLite.error(th);
        for (BehaviorSubscription<T> behaviorSubscription : V8(objError)) {
            behaviorSubscription.h(objError, this.f207260h);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t10) {
        io.reactivex.internal.functions.a.g(t10, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f207259g.get() != null) {
            return;
        }
        Object next = NotificationLite.next(t10);
        T8(next);
        for (BehaviorSubscription<T> behaviorSubscription : this.f207254b.get()) {
            behaviorSubscription.h(next, this.f207260h);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onSubscribe(Subscription subscription) {
        if (this.f207259g.get() != null) {
            subscription.cancel();
        } else {
            subscription.request(Long.MAX_VALUE);
        }
    }

    public BehaviorProcessor(T t10) {
        this();
        AtomicReference<Object> atomicReference = this.f207258f;
        io.reactivex.internal.functions.a.g(t10, "defaultValue is null");
        atomicReference.lazySet(t10);
    }
}
