package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.queue.SpscArrayQueue;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Stream;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import zc.AbstractC5902t;
import zc.C5897n;
import zc.InterfaceC5907y;

/* JADX INFO: loaded from: classes7.dex */
public final class FlowableFlatMapStream<T, R> extends AbstractC5902t<R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC5902t<T> f207409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bc.o<? super T, ? extends Stream<? extends R>> f207410c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f207411d;

    public static final class FlatMapStreamSubscriber<T, R> extends AtomicInteger implements InterfaceC5907y<T>, Subscription {
        private static final long serialVersionUID = -5127032662980523968L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Subscriber<? super R> f207412a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Bc.o<? super T, ? extends Stream<? extends R>> f207413b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f207414c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Dc.q<T> f207416e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Subscription f207417f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Iterator<? extends R> f207418g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public AutoCloseable f207419h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public volatile boolean f207420i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public volatile boolean f207421j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public long f207423l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f207424m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f207425n;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicLong f207415d = new AtomicLong();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final AtomicThrowable f207422k = new AtomicThrowable();

        public FlatMapStreamSubscriber(Subscriber<? super R> downstream, Bc.o<? super T, ? extends Stream<? extends R>> mapper, int prefetch) {
            this.f207412a = downstream;
            this.f207413b = mapper;
            this.f207414c = prefetch;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f207420i = true;
            this.f207417f.cancel();
            h();
        }

        public void d() throws Exception {
            this.f207418g = null;
            AutoCloseable autoCloseable = this.f207419h;
            this.f207419h = null;
            if (autoCloseable != null) {
                Q0.g.a(autoCloseable);
            }
        }

        public void g() {
            try {
                d();
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                Ic.a.Y(th);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r12v0 */
        /* JADX WARN: Type inference failed for: r12v1, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r12v2 */
        /* JADX WARN: Type inference failed for: r16v0 */
        /* JADX WARN: Type inference failed for: r16v1 */
        /* JADX WARN: Type inference failed for: r16v2 */
        public void h() {
            if (getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super R> subscriber = this.f207412a;
            Dc.q<T> qVar = this.f207416e;
            AtomicThrowable atomicThrowable = this.f207422k;
            Iterator<? extends R> it = this.f207418g;
            long j10 = this.f207415d.get();
            long j11 = this.f207423l;
            int i10 = this.f207414c;
            int i11 = i10 - (i10 >> 2);
            int i12 = 0;
            ?? r12 = 1;
            boolean z10 = this.f207425n != 1;
            long j12 = j11;
            int iAddAndGet = 1;
            long j13 = j10;
            Iterator<? extends R> it2 = it;
            while (true) {
                if (this.f207420i) {
                    qVar.clear();
                    g();
                } else {
                    boolean z11 = this.f207421j;
                    if (atomicThrowable.get() != null) {
                        subscriber.onError(atomicThrowable.get());
                        this.f207420i = r12;
                    } else if (it2 == null) {
                        try {
                            T tPoll = qVar.poll();
                            ?? r16 = tPoll == null ? r12 : i12;
                            if (z11 && r16 != 0) {
                                subscriber.onComplete();
                                this.f207420i = r12;
                            } else if (r16 == 0) {
                                if (z10) {
                                    int i13 = this.f207424m + r12;
                                    this.f207424m = i13;
                                    if (i13 == i11) {
                                        this.f207424m = i12;
                                        this.f207417f.request(i11);
                                    }
                                }
                                try {
                                    Stream<? extends R> streamApply = this.f207413b.apply(tPoll);
                                    Objects.requireNonNull(streamApply, "The mapper returned a null Stream");
                                    Stream streamA = C5897n.a(streamApply);
                                    it2 = streamA.iterator();
                                    if (it2.hasNext()) {
                                        this.f207418g = it2;
                                        this.f207419h = streamA;
                                    } else {
                                        it2 = null;
                                    }
                                } catch (Throwable th) {
                                    io.reactivex.rxjava3.exceptions.a.b(th);
                                    i(subscriber, th);
                                }
                            }
                            if (it2 == null && j12 != j13) {
                                try {
                                    Object obj = (R) it2.next();
                                    Objects.requireNonNull(obj, "The Stream.Iterator returned a null value");
                                    if (!this.f207420i) {
                                        subscriber.onNext(obj);
                                        j12++;
                                        if (!this.f207420i) {
                                            try {
                                                if (!it2.hasNext()) {
                                                    try {
                                                        d();
                                                        it2 = null;
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        it2 = null;
                                                        io.reactivex.rxjava3.exceptions.a.b(th);
                                                        i(subscriber, th);
                                                    }
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                            }
                                        }
                                    }
                                } catch (Throwable th4) {
                                    io.reactivex.rxjava3.exceptions.a.b(th4);
                                    i(subscriber, th4);
                                }
                            }
                        } catch (Throwable th5) {
                            io.reactivex.rxjava3.exceptions.a.b(th5);
                            i(subscriber, th5);
                        }
                    } else if (it2 == null) {
                    }
                    i12 = 0;
                    r12 = 1;
                }
                this.f207423l = j12;
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                j13 = this.f207415d.get();
                i12 = 0;
                r12 = 1;
            }
        }

        public void i(Subscriber<?> downstream, Throwable ex) {
            if (!this.f207422k.compareAndSet(null, ex)) {
                Ic.a.Y(ex);
                return;
            }
            this.f207417f.cancel();
            this.f207420i = true;
            downstream.onError(ex);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f207421j = true;
            h();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable t10) {
            if (!this.f207422k.compareAndSet(null, t10)) {
                Ic.a.Y(t10);
            } else {
                this.f207421j = true;
                h();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t10) {
            if (this.f207425n == 2 || this.f207416e.offer(t10)) {
                h();
            } else {
                this.f207417f.cancel();
                onError(new MissingBackpressureException("Queue full?!"));
            }
        }

        @Override // zc.InterfaceC5907y, org.reactivestreams.Subscriber
        public void onSubscribe(@yc.e Subscription s10) {
            if (SubscriptionHelper.validate(this.f207417f, s10)) {
                this.f207417f = s10;
                if (s10 instanceof Dc.n) {
                    Dc.n nVar = (Dc.n) s10;
                    int iRequestFusion = nVar.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.f207425n = iRequestFusion;
                        this.f207416e = nVar;
                        this.f207421j = true;
                        this.f207412a.onSubscribe(this);
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f207425n = iRequestFusion;
                        this.f207416e = nVar;
                        this.f207412a.onSubscribe(this);
                        s10.request(this.f207414c);
                        return;
                    }
                }
                this.f207416e = new SpscArrayQueue(this.f207414c);
                this.f207412a.onSubscribe(this);
                s10.request(this.f207414c);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long n10) {
            if (SubscriptionHelper.validate(n10)) {
                io.reactivex.rxjava3.internal.util.b.a(this.f207415d, n10);
                h();
            }
        }
    }

    public FlowableFlatMapStream(AbstractC5902t<T> source, Bc.o<? super T, ? extends Stream<? extends R>> mapper, int prefetch) {
        this.f207409b = source;
        this.f207410c = mapper;
        this.f207411d = prefetch;
    }

    public static <T, R> Subscriber<T> f9(Subscriber<? super R> downstream, Bc.o<? super T, ? extends Stream<? extends R>> mapper, int prefetch) {
        return new FlatMapStreamSubscriber(downstream, mapper, prefetch);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // zc.AbstractC5902t
    public void G6(Subscriber<? super R> subscriber) {
        Stream streamA;
        AbstractC5902t<T> abstractC5902t = this.f207409b;
        if (!(abstractC5902t instanceof Bc.s)) {
            abstractC5902t.subscribe(new FlatMapStreamSubscriber(subscriber, this.f207410c, this.f207411d));
            return;
        }
        try {
            Object obj = ((Bc.s) abstractC5902t).get();
            if (obj != null) {
                Stream<? extends R> streamApply = this.f207410c.apply(obj);
                Objects.requireNonNull(streamApply, "The mapper returned a null Stream");
                streamA = C5897n.a(streamApply);
            } else {
                streamA = null;
            }
            if (streamA != null) {
                FlowableFromStream.g9(subscriber, streamA);
            } else {
                EmptySubscription.complete(subscriber);
            }
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            EmptySubscription.error(th, subscriber);
        }
    }
}
