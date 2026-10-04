package io.reactivex.internal.operators.flowable;

import hc.AbstractC4530j;
import hc.InterfaceC4535o;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import uc.C5666a;

/* JADX INFO: loaded from: classes7.dex */
public final class FlowableConcatMap<T, R> extends AbstractC4615a<T, R> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nc.o<? super T, ? extends Publisher<? extends R>> f203358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f203359d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ErrorMode f203360e;

    public static abstract class BaseConcatMapSubscriber<T, R> extends AtomicInteger implements InterfaceC4535o<T>, b<R>, Subscription {
        private static final long serialVersionUID = -3511336836796789179L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final nc.o<? super T, ? extends Publisher<? extends R>> f203362b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f203363c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f203364d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Subscription f203365e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f203366f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public pc.o<T> f203367g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public volatile boolean f203368h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public volatile boolean f203369i;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public volatile boolean f203371k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f203372l;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ConcatMapInner<R> f203361a = new ConcatMapInner<>(this);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final AtomicThrowable f203370j = new AtomicThrowable();

        public BaseConcatMapSubscriber(nc.o<? super T, ? extends Publisher<? extends R>> oVar, int i10) {
            this.f203362b = oVar;
            this.f203363c = i10;
            this.f203364d = i10 - (i10 >> 2);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.b
        public final void d() {
            this.f203371k = false;
            g();
        }

        public abstract void g();

        public abstract void h();

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f203368h = true;
            g();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.f203372l == 2 || this.f203367g.offer(t10)) {
                g();
            } else {
                this.f203365e.cancel();
                onError(new IllegalStateException("Queue full?!"));
            }
        }

        @Override // hc.InterfaceC4535o, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f203365e, subscription)) {
                this.f203365e = subscription;
                if (subscription instanceof pc.l) {
                    pc.l lVar = (pc.l) subscription;
                    int iRequestFusion = lVar.requestFusion(3);
                    if (iRequestFusion == 1) {
                        this.f203372l = iRequestFusion;
                        this.f203367g = lVar;
                        this.f203368h = true;
                        h();
                        g();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f203372l = iRequestFusion;
                        this.f203367g = lVar;
                        h();
                        subscription.request(this.f203363c);
                        return;
                    }
                }
                this.f203367g = new SpscArrayQueue(this.f203363c);
                h();
                subscription.request(this.f203363c);
            }
        }
    }

    public static final class ConcatMapDelayed<T, R> extends BaseConcatMapSubscriber<T, R> {
        private static final long serialVersionUID = -2945777694260521066L;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Subscriber<? super R> f203373m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final boolean f203374n;

        public ConcatMapDelayed(Subscriber<? super R> subscriber, nc.o<? super T, ? extends Publisher<? extends R>> oVar, int i10, boolean z10) {
            super(oVar, i10);
            this.f203373m = subscriber;
            this.f203374n = z10;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.b
        public void a(Throwable th) {
            AtomicThrowable atomicThrowable = this.f203370j;
            atomicThrowable.getClass();
            if (!ExceptionHelper.a(atomicThrowable, th)) {
                C5666a.Y(th);
                return;
            }
            if (!this.f203374n) {
                this.f203365e.cancel();
                this.f203368h = true;
            }
            this.f203371k = false;
            g();
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (this.f203369i) {
                return;
            }
            this.f203369i = true;
            this.f203361a.cancel();
            this.f203365e.cancel();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.b
        public void e(R r10) {
            this.f203373m.onNext(r10);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber
        public void g() {
            if (getAndIncrement() == 0) {
                while (!this.f203369i) {
                    if (!this.f203371k) {
                        boolean z10 = this.f203368h;
                        if (z10 && !this.f203374n && this.f203370j.get() != null) {
                            Subscriber<? super R> subscriber = this.f203373m;
                            AtomicThrowable atomicThrowable = this.f203370j;
                            C4623i.a(atomicThrowable, atomicThrowable, subscriber);
                            return;
                        }
                        try {
                            T tPoll = this.f203367g.poll();
                            boolean z11 = tPoll == null;
                            if (z10 && z11) {
                                AtomicThrowable atomicThrowable2 = this.f203370j;
                                atomicThrowable2.getClass();
                                Throwable thC = ExceptionHelper.c(atomicThrowable2);
                                if (thC != null) {
                                    this.f203373m.onError(thC);
                                    return;
                                } else {
                                    this.f203373m.onComplete();
                                    return;
                                }
                            }
                            if (!z11) {
                                try {
                                    Publisher<? extends R> publisherApply = this.f203362b.apply(tPoll);
                                    io.reactivex.internal.functions.a.g(publisherApply, "The mapper returned a null Publisher");
                                    Publisher<? extends R> publisher = publisherApply;
                                    if (this.f203372l != 1) {
                                        int i10 = this.f203366f + 1;
                                        if (i10 == this.f203364d) {
                                            this.f203366f = 0;
                                            this.f203365e.request(i10);
                                        } else {
                                            this.f203366f = i10;
                                        }
                                    }
                                    if (publisher instanceof Callable) {
                                        try {
                                            Object objCall = ((Callable) publisher).call();
                                            if (objCall == null) {
                                                continue;
                                            } else if (this.f203361a.f207182g) {
                                                this.f203373m.onNext(objCall);
                                            } else {
                                                this.f203371k = true;
                                                ConcatMapInner<R> concatMapInner = this.f203361a;
                                                concatMapInner.l(new c(objCall, concatMapInner));
                                            }
                                        } catch (Throwable th) {
                                            io.reactivex.exceptions.a.b(th);
                                            this.f203365e.cancel();
                                            AtomicThrowable atomicThrowable3 = this.f203370j;
                                            atomicThrowable3.getClass();
                                            ExceptionHelper.a(atomicThrowable3, th);
                                            Subscriber<? super R> subscriber2 = this.f203373m;
                                            AtomicThrowable atomicThrowable4 = this.f203370j;
                                            C4623i.a(atomicThrowable4, atomicThrowable4, subscriber2);
                                            return;
                                        }
                                    } else {
                                        this.f203371k = true;
                                        publisher.subscribe(this.f203361a);
                                    }
                                } catch (Throwable th2) {
                                    io.reactivex.exceptions.a.b(th2);
                                    this.f203365e.cancel();
                                    AtomicThrowable atomicThrowable5 = this.f203370j;
                                    atomicThrowable5.getClass();
                                    ExceptionHelper.a(atomicThrowable5, th2);
                                    Subscriber<? super R> subscriber3 = this.f203373m;
                                    AtomicThrowable atomicThrowable6 = this.f203370j;
                                    C4623i.a(atomicThrowable6, atomicThrowable6, subscriber3);
                                    return;
                                }
                            }
                        } catch (Throwable th3) {
                            io.reactivex.exceptions.a.b(th3);
                            this.f203365e.cancel();
                            AtomicThrowable atomicThrowable7 = this.f203370j;
                            atomicThrowable7.getClass();
                            ExceptionHelper.a(atomicThrowable7, th3);
                            Subscriber<? super R> subscriber4 = this.f203373m;
                            AtomicThrowable atomicThrowable8 = this.f203370j;
                            C4623i.a(atomicThrowable8, atomicThrowable8, subscriber4);
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber
        public void h() {
            this.f203373m.onSubscribe(this);
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            AtomicThrowable atomicThrowable = this.f203370j;
            atomicThrowable.getClass();
            if (!ExceptionHelper.a(atomicThrowable, th)) {
                C5666a.Y(th);
            } else {
                this.f203368h = true;
                g();
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j10) {
            this.f203361a.request(j10);
        }
    }

    public static final class ConcatMapImmediate<T, R> extends BaseConcatMapSubscriber<T, R> {
        private static final long serialVersionUID = 7898995095634264146L;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Subscriber<? super R> f203375m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final AtomicInteger f203376n;

        public ConcatMapImmediate(Subscriber<? super R> subscriber, nc.o<? super T, ? extends Publisher<? extends R>> oVar, int i10) {
            super(oVar, i10);
            this.f203375m = subscriber;
            this.f203376n = new AtomicInteger();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.b
        public void a(Throwable th) {
            AtomicThrowable atomicThrowable = this.f203370j;
            atomicThrowable.getClass();
            if (!ExceptionHelper.a(atomicThrowable, th)) {
                C5666a.Y(th);
                return;
            }
            this.f203365e.cancel();
            if (getAndIncrement() == 0) {
                Subscriber<? super R> subscriber = this.f203375m;
                AtomicThrowable atomicThrowable2 = this.f203370j;
                C4623i.a(atomicThrowable2, atomicThrowable2, subscriber);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (this.f203369i) {
                return;
            }
            this.f203369i = true;
            this.f203361a.cancel();
            this.f203365e.cancel();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.b
        public void e(R r10) {
            if (get() == 0 && compareAndSet(0, 1)) {
                this.f203375m.onNext(r10);
                if (compareAndSet(1, 0)) {
                    return;
                }
                Subscriber<? super R> subscriber = this.f203375m;
                AtomicThrowable atomicThrowable = this.f203370j;
                C4623i.a(atomicThrowable, atomicThrowable, subscriber);
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber
        public void g() {
            if (this.f203376n.getAndIncrement() == 0) {
                while (!this.f203369i) {
                    if (!this.f203371k) {
                        boolean z10 = this.f203368h;
                        try {
                            T tPoll = this.f203367g.poll();
                            boolean z11 = tPoll == null;
                            if (z10 && z11) {
                                this.f203375m.onComplete();
                                return;
                            }
                            if (!z11) {
                                try {
                                    Publisher<? extends R> publisherApply = this.f203362b.apply(tPoll);
                                    io.reactivex.internal.functions.a.g(publisherApply, "The mapper returned a null Publisher");
                                    Publisher<? extends R> publisher = publisherApply;
                                    if (this.f203372l != 1) {
                                        int i10 = this.f203366f + 1;
                                        if (i10 == this.f203364d) {
                                            this.f203366f = 0;
                                            this.f203365e.request(i10);
                                        } else {
                                            this.f203366f = i10;
                                        }
                                    }
                                    if (publisher instanceof Callable) {
                                        try {
                                            Object objCall = ((Callable) publisher).call();
                                            if (objCall == null) {
                                                continue;
                                            } else if (!this.f203361a.f207182g) {
                                                this.f203371k = true;
                                                ConcatMapInner<R> concatMapInner = this.f203361a;
                                                concatMapInner.l(new c(objCall, concatMapInner));
                                            } else if (get() == 0 && compareAndSet(0, 1)) {
                                                this.f203375m.onNext(objCall);
                                                if (!compareAndSet(1, 0)) {
                                                    Subscriber<? super R> subscriber = this.f203375m;
                                                    AtomicThrowable atomicThrowable = this.f203370j;
                                                    C4623i.a(atomicThrowable, atomicThrowable, subscriber);
                                                    return;
                                                }
                                            }
                                        } catch (Throwable th) {
                                            io.reactivex.exceptions.a.b(th);
                                            this.f203365e.cancel();
                                            AtomicThrowable atomicThrowable2 = this.f203370j;
                                            atomicThrowable2.getClass();
                                            ExceptionHelper.a(atomicThrowable2, th);
                                            Subscriber<? super R> subscriber2 = this.f203375m;
                                            AtomicThrowable atomicThrowable3 = this.f203370j;
                                            C4623i.a(atomicThrowable3, atomicThrowable3, subscriber2);
                                            return;
                                        }
                                    } else {
                                        this.f203371k = true;
                                        publisher.subscribe(this.f203361a);
                                    }
                                } catch (Throwable th2) {
                                    io.reactivex.exceptions.a.b(th2);
                                    this.f203365e.cancel();
                                    AtomicThrowable atomicThrowable4 = this.f203370j;
                                    atomicThrowable4.getClass();
                                    ExceptionHelper.a(atomicThrowable4, th2);
                                    Subscriber<? super R> subscriber3 = this.f203375m;
                                    AtomicThrowable atomicThrowable5 = this.f203370j;
                                    C4623i.a(atomicThrowable5, atomicThrowable5, subscriber3);
                                    return;
                                }
                            }
                        } catch (Throwable th3) {
                            io.reactivex.exceptions.a.b(th3);
                            this.f203365e.cancel();
                            AtomicThrowable atomicThrowable6 = this.f203370j;
                            atomicThrowable6.getClass();
                            ExceptionHelper.a(atomicThrowable6, th3);
                            Subscriber<? super R> subscriber4 = this.f203375m;
                            AtomicThrowable atomicThrowable7 = this.f203370j;
                            C4623i.a(atomicThrowable7, atomicThrowable7, subscriber4);
                            return;
                        }
                    }
                    if (this.f203376n.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber
        public void h() {
            this.f203375m.onSubscribe(this);
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            AtomicThrowable atomicThrowable = this.f203370j;
            atomicThrowable.getClass();
            if (!ExceptionHelper.a(atomicThrowable, th)) {
                C5666a.Y(th);
                return;
            }
            this.f203361a.cancel();
            if (getAndIncrement() == 0) {
                Subscriber<? super R> subscriber = this.f203375m;
                AtomicThrowable atomicThrowable2 = this.f203370j;
                C4623i.a(atomicThrowable2, atomicThrowable2, subscriber);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j10) {
            this.f203361a.request(j10);
        }
    }

    public static final class ConcatMapInner<R> extends SubscriptionArbiter implements InterfaceC4535o<R> {
        private static final long serialVersionUID = 897683679971470653L;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final b<R> f203377h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public long f203378i;

        public ConcatMapInner(b<R> bVar) {
            this.f203377h = bVar;
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            long j10 = this.f203378i;
            if (j10 != 0) {
                this.f203378i = 0L;
                k(j10);
            }
            this.f203377h.d();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            long j10 = this.f203378i;
            if (j10 != 0) {
                this.f203378i = 0L;
                k(j10);
            }
            this.f203377h.a(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(R r10) {
            this.f203378i++;
            this.f203377h.e(r10);
        }

        @Override // hc.InterfaceC4535o, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription subscription) {
            l(subscription);
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f203379a;

        static {
            int[] iArr = new int[ErrorMode.values().length];
            f203379a = iArr;
            try {
                iArr[ErrorMode.BOUNDARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f203379a[ErrorMode.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public interface b<T> {
        void a(Throwable th);

        void d();

        void e(T t10);
    }

    public static final class c<T> implements Subscription {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Subscriber<? super T> f203380a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final T f203381b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f203382c;

        public c(T t10, Subscriber<? super T> subscriber) {
            this.f203381b = t10;
            this.f203380a = subscriber;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j10) {
            if (j10 <= 0 || this.f203382c) {
                return;
            }
            this.f203382c = true;
            Subscriber<? super T> subscriber = this.f203380a;
            subscriber.onNext(this.f203381b);
            subscriber.onComplete();
        }
    }

    public FlowableConcatMap(AbstractC4530j<T> abstractC4530j, nc.o<? super T, ? extends Publisher<? extends R>> oVar, int i10, ErrorMode errorMode) {
        super(abstractC4530j);
        this.f203358c = oVar;
        this.f203359d = i10;
        this.f203360e = errorMode;
    }

    public static <T, R> Subscriber<T> F8(Subscriber<? super R> subscriber, nc.o<? super T, ? extends Publisher<? extends R>> oVar, int i10, ErrorMode errorMode) {
        int i11 = a.f203379a[errorMode.ordinal()];
        return i11 != 1 ? i11 != 2 ? new ConcatMapImmediate(subscriber, oVar, i10) : new ConcatMapDelayed(subscriber, oVar, i10, true) : new ConcatMapDelayed(subscriber, oVar, i10, false);
    }

    @Override // hc.AbstractC4530j
    public void d6(Subscriber<? super R> subscriber) {
        if (Z.b(this.f204439b, subscriber, this.f203358c)) {
            return;
        }
        this.f204439b.subscribe(F8(subscriber, this.f203358c, this.f203359d, this.f203360e));
    }
}
