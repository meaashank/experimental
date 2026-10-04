package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.InnerQueuedObserver;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class ObservableConcatMapEager<T, R> extends AbstractC4740a<T, R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bc.o<? super T, ? extends zc.T<? extends R>> f210122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ErrorMode f210123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f210124d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f210125e;

    public static final class ConcatMapEagerMainObserver<T, R> extends AtomicInteger implements zc.V<T>, io.reactivex.rxjava3.disposables.d, Ec.k<R> {
        private static final long serialVersionUID = 8080567949447303262L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zc.V<? super R> f210126a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Bc.o<? super T, ? extends zc.T<? extends R>> f210127b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f210128c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f210129d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ErrorMode f210130e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final AtomicThrowable f210131f = new AtomicThrowable();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ArrayDeque<InnerQueuedObserver<R>> f210132g = new ArrayDeque<>();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Dc.q<T> f210133h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f210134i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public volatile boolean f210135j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f210136k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public volatile boolean f210137l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public InnerQueuedObserver<R> f210138m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f210139n;

        public ConcatMapEagerMainObserver(zc.V<? super R> actual, Bc.o<? super T, ? extends zc.T<? extends R>> mapper, int maxConcurrency, int prefetch, ErrorMode errorMode) {
            this.f210126a = actual;
            this.f210127b = mapper;
            this.f210128c = maxConcurrency;
            this.f210129d = prefetch;
            this.f210130e = errorMode;
        }

        @Override // Ec.k
        public void d() {
            R rPoll;
            boolean z10;
            if (getAndIncrement() != 0) {
                return;
            }
            Dc.q<T> qVar = this.f210133h;
            ArrayDeque<InnerQueuedObserver<R>> arrayDeque = this.f210132g;
            zc.V<? super R> v10 = this.f210126a;
            ErrorMode errorMode = this.f210130e;
            int iAddAndGet = 1;
            while (true) {
                int i10 = this.f210139n;
                while (i10 != this.f210128c) {
                    if (this.f210137l) {
                        qVar.clear();
                        h();
                        return;
                    }
                    if (errorMode == ErrorMode.IMMEDIATE && this.f210131f.get() != null) {
                        qVar.clear();
                        h();
                        this.f210131f.o(this.f210126a);
                        return;
                    }
                    try {
                        T tPoll = qVar.poll();
                        if (tPoll == null) {
                            break;
                        }
                        zc.T<? extends R> tApply = this.f210127b.apply(tPoll);
                        Objects.requireNonNull(tApply, "The mapper returned a null ObservableSource");
                        zc.T<? extends R> t10 = tApply;
                        InnerQueuedObserver<R> innerQueuedObserver = new InnerQueuedObserver<>(this, this.f210129d);
                        arrayDeque.offer(innerQueuedObserver);
                        t10.a(innerQueuedObserver);
                        i10++;
                    } catch (Throwable th) {
                        io.reactivex.rxjava3.exceptions.a.b(th);
                        this.f210134i.dispose();
                        qVar.clear();
                        h();
                        this.f210131f.i(th);
                        this.f210131f.o(this.f210126a);
                        return;
                    }
                }
                this.f210139n = i10;
                if (this.f210137l) {
                    qVar.clear();
                    h();
                    return;
                }
                if (errorMode == ErrorMode.IMMEDIATE && this.f210131f.get() != null) {
                    qVar.clear();
                    h();
                    this.f210131f.o(this.f210126a);
                    return;
                }
                InnerQueuedObserver<R> innerQueuedObserver2 = this.f210138m;
                if (innerQueuedObserver2 == null) {
                    if (errorMode == ErrorMode.BOUNDARY && this.f210131f.get() != null) {
                        qVar.clear();
                        h();
                        this.f210131f.o(v10);
                        return;
                    }
                    boolean z11 = this.f210135j;
                    InnerQueuedObserver<R> innerQueuedObserverPoll = arrayDeque.poll();
                    boolean z12 = innerQueuedObserverPoll == null;
                    if (z11 && z12) {
                        if (this.f210131f.get() == null) {
                            v10.onComplete();
                            return;
                        }
                        qVar.clear();
                        h();
                        this.f210131f.o(v10);
                        return;
                    }
                    if (!z12) {
                        this.f210138m = innerQueuedObserverPoll;
                    }
                    innerQueuedObserver2 = innerQueuedObserverPoll;
                }
                if (innerQueuedObserver2 != null) {
                    Dc.q<R> qVar2 = innerQueuedObserver2.f207599c;
                    while (!this.f210137l) {
                        boolean z13 = innerQueuedObserver2.f207600d;
                        if (errorMode == ErrorMode.IMMEDIATE && this.f210131f.get() != null) {
                            qVar.clear();
                            h();
                            this.f210131f.o(v10);
                            return;
                        }
                        try {
                            rPoll = qVar2.poll();
                            z10 = rPoll == null;
                        } catch (Throwable th2) {
                            io.reactivex.rxjava3.exceptions.a.b(th2);
                            this.f210131f.i(th2);
                            this.f210138m = null;
                            this.f210139n--;
                        }
                        if (z13 && z10) {
                            this.f210138m = null;
                            this.f210139n--;
                        } else if (!z10) {
                            v10.onNext(rPoll);
                        }
                    }
                    qVar.clear();
                    h();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            if (this.f210137l) {
                return;
            }
            this.f210137l = true;
            this.f210134i.dispose();
            this.f210131f.j();
            i();
        }

        @Override // Ec.k
        public void e(InnerQueuedObserver<R> inner, R value) {
            inner.f207599c.offer(value);
            d();
        }

        @Override // Ec.k
        public void f(InnerQueuedObserver<R> inner) {
            inner.f207600d = true;
            d();
        }

        @Override // Ec.k
        public void g(InnerQueuedObserver<R> inner, Throwable e10) {
            if (this.f210131f.i(e10)) {
                if (this.f210130e == ErrorMode.IMMEDIATE) {
                    this.f210134i.dispose();
                }
                inner.f207600d = true;
                d();
            }
        }

        public void h() {
            InnerQueuedObserver<R> innerQueuedObserver = this.f210138m;
            if (innerQueuedObserver != null) {
                DisposableHelper.dispose(innerQueuedObserver);
            }
            while (true) {
                InnerQueuedObserver<R> innerQueuedObserverPoll = this.f210132g.poll();
                if (innerQueuedObserverPoll == null) {
                    return;
                } else {
                    DisposableHelper.dispose(innerQueuedObserverPoll);
                }
            }
        }

        public void i() {
            if (getAndIncrement() == 0) {
                do {
                    this.f210133h.clear();
                    h();
                } while (decrementAndGet() != 0);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return this.f210137l;
        }

        @Override // zc.V
        public void onComplete() {
            this.f210135j = true;
            d();
        }

        @Override // zc.V
        public void onError(Throwable e10) {
            if (this.f210131f.i(e10)) {
                this.f210135j = true;
                d();
            }
        }

        @Override // zc.V
        public void onNext(T value) {
            if (this.f210136k == 0) {
                this.f210133h.offer(value);
            }
            d();
        }

        @Override // zc.V
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            if (DisposableHelper.validate(this.f210134i, d10)) {
                this.f210134i = d10;
                if (d10 instanceof Dc.l) {
                    Dc.l lVar = (Dc.l) d10;
                    int iRequestFusion = lVar.requestFusion(3);
                    if (iRequestFusion == 1) {
                        this.f210136k = iRequestFusion;
                        this.f210133h = lVar;
                        this.f210135j = true;
                        this.f210126a.onSubscribe(this);
                        d();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f210136k = iRequestFusion;
                        this.f210133h = lVar;
                        this.f210126a.onSubscribe(this);
                        return;
                    }
                }
                this.f210133h = new io.reactivex.rxjava3.internal.queue.a(this.f210129d);
                this.f210126a.onSubscribe(this);
            }
        }
    }

    public ObservableConcatMapEager(zc.T<T> source, Bc.o<? super T, ? extends zc.T<? extends R>> mapper, ErrorMode errorMode, int maxConcurrency, int prefetch) {
        super(source);
        this.f210122b = mapper;
        this.f210123c = errorMode;
        this.f210124d = maxConcurrency;
        this.f210125e = prefetch;
    }

    @Override // zc.N
    public void d6(zc.V<? super R> observer) {
        this.f210954a.a(new ConcatMapEagerMainObserver(observer, this.f210122b, this.f210124d, this.f210125e, this.f210123c));
    }
}
