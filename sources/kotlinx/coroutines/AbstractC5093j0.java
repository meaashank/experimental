package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC4982o;
import kotlinx.coroutines.U;
import kotlinx.coroutines.internal.C5091z;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kotlinx.coroutines.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.jvm.internal.V({"SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase\n+ 2 ThreadSafeHeap.kt\nkotlinx/coroutines/internal/ThreadSafeHeap\n+ 3 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 4 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 5 EventLoop.kt\nkotlinx/coroutines/EventLoopKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,540:1\n51#2:541\n52#2,7:547\n24#3,4:542\n16#4:546\n53#5:554\n1#6:555\n*S KotlinDebug\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase\n*L\n266#1:541\n266#1:547,7\n266#1:542,4\n266#1:546\n277#1:554\n*E\n"})
public abstract class AbstractC5093j0 extends AbstractC5095k0 implements U {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f220395f = AtomicReferenceFieldUpdater.newUpdater(AbstractC5093j0.class, Object.class, "_queue$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f220396g = AtomicReferenceFieldUpdater.newUpdater(AbstractC5093j0.class, Object.class, "_delayed$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f220397h = AtomicIntegerFieldUpdater.newUpdater(AbstractC5093j0.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    /* JADX INFO: renamed from: kotlinx.coroutines.j0$a */
    @kotlin.jvm.internal.V({"SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase$DelayedResumeTask\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,540:1\n1#2:541\n*E\n"})
    public final class a extends c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final InterfaceC5100n<kotlin.L0> f220398c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(long j10, @NotNull InterfaceC5100n<? super kotlin.L0> interfaceC5100n) {
            super(j10);
            this.f220398c = interfaceC5100n;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f220398c.l0(AbstractC5093j0.this, kotlin.L0.f217464a);
        }

        @Override // kotlinx.coroutines.AbstractC5093j0.c
        @NotNull
        public String toString() {
            return super.toString() + this.f220398c;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.j0$b */
    public static final class b extends c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final Runnable f220400c;

        public b(long j10, @NotNull Runnable runnable) {
            super(j10);
            this.f220400c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f220400c.run();
        }

        @Override // kotlinx.coroutines.AbstractC5093j0.c
        @NotNull
        public String toString() {
            return super.toString() + this.f220400c;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.j0$c */
    @kotlin.jvm.internal.V({"SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase$DelayedTask\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 4 ThreadSafeHeap.kt\nkotlinx/coroutines/internal/ThreadSafeHeap\n*L\n1#1,540:1\n24#2,4:541\n24#2,4:547\n24#2,4:559\n16#3:545\n16#3:551\n16#3:563\n63#4:546\n64#4,7:552\n*S KotlinDebug\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase$DelayedTask\n*L\n434#1:541,4\n436#1:547,4\n476#1:559,4\n434#1:545\n436#1:551\n476#1:563\n436#1:546\n436#1:552,7\n*E\n"})
    public static abstract class c implements Runnable, Comparable<c>, InterfaceC5058e0, kotlinx.coroutines.internal.b0 {

        @Nullable
        private volatile Object _heap;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dd.g
        public long f220401a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f220402b = -1;

        public c(long j10) {
            this.f220401a = j10;
        }

        @Override // kotlinx.coroutines.internal.b0
        public void a(@Nullable kotlinx.coroutines.internal.a0<?> a0Var) {
            if (this._heap == C5099m0.f220409a) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            this._heap = a0Var;
        }

        @Override // kotlinx.coroutines.internal.b0
        @Nullable
        public kotlinx.coroutines.internal.a0<?> c() {
            Object obj = this._heap;
            if (obj instanceof kotlinx.coroutines.internal.a0) {
                return (kotlinx.coroutines.internal.a0) obj;
            }
            return null;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compareTo(@NotNull c cVar) {
            long j10 = this.f220401a - cVar.f220401a;
            if (j10 > 0) {
                return 1;
            }
            return j10 < 0 ? -1 : 0;
        }

        @Override // kotlinx.coroutines.InterfaceC5058e0
        public final void dispose() {
            synchronized (this) {
                try {
                    Object obj = this._heap;
                    kotlinx.coroutines.internal.Q q10 = C5099m0.f220409a;
                    if (obj == q10) {
                        return;
                    }
                    d dVar = obj instanceof d ? (d) obj : null;
                    if (dVar != null) {
                        dVar.l(this);
                    }
                    this._heap = q10;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final int e(long j10, @NotNull d dVar, @NotNull AbstractC5093j0 abstractC5093j0) {
            synchronized (this) {
                if (this._heap == C5099m0.f220409a) {
                    return 2;
                }
                synchronized (dVar) {
                    try {
                        c cVarE = dVar.e();
                        if (abstractC5093j0.U()) {
                            return 1;
                        }
                        if (cVarE == null) {
                            dVar.f220403c = j10;
                        } else {
                            long j11 = cVarE.f220401a;
                            if (j11 - j10 < 0) {
                                j10 = j11;
                            }
                            if (j10 - dVar.f220403c > 0) {
                                dVar.f220403c = j10;
                            }
                        }
                        long j12 = this.f220401a;
                        long j13 = dVar.f220403c;
                        if (j12 - j13 < 0) {
                            this.f220401a = j13;
                        }
                        dVar.a(this);
                        return 0;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        public final boolean f(long j10) {
            return j10 - this.f220401a >= 0;
        }

        @Override // kotlinx.coroutines.internal.b0
        public int getIndex() {
            return this.f220402b;
        }

        @Override // kotlinx.coroutines.internal.b0
        public void setIndex(int i10) {
            this.f220402b = i10;
        }

        @NotNull
        public String toString() {
            return "Delayed[nanos=" + this.f220401a + ']';
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.j0$d */
    public static final class d extends kotlinx.coroutines.internal.a0<c> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dd.g
        public long f220403c;

        public d(long j10) {
            this.f220403c = j10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean U() {
        return f220397h.get(this) != 0;
    }

    private final /* synthetic */ void p4(Object obj, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, ed.l<Object, kotlin.L0> lVar) {
        while (true) {
            lVar.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void F2(@NotNull kotlin.coroutines.i iVar, @NotNull Runnable runnable) {
        h4(runnable);
    }

    @Override // kotlinx.coroutines.AbstractC5066i0
    public boolean J3() {
        if (!X3()) {
            return false;
        }
        d dVar = (d) f220396g.get(this);
        if (dVar != null && !dVar.i()) {
            return false;
        }
        Object obj = f220395f.get(this);
        if (obj == null) {
            return true;
        }
        return obj instanceof C5091z ? ((C5091z) obj).m() : obj == C5099m0.f220416h;
    }

    @Override // kotlinx.coroutines.U
    public void T0(long j10, @NotNull InterfaceC5100n<? super kotlin.L0> interfaceC5100n) {
        long jD = C5099m0.d(j10);
        if (jD < 4611686018427387903L) {
            AbstractC5051b abstractC5051b = C5053c.f218833a;
            long jB = abstractC5051b != null ? abstractC5051b.b() : System.nanoTime();
            a aVar = new a(jD + jB, interfaceC5100n);
            s4(jB, aVar);
            C5106q.a(interfaceC5100n, aVar);
        }
    }

    @Override // kotlinx.coroutines.AbstractC5066i0
    public long Y3() {
        c cVarM;
        if (Z3()) {
            return 0L;
        }
        d dVar = (d) f220396g.get(this);
        if (dVar != null && !dVar.i()) {
            AbstractC5051b abstractC5051b = C5053c.f218833a;
            long jB = abstractC5051b != null ? abstractC5051b.b() : System.nanoTime();
            do {
                synchronized (dVar) {
                    try {
                        c cVarE = dVar.e();
                        if (cVarE != null) {
                            c cVar = cVarE;
                            cVarM = cVar.f(jB) ? i4(cVar) : false ? dVar.m(0) : null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } while (cVarM != null);
        }
        Runnable runnableG4 = g4();
        if (runnableG4 == null) {
            return q3();
        }
        runnableG4.run();
        return 0L;
    }

    public final void f4() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f220395f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                if (androidx.concurrent.futures.c.a(f220395f, this, null, C5099m0.f220416h)) {
                    return;
                }
            } else if (obj instanceof C5091z) {
                ((C5091z) obj).d();
                return;
            } else {
                if (obj == C5099m0.f220416h) {
                    return;
                }
                C5091z c5091z = new C5091z(8, true);
                c5091z.a((Runnable) obj);
                if (androidx.concurrent.futures.c.a(f220395f, this, obj, c5091z)) {
                    return;
                }
            }
        }
    }

    public final Runnable g4() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f220395f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (obj instanceof C5091z) {
                C5091z c5091z = (C5091z) obj;
                Object objS = c5091z.s();
                if (objS != C5091z.f220383t) {
                    return (Runnable) objS;
                }
                androidx.concurrent.futures.c.a(f220395f, this, obj, c5091z.r());
            } else {
                if (obj == C5099m0.f220416h) {
                    return null;
                }
                if (androidx.concurrent.futures.c.a(f220395f, this, obj, null)) {
                    return (Runnable) obj;
                }
            }
        }
    }

    @NotNull
    public InterfaceC5058e0 h1(long j10, @NotNull Runnable runnable, @NotNull kotlin.coroutines.i iVar) {
        return U.a.b(this, j10, runnable, iVar);
    }

    public void h4(@NotNull Runnable runnable) {
        if (i4(runnable)) {
            d4();
        } else {
            P.f218782i.h4(runnable);
        }
    }

    public final boolean i4(Runnable runnable) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f220395f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (U()) {
                return false;
            }
            if (obj == null) {
                if (androidx.concurrent.futures.c.a(f220395f, this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof C5091z) {
                C5091z c5091z = (C5091z) obj;
                int iA = c5091z.a(runnable);
                if (iA == 0) {
                    return true;
                }
                if (iA == 1) {
                    androidx.concurrent.futures.c.a(f220395f, this, obj, c5091z.r());
                } else if (iA == 2) {
                    return false;
                }
            } else {
                if (obj == C5099m0.f220416h) {
                    return false;
                }
                C5091z c5091z2 = new C5091z(8, true);
                c5091z2.a((Runnable) obj);
                c5091z2.a(runnable);
                if (androidx.concurrent.futures.c.a(f220395f, this, obj, c5091z2)) {
                    return true;
                }
            }
        }
    }

    public final /* synthetic */ Object j4() {
        return this._delayed$volatile;
    }

    public final /* synthetic */ int l4() {
        return this._isCompleted$volatile;
    }

    public final /* synthetic */ Object n4() {
        return this._queue$volatile;
    }

    @Override // kotlinx.coroutines.U
    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    @Nullable
    public Object p2(long j10, @NotNull kotlin.coroutines.e<? super kotlin.L0> eVar) {
        return U.a.a(this, j10, eVar);
    }

    @Override // kotlinx.coroutines.AbstractC5066i0
    public long q3() {
        c cVarJ;
        if (super.q3() == 0) {
            return 0L;
        }
        Object obj = f220395f.get(this);
        if (obj != null) {
            if (!(obj instanceof C5091z)) {
                return obj == C5099m0.f220416h ? Long.MAX_VALUE : 0L;
            }
            if (!((C5091z) obj).m()) {
                return 0L;
            }
        }
        d dVar = (d) f220396g.get(this);
        if (dVar == null || (cVarJ = dVar.j()) == null) {
            return Long.MAX_VALUE;
        }
        long j10 = cVarJ.f220401a;
        AbstractC5051b abstractC5051b = C5053c.f218833a;
        long jB = j10 - (abstractC5051b != null ? abstractC5051b.b() : System.nanoTime());
        if (jB < 0) {
            return 0L;
        }
        return jB;
    }

    public final void q4() {
        c cVarO;
        AbstractC5051b abstractC5051b = C5053c.f218833a;
        long jB = abstractC5051b != null ? abstractC5051b.b() : System.nanoTime();
        while (true) {
            d dVar = (d) f220396g.get(this);
            if (dVar == null || (cVarO = dVar.o()) == null) {
                return;
            } else {
                c4(jB, cVarO);
            }
        }
    }

    public final void r4() {
        f220395f.set(this, null);
        f220396g.set(this, null);
    }

    public final void s4(long j10, @NotNull c cVar) {
        int iT4 = t4(j10, cVar);
        if (iT4 == 0) {
            if (z4(cVar)) {
                d4();
            }
        } else if (iT4 == 1) {
            c4(j10, cVar);
        } else if (iT4 != 2) {
            throw new IllegalStateException("unexpected result");
        }
    }

    @Override // kotlinx.coroutines.AbstractC5066i0
    public void shutdown() {
        b1.f218831a.c();
        v4(true);
        f4();
        while (Y3() <= 0) {
        }
        q4();
    }

    public final int t4(long j10, c cVar) {
        if (U()) {
            return 1;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f220396g;
        d dVar = (d) atomicReferenceFieldUpdater.get(this);
        if (dVar == null) {
            androidx.concurrent.futures.c.a(atomicReferenceFieldUpdater, this, null, new d(j10));
            Object obj = atomicReferenceFieldUpdater.get(this);
            kotlin.jvm.internal.G.m(obj);
            dVar = (d) obj;
        }
        return cVar.e(j10, dVar, this);
    }

    @NotNull
    public final InterfaceC5058e0 u4(long j10, @NotNull Runnable runnable) {
        long jD = C5099m0.d(j10);
        if (jD >= 4611686018427387903L) {
            return M0.f218772a;
        }
        AbstractC5051b abstractC5051b = C5053c.f218833a;
        long jB = abstractC5051b != null ? abstractC5051b.b() : System.nanoTime();
        b bVar = new b(jD + jB, runnable);
        s4(jB, bVar);
        return bVar;
    }

    public final void v4(boolean z10) {
        f220397h.set(this, z10 ? 1 : 0);
    }

    public final /* synthetic */ void w4(Object obj) {
        this._delayed$volatile = obj;
    }

    public final /* synthetic */ void x4(int i10) {
        this._isCompleted$volatile = i10;
    }

    public final /* synthetic */ void y4(Object obj) {
        this._queue$volatile = obj;
    }

    public final boolean z4(c cVar) {
        d dVar = (d) f220396g.get(this);
        return (dVar != null ? dVar.j() : null) == cVar;
    }
}
