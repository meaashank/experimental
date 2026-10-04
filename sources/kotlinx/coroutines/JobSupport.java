package kotlinx.coroutines;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C4987s;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC4982o;
import kotlin.coroutines.i;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.Ref;
import kotlin.sequences.C5004q;
import kotlin.sequences.InterfaceC5000m;
import kotlinx.coroutines.InterfaceC5118w0;
import kotlinx.coroutines.internal.C5089x;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.jvm.internal.V({"SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 4 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 Concurrent.kt\nkotlinx/coroutines/internal/ConcurrentKt\n+ 7 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n+ 8 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListHead\n+ 9 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListNode\n+ 10 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,1461:1\n713#1,2:1468\n364#1,2:1477\n366#1,4:1482\n370#1,4:1487\n374#1,2:1494\n364#1,2:1496\n366#1,4:1501\n370#1,4:1506\n374#1,2:1513\n175#1,2:1521\n714#1:1523\n175#1,2:1524\n175#1,2:1540\n175#1,2:1553\n713#1,2:1555\n713#1,2:1557\n175#1,2:1559\n713#1,2:1561\n175#1,2:1563\n175#1,2:1570\n175#1,2:1572\n1#2:1462\n1#2:1486\n1#2:1505\n24#3,4:1463\n24#3,4:1526\n24#3,4:1565\n24#3,4:1574\n16#4:1467\n16#4:1530\n16#4:1569\n16#4:1578\n288#5,2:1470\n288#5,2:1472\n18#6:1474\n159#7:1475\n159#7:1476\n149#7,4:1579\n336#8,3:1479\n339#8,3:1491\n336#8,3:1498\n339#8,3:1510\n336#8,6:1515\n132#9:1531\n70#9,3:1532\n133#9,5:1535\n318#10,11:1542\n*S KotlinDebug\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport\n*L\n247#1:1468,2\n329#1:1477,2\n329#1:1482,4\n329#1:1487,4\n329#1:1494,2\n361#1:1496,2\n361#1:1501,4\n361#1:1506,4\n361#1:1513,2\n378#1:1521,2\n423#1:1523\n468#1:1524,2\n560#1:1540,2\n601#1:1553,2\n628#1:1555,2\n637#1:1557,2\n701#1:1559,2\n730#1:1561,2\n743#1:1563,2\n816#1:1570,2\n838#1:1572,2\n329#1:1486\n361#1:1505\n210#1:1463,4\n485#1:1526,4\n746#1:1565,4\n891#1:1574,4\n210#1:1467\n485#1:1530\n746#1:1569\n891#1:1578\n258#1:1470,2\n262#1:1472,2\n270#1:1474\n276#1:1475\n278#1:1476\n1225#1:1579,4\n329#1:1479,3\n329#1:1491,3\n361#1:1498,3\n361#1:1510,3\n365#1:1515,6\n533#1:1531\n533#1:1532,3\n533#1:1535,5\n566#1:1542,11\n*E\n"})
@InterfaceC4982o(level = DeprecationLevel.ERROR, message = "This is internal API and may be removed in the future releases")
public class JobSupport implements A0, InterfaceC5115v, P0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f218743a = AtomicReferenceFieldUpdater.newUpdater(JobSupport.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f218744b = AtomicReferenceFieldUpdater.newUpdater(JobSupport.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    @kotlin.jvm.internal.V({"SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport$AwaitContinuation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1461:1\n1#2:1462\n*E\n"})
    public static final class a<T> extends C5102o<T> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public final JobSupport f218745i;

        public a(@NotNull kotlin.coroutines.e<? super T> eVar, @NotNull JobSupport jobSupport) {
            super(eVar, 1);
            this.f218745i = jobSupport;
        }

        @Override // kotlinx.coroutines.C5102o
        @NotNull
        public String Q() {
            return "AwaitContinuation";
        }

        @Override // kotlinx.coroutines.C5102o
        @NotNull
        public Throwable w(@NotNull A0 a02) {
            Throwable thD;
            Object objH0 = this.f218745i.H0();
            return (!(objH0 instanceof c) || (thD = ((c) objH0).d()) == null) ? objH0 instanceof B ? ((B) objH0).f218701a : a02.f1() : thD;
        }
    }

    public static final class b extends F0 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final JobSupport f218746e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final c f218747f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public final C5113u f218748g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Nullable
        public final Object f218749h;

        public b(@NotNull JobSupport jobSupport, @NotNull c cVar, @NotNull C5113u c5113u, @Nullable Object obj) {
            this.f218746e = jobSupport;
            this.f218747f = cVar;
            this.f218748g = c5113u;
            this.f218749h = obj;
        }

        @Override // kotlinx.coroutines.InterfaceC5118w0
        public void a(@Nullable Throwable th) {
            this.f218746e.m0(this.f218747f, this.f218748g, this.f218749h);
        }
    }

    @kotlin.jvm.internal.V({"SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport$Finishing\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1461:1\n1#2:1462\n*E\n"})
    public static final class c implements InterfaceC5114u0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f218750b = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isCompleting$volatile");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f218751c = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_rootCause$volatile");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f218752d = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_exceptionsHolder$volatile");
        private volatile /* synthetic */ Object _exceptionsHolder$volatile;
        private volatile /* synthetic */ int _isCompleting$volatile;
        private volatile /* synthetic */ Object _rootCause$volatile;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final K0 f218753a;

        public c(@NotNull K0 k02, boolean z10, @Nullable Throwable th) {
            this.f218753a = k02;
            this._isCompleting$volatile = z10 ? 1 : 0;
            this._rootCause$volatile = th;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(@NotNull Throwable th) {
            Throwable thD = d();
            if (thD == null) {
                q(th);
                return;
            }
            if (th == thD) {
                return;
            }
            Object obj = f218752d.get(this);
            if (obj == null) {
                p(th);
                return;
            }
            if (!(obj instanceof Throwable)) {
                if (obj instanceof ArrayList) {
                    ((ArrayList) obj).add(th);
                    return;
                } else {
                    throw new IllegalStateException(("State is " + obj).toString());
                }
            }
            if (th == obj) {
                return;
            }
            ArrayList<Throwable> arrayListB = b();
            arrayListB.add(obj);
            arrayListB.add(th);
            p(arrayListB);
        }

        public final ArrayList<Throwable> b() {
            return new ArrayList<>(4);
        }

        public final Object c() {
            return f218752d.get(this);
        }

        @Nullable
        public final Throwable d() {
            return (Throwable) f218751c.get(this);
        }

        public final /* synthetic */ Object e() {
            return this._exceptionsHolder$volatile;
        }

        public final /* synthetic */ int g() {
            return this._isCompleting$volatile;
        }

        @Override // kotlinx.coroutines.InterfaceC5114u0
        @NotNull
        public K0 getList() {
            return this.f218753a;
        }

        public final /* synthetic */ Object i() {
            return this._rootCause$volatile;
        }

        @Override // kotlinx.coroutines.InterfaceC5114u0
        public boolean isActive() {
            return d() == null;
        }

        public final boolean k() {
            return d() != null;
        }

        public final boolean l() {
            return f218750b.get(this) != 0;
        }

        public final boolean m() {
            return f218752d.get(this) == G0.f218725h;
        }

        @NotNull
        public final List<Throwable> n(@Nullable Throwable th) {
            ArrayList arrayListB;
            Object obj = f218752d.get(this);
            if (obj == null) {
                arrayListB = b();
            } else if (obj instanceof Throwable) {
                ArrayList arrayListB2 = b();
                arrayListB2.add(obj);
                arrayListB = arrayListB2;
            } else {
                if (!(obj instanceof ArrayList)) {
                    throw new IllegalStateException(("State is " + obj).toString());
                }
                arrayListB = (ArrayList) obj;
            }
            Throwable thD = d();
            if (thD != null) {
                arrayListB.add(0, thD);
            }
            if (th != null && !th.equals(thD)) {
                arrayListB.add(th);
            }
            p(G0.f218725h);
            return arrayListB;
        }

        public final void o(boolean z10) {
            f218750b.set(this, z10 ? 1 : 0);
        }

        public final void p(Object obj) {
            f218752d.set(this, obj);
        }

        public final void q(@Nullable Throwable th) {
            f218751c.set(this, th);
        }

        public final /* synthetic */ void r(Object obj) {
            this._exceptionsHolder$volatile = obj;
        }

        public final /* synthetic */ void s(int i10) {
            this._isCompleting$volatile = i10;
        }

        public final /* synthetic */ void t(Object obj) {
            this._rootCause$volatile = obj;
        }

        @NotNull
        public String toString() {
            return "Finishing[cancelling=" + k() + ", completing=" + l() + ", rootCause=" + d() + ", exceptions=" + f218752d.get(this) + ", list=" + this.f218753a + ']';
        }
    }

    public final class d extends F0 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final kotlinx.coroutines.selects.j<?> f218759e;

        public d(@NotNull kotlinx.coroutines.selects.j<?> jVar) {
            this.f218759e = jVar;
        }

        @Override // kotlinx.coroutines.InterfaceC5118w0
        public void a(@Nullable Throwable th) {
            Object objH0 = JobSupport.this.H0();
            if (!(objH0 instanceof B)) {
                objH0 = G0.h(objH0);
            }
            this.f218759e.j(JobSupport.this, objH0);
        }
    }

    public final class e extends F0 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final kotlinx.coroutines.selects.j<?> f218761e;

        public e(@NotNull kotlinx.coroutines.selects.j<?> jVar) {
            this.f218761e = jVar;
        }

        @Override // kotlinx.coroutines.InterfaceC5118w0
        public void a(@Nullable Throwable th) {
            this.f218761e.j(JobSupport.this, kotlin.L0.f217464a);
        }
    }

    @kotlin.jvm.internal.V({"SMAP\nLockFreeLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListNode$makeCondAddOp$1\n+ 2 JobSupport.kt\nkotlinx/coroutines/JobSupport\n*L\n1#1,351:1\n533#2:352\n*E\n"})
    public static final class f extends LockFreeLinkedListNode.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ JobSupport f218763d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Object f218764e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(LockFreeLinkedListNode lockFreeLinkedListNode, JobSupport jobSupport, Object obj) {
            super(lockFreeLinkedListNode);
            this.f218763d = jobSupport;
            this.f218764e = obj;
        }

        @Override // kotlinx.coroutines.internal.AbstractC5068b
        @Nullable
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public Object g(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode) {
            if (this.f218763d.H0() == this.f218764e) {
                return null;
            }
            return C5089x.f220366d;
        }
    }

    public JobSupport(boolean z10) {
        this._state$volatile = z10 ? G0.f218727j : G0.f218726i;
    }

    public static /* synthetic */ void B0() {
    }

    public static /* synthetic */ CancellationException D1(JobSupport jobSupport, Throwable th, String str, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
        }
        if ((i10 & 1) != 0) {
            str = null;
        }
        return jobSupport.A1(th, str);
    }

    public static /* synthetic */ void E0() {
    }

    private final /* synthetic */ Object I0() {
        return this._parentHandle$volatile;
    }

    private final /* synthetic */ Object K0() {
        return this._state$volatile;
    }

    public static final /* synthetic */ Object M(JobSupport jobSupport, Object obj, Object obj2) throws Throwable {
        jobSupport.m1(obj, obj2);
        return obj2;
    }

    private final /* synthetic */ void a1(Object obj, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, ed.l<Object, kotlin.L0> lVar) {
        while (true) {
            lVar.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    public static /* synthetic */ JobCancellationException q0(JobSupport jobSupport, String str, Throwable th, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: defaultCancellationException");
        }
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            th = null;
        }
        if (str == null) {
            str = jobSupport.f0();
        }
        return new JobCancellationException(str, th, jobSupport);
    }

    private final /* synthetic */ void w1(Object obj) {
        this._parentHandle$volatile = obj;
    }

    private final /* synthetic */ void x1(Object obj) {
        this._state$volatile = obj;
    }

    @NotNull
    public final kotlinx.coroutines.selects.e<?> A0() {
        JobSupport$onAwaitInternal$1 jobSupport$onAwaitInternal$1 = JobSupport$onAwaitInternal$1.f218765a;
        kotlin.jvm.internal.G.n(jobSupport$onAwaitInternal$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        kotlin.jvm.internal.Y.q(jobSupport$onAwaitInternal$1, 3);
        JobSupport$onAwaitInternal$2 jobSupport$onAwaitInternal$2 = JobSupport$onAwaitInternal$2.f218766a;
        kotlin.jvm.internal.G.n(jobSupport$onAwaitInternal$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        kotlin.jvm.internal.Y.q(jobSupport$onAwaitInternal$2, 3);
        return new kotlinx.coroutines.selects.f(this, jobSupport$onAwaitInternal$1, jobSupport$onAwaitInternal$2, null, 8, null);
    }

    @NotNull
    public final CancellationException A1(@NotNull Throwable th, @Nullable String str) {
        CancellationException jobCancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (jobCancellationException == null) {
            if (str == null) {
                str = f0();
            }
            jobCancellationException = new JobCancellationException(str, th, this);
        }
        return jobCancellationException;
    }

    @Override // kotlinx.coroutines.A0
    @NotNull
    public final kotlinx.coroutines.selects.c C0() {
        JobSupport$onJoin$1 jobSupport$onJoin$1 = JobSupport$onJoin$1.f218767a;
        kotlin.jvm.internal.G.n(jobSupport$onJoin$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        kotlin.jvm.internal.Y.q(jobSupport$onJoin$1, 3);
        return new kotlinx.coroutines.selects.d(this, jobSupport$onJoin$1, null, 4, null);
    }

    @Override // kotlinx.coroutines.A0
    @NotNull
    public final InterfaceC5058e0 C1(boolean z10, boolean z11, @NotNull ed.l<? super Throwable, kotlin.L0> lVar) {
        return T0(z10, z11, new InterfaceC5118w0.a(lVar));
    }

    public boolean D0() {
        return this instanceof C5119x;
    }

    @InterfaceC5120x0
    @NotNull
    public final String E1() {
        return h1() + '{' + z1(H0()) + '}';
    }

    public final K0 F0(InterfaceC5114u0 interfaceC5114u0) {
        K0 list = interfaceC5114u0.getList();
        if (list != null) {
            return list;
        }
        if (interfaceC5114u0 instanceof C5064h0) {
            return new K0();
        }
        if (interfaceC5114u0 instanceof F0) {
            s1((F0) interfaceC5114u0);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + interfaceC5114u0).toString());
    }

    public final boolean F1(InterfaceC5114u0 interfaceC5114u0, Object obj) throws Throwable {
        if (!androidx.concurrent.futures.c.a(f218743a, this, interfaceC5114u0, G0.g(obj))) {
            return false;
        }
        o1(null);
        p1(obj);
        j0(interfaceC5114u0, obj);
        return true;
    }

    @Nullable
    public final InterfaceC5111t G0() {
        return (InterfaceC5111t) f218744b.get(this);
    }

    @Nullable
    public final Object H0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f218743a;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof kotlinx.coroutines.internal.I)) {
                return obj;
            }
            ((kotlinx.coroutines.internal.I) obj).b(this);
        }
    }

    public final boolean H1(InterfaceC5114u0 interfaceC5114u0, Throwable th) throws Throwable {
        K0 k0F0 = F0(interfaceC5114u0);
        if (k0F0 == null) {
            return false;
        }
        if (!androidx.concurrent.futures.c.a(f218743a, this, interfaceC5114u0, new c(k0F0, false, th))) {
            return false;
        }
        j1(k0F0, th);
        return true;
    }

    public final Object I1(Object obj, Object obj2) throws Throwable {
        return !(obj instanceof InterfaceC5114u0) ? G0.f218718a : ((!(obj instanceof C5064h0) && !(obj instanceof F0)) || (obj instanceof C5113u) || (obj2 instanceof B)) ? J1((InterfaceC5114u0) obj, obj2) : F1((InterfaceC5114u0) obj, obj2) ? obj2 : G0.f218720c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public final Object J1(InterfaceC5114u0 interfaceC5114u0, Object obj) throws Throwable {
        K0 k0F0 = F0(interfaceC5114u0);
        if (k0F0 == null) {
            return G0.f218720c;
        }
        c cVar = interfaceC5114u0 instanceof c ? (c) interfaceC5114u0 : null;
        if (cVar == null) {
            cVar = new c(k0F0, false, null);
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        synchronized (cVar) {
            if (cVar.l()) {
                return G0.f218718a;
            }
            cVar.o(true);
            if (cVar != interfaceC5114u0 && !androidx.concurrent.futures.c.a(f218743a, this, interfaceC5114u0, cVar)) {
                return G0.f218720c;
            }
            boolean zK = cVar.k();
            B b10 = obj instanceof B ? (B) obj : null;
            if (b10 != null) {
                cVar.a(b10.f218701a);
            }
            ?? D10 = zK ? 0 : cVar.d();
            objectRef.f217904a = D10;
            if (D10 != 0) {
                j1(k0F0, D10);
            }
            C5113u c5113uT0 = t0(interfaceC5114u0);
            return (c5113uT0 == null || !K1(cVar, c5113uT0, obj)) ? s0(cVar, obj) : G0.f218719b;
        }
    }

    public final boolean K1(c cVar, C5113u c5113u, Object obj) {
        while (JobKt__JobKt.B(c5113u.f220805e, false, false, new b(this, cVar, c5113u, obj), 1, null) == M0.f218772a) {
            c5113u = i1(c5113u);
            if (c5113u == null) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlinx.coroutines.A0
    @NotNull
    public final InterfaceC5111t N0(@NotNull InterfaceC5115v interfaceC5115v) {
        InterfaceC5058e0 interfaceC5058e0B = JobKt__JobKt.B(this, true, false, new C5113u(interfaceC5115v), 2, null);
        kotlin.jvm.internal.G.n(interfaceC5058e0B, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (InterfaceC5111t) interfaceC5058e0B;
    }

    @Override // kotlinx.coroutines.P0
    @NotNull
    public CancellationException N1() {
        Throwable thD;
        Object objH0 = H0();
        if (objH0 instanceof c) {
            thD = ((c) objH0).d();
        } else if (objH0 instanceof B) {
            thD = ((B) objH0).f218701a;
        } else {
            if (objH0 instanceof InterfaceC5114u0) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + objH0).toString());
            }
            thD = null;
        }
        CancellationException cancellationException = thD instanceof CancellationException ? (CancellationException) thD : null;
        return cancellationException == null ? new JobCancellationException("Parent job is ".concat(z1(objH0)), thD, this) : cancellationException;
    }

    public boolean P0(@NotNull Throwable th) {
        return false;
    }

    public final boolean Q(Object obj, K0 k02, F0 f02) {
        int iE;
        f fVar = new f(f02, this, obj);
        do {
            iE = k02.n().E(f02, k02, fVar);
            if (iE == 1) {
                return true;
            }
        } while (iE != 2);
        return false;
    }

    @Override // kotlinx.coroutines.A0
    @NotNull
    public final InterfaceC5000m<A0> Q0() {
        return C5004q.b(new JobSupport$children$1(this, null));
    }

    public final void R(Throwable th, List<? extends Throwable> list) throws IllegalAccessException, InvocationTargetException {
        if (list.size() <= 1) {
            return;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        for (Throwable th2 : list) {
            if (th2 != th && th2 != th && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                C4987s.a(th, th2);
            }
        }
    }

    public void S(@Nullable Object obj) {
    }

    public final void S0(@Nullable A0 a02) {
        if (a02 == null) {
            v1(M0.f218772a);
            return;
        }
        a02.start();
        InterfaceC5111t interfaceC5111tN0 = a02.N0(this);
        v1(interfaceC5111tN0);
        if (U()) {
            interfaceC5111tN0.dispose();
            v1(M0.f218772a);
        }
    }

    @Nullable
    public final Object T(@NotNull kotlin.coroutines.e<Object> eVar) {
        Object objH0;
        do {
            objH0 = H0();
            if (!(objH0 instanceof InterfaceC5114u0)) {
                if (objH0 instanceof B) {
                    throw ((B) objH0).f218701a;
                }
                return G0.h(objH0);
            }
        } while (y1(objH0) < 0);
        return V(eVar);
    }

    @NotNull
    public final InterfaceC5058e0 T0(boolean z10, boolean z11, @NotNull InterfaceC5118w0 interfaceC5118w0) {
        F0 f0G1 = g1(interfaceC5118w0, z10);
        while (true) {
            Object objH0 = H0();
            if (objH0 instanceof C5064h0) {
                C5064h0 c5064h0 = (C5064h0) objH0;
                if (!c5064h0.f220263a) {
                    r1(c5064h0);
                } else if (androidx.concurrent.futures.c.a(f218743a, this, objH0, f0G1)) {
                    break;
                }
            } else {
                if (!(objH0 instanceof InterfaceC5114u0)) {
                    if (z11) {
                        B b10 = objH0 instanceof B ? (B) objH0 : null;
                        interfaceC5118w0.a(b10 != null ? b10.f218701a : null);
                    }
                    return M0.f218772a;
                }
                K0 list = ((InterfaceC5114u0) objH0).getList();
                if (list == null) {
                    kotlin.jvm.internal.G.n(objH0, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    s1((F0) objH0);
                } else {
                    InterfaceC5058e0 interfaceC5058e0 = M0.f218772a;
                    if (z10 && (objH0 instanceof c)) {
                        synchronized (objH0) {
                            try {
                                thD = ((c) objH0).d();
                                if (thD == null || ((interfaceC5118w0 instanceof C5113u) && !((c) objH0).l())) {
                                    if (Q(objH0, list, f0G1)) {
                                        if (thD == null) {
                                            return f0G1;
                                        }
                                        interfaceC5058e0 = f0G1;
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    if (thD != null) {
                        if (z11) {
                            interfaceC5118w0.a(thD);
                        }
                        return interfaceC5058e0;
                    }
                    if (Q(objH0, list, f0G1)) {
                        break;
                    }
                }
            }
        }
        return f0G1;
    }

    @Override // kotlinx.coroutines.A0
    public final boolean U() {
        return !(H0() instanceof InterfaceC5114u0);
    }

    public final boolean U0(InterfaceC5114u0 interfaceC5114u0) {
        return (interfaceC5114u0 instanceof c) && ((c) interfaceC5114u0).k();
    }

    public final Object V(kotlin.coroutines.e<Object> eVar) {
        a aVar = new a(IntrinsicsKt__IntrinsicsJvmKt.e(eVar), this);
        aVar.n0();
        C5106q.a(aVar, JobKt__JobKt.B(this, false, false, new Q0(aVar), 3, null));
        Object objZ = aVar.z();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objZ;
    }

    public final boolean V0() {
        return H0() instanceof B;
    }

    @Override // kotlinx.coroutines.A0
    @NotNull
    public final InterfaceC5058e0 V1(@NotNull ed.l<? super Throwable, kotlin.L0> lVar) {
        return T0(false, true, new InterfaceC5118w0.a(lVar));
    }

    public final boolean W(@Nullable Throwable th) {
        return Y(th);
    }

    public boolean W0() {
        return this instanceof C5059f;
    }

    @Nullable
    public final Throwable X0() {
        Object objH0 = H0();
        if (objH0 instanceof InterfaceC5114u0) {
            throw new IllegalStateException("This job has not completed yet");
        }
        return x0(objH0);
    }

    public final boolean Y(@Nullable Object obj) throws Throwable {
        Object objC1;
        kotlinx.coroutines.internal.Q q10 = G0.f218718a;
        if (D0()) {
            objC1 = b0(obj);
            if (objC1 != G0.f218719b) {
            }
            return true;
        }
        objC1 = q10;
        if (objC1 == q10) {
            objC1 = c1(obj);
        }
        if (objC1 != q10 && objC1 != G0.f218719b) {
            if (objC1 == G0.f218721d) {
                return false;
            }
            S(objC1);
            return true;
        }
        return true;
    }

    public final boolean Y0() {
        Object objH0;
        do {
            objH0 = H0();
            if (!(objH0 instanceof InterfaceC5114u0)) {
                return false;
            }
        } while (y1(objH0) < 0);
        return true;
    }

    public void Z(@NotNull Throwable th) throws Throwable {
        Y(th);
    }

    public final Object Z0(kotlin.coroutines.e<? super kotlin.L0> eVar) {
        C5102o c5102o = new C5102o(IntrinsicsKt__IntrinsicsJvmKt.e(eVar), 1);
        c5102o.n0();
        C5106q.a(c5102o, JobKt__JobKt.B(this, false, false, new R0(c5102o), 3, null));
        Object objZ = c5102o.z();
        return objZ == CoroutineSingletons.COROUTINE_SUSPENDED ? objZ : kotlin.L0.f217464a;
    }

    @Override // kotlinx.coroutines.A0
    public void a(@Nullable CancellationException cancellationException) throws Throwable {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(f0(), null, this);
        }
        Z(cancellationException);
    }

    public final Object b0(Object obj) throws Throwable {
        Object objI1;
        do {
            Object objH0 = H0();
            if (!(objH0 instanceof InterfaceC5114u0) || ((objH0 instanceof c) && ((c) objH0).l())) {
                return G0.f218718a;
            }
            objI1 = I1(objH0, new B(o0(obj), false, 2, null));
        } while (objI1 == G0.f218720c);
        return objI1;
    }

    public final Void b1(ed.l<Object, kotlin.L0> lVar) {
        while (true) {
            lVar.invoke(H0());
        }
    }

    public final Object c1(Object obj) throws Throwable {
        Throwable thO0 = null;
        while (true) {
            Object objH0 = H0();
            if (objH0 instanceof c) {
                synchronized (objH0) {
                    if (((c) objH0).m()) {
                        return G0.f218721d;
                    }
                    boolean zK = ((c) objH0).k();
                    if (obj != null || !zK) {
                        if (thO0 == null) {
                            thO0 = o0(obj);
                        }
                        ((c) objH0).a(thO0);
                    }
                    Throwable thD = zK ? null : ((c) objH0).d();
                    if (thD != null) {
                        j1(((c) objH0).f218753a, thD);
                    }
                    return G0.f218718a;
                }
            }
            if (!(objH0 instanceof InterfaceC5114u0)) {
                return G0.f218721d;
            }
            if (thO0 == null) {
                thO0 = o0(obj);
            }
            InterfaceC5114u0 interfaceC5114u0 = (InterfaceC5114u0) objH0;
            if (!interfaceC5114u0.isActive()) {
                Object objI1 = I1(objH0, new B(thO0, false, 2, null));
                if (objI1 == G0.f218718a) {
                    throw new IllegalStateException(("Cannot happen in " + objH0).toString());
                }
                if (objI1 != G0.f218720c) {
                    return objI1;
                }
            } else if (H1(interfaceC5114u0, thO0)) {
                return G0.f218718a;
            }
        }
    }

    @Override // kotlinx.coroutines.A0
    @Nullable
    public final Object c2(@NotNull kotlin.coroutines.e<? super kotlin.L0> eVar) {
        if (Y0()) {
            Object objZ0 = Z0(eVar);
            return objZ0 == CoroutineSingletons.COROUTINE_SUSPENDED ? objZ0 : kotlin.L0.f217464a;
        }
        JobKt__JobKt.x(eVar.getContext());
        return kotlin.L0.f217464a;
    }

    @Override // kotlinx.coroutines.A0
    @InterfaceC4982o(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void cancel() {
        a(null);
    }

    public final boolean d1(@Nullable Object obj) throws Throwable {
        Object objI1;
        do {
            objI1 = I1(H0(), obj);
            if (objI1 == G0.f218718a) {
                return false;
            }
            if (objI1 == G0.f218719b) {
                return true;
            }
        } while (objI1 == G0.f218720c);
        S(objI1);
        return true;
    }

    public final boolean e0(Throwable th) {
        if (!W0()) {
            boolean z10 = th instanceof CancellationException;
            InterfaceC5111t interfaceC5111tG0 = G0();
            return (interfaceC5111tG0 == null || interfaceC5111tG0 == M0.f218772a) ? z10 : interfaceC5111tG0.b(th) || z10;
        }
        return true;
    }

    @Nullable
    public final Object e1(@Nullable Object obj) {
        Object objI1;
        do {
            objI1 = I1(H0(), obj);
            if (objI1 == G0.f218718a) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, x0(obj));
            }
        } while (objI1 == G0.f218720c);
        return objI1;
    }

    @Override // kotlinx.coroutines.InterfaceC5115v
    public final void f(@NotNull P0 p02) throws Throwable {
        Y(p02);
    }

    @NotNull
    public String f0() {
        return "Job was cancelled";
    }

    @Override // kotlinx.coroutines.A0
    @NotNull
    public final CancellationException f1() {
        Object objH0 = H0();
        if (!(objH0 instanceof c)) {
            if (!(objH0 instanceof InterfaceC5114u0)) {
                return objH0 instanceof B ? D1(this, ((B) objH0).f218701a, null, 1, null) : new JobCancellationException(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        Throwable thD = ((c) objH0).d();
        if (thD != null) {
            return A1(thD, getClass().getSimpleName().concat(" is cancelling"));
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    @Override // kotlin.coroutines.i.b, kotlin.coroutines.i
    public <R> R fold(R r10, @NotNull ed.p<? super R, ? super i.b, ? extends R> pVar) {
        return (R) i.b.a.a(this, r10, pVar);
    }

    @Override // kotlinx.coroutines.A0
    @InterfaceC4982o(level = DeprecationLevel.HIDDEN, message = "Added since 1.2.0 for binary compatibility with versions <= 1.1.x")
    public /* synthetic */ boolean g(Throwable th) throws Throwable {
        Z(th != null ? D1(this, th, null, 1, null) : new JobCancellationException(f0(), null, this));
        return true;
    }

    public final F0 g1(InterfaceC5118w0 interfaceC5118w0, boolean z10) {
        F0 c5124z0;
        if (z10) {
            c5124z0 = interfaceC5118w0 instanceof B0 ? (B0) interfaceC5118w0 : null;
            if (c5124z0 == null) {
                c5124z0 = new C5122y0(interfaceC5118w0);
            }
        } else {
            c5124z0 = interfaceC5118w0 instanceof F0 ? (F0) interfaceC5118w0 : null;
            if (c5124z0 == null) {
                c5124z0 = new C5124z0(interfaceC5118w0);
            }
        }
        c5124z0.f218717d = this;
        return c5124z0;
    }

    @Override // kotlin.coroutines.i.b, kotlin.coroutines.i
    @Nullable
    public <E extends i.b> E get(@NotNull i.c<E> cVar) {
        return (E) i.b.a.b(this, cVar);
    }

    @Override // kotlin.coroutines.i.b
    @NotNull
    public final i.c<?> getKey() {
        return A0.f218690A3;
    }

    @Override // kotlinx.coroutines.A0
    @Nullable
    public A0 getParent() {
        InterfaceC5111t interfaceC5111tG0 = G0();
        if (interfaceC5111tG0 != null) {
            return interfaceC5111tG0.getParent();
        }
        return null;
    }

    @NotNull
    public String h1() {
        return getClass().getSimpleName();
    }

    public boolean i0(@NotNull Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return Y(th) && z0();
    }

    public final C5113u i1(LockFreeLinkedListNode lockFreeLinkedListNode) {
        while (lockFreeLinkedListNode.u()) {
            lockFreeLinkedListNode = lockFreeLinkedListNode.n();
        }
        while (true) {
            lockFreeLinkedListNode = lockFreeLinkedListNode.m();
            if (!lockFreeLinkedListNode.u()) {
                if (lockFreeLinkedListNode instanceof C5113u) {
                    return (C5113u) lockFreeLinkedListNode;
                }
                if (lockFreeLinkedListNode instanceof K0) {
                    return null;
                }
            }
        }
    }

    @Override // kotlinx.coroutines.A0
    public boolean isActive() {
        Object objH0 = H0();
        return (objH0 instanceof InterfaceC5114u0) && ((InterfaceC5114u0) objH0).isActive();
    }

    @Override // kotlinx.coroutines.A0
    public final boolean isCancelled() {
        Object objH0 = H0();
        if (objH0 instanceof B) {
            return true;
        }
        return (objH0 instanceof c) && ((c) objH0).k();
    }

    public final void j0(InterfaceC5114u0 interfaceC5114u0, Object obj) throws Throwable {
        InterfaceC5111t interfaceC5111tG0 = G0();
        if (interfaceC5111tG0 != null) {
            interfaceC5111tG0.dispose();
            v1(M0.f218772a);
        }
        B b10 = obj instanceof B ? (B) obj : null;
        Throwable th = b10 != null ? b10.f218701a : null;
        if (!(interfaceC5114u0 instanceof F0)) {
            K0 list = interfaceC5114u0.getList();
            if (list != null) {
                k1(list, th);
                return;
            }
            return;
        }
        try {
            ((F0) interfaceC5114u0).a(th);
        } catch (Throwable th2) {
            R0(new CompletionHandlerException("Exception in completion handler " + interfaceC5114u0 + " for " + this, th2));
        }
    }

    public final void j1(K0 k02, Throwable th) throws Throwable {
        o1(th);
        Object objL = k02.l();
        kotlin.jvm.internal.G.n(objL, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        CompletionHandlerException completionHandlerException = null;
        for (LockFreeLinkedListNode lockFreeLinkedListNodeM = (LockFreeLinkedListNode) objL; !lockFreeLinkedListNodeM.equals(k02); lockFreeLinkedListNodeM = lockFreeLinkedListNodeM.m()) {
            if (lockFreeLinkedListNodeM instanceof B0) {
                F0 f02 = (F0) lockFreeLinkedListNodeM;
                try {
                    f02.a(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        C4987s.a(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + f02 + " for " + this, th2);
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            R0(completionHandlerException);
        }
        e0(th);
    }

    public final void k1(K0 k02, Throwable th) throws Throwable {
        Object objL = k02.l();
        kotlin.jvm.internal.G.n(objL, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        CompletionHandlerException completionHandlerException = null;
        for (LockFreeLinkedListNode lockFreeLinkedListNodeM = (LockFreeLinkedListNode) objL; !lockFreeLinkedListNodeM.equals(k02); lockFreeLinkedListNodeM = lockFreeLinkedListNodeM.m()) {
            if (lockFreeLinkedListNodeM instanceof F0) {
                F0 f02 = (F0) lockFreeLinkedListNodeM;
                try {
                    f02.a(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        C4987s.a(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + f02 + " for " + this, th2);
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            R0(completionHandlerException);
        }
    }

    public final <T extends F0> void l1(K0 k02, Throwable th) {
        Object objL = k02.l();
        kotlin.jvm.internal.G.n(objL, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        if (((LockFreeLinkedListNode) objL).equals(k02)) {
            return;
        }
        kotlin.jvm.internal.G.P();
        throw null;
    }

    public final void m0(c cVar, C5113u c5113u, Object obj) {
        C5113u c5113uI1 = i1(c5113u);
        if (c5113uI1 == null || !K1(cVar, c5113uI1, obj)) {
            S(s0(cVar, obj));
        }
    }

    public final Object m1(Object obj, Object obj2) throws Throwable {
        if (obj2 instanceof B) {
            throw ((B) obj2).f218701a;
        }
        return obj2;
    }

    @Override // kotlin.coroutines.i.b, kotlin.coroutines.i
    @NotNull
    public kotlin.coroutines.i minusKey(@NotNull i.c<?> cVar) {
        return i.b.a.c(this, cVar);
    }

    public final void n1(kotlinx.coroutines.selects.j<?> jVar, Object obj) {
        Object objH0;
        do {
            objH0 = H0();
            if (!(objH0 instanceof InterfaceC5114u0)) {
                if (!(objH0 instanceof B)) {
                    objH0 = G0.h(objH0);
                }
                jVar.f(objH0);
                return;
            }
        } while (y1(objH0) < 0);
        jVar.g(JobKt__JobKt.B(this, false, false, new d(jVar), 3, null));
    }

    public final Throwable o0(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new JobCancellationException(f0(), null, this) : th;
        }
        kotlin.jvm.internal.G.n(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((P0) obj).N1();
    }

    public void o1(@Nullable Throwable th) {
    }

    @NotNull
    public final JobCancellationException p0(@Nullable String str, @Nullable Throwable th) {
        if (str == null) {
            str = f0();
        }
        return new JobCancellationException(str, th, this);
    }

    public void p1(@Nullable Object obj) {
    }

    @Override // kotlin.coroutines.i
    @NotNull
    public kotlin.coroutines.i plus(@NotNull kotlin.coroutines.i iVar) {
        return i.b.a.d(this, iVar);
    }

    @Override // kotlinx.coroutines.A0
    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    @NotNull
    public A0 q(@NotNull A0 a02) {
        return a02;
    }

    public void q1() {
    }

    public final void r1(C5064h0 c5064h0) {
        K0 k02 = new K0();
        Object c5112t0 = k02;
        if (!c5064h0.f220263a) {
            c5112t0 = new C5112t0(k02);
        }
        androidx.concurrent.futures.c.a(f218743a, this, c5064h0, c5112t0);
    }

    public final Object s0(c cVar, Object obj) throws Throwable {
        boolean zK;
        Throwable thY0;
        B b10 = obj instanceof B ? (B) obj : null;
        Throwable th = b10 != null ? b10.f218701a : null;
        synchronized (cVar) {
            zK = cVar.k();
            List<Throwable> listN = cVar.n(th);
            thY0 = y0(cVar, listN);
            if (thY0 != null) {
                R(thY0, listN);
            }
        }
        if (thY0 != null && thY0 != th) {
            obj = new B(thY0, false, 2, null);
        }
        if (thY0 != null && (e0(thY0) || P0(thY0))) {
            kotlin.jvm.internal.G.n(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            ((B) obj).d();
        }
        if (!zK) {
            o1(thY0);
        }
        p1(obj);
        androidx.concurrent.futures.c.a(f218743a, this, cVar, G0.g(obj));
        j0(cVar, obj);
        return obj;
    }

    public final void s1(F0 f02) {
        f02.h(new K0());
        androidx.concurrent.futures.c.a(f218743a, this, f02, f02.m());
    }

    @Override // kotlinx.coroutines.A0
    public final boolean start() {
        int iY1;
        do {
            iY1 = y1(H0());
            if (iY1 == 0) {
                return false;
            }
        } while (iY1 != 1);
        return true;
    }

    public final C5113u t0(InterfaceC5114u0 interfaceC5114u0) {
        C5113u c5113u = interfaceC5114u0 instanceof C5113u ? (C5113u) interfaceC5114u0 : null;
        if (c5113u != null) {
            return c5113u;
        }
        K0 list = interfaceC5114u0.getList();
        if (list != null) {
            return i1(list);
        }
        return null;
    }

    public final void t1(kotlinx.coroutines.selects.j<?> jVar, Object obj) {
        if (Y0()) {
            jVar.g(JobKt__JobKt.B(this, false, false, new e(jVar), 3, null));
        } else {
            jVar.f(kotlin.L0.f217464a);
        }
    }

    @NotNull
    public String toString() {
        return E1() + '@' + O.b(this);
    }

    @Nullable
    public final Object u0() throws Throwable {
        Object objH0 = H0();
        if (objH0 instanceof InterfaceC5114u0) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (objH0 instanceof B) {
            throw ((B) objH0).f218701a;
        }
        return G0.h(objH0);
    }

    public final void u1(@NotNull F0 f02) {
        Object objH0;
        do {
            objH0 = H0();
            if (!(objH0 instanceof F0)) {
                if (!(objH0 instanceof InterfaceC5114u0) || ((InterfaceC5114u0) objH0).getList() == null) {
                    return;
                }
                f02.y();
                return;
            }
            if (objH0 != f02) {
                return;
            }
        } while (!androidx.concurrent.futures.c.a(f218743a, this, objH0, G0.f218727j));
    }

    @Nullable
    public final Throwable v0() {
        Object objH0 = H0();
        if (objH0 instanceof c) {
            Throwable thD = ((c) objH0).d();
            if (thD != null) {
                return thD;
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        if (objH0 instanceof InterfaceC5114u0) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        if (objH0 instanceof B) {
            return ((B) objH0).f218701a;
        }
        return null;
    }

    public final void v1(@Nullable InterfaceC5111t interfaceC5111t) {
        f218744b.set(this, interfaceC5111t);
    }

    public final boolean w0() {
        Object objH0 = H0();
        return (objH0 instanceof B) && ((B) objH0).a();
    }

    public final Throwable x0(Object obj) {
        B b10 = obj instanceof B ? (B) obj : null;
        if (b10 != null) {
            return b10.f218701a;
        }
        return null;
    }

    public final Throwable y0(c cVar, List<? extends Throwable> list) {
        Object next;
        Object obj = null;
        if (list.isEmpty()) {
            if (cVar.k()) {
                return new JobCancellationException(f0(), null, this);
            }
            return null;
        }
        List<? extends Throwable> list2 = list;
        Iterator<T> it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!(((Throwable) next) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) next;
        if (th != null) {
            return th;
        }
        Throwable th2 = list.get(0);
        if (th2 instanceof TimeoutCancellationException) {
            Iterator<T> it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                Throwable th3 = (Throwable) next2;
                if (th3 != th2 && (th3 instanceof TimeoutCancellationException)) {
                    obj = next2;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public final int y1(Object obj) {
        if (obj instanceof C5064h0) {
            if (((C5064h0) obj).f220263a) {
                return 0;
            }
            if (!androidx.concurrent.futures.c.a(f218743a, this, obj, G0.f218727j)) {
                return -1;
            }
            q1();
            return 1;
        }
        if (!(obj instanceof C5112t0)) {
            return 0;
        }
        if (!androidx.concurrent.futures.c.a(f218743a, this, obj, ((C5112t0) obj).f220795a)) {
            return -1;
        }
        q1();
        return 1;
    }

    public boolean z0() {
        return true;
    }

    public final String z1(Object obj) {
        if (!(obj instanceof c)) {
            return obj instanceof InterfaceC5114u0 ? ((InterfaceC5114u0) obj).isActive() ? "Active" : "New" : obj instanceof B ? "Cancelled" : "Completed";
        }
        c cVar = (c) obj;
        return cVar.k() ? "Cancelling" : cVar.l() ? "Completing" : "Active";
    }

    public void R0(@NotNull Throwable th) throws Throwable {
        throw th;
    }
}
