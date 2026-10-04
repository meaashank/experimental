package io.reactivex.rxjava3.internal.operators.flowable;

import androidx.compose.animation.core.C1598m0;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.queue.SpscArrayQueue;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import zc.AbstractC5902t;
import zc.InterfaceC5907y;

/* JADX INFO: loaded from: classes7.dex */
public final class FlowableFlatMap<T, U> extends AbstractC4700a<T, U> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bc.o<? super T, ? extends Publisher<? extends U>> f208097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f208098d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f208099e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f208100f;

    public static final class InnerSubscriber<T, U> extends AtomicReference<Subscription> implements InterfaceC5907y<U>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = -4606175640614850599L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f208101a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MergeSubscriber<T, U> f208102b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f208103c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f208104d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public volatile boolean f208105e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public volatile Dc.q<U> f208106f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f208107g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f208108h;

        public InnerSubscriber(MergeSubscriber<T, U> parent, int bufferSize, long id2) {
            this.f208101a = id2;
            this.f208102b = parent;
            this.f208104d = bufferSize;
            this.f208103c = bufferSize >> 2;
        }

        public void a(long n10) {
            if (this.f208108h != 1) {
                long j10 = this.f208107g + n10;
                if (j10 < this.f208103c) {
                    this.f208107g = j10;
                } else {
                    this.f208107g = 0L;
                    get().request(j10);
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return get() == SubscriptionHelper.CANCELLED;
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f208105e = true;
            this.f208102b.i();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable t10) {
            lazySet(SubscriptionHelper.CANCELLED);
            this.f208102b.m(this, t10);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(U t10) {
            if (this.f208108h != 2) {
                this.f208102b.o(t10, this);
            } else {
                this.f208102b.i();
            }
        }

        @Override // zc.InterfaceC5907y, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription s10) {
            if (SubscriptionHelper.setOnce(this, s10)) {
                if (s10 instanceof Dc.n) {
                    Dc.n nVar = (Dc.n) s10;
                    int iRequestFusion = nVar.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.f208108h = iRequestFusion;
                        this.f208106f = nVar;
                        this.f208105e = true;
                        this.f208102b.i();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f208108h = iRequestFusion;
                        this.f208106f = nVar;
                    }
                }
                s10.request(this.f208104d);
            }
        }
    }

    public static final class MergeSubscriber<T, U> extends AtomicInteger implements InterfaceC5907y<T>, Subscription {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final InnerSubscriber<?, ?>[] f208109r = new InnerSubscriber[0];

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final InnerSubscriber<?, ?>[] f208110s = new InnerSubscriber[0];
        private static final long serialVersionUID = -2117620485640801370L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Subscriber<? super U> f208111a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Bc.o<? super T, ? extends Publisher<? extends U>> f208112b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f208113c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f208114d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f208115e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public volatile Dc.p<U> f208116f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public volatile boolean f208117g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final AtomicThrowable f208118h = new AtomicThrowable();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public volatile boolean f208119i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final AtomicReference<InnerSubscriber<?, ?>[]> f208120j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final AtomicLong f208121k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Subscription f208122l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public long f208123m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public long f208124n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f208125o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f208126p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final int f208127q;

        public MergeSubscriber(Subscriber<? super U> actual, Bc.o<? super T, ? extends Publisher<? extends U>> mapper, boolean delayErrors, int maxConcurrency, int bufferSize) {
            AtomicReference<InnerSubscriber<?, ?>[]> atomicReference = new AtomicReference<>();
            this.f208120j = atomicReference;
            this.f208121k = new AtomicLong();
            this.f208111a = actual;
            this.f208112b = mapper;
            this.f208113c = delayErrors;
            this.f208114d = maxConcurrency;
            this.f208115e = bufferSize;
            this.f208127q = Math.max(1, maxConcurrency >> 1);
            atomicReference.lazySet(f208109r);
        }

        public boolean a(InnerSubscriber<T, U> inner) {
            InnerSubscriber<?, ?>[] innerSubscriberArr;
            InnerSubscriber[] innerSubscriberArr2;
            do {
                innerSubscriberArr = this.f208120j.get();
                if (innerSubscriberArr == f208110s) {
                    inner.getClass();
                    SubscriptionHelper.cancel(inner);
                    return false;
                }
                int length = innerSubscriberArr.length;
                innerSubscriberArr2 = new InnerSubscriber[length + 1];
                System.arraycopy(innerSubscriberArr, 0, innerSubscriberArr2, 0, length);
                innerSubscriberArr2[length] = inner;
            } while (!C1598m0.a(this.f208120j, innerSubscriberArr, innerSubscriberArr2));
            return true;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            Dc.p<U> pVar;
            if (this.f208119i) {
                return;
            }
            this.f208119i = true;
            this.f208122l.cancel();
            h();
            if (getAndIncrement() != 0 || (pVar = this.f208116f) == null) {
                return;
            }
            pVar.clear();
        }

        public boolean d() {
            if (this.f208119i) {
                g();
                return true;
            }
            if (this.f208113c || this.f208118h.get() == null) {
                return false;
            }
            g();
            this.f208118h.k(this.f208111a);
            return true;
        }

        public void g() {
            Dc.p<U> pVar = this.f208116f;
            if (pVar != null) {
                pVar.clear();
            }
        }

        public void h() {
            AtomicReference<InnerSubscriber<?, ?>[]> atomicReference = this.f208120j;
            InnerSubscriber<?, ?>[] innerSubscriberArr = f208110s;
            InnerSubscriber<?, ?>[] andSet = atomicReference.getAndSet(innerSubscriberArr);
            if (andSet != innerSubscriberArr) {
                for (InnerSubscriber<?, ?> innerSubscriber : andSet) {
                    innerSubscriber.getClass();
                    SubscriptionHelper.cancel(innerSubscriber);
                }
                this.f208118h.j();
            }
        }

        public void i() {
            if (getAndIncrement() == 0) {
                k();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:141:0x0175 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:57:0x00bb  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void k() {
            /*
                Method dump skipped, instruction units count: 422
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.rxjava3.internal.operators.flowable.FlowableFlatMap.MergeSubscriber.k():void");
        }

        public Dc.q<U> l() {
            Dc.p<U> aVar = this.f208116f;
            if (aVar == null) {
                aVar = this.f208114d == Integer.MAX_VALUE ? new io.reactivex.rxjava3.internal.queue.a<>(this.f208115e) : new SpscArrayQueue<>(this.f208114d);
                this.f208116f = aVar;
            }
            return aVar;
        }

        public void m(InnerSubscriber<T, U> inner, Throwable t10) {
            if (this.f208118h.i(t10)) {
                inner.f208105e = true;
                if (!this.f208113c) {
                    this.f208122l.cancel();
                    for (InnerSubscriber<?, ?> innerSubscriber : this.f208120j.getAndSet(f208110s)) {
                        innerSubscriber.getClass();
                        SubscriptionHelper.cancel(innerSubscriber);
                    }
                }
                i();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void n(InnerSubscriber<T, U> inner) {
            InnerSubscriber<?, ?>[] innerSubscriberArr;
            InnerSubscriber<?, ?>[] innerSubscriberArr2;
            do {
                innerSubscriberArr = this.f208120j.get();
                int length = innerSubscriberArr.length;
                if (length == 0) {
                    return;
                }
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        i10 = -1;
                        break;
                    } else if (innerSubscriberArr[i10] == inner) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (i10 < 0) {
                    return;
                }
                if (length == 1) {
                    innerSubscriberArr2 = f208109r;
                } else {
                    InnerSubscriber<?, ?>[] innerSubscriberArr3 = new InnerSubscriber[length - 1];
                    System.arraycopy(innerSubscriberArr, 0, innerSubscriberArr3, 0, i10);
                    System.arraycopy(innerSubscriberArr, i10 + 1, innerSubscriberArr3, i10, (length - i10) - 1);
                    innerSubscriberArr2 = innerSubscriberArr3;
                }
            } while (!C1598m0.a(this.f208120j, innerSubscriberArr, innerSubscriberArr2));
        }

        public void o(U value, InnerSubscriber<T, U> inner) {
            if (get() == 0 && compareAndSet(0, 1)) {
                long j10 = this.f208121k.get();
                Dc.q spscArrayQueue = inner.f208106f;
                if (j10 == 0 || !(spscArrayQueue == null || spscArrayQueue.isEmpty())) {
                    if (spscArrayQueue == null) {
                        spscArrayQueue = new SpscArrayQueue(this.f208115e);
                        inner.f208106f = spscArrayQueue;
                    }
                    if (!spscArrayQueue.offer(value)) {
                        onError(new MissingBackpressureException("Inner queue full?!"));
                    }
                } else {
                    this.f208111a.onNext(value);
                    if (j10 != Long.MAX_VALUE) {
                        this.f208121k.decrementAndGet();
                    }
                    inner.a(1L);
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                Dc.q spscArrayQueue2 = inner.f208106f;
                if (spscArrayQueue2 == null) {
                    spscArrayQueue2 = new SpscArrayQueue(this.f208115e);
                    inner.f208106f = spscArrayQueue2;
                }
                if (!spscArrayQueue2.offer(value)) {
                    onError(new MissingBackpressureException("Inner queue full?!"));
                    return;
                } else if (getAndIncrement() != 0) {
                    return;
                }
            }
            k();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f208117g) {
                return;
            }
            this.f208117g = true;
            i();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable t10) {
            if (this.f208117g) {
                Ic.a.Y(t10);
                return;
            }
            if (this.f208118h.i(t10)) {
                this.f208117g = true;
                if (!this.f208113c) {
                    for (InnerSubscriber<?, ?> innerSubscriber : this.f208120j.getAndSet(f208110s)) {
                        innerSubscriber.getClass();
                        SubscriptionHelper.cancel(innerSubscriber);
                    }
                }
                i();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.reactivestreams.Subscriber
        public void onNext(T t10) {
            if (this.f208117g) {
                return;
            }
            try {
                Publisher<? extends U> publisherApply = this.f208112b.apply(t10);
                Objects.requireNonNull(publisherApply, "The mapper returned a null Publisher");
                Publisher<? extends U> publisher = publisherApply;
                if (!(publisher instanceof Bc.s)) {
                    int i10 = this.f208115e;
                    long j10 = this.f208123m;
                    this.f208123m = 1 + j10;
                    InnerSubscriber innerSubscriber = new InnerSubscriber(this, i10, j10);
                    if (a(innerSubscriber)) {
                        publisher.subscribe(innerSubscriber);
                        return;
                    }
                    return;
                }
                try {
                    Object obj = ((Bc.s) publisher).get();
                    if (obj != null) {
                        p(obj);
                        return;
                    }
                    if (this.f208114d == Integer.MAX_VALUE || this.f208119i) {
                        return;
                    }
                    int i11 = this.f208126p + 1;
                    this.f208126p = i11;
                    int i12 = this.f208127q;
                    if (i11 == i12) {
                        this.f208126p = 0;
                        this.f208122l.request(i12);
                    }
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.a.b(th);
                    this.f208118h.i(th);
                    i();
                }
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.b(th2);
                this.f208122l.cancel();
                onError(th2);
            }
        }

        @Override // zc.InterfaceC5907y, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription s10) {
            if (SubscriptionHelper.validate(this.f208122l, s10)) {
                this.f208122l = s10;
                this.f208111a.onSubscribe(this);
                if (this.f208119i) {
                    return;
                }
                int i10 = this.f208114d;
                if (i10 == Integer.MAX_VALUE) {
                    s10.request(Long.MAX_VALUE);
                } else {
                    s10.request(i10);
                }
            }
        }

        public void p(U value) {
            if (get() == 0 && compareAndSet(0, 1)) {
                long j10 = this.f208121k.get();
                Dc.q<U> qVarL = this.f208116f;
                if (j10 == 0 || !(qVarL == null || qVarL.isEmpty())) {
                    if (qVarL == null) {
                        qVarL = l();
                    }
                    if (!qVarL.offer(value)) {
                        onError(new MissingBackpressureException("Scalar queue full?!"));
                    }
                } else {
                    this.f208111a.onNext(value);
                    if (j10 != Long.MAX_VALUE) {
                        this.f208121k.decrementAndGet();
                    }
                    if (this.f208114d != Integer.MAX_VALUE && !this.f208119i) {
                        int i10 = this.f208126p + 1;
                        this.f208126p = i10;
                        int i11 = this.f208127q;
                        if (i10 == i11) {
                            this.f208126p = 0;
                            this.f208122l.request(i11);
                        }
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else if (!l().offer(value)) {
                onError(new MissingBackpressureException("Scalar queue full?!"));
                return;
            } else if (getAndIncrement() != 0) {
                return;
            }
            k();
        }

        @Override // org.reactivestreams.Subscription
        public void request(long n10) {
            if (SubscriptionHelper.validate(n10)) {
                io.reactivex.rxjava3.internal.util.b.a(this.f208121k, n10);
                i();
            }
        }
    }

    public FlowableFlatMap(AbstractC5902t<T> source, Bc.o<? super T, ? extends Publisher<? extends U>> mapper, boolean delayErrors, int maxConcurrency, int bufferSize) {
        super(source);
        this.f208097c = mapper;
        this.f208098d = delayErrors;
        this.f208099e = maxConcurrency;
        this.f208100f = bufferSize;
    }

    public static <T, U> InterfaceC5907y<T> f9(Subscriber<? super U> s10, Bc.o<? super T, ? extends Publisher<? extends U>> mapper, boolean delayErrors, int maxConcurrency, int bufferSize) {
        return new MergeSubscriber(s10, mapper, delayErrors, maxConcurrency, bufferSize);
    }

    @Override // zc.AbstractC5902t
    public void G6(Subscriber<? super U> s10) {
        if (b0.b(this.f209105b, s10, this.f208097c)) {
            return;
        }
        this.f209105b.F6(new MergeSubscriber(s10, this.f208097c, this.f208098d, this.f208099e, this.f208100f));
    }
}
