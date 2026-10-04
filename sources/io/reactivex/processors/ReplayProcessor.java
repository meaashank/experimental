package io.reactivex.processors;

import androidx.collection.C1522b;
import androidx.compose.animation.core.C1598m0;
import hc.H;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import lc.InterfaceC5190c;
import lc.e;
import lc.f;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import uc.C5666a;

/* JADX INFO: loaded from: classes7.dex */
public final class ReplayProcessor<T> extends io.reactivex.processors.a<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object[] f207292e = new Object[0];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ReplaySubscription[] f207293f = new ReplaySubscription[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ReplaySubscription[] f207294g = new ReplaySubscription[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a<T> f207295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f207296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference<ReplaySubscription<T>[]> f207297d = new AtomicReference<>(f207293f);

    public static final class Node<T> extends AtomicReference<Node<T>> {
        private static final long serialVersionUID = 6404226426336033100L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f207298a;

        public Node(T t10) {
            this.f207298a = t10;
        }
    }

    public static final class ReplaySubscription<T> extends AtomicInteger implements Subscription {
        private static final long serialVersionUID = 466549804534799122L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Subscriber<? super T> f207299a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ReplayProcessor<T> f207300b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f207301c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicLong f207302d = new AtomicLong();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public volatile boolean f207303e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f207304f;

        public ReplaySubscription(Subscriber<? super T> subscriber, ReplayProcessor<T> replayProcessor) {
            this.f207299a = subscriber;
            this.f207300b = replayProcessor;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (this.f207303e) {
                return;
            }
            this.f207303e = true;
            this.f207300b.W8(this);
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                io.reactivex.internal.util.b.a(this.f207302d, j10);
                this.f207300b.f207295b.f(this);
            }
        }
    }

    public static final class TimedNode<T> extends AtomicReference<TimedNode<T>> {
        private static final long serialVersionUID = 6404226426336033100L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f207305a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f207306b;

        public TimedNode(T t10, long j10) {
            this.f207305a = t10;
            this.f207306b = j10;
        }
    }

    public interface a<T> {
        void b(T t10);

        void c(Throwable th);

        void d();

        T[] e(T[] tArr);

        void f(ReplaySubscription<T> replaySubscription);

        Throwable getError();

        @f
        T getValue();

        boolean isDone();

        void k();

        int size();
    }

    public static final class b<T> implements a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f207307a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f207308b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TimeUnit f207309c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final H f207310d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f207311e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public volatile TimedNode<T> f207312f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public TimedNode<T> f207313g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Throwable f207314h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public volatile boolean f207315i;

        public b(int i10, long j10, TimeUnit timeUnit, H h10) {
            io.reactivex.internal.functions.a.h(i10, "maxSize");
            this.f207307a = i10;
            io.reactivex.internal.functions.a.i(j10, "maxAge");
            this.f207308b = j10;
            io.reactivex.internal.functions.a.g(timeUnit, "unit is null");
            this.f207309c = timeUnit;
            io.reactivex.internal.functions.a.g(h10, "scheduler is null");
            this.f207310d = h10;
            TimedNode<T> timedNode = new TimedNode<>(null, 0L);
            this.f207313g = timedNode;
            this.f207312f = timedNode;
        }

        public TimedNode<T> a() {
            TimedNode<T> timedNode;
            TimedNode<T> timedNode2 = this.f207312f;
            long jD = this.f207310d.d(this.f207309c) - this.f207308b;
            TimedNode<T> timedNode3 = timedNode2.get();
            while (true) {
                TimedNode<T> timedNode4 = timedNode3;
                timedNode = timedNode2;
                timedNode2 = timedNode4;
                if (timedNode2 == null || timedNode2.f207306b > jD) {
                    break;
                }
                timedNode3 = timedNode2.get();
            }
            return timedNode;
        }

        @Override // io.reactivex.processors.ReplayProcessor.a
        public void b(T t10) {
            TimedNode<T> timedNode = new TimedNode<>(t10, this.f207310d.d(this.f207309c));
            TimedNode<T> timedNode2 = this.f207313g;
            this.f207313g = timedNode;
            this.f207311e++;
            timedNode2.set(timedNode);
            h();
        }

        @Override // io.reactivex.processors.ReplayProcessor.a
        public void c(Throwable th) {
            i();
            this.f207314h = th;
            this.f207315i = true;
        }

        @Override // io.reactivex.processors.ReplayProcessor.a
        public void d() {
            if (this.f207312f.f207305a != null) {
                TimedNode<T> timedNode = new TimedNode<>(null, 0L);
                timedNode.lazySet(this.f207312f.get());
                this.f207312f = timedNode;
            }
        }

        @Override // io.reactivex.processors.ReplayProcessor.a
        public T[] e(T[] tArr) {
            TimedNode<T> timedNodeA = a();
            int iG = g(timedNodeA);
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
                timedNodeA = timedNodeA.get();
                tArr[i10] = timedNodeA.f207305a;
            }
            if (tArr.length > iG) {
                tArr[iG] = null;
            }
            return tArr;
        }

        @Override // io.reactivex.processors.ReplayProcessor.a
        public void f(ReplaySubscription<T> replaySubscription) {
            if (replaySubscription.getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super T> subscriber = replaySubscription.f207299a;
            TimedNode<T> timedNodeA = (TimedNode) replaySubscription.f207301c;
            if (timedNodeA == null) {
                timedNodeA = a();
            }
            long j10 = replaySubscription.f207304f;
            int iAddAndGet = 1;
            do {
                long j11 = replaySubscription.f207302d.get();
                while (j10 != j11) {
                    if (replaySubscription.f207303e) {
                        replaySubscription.f207301c = null;
                        return;
                    }
                    boolean z10 = this.f207315i;
                    TimedNode<T> timedNode = timedNodeA.get();
                    boolean z11 = timedNode == null;
                    if (z10 && z11) {
                        replaySubscription.f207301c = null;
                        replaySubscription.f207303e = true;
                        Throwable th = this.f207314h;
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
                    subscriber.onNext(timedNode.f207305a);
                    j10++;
                    timedNodeA = timedNode;
                }
                if (j10 == j11) {
                    if (replaySubscription.f207303e) {
                        replaySubscription.f207301c = null;
                        return;
                    }
                    if (this.f207315i && timedNodeA.get() == null) {
                        replaySubscription.f207301c = null;
                        replaySubscription.f207303e = true;
                        Throwable th2 = this.f207314h;
                        if (th2 == null) {
                            subscriber.onComplete();
                            return;
                        } else {
                            subscriber.onError(th2);
                            return;
                        }
                    }
                }
                replaySubscription.f207301c = timedNodeA;
                replaySubscription.f207304f = j10;
                iAddAndGet = replaySubscription.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        public int g(TimedNode<T> timedNode) {
            int i10 = 0;
            while (i10 != Integer.MAX_VALUE && (timedNode = timedNode.get()) != null) {
                i10++;
            }
            return i10;
        }

        @Override // io.reactivex.processors.ReplayProcessor.a
        public Throwable getError() {
            return this.f207314h;
        }

        @Override // io.reactivex.processors.ReplayProcessor.a
        @f
        public T getValue() {
            TimedNode<T> timedNode = this.f207312f;
            while (true) {
                TimedNode<T> timedNode2 = timedNode.get();
                if (timedNode2 == null) {
                    break;
                }
                timedNode = timedNode2;
            }
            if (timedNode.f207306b < this.f207310d.d(this.f207309c) - this.f207308b) {
                return null;
            }
            return timedNode.f207305a;
        }

        public void h() {
            int i10 = this.f207311e;
            if (i10 > this.f207307a) {
                this.f207311e = i10 - 1;
                this.f207312f = this.f207312f.get();
            }
            long jD = this.f207310d.d(this.f207309c) - this.f207308b;
            TimedNode<T> timedNode = this.f207312f;
            while (true) {
                TimedNode<T> timedNode2 = timedNode.get();
                if (timedNode2 == null) {
                    this.f207312f = timedNode;
                    return;
                } else {
                    if (timedNode2.f207306b > jD) {
                        this.f207312f = timedNode;
                        return;
                    }
                    timedNode = timedNode2;
                }
            }
        }

        public void i() {
            long jD = this.f207310d.d(this.f207309c) - this.f207308b;
            TimedNode<T> timedNode = this.f207312f;
            while (true) {
                TimedNode<T> timedNode2 = timedNode.get();
                if (timedNode2 == null) {
                    if (timedNode.f207305a != null) {
                        this.f207312f = new TimedNode<>(null, 0L);
                        return;
                    } else {
                        this.f207312f = timedNode;
                        return;
                    }
                }
                if (timedNode2.f207306b > jD) {
                    if (timedNode.f207305a == null) {
                        this.f207312f = timedNode;
                        return;
                    }
                    TimedNode<T> timedNode3 = new TimedNode<>(null, 0L);
                    timedNode3.lazySet(timedNode.get());
                    this.f207312f = timedNode3;
                    return;
                }
                timedNode = timedNode2;
            }
        }

        @Override // io.reactivex.processors.ReplayProcessor.a
        public boolean isDone() {
            return this.f207315i;
        }

        @Override // io.reactivex.processors.ReplayProcessor.a
        public void k() {
            i();
            this.f207315i = true;
        }

        @Override // io.reactivex.processors.ReplayProcessor.a
        public int size() {
            return g(a());
        }
    }

    public static final class c<T> implements a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f207316a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f207317b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile Node<T> f207318c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Node<T> f207319d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Throwable f207320e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public volatile boolean f207321f;

        public c(int i10) {
            io.reactivex.internal.functions.a.h(i10, "maxSize");
            this.f207316a = i10;
            Node<T> node = new Node<>(null);
            this.f207319d = node;
            this.f207318c = node;
        }

        public void a() {
            int i10 = this.f207317b;
            if (i10 > this.f207316a) {
                this.f207317b = i10 - 1;
                this.f207318c = this.f207318c.get();
            }
        }

        @Override // io.reactivex.processors.ReplayProcessor.a
        public void b(T t10) {
            Node<T> node = new Node<>(t10);
            Node<T> node2 = this.f207319d;
            this.f207319d = node;
            this.f207317b++;
            node2.set(node);
            a();
        }

        @Override // io.reactivex.processors.ReplayProcessor.a
        public void c(Throwable th) {
            this.f207320e = th;
            d();
            this.f207321f = true;
        }

        @Override // io.reactivex.processors.ReplayProcessor.a
        public void d() {
            if (this.f207318c.f207298a != null) {
                Node<T> node = new Node<>(null);
                node.lazySet(this.f207318c.get());
                this.f207318c = node;
            }
        }

        @Override // io.reactivex.processors.ReplayProcessor.a
        public T[] e(T[] tArr) {
            Node<T> node = this.f207318c;
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
                tArr[i11] = node.f207298a;
            }
            if (tArr.length > i10) {
                tArr[i10] = null;
            }
            return tArr;
        }

        @Override // io.reactivex.processors.ReplayProcessor.a
        public void f(ReplaySubscription<T> replaySubscription) {
            if (replaySubscription.getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super T> subscriber = replaySubscription.f207299a;
            Node<T> node = (Node) replaySubscription.f207301c;
            if (node == null) {
                node = this.f207318c;
            }
            long j10 = replaySubscription.f207304f;
            int iAddAndGet = 1;
            do {
                long j11 = replaySubscription.f207302d.get();
                while (j10 != j11) {
                    if (replaySubscription.f207303e) {
                        replaySubscription.f207301c = null;
                        return;
                    }
                    boolean z10 = this.f207321f;
                    Node<T> node2 = node.get();
                    boolean z11 = node2 == null;
                    if (z10 && z11) {
                        replaySubscription.f207301c = null;
                        replaySubscription.f207303e = true;
                        Throwable th = this.f207320e;
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
                    subscriber.onNext(node2.f207298a);
                    j10++;
                    node = node2;
                }
                if (j10 == j11) {
                    if (replaySubscription.f207303e) {
                        replaySubscription.f207301c = null;
                        return;
                    }
                    if (this.f207321f && node.get() == null) {
                        replaySubscription.f207301c = null;
                        replaySubscription.f207303e = true;
                        Throwable th2 = this.f207320e;
                        if (th2 == null) {
                            subscriber.onComplete();
                            return;
                        } else {
                            subscriber.onError(th2);
                            return;
                        }
                    }
                }
                replaySubscription.f207301c = node;
                replaySubscription.f207304f = j10;
                iAddAndGet = replaySubscription.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // io.reactivex.processors.ReplayProcessor.a
        public Throwable getError() {
            return this.f207320e;
        }

        @Override // io.reactivex.processors.ReplayProcessor.a
        public T getValue() {
            Node<T> node = this.f207318c;
            while (true) {
                Node<T> node2 = node.get();
                if (node2 == null) {
                    return node.f207298a;
                }
                node = node2;
            }
        }

        @Override // io.reactivex.processors.ReplayProcessor.a
        public boolean isDone() {
            return this.f207321f;
        }

        @Override // io.reactivex.processors.ReplayProcessor.a
        public void k() {
            d();
            this.f207321f = true;
        }

        @Override // io.reactivex.processors.ReplayProcessor.a
        public int size() {
            Node<T> node = this.f207318c;
            int i10 = 0;
            while (i10 != Integer.MAX_VALUE && (node = node.get()) != null) {
                i10++;
            }
            return i10;
        }
    }

    public static final class d<T> implements a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<T> f207322a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Throwable f207323b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile boolean f207324c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public volatile int f207325d;

        public d(int i10) {
            io.reactivex.internal.functions.a.h(i10, "capacityHint");
            this.f207322a = new ArrayList(i10);
        }

        @Override // io.reactivex.processors.ReplayProcessor.a
        public void b(T t10) {
            this.f207322a.add(t10);
            this.f207325d++;
        }

        @Override // io.reactivex.processors.ReplayProcessor.a
        public void c(Throwable th) {
            this.f207323b = th;
            this.f207324c = true;
        }

        @Override // io.reactivex.processors.ReplayProcessor.a
        public void d() {
        }

        @Override // io.reactivex.processors.ReplayProcessor.a
        public T[] e(T[] tArr) {
            int i10 = this.f207325d;
            if (i10 == 0) {
                if (tArr.length != 0) {
                    tArr[0] = null;
                }
                return tArr;
            }
            List<T> list = this.f207322a;
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

        @Override // io.reactivex.processors.ReplayProcessor.a
        public void f(ReplaySubscription<T> replaySubscription) {
            int iIntValue;
            if (replaySubscription.getAndIncrement() != 0) {
                return;
            }
            List<T> list = this.f207322a;
            Subscriber<? super T> subscriber = replaySubscription.f207299a;
            Integer num = (Integer) replaySubscription.f207301c;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
                replaySubscription.f207301c = 0;
            }
            long j10 = replaySubscription.f207304f;
            int iAddAndGet = 1;
            do {
                long j11 = replaySubscription.f207302d.get();
                while (j10 != j11) {
                    if (replaySubscription.f207303e) {
                        replaySubscription.f207301c = null;
                        return;
                    }
                    boolean z10 = this.f207324c;
                    int i10 = this.f207325d;
                    if (z10 && iIntValue == i10) {
                        replaySubscription.f207301c = null;
                        replaySubscription.f207303e = true;
                        Throwable th = this.f207323b;
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
                    if (replaySubscription.f207303e) {
                        replaySubscription.f207301c = null;
                        return;
                    }
                    boolean z11 = this.f207324c;
                    int i11 = this.f207325d;
                    if (z11 && iIntValue == i11) {
                        replaySubscription.f207301c = null;
                        replaySubscription.f207303e = true;
                        Throwable th2 = this.f207323b;
                        if (th2 == null) {
                            subscriber.onComplete();
                            return;
                        } else {
                            subscriber.onError(th2);
                            return;
                        }
                    }
                }
                replaySubscription.f207301c = Integer.valueOf(iIntValue);
                replaySubscription.f207304f = j10;
                iAddAndGet = replaySubscription.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // io.reactivex.processors.ReplayProcessor.a
        public Throwable getError() {
            return this.f207323b;
        }

        @Override // io.reactivex.processors.ReplayProcessor.a
        @f
        public T getValue() {
            int i10 = this.f207325d;
            if (i10 == 0) {
                return null;
            }
            return this.f207322a.get(i10 - 1);
        }

        @Override // io.reactivex.processors.ReplayProcessor.a
        public boolean isDone() {
            return this.f207324c;
        }

        @Override // io.reactivex.processors.ReplayProcessor.a
        public void k() {
            this.f207324c = true;
        }

        @Override // io.reactivex.processors.ReplayProcessor.a
        public int size() {
            return this.f207325d;
        }
    }

    public ReplayProcessor(a<T> aVar) {
        this.f207295b = aVar;
    }

    @e
    @InterfaceC5190c
    public static <T> ReplayProcessor<T> M8() {
        return new ReplayProcessor<>(new d(16));
    }

    @e
    @InterfaceC5190c
    public static <T> ReplayProcessor<T> N8(int i10) {
        return new ReplayProcessor<>(new d(i10));
    }

    public static <T> ReplayProcessor<T> O8() {
        return new ReplayProcessor<>(new c(Integer.MAX_VALUE));
    }

    @e
    @InterfaceC5190c
    public static <T> ReplayProcessor<T> P8(int i10) {
        return new ReplayProcessor<>(new c(i10));
    }

    @e
    @InterfaceC5190c
    public static <T> ReplayProcessor<T> Q8(long j10, TimeUnit timeUnit, H h10) {
        return new ReplayProcessor<>(new b(Integer.MAX_VALUE, j10, timeUnit, h10));
    }

    @e
    @InterfaceC5190c
    public static <T> ReplayProcessor<T> R8(long j10, TimeUnit timeUnit, H h10, int i10) {
        return new ReplayProcessor<>(new b(i10, j10, timeUnit, h10));
    }

    @Override // io.reactivex.processors.a
    @f
    public Throwable F8() {
        a<T> aVar = this.f207295b;
        if (aVar.isDone()) {
            return aVar.getError();
        }
        return null;
    }

    @Override // io.reactivex.processors.a
    public boolean G8() {
        a<T> aVar = this.f207295b;
        return aVar.isDone() && aVar.getError() == null;
    }

    @Override // io.reactivex.processors.a
    public boolean H8() {
        return this.f207297d.get().length != 0;
    }

    @Override // io.reactivex.processors.a
    public boolean I8() {
        a<T> aVar = this.f207295b;
        return aVar.isDone() && aVar.getError() != null;
    }

    public boolean K8(ReplaySubscription<T> replaySubscription) {
        ReplaySubscription<T>[] replaySubscriptionArr;
        ReplaySubscription[] replaySubscriptionArr2;
        do {
            replaySubscriptionArr = this.f207297d.get();
            if (replaySubscriptionArr == f207294g) {
                return false;
            }
            int length = replaySubscriptionArr.length;
            replaySubscriptionArr2 = new ReplaySubscription[length + 1];
            System.arraycopy(replaySubscriptionArr, 0, replaySubscriptionArr2, 0, length);
            replaySubscriptionArr2[length] = replaySubscription;
        } while (!C1598m0.a(this.f207297d, replaySubscriptionArr, replaySubscriptionArr2));
        return true;
    }

    public void L8() {
        this.f207295b.d();
    }

    public T S8() {
        return this.f207295b.getValue();
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
    public Object[] T8() {
        Object[] objArr = f207292e;
        Object[] objArrE = this.f207295b.e(objArr);
        return objArrE == objArr ? new Object[0] : objArrE;
    }

    public T[] U8(T[] tArr) {
        return this.f207295b.e(tArr);
    }

    public boolean V8() {
        return this.f207295b.size() != 0;
    }

    public void W8(ReplaySubscription<T> replaySubscription) {
        ReplaySubscription<T>[] replaySubscriptionArr;
        ReplaySubscription[] replaySubscriptionArr2;
        do {
            replaySubscriptionArr = this.f207297d.get();
            if (replaySubscriptionArr == f207294g || replaySubscriptionArr == f207293f) {
                return;
            }
            int length = replaySubscriptionArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    i10 = -1;
                    break;
                } else if (replaySubscriptionArr[i10] == replaySubscription) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 < 0) {
                return;
            }
            if (length == 1) {
                replaySubscriptionArr2 = f207293f;
            } else {
                ReplaySubscription[] replaySubscriptionArr3 = new ReplaySubscription[length - 1];
                System.arraycopy(replaySubscriptionArr, 0, replaySubscriptionArr3, 0, i10);
                System.arraycopy(replaySubscriptionArr, i10 + 1, replaySubscriptionArr3, i10, (length - i10) - 1);
                replaySubscriptionArr2 = replaySubscriptionArr3;
            }
        } while (!C1598m0.a(this.f207297d, replaySubscriptionArr, replaySubscriptionArr2));
    }

    public int X8() {
        return this.f207295b.size();
    }

    public int Y8() {
        return this.f207297d.get().length;
    }

    @Override // hc.AbstractC4530j
    public void d6(Subscriber<? super T> subscriber) {
        ReplaySubscription<T> replaySubscription = new ReplaySubscription<>(subscriber, this);
        subscriber.onSubscribe(replaySubscription);
        if (K8(replaySubscription) && replaySubscription.f207303e) {
            W8(replaySubscription);
        } else {
            this.f207295b.f(replaySubscription);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        if (this.f207296c) {
            return;
        }
        this.f207296c = true;
        a<T> aVar = this.f207295b;
        aVar.k();
        for (ReplaySubscription<T> replaySubscription : this.f207297d.getAndSet(f207294g)) {
            aVar.f(replaySubscription);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th) {
        io.reactivex.internal.functions.a.g(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f207296c) {
            C5666a.Y(th);
            return;
        }
        this.f207296c = true;
        a<T> aVar = this.f207295b;
        aVar.c(th);
        for (ReplaySubscription<T> replaySubscription : this.f207297d.getAndSet(f207294g)) {
            aVar.f(replaySubscription);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t10) {
        io.reactivex.internal.functions.a.g(t10, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f207296c) {
            return;
        }
        a<T> aVar = this.f207295b;
        aVar.b(t10);
        for (ReplaySubscription<T> replaySubscription : this.f207297d.get()) {
            aVar.f(replaySubscription);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onSubscribe(Subscription subscription) {
        if (this.f207296c) {
            subscription.cancel();
        } else {
            subscription.request(Long.MAX_VALUE);
        }
    }
}
