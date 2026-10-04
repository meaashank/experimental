package io.reactivex.rxjava3.processors;

import androidx.collection.C1522b;
import androidx.compose.animation.core.C1598m0;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import yc.e;
import yc.f;
import zc.W;

/* JADX INFO: loaded from: classes7.dex */
public final class ReplayProcessor<T> extends io.reactivex.rxjava3.processors.a<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object[] f212037e = new Object[0];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ReplaySubscription[] f212038f = new ReplaySubscription[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ReplaySubscription[] f212039g = new ReplaySubscription[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a<T> f212040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f212041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference<ReplaySubscription<T>[]> f212042d = new AtomicReference<>(f212038f);

    public static final class Node<T> extends AtomicReference<Node<T>> {
        private static final long serialVersionUID = 6404226426336033100L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f212043a;

        public Node(T value) {
            this.f212043a = value;
        }
    }

    public static final class ReplaySubscription<T> extends AtomicInteger implements Subscription {
        private static final long serialVersionUID = 466549804534799122L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Subscriber<? super T> f212044a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ReplayProcessor<T> f212045b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f212046c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicLong f212047d = new AtomicLong();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public volatile boolean f212048e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f212049f;

        public ReplaySubscription(Subscriber<? super T> actual, ReplayProcessor<T> state) {
            this.f212044a = actual;
            this.f212045b = state;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (this.f212048e) {
                return;
            }
            this.f212048e = true;
            this.f212045b.w9(this);
        }

        @Override // org.reactivestreams.Subscription
        public void request(long n10) {
            if (SubscriptionHelper.validate(n10)) {
                io.reactivex.rxjava3.internal.util.b.a(this.f212047d, n10);
                this.f212045b.f212040b.a(this);
            }
        }
    }

    public static final class TimedNode<T> extends AtomicReference<TimedNode<T>> {
        private static final long serialVersionUID = 6404226426336033100L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f212050a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f212051b;

        public TimedNode(T value, long time) {
            this.f212050a = value;
            this.f212051b = time;
        }
    }

    public interface a<T> {
        void a(ReplaySubscription<T> rs);

        void b(T value);

        void c(Throwable ex);

        void d();

        T[] e(T[] array);

        Throwable getError();

        @f
        T getValue();

        boolean isDone();

        void k();

        int size();
    }

    public static final class b<T> implements a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f212052a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f212053b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TimeUnit f212054c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final W f212055d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f212056e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public volatile TimedNode<T> f212057f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public TimedNode<T> f212058g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Throwable f212059h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public volatile boolean f212060i;

        public b(int maxSize, long maxAge, TimeUnit unit, W scheduler) {
            this.f212052a = maxSize;
            this.f212053b = maxAge;
            this.f212054c = unit;
            this.f212055d = scheduler;
            TimedNode<T> timedNode = new TimedNode<>(null, 0L);
            this.f212058g = timedNode;
            this.f212057f = timedNode;
        }

        @Override // io.reactivex.rxjava3.processors.ReplayProcessor.a
        public void a(ReplaySubscription<T> replaySubscription) {
            if (replaySubscription.getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super T> subscriber = replaySubscription.f212044a;
            TimedNode<T> timedNodeF = (TimedNode) replaySubscription.f212046c;
            if (timedNodeF == null) {
                timedNodeF = f();
            }
            long j10 = replaySubscription.f212049f;
            int iAddAndGet = 1;
            do {
                long j11 = replaySubscription.f212047d.get();
                while (j10 != j11) {
                    if (replaySubscription.f212048e) {
                        replaySubscription.f212046c = null;
                        return;
                    }
                    boolean z10 = this.f212060i;
                    TimedNode<T> timedNode = timedNodeF.get();
                    boolean z11 = timedNode == null;
                    if (z10 && z11) {
                        replaySubscription.f212046c = null;
                        replaySubscription.f212048e = true;
                        Throwable th = this.f212059h;
                        if (th == null) {
                            subscriber.onComplete();
                            return;
                        } else {
                            subscriber.onError(th);
                            return;
                        }
                    }
                    if (z11) {
                        break;
                    }
                    subscriber.onNext(timedNode.f212050a);
                    j10++;
                    timedNodeF = timedNode;
                }
                if (j10 == j11) {
                    if (replaySubscription.f212048e) {
                        replaySubscription.f212046c = null;
                        return;
                    }
                    if (this.f212060i && timedNodeF.get() == null) {
                        replaySubscription.f212046c = null;
                        replaySubscription.f212048e = true;
                        Throwable th2 = this.f212059h;
                        if (th2 == null) {
                            subscriber.onComplete();
                            return;
                        } else {
                            subscriber.onError(th2);
                            return;
                        }
                    }
                }
                replaySubscription.f212046c = timedNodeF;
                replaySubscription.f212049f = j10;
                iAddAndGet = replaySubscription.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // io.reactivex.rxjava3.processors.ReplayProcessor.a
        public void b(T value) {
            TimedNode<T> timedNode = new TimedNode<>(value, this.f212055d.d(this.f212054c));
            TimedNode<T> timedNode2 = this.f212058g;
            this.f212058g = timedNode;
            this.f212056e++;
            timedNode2.set(timedNode);
            h();
        }

        @Override // io.reactivex.rxjava3.processors.ReplayProcessor.a
        public void c(Throwable ex) {
            i();
            this.f212059h = ex;
            this.f212060i = true;
        }

        @Override // io.reactivex.rxjava3.processors.ReplayProcessor.a
        public void d() {
            if (this.f212057f.f212050a != null) {
                TimedNode<T> timedNode = new TimedNode<>(null, 0L);
                timedNode.lazySet(this.f212057f.get());
                this.f212057f = timedNode;
            }
        }

        @Override // io.reactivex.rxjava3.processors.ReplayProcessor.a
        public T[] e(T[] tArr) {
            TimedNode<T> timedNodeF = f();
            int iG = g(timedNodeF);
            if (iG == 0) {
                if (tArr.length != 0) {
                    tArr[0] = null;
                }
                return tArr;
            }
            if (tArr.length < iG) {
                tArr = (T[]) ((Object[]) C1522b.a(tArr, iG));
            }
            for (int i10 = 0; i10 != iG; i10++) {
                timedNodeF = timedNodeF.get();
                tArr[i10] = timedNodeF.f212050a;
            }
            if (tArr.length > iG) {
                tArr[iG] = null;
            }
            return tArr;
        }

        public TimedNode<T> f() {
            TimedNode<T> timedNode;
            TimedNode<T> timedNode2 = this.f212057f;
            long jD = this.f212055d.d(this.f212054c) - this.f212053b;
            TimedNode<T> timedNode3 = timedNode2.get();
            while (true) {
                TimedNode<T> timedNode4 = timedNode3;
                timedNode = timedNode2;
                timedNode2 = timedNode4;
                if (timedNode2 == null || timedNode2.f212051b > jD) {
                    break;
                }
                timedNode3 = timedNode2.get();
            }
            return timedNode;
        }

        public int g(TimedNode<T> h10) {
            int i10 = 0;
            while (i10 != Integer.MAX_VALUE && (h10 = h10.get()) != null) {
                i10++;
            }
            return i10;
        }

        @Override // io.reactivex.rxjava3.processors.ReplayProcessor.a
        public Throwable getError() {
            return this.f212059h;
        }

        @Override // io.reactivex.rxjava3.processors.ReplayProcessor.a
        @f
        public T getValue() {
            TimedNode<T> timedNode = this.f212057f;
            while (true) {
                TimedNode<T> timedNode2 = timedNode.get();
                if (timedNode2 == null) {
                    break;
                }
                timedNode = timedNode2;
            }
            if (timedNode.f212051b < this.f212055d.d(this.f212054c) - this.f212053b) {
                return null;
            }
            return timedNode.f212050a;
        }

        public void h() {
            int i10 = this.f212056e;
            if (i10 > this.f212052a) {
                this.f212056e = i10 - 1;
                this.f212057f = this.f212057f.get();
            }
            long jD = this.f212055d.d(this.f212054c) - this.f212053b;
            TimedNode<T> timedNode = this.f212057f;
            while (this.f212056e > 1) {
                TimedNode<T> timedNode2 = timedNode.get();
                if (timedNode2.f212051b > jD) {
                    this.f212057f = timedNode;
                    return;
                } else {
                    this.f212056e--;
                    timedNode = timedNode2;
                }
            }
            this.f212057f = timedNode;
        }

        public void i() {
            long jD = this.f212055d.d(this.f212054c) - this.f212053b;
            TimedNode<T> timedNode = this.f212057f;
            while (true) {
                TimedNode<T> timedNode2 = timedNode.get();
                if (timedNode2 == null) {
                    if (timedNode.f212050a != null) {
                        this.f212057f = new TimedNode<>(null, 0L);
                        return;
                    } else {
                        this.f212057f = timedNode;
                        return;
                    }
                }
                if (timedNode2.f212051b > jD) {
                    if (timedNode.f212050a == null) {
                        this.f212057f = timedNode;
                        return;
                    }
                    TimedNode<T> timedNode3 = new TimedNode<>(null, 0L);
                    timedNode3.lazySet(timedNode.get());
                    this.f212057f = timedNode3;
                    return;
                }
                timedNode = timedNode2;
            }
        }

        @Override // io.reactivex.rxjava3.processors.ReplayProcessor.a
        public boolean isDone() {
            return this.f212060i;
        }

        @Override // io.reactivex.rxjava3.processors.ReplayProcessor.a
        public void k() {
            i();
            this.f212060i = true;
        }

        @Override // io.reactivex.rxjava3.processors.ReplayProcessor.a
        public int size() {
            return g(f());
        }
    }

    public static final class c<T> implements a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f212061a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f212062b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile Node<T> f212063c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Node<T> f212064d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Throwable f212065e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public volatile boolean f212066f;

        public c(int maxSize) {
            this.f212061a = maxSize;
            Node<T> node = new Node<>(null);
            this.f212064d = node;
            this.f212063c = node;
        }

        @Override // io.reactivex.rxjava3.processors.ReplayProcessor.a
        public void a(ReplaySubscription<T> replaySubscription) {
            if (replaySubscription.getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super T> subscriber = replaySubscription.f212044a;
            Node<T> node = (Node) replaySubscription.f212046c;
            if (node == null) {
                node = this.f212063c;
            }
            long j10 = replaySubscription.f212049f;
            int iAddAndGet = 1;
            do {
                long j11 = replaySubscription.f212047d.get();
                while (j10 != j11) {
                    if (replaySubscription.f212048e) {
                        replaySubscription.f212046c = null;
                        return;
                    }
                    boolean z10 = this.f212066f;
                    Node<T> node2 = node.get();
                    boolean z11 = node2 == null;
                    if (z10 && z11) {
                        replaySubscription.f212046c = null;
                        replaySubscription.f212048e = true;
                        Throwable th = this.f212065e;
                        if (th == null) {
                            subscriber.onComplete();
                            return;
                        } else {
                            subscriber.onError(th);
                            return;
                        }
                    }
                    if (z11) {
                        break;
                    }
                    subscriber.onNext(node2.f212043a);
                    j10++;
                    node = node2;
                }
                if (j10 == j11) {
                    if (replaySubscription.f212048e) {
                        replaySubscription.f212046c = null;
                        return;
                    }
                    if (this.f212066f && node.get() == null) {
                        replaySubscription.f212046c = null;
                        replaySubscription.f212048e = true;
                        Throwable th2 = this.f212065e;
                        if (th2 == null) {
                            subscriber.onComplete();
                            return;
                        } else {
                            subscriber.onError(th2);
                            return;
                        }
                    }
                }
                replaySubscription.f212046c = node;
                replaySubscription.f212049f = j10;
                iAddAndGet = replaySubscription.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // io.reactivex.rxjava3.processors.ReplayProcessor.a
        public void b(T value) {
            Node<T> node = new Node<>(value);
            Node<T> node2 = this.f212064d;
            this.f212064d = node;
            this.f212062b++;
            node2.set(node);
            f();
        }

        @Override // io.reactivex.rxjava3.processors.ReplayProcessor.a
        public void c(Throwable ex) {
            this.f212065e = ex;
            d();
            this.f212066f = true;
        }

        @Override // io.reactivex.rxjava3.processors.ReplayProcessor.a
        public void d() {
            if (this.f212063c.f212043a != null) {
                Node<T> node = new Node<>(null);
                node.lazySet(this.f212063c.get());
                this.f212063c = node;
            }
        }

        @Override // io.reactivex.rxjava3.processors.ReplayProcessor.a
        public T[] e(T[] tArr) {
            Node<T> node = this.f212063c;
            Node<T> node2 = node;
            int i10 = 0;
            while (true) {
                node2 = node2.get();
                if (node2 == null) {
                    break;
                }
                i10++;
            }
            if (tArr.length < i10) {
                tArr = (T[]) ((Object[]) C1522b.a(tArr, i10));
            }
            for (int i11 = 0; i11 < i10; i11++) {
                node = node.get();
                tArr[i11] = node.f212043a;
            }
            if (tArr.length > i10) {
                tArr[i10] = null;
            }
            return tArr;
        }

        public void f() {
            int i10 = this.f212062b;
            if (i10 > this.f212061a) {
                this.f212062b = i10 - 1;
                this.f212063c = this.f212063c.get();
            }
        }

        @Override // io.reactivex.rxjava3.processors.ReplayProcessor.a
        public Throwable getError() {
            return this.f212065e;
        }

        @Override // io.reactivex.rxjava3.processors.ReplayProcessor.a
        public T getValue() {
            Node<T> node = this.f212063c;
            while (true) {
                Node<T> node2 = node.get();
                if (node2 == null) {
                    return node.f212043a;
                }
                node = node2;
            }
        }

        @Override // io.reactivex.rxjava3.processors.ReplayProcessor.a
        public boolean isDone() {
            return this.f212066f;
        }

        @Override // io.reactivex.rxjava3.processors.ReplayProcessor.a
        public void k() {
            d();
            this.f212066f = true;
        }

        @Override // io.reactivex.rxjava3.processors.ReplayProcessor.a
        public int size() {
            Node<T> node = this.f212063c;
            int i10 = 0;
            while (i10 != Integer.MAX_VALUE && (node = node.get()) != null) {
                i10++;
            }
            return i10;
        }
    }

    public static final class d<T> implements a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<T> f212067a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Throwable f212068b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile boolean f212069c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public volatile int f212070d;

        public d(int capacityHint) {
            this.f212067a = new ArrayList(capacityHint);
        }

        @Override // io.reactivex.rxjava3.processors.ReplayProcessor.a
        public void a(ReplaySubscription<T> rs) {
            int iIntValue;
            if (rs.getAndIncrement() != 0) {
                return;
            }
            List<T> list = this.f212067a;
            Subscriber<? super T> subscriber = rs.f212044a;
            Integer num = (Integer) rs.f212046c;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
                rs.f212046c = 0;
            }
            long j10 = rs.f212049f;
            int iAddAndGet = 1;
            do {
                long j11 = rs.f212047d.get();
                while (j10 != j11) {
                    if (rs.f212048e) {
                        rs.f212046c = null;
                        return;
                    }
                    boolean z10 = this.f212069c;
                    int i10 = this.f212070d;
                    if (z10 && iIntValue == i10) {
                        rs.f212046c = null;
                        rs.f212048e = true;
                        Throwable th = this.f212068b;
                        if (th == null) {
                            subscriber.onComplete();
                            return;
                        } else {
                            subscriber.onError(th);
                            return;
                        }
                    }
                    if (iIntValue == i10) {
                        break;
                    }
                    subscriber.onNext(list.get(iIntValue));
                    iIntValue++;
                    j10++;
                }
                if (j10 == j11) {
                    if (rs.f212048e) {
                        rs.f212046c = null;
                        return;
                    }
                    boolean z11 = this.f212069c;
                    int i11 = this.f212070d;
                    if (z11 && iIntValue == i11) {
                        rs.f212046c = null;
                        rs.f212048e = true;
                        Throwable th2 = this.f212068b;
                        if (th2 == null) {
                            subscriber.onComplete();
                            return;
                        } else {
                            subscriber.onError(th2);
                            return;
                        }
                    }
                }
                rs.f212046c = Integer.valueOf(iIntValue);
                rs.f212049f = j10;
                iAddAndGet = rs.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // io.reactivex.rxjava3.processors.ReplayProcessor.a
        public void b(T value) {
            this.f212067a.add(value);
            this.f212070d++;
        }

        @Override // io.reactivex.rxjava3.processors.ReplayProcessor.a
        public void c(Throwable ex) {
            this.f212068b = ex;
            this.f212069c = true;
        }

        @Override // io.reactivex.rxjava3.processors.ReplayProcessor.a
        public void d() {
        }

        @Override // io.reactivex.rxjava3.processors.ReplayProcessor.a
        public T[] e(T[] tArr) {
            int i10 = this.f212070d;
            if (i10 == 0) {
                if (tArr.length != 0) {
                    tArr[0] = null;
                }
                return tArr;
            }
            List<T> list = this.f212067a;
            if (tArr.length < i10) {
                tArr = (T[]) ((Object[]) C1522b.a(tArr, i10));
            }
            for (int i11 = 0; i11 < i10; i11++) {
                tArr[i11] = list.get(i11);
            }
            if (tArr.length > i10) {
                tArr[i10] = null;
            }
            return tArr;
        }

        @Override // io.reactivex.rxjava3.processors.ReplayProcessor.a
        public Throwable getError() {
            return this.f212068b;
        }

        @Override // io.reactivex.rxjava3.processors.ReplayProcessor.a
        @f
        public T getValue() {
            int i10 = this.f212070d;
            if (i10 == 0) {
                return null;
            }
            return this.f212067a.get(i10 - 1);
        }

        @Override // io.reactivex.rxjava3.processors.ReplayProcessor.a
        public boolean isDone() {
            return this.f212069c;
        }

        @Override // io.reactivex.rxjava3.processors.ReplayProcessor.a
        public void k() {
            this.f212069c = true;
        }

        @Override // io.reactivex.rxjava3.processors.ReplayProcessor.a
        public int size() {
            return this.f212070d;
        }
    }

    public ReplayProcessor(a<T> buffer) {
        this.f212040b = buffer;
    }

    @e
    @yc.c
    public static <T> ReplayProcessor<T> m9() {
        return new ReplayProcessor<>(new d(16));
    }

    @e
    @yc.c
    public static <T> ReplayProcessor<T> n9(int capacityHint) {
        io.reactivex.rxjava3.internal.functions.a.b(capacityHint, "capacityHint");
        return new ReplayProcessor<>(new d(capacityHint));
    }

    @yc.c
    public static <T> ReplayProcessor<T> o9() {
        return new ReplayProcessor<>(new c(Integer.MAX_VALUE));
    }

    @e
    @yc.c
    public static <T> ReplayProcessor<T> p9(int maxSize) {
        io.reactivex.rxjava3.internal.functions.a.b(maxSize, "maxSize");
        return new ReplayProcessor<>(new c(maxSize));
    }

    @e
    @yc.c
    public static <T> ReplayProcessor<T> q9(long maxAge, @e TimeUnit unit, @e W scheduler) {
        io.reactivex.rxjava3.internal.functions.a.c(maxAge, "maxAge");
        Objects.requireNonNull(unit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new ReplayProcessor<>(new b(Integer.MAX_VALUE, maxAge, unit, scheduler));
    }

    @e
    @yc.c
    public static <T> ReplayProcessor<T> r9(long maxAge, @e TimeUnit unit, @e W scheduler, int maxSize) {
        io.reactivex.rxjava3.internal.functions.a.b(maxSize, "maxSize");
        io.reactivex.rxjava3.internal.functions.a.c(maxAge, "maxAge");
        Objects.requireNonNull(unit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new ReplayProcessor<>(new b(maxSize, maxAge, unit, scheduler));
    }

    @Override // zc.AbstractC5902t
    public void G6(Subscriber<? super T> s10) {
        ReplaySubscription<T> replaySubscription = new ReplaySubscription<>(s10, this);
        s10.onSubscribe(replaySubscription);
        if (k9(replaySubscription) && replaySubscription.f212048e) {
            w9(replaySubscription);
        } else {
            this.f212040b.a(replaySubscription);
        }
    }

    @Override // io.reactivex.rxjava3.processors.a
    @f
    @yc.c
    public Throwable f9() {
        a<T> aVar = this.f212040b;
        if (aVar.isDone()) {
            return aVar.getError();
        }
        return null;
    }

    @Override // io.reactivex.rxjava3.processors.a
    @yc.c
    public boolean g9() {
        a<T> aVar = this.f212040b;
        return aVar.isDone() && aVar.getError() == null;
    }

    @Override // io.reactivex.rxjava3.processors.a
    @yc.c
    public boolean h9() {
        return this.f212042d.get().length != 0;
    }

    @Override // io.reactivex.rxjava3.processors.a
    @yc.c
    public boolean i9() {
        a<T> aVar = this.f212040b;
        return aVar.isDone() && aVar.getError() != null;
    }

    public boolean k9(ReplaySubscription<T> rs) {
        ReplaySubscription<T>[] replaySubscriptionArr;
        ReplaySubscription[] replaySubscriptionArr2;
        do {
            replaySubscriptionArr = this.f212042d.get();
            if (replaySubscriptionArr == f212039g) {
                return false;
            }
            int length = replaySubscriptionArr.length;
            replaySubscriptionArr2 = new ReplaySubscription[length + 1];
            System.arraycopy(replaySubscriptionArr, 0, replaySubscriptionArr2, 0, length);
            replaySubscriptionArr2[length] = rs;
        } while (!C1598m0.a(this.f212042d, replaySubscriptionArr, replaySubscriptionArr2));
        return true;
    }

    public void l9() {
        this.f212040b.d();
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        if (this.f212041c) {
            return;
        }
        this.f212041c = true;
        a<T> aVar = this.f212040b;
        aVar.k();
        for (ReplaySubscription<T> replaySubscription : this.f212042d.getAndSet(f212039g)) {
            aVar.a(replaySubscription);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable t10) {
        ExceptionHelper.d(t10, "onError called with a null Throwable.");
        if (this.f212041c) {
            Ic.a.Y(t10);
            return;
        }
        this.f212041c = true;
        a<T> aVar = this.f212040b;
        aVar.c(t10);
        for (ReplaySubscription<T> replaySubscription : this.f212042d.getAndSet(f212039g)) {
            aVar.a(replaySubscription);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t10) {
        ExceptionHelper.d(t10, "onNext called with a null value.");
        if (this.f212041c) {
            return;
        }
        a<T> aVar = this.f212040b;
        aVar.b(t10);
        for (ReplaySubscription<T> replaySubscription : this.f212042d.get()) {
            aVar.a(replaySubscription);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onSubscribe(Subscription s10) {
        if (this.f212041c) {
            s10.cancel();
        } else {
            s10.request(Long.MAX_VALUE);
        }
    }

    @yc.c
    public T s9() {
        return this.f212040b.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @yc.c
    public Object[] t9() {
        Object[] objArr = f212037e;
        Object[] objArrE = this.f212040b.e(objArr);
        return objArrE == objArr ? new Object[0] : objArrE;
    }

    @yc.c
    public T[] u9(T[] array) {
        return this.f212040b.e(array);
    }

    @yc.c
    public boolean v9() {
        return this.f212040b.size() != 0;
    }

    public void w9(ReplaySubscription<T> rs) {
        ReplaySubscription<T>[] replaySubscriptionArr;
        ReplaySubscription[] replaySubscriptionArr2;
        do {
            replaySubscriptionArr = this.f212042d.get();
            if (replaySubscriptionArr == f212039g || replaySubscriptionArr == f212038f) {
                return;
            }
            int length = replaySubscriptionArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    i10 = -1;
                    break;
                } else if (replaySubscriptionArr[i10] == rs) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 < 0) {
                return;
            }
            if (length == 1) {
                replaySubscriptionArr2 = f212038f;
            } else {
                ReplaySubscription[] replaySubscriptionArr3 = new ReplaySubscription[length - 1];
                System.arraycopy(replaySubscriptionArr, 0, replaySubscriptionArr3, 0, i10);
                System.arraycopy(replaySubscriptionArr, i10 + 1, replaySubscriptionArr3, i10, (length - i10) - 1);
                replaySubscriptionArr2 = replaySubscriptionArr3;
            }
        } while (!C1598m0.a(this.f212042d, replaySubscriptionArr, replaySubscriptionArr2));
    }

    @yc.c
    public int x9() {
        return this.f212040b.size();
    }

    @yc.c
    public int y9() {
        return this.f212042d.get().length;
    }
}
