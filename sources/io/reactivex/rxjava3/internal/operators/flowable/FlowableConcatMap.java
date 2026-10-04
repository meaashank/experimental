package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.internal.queue.SpscArrayQueue;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import zc.AbstractC5902t;
import zc.InterfaceC5907y;

/* JADX INFO: loaded from: classes7.dex */
public final class FlowableConcatMap<T, R> extends AbstractC4700a<T, R> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bc.o<? super T, ? extends Publisher<? extends R>> f207949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f207950d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ErrorMode f207951e;

    public static abstract class BaseConcatMapSubscriber<T, R> extends AtomicInteger implements InterfaceC5907y<T>, b<R>, Subscription {
        private static final long serialVersionUID = -3511336836796789179L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Bc.o<? super T, ? extends Publisher<? extends R>> f207953b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f207954c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f207955d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Subscription f207956e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f207957f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Dc.q<T> f207958g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public volatile boolean f207959h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public volatile boolean f207960i;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public volatile boolean f207962k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f207963l;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ConcatMapInner<R> f207952a = new ConcatMapInner<>(this);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final AtomicThrowable f207961j = new AtomicThrowable();

        public BaseConcatMapSubscriber(Bc.o<? super T, ? extends Publisher<? extends R>> mapper, int prefetch) {
            this.f207953b = mapper;
            this.f207954c = prefetch;
            this.f207955d = prefetch - (prefetch >> 2);
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMap.b
        public final void d() {
            this.f207962k = false;
            g();
        }

        public abstract void g();

        public abstract void h();

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f207959h = true;
            g();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.f207963l == 2 || this.f207958g.offer(t10)) {
                g();
            } else {
                this.f207956e.cancel();
                onError(new IllegalStateException("Queue full?!"));
            }
        }

        @Override // zc.InterfaceC5907y, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription s10) {
            if (SubscriptionHelper.validate(this.f207956e, s10)) {
                this.f207956e = s10;
                if (s10 instanceof Dc.n) {
                    Dc.n nVar = (Dc.n) s10;
                    int iRequestFusion = nVar.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.f207963l = iRequestFusion;
                        this.f207958g = nVar;
                        this.f207959h = true;
                        h();
                        g();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f207963l = iRequestFusion;
                        this.f207958g = nVar;
                        h();
                        s10.request(this.f207954c);
                        return;
                    }
                }
                this.f207958g = new SpscArrayQueue(this.f207954c);
                h();
                s10.request(this.f207954c);
            }
        }
    }

    public static final class ConcatMapDelayed<T, R> extends BaseConcatMapSubscriber<T, R> {
        private static final long serialVersionUID = -2945777694260521066L;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Subscriber<? super R> f207964m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final boolean f207965n;

        public ConcatMapDelayed(Subscriber<? super R> actual, Bc.o<? super T, ? extends Publisher<? extends R>> mapper, int prefetch, boolean veryEnd) {
            super(mapper, prefetch);
            this.f207964m = actual;
            this.f207965n = veryEnd;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMap.b
        public void a(Throwable e10) {
            if (this.f207961j.i(e10)) {
                if (!this.f207965n) {
                    this.f207956e.cancel();
                    this.f207959h = true;
                }
                this.f207962k = false;
                g();
            }
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (this.f207960i) {
                return;
            }
            this.f207960i = true;
            this.f207952a.cancel();
            this.f207956e.cancel();
            this.f207961j.j();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMap.b
        public void e(R value) {
            this.f207964m.onNext(value);
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber
        public void g() {
            Object obj;
            if (getAndIncrement() == 0) {
                while (!this.f207960i) {
                    if (!this.f207962k) {
                        boolean z10 = this.f207959h;
                        if (z10 && !this.f207965n && this.f207961j.get() != null) {
                            this.f207961j.k(this.f207964m);
                            return;
                        }
                        try {
                            T tPoll = this.f207958g.poll();
                            boolean z11 = tPoll == null;
                            if (z10 && z11) {
                                this.f207961j.k(this.f207964m);
                                return;
                            }
                            if (!z11) {
                                try {
                                    Publisher<? extends R> publisherApply = this.f207953b.apply(tPoll);
                                    Objects.requireNonNull(publisherApply, "The mapper returned a null Publisher");
                                    Publisher<? extends R> publisher = publisherApply;
                                    if (this.f207963l != 1) {
                                        int i10 = this.f207957f + 1;
                                        if (i10 == this.f207955d) {
                                            this.f207957f = 0;
                                            this.f207956e.request(i10);
                                        } else {
                                            this.f207957f = i10;
                                        }
                                    }
                                    if (publisher instanceof Bc.s) {
                                        try {
                                            obj = ((Bc.s) publisher).get();
                                        } catch (Throwable th) {
                                            io.reactivex.rxjava3.exceptions.a.b(th);
                                            this.f207961j.i(th);
                                            if (!this.f207965n) {
                                                this.f207956e.cancel();
                                                this.f207961j.k(this.f207964m);
                                                return;
                                            }
                                            obj = null;
                                        }
                                        if (obj == null) {
                                            continue;
                                        } else if (this.f207952a.f211931h) {
                                            this.f207964m.onNext(obj);
                                        } else {
                                            this.f207962k = true;
                                            ConcatMapInner<R> concatMapInner = this.f207952a;
                                            concatMapInner.l(new c(obj, concatMapInner));
                                        }
                                    } else {
                                        this.f207962k = true;
                                        publisher.subscribe(this.f207952a);
                                    }
                                } catch (Throwable th2) {
                                    io.reactivex.rxjava3.exceptions.a.b(th2);
                                    this.f207956e.cancel();
                                    this.f207961j.i(th2);
                                    this.f207961j.k(this.f207964m);
                                    return;
                                }
                            }
                        } catch (Throwable th3) {
                            io.reactivex.rxjava3.exceptions.a.b(th3);
                            this.f207956e.cancel();
                            this.f207961j.i(th3);
                            this.f207961j.k(this.f207964m);
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber
        public void h() {
            this.f207964m.onSubscribe(this);
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable t10) {
            if (this.f207961j.i(t10)) {
                this.f207959h = true;
                g();
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long n10) {
            this.f207952a.request(n10);
        }
    }

    public static final class ConcatMapImmediate<T, R> extends BaseConcatMapSubscriber<T, R> {
        private static final long serialVersionUID = 7898995095634264146L;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Subscriber<? super R> f207966m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final AtomicInteger f207967n;

        public ConcatMapImmediate(Subscriber<? super R> actual, Bc.o<? super T, ? extends Publisher<? extends R>> mapper, int prefetch) {
            super(mapper, prefetch);
            this.f207966m = actual;
            this.f207967n = new AtomicInteger();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMap.b
        public void a(Throwable e10) {
            this.f207956e.cancel();
            io.reactivex.rxjava3.internal.util.g.c(this.f207966m, e10, this, this.f207961j);
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (this.f207960i) {
                return;
            }
            this.f207960i = true;
            this.f207952a.cancel();
            this.f207956e.cancel();
            this.f207961j.j();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMap.b
        public void e(R value) {
            io.reactivex.rxjava3.internal.util.g.f(this.f207966m, value, this, this.f207961j);
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber
        public void g() {
            if (this.f207967n.getAndIncrement() == 0) {
                while (!this.f207960i) {
                    if (!this.f207962k) {
                        boolean z10 = this.f207959h;
                        try {
                            T tPoll = this.f207958g.poll();
                            boolean z11 = tPoll == null;
                            if (z10 && z11) {
                                this.f207966m.onComplete();
                                return;
                            }
                            if (!z11) {
                                try {
                                    Publisher<? extends R> publisherApply = this.f207953b.apply(tPoll);
                                    Objects.requireNonNull(publisherApply, "The mapper returned a null Publisher");
                                    Publisher<? extends R> publisher = publisherApply;
                                    if (this.f207963l != 1) {
                                        int i10 = this.f207957f + 1;
                                        if (i10 == this.f207955d) {
                                            this.f207957f = 0;
                                            this.f207956e.request(i10);
                                        } else {
                                            this.f207957f = i10;
                                        }
                                    }
                                    if (publisher instanceof Bc.s) {
                                        try {
                                            Object obj = ((Bc.s) publisher).get();
                                            if (obj == null) {
                                                continue;
                                            } else if (!this.f207952a.f211931h) {
                                                this.f207962k = true;
                                                ConcatMapInner<R> concatMapInner = this.f207952a;
                                                concatMapInner.l(new c(obj, concatMapInner));
                                            } else if (!io.reactivex.rxjava3.internal.util.g.f(this.f207966m, obj, this, this.f207961j)) {
                                                return;
                                            }
                                        } catch (Throwable th) {
                                            io.reactivex.rxjava3.exceptions.a.b(th);
                                            this.f207956e.cancel();
                                            this.f207961j.i(th);
                                            this.f207961j.k(this.f207966m);
                                            return;
                                        }
                                    } else {
                                        this.f207962k = true;
                                        publisher.subscribe(this.f207952a);
                                    }
                                } catch (Throwable th2) {
                                    io.reactivex.rxjava3.exceptions.a.b(th2);
                                    this.f207956e.cancel();
                                    this.f207961j.i(th2);
                                    this.f207961j.k(this.f207966m);
                                    return;
                                }
                            }
                        } catch (Throwable th3) {
                            io.reactivex.rxjava3.exceptions.a.b(th3);
                            this.f207956e.cancel();
                            this.f207961j.i(th3);
                            this.f207961j.k(this.f207966m);
                            return;
                        }
                    }
                    if (this.f207967n.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber
        public void h() {
            this.f207966m.onSubscribe(this);
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable t10) {
            this.f207952a.cancel();
            io.reactivex.rxjava3.internal.util.g.c(this.f207966m, t10, this, this.f207961j);
        }

        @Override // org.reactivestreams.Subscription
        public void request(long n10) {
            this.f207952a.request(n10);
        }
    }

    public static final class ConcatMapInner<R> extends SubscriptionArbiter implements InterfaceC5907y<R> {
        private static final long serialVersionUID = 897683679971470653L;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final b<R> f207968i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public long f207969j;

        public ConcatMapInner(b<R> parent) {
            super(false);
            this.f207968i = parent;
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            long j10 = this.f207969j;
            if (j10 != 0) {
                this.f207969j = 0L;
                k(j10);
            }
            this.f207968i.d();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable t10) {
            long j10 = this.f207969j;
            if (j10 != 0) {
                this.f207969j = 0L;
                k(j10);
            }
            this.f207968i.a(t10);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(R t10) {
            this.f207969j++;
            this.f207968i.e(t10);
        }

        @Override // zc.InterfaceC5907y, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription s10) {
            l(s10);
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f207970a;

        static {
            int[] iArr = new int[ErrorMode.values().length];
            f207970a = iArr;
            try {
                iArr[ErrorMode.BOUNDARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f207970a[ErrorMode.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public interface b<T> {
        void a(Throwable e10);

        void d();

        void e(T value);
    }

    public static final class c<T> implements Subscription {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Subscriber<? super T> f207971a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final T f207972b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f207973c;

        public c(T value, Subscriber<? super T> downstream) {
            this.f207972b = value;
            this.f207971a = downstream;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j10) {
            if (j10 <= 0 || this.f207973c) {
                return;
            }
            this.f207973c = true;
            Subscriber<? super T> subscriber = this.f207971a;
            subscriber.onNext(this.f207972b);
            subscriber.onComplete();
        }
    }

    public FlowableConcatMap(AbstractC5902t<T> source, Bc.o<? super T, ? extends Publisher<? extends R>> mapper, int prefetch, ErrorMode errorMode) {
        super(source);
        this.f207949c = mapper;
        this.f207950d = prefetch;
        this.f207951e = errorMode;
    }

    public static <T, R> Subscriber<T> f9(Subscriber<? super R> s10, Bc.o<? super T, ? extends Publisher<? extends R>> mapper, int prefetch, ErrorMode errorMode) {
        int i10 = a.f207970a[errorMode.ordinal()];
        return i10 != 1 ? i10 != 2 ? new ConcatMapImmediate(s10, mapper, prefetch) : new ConcatMapDelayed(s10, mapper, prefetch, true) : new ConcatMapDelayed(s10, mapper, prefetch, false);
    }

    @Override // zc.AbstractC5902t
    public void G6(Subscriber<? super R> s10) {
        if (b0.b(this.f209105b, s10, this.f207949c)) {
            return;
        }
        this.f209105b.subscribe(f9(s10, this.f207949c, this.f207950d, this.f207951e));
    }
}
