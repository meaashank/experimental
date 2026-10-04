package io.reactivex.rxjava3.processors;

import androidx.compose.animation.core.C1598m0;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import io.reactivex.rxjava3.internal.util.a;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import yc.c;
import yc.e;
import yc.f;

/* JADX INFO: loaded from: classes7.dex */
public final class BehaviorProcessor<T> extends a<T> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Object[] f211997i = new Object[0];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final BehaviorSubscription[] f211998j = new BehaviorSubscription[0];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final BehaviorSubscription[] f211999k = new BehaviorSubscription[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference<BehaviorSubscription<T>[]> f212000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ReadWriteLock f212001c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Lock f212002d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Lock f212003e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicReference<Object> f212004f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicReference<Throwable> f212005g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f212006h;

    public static final class BehaviorSubscription<T> extends AtomicLong implements Subscription, a.InterfaceC0794a<Object> {
        private static final long serialVersionUID = 3293175281126227086L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Subscriber<? super T> f212007a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BehaviorProcessor<T> f212008b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f212009c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f212010d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public io.reactivex.rxjava3.internal.util.a<Object> f212011e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f212012f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public volatile boolean f212013g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f212014h;

        public BehaviorSubscription(Subscriber<? super T> actual, BehaviorProcessor<T> state) {
            this.f212007a = actual;
            this.f212008b = state;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (this.f212013g) {
                return;
            }
            this.f212013g = true;
            this.f212008b.q9(this);
        }

        public void d() {
            if (this.f212013g) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.f212013g) {
                        return;
                    }
                    if (this.f212009c) {
                        return;
                    }
                    BehaviorProcessor<T> behaviorProcessor = this.f212008b;
                    Lock lock = behaviorProcessor.f212002d;
                    lock.lock();
                    this.f212014h = behaviorProcessor.f212006h;
                    Object obj = behaviorProcessor.f212004f.get();
                    lock.unlock();
                    this.f212010d = obj != null;
                    this.f212009c = true;
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
            io.reactivex.rxjava3.internal.util.a<Object> aVar;
            while (!this.f212013g) {
                synchronized (this) {
                    try {
                        aVar = this.f212011e;
                        if (aVar == null) {
                            this.f212010d = false;
                            return;
                        }
                        this.f212011e = null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                aVar.d(this);
            }
        }

        public void h(Object value, long stateIndex) {
            if (this.f212013g) {
                return;
            }
            if (!this.f212012f) {
                synchronized (this) {
                    try {
                        if (this.f212013g) {
                            return;
                        }
                        if (this.f212014h == stateIndex) {
                            return;
                        }
                        if (this.f212010d) {
                            io.reactivex.rxjava3.internal.util.a<Object> aVar = this.f212011e;
                            if (aVar == null) {
                                aVar = new io.reactivex.rxjava3.internal.util.a<>(4);
                                this.f212011e = aVar;
                            }
                            aVar.c(value);
                            return;
                        }
                        this.f212009c = true;
                        this.f212012f = true;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            test(value);
        }

        public boolean i() {
            return get() == 0;
        }

        @Override // org.reactivestreams.Subscription
        public void request(long n10) {
            if (SubscriptionHelper.validate(n10)) {
                io.reactivex.rxjava3.internal.util.b.a(this, n10);
            }
        }

        @Override // io.reactivex.rxjava3.internal.util.a.InterfaceC0794a, Bc.r
        public boolean test(Object obj) {
            if (this.f212013g) {
                return true;
            }
            if (NotificationLite.isComplete(obj)) {
                this.f212007a.onComplete();
                return true;
            }
            if (NotificationLite.isError(obj)) {
                this.f212007a.onError(NotificationLite.getError(obj));
                return true;
            }
            long j10 = get();
            if (j10 == 0) {
                cancel();
                this.f212007a.onError(new MissingBackpressureException("Could not deliver value due to lack of requests"));
                return true;
            }
            this.f212007a.onNext((Object) NotificationLite.getValue(obj));
            if (j10 == Long.MAX_VALUE) {
                return false;
            }
            decrementAndGet();
            return false;
        }
    }

    public BehaviorProcessor() {
        this.f212004f = new AtomicReference<>();
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f212001c = reentrantReadWriteLock;
        this.f212002d = reentrantReadWriteLock.readLock();
        this.f212003e = reentrantReadWriteLock.writeLock();
        this.f212000b = new AtomicReference<>(f211998j);
        this.f212005g = new AtomicReference<>();
    }

    @e
    @c
    public static <T> BehaviorProcessor<T> l9() {
        return new BehaviorProcessor<>();
    }

    @e
    @c
    public static <T> BehaviorProcessor<T> m9(T defaultValue) {
        Objects.requireNonNull(defaultValue, "defaultValue is null");
        return new BehaviorProcessor<>(defaultValue);
    }

    @Override // zc.AbstractC5902t
    public void G6(@e Subscriber<? super T> s10) {
        BehaviorSubscription<T> behaviorSubscription = new BehaviorSubscription<>(s10, this);
        s10.onSubscribe(behaviorSubscription);
        if (k9(behaviorSubscription)) {
            if (behaviorSubscription.f212013g) {
                q9(behaviorSubscription);
                return;
            } else {
                behaviorSubscription.d();
                return;
            }
        }
        Throwable th = this.f212005g.get();
        if (th == ExceptionHelper.f211932a) {
            s10.onComplete();
        } else {
            s10.onError(th);
        }
    }

    @Override // io.reactivex.rxjava3.processors.a
    @f
    @c
    public Throwable f9() {
        Object obj = this.f212004f.get();
        if (NotificationLite.isError(obj)) {
            return NotificationLite.getError(obj);
        }
        return null;
    }

    @Override // io.reactivex.rxjava3.processors.a
    @c
    public boolean g9() {
        return NotificationLite.isComplete(this.f212004f.get());
    }

    @Override // io.reactivex.rxjava3.processors.a
    @c
    public boolean h9() {
        return this.f212000b.get().length != 0;
    }

    @Override // io.reactivex.rxjava3.processors.a
    @c
    public boolean i9() {
        return NotificationLite.isError(this.f212004f.get());
    }

    public boolean k9(BehaviorSubscription<T> rs) {
        BehaviorSubscription<T>[] behaviorSubscriptionArr;
        BehaviorSubscription[] behaviorSubscriptionArr2;
        do {
            behaviorSubscriptionArr = this.f212000b.get();
            if (behaviorSubscriptionArr == f211999k) {
                return false;
            }
            int length = behaviorSubscriptionArr.length;
            behaviorSubscriptionArr2 = new BehaviorSubscription[length + 1];
            System.arraycopy(behaviorSubscriptionArr, 0, behaviorSubscriptionArr2, 0, length);
            behaviorSubscriptionArr2[length] = rs;
        } while (!C1598m0.a(this.f212000b, behaviorSubscriptionArr, behaviorSubscriptionArr2));
        return true;
    }

    @f
    @c
    public T n9() {
        Object obj = this.f212004f.get();
        if (NotificationLite.isComplete(obj) || NotificationLite.isError(obj)) {
            return null;
        }
        return (T) NotificationLite.getValue(obj);
    }

    @c
    public boolean o9() {
        Object obj = this.f212004f.get();
        return (obj == null || NotificationLite.isComplete(obj) || NotificationLite.isError(obj)) ? false : true;
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        if (C1598m0.a(this.f212005g, null, ExceptionHelper.f211932a)) {
            Object objComplete = NotificationLite.complete();
            for (BehaviorSubscription<T> behaviorSubscription : t9(objComplete)) {
                behaviorSubscription.h(objComplete, this.f212006h);
            }
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(@e Throwable t10) {
        ExceptionHelper.d(t10, "onError called with a null Throwable.");
        if (!C1598m0.a(this.f212005g, null, t10)) {
            Ic.a.Y(t10);
            return;
        }
        Object objError = NotificationLite.error(t10);
        for (BehaviorSubscription<T> behaviorSubscription : t9(objError)) {
            behaviorSubscription.h(objError, this.f212006h);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(@e T t10) {
        ExceptionHelper.d(t10, "onNext called with a null value.");
        if (this.f212005g.get() != null) {
            return;
        }
        Object next = NotificationLite.next(t10);
        r9(next);
        for (BehaviorSubscription<T> behaviorSubscription : this.f212000b.get()) {
            behaviorSubscription.h(next, this.f212006h);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onSubscribe(@e Subscription s10) {
        if (this.f212005g.get() != null) {
            s10.cancel();
        } else {
            s10.request(Long.MAX_VALUE);
        }
    }

    @c
    public boolean p9(@e T t10) {
        ExceptionHelper.d(t10, "offer called with a null value.");
        BehaviorSubscription<T>[] behaviorSubscriptionArr = this.f212000b.get();
        for (BehaviorSubscription<T> behaviorSubscription : behaviorSubscriptionArr) {
            if (behaviorSubscription.i()) {
                return false;
            }
        }
        Object next = NotificationLite.next(t10);
        r9(next);
        for (BehaviorSubscription<T> behaviorSubscription2 : behaviorSubscriptionArr) {
            behaviorSubscription2.h(next, this.f212006h);
        }
        return true;
    }

    public void q9(BehaviorSubscription<T> rs) {
        BehaviorSubscription<T>[] behaviorSubscriptionArr;
        BehaviorSubscription[] behaviorSubscriptionArr2;
        do {
            behaviorSubscriptionArr = this.f212000b.get();
            int length = behaviorSubscriptionArr.length;
            if (length == 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    i10 = -1;
                    break;
                } else if (behaviorSubscriptionArr[i10] == rs) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 < 0) {
                return;
            }
            if (length == 1) {
                behaviorSubscriptionArr2 = f211998j;
            } else {
                BehaviorSubscription[] behaviorSubscriptionArr3 = new BehaviorSubscription[length - 1];
                System.arraycopy(behaviorSubscriptionArr, 0, behaviorSubscriptionArr3, 0, i10);
                System.arraycopy(behaviorSubscriptionArr, i10 + 1, behaviorSubscriptionArr3, i10, (length - i10) - 1);
                behaviorSubscriptionArr2 = behaviorSubscriptionArr3;
            }
        } while (!C1598m0.a(this.f212000b, behaviorSubscriptionArr, behaviorSubscriptionArr2));
    }

    public void r9(Object o10) {
        Lock lock = this.f212003e;
        lock.lock();
        this.f212006h++;
        this.f212004f.lazySet(o10);
        lock.unlock();
    }

    @c
    public int s9() {
        return this.f212000b.get().length;
    }

    public BehaviorSubscription<T>[] t9(Object terminalValue) {
        r9(terminalValue);
        return this.f212000b.getAndSet(f211999k);
    }

    public BehaviorProcessor(T defaultValue) {
        this();
        this.f212004f.lazySet(defaultValue);
    }
}
