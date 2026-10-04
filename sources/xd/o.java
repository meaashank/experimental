package xd;

import com.google.common.util.concurrent.r;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nWorkQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkQueue.kt\nkotlinx/coroutines/scheduling/WorkQueue\n+ 2 Tasks.kt\nkotlinx/coroutines/scheduling/TasksKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 WorkQueue.kt\nkotlinx/coroutines/scheduling/WorkQueueKt\n*L\n1#1,251:1\n89#2:252\n89#2:253\n89#2:254\n89#2:257\n89#2:258\n1#3:255\n21#4:256\n*S KotlinDebug\n*F\n+ 1 WorkQueue.kt\nkotlinx/coroutines/scheduling/WorkQueue\n*L\n91#1:252\n158#1:253\n181#1:254\n201#1:257\n245#1:258\n201#1:256\n*E\n"})
public final class o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f240639b = AtomicReferenceFieldUpdater.newUpdater(o.class, Object.class, "lastScheduledTask$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f240640c = AtomicIntegerFieldUpdater.newUpdater(o.class, "producerIndex$volatile");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f240641d = AtomicIntegerFieldUpdater.newUpdater(o.class, "consumerIndex$volatile");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f240642e = AtomicIntegerFieldUpdater.newUpdater(o.class, "blockingTasksInBuffer$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final AtomicReferenceArray<i> f240643a = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    public static /* synthetic */ i b(o oVar, i iVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return oVar.a(iVar, z10);
    }

    public final i A(int i10, boolean z10) {
        int i11 = i10 & 127;
        i iVar = this.f240643a.get(i11);
        if (iVar != null) {
            if ((iVar.f240625b.h2() == 1) == z10 && r.a(this.f240643a, i11, iVar, null)) {
                if (z10) {
                    f240642e.decrementAndGet(this);
                }
                return iVar;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long B(int i10, @NotNull Ref.ObjectRef<i> objectRef) {
        T tR = i10 == 3 ? r() : z(i10);
        if (tR == 0) {
            return C(i10, objectRef);
        }
        objectRef.f217904a = tR;
        return -1L;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object, xd.i] */
    public final long C(int i10, Ref.ObjectRef<i> objectRef) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        ?? r12;
        do {
            atomicReferenceFieldUpdater = f240639b;
            r12 = (i) atomicReferenceFieldUpdater.get(this);
            if (r12 == 0) {
                return -2L;
            }
            if (((r12.f240625b.h2() != 1 ? 2 : 1) & i10) == 0) {
                return -2L;
            }
            long jA = m.f240633f.a() - r12.f240624a;
            long j10 = m.f240629b;
            if (jA < j10) {
                return j10 - jA;
            }
        } while (!androidx.concurrent.futures.c.a(atomicReferenceFieldUpdater, this, r12, null));
        objectRef.f217904a = r12;
        return -1L;
    }

    @Nullable
    public final i a(@NotNull i iVar, boolean z10) {
        if (z10) {
            return c(iVar);
        }
        i iVar2 = (i) f240639b.getAndSet(this, iVar);
        if (iVar2 == null) {
            return null;
        }
        return c(iVar2);
    }

    public final i c(i iVar) {
        if (g() == 127) {
            return iVar;
        }
        if (iVar.f240625b.h2() == 1) {
            f240642e.incrementAndGet(this);
        }
        int i10 = f240640c.get(this) & 127;
        while (this.f240643a.get(i10) != null) {
            Thread.yield();
        }
        this.f240643a.lazySet(i10, iVar);
        f240640c.incrementAndGet(this);
        return null;
    }

    public final void d(i iVar) {
        if (iVar == null || iVar.f240625b.h2() != 1) {
            return;
        }
        f240642e.decrementAndGet(this);
    }

    public final /* synthetic */ int e() {
        return this.blockingTasksInBuffer$volatile;
    }

    public final int g() {
        return f240640c.get(this) - f240641d.get(this);
    }

    public final /* synthetic */ int h() {
        return this.consumerIndex$volatile;
    }

    public final /* synthetic */ Object j() {
        return this.lastScheduledTask$volatile;
    }

    public final /* synthetic */ int l() {
        return this.producerIndex$volatile;
    }

    public final int n() {
        return f240639b.get(this) != null ? g() + 1 : g();
    }

    public final void o(@NotNull d dVar) {
        i iVar = (i) f240639b.getAndSet(this, null);
        if (iVar != null) {
            dVar.a(iVar);
        }
        while (t(dVar)) {
        }
    }

    @Nullable
    public final i p() {
        i iVar = (i) f240639b.getAndSet(this, null);
        return iVar == null ? r() : iVar;
    }

    @Nullable
    public final i q() {
        return u(true);
    }

    public final i r() {
        i andSet;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f240641d;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 - f240640c.get(this) == 0) {
                return null;
            }
            int i11 = i10 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i10, i10 + 1) && (andSet = this.f240643a.getAndSet(i11, null)) != null) {
                d(andSet);
                return andSet;
            }
        }
    }

    @Nullable
    public final i s() {
        return u(false);
    }

    public final boolean t(d dVar) {
        i iVarR = r();
        if (iVarR == null) {
            return false;
        }
        dVar.a(iVarR);
        return true;
    }

    public final i u(boolean z10) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        i iVar;
        do {
            atomicReferenceFieldUpdater = f240639b;
            iVar = (i) atomicReferenceFieldUpdater.get(this);
            if (iVar != null) {
                if ((iVar.f240625b.h2() == 1) == z10) {
                }
            }
            int i10 = f240641d.get(this);
            int i11 = f240640c.get(this);
            while (i10 != i11 && (!z10 || f240642e.get(this) != 0)) {
                i11--;
                i iVarA = A(i11, z10);
                if (iVarA != null) {
                    return iVarA;
                }
            }
            return null;
        } while (!androidx.concurrent.futures.c.a(atomicReferenceFieldUpdater, this, iVar, null));
        return iVar;
    }

    public final /* synthetic */ void v(int i10) {
        this.blockingTasksInBuffer$volatile = i10;
    }

    public final /* synthetic */ void w(int i10) {
        this.consumerIndex$volatile = i10;
    }

    public final /* synthetic */ void x(Object obj) {
        this.lastScheduledTask$volatile = obj;
    }

    public final /* synthetic */ void y(int i10) {
        this.producerIndex$volatile = i10;
    }

    public final i z(int i10) {
        int i11 = f240641d.get(this);
        int i12 = f240640c.get(this);
        boolean z10 = i10 == 1;
        while (i11 != i12) {
            if (z10 && f240642e.get(this) == 0) {
                return null;
            }
            int i13 = i11 + 1;
            i iVarA = A(i11, z10);
            if (iVarA != null) {
                return iVarA;
            }
            i11 = i13;
        }
        return null;
    }
}
