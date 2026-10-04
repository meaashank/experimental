package androidx.compose.animation.core;

import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.runtime.ActualAndroid_androidKt;
import androidx.compose.runtime.M1;
import androidx.compose.runtime.MonotonicFrameClockKt;
import e.InterfaceC4348w;
import ed.InterfaceC4376a;
import jd.C4806d;
import kotlin.collections.C4875q;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.C4969v;
import kotlinx.coroutines.InterfaceC5100n;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/SeekableTransitionState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 4 Preconditions.kt\nandroidx/compose/animation/core/PreconditionsKt\n+ 5 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 6 ObjectList.kt\nandroidx/collection/MutableObjectList\n*L\n1#1,2185:1\n81#2:2186\n107#2,2:2187\n81#2:2189\n107#2,2:2190\n79#3:2192\n112#3,2:2193\n33#4,7:2195\n54#4,7:2226\n314#5,11:2202\n314#5,11:2213\n948#6,2:2224\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/SeekableTransitionState\n*L\n227#1:2186\n227#1:2187,2\n229#1:2189\n229#1:2190,2\n258#1:2192\n258#1:2193,2\n503#1:2195,7\n701#1:2226,7\n546#1:2202,11\n567#1:2213,11\n597#1:2224,2\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public final class SeekableTransitionState<S> extends F0<S> {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f87791t = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final androidx.compose.runtime.L0 f87794c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final androidx.compose.runtime.L0 f87795d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public S f87796e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Transition<S> f87797f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f87798g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public InterfaceC5100n<? super S> f87801j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public b f87806o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f87808q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public static final a f87790s = new a();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public static final C1595l f87792u = new C1595l(0.0f);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public static final C1595l f87793v = new C1595l(1.0f);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final InterfaceC4376a<kotlin.L0> f87799h = new InterfaceC4376a<kotlin.L0>(this) { // from class: androidx.compose.animation.core.SeekableTransitionState$recalculateTotalDurationNanos$1

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ SeekableTransitionState<S> f87833d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(0);
            this.f87833d = this;
        }

        @Override // ed.InterfaceC4376a
        public /* bridge */ /* synthetic */ kotlin.L0 invoke() {
            invoke2();
            return kotlin.L0.f217464a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            SeekableTransitionState<S> seekableTransitionState = this.f87833d;
            Transition<S> transition = seekableTransitionState.f87797f;
            seekableTransitionState.f87798g = transition != 0 ? transition.s() : 0L;
        }
    };

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final androidx.compose.runtime.F0 f87800i = ActualAndroid_androidKt.b(0.0f);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final kotlinx.coroutines.sync.a f87802k = MutexKt.b(false, 1, null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final MutatorMutex f87803l = new MutatorMutex();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f87804m = Long.MIN_VALUE;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final androidx.collection.G0<b> f87805n = new androidx.collection.G0<>(0, 1, null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final ed.l<Long, kotlin.L0> f87807p = new ed.l<Long, kotlin.L0>(this) { // from class: androidx.compose.animation.core.SeekableTransitionState$firstFrameLambda$1

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ SeekableTransitionState<S> f87832d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(1);
            this.f87832d = this;
        }

        public final void e(long j10) {
            this.f87832d.f87804m = j10;
        }

        @Override // ed.l
        public kotlin.L0 invoke(Long l10) {
            this.f87832d.f87804m = l10.longValue();
            return kotlin.L0.f217464a;
        }
    };

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final ed.l<Long, kotlin.L0> f87809r = new ed.l<Long, kotlin.L0>(this) { // from class: androidx.compose.animation.core.SeekableTransitionState$animateOneFrameLambda$1

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ SeekableTransitionState<S> f87810d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(1);
            this.f87810d = this;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final void e(long j10) {
            SeekableTransitionState<S> seekableTransitionState = this.f87810d;
            long j11 = j10 - seekableTransitionState.f87804m;
            seekableTransitionState.f87804m = j10;
            long jM0 = C4806d.M0(j11 / ((double) seekableTransitionState.f87808q));
            if (this.f87810d.f87805n.I()) {
                SeekableTransitionState<S> seekableTransitionState2 = this.f87810d;
                androidx.collection.G0<SeekableTransitionState.b> g02 = seekableTransitionState2.f87805n;
                Object[] objArr = g02.f86809a;
                int i10 = g02.f86810b;
                int i11 = 0;
                for (int i12 = 0; i12 < i10; i12++) {
                    SeekableTransitionState.b bVar = (SeekableTransitionState.b) objArr[i12];
                    seekableTransitionState2.P(bVar, jM0);
                    bVar.f87826c = true;
                }
                Transition<S> transition = this.f87810d.f87797f;
                if (transition != 0) {
                    transition.U();
                }
                androidx.collection.G0<SeekableTransitionState.b> g03 = this.f87810d.f87805n;
                int i13 = g03.f86810b;
                Object[] objArr2 = g03.f86809a;
                md.l lVarY1 = md.u.Y1(0, i13);
                int i14 = lVarY1.f221139a;
                int i15 = lVarY1.f221140b;
                if (i14 <= i15) {
                    while (true) {
                        objArr2[i14 - i11] = objArr2[i14];
                        if (((SeekableTransitionState.b) objArr2[i14]).f87826c) {
                            i11++;
                        }
                        if (i14 == i15) {
                            break;
                        } else {
                            i14++;
                        }
                    }
                }
                C4875q.M1(objArr2, null, i13 - i11, i13);
                g03.f86810b -= i11;
            }
            SeekableTransitionState<S> seekableTransitionState3 = this.f87810d;
            SeekableTransitionState.b bVar2 = seekableTransitionState3.f87806o;
            if (bVar2 != null) {
                bVar2.f87830g = seekableTransitionState3.f87798g;
                seekableTransitionState3.P(bVar2, jM0);
                this.f87810d.W(bVar2.f87827d);
                if (bVar2.f87827d == 1.0f) {
                    this.f87810d.f87806o = null;
                }
                this.f87810d.T();
            }
        }

        @Override // ed.l
        public /* bridge */ /* synthetic */ kotlin.L0 invoke(Long l10) {
            e(l10.longValue());
            return kotlin.L0.f217464a;
        }
    };

    public static final class a {
        public a() {
        }

        @NotNull
        public final C1595l a() {
            return SeekableTransitionState.f87793v;
        }

        @NotNull
        public final C1595l b() {
            return SeekableTransitionState.f87792u;
        }

        public a(C4969v c4969v) {
        }
    }

    @androidx.compose.runtime.internal.r(parameters = 0)
    public static final class b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f87823i = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f87824a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public K0<C1595l> f87825b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f87826c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f87827d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public C1595l f87828e = new C1595l(0.0f);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public C1595l f87829f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f87830g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f87831h;

        @Nullable
        public final K0<C1595l> a() {
            return this.f87825b;
        }

        public final long b() {
            return this.f87831h;
        }

        public final long c() {
            return this.f87830g;
        }

        @Nullable
        public final C1595l d() {
            return this.f87829f;
        }

        public final long e() {
            return this.f87824a;
        }

        @NotNull
        public final C1595l f() {
            return this.f87828e;
        }

        public final float g() {
            return this.f87827d;
        }

        public final boolean h() {
            return this.f87826c;
        }

        public final void i(@Nullable K0<C1595l> k02) {
            this.f87825b = k02;
        }

        public final void j(long j10) {
            this.f87831h = j10;
        }

        public final void k(boolean z10) {
            this.f87826c = z10;
        }

        public final void l(long j10) {
            this.f87830g = j10;
        }

        public final void m(@Nullable C1595l c1595l) {
            this.f87829f = c1595l;
        }

        public final void n(long j10) {
            this.f87824a = j10;
        }

        public final void o(@NotNull C1595l c1595l) {
            this.f87828e = c1595l;
        }

        public final void p(float f10) {
            this.f87827d = f10;
        }

        @NotNull
        public String toString() {
            return "progress nanos: " + this.f87824a + ", animationSpec: " + this.f87825b + ", isComplete: " + this.f87826c + ", value: " + this.f87827d + ", start: " + this.f87828e + ", initialVelocity: " + this.f87829f + ", durationNanos: " + this.f87830g + ", animationSpecDuration: " + this.f87831h;
        }
    }

    public SeekableTransitionState(S s10) {
        this.f87794c = M1.g(s10, null, 2, null);
        this.f87795d = M1.g(s10, null, 2, null);
        this.f87796e = s10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object E(SeekableTransitionState seekableTransitionState, Object obj, U u10, kotlin.coroutines.e eVar, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = seekableTransitionState.f87794c.getValue();
        }
        if ((i10 & 2) != 0) {
            u10 = null;
        }
        return seekableTransitionState.D(obj, u10, eVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object S(SeekableTransitionState seekableTransitionState, float f10, Object obj, kotlin.coroutines.e eVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            obj = seekableTransitionState.f87794c.getValue();
        }
        return seekableTransitionState.R(f10, obj, eVar);
    }

    public final Object C(kotlin.coroutines.e<? super kotlin.L0> eVar) {
        float fQ = SuspendAnimationKt.q(eVar.getContext());
        if (fQ <= 0.0f) {
            G();
            return kotlin.L0.f217464a;
        }
        this.f87808q = fQ;
        Object objB1 = MonotonicFrameClockKt.a(eVar.getContext()).B1(this.f87809r, eVar);
        return objB1 == CoroutineSingletons.COROUTINE_SUSPENDED ? objB1 : kotlin.L0.f217464a;
    }

    @Nullable
    public final Object D(S s10, @Nullable U<Float> u10, @NotNull kotlin.coroutines.e<? super kotlin.L0> eVar) {
        Transition<S> transition = this.f87797f;
        if (transition == null) {
            return kotlin.L0.f217464a;
        }
        Object objE = MutatorMutex.e(this.f87803l, null, new SeekableTransitionState$animateTo$2(transition, this, s10, u10, null), eVar, 1, null);
        return objE == CoroutineSingletons.COROUTINE_SUSPENDED ? objE : kotlin.L0.f217464a;
    }

    public final Object F(kotlin.coroutines.e<? super kotlin.L0> eVar) {
        if (this.f87804m == Long.MIN_VALUE) {
            Object objF = MonotonicFrameClockKt.f(this.f87807p, eVar);
            return objF == CoroutineSingletons.COROUTINE_SUSPENDED ? objF : kotlin.L0.f217464a;
        }
        Object objC = C(eVar);
        return objC == CoroutineSingletons.COROUTINE_SUSPENDED ? objC : kotlin.L0.f217464a;
    }

    public final void G() {
        Transition<S> transition = this.f87797f;
        if (transition != null) {
            transition.g();
        }
        this.f87805n.k0();
        if (this.f87806o != null) {
            this.f87806o = null;
            W(1.0f);
            T();
        }
    }

    public final S H() {
        return this.f87796e;
    }

    @Nullable
    public final InterfaceC5100n<S> I() {
        return this.f87801j;
    }

    @NotNull
    public final kotlinx.coroutines.sync.a J() {
        return this.f87802k;
    }

    @InterfaceC4348w(from = 0.0d, to = 1.0d)
    public final float K() {
        return this.f87800i.getFloatValue();
    }

    public final long L() {
        return this.f87798g;
    }

    public final void M() {
        Transition<S> transition = this.f87797f;
        if (transition == null) {
            return;
        }
        b bVar = this.f87806o;
        if (bVar == null) {
            if (this.f87798g <= 0 || this.f87800i.getFloatValue() == 1.0f || kotlin.jvm.internal.G.g(this.f87795d.getValue(), this.f87794c.getValue())) {
                bVar = null;
            } else {
                bVar = new b();
                bVar.f87827d = this.f87800i.getFloatValue();
                long j10 = this.f87798g;
                bVar.f87830g = j10;
                bVar.f87831h = C4806d.M0((1.0d - ((double) this.f87800i.getFloatValue())) * j10);
                bVar.f87828e.e(0, this.f87800i.getFloatValue());
            }
        }
        if (bVar != null) {
            bVar.f87830g = this.f87798g;
            this.f87805n.Z(bVar);
            transition.L(bVar);
        }
        this.f87806o = null;
    }

    public final void N() {
        TransitionKt.o().q(this, TransitionKt.f87953b, this.f87799h);
    }

    public final void O() {
        long j10 = this.f87798g;
        N();
        long j11 = this.f87798g;
        if (j10 != j11) {
            b bVar = this.f87806o;
            if (bVar == null) {
                if (j11 != 0) {
                    T();
                }
            } else {
                bVar.f87830g = j11;
                if (bVar.f87825b == null) {
                    bVar.f87831h = C4806d.M0((1.0d - ((double) bVar.f87828e.a(0))) * this.f87798g);
                }
            }
        }
    }

    public final void P(b bVar, long j10) {
        long j11 = bVar.f87824a + j10;
        bVar.f87824a = j11;
        long j12 = bVar.f87831h;
        if (j11 >= j12) {
            bVar.f87827d = 1.0f;
            return;
        }
        K0<C1595l> k02 = bVar.f87825b;
        if (k02 == null) {
            bVar.f87827d = VectorConvertersKt.k(bVar.f87828e.a(0), 1.0f, j11 / j12);
            return;
        }
        C1595l c1595l = bVar.f87828e;
        C1595l c1595l2 = f87793v;
        C1595l c1595l3 = bVar.f87829f;
        if (c1595l3 == null) {
            c1595l3 = f87792u;
        }
        bVar.f87827d = md.u.J(((C1595l) k02.e(j11, c1595l, c1595l2, c1595l3)).a(0), 0.0f, 1.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0078, code lost:
    
        if (androidx.compose.runtime.MonotonicFrameClockKt.a(r0.getContext()).B1(r10, r0) == r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object Q(kotlin.coroutines.e<? super kotlin.L0> r10) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r10 instanceof androidx.compose.animation.core.SeekableTransitionState$runAnimations$1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.animation.core.SeekableTransitionState$runAnimations$1 r0 = (androidx.compose.animation.core.SeekableTransitionState$runAnimations$1) r0
            int r1 = r0.f87837d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f87837d = r1
            goto L18
        L13:
            androidx.compose.animation.core.SeekableTransitionState$runAnimations$1 r0 = new androidx.compose.animation.core.SeekableTransitionState$runAnimations$1
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.f87835b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f87837d
            r3 = 2
            r4 = 1
            r5 = -9223372036854775808
            if (r2 == 0) goto L39
            if (r2 == r4) goto L31
            if (r2 != r3) goto L29
            goto L31
        L29:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L31:
            java.lang.Object r2 = r0.f87834a
            androidx.compose.animation.core.SeekableTransitionState r2 = (androidx.compose.animation.core.SeekableTransitionState) r2
            kotlin.C4885d0.n(r10)
            goto L7c
        L39:
            kotlin.C4885d0.n(r10)
            androidx.collection.G0<androidx.compose.animation.core.SeekableTransitionState$b> r10 = r9.f87805n
            boolean r10 = r10.H()
            if (r10 == 0) goto L4b
            androidx.compose.animation.core.SeekableTransitionState$b r10 = r9.f87806o
            if (r10 != 0) goto L4b
            kotlin.L0 r10 = kotlin.L0.f217464a
            return r10
        L4b:
            kotlin.coroutines.i r10 = r0.getContext()
            float r10 = androidx.compose.animation.core.SuspendAnimationKt.q(r10)
            r2 = 0
            int r10 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r10 != 0) goto L60
            r9.G()
            r9.f87804m = r5
            kotlin.L0 r10 = kotlin.L0.f217464a
            return r10
        L60:
            long r7 = r9.f87804m
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 != 0) goto L7b
            ed.l<java.lang.Long, kotlin.L0> r10 = r9.f87807p
            r0.f87834a = r9
            r0.f87837d = r4
            kotlin.coroutines.i r2 = r0.getContext()
            androidx.compose.runtime.y0 r2 = androidx.compose.runtime.MonotonicFrameClockKt.a(r2)
            java.lang.Object r10 = r2.B1(r10, r0)
            if (r10 != r1) goto L7b
            goto L98
        L7b:
            r2 = r9
        L7c:
            androidx.collection.G0<androidx.compose.animation.core.SeekableTransitionState$b> r10 = r2.f87805n
            boolean r10 = r10.I()
            if (r10 != 0) goto L8e
            androidx.compose.animation.core.SeekableTransitionState$b r10 = r2.f87806o
            if (r10 == 0) goto L89
            goto L8e
        L89:
            r2.f87804m = r5
            kotlin.L0 r10 = kotlin.L0.f217464a
            return r10
        L8e:
            r0.f87834a = r2
            r0.f87837d = r3
            java.lang.Object r10 = r2.C(r0)
            if (r10 != r1) goto L7c
        L98:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SeekableTransitionState.Q(kotlin.coroutines.e):java.lang.Object");
    }

    @Nullable
    public final Object R(@InterfaceC4348w(from = 0.0d, to = 1.0d) float f10, S s10, @NotNull kotlin.coroutines.e<? super kotlin.L0> eVar) {
        if (0.0f > f10 || f10 > 1.0f) {
            C1602o0.d("Expecting fraction between 0 and 1. Got " + f10);
            throw null;
        }
        Transition<S> transition = this.f87797f;
        if (transition == null) {
            return kotlin.L0.f217464a;
        }
        Object objE = MutatorMutex.e(this.f87803l, null, new SeekableTransitionState$seekTo$3(s10, this.f87794c.getValue(), this, transition, f10, null), eVar, 1, null);
        return objE == CoroutineSingletons.COROUTINE_SUSPENDED ? objE : kotlin.L0.f217464a;
    }

    public final void T() {
        Transition<S> transition = this.f87797f;
        if (transition == null) {
            return;
        }
        transition.K(C4806d.M0(((double) this.f87800i.getFloatValue()) * transition.s()));
    }

    public final void U(S s10) {
        this.f87796e = s10;
    }

    public final void V(@Nullable InterfaceC5100n<? super S> interfaceC5100n) {
        this.f87801j = interfaceC5100n;
    }

    public final void W(float f10) {
        this.f87800i.setFloatValue(f10);
    }

    public final void X(long j10) {
        this.f87798g = j10;
    }

    @Nullable
    public final Object Y(S s10, @NotNull kotlin.coroutines.e<? super kotlin.L0> eVar) {
        Transition<S> transition = this.f87797f;
        if (transition == null) {
            return kotlin.L0.f217464a;
        }
        if (kotlin.jvm.internal.G.g(this.f87795d.getValue(), s10) && kotlin.jvm.internal.G.g(this.f87794c.getValue(), s10)) {
            return kotlin.L0.f217464a;
        }
        Object objE = MutatorMutex.e(this.f87803l, null, new SeekableTransitionState$snapTo$2(this, s10, transition, null), eVar, 1, null);
        return objE == CoroutineSingletons.COROUTINE_SUSPENDED ? objE : kotlin.L0.f217464a;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object Z(kotlin.coroutines.e<? super kotlin.L0> r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof androidx.compose.animation.core.SeekableTransitionState$waitForComposition$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.animation.core.SeekableTransitionState$waitForComposition$1 r0 = (androidx.compose.animation.core.SeekableTransitionState$waitForComposition$1) r0
            int r1 = r0.f87861e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f87861e = r1
            goto L18
        L13:
            androidx.compose.animation.core.SeekableTransitionState$waitForComposition$1 r0 = new androidx.compose.animation.core.SeekableTransitionState$waitForComposition$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f87859c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f87861e
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L44
            if (r2 == r5) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r1 = r0.f87858b
            java.lang.Object r0 = r0.f87857a
            androidx.compose.animation.core.SeekableTransitionState r0 = (androidx.compose.animation.core.SeekableTransitionState) r0
            kotlin.C4885d0.n(r8)
            goto L80
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L39:
            java.lang.Object r2 = r0.f87858b
            java.lang.Object r6 = r0.f87857a
            androidx.compose.animation.core.SeekableTransitionState r6 = (androidx.compose.animation.core.SeekableTransitionState) r6
            kotlin.C4885d0.n(r8)
            r8 = r2
            goto L5d
        L44:
            kotlin.C4885d0.n(r8)
            androidx.compose.runtime.L0 r8 = r7.f87794c
            java.lang.Object r8 = r8.getValue()
            kotlinx.coroutines.sync.a r2 = r7.f87802k
            r0.f87857a = r7
            r0.f87858b = r8
            r0.f87861e = r5
            java.lang.Object r2 = kotlinx.coroutines.sync.a.C0832a.b(r2, r4, r0, r5, r4)
            if (r2 != r1) goto L5c
            goto L7c
        L5c:
            r6 = r7
        L5d:
            r0.f87857a = r6
            r0.f87858b = r8
            r0.f87861e = r3
            kotlinx.coroutines.o r2 = new kotlinx.coroutines.o
            kotlin.coroutines.e r0 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.e(r0)
            r2.<init>(r0, r5)
            r2.n0()
            r6.f87801j = r2
            kotlinx.coroutines.sync.a r0 = r6.f87802k
            kotlinx.coroutines.sync.a.C0832a.d(r0, r4, r5, r4)
            java.lang.Object r0 = r2.z()
            if (r0 != r1) goto L7d
        L7c:
            return r1
        L7d:
            r1 = r8
            r8 = r0
            r0 = r6
        L80:
            boolean r8 = kotlin.jvm.internal.G.g(r8, r1)
            if (r8 == 0) goto L89
            kotlin.L0 r8 = kotlin.L0.f217464a
            return r8
        L89:
            r1 = -9223372036854775808
            r0.f87804m = r1
            java.util.concurrent.CancellationException r8 = new java.util.concurrent.CancellationException
            java.lang.String r0 = "targetState while waiting for composition"
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SeekableTransitionState.Z(kotlin.coroutines.e):java.lang.Object");
    }

    @Override // androidx.compose.animation.core.F0
    public S a() {
        return (S) this.f87795d.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a0(kotlin.coroutines.e<? super kotlin.L0> r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof androidx.compose.animation.core.SeekableTransitionState$waitForCompositionAfterTargetStateChange$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.animation.core.SeekableTransitionState$waitForCompositionAfterTargetStateChange$1 r0 = (androidx.compose.animation.core.SeekableTransitionState$waitForCompositionAfterTargetStateChange$1) r0
            int r1 = r0.f87866e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f87866e = r1
            goto L18
        L13:
            androidx.compose.animation.core.SeekableTransitionState$waitForCompositionAfterTargetStateChange$1 r0 = new androidx.compose.animation.core.SeekableTransitionState$waitForCompositionAfterTargetStateChange$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f87864c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f87866e
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L44
            if (r2 == r5) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r1 = r0.f87863b
            java.lang.Object r0 = r0.f87862a
            androidx.compose.animation.core.SeekableTransitionState r0 = (androidx.compose.animation.core.SeekableTransitionState) r0
            kotlin.C4885d0.n(r8)
            goto L8e
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L39:
            java.lang.Object r2 = r0.f87863b
            java.lang.Object r6 = r0.f87862a
            androidx.compose.animation.core.SeekableTransitionState r6 = (androidx.compose.animation.core.SeekableTransitionState) r6
            kotlin.C4885d0.n(r8)
            r8 = r2
            goto L5d
        L44:
            kotlin.C4885d0.n(r8)
            androidx.compose.runtime.L0 r8 = r7.f87794c
            java.lang.Object r8 = r8.getValue()
            kotlinx.coroutines.sync.a r2 = r7.f87802k
            r0.f87862a = r7
            r0.f87863b = r8
            r0.f87866e = r5
            java.lang.Object r2 = kotlinx.coroutines.sync.a.C0832a.b(r2, r4, r0, r5, r4)
            if (r2 != r1) goto L5c
            goto L8a
        L5c:
            r6 = r7
        L5d:
            S r2 = r6.f87796e
            boolean r2 = kotlin.jvm.internal.G.g(r8, r2)
            if (r2 == 0) goto L6b
            kotlinx.coroutines.sync.a r8 = r6.f87802k
            kotlinx.coroutines.sync.a.C0832a.d(r8, r4, r5, r4)
            goto L94
        L6b:
            r0.f87862a = r6
            r0.f87863b = r8
            r0.f87866e = r3
            kotlinx.coroutines.o r2 = new kotlinx.coroutines.o
            kotlin.coroutines.e r0 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.e(r0)
            r2.<init>(r0, r5)
            r2.n0()
            r6.f87801j = r2
            kotlinx.coroutines.sync.a r0 = r6.f87802k
            kotlinx.coroutines.sync.a.C0832a.d(r0, r4, r5, r4)
            java.lang.Object r0 = r2.z()
            if (r0 != r1) goto L8b
        L8a:
            return r1
        L8b:
            r1 = r8
            r8 = r0
            r0 = r6
        L8e:
            boolean r2 = kotlin.jvm.internal.G.g(r8, r1)
            if (r2 == 0) goto L97
        L94:
            kotlin.L0 r8 = kotlin.L0.f217464a
            return r8
        L97:
            r2 = -9223372036854775808
            r0.f87804m = r2
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "snapTo() was canceled because state was changed to "
            r2.<init>(r3)
            r2.append(r8)
            java.lang.String r8 = " instead of "
            r2.append(r8)
            r2.append(r1)
            java.lang.String r8 = r2.toString()
            r0.<init>(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SeekableTransitionState.a0(kotlin.coroutines.e):java.lang.Object");
    }

    @Override // androidx.compose.animation.core.F0
    public S b() {
        return (S) this.f87794c.getValue();
    }

    @Override // androidx.compose.animation.core.F0
    public void d(S s10) {
        this.f87795d.setValue(s10);
    }

    @Override // androidx.compose.animation.core.F0
    public void f(S s10) {
        this.f87794c.setValue(s10);
    }

    @Override // androidx.compose.animation.core.F0
    public void g(@NotNull Transition<S> transition) {
        Transition<S> transition2 = this.f87797f;
        if (transition2 == null || kotlin.jvm.internal.G.g(transition, transition2)) {
            this.f87797f = transition;
            return;
        }
        C1602o0.e("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.f87797f + ", new instance: " + transition);
        throw null;
    }

    @Override // androidx.compose.animation.core.F0
    public void h() {
        this.f87797f = null;
        TransitionKt.o().k(this);
    }
}
