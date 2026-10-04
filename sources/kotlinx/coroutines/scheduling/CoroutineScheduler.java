package kotlinx.coroutines.scheduling;

import android.support.v4.media.e;
import androidx.collection.N0;
import androidx.compose.foundation.text.C1758e;
import androidx.compose.ui.graphics.vector.f;
import androidx.compose.ui.input.pointer.C2151s;
import dd.g;
import ed.l;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.L0;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.V;
import kotlinx.coroutines.AbstractC5051b;
import kotlinx.coroutines.C5053c;
import kotlinx.coroutines.O;
import kotlinx.coroutines.internal.L;
import kotlinx.coroutines.internal.Q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import xd.d;
import xd.i;
import xd.j;
import xd.m;
import xd.o;

/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nCoroutineScheduler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler\n+ 2 Tasks.kt\nkotlinx/coroutines/scheduling/TasksKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 5 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 6 Tasks.kt\nkotlinx/coroutines/scheduling/Task\n+ 7 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler$Worker\n*L\n1#1,1051:1\n281#1:1054\n279#1:1055\n279#1:1056\n281#1:1057\n276#1:1063\n277#1,5:1064\n287#1:1070\n279#1:1071\n280#1:1072\n279#1:1078\n280#1:1079\n276#1:1080\n284#1:1081\n279#1:1082\n279#1:1085\n280#1:1086\n281#1:1087\n89#2:1052\n89#2:1069\n1#3:1053\n24#4,4:1058\n24#4,4:1073\n16#5:1062\n16#5:1077\n86#6:1083\n617#7:1084\n*S KotlinDebug\n*F\n+ 1 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler\n*L\n277#1:1054\n284#1:1055\n285#1:1056\n294#1:1057\n343#1:1063\n372#1:1064,5\n395#1:1070\n442#1:1071\n443#1:1072\n479#1:1078\n480#1:1079\n486#1:1080\n495#1:1081\n495#1:1082\n576#1:1085\n577#1:1086\n578#1:1087\n115#1:1052\n392#1:1069\n343#1:1058,4\n475#1:1073,4\n343#1:1062\n475#1:1077\n512#1:1083\n519#1:1084\n*E\n"})
public final class CoroutineScheduler implements Executor, Closeable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final a f220642h = new a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f220643i = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "parkedWorkersStack$volatile");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f220644j = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "controlState$volatile");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f220645k = AtomicIntegerFieldUpdater.newUpdater(CoroutineScheduler.class, "_isTerminated$volatile");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @g
    @NotNull
    public static final Q f220646l = new Q("NOT_IN_STACK");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f220647m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f220648n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f220649o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f220650p = 21;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final long f220651q = 2097151;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final long f220652r = 4398044413952L;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f220653s = 42;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final long f220654t = 9223367638808264704L;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f220655u = 1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f220656v = 2097150;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final long f220657w = 2097151;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final long f220658x = -2097152;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final long f220659y = 2097152;
    private volatile /* synthetic */ int _isTerminated$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @g
    public final int f220660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @g
    public final int f220661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @g
    public final long f220662c;
    private volatile /* synthetic */ long controlState$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @g
    @NotNull
    public final String f220663d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @g
    @NotNull
    public final d f220664e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @g
    @NotNull
    public final d f220665f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @g
    @NotNull
    public final L<c> f220666g;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class WorkerState {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ WorkerState[] $VALUES;
        public static final WorkerState CPU_ACQUIRED = new WorkerState("CPU_ACQUIRED", 0);
        public static final WorkerState BLOCKING = new WorkerState("BLOCKING", 1);
        public static final WorkerState PARKING = new WorkerState("PARKING", 2);
        public static final WorkerState DORMANT = new WorkerState("DORMANT", 3);
        public static final WorkerState TERMINATED = new WorkerState("TERMINATED", 4);

        private static final /* synthetic */ WorkerState[] $values() {
            return new WorkerState[]{CPU_ACQUIRED, BLOCKING, PARKING, DORMANT, TERMINATED};
        }

        static {
            WorkerState[] workerStateArr$values = $values();
            $VALUES = workerStateArr$values;
            $ENTRIES = kotlin.enums.c.c(workerStateArr$values);
        }

        private WorkerState(String str, int i10) {
        }

        @NotNull
        public static kotlin.enums.a<WorkerState> getEntries() {
            return $ENTRIES;
        }

        public static WorkerState valueOf(String str) {
            return (WorkerState) Enum.valueOf(WorkerState.class, str);
        }

        public static WorkerState[] values() {
            return (WorkerState[]) $VALUES.clone();
        }
    }

    public static final class a {
        public a() {
        }

        public a(C4969v c4969v) {
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f220667a;

        static {
            int[] iArr = new int[WorkerState.values().length];
            try {
                iArr[WorkerState.PARKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WorkerState.BLOCKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WorkerState.CPU_ACQUIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WorkerState.DORMANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[WorkerState.TERMINATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f220667a = iArr;
        }
    }

    public CoroutineScheduler(int i10, int i11, long j10, @NotNull String str) {
        this.f220660a = i10;
        this.f220661b = i11;
        this.f220662c = j10;
        this.f220663d = str;
        if (i10 < 1) {
            throw new IllegalArgumentException(N0.a("Core pool size ", i10, " should be at least 1").toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(C1758e.a("Max pool size ", i11, " should be greater than or equals to core pool size ", i10).toString());
        }
        if (i11 > 2097150) {
            throw new IllegalArgumentException(N0.a("Max pool size ", i11, " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j10 <= 0) {
            throw new IllegalArgumentException(C2151s.a("Idle worker keep alive time ", j10, " must be positive").toString());
        }
        this.f220664e = new d(false);
        this.f220665f = new d(false);
        this.f220666g = new L<>((i10 + 1) * 2);
        this.controlState$volatile = ((long) i10) << 42;
        this._isTerminated$volatile = 0;
    }

    public static /* synthetic */ void r(CoroutineScheduler coroutineScheduler, Runnable runnable, j jVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            jVar = m.f240636i;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        coroutineScheduler.q(runnable, jVar, z10);
    }

    public static /* synthetic */ boolean z2(CoroutineScheduler coroutineScheduler, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = f220644j.get(coroutineScheduler);
        }
        return coroutineScheduler.p2(j10);
    }

    public final void B1(@NotNull c cVar, int i10, int i11) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f220643i;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            int iX0 = (int) (2097151 & j10);
            long j11 = (2097152 + j10) & f220658x;
            if (iX0 == i10) {
                iX0 = i11 == 0 ? X0(cVar) : i11;
            }
            if (iX0 >= 0) {
                if (f220643i.compareAndSet(this, j10, j11 | ((long) iX0))) {
                    return;
                }
            }
        }
    }

    public final long C1() {
        return f220644j.addAndGet(this, 4398046511104L);
    }

    public final boolean F2() {
        c cVarF1;
        do {
            cVarF1 = f1();
            if (cVarF1 == null) {
                return false;
            }
        } while (!c.f220668i.compareAndSet(cVarF1, -1, 0));
        LockSupport.unpark(cVarF1);
        return true;
    }

    public final void G1(@NotNull i iVar) {
        try {
            iVar.run();
        } catch (Throwable th) {
            try {
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                AbstractC5051b abstractC5051b = C5053c.f218833a;
                if (abstractC5051b != null) {
                    abstractC5051b.f();
                }
            } finally {
                AbstractC5051b abstractC5051b2 = C5053c.f218833a;
                if (abstractC5051b2 != null) {
                    abstractC5051b2.f();
                }
            }
        }
    }

    public final /* synthetic */ int L0() {
        return this._isTerminated$volatile;
    }

    public final /* synthetic */ void M1(long j10) {
        this.controlState$volatile = j10;
    }

    public final /* synthetic */ void N1(long j10) {
        this.parkedWorkersStack$volatile = j10;
    }

    public final long O0() {
        return f220644j.addAndGet(this, 2097152L);
    }

    public final int P() {
        return (int) (f220644j.get(this) & 2097151);
    }

    public final int Q0() {
        return (int) (f220644j.incrementAndGet(this) & 2097151);
    }

    public final /* synthetic */ void T0(Object obj, AtomicLongFieldUpdater atomicLongFieldUpdater, l<? super Long, L0> lVar) {
        while (true) {
            lVar.invoke(Long.valueOf(atomicLongFieldUpdater.get(obj)));
        }
    }

    public final /* synthetic */ long U() {
        return this.parkedWorkersStack$volatile;
    }

    public final /* synthetic */ void V1(int i10) {
        this._isTerminated$volatile = i10;
    }

    public final int X0(c cVar) {
        Object objJ = cVar.j();
        while (objJ != f220646l) {
            if (objJ == null) {
                return 0;
            }
            c cVar2 = (c) objJ;
            int i10 = cVar2.i();
            if (i10 != 0) {
                return i10;
            }
            objJ = cVar2.j();
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Y1(long r8) throws java.lang.InterruptedException {
        /*
            r7 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.f220645k
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r7, r1, r2)
            if (r0 != 0) goto Lb
            return
        Lb:
            kotlinx.coroutines.scheduling.CoroutineScheduler$c r0 = r7.n()
            kotlinx.coroutines.internal.L<kotlinx.coroutines.scheduling.CoroutineScheduler$c> r1 = r7.f220666g
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = kotlinx.coroutines.scheduling.CoroutineScheduler.f220644j     // Catch: java.lang.Throwable -> L87
            long r3 = r3.get(r7)     // Catch: java.lang.Throwable -> L87
            r5 = 2097151(0x1fffff, double:1.0361303E-317)
            long r3 = r3 & r5
            int r3 = (int) r3
            monitor-exit(r1)
            if (r2 > r3) goto L49
            r1 = r2
        L21:
            kotlinx.coroutines.internal.L<kotlinx.coroutines.scheduling.CoroutineScheduler$c> r4 = r7.f220666g
            java.lang.Object r4 = r4.b(r1)
            kotlin.jvm.internal.G.m(r4)
            kotlinx.coroutines.scheduling.CoroutineScheduler$c r4 = (kotlinx.coroutines.scheduling.CoroutineScheduler.c) r4
            if (r4 == r0) goto L44
        L2e:
            java.lang.Thread$State r5 = r4.getState()
            java.lang.Thread$State r6 = java.lang.Thread.State.TERMINATED
            if (r5 == r6) goto L3d
            java.util.concurrent.locks.LockSupport.unpark(r4)
            r4.join(r8)
            goto L2e
        L3d:
            xd.o r4 = r4.f220669a
            xd.d r5 = r7.f220665f
            r4.o(r5)
        L44:
            if (r1 == r3) goto L49
            int r1 = r1 + 1
            goto L21
        L49:
            xd.d r8 = r7.f220665f
            r8.b()
            xd.d r8 = r7.f220664e
            r8.b()
        L53:
            if (r0 == 0) goto L5b
            xd.i r8 = r0.h(r2)
            if (r8 != 0) goto L83
        L5b:
            xd.d r8 = r7.f220664e
            java.lang.Object r8 = r8.j()
            xd.i r8 = (xd.i) r8
            if (r8 != 0) goto L83
            xd.d r8 = r7.f220665f
            java.lang.Object r8 = r8.j()
            xd.i r8 = (xd.i) r8
            if (r8 != 0) goto L83
            if (r0 == 0) goto L76
            kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r8 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED
            r0.F(r8)
        L76:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = kotlinx.coroutines.scheduling.CoroutineScheduler.f220643i
            r0 = 0
            r8.set(r7, r0)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = kotlinx.coroutines.scheduling.CoroutineScheduler.f220644j
            r8.set(r7, r0)
            return
        L83:
            r7.G1(r8)
            goto L53
        L87:
            r8 = move-exception
            monitor-exit(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.scheduling.CoroutineScheduler.Y1(long):void");
    }

    public final void c2(long j10, boolean z10) {
        if (z10 || F2() || p2(j10)) {
            return;
        }
        F2();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws InterruptedException {
        Y1(10000L);
    }

    public final boolean e(i iVar) {
        return iVar.f240625b.h2() == 1 ? this.f220665f.a(iVar) : this.f220664e.a(iVar);
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NotNull Runnable runnable) {
        r(this, runnable, null, false, 6, null);
    }

    public final int f(long j10) {
        return (int) ((j10 & f220654t) >> 42);
    }

    public final c f1() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f220643i;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            c cVarB = this.f220666g.b((int) (2097151 & j10));
            if (cVarB == null) {
                return null;
            }
            long j11 = (2097152 + j10) & f220658x;
            int iX0 = X0(cVarB);
            if (iX0 >= 0 && f220643i.compareAndSet(this, j10, ((long) iX0) | j11)) {
                cVarB.B(f220646l);
                return cVarB;
            }
        }
    }

    public final int g(long j10) {
        return (int) ((j10 & f220652r) >> 21);
    }

    public final boolean h1(@NotNull c cVar) {
        long j10;
        long j11;
        int i10;
        if (cVar.j() != f220646l) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f220643i;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            j11 = (2097152 + j10) & f220658x;
            i10 = cVar.i();
            cVar.B(this.f220666g.b((int) (2097151 & j10)));
        } while (!f220643i.compareAndSet(this, j10, j11 | ((long) i10)));
        return true;
    }

    public final void h2() {
        if (F2() || z2(this, 0L, 1, null)) {
            return;
        }
        F2();
    }

    public final boolean isTerminated() {
        return f220645k.get(this) != 0;
    }

    public final int k() {
        synchronized (this.f220666g) {
            try {
                if (isTerminated()) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f220644j;
                long j10 = atomicLongFieldUpdater.get(this);
                int i10 = (int) (j10 & 2097151);
                int i11 = i10 - ((int) ((j10 & f220652r) >> 21));
                if (i11 < 0) {
                    i11 = 0;
                }
                if (i11 >= this.f220660a) {
                    return 0;
                }
                if (i10 >= this.f220661b) {
                    return 0;
                }
                int i12 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i12 <= 0 || this.f220666g.b(i12) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                c cVar = new c(this, i12);
                this.f220666g.c(i12, cVar);
                if (i12 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i13 = i11 + 1;
                cVar.start();
                return i13;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @NotNull
    public final i l(@NotNull Runnable runnable, @NotNull j jVar) {
        long jA = m.f240633f.a();
        if (!(runnable instanceof i)) {
            return new xd.l(runnable, jA, jVar);
        }
        i iVar = (i) runnable;
        iVar.f240624a = jA;
        iVar.f240625b = jVar;
        return iVar;
    }

    public final int m(long j10) {
        return (int) (j10 & 2097151);
    }

    public final i m2(c cVar, i iVar, boolean z10) {
        if (cVar == null || cVar.f220671c == WorkerState.TERMINATED) {
            return iVar;
        }
        if (iVar.f240625b.h2() == 0 && cVar.f220671c == WorkerState.BLOCKING) {
            return iVar;
        }
        cVar.f220675g = true;
        return cVar.f220669a.a(iVar, z10);
    }

    public final c n() {
        Thread threadCurrentThread = Thread.currentThread();
        c cVar = threadCurrentThread instanceof c ? (c) threadCurrentThread : null;
        if (cVar == null || !G.g(CoroutineScheduler.this, this)) {
            return null;
        }
        return cVar;
    }

    public final boolean n2() {
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f220644j;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            if (((int) ((f220654t & j10) >> 42)) == 0) {
                return false;
            }
        } while (!f220644j.compareAndSet(this, j10, j10 - 4398046511104L));
        return true;
    }

    public final void o() {
        f220644j.addAndGet(this, f220658x);
    }

    public final int p() {
        return (int) (f220644j.getAndDecrement(this) & 2097151);
    }

    public final boolean p2(long j10) {
        int i10 = ((int) (2097151 & j10)) - ((int) ((j10 & f220652r) >> 21));
        if (i10 < 0) {
            i10 = 0;
        }
        if (i10 < this.f220660a) {
            int iK = k();
            if (iK == 1 && this.f220660a > 1) {
                k();
            }
            if (iK > 0) {
                return true;
            }
        }
        return false;
    }

    public final void q(@NotNull Runnable runnable, @NotNull j jVar, boolean z10) {
        AbstractC5051b abstractC5051b = C5053c.f218833a;
        if (abstractC5051b != null) {
            abstractC5051b.e();
        }
        i iVarL = l(runnable, jVar);
        boolean z11 = false;
        boolean z12 = iVarL.f240625b.h2() == 1;
        long jAddAndGet = z12 ? f220644j.addAndGet(this, 2097152L) : 0L;
        c cVarN = n();
        i iVarM2 = m2(cVarN, iVarL, z10);
        if (iVarM2 != null && !e(iVarM2)) {
            throw new RejectedExecutionException(e.a(new StringBuilder(), this.f220663d, " was terminated"));
        }
        if (z10 && cVarN != null) {
            z11 = true;
        }
        if (z12) {
            c2(jAddAndGet, z11);
        } else {
            if (z11) {
                return;
            }
            h2();
        }
    }

    public final int s() {
        return (int) ((f220644j.get(this) & f220654t) >> 42);
    }

    @NotNull
    public String toString() {
        ArrayList arrayList = new ArrayList();
        int iA = this.f220666g.a();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 1; i15 < iA; i15++) {
            c cVarB = this.f220666g.b(i15);
            if (cVarB != null) {
                int iN = cVarB.f220669a.n();
                int i16 = b.f220667a[cVarB.f220671c.ordinal()];
                if (i16 == 1) {
                    i12++;
                } else if (i16 == 2) {
                    i11++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(iN);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (i16 == 3) {
                    i10++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(iN);
                    sb3.append(f.f101679k);
                    arrayList.add(sb3.toString());
                } else if (i16 == 4) {
                    i13++;
                    if (iN > 0) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(iN);
                        sb4.append('d');
                        arrayList.add(sb4.toString());
                    }
                } else if (i16 == 5) {
                    i14++;
                }
            }
        }
        long j10 = f220644j.get(this);
        StringBuilder sb5 = new StringBuilder();
        sb5.append(this.f220663d);
        sb5.append('@');
        sb5.append(O.b(this));
        sb5.append("[Pool Size {core = ");
        sb5.append(this.f220660a);
        sb5.append(", max = ");
        androidx.viewpager.widget.a.a(sb5, this.f220661b, "}, Worker States {CPU = ", i10, ", blocking = ");
        androidx.viewpager.widget.a.a(sb5, i11, ", parked = ", i12, ", dormant = ");
        androidx.viewpager.widget.a.a(sb5, i13, ", terminated = ", i14, "}, running workers queues = ");
        sb5.append(arrayList);
        sb5.append(", global CPU queue size = ");
        sb5.append(this.f220664e.c());
        sb5.append(", global blocking queue size = ");
        sb5.append(this.f220665f.c());
        sb5.append(", Control State {created workers= ");
        sb5.append((int) (2097151 & j10));
        sb5.append(", blocking tasks = ");
        sb5.append((int) ((f220652r & j10) >> 21));
        sb5.append(", CPUs acquired = ");
        sb5.append(this.f220660a - ((int) ((f220654t & j10) >> 42)));
        sb5.append("}]");
        return sb5.toString();
    }

    public final /* synthetic */ long u() {
        return this.controlState$volatile;
    }

    @V({"SMAP\nCoroutineScheduler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler$Worker\n+ 2 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Tasks.kt\nkotlinx/coroutines/scheduling/Task\n+ 5 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 6 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n*L\n1#1,1051:1\n293#2,2:1052\n281#2:1054\n295#2,4:1055\n300#2:1059\n290#2,2:1060\n290#2,2:1064\n276#2:1071\n285#2:1072\n279#2:1073\n276#2:1074\n1#3:1062\n86#4:1063\n24#5,4:1066\n16#6:1070\n*S KotlinDebug\n*F\n+ 1 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler$Worker\n*L\n682#1:1052,2\n682#1:1054\n682#1:1055,4\n697#1:1059\n771#1:1060,2\n825#1:1064,2\n873#1:1071\n899#1:1072\n899#1:1073\n981#1:1074\n808#1:1063\n869#1:1066,4\n869#1:1070\n*E\n"})
    public final class c extends Thread {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f220668i = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl$volatile");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @g
        @NotNull
        public final o f220669a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Ref.ObjectRef<i> f220670b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @g
        @NotNull
        public WorkerState f220671c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f220672d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f220673e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f220674f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @g
        public boolean f220675g;
        private volatile int indexInArray;

        @Nullable
        private volatile Object nextParkedWorker;
        private volatile /* synthetic */ int workerCtl$volatile;

        public c() {
            setDaemon(true);
            setContextClassLoader(CoroutineScheduler.this.getClass().getClassLoader());
            this.f220669a = new o();
            this.f220670b = new Ref.ObjectRef<>();
            this.f220671c = WorkerState.DORMANT;
            this.nextParkedWorker = CoroutineScheduler.f220646l;
            int iNanoTime = (int) System.nanoTime();
            this.f220674f = iNanoTime == 0 ? 42 : iNanoTime;
        }

        public final void B(@Nullable Object obj) {
            this.nextParkedWorker = obj;
        }

        public final /* synthetic */ void C(int i10) {
            this.workerCtl$volatile = i10;
        }

        public final boolean D() {
            long j10;
            if (this.f220671c == WorkerState.CPU_ACQUIRED) {
                return true;
            }
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            AtomicLongFieldUpdater atomicLongFieldUpdater = CoroutineScheduler.f220644j;
            do {
                j10 = atomicLongFieldUpdater.get(coroutineScheduler);
                if (((int) ((CoroutineScheduler.f220654t & j10) >> 42)) == 0) {
                    return false;
                }
            } while (!CoroutineScheduler.f220644j.compareAndSet(coroutineScheduler, j10, j10 - 4398046511104L));
            this.f220671c = WorkerState.CPU_ACQUIRED;
            return true;
        }

        public final void E() {
            if (!q()) {
                CoroutineScheduler.this.h1(this);
                return;
            }
            f220668i.set(this, -1);
            while (q() && f220668i.get(this) == -1 && !CoroutineScheduler.this.isTerminated() && this.f220671c != WorkerState.TERMINATED) {
                F(WorkerState.PARKING);
                Thread.interrupted();
                u();
            }
        }

        public final boolean F(@NotNull WorkerState workerState) {
            WorkerState workerState2 = this.f220671c;
            boolean z10 = workerState2 == WorkerState.CPU_ACQUIRED;
            if (z10) {
                CoroutineScheduler.f220644j.addAndGet(CoroutineScheduler.this, 4398046511104L);
            }
            if (workerState2 != workerState) {
                this.f220671c = workerState;
            }
            return z10;
        }

        public final i G(int i10) {
            int i11 = (int) (CoroutineScheduler.f220644j.get(CoroutineScheduler.this) & 2097151);
            if (i11 < 2) {
                return null;
            }
            int iT = t(i11);
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            long jMin = Long.MAX_VALUE;
            for (int i12 = 0; i12 < i11; i12++) {
                iT++;
                if (iT > i11) {
                    iT = 1;
                }
                c cVarB = coroutineScheduler.f220666g.b(iT);
                if (cVarB != null && cVarB != this) {
                    long jB = cVarB.f220669a.B(i10, this.f220670b);
                    if (jB == -1) {
                        Ref.ObjectRef<i> objectRef = this.f220670b;
                        i iVar = objectRef.f217904a;
                        objectRef.f217904a = null;
                        return iVar;
                    }
                    if (jB > 0) {
                        jMin = Math.min(jMin, jB);
                    }
                }
            }
            if (jMin == Long.MAX_VALUE) {
                jMin = 0;
            }
            this.f220673e = jMin;
            return null;
        }

        public final void H() {
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            synchronized (coroutineScheduler.f220666g) {
                try {
                    if (coroutineScheduler.isTerminated()) {
                        return;
                    }
                    AtomicLongFieldUpdater atomicLongFieldUpdater = CoroutineScheduler.f220644j;
                    if (((int) (atomicLongFieldUpdater.get(coroutineScheduler) & 2097151)) <= coroutineScheduler.f220660a) {
                        return;
                    }
                    if (f220668i.compareAndSet(this, -1, 1)) {
                        int i10 = this.indexInArray;
                        z(0);
                        coroutineScheduler.B1(this, i10, 0);
                        int andDecrement = (int) (2097151 & atomicLongFieldUpdater.getAndDecrement(coroutineScheduler));
                        if (andDecrement != i10) {
                            c cVarB = coroutineScheduler.f220666g.b(andDecrement);
                            G.m(cVarB);
                            c cVar = cVarB;
                            coroutineScheduler.f220666g.c(i10, cVar);
                            cVar.z(i10);
                            coroutineScheduler.B1(cVar, andDecrement, i10);
                        }
                        coroutineScheduler.f220666g.c(andDecrement, null);
                        this.f220671c = WorkerState.TERMINATED;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void b(int i10) {
            if (i10 == 0) {
                return;
            }
            CoroutineScheduler.f220644j.addAndGet(CoroutineScheduler.this, CoroutineScheduler.f220658x);
            if (this.f220671c != WorkerState.TERMINATED) {
                this.f220671c = WorkerState.DORMANT;
            }
        }

        public final void c(int i10) {
            if (i10 != 0 && F(WorkerState.BLOCKING)) {
                CoroutineScheduler.this.h2();
            }
        }

        public final void d(i iVar) {
            int iH2 = iVar.f240625b.h2();
            o(iH2);
            c(iH2);
            CoroutineScheduler.this.G1(iVar);
            b(iH2);
        }

        public final i e(boolean z10) {
            i iVarV;
            i iVarV2;
            if (z10) {
                boolean z11 = t(CoroutineScheduler.this.f220660a * 2) == 0;
                if (z11 && (iVarV2 = v()) != null) {
                    return iVarV2;
                }
                i iVarP = this.f220669a.p();
                if (iVarP != null) {
                    return iVarP;
                }
                if (!z11 && (iVarV = v()) != null) {
                    return iVarV;
                }
            } else {
                i iVarV3 = v();
                if (iVarV3 != null) {
                    return iVarV3;
                }
            }
            return G(3);
        }

        public final i f() {
            i iVarU = this.f220669a.u(true);
            if (iVarU != null) {
                return iVarU;
            }
            i iVarJ = CoroutineScheduler.this.f220665f.j();
            return iVarJ == null ? G(1) : iVarJ;
        }

        public final i g() {
            i iVarU = this.f220669a.u(false);
            if (iVarU != null) {
                return iVarU;
            }
            i iVarJ = CoroutineScheduler.this.f220665f.j();
            return iVarJ == null ? G(2) : iVarJ;
        }

        @Nullable
        public final i h(boolean z10) {
            return D() ? e(z10) : f();
        }

        public final int i() {
            return this.indexInArray;
        }

        @Nullable
        public final Object j() {
            return this.nextParkedWorker;
        }

        @NotNull
        public final CoroutineScheduler k() {
            return CoroutineScheduler.this;
        }

        public final /* synthetic */ int m() {
            return this.workerCtl$volatile;
        }

        public final void o(int i10) {
            this.f220672d = 0L;
            if (this.f220671c == WorkerState.PARKING) {
                this.f220671c = WorkerState.BLOCKING;
            }
        }

        public final boolean q() {
            return this.nextParkedWorker != CoroutineScheduler.f220646l;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            x();
        }

        public final boolean s() {
            return this.f220671c == WorkerState.BLOCKING;
        }

        public final int t(int i10) {
            int i11 = this.f220674f;
            int i12 = i11 ^ (i11 << 13);
            int i13 = i12 ^ (i12 >> 17);
            int i14 = i13 ^ (i13 << 5);
            this.f220674f = i14;
            int i15 = i10 - 1;
            return (i15 & i10) == 0 ? i14 & i15 : (i14 & Integer.MAX_VALUE) % i10;
        }

        public final void u() {
            if (this.f220672d == 0) {
                this.f220672d = System.nanoTime() + CoroutineScheduler.this.f220662c;
            }
            LockSupport.parkNanos(CoroutineScheduler.this.f220662c);
            if (System.nanoTime() - this.f220672d >= 0) {
                this.f220672d = 0L;
                H();
            }
        }

        public final i v() {
            if (t(2) == 0) {
                i iVarJ = CoroutineScheduler.this.f220664e.j();
                return iVarJ != null ? iVarJ : CoroutineScheduler.this.f220665f.j();
            }
            i iVarJ2 = CoroutineScheduler.this.f220665f.j();
            return iVarJ2 != null ? iVarJ2 : CoroutineScheduler.this.f220664e.j();
        }

        public final long w() {
            boolean z10 = this.f220671c == WorkerState.CPU_ACQUIRED;
            i iVarG = z10 ? g() : f();
            if (iVarG == null) {
                long j10 = this.f220673e;
                if (j10 == 0) {
                    return -1L;
                }
                return j10;
            }
            CoroutineScheduler.this.G1(iVarG);
            if (!z10) {
                CoroutineScheduler.f220644j.addAndGet(CoroutineScheduler.this, CoroutineScheduler.f220658x);
            }
            return 0L;
        }

        public final void x() {
            loop0: while (true) {
                boolean z10 = false;
                while (!CoroutineScheduler.this.isTerminated() && this.f220671c != WorkerState.TERMINATED) {
                    i iVarH = h(this.f220675g);
                    if (iVarH != null) {
                        this.f220673e = 0L;
                        d(iVarH);
                    } else {
                        this.f220675g = false;
                        if (this.f220673e == 0) {
                            E();
                        } else if (z10) {
                            F(WorkerState.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f220673e);
                            this.f220673e = 0L;
                        } else {
                            z10 = true;
                        }
                    }
                }
                break loop0;
            }
            F(WorkerState.TERMINATED);
        }

        public final void z(int i10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(CoroutineScheduler.this.f220663d);
            sb2.append("-worker-");
            sb2.append(i10 == 0 ? "TERMINATED" : String.valueOf(i10));
            setName(sb2.toString());
            this.indexInArray = i10;
        }

        public c(CoroutineScheduler coroutineScheduler, int i10) {
            this();
            z(i10);
        }
    }

    public /* synthetic */ CoroutineScheduler(int i10, int i11, long j10, String str, int i12, C4969v c4969v) {
        this(i10, i11, (i12 & 4) != 0 ? m.f240632e : j10, (i12 & 8) != 0 ? m.f240628a : str);
    }
}
