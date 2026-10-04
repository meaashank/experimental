package kotlinx.coroutines.selects;

import ed.p;
import ed.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC4850b0;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4982o;
import kotlin.L0;
import kotlin.collections.H;
import kotlin.collections.U;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import kotlinx.coroutines.InterfaceC5058e0;
import kotlinx.coroutines.InterfaceC5098m;
import kotlinx.coroutines.InterfaceC5100n;
import kotlinx.coroutines.InterfaceC5107q0;
import kotlinx.coroutines.internal.N;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nSelect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Select.kt\nkotlinx/coroutines/selects/SelectImplementation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 5 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,879:1\n1#2:880\n2624#3,3:881\n1855#3,2:893\n1855#3,2:901\n1855#3,2:903\n318#4,9:884\n327#4,2:895\n149#5,4:897\n*S KotlinDebug\n*F\n+ 1 Select.kt\nkotlinx/coroutines/selects/SelectImplementation\n*L\n512#1:881,3\n576#1:893,2\n732#1:901,2\n757#1:903,2\n552#1:884,9\n552#1:895,2\n717#1:897,4\n*E\n"})
@InterfaceC4850b0
public class SelectImplementation<R> implements InterfaceC5098m, b<R>, k<R> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f220684f = AtomicReferenceFieldUpdater.newUpdater(SelectImplementation.class, Object.class, "state$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final kotlin.coroutines.i f220685a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Object f220687c;
    private volatile /* synthetic */ Object state$volatile = SelectKt.f220711f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public List<SelectImplementation<R>.a> f220686b = new ArrayList(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f220688d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Object f220689e = SelectKt.f220714i;

    @V({"SMAP\nSelect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Select.kt\nkotlinx/coroutines/selects/SelectImplementation$ClauseData\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,879:1\n1#2:880\n*E\n"})
    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dd.g
        @NotNull
        public final Object f220690a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final q<Object, j<?>, Object, L0> f220691b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final q<Object, Object, Object, Object> f220692c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final Object f220693d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final Object f220694e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @dd.g
        @Nullable
        public final q<j<?>, Object, Object, ed.l<Throwable, L0>> f220695f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @dd.g
        @Nullable
        public Object f220696g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @dd.g
        public int f220697h = -1;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull Object obj, @NotNull q<Object, ? super j<?>, Object, L0> qVar, @NotNull q<Object, Object, Object, ? extends Object> qVar2, @Nullable Object obj2, @NotNull Object obj3, @Nullable q<? super j<?>, Object, Object, ? extends ed.l<? super Throwable, L0>> qVar3) {
            this.f220690a = obj;
            this.f220691b = qVar;
            this.f220692c = qVar2;
            this.f220693d = obj2;
            this.f220694e = obj3;
            this.f220695f = qVar3;
        }

        @Nullable
        public final ed.l<Throwable, L0> a(@NotNull j<?> jVar, @Nullable Object obj) {
            q<j<?>, Object, Object, ed.l<Throwable, L0>> qVar = this.f220695f;
            if (qVar != null) {
                return qVar.invoke(jVar, this.f220693d, obj);
            }
            return null;
        }

        public final void b() {
            Object obj = this.f220696g;
            SelectImplementation<R> selectImplementation = SelectImplementation.this;
            if (obj instanceof N) {
                ((N) obj).z(this.f220697h, null, selectImplementation.getContext());
                return;
            }
            InterfaceC5058e0 interfaceC5058e0 = obj instanceof InterfaceC5058e0 ? (InterfaceC5058e0) obj : null;
            if (interfaceC5058e0 != null) {
                interfaceC5058e0.dispose();
            }
        }

        @Nullable
        public final Object c(@Nullable Object obj, @NotNull kotlin.coroutines.e<? super R> eVar) {
            Object obj2 = this.f220694e;
            if (this.f220693d == SelectKt.l()) {
                G.n(obj2, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction0<R of kotlinx.coroutines.selects.SelectImplementation>");
                return ((ed.l) obj2).invoke(eVar);
            }
            G.n(obj2, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction1<kotlin.Any?, R of kotlinx.coroutines.selects.SelectImplementation>");
            return ((p) obj2).invoke(obj, eVar);
        }

        @Nullable
        public final Object d(@Nullable Object obj) {
            return this.f220692c.invoke(this.f220690a, this.f220693d, obj);
        }

        public final boolean e(@NotNull SelectImplementation<R> selectImplementation) {
            this.f220691b.invoke(this.f220690a, selectImplementation, this.f220693d);
            return selectImplementation.f220689e == SelectKt.f220714i;
        }
    }

    public SelectImplementation(@NotNull kotlin.coroutines.i iVar) {
        this.f220685a = iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean D() {
        return f220684f.get(this) == SelectKt.f220713h;
    }

    private final boolean E() {
        return f220684f.get(this) instanceof a;
    }

    private final /* synthetic */ void F(Object obj, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, ed.l<Object, L0> lVar) {
        while (true) {
            lVar.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    public static /* synthetic */ void I(SelectImplementation selectImplementation, a aVar, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: register");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        selectImplementation.H(aVar, z10);
    }

    @InterfaceC4850b0
    public static /* synthetic */ <R> Object x(SelectImplementation<R> selectImplementation, kotlin.coroutines.e<? super R> eVar) {
        return selectImplementation.E() ? selectImplementation.v(eVar) : selectImplementation.y(eVar);
    }

    public final boolean A() {
        Object obj = f220684f.get(this);
        return obj == SelectKt.f220711f || (obj instanceof List);
    }

    public final /* synthetic */ Object B() {
        return this.state$volatile;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object G(kotlinx.coroutines.selects.SelectImplementation<R>.a r5, java.lang.Object r6, kotlin.coroutines.e<? super R> r7) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.selects.SelectImplementation$processResultAndInvokeBlockRecoveringException$1
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.selects.SelectImplementation$processResultAndInvokeBlockRecoveringException$1 r0 = (kotlinx.coroutines.selects.SelectImplementation$processResultAndInvokeBlockRecoveringException$1) r0
            int r1 = r0.f220705c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f220705c = r1
            goto L18
        L13:
            kotlinx.coroutines.selects.SelectImplementation$processResultAndInvokeBlockRecoveringException$1 r0 = new kotlinx.coroutines.selects.SelectImplementation$processResultAndInvokeBlockRecoveringException$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f220703a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f220705c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.C4885d0.n(r7)
            return r7
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            kotlin.C4885d0.n(r7)
            java.lang.Object r6 = r5.d(r6)
            r0.f220705c = r3
            java.lang.Object r5 = r5.c(r6, r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.selects.SelectImplementation.G(kotlinx.coroutines.selects.SelectImplementation$a, java.lang.Object, kotlin.coroutines.e):java.lang.Object");
    }

    @dd.j(name = "register")
    public final void H(@NotNull SelectImplementation<R>.a aVar, boolean z10) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f220684f;
        if (atomicReferenceFieldUpdater.get(this) instanceof a) {
            return;
        }
        if (!z10) {
            t(aVar.f220690a);
        }
        if (!aVar.e(this)) {
            atomicReferenceFieldUpdater.set(this, aVar);
            return;
        }
        if (!z10) {
            List<SelectImplementation<R>.a> list = this.f220686b;
            G.m(list);
            list.add(aVar);
        }
        aVar.f220696g = this.f220687c;
        aVar.f220697h = this.f220688d;
        this.f220687c = null;
        this.f220688d = -1;
    }

    public final void J(Object obj) {
        SelectImplementation<R>.a aVarZ = z(obj);
        G.m(aVarZ);
        aVarZ.f220696g = null;
        aVarZ.f220697h = -1;
        H(aVarZ, true);
    }

    public final /* synthetic */ void K(Object obj) {
        this.state$volatile = obj;
    }

    @NotNull
    public final TrySelectDetailedResult L(@NotNull Object obj, @Nullable Object obj2) {
        return SelectKt.d(M(obj, obj2));
    }

    public final int M(Object obj, Object obj2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f220684f;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj3 instanceof InterfaceC5100n) {
                SelectImplementation<R>.a aVarZ = z(obj);
                if (aVarZ == null) {
                    continue;
                } else {
                    ed.l<Throwable, L0> lVarA = aVarZ.a(this, obj2);
                    if (androidx.concurrent.futures.c.a(atomicReferenceFieldUpdater, this, obj3, aVarZ)) {
                        this.f220689e = obj2;
                        if (SelectKt.o((InterfaceC5100n) obj3, lVarA)) {
                            return 0;
                        }
                        this.f220689e = SelectKt.f220714i;
                        return 2;
                    }
                }
            } else {
                if (G.g(obj3, SelectKt.f220712g) ? true : obj3 instanceof a) {
                    return 3;
                }
                if (G.g(obj3, SelectKt.f220713h)) {
                    return 2;
                }
                if (G.g(obj3, SelectKt.f220711f)) {
                    if (androidx.concurrent.futures.c.a(atomicReferenceFieldUpdater, this, obj3, H.l(obj))) {
                        return 1;
                    }
                } else {
                    if (!(obj3 instanceof List)) {
                        throw new IllegalStateException(("Unexpected state: " + obj3).toString());
                    }
                    if (androidx.concurrent.futures.c.a(atomicReferenceFieldUpdater, this, obj3, U.J4((Collection) obj3, obj))) {
                        return 1;
                    }
                }
            }
        }
    }

    public final /* synthetic */ void N(Object obj, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, ed.l<Object, ? extends Object> lVar) {
        Object obj2;
        do {
            obj2 = atomicReferenceFieldUpdater.get(obj);
        } while (!androidx.concurrent.futures.c.a(atomicReferenceFieldUpdater, obj, obj2, lVar.invoke(obj2)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        r5 = r0.z();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        if (r5 != kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0063, code lost:
    
        return kotlin.L0.f217464a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object O(kotlin.coroutines.e<? super kotlin.L0> r5) {
        /*
            r4 = this;
            kotlinx.coroutines.o r0 = new kotlinx.coroutines.o
            kotlin.coroutines.e r5 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.e(r5)
            r1 = 1
            r0.<init>(r5, r1)
            r0.n0()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = kotlinx.coroutines.selects.SelectImplementation.f220684f
        Lf:
            java.lang.Object r1 = r5.get(r4)
            kotlinx.coroutines.internal.Q r2 = kotlinx.coroutines.selects.SelectKt.j()
            if (r1 != r2) goto L25
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.selects.SelectImplementation.f220684f
            boolean r1 = androidx.concurrent.futures.c.a(r2, r4, r1, r0)
            if (r1 == 0) goto Lf
            kotlinx.coroutines.C5106q.c(r0, r4)
            goto L58
        L25:
            boolean r2 = r1 instanceof java.util.List
            if (r2 == 0) goto L47
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.selects.SelectImplementation.f220684f
            kotlinx.coroutines.internal.Q r3 = kotlinx.coroutines.selects.SelectKt.f220711f
            boolean r2 = androidx.concurrent.futures.c.a(r2, r4, r1, r3)
            if (r2 == 0) goto Lf
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L39:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lf
            java.lang.Object r2 = r1.next()
            r4.J(r2)
            goto L39
        L47:
            boolean r5 = r1 instanceof kotlinx.coroutines.selects.SelectImplementation.a
            if (r5 == 0) goto L64
            kotlin.L0 r5 = kotlin.L0.f217464a
            kotlinx.coroutines.selects.SelectImplementation$a r1 = (kotlinx.coroutines.selects.SelectImplementation.a) r1
            java.lang.Object r2 = r4.f220689e
            ed.l r1 = r1.a(r4, r2)
            r0.X(r5, r1)
        L58:
            java.lang.Object r5 = r0.z()
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r5 != r0) goto L61
            return r5
        L61:
            kotlin.L0 r5 = kotlin.L0.f217464a
            return r5
        L64:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "unexpected state: "
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.selects.SelectImplementation.O(kotlin.coroutines.e):java.lang.Object");
    }

    @Override // kotlinx.coroutines.InterfaceC5098m
    public void a(@Nullable Throwable th) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f220684f;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (obj == SelectKt.f220712g) {
                return;
            }
        } while (!androidx.concurrent.futures.c.a(atomicReferenceFieldUpdater, this, obj, SelectKt.f220713h));
        List<SelectImplementation<R>.a> list = this.f220686b;
        if (list == null) {
            return;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((a) it.next()).b();
        }
        this.f220689e = SelectKt.f220714i;
        this.f220686b = null;
    }

    @Override // kotlinx.coroutines.l1
    public void b(@NotNull N<?> n10, int i10) {
        this.f220687c = n10;
        this.f220688d = i10;
    }

    @Override // kotlinx.coroutines.selects.b
    public void c(@NotNull c cVar, @NotNull ed.l<? super kotlin.coroutines.e<? super R>, ? extends Object> lVar) {
        I(this, new a(cVar.d(), cVar.c(), cVar.b(), SelectKt.l(), lVar, cVar.a()), false, 1, null);
    }

    @Override // kotlinx.coroutines.selects.b
    public <Q> void d(@NotNull e<? extends Q> eVar, @NotNull p<? super Q, ? super kotlin.coroutines.e<? super R>, ? extends Object> pVar) {
        I(this, new a(eVar.d(), eVar.c(), eVar.b(), null, pVar, eVar.a()), false, 1, null);
    }

    @Override // kotlinx.coroutines.selects.b
    @Xc.i
    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "Replaced with the same extension function", replaceWith = @InterfaceC4852c0(expression = "onTimeout", imports = {"kotlinx.coroutines.selects.onTimeout"}))
    @InterfaceC5107q0
    public void e(long j10, @NotNull ed.l<? super kotlin.coroutines.e<? super R>, ? extends Object> lVar) {
        kotlinx.coroutines.selects.a.a(this, j10, lVar);
    }

    @Override // kotlinx.coroutines.selects.j
    public void f(@Nullable Object obj) {
        this.f220689e = obj;
    }

    @Override // kotlinx.coroutines.selects.j
    public void g(@NotNull InterfaceC5058e0 interfaceC5058e0) {
        this.f220687c = interfaceC5058e0;
    }

    @Override // kotlinx.coroutines.selects.j
    @NotNull
    public kotlin.coroutines.i getContext() {
        return this.f220685a;
    }

    @Override // kotlinx.coroutines.selects.b
    public <P, Q> void h(@NotNull g<? super P, ? extends Q> gVar, @NotNull p<? super Q, ? super kotlin.coroutines.e<? super R>, ? extends Object> pVar) {
        i(gVar, null, pVar);
    }

    @Override // kotlinx.coroutines.selects.b
    public <P, Q> void i(@NotNull g<? super P, ? extends Q> gVar, P p10, @NotNull p<? super Q, ? super kotlin.coroutines.e<? super R>, ? extends Object> pVar) {
        I(this, new a(gVar.d(), gVar.c(), gVar.b(), p10, pVar, gVar.a()), false, 1, null);
    }

    @Override // kotlinx.coroutines.selects.j
    public boolean j(@NotNull Object obj, @Nullable Object obj2) {
        return M(obj, obj2) == 0;
    }

    public final void t(Object obj) {
        List<SelectImplementation<R>.a> list = this.f220686b;
        G.m(list);
        List<SelectImplementation<R>.a> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return;
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            if (((a) it.next()).f220690a == obj) {
                throw new IllegalStateException(("Cannot use select clauses on the same object: " + obj).toString());
            }
        }
    }

    public final void u(SelectImplementation<R>.a aVar) {
        List<SelectImplementation<R>.a> list = this.f220686b;
        if (list == null) {
            return;
        }
        for (SelectImplementation<R>.a aVar2 : list) {
            if (aVar2 != aVar) {
                aVar2.b();
            }
        }
        f220684f.set(this, SelectKt.f220712g);
        this.f220689e = SelectKt.f220714i;
        this.f220686b = null;
    }

    public final Object v(kotlin.coroutines.e<? super R> eVar) {
        Object obj = f220684f.get(this);
        G.n(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        SelectImplementation<R>.a aVar = (a) obj;
        Object obj2 = this.f220689e;
        u(aVar);
        return aVar.c(aVar.d(obj2), eVar);
    }

    @InterfaceC4850b0
    @Nullable
    public Object w(@NotNull kotlin.coroutines.e<? super R> eVar) {
        return x(this, eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object y(kotlin.coroutines.e<? super R> r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1 r0 = (kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1) r0
            int r1 = r0.f220702d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f220702d = r1
            goto L18
        L13:
            kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1 r0 = new kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f220700b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f220702d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.C4885d0.n(r6)
            return r6
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            java.lang.Object r2 = r0.f220699a
            kotlinx.coroutines.selects.SelectImplementation r2 = (kotlinx.coroutines.selects.SelectImplementation) r2
            kotlin.C4885d0.n(r6)
            goto L49
        L3a:
            kotlin.C4885d0.n(r6)
            r0.f220699a = r5
            r0.f220702d = r4
            java.lang.Object r6 = r5.O(r0)
            if (r6 != r1) goto L48
            goto L54
        L48:
            r2 = r5
        L49:
            r6 = 0
            r0.f220699a = r6
            r0.f220702d = r3
            java.lang.Object r6 = r2.v(r0)
            if (r6 != r1) goto L55
        L54:
            return r1
        L55:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.selects.SelectImplementation.y(kotlin.coroutines.e):java.lang.Object");
    }

    public final SelectImplementation<R>.a z(Object obj) {
        List<SelectImplementation<R>.a> list = this.f220686b;
        Object obj2 = null;
        if (list == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((a) next).f220690a == obj) {
                obj2 = next;
                break;
            }
        }
        SelectImplementation<R>.a aVar = (a) obj2;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }
}
