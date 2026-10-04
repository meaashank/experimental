package io.reactivex.internal.operators.flowable;

import androidx.compose.animation.core.C1598m0;
import hc.AbstractC4530j;
import hc.InterfaceC4535o;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import uc.C5666a;

/* JADX INFO: loaded from: classes7.dex */
public final class FlowableFlatMap<T, U> extends AbstractC4615a<T, U> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nc.o<? super T, ? extends Publisher<? extends U>> f203477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f203478d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f203479e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f203480f;

    public static final class InnerSubscriber<T, U> extends AtomicReference<Subscription> implements InterfaceC4535o<U>, io.reactivex.disposables.b {
        private static final long serialVersionUID = -4606175640614850599L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f203481a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MergeSubscriber<T, U> f203482b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f203483c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f203484d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public volatile boolean f203485e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public volatile pc.o<U> f203486f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f203487g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f203488h;

        public InnerSubscriber(MergeSubscriber<T, U> mergeSubscriber, long j10) {
            this.f203481a = j10;
            this.f203482b = mergeSubscriber;
            int i10 = mergeSubscriber.f203495e;
            this.f203484d = i10;
            this.f203483c = i10 >> 2;
        }

        public void a(long j10) {
            if (this.f203488h != 1) {
                long j11 = this.f203487g + j10;
                if (j11 < this.f203483c) {
                    this.f203487g = j11;
                } else {
                    this.f203487g = 0L;
                    get().request(j11);
                }
            }
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return get() == SubscriptionHelper.CANCELLED;
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f203485e = true;
            this.f203482b.i();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            lazySet(SubscriptionHelper.CANCELLED);
            this.f203482b.n(this, th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(U u10) {
            if (this.f203488h != 2) {
                this.f203482b.p(u10, this);
            } else {
                this.f203482b.i();
            }
        }

        @Override // hc.InterfaceC4535o, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.setOnce(this, subscription)) {
                if (subscription instanceof pc.l) {
                    pc.l lVar = (pc.l) subscription;
                    int iRequestFusion = lVar.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.f203488h = iRequestFusion;
                        this.f203486f = lVar;
                        this.f203485e = true;
                        this.f203482b.i();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f203488h = iRequestFusion;
                        this.f203486f = lVar;
                    }
                }
                subscription.request(this.f203484d);
            }
        }
    }

    public static final class MergeSubscriber<T, U> extends AtomicInteger implements InterfaceC4535o<T>, Subscription {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final InnerSubscriber<?, ?>[] f203489r = new InnerSubscriber[0];

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final InnerSubscriber<?, ?>[] f203490s = new InnerSubscriber[0];
        private static final long serialVersionUID = -2117620485640801370L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Subscriber<? super U> f203491a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final nc.o<? super T, ? extends Publisher<? extends U>> f203492b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f203493c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f203494d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f203495e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public volatile pc.n<U> f203496f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public volatile boolean f203497g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final AtomicThrowable f203498h = new AtomicThrowable();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public volatile boolean f203499i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final AtomicReference<InnerSubscriber<?, ?>[]> f203500j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final AtomicLong f203501k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Subscription f203502l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public long f203503m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public long f203504n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f203505o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f203506p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final int f203507q;

        public MergeSubscriber(Subscriber<? super U> subscriber, nc.o<? super T, ? extends Publisher<? extends U>> oVar, boolean z10, int i10, int i11) {
            AtomicReference<InnerSubscriber<?, ?>[]> atomicReference = new AtomicReference<>();
            this.f203500j = atomicReference;
            this.f203501k = new AtomicLong();
            this.f203491a = subscriber;
            this.f203492b = oVar;
            this.f203493c = z10;
            this.f203494d = i10;
            this.f203495e = i11;
            this.f203507q = Math.max(1, i10 >> 1);
            atomicReference.lazySet(f203489r);
        }

        public boolean a(InnerSubscriber<T, U> innerSubscriber) {
            InnerSubscriber<?, ?>[] innerSubscriberArr;
            InnerSubscriber[] innerSubscriberArr2;
            do {
                innerSubscriberArr = this.f203500j.get();
                if (innerSubscriberArr == f203490s) {
                    innerSubscriber.getClass();
                    SubscriptionHelper.cancel(innerSubscriber);
                    return false;
                }
                int length = innerSubscriberArr.length;
                innerSubscriberArr2 = new InnerSubscriber[length + 1];
                System.arraycopy(innerSubscriberArr, 0, innerSubscriberArr2, 0, length);
                innerSubscriberArr2[length] = innerSubscriber;
            } while (!C1598m0.a(this.f203500j, innerSubscriberArr, innerSubscriberArr2));
            return true;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            pc.n<U> nVar;
            if (this.f203499i) {
                return;
            }
            this.f203499i = true;
            this.f203502l.cancel();
            h();
            if (getAndIncrement() != 0 || (nVar = this.f203496f) == null) {
                return;
            }
            nVar.clear();
        }

        public boolean d() {
            if (this.f203499i) {
                g();
                return true;
            }
            if (this.f203493c || this.f203498h.get() == null) {
                return false;
            }
            g();
            AtomicThrowable atomicThrowable = this.f203498h;
            atomicThrowable.getClass();
            Throwable thC = ExceptionHelper.c(atomicThrowable);
            if (thC != ExceptionHelper.f207183a) {
                this.f203491a.onError(thC);
            }
            return true;
        }

        public void g() {
            pc.n<U> nVar = this.f203496f;
            if (nVar != null) {
                nVar.clear();
            }
        }

        public void h() {
            InnerSubscriber<?, ?>[] andSet;
            InnerSubscriber<?, ?>[] innerSubscriberArr = this.f203500j.get();
            InnerSubscriber<?, ?>[] innerSubscriberArr2 = f203490s;
            if (innerSubscriberArr == innerSubscriberArr2 || (andSet = this.f203500j.getAndSet(innerSubscriberArr2)) == innerSubscriberArr2) {
                return;
            }
            for (InnerSubscriber<?, ?> innerSubscriber : andSet) {
                innerSubscriber.getClass();
                SubscriptionHelper.cancel(innerSubscriber);
            }
            AtomicThrowable atomicThrowable = this.f203498h;
            atomicThrowable.getClass();
            Throwable thC = ExceptionHelper.c(atomicThrowable);
            if (thC == null || thC == ExceptionHelper.f207183a) {
                return;
            }
            C5666a.Y(thC);
        }

        public void i() {
            if (getAndIncrement() == 0) {
                k();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:155:0x0193 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:66:0x00de  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void k() {
            /*
                Method dump skipped, instruction units count: 447
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableFlatMap.MergeSubscriber.k():void");
        }

        public pc.o<U> l(InnerSubscriber<T, U> innerSubscriber) {
            pc.o<U> oVar = innerSubscriber.f203486f;
            if (oVar != null) {
                return oVar;
            }
            SpscArrayQueue spscArrayQueue = new SpscArrayQueue(this.f203495e);
            innerSubscriber.f203486f = spscArrayQueue;
            return spscArrayQueue;
        }

        public pc.o<U> m() {
            pc.n<U> aVar = this.f203496f;
            if (aVar == null) {
                aVar = this.f203494d == Integer.MAX_VALUE ? new io.reactivex.internal.queue.a<>(this.f203495e) : new SpscArrayQueue<>(this.f203494d);
                this.f203496f = aVar;
            }
            return aVar;
        }

        public void n(InnerSubscriber<T, U> innerSubscriber, Throwable th) {
            AtomicThrowable atomicThrowable = this.f203498h;
            atomicThrowable.getClass();
            if (!ExceptionHelper.a(atomicThrowable, th)) {
                C5666a.Y(th);
                return;
            }
            innerSubscriber.f203485e = true;
            if (!this.f203493c) {
                this.f203502l.cancel();
                for (InnerSubscriber<?, ?> innerSubscriber2 : this.f203500j.getAndSet(f203490s)) {
                    innerSubscriber2.getClass();
                    SubscriptionHelper.cancel(innerSubscriber2);
                }
            }
            i();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void o(InnerSubscriber<T, U> innerSubscriber) {
            InnerSubscriber<?, ?>[] innerSubscriberArr;
            InnerSubscriber<?, ?>[] innerSubscriberArr2;
            do {
                innerSubscriberArr = this.f203500j.get();
                int length = innerSubscriberArr.length;
                if (length == 0) {
                    return;
                }
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        i10 = -1;
                        break;
                    } else if (innerSubscriberArr[i10] == innerSubscriber) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (i10 < 0) {
                    return;
                }
                if (length == 1) {
                    innerSubscriberArr2 = f203489r;
                } else {
                    InnerSubscriber<?, ?>[] innerSubscriberArr3 = new InnerSubscriber[length - 1];
                    System.arraycopy(innerSubscriberArr, 0, innerSubscriberArr3, 0, i10);
                    System.arraycopy(innerSubscriberArr, i10 + 1, innerSubscriberArr3, i10, (length - i10) - 1);
                    innerSubscriberArr2 = innerSubscriberArr3;
                }
            } while (!C1598m0.a(this.f203500j, innerSubscriberArr, innerSubscriberArr2));
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f203497g) {
                return;
            }
            this.f203497g = true;
            i();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.f203497g) {
                C5666a.Y(th);
                return;
            }
            AtomicThrowable atomicThrowable = this.f203498h;
            atomicThrowable.getClass();
            if (!ExceptionHelper.a(atomicThrowable, th)) {
                C5666a.Y(th);
            } else {
                this.f203497g = true;
                i();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.reactivestreams.Subscriber
        public void onNext(T t10) {
            if (this.f203497g) {
                return;
            }
            try {
                Publisher<? extends U> publisherApply = this.f203492b.apply(t10);
                io.reactivex.internal.functions.a.g(publisherApply, "The mapper returned a null Publisher");
                Publisher<? extends U> publisher = publisherApply;
                if (!(publisher instanceof Callable)) {
                    long j10 = this.f203503m;
                    this.f203503m = 1 + j10;
                    InnerSubscriber innerSubscriber = new InnerSubscriber(this, j10);
                    if (a(innerSubscriber)) {
                        publisher.subscribe(innerSubscriber);
                        return;
                    }
                    return;
                }
                try {
                    Object objCall = ((Callable) publisher).call();
                    if (objCall != null) {
                        q(objCall);
                        return;
                    }
                    if (this.f203494d == Integer.MAX_VALUE || this.f203499i) {
                        return;
                    }
                    int i10 = this.f203506p + 1;
                    this.f203506p = i10;
                    int i11 = this.f203507q;
                    if (i10 == i11) {
                        this.f203506p = 0;
                        this.f203502l.request(i11);
                    }
                } catch (Throwable th) {
                    io.reactivex.exceptions.a.b(th);
                    AtomicThrowable atomicThrowable = this.f203498h;
                    atomicThrowable.getClass();
                    ExceptionHelper.a(atomicThrowable, th);
                    i();
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f203502l.cancel();
                onError(th2);
            }
        }

        @Override // hc.InterfaceC4535o, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f203502l, subscription)) {
                this.f203502l = subscription;
                this.f203491a.onSubscribe(this);
                if (this.f203499i) {
                    return;
                }
                int i10 = this.f203494d;
                if (i10 == Integer.MAX_VALUE) {
                    subscription.request(Long.MAX_VALUE);
                } else {
                    subscription.request(i10);
                }
            }
        }

        public void p(U u10, InnerSubscriber<T, U> innerSubscriber) {
            if (get() == 0 && compareAndSet(0, 1)) {
                long j10 = this.f203501k.get();
                pc.o<U> oVarL = innerSubscriber.f203486f;
                if (j10 == 0 || !(oVarL == null || oVarL.isEmpty())) {
                    if (oVarL == null) {
                        oVarL = l(innerSubscriber);
                    }
                    if (!oVarL.offer(u10)) {
                        onError(new MissingBackpressureException("Inner queue full?!"));
                        return;
                    }
                } else {
                    this.f203491a.onNext(u10);
                    if (j10 != Long.MAX_VALUE) {
                        this.f203501k.decrementAndGet();
                    }
                    innerSubscriber.a(1L);
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                pc.o spscArrayQueue = innerSubscriber.f203486f;
                if (spscArrayQueue == null) {
                    spscArrayQueue = new SpscArrayQueue(this.f203495e);
                    innerSubscriber.f203486f = spscArrayQueue;
                }
                if (!spscArrayQueue.offer(u10)) {
                    onError(new MissingBackpressureException("Inner queue full?!"));
                    return;
                } else if (getAndIncrement() != 0) {
                    return;
                }
            }
            k();
        }

        public void q(U u10) {
            if (get() == 0 && compareAndSet(0, 1)) {
                long j10 = this.f203501k.get();
                pc.o<U> oVarM = this.f203496f;
                if (j10 == 0 || !(oVarM == null || oVarM.isEmpty())) {
                    if (oVarM == null) {
                        oVarM = m();
                    }
                    if (!oVarM.offer(u10)) {
                        onError(new IllegalStateException("Scalar queue full?!"));
                        return;
                    }
                } else {
                    this.f203491a.onNext(u10);
                    if (j10 != Long.MAX_VALUE) {
                        this.f203501k.decrementAndGet();
                    }
                    if (this.f203494d != Integer.MAX_VALUE && !this.f203499i) {
                        int i10 = this.f203506p + 1;
                        this.f203506p = i10;
                        int i11 = this.f203507q;
                        if (i10 == i11) {
                            this.f203506p = 0;
                            this.f203502l.request(i11);
                        }
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else if (!m().offer(u10)) {
                onError(new IllegalStateException("Scalar queue full?!"));
                return;
            } else if (getAndIncrement() != 0) {
                return;
            }
            k();
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                io.reactivex.internal.util.b.a(this.f203501k, j10);
                i();
            }
        }
    }

    public FlowableFlatMap(AbstractC4530j<T> abstractC4530j, nc.o<? super T, ? extends Publisher<? extends U>> oVar, boolean z10, int i10, int i11) {
        super(abstractC4530j);
        this.f203477c = oVar;
        this.f203478d = z10;
        this.f203479e = i10;
        this.f203480f = i11;
    }

    public static <T, U> InterfaceC4535o<T> F8(Subscriber<? super U> subscriber, nc.o<? super T, ? extends Publisher<? extends U>> oVar, boolean z10, int i10, int i11) {
        return new MergeSubscriber(subscriber, oVar, z10, i10, i11);
    }

    @Override // hc.AbstractC4530j
    public void d6(Subscriber<? super U> subscriber) {
        if (Z.b(this.f204439b, subscriber, this.f203477c)) {
            return;
        }
        this.f204439b.c6(new MergeSubscriber(subscriber, this.f203477c, this.f203478d, this.f203479e, this.f203480f));
    }
}
