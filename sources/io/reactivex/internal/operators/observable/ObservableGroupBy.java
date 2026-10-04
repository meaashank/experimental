package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import sc.AbstractC5592b;

/* JADX INFO: loaded from: classes7.dex */
public final class ObservableGroupBy<T, K, V> extends AbstractC4648a<T, AbstractC5592b<K, V>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nc.o<? super T, ? extends K> f205588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nc.o<? super T, ? extends V> f205589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f205590d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f205591e;

    public static final class GroupByObserver<T, K, V> extends AtomicInteger implements hc.G<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final Object f205592i = new Object();
        private static final long serialVersionUID = -3688291656102519502L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hc.G<? super AbstractC5592b<K, V>> f205593a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final nc.o<? super T, ? extends K> f205594b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final nc.o<? super T, ? extends V> f205595c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f205596d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f205597e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public io.reactivex.disposables.b f205599g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final AtomicBoolean f205600h = new AtomicBoolean();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Map<Object, a<K, V>> f205598f = new ConcurrentHashMap();

        public GroupByObserver(hc.G<? super AbstractC5592b<K, V>> g10, nc.o<? super T, ? extends K> oVar, nc.o<? super T, ? extends V> oVar2, int i10, boolean z10) {
            this.f205593a = g10;
            this.f205594b = oVar;
            this.f205595c = oVar2;
            this.f205596d = i10;
            this.f205597e = z10;
            lazySet(1);
        }

        public void a(K k10) {
            if (k10 == null) {
                k10 = (K) f205592i;
            }
            this.f205598f.remove(k10);
            if (decrementAndGet() == 0) {
                this.f205599g.dispose();
            }
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            if (this.f205600h.compareAndSet(false, true) && decrementAndGet() == 0) {
                this.f205599g.dispose();
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f205600h.get();
        }

        @Override // hc.G
        public void onComplete() {
            ArrayList arrayList = new ArrayList(this.f205598f.values());
            this.f205598f.clear();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((a) obj).onComplete();
            }
            this.f205593a.onComplete();
        }

        @Override // hc.G
        public void onError(Throwable th) {
            ArrayList arrayList = new ArrayList(this.f205598f.values());
            this.f205598f.clear();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((a) obj).onError(th);
            }
            this.f205593a.onError(th);
        }

        @Override // hc.G
        public void onNext(T t10) {
            try {
                K kApply = this.f205594b.apply(t10);
                Object obj = kApply != null ? kApply : f205592i;
                a<K, V> aVarD8 = this.f205598f.get(obj);
                if (aVarD8 == null) {
                    if (this.f205600h.get()) {
                        return;
                    }
                    aVarD8 = a.d8(kApply, this.f205596d, this, this.f205597e);
                    this.f205598f.put(obj, aVarD8);
                    getAndIncrement();
                    this.f205593a.onNext(aVarD8);
                }
                try {
                    V vApply = this.f205595c.apply(t10);
                    io.reactivex.internal.functions.a.g(vApply, "The value supplied is null");
                    aVarD8.f205610b.i(vApply);
                } catch (Throwable th) {
                    io.reactivex.exceptions.a.b(th);
                    this.f205599g.dispose();
                    onError(th);
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.b(th2);
                this.f205599g.dispose();
                onError(th2);
            }
        }

        @Override // hc.G
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f205599g, bVar)) {
                this.f205599g = bVar;
                this.f205593a.onSubscribe(this);
            }
        }
    }

    public static final class State<T, K> extends AtomicInteger implements io.reactivex.disposables.b, hc.E<T> {
        private static final long serialVersionUID = -3852313036005250360L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final K f205601a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final io.reactivex.internal.queue.a<T> f205602b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final GroupByObserver<?, K, T> f205603c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f205604d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public volatile boolean f205605e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Throwable f205606f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final AtomicBoolean f205607g = new AtomicBoolean();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final AtomicBoolean f205608h = new AtomicBoolean();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final AtomicReference<hc.G<? super T>> f205609i = new AtomicReference<>();

        public State(int i10, GroupByObserver<?, K, T> groupByObserver, K k10, boolean z10) {
            this.f205602b = new io.reactivex.internal.queue.a<>(i10);
            this.f205603c = groupByObserver;
            this.f205601a = k10;
            this.f205604d = z10;
        }

        @Override // hc.E
        public void a(hc.G<? super T> g10) {
            if (!this.f205608h.compareAndSet(false, true)) {
                EmptyDisposable.error(new IllegalStateException("Only one Observer allowed!"), g10);
                return;
            }
            g10.onSubscribe(this);
            this.f205609i.lazySet(g10);
            if (this.f205607g.get()) {
                this.f205609i.lazySet(null);
            } else {
                d();
            }
        }

        public boolean b(boolean z10, boolean z11, hc.G<? super T> g10, boolean z12) {
            if (this.f205607g.get()) {
                this.f205602b.clear();
                this.f205603c.a(this.f205601a);
                this.f205609i.lazySet(null);
                return true;
            }
            if (!z10) {
                return false;
            }
            if (z12) {
                if (!z11) {
                    return false;
                }
                Throwable th = this.f205606f;
                this.f205609i.lazySet(null);
                if (th != null) {
                    g10.onError(th);
                } else {
                    g10.onComplete();
                }
                return true;
            }
            Throwable th2 = this.f205606f;
            if (th2 != null) {
                this.f205602b.clear();
                this.f205609i.lazySet(null);
                g10.onError(th2);
                return true;
            }
            if (!z11) {
                return false;
            }
            this.f205609i.lazySet(null);
            g10.onComplete();
            return true;
        }

        public void d() {
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.internal.queue.a<T> aVar = this.f205602b;
            boolean z10 = this.f205604d;
            hc.G<? super T> g10 = this.f205609i.get();
            int iAddAndGet = 1;
            while (true) {
                if (g10 != null) {
                    while (true) {
                        boolean z11 = this.f205605e;
                        T tPoll = aVar.poll();
                        boolean z12 = tPoll == null;
                        if (b(z11, z12, g10, z10)) {
                            return;
                        }
                        if (z12) {
                            break;
                        } else {
                            g10.onNext(tPoll);
                        }
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                if (g10 == null) {
                    g10 = this.f205609i.get();
                }
            }
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            if (this.f205607g.compareAndSet(false, true) && getAndIncrement() == 0) {
                this.f205609i.lazySet(null);
                this.f205603c.a(this.f205601a);
            }
        }

        public void g() {
            this.f205605e = true;
            d();
        }

        public void h(Throwable th) {
            this.f205606f = th;
            this.f205605e = true;
            d();
        }

        public void i(T t10) {
            this.f205602b.offer(t10);
            d();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f205607g.get();
        }
    }

    public static final class a<K, T> extends AbstractC5592b<K, T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final State<T, K> f205610b;

        public a(K k10, State<T, K> state) {
            super(k10);
            this.f205610b = state;
        }

        public static <T, K> a<K, T> d8(K k10, int i10, GroupByObserver<?, K, T> groupByObserver, boolean z10) {
            return new a<>(k10, new State(i10, groupByObserver, k10, z10));
        }

        @Override // hc.z
        public void C5(hc.G<? super T> g10) {
            this.f205610b.a(g10);
        }

        public void onComplete() {
            this.f205610b.g();
        }

        public void onError(Throwable th) {
            this.f205610b.h(th);
        }

        public void onNext(T t10) {
            this.f205610b.i(t10);
        }
    }

    public ObservableGroupBy(hc.E<T> e10, nc.o<? super T, ? extends K> oVar, nc.o<? super T, ? extends V> oVar2, int i10, boolean z10) {
        super(e10);
        this.f205588b = oVar;
        this.f205589c = oVar2;
        this.f205590d = i10;
        this.f205591e = z10;
    }

    @Override // hc.z
    public void C5(hc.G<? super AbstractC5592b<K, V>> g10) {
        this.f206214a.a(new GroupByObserver(g10, this.f205588b, this.f205589c, this.f205590d, this.f205591e));
    }
}
