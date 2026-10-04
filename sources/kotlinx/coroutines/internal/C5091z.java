package kotlinx.coroutines.internal;

import A0.a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.L0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.jvm.internal.V({"SMAP\nLockFreeTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LockFreeTaskQueue.kt\nkotlinx/coroutines/internal/LockFreeTaskQueueCore\n+ 2 LockFreeTaskQueue.kt\nkotlinx/coroutines/internal/LockFreeTaskQueueCore$Companion\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,304:1\n295#2,3:305\n295#2,3:308\n295#2,3:311\n295#2,3:314\n295#2,3:317\n295#2,3:321\n295#2,3:324\n1#3:320\n*S KotlinDebug\n*F\n+ 1 LockFreeTaskQueue.kt\nkotlinx/coroutines/internal/LockFreeTaskQueueCore\n*L\n87#1:305,3\n88#1:308,3\n103#1:311,3\n163#1:314,3\n196#1:317,3\n227#1:321,3\n243#1:324,3\n*E\n"})
public final class C5091z<E> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f220371h = 8;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f220372i = 30;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f220373j = 1073741823;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f220374k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f220375l = 1073741823;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f220376m = 30;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final long f220377n = 1152921503533105152L;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f220378o = 60;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final long f220379p = 1152921504606846976L;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f220380q = 61;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final long f220381r = 2305843009213693952L;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f220382s = 1024;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f220384u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f220385v = 1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f220386w = 2;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f220387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f220388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f220389c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f220390d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f220368e = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f220369f = AtomicReferenceFieldUpdater.newUpdater(C5091z.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f220370g = AtomicLongFieldUpdater.newUpdater(C5091z.class, "_state$volatile");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @dd.g
    @NotNull
    public static final Q f220383t = new Q("REMOVE_FROZEN");

    /* JADX INFO: renamed from: kotlinx.coroutines.internal.z$a */
    public static final class a {
        public a() {
        }

        public final int a(long j10) {
            return (j10 & C5091z.f220381r) != 0 ? 2 : 1;
        }

        public final long b(long j10, int i10) {
            return (j10 & (-1073741824)) | ((long) i10);
        }

        public final long c(long j10, int i10) {
            return (j10 & (-1152921503533105153L)) | (((long) i10) << 30);
        }

        public final <T> T d(long j10, @NotNull ed.p<? super Integer, ? super Integer, ? extends T> pVar) {
            return pVar.invoke(Integer.valueOf((int) (C5091z.f220375l & j10)), Integer.valueOf((int) ((j10 & C5091z.f220377n) >> 30)));
        }

        public final long e(long j10, long j11) {
            return j10 & (~j11);
        }

        public a(C4969v c4969v) {
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.internal.z$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dd.g
        public final int f220391a;

        public b(int i10) {
            this.f220391a = i10;
        }
    }

    public C5091z(int i10, boolean z10) {
        this.f220387a = i10;
        this.f220388b = z10;
        int i11 = i10 - 1;
        this.f220389c = i11;
        this.f220390d = new AtomicReferenceArray(i10);
        if (i11 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i10 & i11) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(@org.jetbrains.annotations.NotNull E r13) {
        /*
            r12 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.internal.C5091z.f220370g
        L2:
            long r3 = r0.get(r12)
            r1 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r1 = r1 & r3
            r7 = 0
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L16
            kotlinx.coroutines.internal.z$a r13 = kotlinx.coroutines.internal.C5091z.f220368e
            int r13 = r13.a(r3)
            return r13
        L16:
            r1 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r1 = r1 & r3
            int r1 = (int) r1
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r5 = r5 & r3
            r2 = 30
            long r5 = r5 >> r2
            int r9 = (int) r5
            int r10 = r12.f220389c
            int r2 = r9 + 2
            r2 = r2 & r10
            r5 = r1 & r10
            r6 = 1
            if (r2 != r5) goto L30
            return r6
        L30:
            boolean r2 = r12.f220388b
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            if (r2 != 0) goto L4f
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r12.f220390d
            r11 = r9 & r10
            java.lang.Object r2 = r2.get(r11)
            if (r2 == 0) goto L4f
            int r2 = r12.f220387a
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 < r3) goto L4e
            int r9 = r9 - r1
            r1 = r9 & r5
            int r2 = r2 >> 1
            if (r1 <= r2) goto L2
        L4e:
            return r6
        L4f:
            int r1 = r9 + 1
            r1 = r1 & r5
            r2 = r1
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.internal.C5091z.f220370g
            kotlinx.coroutines.internal.z$a r5 = kotlinx.coroutines.internal.C5091z.f220368e
            long r5 = r5.c(r3, r2)
            r2 = r12
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto L2
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r2.f220390d
            r1 = r9 & r10
            r0.set(r1, r13)
            r0 = r2
        L6a:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.internal.C5091z.f220370g
            long r3 = r1.get(r0)
            r5 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r3 = r3 & r5
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 == 0) goto L81
            kotlinx.coroutines.internal.z r0 = r0.r()
            kotlinx.coroutines.internal.z r0 = r0.e(r9, r13)
            if (r0 != 0) goto L6a
        L81:
            r13 = 0
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C5091z.a(java.lang.Object):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C5091z<E> b(long j10) {
        C5091z<E> c5091z = new C5091z<>(this.f220387a * 2, this.f220388b);
        int i10 = (int) (f220375l & j10);
        int i11 = (int) ((f220377n & j10) >> 30);
        while (true) {
            int i12 = this.f220389c;
            if ((i10 & i12) == (i11 & i12)) {
                AtomicLongFieldUpdater atomicLongFieldUpdater = f220370g;
                f220368e.getClass();
                atomicLongFieldUpdater.set(c5091z, j10 & (-1152921504606846977L));
                return c5091z;
            }
            Object bVar = this.f220390d.get(i12 & i10);
            if (bVar == null) {
                bVar = new b(i10);
            }
            c5091z.f220390d.set(c5091z.f220389c & i10, bVar);
            i10++;
        }
    }

    public final C5091z<E> c(long j10) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f220369f;
        while (true) {
            C5091z<E> c5091z = (C5091z) atomicReferenceFieldUpdater.get(this);
            if (c5091z != null) {
                return c5091z;
            }
            androidx.concurrent.futures.c.a(f220369f, this, null, b(j10));
        }
    }

    public final boolean d() {
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f220370g;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            if ((j10 & f220381r) != 0) {
                return true;
            }
            if ((1152921504606846976L & j10) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, f220381r | j10));
        return true;
    }

    public final C5091z<E> e(int i10, E e10) {
        Object obj = this.f220390d.get(this.f220389c & i10);
        if (!(obj instanceof b) || ((b) obj).f220391a != i10) {
            return null;
        }
        this.f220390d.set(i10 & this.f220389c, e10);
        return this;
    }

    public final /* synthetic */ AtomicReferenceArray f() {
        return this.f220390d;
    }

    public final int g() {
        long j10 = f220370g.get(this);
        return (((int) ((j10 & f220377n) >> 30)) - ((int) (f220375l & j10))) & f220373j;
    }

    public final /* synthetic */ Object h() {
        return this._next$volatile;
    }

    public final /* synthetic */ long j() {
        return this._state$volatile;
    }

    public final boolean l() {
        return (f220370g.get(this) & f220381r) != 0;
    }

    public final boolean m() {
        long j10 = f220370g.get(this);
        return ((int) (f220375l & j10)) == ((int) ((j10 & f220377n) >> 30));
    }

    public final /* synthetic */ void n(Object obj, AtomicLongFieldUpdater atomicLongFieldUpdater, ed.l<? super Long, L0> lVar) {
        while (true) {
            lVar.invoke(Long.valueOf(atomicLongFieldUpdater.get(obj)));
        }
    }

    public final /* synthetic */ void o(Object obj, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, ed.l<Object, L0> lVar) {
        while (true) {
            lVar.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    @NotNull
    public final <R> List<R> p(@NotNull ed.l<? super E, ? extends R> lVar) {
        ArrayList arrayList = new ArrayList(this.f220387a);
        long j10 = f220370g.get(this);
        int i10 = (int) (f220375l & j10);
        int i11 = (int) ((j10 & f220377n) >> 30);
        while (true) {
            int i12 = this.f220389c;
            if ((i10 & i12) == (i11 & i12)) {
                return arrayList;
            }
            a.b bVar = (Object) this.f220390d.get(i12 & i10);
            if (bVar != null && !(bVar instanceof b)) {
                arrayList.add(lVar.invoke(bVar));
            }
            i10++;
        }
    }

    public final long q() {
        long j10;
        long j11;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f220370g;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            if ((j10 & 1152921504606846976L) != 0) {
                return j10;
            }
            j11 = 1152921504606846976L | j10;
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, j11));
        return j11;
    }

    @NotNull
    public final C5091z<E> r() {
        return c(q());
    }

    @Nullable
    public final Object s() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f220370g;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            if ((1152921504606846976L & j10) != 0) {
                return f220383t;
            }
            int i10 = (int) (f220375l & j10);
            int i11 = (int) ((f220377n & j10) >> 30);
            int i12 = this.f220389c;
            if ((i11 & i12) == (i10 & i12)) {
                return null;
            }
            Object obj = this.f220390d.get(i12 & i10);
            if (obj == null) {
                if (this.f220388b) {
                    return null;
                }
            } else {
                if (obj instanceof b) {
                    return null;
                }
                int i13 = (i10 + 1) & f220373j;
                if (f220370g.compareAndSet(this, j10, f220368e.b(j10, i13))) {
                    this.f220390d.set(this.f220389c & i10, null);
                    return obj;
                }
                if (this.f220388b) {
                    C5091z<E> c5091zT = this;
                    do {
                        c5091zT = c5091zT.t(i10, i13);
                    } while (c5091zT != null);
                    return obj;
                }
            }
        }
    }

    public final C5091z<E> t(int i10, int i11) {
        long j10;
        int i12;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f220370g;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            i12 = (int) (f220375l & j10);
            if ((1152921504606846976L & j10) != 0) {
                return r();
            }
        } while (!f220370g.compareAndSet(this, j10, f220368e.b(j10, i11)));
        this.f220390d.set(this.f220389c & i12, null);
        return null;
    }

    public final /* synthetic */ void u(Object obj) {
        this._next$volatile = obj;
    }

    public final /* synthetic */ void v(long j10) {
        this._state$volatile = j10;
    }

    public final /* synthetic */ void w(Object obj, AtomicLongFieldUpdater atomicLongFieldUpdater, ed.l<? super Long, Long> lVar) {
        while (true) {
            long j10 = atomicLongFieldUpdater.get(obj);
            Object obj2 = obj;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = atomicLongFieldUpdater;
            if (atomicLongFieldUpdater2.compareAndSet(obj2, j10, lVar.invoke(Long.valueOf(j10)).longValue())) {
                return;
            }
            atomicLongFieldUpdater = atomicLongFieldUpdater2;
            obj = obj2;
        }
    }

    public final /* synthetic */ long x(Object obj, AtomicLongFieldUpdater atomicLongFieldUpdater, ed.l<? super Long, Long> lVar) {
        while (true) {
            long j10 = atomicLongFieldUpdater.get(obj);
            Long lInvoke = lVar.invoke(Long.valueOf(j10));
            Object obj2 = obj;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = atomicLongFieldUpdater;
            if (atomicLongFieldUpdater2.compareAndSet(obj2, j10, lInvoke.longValue())) {
                return lInvoke.longValue();
            }
            atomicLongFieldUpdater = atomicLongFieldUpdater2;
            obj = obj2;
        }
    }
}
