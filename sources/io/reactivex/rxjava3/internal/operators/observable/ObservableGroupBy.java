package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class ObservableGroupBy<T, K, V> extends AbstractC4740a<T, Gc.b<K, V>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bc.o<? super T, ? extends K> f210282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bc.o<? super T, ? extends V> f210283c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f210284d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f210285e;

    public static final class GroupByObserver<T, K, V> extends AtomicInteger implements zc.V<T>, io.reactivex.rxjava3.disposables.d {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final Object f210286i = new Object();
        private static final long serialVersionUID = -3688291656102519502L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zc.V<? super Gc.b<K, V>> f210287a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Bc.o<? super T, ? extends K> f210288b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Bc.o<? super T, ? extends V> f210289c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f210290d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f210291e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f210293g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final AtomicBoolean f210294h = new AtomicBoolean();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Map<Object, a<K, V>> f210292f = new ConcurrentHashMap();

        public GroupByObserver(zc.V<? super Gc.b<K, V>> actual, Bc.o<? super T, ? extends K> keySelector, Bc.o<? super T, ? extends V> valueSelector, int bufferSize, boolean delayError) {
            this.f210287a = actual;
            this.f210288b = keySelector;
            this.f210289c = valueSelector;
            this.f210290d = bufferSize;
            this.f210291e = delayError;
            lazySet(1);
        }

        public void a(K k10) {
            if (k10 == null) {
                k10 = (K) f210286i;
            }
            this.f210292f.remove(k10);
            if (decrementAndGet() == 0) {
                this.f210293g.dispose();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            if (this.f210294h.compareAndSet(false, true) && decrementAndGet() == 0) {
                this.f210293g.dispose();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return this.f210294h.get();
        }

        @Override // zc.V
        public void onComplete() {
            ArrayList arrayList = new ArrayList(this.f210292f.values());
            this.f210292f.clear();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((a) obj).onComplete();
            }
            this.f210287a.onComplete();
        }

        @Override // zc.V
        public void onError(Throwable t10) {
            ArrayList arrayList = new ArrayList(this.f210292f.values());
            this.f210292f.clear();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((a) obj).onError(t10);
            }
            this.f210287a.onError(t10);
        }

        @Override // zc.V
        public void onNext(T t10) {
            boolean z10;
            try {
                K kApply = this.f210288b.apply(t10);
                Object obj = kApply != null ? kApply : f210286i;
                a<K, V> aVarB8 = this.f210292f.get(obj);
                if (aVarB8 != null) {
                    z10 = false;
                } else {
                    if (this.f210294h.get()) {
                        return;
                    }
                    aVarB8 = a.B8(kApply, this.f210290d, this, this.f210291e);
                    this.f210292f.put(obj, aVarB8);
                    getAndIncrement();
                    z10 = true;
                }
                try {
                    V vApply = this.f210289c.apply(t10);
                    Objects.requireNonNull(vApply, "The value supplied is null");
                    aVarB8.f210308b.j(vApply);
                    if (z10) {
                        this.f210287a.onNext(aVarB8);
                        if (aVarB8.f210308b.k()) {
                            a(kApply);
                            aVarB8.onComplete();
                        }
                    }
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.a.b(th);
                    this.f210293g.dispose();
                    if (z10) {
                        this.f210287a.onNext(aVarB8);
                    }
                    onError(th);
                }
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.b(th2);
                this.f210293g.dispose();
                onError(th2);
            }
        }

        @Override // zc.V
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            if (DisposableHelper.validate(this.f210293g, d10)) {
                this.f210293g = d10;
                this.f210287a.onSubscribe(this);
            }
        }
    }

    public static final class State<T, K> extends AtomicInteger implements io.reactivex.rxjava3.disposables.d, zc.T<T> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f210295j = 0;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f210296k = 1;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final int f210297l = 2;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final int f210298m = 3;
        private static final long serialVersionUID = -3852313036005250360L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final K f210299a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.internal.queue.a<T> f210300b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final GroupByObserver<?, K, T> f210301c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f210302d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public volatile boolean f210303e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Throwable f210304f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final AtomicBoolean f210305g = new AtomicBoolean();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final AtomicReference<zc.V<? super T>> f210306h = new AtomicReference<>();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final AtomicInteger f210307i = new AtomicInteger();

        public State(int bufferSize, GroupByObserver<?, K, T> parent, K key, boolean delayError) {
            this.f210300b = new io.reactivex.rxjava3.internal.queue.a<>(bufferSize);
            this.f210301c = parent;
            this.f210299a = key;
            this.f210302d = delayError;
        }

        @Override // zc.T
        public void a(zc.V<? super T> observer) {
            int i10;
            do {
                i10 = this.f210307i.get();
                if ((i10 & 1) != 0) {
                    EmptyDisposable.error(new IllegalStateException("Only one Observer allowed!"), observer);
                    return;
                }
            } while (!this.f210307i.compareAndSet(i10, i10 | 1));
            observer.onSubscribe(this);
            this.f210306h.lazySet(observer);
            if (this.f210305g.get()) {
                this.f210306h.lazySet(null);
            } else {
                g();
            }
        }

        public void d() {
            if ((this.f210307i.get() & 2) == 0) {
                this.f210301c.a(this.f210299a);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            if (this.f210305g.compareAndSet(false, true) && getAndIncrement() == 0) {
                this.f210306h.lazySet(null);
                d();
            }
        }

        public boolean e(boolean d10, boolean empty, zc.V<? super T> a10, boolean delayError) {
            if (this.f210305g.get()) {
                this.f210300b.clear();
                this.f210306h.lazySet(null);
                d();
                return true;
            }
            if (!d10) {
                return false;
            }
            if (delayError) {
                if (!empty) {
                    return false;
                }
                Throwable th = this.f210304f;
                this.f210306h.lazySet(null);
                if (th != null) {
                    a10.onError(th);
                } else {
                    a10.onComplete();
                }
                return true;
            }
            Throwable th2 = this.f210304f;
            if (th2 != null) {
                this.f210300b.clear();
                this.f210306h.lazySet(null);
                a10.onError(th2);
                return true;
            }
            if (!empty) {
                return false;
            }
            this.f210306h.lazySet(null);
            a10.onComplete();
            return true;
        }

        public void g() {
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.rxjava3.internal.queue.a<T> aVar = this.f210300b;
            boolean z10 = this.f210302d;
            zc.V<? super T> v10 = this.f210306h.get();
            int iAddAndGet = 1;
            while (true) {
                if (v10 != null) {
                    while (true) {
                        boolean z11 = this.f210303e;
                        T tPoll = aVar.poll();
                        boolean z12 = tPoll == null;
                        if (e(z11, z12, v10, z10)) {
                            return;
                        }
                        if (z12) {
                            break;
                        } else {
                            v10.onNext(tPoll);
                        }
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                if (v10 == null) {
                    v10 = this.f210306h.get();
                }
            }
        }

        public void h() {
            this.f210303e = true;
            g();
        }

        public void i(Throwable e10) {
            this.f210304f = e10;
            this.f210303e = true;
            g();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return this.f210305g.get();
        }

        public void j(T t10) {
            this.f210300b.offer(t10);
            g();
        }

        public boolean k() {
            return this.f210307i.get() == 0 && this.f210307i.compareAndSet(0, 2);
        }
    }

    public static final class a<K, T> extends Gc.b<K, T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final State<T, K> f210308b;

        public a(K key, State<T, K> state) {
            super(key);
            this.f210308b = state;
        }

        public static <T, K> a<K, T> B8(K key, int bufferSize, GroupByObserver<?, K, T> parent, boolean delayError) {
            return new a<>(key, new State(bufferSize, parent, key, delayError));
        }

        @Override // zc.N
        public void d6(zc.V<? super T> observer) {
            this.f210308b.a(observer);
        }

        public void onComplete() {
            this.f210308b.h();
        }

        public void onError(Throwable e10) {
            this.f210308b.i(e10);
        }

        public void onNext(T t10) {
            this.f210308b.j(t10);
        }
    }

    public ObservableGroupBy(zc.T<T> source, Bc.o<? super T, ? extends K> keySelector, Bc.o<? super T, ? extends V> valueSelector, int bufferSize, boolean delayError) {
        super(source);
        this.f210282b = keySelector;
        this.f210283c = valueSelector;
        this.f210284d = bufferSize;
        this.f210285e = delayError;
    }

    @Override // zc.N
    public void d6(zc.V<? super Gc.b<K, V>> t10) {
        this.f210954a.a(new GroupByObserver(t10, this.f210282b, this.f210283c, this.f210284d, this.f210285e));
    }
}
