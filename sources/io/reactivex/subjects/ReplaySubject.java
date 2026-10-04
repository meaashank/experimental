package io.reactivex.subjects;

import androidx.collection.C1522b;
import androidx.compose.animation.core.C1598m0;
import hc.G;
import hc.H;
import io.reactivex.internal.util.NotificationLite;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import lc.InterfaceC5190c;
import lc.e;
import lc.f;
import uc.C5666a;

/* JADX INFO: loaded from: classes7.dex */
public final class ReplaySubject<T> extends c<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ReplayDisposable[] f212349d = new ReplayDisposable[0];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ReplayDisposable[] f212350e = new ReplayDisposable[0];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object[] f212351f = new Object[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a<T> f212352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference<ReplayDisposable<T>[]> f212353b = new AtomicReference<>(f212349d);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f212354c;

    public static final class Node<T> extends AtomicReference<Node<T>> {
        private static final long serialVersionUID = 6404226426336033100L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f212355a;

        public Node(T t10) {
            this.f212355a = t10;
        }
    }

    public static final class ReplayDisposable<T> extends AtomicInteger implements io.reactivex.disposables.b {
        private static final long serialVersionUID = 466549804534799122L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final G<? super T> f212356a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ReplaySubject<T> f212357b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f212358c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public volatile boolean f212359d;

        public ReplayDisposable(G<? super T> g10, ReplaySubject<T> replaySubject) {
            this.f212356a = g10;
            this.f212357b = replaySubject;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            if (this.f212359d) {
                return;
            }
            this.f212359d = true;
            this.f212357b.u8(this);
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f212359d;
        }
    }

    public static final class SizeAndTimeBoundReplayBuffer<T> extends AtomicReference<Object> implements a<T> {
        private static final long serialVersionUID = -8056260896137901749L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f212360a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f212361b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TimeUnit f212362c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final H f212363d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f212364e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public volatile TimedNode<Object> f212365f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public TimedNode<Object> f212366g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public volatile boolean f212367h;

        public SizeAndTimeBoundReplayBuffer(int i10, long j10, TimeUnit timeUnit, H h10) {
            io.reactivex.internal.functions.a.h(i10, "maxSize");
            this.f212360a = i10;
            io.reactivex.internal.functions.a.i(j10, "maxAge");
            this.f212361b = j10;
            io.reactivex.internal.functions.a.g(timeUnit, "unit is null");
            this.f212362c = timeUnit;
            io.reactivex.internal.functions.a.g(h10, "scheduler is null");
            this.f212363d = h10;
            TimedNode<Object> timedNode = new TimedNode<>(null, 0L);
            this.f212366g = timedNode;
            this.f212365f = timedNode;
        }

        @Override // io.reactivex.subjects.ReplaySubject.a
        public void a(Object obj) {
            TimedNode<Object> timedNode = new TimedNode<>(obj, Long.MAX_VALUE);
            TimedNode<Object> timedNode2 = this.f212366g;
            this.f212366g = timedNode;
            this.f212364e++;
            timedNode2.lazySet(timedNode);
            j();
            this.f212367h = true;
        }

        @Override // io.reactivex.subjects.ReplaySubject.a
        public void add(T t10) {
            TimedNode<Object> timedNode = new TimedNode<>(t10, this.f212363d.d(this.f212362c));
            TimedNode<Object> timedNode2 = this.f212366g;
            this.f212366g = timedNode;
            this.f212364e++;
            timedNode2.set(timedNode);
            i();
        }

        @Override // io.reactivex.subjects.ReplaySubject.a
        public void b(ReplayDisposable<T> replayDisposable) {
            if (replayDisposable.getAndIncrement() != 0) {
                return;
            }
            G<? super T> g10 = replayDisposable.f212356a;
            TimedNode<Object> timedNodeG = (TimedNode) replayDisposable.f212358c;
            if (timedNodeG == null) {
                timedNodeG = g();
            }
            int iAddAndGet = 1;
            while (!replayDisposable.f212359d) {
                while (!replayDisposable.f212359d) {
                    TimedNode<T> timedNode = timedNodeG.get();
                    if (timedNode != null) {
                        T t10 = timedNode.f212373a;
                        if (this.f212367h && timedNode.get() == null) {
                            if (NotificationLite.isComplete(t10)) {
                                g10.onComplete();
                            } else {
                                g10.onError(NotificationLite.getError(t10));
                            }
                            replayDisposable.f212358c = null;
                            replayDisposable.f212359d = true;
                            return;
                        }
                        g10.onNext(t10);
                        timedNodeG = timedNode;
                    } else if (timedNodeG.get() == null) {
                        replayDisposable.f212358c = timedNodeG;
                        iAddAndGet = replayDisposable.addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    }
                }
                replayDisposable.f212358c = null;
                return;
            }
            replayDisposable.f212358c = null;
        }

        @Override // io.reactivex.subjects.ReplaySubject.a
        public void d() {
            TimedNode<Object> timedNode = this.f212365f;
            if (timedNode.f212373a != null) {
                TimedNode<Object> timedNode2 = new TimedNode<>(null, 0L);
                timedNode2.lazySet(timedNode.get());
                this.f212365f = timedNode2;
            }
        }

        @Override // io.reactivex.subjects.ReplaySubject.a
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
                tArr[i10] = timedNodeG.f212373a;
            }
            if (tArr.length > iH) {
                tArr[iH] = null;
            }
            return tArr;
        }

        public TimedNode<Object> g() {
            TimedNode<Object> timedNode;
            TimedNode<Object> timedNode2 = this.f212365f;
            long jD = this.f212363d.d(this.f212362c) - this.f212361b;
            TimedNode<T> timedNode3 = timedNode2.get();
            while (true) {
                TimedNode<T> timedNode4 = timedNode3;
                timedNode = timedNode2;
                timedNode2 = timedNode4;
                if (timedNode2 == null || timedNode2.f212374b > jD) {
                    break;
                }
                timedNode3 = timedNode2.get();
            }
            return timedNode;
        }

        @Override // io.reactivex.subjects.ReplaySubject.a
        @f
        public T getValue() {
            T t10;
            TimedNode<Object> timedNode = this.f212365f;
            TimedNode<Object> timedNode2 = null;
            while (true) {
                TimedNode<T> timedNode3 = timedNode.get();
                if (timedNode3 == null) {
                    break;
                }
                timedNode2 = timedNode;
                timedNode = timedNode3;
            }
            if (timedNode.f212374b >= this.f212363d.d(this.f212362c) - this.f212361b && (t10 = (T) timedNode.f212373a) != null) {
                return (NotificationLite.isComplete(t10) || NotificationLite.isError(t10)) ? (T) timedNode2.f212373a : t10;
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
        public int h(io.reactivex.subjects.ReplaySubject.TimedNode<java.lang.Object> r3) {
            /*
                r2 = this;
                r0 = 0
            L1:
                r1 = 2147483647(0x7fffffff, float:NaN)
                if (r0 == r1) goto L23
                java.lang.Object r1 = r3.get()
                io.reactivex.subjects.ReplaySubject$TimedNode r1 = (io.reactivex.subjects.ReplaySubject.TimedNode) r1
                if (r1 != 0) goto L1f
                T r3 = r3.f212373a
                boolean r1 = io.reactivex.internal.util.NotificationLite.isComplete(r3)
                if (r1 != 0) goto L1c
                boolean r3 = io.reactivex.internal.util.NotificationLite.isError(r3)
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
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.subjects.ReplaySubject.SizeAndTimeBoundReplayBuffer.h(io.reactivex.subjects.ReplaySubject$TimedNode):int");
        }

        public void i() {
            int i10 = this.f212364e;
            if (i10 > this.f212360a) {
                this.f212364e = i10 - 1;
                this.f212365f = this.f212365f.get();
            }
            long jD = this.f212363d.d(this.f212362c) - this.f212361b;
            TimedNode<Object> timedNode = this.f212365f;
            while (true) {
                TimedNode<T> timedNode2 = timedNode.get();
                if (timedNode2 == null) {
                    this.f212365f = timedNode;
                    return;
                } else {
                    if (timedNode2.f212374b > jD) {
                        this.f212365f = timedNode;
                        return;
                    }
                    timedNode = timedNode2;
                }
            }
        }

        public void j() {
            long jD = this.f212363d.d(this.f212362c) - this.f212361b;
            TimedNode<Object> timedNode = this.f212365f;
            while (true) {
                TimedNode<T> timedNode2 = timedNode.get();
                if (timedNode2.get() == null) {
                    if (timedNode.f212373a == null) {
                        this.f212365f = timedNode;
                        return;
                    }
                    TimedNode<Object> timedNode3 = new TimedNode<>(null, 0L);
                    timedNode3.lazySet(timedNode.get());
                    this.f212365f = timedNode3;
                    return;
                }
                if (timedNode2.f212374b > jD) {
                    if (timedNode.f212373a == null) {
                        this.f212365f = timedNode;
                        return;
                    }
                    TimedNode<Object> timedNode4 = new TimedNode<>(null, 0L);
                    timedNode4.lazySet(timedNode.get());
                    this.f212365f = timedNode4;
                    return;
                }
                timedNode = timedNode2;
            }
        }

        @Override // io.reactivex.subjects.ReplaySubject.a
        public int size() {
            return h(g());
        }
    }

    public static final class SizeBoundReplayBuffer<T> extends AtomicReference<Object> implements a<T> {
        private static final long serialVersionUID = 1107649250281456395L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f212368a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f212369b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile Node<Object> f212370c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Node<Object> f212371d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public volatile boolean f212372e;

        public SizeBoundReplayBuffer(int i10) {
            io.reactivex.internal.functions.a.h(i10, "maxSize");
            this.f212368a = i10;
            Node<Object> node = new Node<>(null);
            this.f212371d = node;
            this.f212370c = node;
        }

        @Override // io.reactivex.subjects.ReplaySubject.a
        public void a(Object obj) {
            Node<Object> node = new Node<>(obj);
            Node<Object> node2 = this.f212371d;
            this.f212371d = node;
            this.f212369b++;
            node2.lazySet(node);
            d();
            this.f212372e = true;
        }

        @Override // io.reactivex.subjects.ReplaySubject.a
        public void add(T t10) {
            Node<Object> node = new Node<>(t10);
            Node<Object> node2 = this.f212371d;
            this.f212371d = node;
            this.f212369b++;
            node2.set(node);
            g();
        }

        @Override // io.reactivex.subjects.ReplaySubject.a
        public void b(ReplayDisposable<T> replayDisposable) {
            if (replayDisposable.getAndIncrement() != 0) {
                return;
            }
            G<? super T> g10 = replayDisposable.f212356a;
            Node<Object> node = (Node) replayDisposable.f212358c;
            if (node == null) {
                node = this.f212370c;
            }
            int iAddAndGet = 1;
            while (!replayDisposable.f212359d) {
                Node<T> node2 = node.get();
                if (node2 != null) {
                    T t10 = node2.f212355a;
                    if (this.f212372e && node2.get() == null) {
                        if (NotificationLite.isComplete(t10)) {
                            g10.onComplete();
                        } else {
                            g10.onError(NotificationLite.getError(t10));
                        }
                        replayDisposable.f212358c = null;
                        replayDisposable.f212359d = true;
                        return;
                    }
                    g10.onNext(t10);
                    node = node2;
                } else if (node.get() != null) {
                    continue;
                } else {
                    replayDisposable.f212358c = node;
                    iAddAndGet = replayDisposable.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            replayDisposable.f212358c = null;
        }

        @Override // io.reactivex.subjects.ReplaySubject.a
        public void d() {
            Node<Object> node = this.f212370c;
            if (node.f212355a != null) {
                Node<Object> node2 = new Node<>(null);
                node2.lazySet(node.get());
                this.f212370c = node2;
            }
        }

        @Override // io.reactivex.subjects.ReplaySubject.a
        public T[] e(T[] tArr) {
            Node<T> node = this.f212370c;
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
                tArr[i10] = node.f212355a;
            }
            if (tArr.length > size) {
                tArr[size] = null;
            }
            return tArr;
        }

        public void g() {
            int i10 = this.f212369b;
            if (i10 > this.f212368a) {
                this.f212369b = i10 - 1;
                this.f212370c = this.f212370c.get();
            }
        }

        @Override // io.reactivex.subjects.ReplaySubject.a
        @f
        public T getValue() {
            Node<Object> node = this.f212370c;
            Node<Object> node2 = null;
            while (true) {
                Node<T> node3 = node.get();
                if (node3 == null) {
                    break;
                }
                node2 = node;
                node = node3;
            }
            T t10 = (T) node.f212355a;
            if (t10 == null) {
                return null;
            }
            return (NotificationLite.isComplete(t10) || NotificationLite.isError(t10)) ? (T) node2.f212355a : t10;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
        
            return r1;
         */
        @Override // io.reactivex.subjects.ReplaySubject.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int size() {
            /*
                r3 = this;
                io.reactivex.subjects.ReplaySubject$Node<java.lang.Object> r0 = r3.f212370c
                r1 = 0
            L3:
                r2 = 2147483647(0x7fffffff, float:NaN)
                if (r1 == r2) goto L25
                java.lang.Object r2 = r0.get()
                io.reactivex.subjects.ReplaySubject$Node r2 = (io.reactivex.subjects.ReplaySubject.Node) r2
                if (r2 != 0) goto L21
                T r0 = r0.f212355a
                boolean r2 = io.reactivex.internal.util.NotificationLite.isComplete(r0)
                if (r2 != 0) goto L1e
                boolean r0 = io.reactivex.internal.util.NotificationLite.isError(r0)
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
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.subjects.ReplaySubject.SizeBoundReplayBuffer.size():int");
        }
    }

    public static final class TimedNode<T> extends AtomicReference<TimedNode<T>> {
        private static final long serialVersionUID = 6404226426336033100L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f212373a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f212374b;

        public TimedNode(T t10, long j10) {
            this.f212373a = t10;
            this.f212374b = j10;
        }
    }

    public static final class UnboundedReplayBuffer<T> extends AtomicReference<Object> implements a<T> {
        private static final long serialVersionUID = -733876083048047795L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<Object> f212375a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile boolean f212376b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile int f212377c;

        public UnboundedReplayBuffer(int i10) {
            io.reactivex.internal.functions.a.h(i10, "capacityHint");
            this.f212375a = new ArrayList(i10);
        }

        @Override // io.reactivex.subjects.ReplaySubject.a
        public void a(Object obj) {
            this.f212375a.add(obj);
            this.f212377c++;
            this.f212376b = true;
        }

        @Override // io.reactivex.subjects.ReplaySubject.a
        public void add(T t10) {
            this.f212375a.add(t10);
            this.f212377c++;
        }

        @Override // io.reactivex.subjects.ReplaySubject.a
        public void b(ReplayDisposable<T> replayDisposable) {
            int iIntValue;
            int i10;
            if (replayDisposable.getAndIncrement() != 0) {
                return;
            }
            List<Object> list = this.f212375a;
            G<? super T> g10 = replayDisposable.f212356a;
            Integer num = (Integer) replayDisposable.f212358c;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
                replayDisposable.f212358c = 0;
            }
            int iAddAndGet = 1;
            while (!replayDisposable.f212359d) {
                int i11 = this.f212377c;
                while (i11 != iIntValue) {
                    if (replayDisposable.f212359d) {
                        replayDisposable.f212358c = null;
                        return;
                    }
                    Object obj = list.get(iIntValue);
                    if (this.f212376b && (i10 = iIntValue + 1) == i11 && i10 == (i11 = this.f212377c)) {
                        if (NotificationLite.isComplete(obj)) {
                            g10.onComplete();
                        } else {
                            g10.onError(NotificationLite.getError(obj));
                        }
                        replayDisposable.f212358c = null;
                        replayDisposable.f212359d = true;
                        return;
                    }
                    g10.onNext(obj);
                    iIntValue++;
                }
                if (iIntValue == this.f212377c) {
                    replayDisposable.f212358c = Integer.valueOf(iIntValue);
                    iAddAndGet = replayDisposable.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            replayDisposable.f212358c = null;
        }

        @Override // io.reactivex.subjects.ReplaySubject.a
        public void d() {
        }

        @Override // io.reactivex.subjects.ReplaySubject.a
        public T[] e(T[] tArr) {
            int i10 = this.f212377c;
            if (i10 == 0) {
                if (tArr.length != 0) {
                    tArr[0] = null;
                }
                return tArr;
            }
            List<Object> list = this.f212375a;
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

        @Override // io.reactivex.subjects.ReplaySubject.a
        @f
        public T getValue() {
            int i10 = this.f212377c;
            if (i10 == 0) {
                return null;
            }
            List<Object> list = this.f212375a;
            T t10 = (T) list.get(i10 - 1);
            if (!NotificationLite.isComplete(t10) && !NotificationLite.isError(t10)) {
                return t10;
            }
            if (i10 == 1) {
                return null;
            }
            return (T) list.get(i10 - 2);
        }

        @Override // io.reactivex.subjects.ReplaySubject.a
        public int size() {
            int i10 = this.f212377c;
            if (i10 == 0) {
                return 0;
            }
            int i11 = i10 - 1;
            Object obj = this.f212375a.get(i11);
            return (NotificationLite.isComplete(obj) || NotificationLite.isError(obj)) ? i11 : i10;
        }
    }

    public interface a<T> {
        void a(Object obj);

        void add(T t10);

        void b(ReplayDisposable<T> replayDisposable);

        boolean compareAndSet(Object obj, Object obj2);

        void d();

        T[] e(T[] tArr);

        Object get();

        @f
        T getValue();

        int size();
    }

    public ReplaySubject(a<T> aVar) {
        this.f212352a = aVar;
    }

    @e
    @InterfaceC5190c
    public static <T> ReplaySubject<T> j8() {
        return new ReplaySubject<>(new UnboundedReplayBuffer(16));
    }

    @e
    @InterfaceC5190c
    public static <T> ReplaySubject<T> k8(int i10) {
        return new ReplaySubject<>(new UnboundedReplayBuffer(i10));
    }

    public static <T> ReplaySubject<T> l8() {
        return new ReplaySubject<>(new SizeBoundReplayBuffer(Integer.MAX_VALUE));
    }

    @e
    @InterfaceC5190c
    public static <T> ReplaySubject<T> m8(int i10) {
        return new ReplaySubject<>(new SizeBoundReplayBuffer(i10));
    }

    @e
    @InterfaceC5190c
    public static <T> ReplaySubject<T> n8(long j10, TimeUnit timeUnit, H h10) {
        return new ReplaySubject<>(new SizeAndTimeBoundReplayBuffer(Integer.MAX_VALUE, j10, timeUnit, h10));
    }

    @e
    @InterfaceC5190c
    public static <T> ReplaySubject<T> o8(long j10, TimeUnit timeUnit, H h10, int i10) {
        return new ReplaySubject<>(new SizeAndTimeBoundReplayBuffer(i10, j10, timeUnit, h10));
    }

    @Override // hc.z
    public void C5(G<? super T> g10) {
        ReplayDisposable<T> replayDisposable = new ReplayDisposable<>(g10, this);
        g10.onSubscribe(replayDisposable);
        if (replayDisposable.f212359d) {
            return;
        }
        if (h8(replayDisposable) && replayDisposable.f212359d) {
            u8(replayDisposable);
        } else {
            this.f212352a.b(replayDisposable);
        }
    }

    @Override // io.reactivex.subjects.c
    @f
    public Throwable c8() {
        Object obj = this.f212352a.get();
        if (NotificationLite.isError(obj)) {
            return NotificationLite.getError(obj);
        }
        return null;
    }

    @Override // io.reactivex.subjects.c
    public boolean d8() {
        return NotificationLite.isComplete(this.f212352a.get());
    }

    @Override // io.reactivex.subjects.c
    public boolean e8() {
        return this.f212353b.get().length != 0;
    }

    @Override // io.reactivex.subjects.c
    public boolean f8() {
        return NotificationLite.isError(this.f212352a.get());
    }

    public boolean h8(ReplayDisposable<T> replayDisposable) {
        ReplayDisposable<T>[] replayDisposableArr;
        ReplayDisposable[] replayDisposableArr2;
        do {
            replayDisposableArr = this.f212353b.get();
            if (replayDisposableArr == f212350e) {
                return false;
            }
            int length = replayDisposableArr.length;
            replayDisposableArr2 = new ReplayDisposable[length + 1];
            System.arraycopy(replayDisposableArr, 0, replayDisposableArr2, 0, length);
            replayDisposableArr2[length] = replayDisposable;
        } while (!C1598m0.a(this.f212353b, replayDisposableArr, replayDisposableArr2));
        return true;
    }

    public void i8() {
        this.f212352a.d();
    }

    @Override // hc.G
    public void onComplete() {
        if (this.f212354c) {
            return;
        }
        this.f212354c = true;
        Object objComplete = NotificationLite.complete();
        a<T> aVar = this.f212352a;
        aVar.a(objComplete);
        for (ReplayDisposable<T> replayDisposable : w8(objComplete)) {
            aVar.b(replayDisposable);
        }
    }

    @Override // hc.G
    public void onError(Throwable th) {
        io.reactivex.internal.functions.a.g(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f212354c) {
            C5666a.Y(th);
            return;
        }
        this.f212354c = true;
        Object objError = NotificationLite.error(th);
        a<T> aVar = this.f212352a;
        aVar.a(objError);
        for (ReplayDisposable<T> replayDisposable : w8(objError)) {
            aVar.b(replayDisposable);
        }
    }

    @Override // hc.G
    public void onNext(T t10) {
        io.reactivex.internal.functions.a.g(t10, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f212354c) {
            return;
        }
        a<T> aVar = this.f212352a;
        aVar.add(t10);
        for (ReplayDisposable<T> replayDisposable : this.f212353b.get()) {
            aVar.b(replayDisposable);
        }
    }

    @Override // hc.G
    public void onSubscribe(io.reactivex.disposables.b bVar) {
        if (this.f212354c) {
            bVar.dispose();
        }
    }

    @f
    public T p8() {
        return this.f212352a.getValue();
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
    public Object[] q8() {
        Object[] objArr = f212351f;
        Object[] objArrE = this.f212352a.e(objArr);
        return objArrE == objArr ? new Object[0] : objArrE;
    }

    public T[] r8(T[] tArr) {
        return this.f212352a.e(tArr);
    }

    public boolean s8() {
        return this.f212352a.size() != 0;
    }

    public int t8() {
        return this.f212353b.get().length;
    }

    public void u8(ReplayDisposable<T> replayDisposable) {
        ReplayDisposable<T>[] replayDisposableArr;
        ReplayDisposable[] replayDisposableArr2;
        do {
            replayDisposableArr = this.f212353b.get();
            if (replayDisposableArr == f212350e || replayDisposableArr == f212349d) {
                return;
            }
            int length = replayDisposableArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    i10 = -1;
                    break;
                } else if (replayDisposableArr[i10] == replayDisposable) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 < 0) {
                return;
            }
            if (length == 1) {
                replayDisposableArr2 = f212349d;
            } else {
                ReplayDisposable[] replayDisposableArr3 = new ReplayDisposable[length - 1];
                System.arraycopy(replayDisposableArr, 0, replayDisposableArr3, 0, i10);
                System.arraycopy(replayDisposableArr, i10 + 1, replayDisposableArr3, i10, (length - i10) - 1);
                replayDisposableArr2 = replayDisposableArr3;
            }
        } while (!C1598m0.a(this.f212353b, replayDisposableArr, replayDisposableArr2));
    }

    public int v8() {
        return this.f212352a.size();
    }

    public ReplayDisposable<T>[] w8(Object obj) {
        return this.f212352a.compareAndSet(null, obj) ? this.f212353b.getAndSet(f212350e) : f212350e;
    }
}
