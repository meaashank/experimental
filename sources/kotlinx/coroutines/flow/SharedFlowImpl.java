package kotlinx.coroutines.flow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.L0;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import kotlinx.coroutines.C5102o;
import kotlinx.coroutines.C5106q;
import kotlinx.coroutines.InterfaceC5058e0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.internal.Q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nSharedFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedFlow.kt\nkotlinx/coroutines/flow/SharedFlowImpl\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 4 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 AbstractSharedFlow.kt\nkotlinx/coroutines/flow/internal/AbstractSharedFlow\n+ 7 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 8 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,741:1\n24#2,4:742\n24#2,4:748\n24#2,4:770\n24#2,4:777\n24#2,4:789\n24#2,4:803\n24#2,4:817\n16#3:746\n16#3:752\n16#3:774\n16#3:781\n16#3:793\n16#3:807\n16#3:821\n326#4:747\n1#5:753\n90#6,2:754\n92#6,2:757\n94#6:760\n90#6,2:782\n92#6,2:785\n94#6:788\n90#6,2:810\n92#6,2:813\n94#6:816\n13309#7:756\n13310#7:759\n13309#7:784\n13310#7:787\n13309#7:812\n13310#7:815\n318#8,9:761\n327#8,2:775\n318#8,9:794\n327#8,2:808\n*S KotlinDebug\n*F\n+ 1 SharedFlow.kt\nkotlinx/coroutines/flow/SharedFlowImpl\n*L\n361#1:742,4\n401#1:748,4\n495#1:770,4\n516#1:777,4\n636#1:789,4\n671#1:803,4\n699#1:817,4\n361#1:746\n401#1:752\n495#1:774\n516#1:781\n636#1:793\n671#1:807\n699#1:821\n383#1:747\n463#1:754,2\n463#1:757,2\n463#1:760\n539#1:782,2\n539#1:785,2\n539#1:788\n686#1:810,2\n686#1:813,2\n686#1:816\n463#1:756\n463#1:759\n539#1:784\n539#1:787\n686#1:812\n686#1:815\n493#1:761,9\n493#1:775,2\n670#1:794,9\n670#1:808,2\n*E\n"})
public class SharedFlowImpl<T> extends kotlinx.coroutines.flow.internal.a<p> implements i<T>, kotlinx.coroutines.flow.a<T>, kotlinx.coroutines.flow.internal.i<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f220009e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f220010f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final BufferOverflow f220011g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public Object[] f220012h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f220013i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f220014j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f220015k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f220016l;

    public static final class a implements InterfaceC5058e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dd.g
        @NotNull
        public final SharedFlowImpl<?> f220017a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dd.g
        public long f220018b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dd.g
        @Nullable
        public final Object f220019c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @dd.g
        @NotNull
        public final kotlin.coroutines.e<L0> f220020d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull SharedFlowImpl<?> sharedFlowImpl, long j10, @Nullable Object obj, @NotNull kotlin.coroutines.e<? super L0> eVar) {
            this.f220017a = sharedFlowImpl;
            this.f220018b = j10;
            this.f220019c = obj;
            this.f220020d = eVar;
        }

        @Override // kotlinx.coroutines.InterfaceC5058e0
        public void dispose() {
            this.f220017a.B(this);
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f220021a;

        static {
            int[] iArr = new int[BufferOverflow.values().length];
            try {
                iArr[BufferOverflow.SUSPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BufferOverflow.DROP_LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BufferOverflow.DROP_OLDEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f220021a = iArr;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.SharedFlowImpl$collect$1, reason: invalid class name */
    @Vc.d(c = "kotlinx.coroutines.flow.SharedFlowImpl", f = "SharedFlow.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2}, l = {382, 389, 392}, m = "collect$suspendImpl", n = {"$this", "collector", "slot", "$this", "collector", "slot", "collectorJob", "$this", "collector", "slot", "collectorJob"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
    public static final class AnonymousClass1<T> extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f220022a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f220023b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f220024c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f220025d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f220026e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ SharedFlowImpl<T> f220027f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f220028g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SharedFlowImpl<T> sharedFlowImpl, kotlin.coroutines.e<? super AnonymousClass1> eVar) {
            super(eVar);
            this.f220027f = sharedFlowImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f220026e = obj;
            this.f220028g |= Integer.MIN_VALUE;
            return SharedFlowImpl.D(this.f220027f, null, this);
        }
    }

    public SharedFlowImpl(int i10, int i11, @NotNull BufferOverflow bufferOverflow) {
        this.f220009e = i10;
        this.f220010f = i11;
        this.f220011g = bufferOverflow;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0090, code lost:
    
        if (((kotlinx.coroutines.flow.SubscribedFlowCollector) r9).a(r0) == r1) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> java.lang.Object D(kotlinx.coroutines.flow.SharedFlowImpl<T> r8, kotlinx.coroutines.flow.f<? super T> r9, kotlin.coroutines.e<?> r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.SharedFlowImpl.D(kotlinx.coroutines.flow.SharedFlowImpl, kotlinx.coroutines.flow.f, kotlin.coroutines.e):java.lang.Object");
    }

    public static <T> Object I(SharedFlowImpl<T> sharedFlowImpl, T t10, kotlin.coroutines.e<? super L0> eVar) throws Throwable {
        if (sharedFlowImpl.i(t10)) {
            return L0.f217464a;
        }
        Object objJ = sharedFlowImpl.J(t10, eVar);
        return objJ == CoroutineSingletons.COROUTINE_SUSPENDED ? objJ : L0.f217464a;
    }

    public static /* synthetic */ void P() {
    }

    public final Object A(p pVar, kotlin.coroutines.e<? super L0> eVar) {
        C5102o c5102o = new C5102o(IntrinsicsKt__IntrinsicsJvmKt.e(eVar), 1);
        c5102o.n0();
        synchronized (this) {
            try {
                if (X(pVar) < 0) {
                    pVar.f220235b = c5102o;
                } else {
                    c5102o.resumeWith(L0.f217464a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Object objZ = c5102o.z();
        return objZ == CoroutineSingletons.COROUTINE_SUSPENDED ? objZ : L0.f217464a;
    }

    public final void B(a aVar) {
        synchronized (this) {
            if (aVar.f220018b < N()) {
                return;
            }
            Object[] objArr = this.f220012h;
            G.m(objArr);
            if (o.f(objArr, aVar.f220018b) != aVar) {
                return;
            }
            o.g(objArr, aVar.f220018b, o.f220233a);
            C();
        }
    }

    public final void C() {
        if (this.f220010f != 0 || this.f220016l > 1) {
            Object[] objArr = this.f220012h;
            G.m(objArr);
            while (this.f220016l > 0 && o.f(objArr, (N() + ((long) T())) - 1) == o.f220233a) {
                this.f220016l--;
                o.g(objArr, N() + ((long) T()), null);
            }
        }
    }

    public final void E(long j10) {
        Object[] objArr;
        if (this.f220213b != 0 && (objArr = this.f220212a) != null) {
            for (Object obj : objArr) {
                if (obj != null) {
                    p pVar = (p) obj;
                    long j11 = pVar.f220234a;
                    if (j11 >= 0 && j11 < j10) {
                        pVar.f220234a = j10;
                    }
                }
            }
        }
        this.f220014j = j10;
    }

    @Override // kotlinx.coroutines.flow.internal.a
    @NotNull
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public p f() {
        return new p();
    }

    @Override // kotlinx.coroutines.flow.internal.a
    @NotNull
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public p[] g(int i10) {
        return new p[i10];
    }

    public final void H() {
        Object[] objArr = this.f220012h;
        G.m(objArr);
        o.g(objArr, N(), null);
        this.f220015k--;
        long jN = N() + 1;
        if (this.f220013i < jN) {
            this.f220013i = jN;
        }
        if (this.f220014j < jN) {
            E(jN);
        }
    }

    public final Object J(T t10, kotlin.coroutines.e<? super L0> eVar) throws Throwable {
        Throwable th;
        kotlin.coroutines.e<L0>[] eVarArrL;
        a aVar;
        C5102o c5102o = new C5102o(IntrinsicsKt__IntrinsicsJvmKt.e(eVar), 1);
        c5102o.n0();
        kotlin.coroutines.e<L0>[] eVarArrL2 = kotlinx.coroutines.flow.internal.b.f220216a;
        synchronized (this) {
            try {
                if (V(t10)) {
                    try {
                        c5102o.resumeWith(L0.f217464a);
                        eVarArrL = L(eVarArrL2);
                        aVar = null;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    try {
                        a aVar2 = new a(this, N() + ((long) T()), t10, c5102o);
                        K(aVar2);
                        this.f220016l++;
                        if (this.f220010f == 0) {
                            eVarArrL2 = L(eVarArrL2);
                        }
                        eVarArrL = eVarArrL2;
                        aVar = aVar2;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        throw th;
                    }
                }
                if (aVar != null) {
                    C5106q.a(c5102o, aVar);
                }
                for (kotlin.coroutines.e<L0> eVar2 : eVarArrL) {
                    if (eVar2 != null) {
                        eVar2.resumeWith(L0.f217464a);
                    }
                }
                Object objZ = c5102o.z();
                return objZ == CoroutineSingletons.COROUTINE_SUSPENDED ? objZ : L0.f217464a;
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    public final void K(Object obj) {
        int iT = T();
        Object[] objArrU = this.f220012h;
        if (objArrU == null) {
            objArrU = U(null, 0, 2);
        } else if (iT >= objArrU.length) {
            objArrU = U(objArrU, iT, objArrU.length * 2);
        }
        o.g(objArrU, N() + ((long) iT), obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.coroutines.e<kotlin.L0>[]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v3 */
    public final kotlin.coroutines.e<L0>[] L(kotlin.coroutines.e<L0>[] eVarArr) {
        Object[] objArr;
        p pVar;
        kotlin.coroutines.e<? super L0> eVar;
        int length = eVarArr.length;
        if (this.f220213b != 0 && (objArr = this.f220212a) != null) {
            int length2 = objArr.length;
            int i10 = 0;
            eVarArr = eVarArr;
            while (i10 < length2) {
                Object obj = objArr[i10];
                if (obj != null && (eVar = (pVar = (p) obj).f220235b) != null && X(pVar) >= 0) {
                    int length3 = eVarArr.length;
                    eVarArr = eVarArr;
                    if (length >= length3) {
                        Object[] objArrCopyOf = Arrays.copyOf((Object[]) eVarArr, Math.max(2, eVarArr.length * 2));
                        G.o(objArrCopyOf, "copyOf(...)");
                        eVarArr = objArrCopyOf;
                    }
                    ((kotlin.coroutines.e[]) eVarArr)[length] = eVar;
                    pVar.f220235b = null;
                    length++;
                }
                i10++;
                eVarArr = eVarArr;
            }
        }
        return (kotlin.coroutines.e[]) eVarArr;
    }

    public final long M() {
        return N() + ((long) this.f220015k);
    }

    public final long N() {
        return Math.min(this.f220014j, this.f220013i);
    }

    public final T O() {
        Object[] objArr = this.f220012h;
        G.m(objArr);
        return (T) o.f(objArr, (this.f220013i + ((long) S())) - 1);
    }

    public final Object Q(long j10) {
        Object[] objArr = this.f220012h;
        G.m(objArr);
        Object objF = o.f(objArr, j10);
        return objF instanceof a ? ((a) objF).f220019c : objF;
    }

    public final long R() {
        return N() + ((long) this.f220015k) + ((long) this.f220016l);
    }

    public final int S() {
        return (int) ((N() + ((long) this.f220015k)) - this.f220013i);
    }

    public final int T() {
        return this.f220015k + this.f220016l;
    }

    public final Object[] U(Object[] objArr, int i10, int i11) {
        if (i11 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i11];
        this.f220012h = objArr2;
        if (objArr != null) {
            long jN = N();
            for (int i12 = 0; i12 < i10; i12++) {
                long j10 = ((long) i12) + jN;
                o.g(objArr2, j10, o.f(objArr, j10));
            }
        }
        return objArr2;
    }

    public final boolean V(T t10) {
        if (this.f220213b == 0) {
            W(t10);
            return true;
        }
        if (this.f220015k >= this.f220010f && this.f220014j <= this.f220013i) {
            int i10 = b.f220021a[this.f220011g.ordinal()];
            if (i10 == 1) {
                return false;
            }
            if (i10 == 2) {
                return true;
            }
        }
        K(t10);
        int i11 = this.f220015k + 1;
        this.f220015k = i11;
        if (i11 > this.f220010f) {
            H();
        }
        if (S() > this.f220009e) {
            Z(this.f220013i + 1, this.f220014j, M(), R());
        }
        return true;
    }

    public final boolean W(T t10) {
        if (this.f220009e == 0) {
            return true;
        }
        K(t10);
        int i10 = this.f220015k + 1;
        this.f220015k = i10;
        if (i10 > this.f220009e) {
            H();
        }
        this.f220014j = N() + ((long) this.f220015k);
        return true;
    }

    public final long X(p pVar) {
        long j10 = pVar.f220234a;
        if (j10 >= M() && (this.f220010f > 0 || j10 > N() || this.f220016l == 0)) {
            return -1L;
        }
        return j10;
    }

    public final Object Y(p pVar) {
        Object obj;
        kotlin.coroutines.e<L0>[] eVarArrA0 = kotlinx.coroutines.flow.internal.b.f220216a;
        synchronized (this) {
            try {
                long jX = X(pVar);
                if (jX < 0) {
                    obj = o.f220233a;
                } else {
                    long j10 = pVar.f220234a;
                    Object objQ = Q(jX);
                    pVar.f220234a = jX + 1;
                    eVarArrA0 = a0(j10);
                    obj = objQ;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (kotlin.coroutines.e<L0> eVar : eVarArrA0) {
            if (eVar != null) {
                eVar.resumeWith(L0.f217464a);
            }
        }
        return obj;
    }

    public final void Z(long j10, long j11, long j12, long j13) {
        long jMin = Math.min(j11, j10);
        for (long jN = N(); jN < jMin; jN++) {
            Object[] objArr = this.f220012h;
            G.m(objArr);
            o.g(objArr, jN, null);
        }
        this.f220013i = j10;
        this.f220014j = j11;
        this.f220015k = (int) (j12 - jMin);
        this.f220016l = (int) (j13 - j12);
    }

    @Override // kotlinx.coroutines.flow.n
    @NotNull
    public List<T> a() {
        synchronized (this) {
            int iS = S();
            if (iS == 0) {
                return EmptyList.f217510a;
            }
            ArrayList arrayList = new ArrayList(iS);
            Object[] objArr = this.f220012h;
            G.m(objArr);
            for (int i10 = 0; i10 < iS; i10++) {
                arrayList.add(o.f(objArr, this.f220013i + ((long) i10)));
            }
            return arrayList;
        }
    }

    @NotNull
    public final kotlin.coroutines.e<L0>[] a0(long j10) {
        long j11;
        long j12;
        long j13;
        Object[] objArr;
        if (j10 > this.f220014j) {
            return kotlinx.coroutines.flow.internal.b.f220216a;
        }
        long jN = N();
        long j14 = ((long) this.f220015k) + jN;
        if (this.f220010f == 0 && this.f220016l > 0) {
            j14++;
        }
        if (this.f220213b != 0 && (objArr = this.f220212a) != null) {
            for (Object obj : objArr) {
                if (obj != null) {
                    long j15 = ((p) obj).f220234a;
                    if (j15 >= 0 && j15 < j14) {
                        j14 = j15;
                    }
                }
            }
        }
        if (j14 <= this.f220014j) {
            return kotlinx.coroutines.flow.internal.b.f220216a;
        }
        long jM = M();
        int iMin = this.f220213b > 0 ? Math.min(this.f220016l, this.f220010f - ((int) (jM - j14))) : this.f220016l;
        kotlin.coroutines.e<L0>[] eVarArr = kotlinx.coroutines.flow.internal.b.f220216a;
        long j16 = ((long) this.f220016l) + jM;
        if (iMin > 0) {
            eVarArr = new kotlin.coroutines.e[iMin];
            Object[] objArr2 = this.f220012h;
            G.m(objArr2);
            j13 = 1;
            long j17 = jM;
            int i10 = 0;
            while (true) {
                if (jM >= j16) {
                    j11 = jN;
                    j12 = j14;
                    jM = j17;
                    break;
                }
                Object objF = o.f(objArr2, jM);
                j11 = jN;
                Q q10 = o.f220233a;
                if (objF != q10) {
                    G.n(objF, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    a aVar = (a) objF;
                    int i11 = i10 + 1;
                    j12 = j14;
                    eVarArr[i10] = aVar.f220020d;
                    o.g(objArr2, jM, q10);
                    o.g(objArr2, j17, aVar.f220019c);
                    long j18 = j17 + 1;
                    if (i11 >= iMin) {
                        jM = j18;
                        break;
                    }
                    i10 = i11;
                    j17 = j18;
                } else {
                    j12 = j14;
                }
                jM++;
                jN = j11;
                j14 = j12;
            }
        } else {
            j11 = jN;
            j12 = j14;
            j13 = 1;
        }
        kotlin.coroutines.e<L0>[] eVarArr2 = eVarArr;
        int i12 = (int) (jM - j11);
        long j19 = this.f220213b == 0 ? jM : j12;
        long jMax = Math.max(this.f220013i, jM - ((long) Math.min(this.f220009e, i12)));
        if (this.f220010f == 0 && jMax < j16) {
            Object[] objArr3 = this.f220012h;
            G.m(objArr3);
            if (G.g(o.f(objArr3, jMax), o.f220233a)) {
                jM += j13;
                jMax += j13;
            }
        }
        Z(jMax, j19, jM, j16);
        C();
        return !(eVarArr2.length == 0) ? L(eVarArr2) : eVarArr2;
    }

    @Override // kotlinx.coroutines.flow.internal.i
    @NotNull
    public e<T> b(@NotNull kotlin.coroutines.i iVar, int i10, @NotNull BufferOverflow bufferOverflow) {
        return o.e(this, iVar, i10, bufferOverflow);
    }

    public final long b0() {
        long j10 = this.f220013i;
        if (j10 < this.f220014j) {
            this.f220014j = j10;
        }
        return j10;
    }

    @Override // kotlinx.coroutines.flow.n, kotlinx.coroutines.flow.e
    @Nullable
    public Object collect(@NotNull f<? super T> fVar, @NotNull kotlin.coroutines.e<?> eVar) {
        return D(this, fVar, eVar);
    }

    @Override // kotlinx.coroutines.flow.i, kotlinx.coroutines.flow.f
    @Nullable
    public Object emit(T t10, @NotNull kotlin.coroutines.e<? super L0> eVar) {
        return I(this, t10, eVar);
    }

    @Override // kotlinx.coroutines.flow.i
    public void h() throws Throwable {
        synchronized (this) {
            try {
                try {
                    Z(M(), this.f220014j, M(), R());
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // kotlinx.coroutines.flow.i
    public boolean i(T t10) {
        int i10;
        boolean z10;
        kotlin.coroutines.e<L0>[] eVarArrL = kotlinx.coroutines.flow.internal.b.f220216a;
        synchronized (this) {
            if (V(t10)) {
                eVarArrL = L(eVarArrL);
                z10 = true;
            } else {
                z10 = false;
            }
        }
        for (kotlin.coroutines.e<L0> eVar : eVarArrL) {
            if (eVar != null) {
                eVar.resumeWith(L0.f217464a);
            }
        }
        return z10;
    }
}
