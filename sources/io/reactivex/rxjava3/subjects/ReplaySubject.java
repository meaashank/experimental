package io.reactivex.rxjava3.subjects;

import androidx.collection.C1522b;
import androidx.compose.animation.core.C1598m0;
import io.reactivex.rxjava3.disposables.d;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import yc.e;
import yc.f;
import zc.V;
import zc.W;

/* JADX INFO: loaded from: classes7.dex */
public final class ReplaySubject<T> extends c<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ReplayDisposable[] f212112d = new ReplayDisposable[0];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ReplayDisposable[] f212113e = new ReplayDisposable[0];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object[] f212114f = new Object[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a<T> f212115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference<ReplayDisposable<T>[]> f212116b = new AtomicReference<>(f212112d);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f212117c;

    public static final class Node<T> extends AtomicReference<Node<T>> {
        private static final long serialVersionUID = 6404226426336033100L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f212118a;

        public Node(T value) {
            this.f212118a = value;
        }
    }

    public static final class ReplayDisposable<T> extends AtomicInteger implements d {
        private static final long serialVersionUID = 466549804534799122L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final V<? super T> f212119a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ReplaySubject<T> f212120b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f212121c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public volatile boolean f212122d;

        public ReplayDisposable(V<? super T> actual, ReplaySubject<T> state) {
            this.f212119a = actual;
            this.f212120b = state;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            if (this.f212122d) {
                return;
            }
            this.f212122d = true;
            this.f212120b.S8(this);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return this.f212122d;
        }
    }

    public static final class SizeAndTimeBoundReplayBuffer<T> extends AtomicReference<Object> implements a<T> {
        private static final long serialVersionUID = -8056260896137901749L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f212123a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f212124b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TimeUnit f212125c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final W f212126d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f212127e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public volatile TimedNode<Object> f212128f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public TimedNode<Object> f212129g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public volatile boolean f212130h;

        public SizeAndTimeBoundReplayBuffer(int maxSize, long maxAge, TimeUnit unit, W scheduler) {
            this.f212123a = maxSize;
            this.f212124b = maxAge;
            this.f212125c = unit;
            this.f212126d = scheduler;
            TimedNode<Object> timedNode = new TimedNode<>(null, 0L);
            this.f212129g = timedNode;
            this.f212128f = timedNode;
        }

        @Override // io.reactivex.rxjava3.subjects.ReplaySubject.a
        public void a(Object notificationLite) {
            TimedNode<Object> timedNode = new TimedNode<>(notificationLite, Long.MAX_VALUE);
            TimedNode<Object> timedNode2 = this.f212129g;
            this.f212129g = timedNode;
            this.f212127e++;
            timedNode2.lazySet(timedNode);
            j();
            this.f212130h = true;
        }

        @Override // io.reactivex.rxjava3.subjects.ReplaySubject.a
        public void add(T value) {
            TimedNode<Object> timedNode = new TimedNode<>(value, this.f212126d.d(this.f212125c));
            TimedNode<Object> timedNode2 = this.f212129g;
            this.f212129g = timedNode;
            this.f212127e++;
            timedNode2.set(timedNode);
            i();
        }

        @Override // io.reactivex.rxjava3.subjects.ReplaySubject.a
        public void b(ReplayDisposable<T> replayDisposable) {
            if (replayDisposable.getAndIncrement() != 0) {
                return;
            }
            V<? super T> v10 = replayDisposable.f212119a;
            TimedNode<Object> timedNodeG = (TimedNode) replayDisposable.f212121c;
            if (timedNodeG == null) {
                timedNodeG = g();
            }
            int iAddAndGet = 1;
            while (!replayDisposable.f212122d) {
                TimedNode<T> timedNode = timedNodeG.get();
                if (timedNode == null) {
                    replayDisposable.f212121c = timedNodeG;
                    iAddAndGet = replayDisposable.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    T t10 = timedNode.f212136a;
                    if (this.f212130h && timedNode.get() == null) {
                        if (NotificationLite.isComplete(t10)) {
                            v10.onComplete();
                        } else {
                            v10.onError(NotificationLite.getError(t10));
                        }
                        replayDisposable.f212121c = null;
                        replayDisposable.f212122d = true;
                        return;
                    }
                    v10.onNext(t10);
                    timedNodeG = timedNode;
                }
            }
            replayDisposable.f212121c = null;
        }

        @Override // io.reactivex.rxjava3.subjects.ReplaySubject.a
        public void d() {
            TimedNode<Object> timedNode = this.f212128f;
            if (timedNode.f212136a != null) {
                TimedNode<Object> timedNode2 = new TimedNode<>(null, 0L);
                timedNode2.lazySet(timedNode.get());
                this.f212128f = timedNode2;
            }
        }

        @Override // io.reactivex.rxjava3.subjects.ReplaySubject.a
        public T[] e(T[] tArr) {
            TimedNode<T> timedNodeG = g();
            int iH = h(timedNodeG);
            if (iH == 0) {
                if (tArr.length != 0) {
                    tArr[0] = null;
                }
                return tArr;
            }
            if (tArr.length < iH) {
                tArr = (T[]) ((Object[]) C1522b.a(tArr, iH));
            }
            for (int i10 = 0; i10 != iH; i10++) {
                timedNodeG = timedNodeG.get();
                tArr[i10] = timedNodeG.f212136a;
            }
            if (tArr.length > iH) {
                tArr[iH] = null;
            }
            return tArr;
        }

        public TimedNode<Object> g() {
            TimedNode<Object> timedNode;
            TimedNode<Object> timedNode2 = this.f212128f;
            long jD = this.f212126d.d(this.f212125c) - this.f212124b;
            TimedNode<T> timedNode3 = timedNode2.get();
            while (true) {
                TimedNode<T> timedNode4 = timedNode3;
                timedNode = timedNode2;
                timedNode2 = timedNode4;
                if (timedNode2 == null || timedNode2.f212137b > jD) {
                    break;
                }
                timedNode3 = timedNode2.get();
            }
            return timedNode;
        }

        @Override // io.reactivex.rxjava3.subjects.ReplaySubject.a
        @f
        public T getValue() {
            T t10;
            TimedNode<Object> timedNode = this.f212128f;
            TimedNode<Object> timedNode2 = null;
            while (true) {
                TimedNode<T> timedNode3 = timedNode.get();
                if (timedNode3 == null) {
                    break;
                }
                timedNode2 = timedNode;
                timedNode = timedNode3;
            }
            if (timedNode.f212137b >= this.f212126d.d(this.f212125c) - this.f212124b && (t10 = (T) timedNode.f212136a) != null) {
                return (NotificationLite.isComplete(t10) || NotificationLite.isError(t10)) ? (T) timedNode2.f212136a : t10;
            }
            return null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0023, code lost:
        
            return r0;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int h(io.reactivex.rxjava3.subjects.ReplaySubject.TimedNode<java.lang.Object> r3) {
            /*
                r2 = this;
                r0 = 0
            L1:
                r1 = 2147483647(0x7fffffff, float:NaN)
                if (r0 == r1) goto L23
                java.lang.Object r1 = r3.get()
                io.reactivex.rxjava3.subjects.ReplaySubject$TimedNode r1 = (io.reactivex.rxjava3.subjects.ReplaySubject.TimedNode) r1
                if (r1 != 0) goto L1f
                T r3 = r3.f212136a
                boolean r1 = io.reactivex.rxjava3.internal.util.NotificationLite.isComplete(r3)
                if (r1 != 0) goto L1c
                boolean r3 = io.reactivex.rxjava3.internal.util.NotificationLite.isError(r3)
                if (r3 == 0) goto L23
            L1c:
                int r0 = r0 + (-1)
                return r0
            L1f:
                int r0 = r0 + 1
                r3 = r1
                goto L1
            L23:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.rxjava3.subjects.ReplaySubject.SizeAndTimeBoundReplayBuffer.h(io.reactivex.rxjava3.subjects.ReplaySubject$TimedNode):int");
        }

        public void i() {
            int i10 = this.f212127e;
            if (i10 > this.f212123a) {
                this.f212127e = i10 - 1;
                this.f212128f = this.f212128f.get();
            }
            long jD = this.f212126d.d(this.f212125c) - this.f212124b;
            TimedNode<Object> timedNode = this.f212128f;
            while (this.f212127e > 1) {
                TimedNode<T> timedNode2 = timedNode.get();
                if (timedNode2.f212137b > jD) {
                    this.f212128f = timedNode;
                    return;
                } else {
                    this.f212127e--;
                    timedNode = timedNode2;
                }
            }
            this.f212128f = timedNode;
        }

        public void j() {
            long jD = this.f212126d.d(this.f212125c) - this.f212124b;
            TimedNode<Object> timedNode = this.f212128f;
            while (true) {
                TimedNode<T> timedNode2 = timedNode.get();
                if (timedNode2.get() == null) {
                    if (timedNode.f212136a == null) {
                        this.f212128f = timedNode;
                        return;
                    }
                    TimedNode<Object> timedNode3 = new TimedNode<>(null, 0L);
                    timedNode3.lazySet(timedNode.get());
                    this.f212128f = timedNode3;
                    return;
                }
                if (timedNode2.f212137b > jD) {
                    if (timedNode.f212136a == null) {
                        this.f212128f = timedNode;
                        return;
                    }
                    TimedNode<Object> timedNode4 = new TimedNode<>(null, 0L);
                    timedNode4.lazySet(timedNode.get());
                    this.f212128f = timedNode4;
                    return;
                }
                timedNode = timedNode2;
            }
        }

        @Override // io.reactivex.rxjava3.subjects.ReplaySubject.a
        public int size() {
            return h(g());
        }
    }

    public static final class SizeBoundReplayBuffer<T> extends AtomicReference<Object> implements a<T> {
        private static final long serialVersionUID = 1107649250281456395L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f212131a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f212132b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile Node<Object> f212133c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Node<Object> f212134d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public volatile boolean f212135e;

        public SizeBoundReplayBuffer(int maxSize) {
            this.f212131a = maxSize;
            Node<Object> node = new Node<>(null);
            this.f212134d = node;
            this.f212133c = node;
        }

        @Override // io.reactivex.rxjava3.subjects.ReplaySubject.a
        public void a(Object notificationLite) {
            Node<Object> node = new Node<>(notificationLite);
            Node<Object> node2 = this.f212134d;
            this.f212134d = node;
            this.f212132b++;
            node2.lazySet(node);
            d();
            this.f212135e = true;
        }

        @Override // io.reactivex.rxjava3.subjects.ReplaySubject.a
        public void add(T value) {
            Node<Object> node = new Node<>(value);
            Node<Object> node2 = this.f212134d;
            this.f212134d = node;
            this.f212132b++;
            node2.set(node);
            g();
        }

        @Override // io.reactivex.rxjava3.subjects.ReplaySubject.a
        public void b(ReplayDisposable<T> replayDisposable) {
            if (replayDisposable.getAndIncrement() != 0) {
                return;
            }
            V<? super T> v10 = replayDisposable.f212119a;
            Node<Object> node = (Node) replayDisposable.f212121c;
            if (node == null) {
                node = this.f212133c;
            }
            int iAddAndGet = 1;
            while (!replayDisposable.f212122d) {
                Node<T> node2 = node.get();
                if (node2 != null) {
                    T t10 = node2.f212118a;
                    if (this.f212135e && node2.get() == null) {
                        if (NotificationLite.isComplete(t10)) {
                            v10.onComplete();
                        } else {
                            v10.onError(NotificationLite.getError(t10));
                        }
                        replayDisposable.f212121c = null;
                        replayDisposable.f212122d = true;
                        return;
                    }
                    v10.onNext(t10);
                    node = node2;
                } else if (node.get() != null) {
                    continue;
                } else {
                    replayDisposable.f212121c = node;
                    iAddAndGet = replayDisposable.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            replayDisposable.f212121c = null;
        }

        @Override // io.reactivex.rxjava3.subjects.ReplaySubject.a
        public void d() {
            Node<Object> node = this.f212133c;
            if (node.f212118a != null) {
                Node<Object> node2 = new Node<>(null);
                node2.lazySet(node.get());
                this.f212133c = node2;
            }
        }

        @Override // io.reactivex.rxjava3.subjects.ReplaySubject.a
        public T[] e(T[] tArr) {
            Node<T> node = this.f212133c;
            int size = size();
            if (size == 0) {
                if (tArr.length != 0) {
                    tArr[0] = null;
                }
                return tArr;
            }
            if (tArr.length < size) {
                tArr = (T[]) ((Object[]) C1522b.a(tArr, size));
            }
            for (int i10 = 0; i10 != size; i10++) {
                node = node.get();
                tArr[i10] = node.f212118a;
            }
            if (tArr.length > size) {
                tArr[size] = null;
            }
            return tArr;
        }

        public void g() {
            int i10 = this.f212132b;
            if (i10 > this.f212131a) {
                this.f212132b = i10 - 1;
                this.f212133c = this.f212133c.get();
            }
        }

        @Override // io.reactivex.rxjava3.subjects.ReplaySubject.a
        @f
        public T getValue() {
            Node<Object> node = this.f212133c;
            Node<Object> node2 = null;
            while (true) {
                Node<T> node3 = node.get();
                if (node3 == null) {
                    break;
                }
                node2 = node;
                node = node3;
            }
            T t10 = (T) node.f212118a;
            if (t10 == null) {
                return null;
            }
            return (NotificationLite.isComplete(t10) || NotificationLite.isError(t10)) ? (T) node2.f212118a : t10;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
        
            return r1;
         */
        @Override // io.reactivex.rxjava3.subjects.ReplaySubject.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int size() {
            /*
                r3 = this;
                io.reactivex.rxjava3.subjects.ReplaySubject$Node<java.lang.Object> r0 = r3.f212133c
                r1 = 0
            L3:
                r2 = 2147483647(0x7fffffff, float:NaN)
                if (r1 == r2) goto L25
                java.lang.Object r2 = r0.get()
                io.reactivex.rxjava3.subjects.ReplaySubject$Node r2 = (io.reactivex.rxjava3.subjects.ReplaySubject.Node) r2
                if (r2 != 0) goto L21
                T r0 = r0.f212118a
                boolean r2 = io.reactivex.rxjava3.internal.util.NotificationLite.isComplete(r0)
                if (r2 != 0) goto L1e
                boolean r0 = io.reactivex.rxjava3.internal.util.NotificationLite.isError(r0)
                if (r0 == 0) goto L25
            L1e:
                int r1 = r1 + (-1)
                return r1
            L21:
                int r1 = r1 + 1
                r0 = r2
                goto L3
            L25:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.rxjava3.subjects.ReplaySubject.SizeBoundReplayBuffer.size():int");
        }
    }

    public static final class TimedNode<T> extends AtomicReference<TimedNode<T>> {
        private static final long serialVersionUID = 6404226426336033100L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f212136a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f212137b;

        public TimedNode(T value, long time) {
            this.f212136a = value;
            this.f212137b = time;
        }
    }

    public static final class UnboundedReplayBuffer<T> extends AtomicReference<Object> implements a<T> {
        private static final long serialVersionUID = -733876083048047795L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<Object> f212138a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile boolean f212139b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile int f212140c;

        public UnboundedReplayBuffer(int capacityHint) {
            this.f212138a = new ArrayList(capacityHint);
        }

        @Override // io.reactivex.rxjava3.subjects.ReplaySubject.a
        public void a(Object notificationLite) {
            this.f212138a.add(notificationLite);
            this.f212140c++;
            this.f212139b = true;
        }

        @Override // io.reactivex.rxjava3.subjects.ReplaySubject.a
        public void add(T value) {
            this.f212138a.add(value);
            this.f212140c++;
        }

        @Override // io.reactivex.rxjava3.subjects.ReplaySubject.a
        public void b(ReplayDisposable<T> rs) {
            int iIntValue;
            int i10;
            if (rs.getAndIncrement() != 0) {
                return;
            }
            List<Object> list = this.f212138a;
            V<? super T> v10 = rs.f212119a;
            Integer num = (Integer) rs.f212121c;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
                rs.f212121c = 0;
            }
            int iAddAndGet = 1;
            while (!rs.f212122d) {
                int i11 = this.f212140c;
                while (i11 != iIntValue) {
                    if (rs.f212122d) {
                        rs.f212121c = null;
                        return;
                    }
                    Object obj = list.get(iIntValue);
                    if (this.f212139b && (i10 = iIntValue + 1) == i11 && i10 == (i11 = this.f212140c)) {
                        if (NotificationLite.isComplete(obj)) {
                            v10.onComplete();
                        } else {
                            v10.onError(NotificationLite.getError(obj));
                        }
                        rs.f212121c = null;
                        rs.f212122d = true;
                        return;
                    }
                    v10.onNext(obj);
                    iIntValue++;
                }
                if (iIntValue == this.f212140c) {
                    rs.f212121c = Integer.valueOf(iIntValue);
                    iAddAndGet = rs.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            rs.f212121c = null;
        }

        @Override // io.reactivex.rxjava3.subjects.ReplaySubject.a
        public void d() {
        }

        @Override // io.reactivex.rxjava3.subjects.ReplaySubject.a
        public T[] e(T[] tArr) {
            int i10 = this.f212140c;
            if (i10 == 0) {
                if (tArr.length != 0) {
                    tArr[0] = null;
                }
                return tArr;
            }
            List<Object> list = this.f212138a;
            Object obj = list.get(i10 - 1);
            if ((NotificationLite.isComplete(obj) || NotificationLite.isError(obj)) && i10 - 1 == 0) {
                if (tArr.length != 0) {
                    tArr[0] = null;
                }
                return tArr;
            }
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

        @Override // io.reactivex.rxjava3.subjects.ReplaySubject.a
        @f
        public T getValue() {
            int i10 = this.f212140c;
            if (i10 == 0) {
                return null;
            }
            List<Object> list = this.f212138a;
            T t10 = (T) list.get(i10 - 1);
            if (!NotificationLite.isComplete(t10) && !NotificationLite.isError(t10)) {
                return t10;
            }
            if (i10 == 1) {
                return null;
            }
            return (T) list.get(i10 - 2);
        }

        @Override // io.reactivex.rxjava3.subjects.ReplaySubject.a
        public int size() {
            int i10 = this.f212140c;
            if (i10 == 0) {
                return 0;
            }
            int i11 = i10 - 1;
            Object obj = this.f212138a.get(i11);
            return (NotificationLite.isComplete(obj) || NotificationLite.isError(obj)) ? i11 : i10;
        }
    }

    public interface a<T> {
        void a(Object notificationLite);

        void add(T value);

        void b(ReplayDisposable<T> rs);

        boolean compareAndSet(Object expected, Object next);

        void d();

        T[] e(T[] array);

        Object get();

        @f
        T getValue();

        int size();
    }

    public ReplaySubject(a<T> buffer) {
        this.f212115a = buffer;
    }

    @e
    @yc.c
    public static <T> ReplaySubject<T> H8() {
        return new ReplaySubject<>(new UnboundedReplayBuffer(16));
    }

    @e
    @yc.c
    public static <T> ReplaySubject<T> I8(int capacityHint) {
        io.reactivex.rxjava3.internal.functions.a.b(capacityHint, "capacityHint");
        return new ReplaySubject<>(new UnboundedReplayBuffer(capacityHint));
    }

    public static <T> ReplaySubject<T> J8() {
        return new ReplaySubject<>(new SizeBoundReplayBuffer(Integer.MAX_VALUE));
    }

    @e
    @yc.c
    public static <T> ReplaySubject<T> K8(int maxSize) {
        io.reactivex.rxjava3.internal.functions.a.b(maxSize, "maxSize");
        return new ReplaySubject<>(new SizeBoundReplayBuffer(maxSize));
    }

    @e
    @yc.c
    public static <T> ReplaySubject<T> L8(long maxAge, @e TimeUnit unit, @e W scheduler) {
        io.reactivex.rxjava3.internal.functions.a.c(maxAge, "maxAge");
        Objects.requireNonNull(unit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new ReplaySubject<>(new SizeAndTimeBoundReplayBuffer(Integer.MAX_VALUE, maxAge, unit, scheduler));
    }

    @e
    @yc.c
    public static <T> ReplaySubject<T> M8(long maxAge, @e TimeUnit unit, @e W scheduler, int maxSize) {
        io.reactivex.rxjava3.internal.functions.a.b(maxSize, "maxSize");
        io.reactivex.rxjava3.internal.functions.a.c(maxAge, "maxAge");
        Objects.requireNonNull(unit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new ReplaySubject<>(new SizeAndTimeBoundReplayBuffer(maxSize, maxAge, unit, scheduler));
    }

    @Override // io.reactivex.rxjava3.subjects.c
    @f
    @yc.c
    public Throwable A8() {
        Object obj = this.f212115a.get();
        if (NotificationLite.isError(obj)) {
            return NotificationLite.getError(obj);
        }
        return null;
    }

    @Override // io.reactivex.rxjava3.subjects.c
    @yc.c
    public boolean B8() {
        return NotificationLite.isComplete(this.f212115a.get());
    }

    @Override // io.reactivex.rxjava3.subjects.c
    @yc.c
    public boolean C8() {
        return this.f212116b.get().length != 0;
    }

    @Override // io.reactivex.rxjava3.subjects.c
    @yc.c
    public boolean D8() {
        return NotificationLite.isError(this.f212115a.get());
    }

    public boolean F8(ReplayDisposable<T> rs) {
        ReplayDisposable<T>[] replayDisposableArr;
        ReplayDisposable[] replayDisposableArr2;
        do {
            replayDisposableArr = this.f212116b.get();
            if (replayDisposableArr == f212113e) {
                return false;
            }
            int length = replayDisposableArr.length;
            replayDisposableArr2 = new ReplayDisposable[length + 1];
            System.arraycopy(replayDisposableArr, 0, replayDisposableArr2, 0, length);
            replayDisposableArr2[length] = rs;
        } while (!C1598m0.a(this.f212116b, replayDisposableArr, replayDisposableArr2));
        return true;
    }

    public void G8() {
        this.f212115a.d();
    }

    @f
    @yc.c
    public T N8() {
        return this.f212115a.getValue();
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
    public Object[] O8() {
        Object[] objArr = f212114f;
        Object[] objArrE = this.f212115a.e(objArr);
        return objArrE == objArr ? new Object[0] : objArrE;
    }

    @yc.c
    public T[] P8(T[] array) {
        return this.f212115a.e(array);
    }

    @yc.c
    public boolean Q8() {
        return this.f212115a.size() != 0;
    }

    @yc.c
    public int R8() {
        return this.f212116b.get().length;
    }

    public void S8(ReplayDisposable<T> rs) {
        ReplayDisposable<T>[] replayDisposableArr;
        ReplayDisposable[] replayDisposableArr2;
        do {
            replayDisposableArr = this.f212116b.get();
            if (replayDisposableArr == f212113e || replayDisposableArr == f212112d) {
                return;
            }
            int length = replayDisposableArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    i10 = -1;
                    break;
                } else if (replayDisposableArr[i10] == rs) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 < 0) {
                return;
            }
            if (length == 1) {
                replayDisposableArr2 = f212112d;
            } else {
                ReplayDisposable[] replayDisposableArr3 = new ReplayDisposable[length - 1];
                System.arraycopy(replayDisposableArr, 0, replayDisposableArr3, 0, i10);
                System.arraycopy(replayDisposableArr, i10 + 1, replayDisposableArr3, i10, (length - i10) - 1);
                replayDisposableArr2 = replayDisposableArr3;
            }
        } while (!C1598m0.a(this.f212116b, replayDisposableArr, replayDisposableArr2));
    }

    @yc.c
    public int T8() {
        return this.f212115a.size();
    }

    public ReplayDisposable<T>[] U8(Object terminalValue) {
        this.f212115a.compareAndSet(null, terminalValue);
        return this.f212116b.getAndSet(f212113e);
    }

    @Override // zc.N
    public void d6(V<? super T> observer) {
        ReplayDisposable<T> replayDisposable = new ReplayDisposable<>(observer, this);
        observer.onSubscribe(replayDisposable);
        if (F8(replayDisposable) && replayDisposable.f212122d) {
            S8(replayDisposable);
        } else {
            this.f212115a.b(replayDisposable);
        }
    }

    @Override // zc.V
    public void onComplete() {
        if (this.f212117c) {
            return;
        }
        this.f212117c = true;
        Object objComplete = NotificationLite.complete();
        a<T> aVar = this.f212115a;
        aVar.a(objComplete);
        for (ReplayDisposable<T> replayDisposable : U8(objComplete)) {
            aVar.b(replayDisposable);
        }
    }

    @Override // zc.V
    public void onError(Throwable t10) {
        ExceptionHelper.d(t10, "onError called with a null Throwable.");
        if (this.f212117c) {
            Ic.a.Y(t10);
            return;
        }
        this.f212117c = true;
        Object objError = NotificationLite.error(t10);
        a<T> aVar = this.f212115a;
        aVar.a(objError);
        for (ReplayDisposable<T> replayDisposable : U8(objError)) {
            aVar.b(replayDisposable);
        }
    }

    @Override // zc.V
    public void onNext(T t10) {
        ExceptionHelper.d(t10, "onNext called with a null value.");
        if (this.f212117c) {
            return;
        }
        a<T> aVar = this.f212115a;
        aVar.add(t10);
        for (ReplayDisposable<T> replayDisposable : this.f212116b.get()) {
            aVar.b(replayDisposable);
        }
    }

    @Override // zc.V
    public void onSubscribe(d d10) {
        if (this.f212117c) {
            d10.dispose();
        }
    }
}
