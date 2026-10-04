package io.reactivex.internal.operators.parallel;

import hc.InterfaceC4535o;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLongArray;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import pc.l;
import pc.o;
import tc.AbstractC5629a;

/* JADX INFO: loaded from: classes7.dex */
public final class ParallelFromPublisher<T> extends AbstractC5629a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Publisher<? extends T> f206577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f206578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f206579c;

    public static final class ParallelDispatcher<T> extends AtomicInteger implements InterfaceC4535o<T> {
        private static final long serialVersionUID = -4470634016609963609L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Subscriber<? super T>[] f206580a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicLongArray f206581b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long[] f206582c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f206583d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f206584e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Subscription f206585f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public o<T> f206586g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Throwable f206587h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public volatile boolean f206588i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f206589j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public volatile boolean f206590k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final AtomicInteger f206591l = new AtomicInteger();

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f206592m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f206593n;

        public final class a implements Subscription {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f206594a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f206595b;

            public a(int i10, int i11) {
                this.f206594a = i10;
                this.f206595b = i11;
            }

            @Override // org.reactivestreams.Subscription
            public void cancel() {
                if (ParallelDispatcher.this.f206581b.compareAndSet(this.f206594a + this.f206595b, 0L, 1L)) {
                    ParallelDispatcher parallelDispatcher = ParallelDispatcher.this;
                    int i10 = this.f206595b;
                    parallelDispatcher.a(i10 + i10);
                }
            }

            @Override // org.reactivestreams.Subscription
            public void request(long j10) {
                long j11;
                if (SubscriptionHelper.validate(j10)) {
                    AtomicLongArray atomicLongArray = ParallelDispatcher.this.f206581b;
                    do {
                        j11 = atomicLongArray.get(this.f206594a);
                        if (j11 == Long.MAX_VALUE) {
                            return;
                        }
                    } while (!atomicLongArray.compareAndSet(this.f206594a, j11, io.reactivex.internal.util.b.c(j11, j10)));
                    if (ParallelDispatcher.this.f206591l.get() == this.f206595b) {
                        ParallelDispatcher.this.d();
                    }
                }
            }
        }

        public ParallelDispatcher(Subscriber<? super T>[] subscriberArr, int i10) {
            this.f206580a = subscriberArr;
            this.f206583d = i10;
            this.f206584e = i10 - (i10 >> 2);
            int length = subscriberArr.length;
            int i11 = length + length;
            AtomicLongArray atomicLongArray = new AtomicLongArray(i11 + 1);
            this.f206581b = atomicLongArray;
            atomicLongArray.lazySet(i11, length);
            this.f206582c = new long[length];
        }

        public void a(int i10) {
            if (this.f206581b.decrementAndGet(i10) == 0) {
                this.f206590k = true;
                this.f206585f.cancel();
                if (getAndIncrement() == 0) {
                    this.f206586g.clear();
                }
            }
        }

        public void d() {
            if (getAndIncrement() != 0) {
                return;
            }
            if (this.f206593n == 1) {
                h();
            } else {
                g();
            }
        }

        public void g() {
            Throwable th;
            o<T> oVar = this.f206586g;
            Subscriber<? super T>[] subscriberArr = this.f206580a;
            AtomicLongArray atomicLongArray = this.f206581b;
            long[] jArr = this.f206582c;
            int length = jArr.length;
            int i10 = this.f206589j;
            int i11 = this.f206592m;
            int iAddAndGet = 1;
            while (true) {
                int i12 = 0;
                int i13 = 0;
                while (!this.f206590k) {
                    boolean z10 = this.f206588i;
                    if (z10 && (th = this.f206587h) != null) {
                        oVar.clear();
                        int length2 = subscriberArr.length;
                        while (i12 < length2) {
                            subscriberArr[i12].onError(th);
                            i12++;
                        }
                        return;
                    }
                    boolean zIsEmpty = oVar.isEmpty();
                    if (z10 && zIsEmpty) {
                        int length3 = subscriberArr.length;
                        while (i12 < length3) {
                            subscriberArr[i12].onComplete();
                            i12++;
                        }
                        return;
                    }
                    if (!zIsEmpty) {
                        long j10 = atomicLongArray.get(i10);
                        long j11 = jArr[i10];
                        if (j10 == j11 || atomicLongArray.get(length + i10) != 0) {
                            i13++;
                        } else {
                            try {
                                T tPoll = oVar.poll();
                                if (tPoll != null) {
                                    subscriberArr[i10].onNext(tPoll);
                                    jArr[i10] = j11 + 1;
                                    i11++;
                                    if (i11 == this.f206584e) {
                                        this.f206585f.request(i11);
                                        i11 = 0;
                                    }
                                    i13 = 0;
                                }
                            } catch (Throwable th2) {
                                io.reactivex.exceptions.a.b(th2);
                                this.f206585f.cancel();
                                int length4 = subscriberArr.length;
                                while (i12 < length4) {
                                    subscriberArr[i12].onError(th2);
                                    i12++;
                                }
                                return;
                            }
                        }
                        i10++;
                        if (i10 == length) {
                            i10 = 0;
                        }
                        if (i13 == length) {
                        }
                    }
                    int i14 = get();
                    if (i14 == iAddAndGet) {
                        this.f206589j = i10;
                        this.f206592m = i11;
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    } else {
                        iAddAndGet = i14;
                    }
                }
                oVar.clear();
                return;
            }
        }

        public void h() {
            o<T> oVar = this.f206586g;
            Subscriber<? super T>[] subscriberArr = this.f206580a;
            AtomicLongArray atomicLongArray = this.f206581b;
            long[] jArr = this.f206582c;
            int length = jArr.length;
            int i10 = this.f206589j;
            int iAddAndGet = 1;
            while (true) {
                int i11 = 0;
                int i12 = 0;
                while (!this.f206590k) {
                    if (oVar.isEmpty()) {
                        int length2 = subscriberArr.length;
                        while (i11 < length2) {
                            subscriberArr[i11].onComplete();
                            i11++;
                        }
                        return;
                    }
                    long j10 = atomicLongArray.get(i10);
                    long j11 = jArr[i10];
                    if (j10 == j11 || atomicLongArray.get(length + i10) != 0) {
                        i12++;
                    } else {
                        try {
                            T tPoll = oVar.poll();
                            if (tPoll == null) {
                                int length3 = subscriberArr.length;
                                while (i11 < length3) {
                                    subscriberArr[i11].onComplete();
                                    i11++;
                                }
                                return;
                            }
                            subscriberArr[i10].onNext(tPoll);
                            jArr[i10] = j11 + 1;
                            i12 = 0;
                        } catch (Throwable th) {
                            io.reactivex.exceptions.a.b(th);
                            this.f206585f.cancel();
                            int length4 = subscriberArr.length;
                            while (i11 < length4) {
                                subscriberArr[i11].onError(th);
                                i11++;
                            }
                            return;
                        }
                    }
                    i10++;
                    if (i10 == length) {
                        i10 = 0;
                    }
                    if (i12 == length) {
                        int i13 = get();
                        if (i13 == iAddAndGet) {
                            this.f206589j = i10;
                            iAddAndGet = addAndGet(-iAddAndGet);
                            if (iAddAndGet == 0) {
                                return;
                            }
                        } else {
                            iAddAndGet = i13;
                        }
                    }
                }
                oVar.clear();
                return;
            }
        }

        public void i() {
            Subscriber<? super T>[] subscriberArr = this.f206580a;
            int length = subscriberArr.length;
            int i10 = 0;
            while (i10 < length && !this.f206590k) {
                int i11 = i10 + 1;
                this.f206591l.lazySet(i11);
                subscriberArr[i10].onSubscribe(new a(i10, length));
                i10 = i11;
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f206588i = true;
            d();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            this.f206587h = th;
            this.f206588i = true;
            d();
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t10) {
            if (this.f206593n != 0 || this.f206586g.offer(t10)) {
                d();
            } else {
                this.f206585f.cancel();
                onError(new MissingBackpressureException("Queue is full?"));
            }
        }

        @Override // hc.InterfaceC4535o, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f206585f, subscription)) {
                this.f206585f = subscription;
                if (subscription instanceof l) {
                    l lVar = (l) subscription;
                    int iRequestFusion = lVar.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.f206593n = iRequestFusion;
                        this.f206586g = lVar;
                        this.f206588i = true;
                        i();
                        d();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f206593n = iRequestFusion;
                        this.f206586g = lVar;
                        i();
                        subscription.request(this.f206583d);
                        return;
                    }
                }
                this.f206586g = new SpscArrayQueue(this.f206583d);
                i();
                subscription.request(this.f206583d);
            }
        }
    }

    public ParallelFromPublisher(Publisher<? extends T> publisher, int i10, int i11) {
        this.f206577a = publisher;
        this.f206578b = i10;
        this.f206579c = i11;
    }

    @Override // tc.AbstractC5629a
    public int F() {
        return this.f206578b;
    }

    @Override // tc.AbstractC5629a
    public void Q(Subscriber<? super T>[] subscriberArr) {
        if (U(subscriberArr)) {
            this.f206577a.subscribe(new ParallelDispatcher(subscriberArr, this.f206579c));
        }
    }
}
