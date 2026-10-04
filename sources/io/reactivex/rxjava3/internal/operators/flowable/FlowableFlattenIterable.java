package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.queue.SpscArrayQueue;
import io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import zc.AbstractC5902t;
import zc.InterfaceC5907y;

/* JADX INFO: loaded from: classes7.dex */
public final class FlowableFlattenIterable<T, R> extends AbstractC4700a<T, R> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bc.o<? super T, ? extends Iterable<? extends R>> f208183c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f208184d;

    public static final class FlattenIterableSubscriber<T, R> extends BasicIntQueueSubscription<R> implements InterfaceC5907y<T> {
        private static final long serialVersionUID = -3096000382929934955L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Subscriber<? super R> f208185a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Bc.o<? super T, ? extends Iterable<? extends R>> f208186b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f208187c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f208188d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Subscription f208190f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Dc.q<T> f208191g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public volatile boolean f208192h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public volatile boolean f208193i;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Iterator<? extends R> f208195k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f208196l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f208197m;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final AtomicReference<Throwable> f208194j = new AtomicReference<>();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final AtomicLong f208189e = new AtomicLong();

        public FlattenIterableSubscriber(Subscriber<? super R> actual, Bc.o<? super T, ? extends Iterable<? extends R>> mapper, int prefetch) {
            this.f208185a = actual;
            this.f208186b = mapper;
            this.f208187c = prefetch;
            this.f208188d = prefetch - (prefetch >> 2);
        }

        public boolean b(boolean d10, boolean empty, Subscriber<?> a10, Dc.q<?> q10) {
            if (this.f208193i) {
                this.f208195k = null;
                q10.clear();
                return true;
            }
            if (!d10) {
                return false;
            }
            if (this.f208194j.get() == null) {
                if (!empty) {
                    return false;
                }
                a10.onComplete();
                return true;
            }
            Throwable thF = ExceptionHelper.f(this.f208194j);
            this.f208195k = null;
            q10.clear();
            a10.onError(thF);
            return true;
        }

        public void c(boolean enabled) {
            if (enabled) {
                int i10 = this.f208196l + 1;
                if (i10 != this.f208188d) {
                    this.f208196l = i10;
                } else {
                    this.f208196l = 0;
                    this.f208190f.request(i10);
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (this.f208193i) {
                return;
            }
            this.f208193i = true;
            this.f208190f.cancel();
            if (getAndIncrement() == 0) {
                this.f208191g.clear();
            }
        }

        @Override // Dc.q
        public void clear() {
            this.f208195k = null;
            this.f208191g.clear();
        }

        /* JADX WARN: Removed duplicated region for block: B:70:0x0127 A[PHI: r6
          0x0127: PHI (r6v4 java.util.Iterator<? extends R>) = (r6v3 java.util.Iterator<? extends R>), (r6v6 java.util.Iterator<? extends R>) binds: [B:31:0x0081, B:68:0x0122] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void d() {
            /*
                Method dump skipped, instruction units count: 303
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.rxjava3.internal.operators.flowable.FlowableFlattenIterable.FlattenIterableSubscriber.d():void");
        }

        @Override // Dc.q
        public boolean isEmpty() {
            return this.f208195k == null && this.f208191g.isEmpty();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f208192h) {
                return;
            }
            this.f208192h = true;
            d();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable t10) {
            if (this.f208192h || !ExceptionHelper.a(this.f208194j, t10)) {
                Ic.a.Y(t10);
            } else {
                this.f208192h = true;
                d();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t10) {
            if (this.f208192h) {
                return;
            }
            if (this.f208197m != 0 || this.f208191g.offer(t10)) {
                d();
            } else {
                onError(new MissingBackpressureException("Queue is full?!"));
            }
        }

        @Override // zc.InterfaceC5907y, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription s10) {
            if (SubscriptionHelper.validate(this.f208190f, s10)) {
                this.f208190f = s10;
                if (s10 instanceof Dc.n) {
                    Dc.n nVar = (Dc.n) s10;
                    int iRequestFusion = nVar.requestFusion(3);
                    if (iRequestFusion == 1) {
                        this.f208197m = iRequestFusion;
                        this.f208191g = nVar;
                        this.f208192h = true;
                        this.f208185a.onSubscribe(this);
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f208197m = iRequestFusion;
                        this.f208191g = nVar;
                        this.f208185a.onSubscribe(this);
                        s10.request(this.f208187c);
                        return;
                    }
                }
                this.f208191g = new SpscArrayQueue(this.f208187c);
                this.f208185a.onSubscribe(this);
                s10.request(this.f208187c);
            }
        }

        @Override // Dc.q
        @yc.f
        public R poll() throws Throwable {
            Iterator<? extends R> it = this.f208195k;
            while (true) {
                if (it == null) {
                    T tPoll = this.f208191g.poll();
                    if (tPoll != null) {
                        it = this.f208186b.apply(tPoll).iterator();
                        if (it.hasNext()) {
                            this.f208195k = it;
                            break;
                        }
                        it = null;
                    } else {
                        return null;
                    }
                } else {
                    break;
                }
            }
            R next = it.next();
            Objects.requireNonNull(next, "The iterator returned a null value");
            if (!it.hasNext()) {
                this.f208195k = null;
            }
            return next;
        }

        @Override // org.reactivestreams.Subscription
        public void request(long n10) {
            if (SubscriptionHelper.validate(n10)) {
                io.reactivex.rxjava3.internal.util.b.a(this.f208189e, n10);
                d();
            }
        }

        @Override // Dc.m
        public int requestFusion(int requestedMode) {
            return ((requestedMode & 1) == 0 || this.f208197m != 1) ? 0 : 1;
        }
    }

    public FlowableFlattenIterable(AbstractC5902t<T> source, Bc.o<? super T, ? extends Iterable<? extends R>> mapper, int prefetch) {
        super(source);
        this.f208183c = mapper;
        this.f208184d = prefetch;
    }

    public static <T, R> Subscriber<T> f9(Subscriber<? super R> downstream, Bc.o<? super T, ? extends Iterable<? extends R>> mapper, int prefetch) {
        return new FlattenIterableSubscriber(downstream, mapper, prefetch);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // zc.AbstractC5902t
    public void G6(Subscriber<? super R> subscriber) {
        AbstractC5902t<T> abstractC5902t = this.f209105b;
        if (!(abstractC5902t instanceof Bc.s)) {
            abstractC5902t.F6(new FlattenIterableSubscriber(subscriber, this.f208183c, this.f208184d));
            return;
        }
        try {
            Object obj = ((Bc.s) abstractC5902t).get();
            if (obj == null) {
                EmptySubscription.complete(subscriber);
                return;
            }
            try {
                FlowableFromIterable.f9(subscriber, this.f208183c.apply(obj).iterator());
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                EmptySubscription.error(th, subscriber);
            }
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.b(th2);
            EmptySubscription.error(th2, subscriber);
        }
    }
}
