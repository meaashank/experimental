package androidx.compose.material;

import androidx.compose.animation.core.InterfaceC1587h;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.runtime.ActualAndroid_androidKt;
import androidx.compose.runtime.M1;
import androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt;
import androidx.compose.runtime.T1;
import androidx.compose.runtime.X1;
import androidx.compose.runtime.saveable.SaverKt;
import ed.InterfaceC4376a;
import java.util.List;
import java.util.Map;
import kotlin.InterfaceC4982o;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.C4969v;
import kotlinx.coroutines.flow.FlowKt__LimitKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nSwipeable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material/SwipeableState\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 7 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,909:1\n21#2:910\n23#2:914\n50#3:911\n55#3:913\n107#4:912\n81#5:915\n107#5,2:916\n81#5:918\n107#5,2:919\n81#5:921\n107#5,2:922\n81#5:952\n107#5,2:953\n81#5:958\n107#5,2:959\n2333#6,14:924\n2333#6,14:938\n79#7:955\n112#7,2:956\n1#8:961\n*S KotlinDebug\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material/SwipeableState\n*L\n134#1:910\n134#1:914\n134#1:911\n134#1:913\n134#1:912\n97#1:915\n97#1:916,2\n103#1:918\n103#1:919,2\n130#1:921\n130#1:922,2\n201#1:952\n201#1:953,2\n205#1:958\n205#1:959,2\n180#1:924,14\n186#1:938,14\n203#1:955\n203#1:956,2\n*E\n"})
@P
@T1
@InterfaceC4982o(message = SwipeableKt.f97668a)
public class SwipeableState<T> {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public static final Companion f97726q = new Companion();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f97727r = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final InterfaceC1587h<Float> f97728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ed.l<T, Boolean> f97729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final androidx.compose.runtime.L0 f97730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final androidx.compose.runtime.L0 f97731d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final androidx.compose.runtime.F0 f97732e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final androidx.compose.runtime.F0 f97733f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final androidx.compose.runtime.F0 f97734g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final androidx.compose.runtime.L0<Float> f97735h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final androidx.compose.runtime.L0 f97736i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final kotlinx.coroutines.flow.e<Map<Float, T>> f97737j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f97738k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f97739l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final androidx.compose.runtime.L0 f97740m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final androidx.compose.runtime.F0 f97741n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final androidx.compose.runtime.L0 f97742o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final androidx.compose.foundation.gestures.p f97743p;

    public static final class Companion {
        public Companion() {
        }

        @NotNull
        public final <T> androidx.compose.runtime.saveable.e<SwipeableState<T>, T> a(@NotNull final InterfaceC1587h<Float> interfaceC1587h, @NotNull final ed.l<? super T, Boolean> lVar) {
            return SaverKt.a(new ed.p<androidx.compose.runtime.saveable.f, SwipeableState<T>, T>() { // from class: androidx.compose.material.SwipeableState$Companion$Saver$1
                @Nullable
                public final T e(@NotNull androidx.compose.runtime.saveable.f fVar, @NotNull SwipeableState<T> swipeableState) {
                    return swipeableState.f97730c.getValue();
                }

                @Override // ed.p
                public Object invoke(androidx.compose.runtime.saveable.f fVar, Object obj) {
                    return ((SwipeableState) obj).f97730c.getValue();
                }
            }, new ed.l<T, SwipeableState<T>>() { // from class: androidx.compose.material.SwipeableState$Companion$Saver$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // ed.l
                @Nullable
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public final SwipeableState<T> invoke(@NotNull T t10) {
                    return new SwipeableState<>(t10, interfaceC1587h, lVar);
                }
            });
        }

        public Companion(C4969v c4969v) {
        }
    }

    public static final class a<T> implements kotlinx.coroutines.flow.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SwipeableState<T> f97748a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f97749b;

        public a(SwipeableState<T> swipeableState, float f10) {
            this.f97748a = swipeableState;
            this.f97749b = f10;
        }

        @Override // kotlinx.coroutines.flow.f
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(@NotNull Map<Float, ? extends T> map, @NotNull kotlin.coroutines.e<? super kotlin.L0> eVar) {
            Float f10 = SwipeableKt.f(map, this.f97748a.f97730c.getValue());
            kotlin.jvm.internal.G.m(f10);
            float fFloatValue = f10.floatValue();
            T t10 = map.get(new Float(SwipeableKt.d(this.f97748a.f97732e.getValue().floatValue(), fFloatValue, map.keySet(), this.f97748a.C(), this.f97749b, this.f97748a.f97741n.getFloatValue())));
            if (t10 != null && this.f97748a.f97729b.invoke(t10).booleanValue()) {
                Object objK = SwipeableState.k(this.f97748a, t10, null, eVar, 2, null);
                return objK == CoroutineSingletons.COROUTINE_SUSPENDED ? objK : kotlin.L0.f217464a;
            }
            SwipeableState<T> swipeableState = this.f97748a;
            Object objI = swipeableState.i(fFloatValue, swipeableState.f97728a, eVar);
            return objI == CoroutineSingletons.COROUTINE_SUSPENDED ? objI : kotlin.L0.f217464a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SwipeableState(T t10, @NotNull InterfaceC1587h<Float> interfaceC1587h, @NotNull ed.l<? super T, Boolean> lVar) {
        this.f97728a = interfaceC1587h;
        this.f97729b = lVar;
        this.f97730c = M1.g(t10, null, 2, null);
        this.f97731d = M1.g(Boolean.FALSE, null, 2, null);
        this.f97732e = ActualAndroid_androidKt.b(0.0f);
        this.f97733f = ActualAndroid_androidKt.b(0.0f);
        this.f97734g = ActualAndroid_androidKt.b(0.0f);
        this.f97735h = M1.g(null, null, 2, null);
        this.f97736i = M1.g(kotlin.collections.n0.z(), null, 2, null);
        final kotlinx.coroutines.flow.e eVarE = SnapshotStateKt__SnapshotFlowKt.e(new InterfaceC4376a<Map<Float, ? extends T>>(this) { // from class: androidx.compose.material.SwipeableState$latestNonEmptyAnchorsFlow$1

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ SwipeableState<T> f97766d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.f97766d = this;
            }

            @NotNull
            public final Map<Float, T> g() {
                return this.f97766d.m();
            }

            @Override // ed.InterfaceC4376a
            public Object invoke() {
                return this.f97766d.m();
            }
        });
        this.f97737j = FlowKt__LimitKt.g(new kotlinx.coroutines.flow.e<Map<Float, ? extends T>>() { // from class: androidx.compose.material.SwipeableState$special$$inlined$filter$1

            /* JADX INFO: renamed from: androidx.compose.material.SwipeableState$special$$inlined$filter$1$2, reason: invalid class name */
            @kotlin.jvm.internal.V({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Swipeable.kt\nandroidx/compose/material/SwipeableState\n*L\n1#1,222:1\n22#2:223\n23#2:225\n134#3:224\n*E\n"})
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.f {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ kotlinx.coroutines.flow.f f97784a;

                /* JADX INFO: renamed from: androidx.compose.material.SwipeableState$special$$inlined$filter$1$2$1, reason: invalid class name */
                @kotlin.jvm.internal.V({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                @Vc.d(c = "androidx.compose.material.SwipeableState$special$$inlined$filter$1$2", f = "Swipeable.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public /* synthetic */ Object f97785a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public int f97786b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public Object f97787c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public Object f97788d;

                    public AnonymousClass1(kotlin.coroutines.e eVar) {
                        super(eVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.f97785a = obj;
                        this.f97786b |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.f fVar) {
                    this.f97784a = fVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.f
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.e r6) throws java.lang.Throwable {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof androidx.compose.material.SwipeableState$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        androidx.compose.material.SwipeableState$special$$inlined$filter$1$2$1 r0 = (androidx.compose.material.SwipeableState$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.f97786b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f97786b = r1
                        goto L18
                    L13:
                        androidx.compose.material.SwipeableState$special$$inlined$filter$1$2$1 r0 = new androidx.compose.material.SwipeableState$special$$inlined$filter$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f97785a
                        kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                        int r2 = r0.f97786b
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        kotlin.C4885d0.n(r6)
                        goto L46
                    L27:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L2f:
                        kotlin.C4885d0.n(r6)
                        kotlinx.coroutines.flow.f r6 = r4.f97784a
                        r2 = r5
                        java.util.Map r2 = (java.util.Map) r2
                        boolean r2 = r2.isEmpty()
                        if (r2 != 0) goto L46
                        r0.f97786b = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L46
                        return r1
                    L46:
                        kotlin.L0 r5 = kotlin.L0.f217464a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeableState$special$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.e):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.e
            @Nullable
            public Object collect(@NotNull kotlinx.coroutines.flow.f fVar, @NotNull kotlin.coroutines.e eVar) {
                Object objCollect = eVarE.collect(new AnonymousClass2(fVar), eVar);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : kotlin.L0.f217464a;
            }
        }, 1);
        this.f97738k = Float.NEGATIVE_INFINITY;
        this.f97739l = Float.POSITIVE_INFINITY;
        this.f97740m = M1.g(new ed.p<Float, Float, Float>() { // from class: androidx.compose.material.SwipeableState$thresholds$2
            @NotNull
            public final Float e(float f10, float f11) {
                return Float.valueOf(0.0f);
            }

            @Override // ed.p
            public /* bridge */ /* synthetic */ Float invoke(Float f10, Float f11) {
                f10.floatValue();
                f11.floatValue();
                return Float.valueOf(0.0f);
            }
        }, null, 2, null);
        this.f97741n = ActualAndroid_androidKt.b(0.0f);
        this.f97742o = M1.g(null, null, 2, null);
        this.f97743p = DraggableKt.a(new ed.l<Float, kotlin.L0>(this) { // from class: androidx.compose.material.SwipeableState$draggableState$1

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ SwipeableState<T> f97765d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.f97765d = this;
            }

            public final void e(float f10) {
                float floatValue = this.f97765d.f97734g.getFloatValue() + f10;
                SwipeableState<T> swipeableState = this.f97765d;
                float fJ = md.u.J(floatValue, swipeableState.f97738k, swipeableState.f97739l);
                float f11 = floatValue - fJ;
                o0 o0VarZ = this.f97765d.z();
                this.f97765d.f97732e.setFloatValue(fJ + (o0VarZ != null ? o0VarZ.a(f11) : 0.0f));
                this.f97765d.f97733f.setFloatValue(f11);
                this.f97765d.f97734g.setFloatValue(floatValue);
            }

            @Override // ed.l
            public /* bridge */ /* synthetic */ kotlin.L0 invoke(Float f10) {
                e(f10.floatValue());
                return kotlin.L0.f217464a;
            }
        });
    }

    @P
    public static /* synthetic */ void B() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object k(SwipeableState swipeableState, Object obj, InterfaceC1587h interfaceC1587h, kotlin.coroutines.e eVar, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateTo");
        }
        if ((i10 & 2) != 0) {
            interfaceC1587h = swipeableState.f97728a;
        }
        return swipeableState.j(obj, interfaceC1587h, eVar);
    }

    @P
    public static /* synthetic */ void r() {
    }

    @P
    public static /* synthetic */ void y() {
    }

    public final T A() {
        float fD;
        Float value = this.f97735h.getValue();
        if (value != null) {
            fD = value.floatValue();
        } else {
            float fFloatValue = this.f97732e.getValue().floatValue();
            Float f10 = SwipeableKt.f(m(), this.f97730c.getValue());
            fD = SwipeableKt.d(fFloatValue, f10 != null ? f10.floatValue() : this.f97732e.getValue().floatValue(), m().keySet(), C(), 0.0f, Float.POSITIVE_INFINITY);
        }
        T t10 = m().get(Float.valueOf(fD));
        return t10 == null ? this.f97730c.getValue() : t10;
    }

    @NotNull
    public final ed.p<Float, Float, Float> C() {
        return (ed.p) this.f97740m.getValue();
    }

    public final float D() {
        return this.f97741n.getFloatValue();
    }

    public final boolean E() {
        return ((Boolean) this.f97731d.getValue()).booleanValue();
    }

    public final float F(float f10) {
        float fJ = md.u.J(this.f97734g.getFloatValue() + f10, this.f97738k, this.f97739l) - this.f97734g.getFloatValue();
        if (Math.abs(fJ) > 0.0f) {
            this.f97743p.b(fJ);
        }
        return fJ;
    }

    @Nullable
    public final Object G(float f10, @NotNull kotlin.coroutines.e<? super kotlin.L0> eVar) {
        Object objCollect = this.f97737j.collect(new a(this, f10), eVar);
        return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : kotlin.L0.f217464a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x009f, code lost:
    
        if (Q(r10, r0) == r1) goto L86;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0217  */
    /* JADX WARN: Type inference failed for: r10v21, types: [float] */
    /* JADX WARN: Type inference failed for: r10v75, types: [float] */
    /* JADX WARN: Type inference failed for: r10v77, types: [float] */
    /* JADX WARN: Type inference failed for: r10v88 */
    /* JADX WARN: Type inference failed for: r10v89 */
    /* JADX WARN: Type inference failed for: r10v90 */
    /* JADX WARN: Type inference failed for: r10v91 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object H(@org.jetbrains.annotations.NotNull java.util.Map<java.lang.Float, ? extends T> r10, @org.jetbrains.annotations.NotNull java.util.Map<java.lang.Float, ? extends T> r11, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.L0> r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 641
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeableState.H(java.util.Map, java.util.Map, kotlin.coroutines.e):java.lang.Object");
    }

    public final void I(@NotNull Map<Float, ? extends T> map) {
        this.f97736i.setValue(map);
    }

    public final void J(boolean z10) {
        this.f97731d.setValue(Boolean.valueOf(z10));
    }

    public final void K(T t10) {
        this.f97730c.setValue(t10);
    }

    public final void L(float f10) {
        this.f97739l = f10;
    }

    public final void M(float f10) {
        this.f97738k = f10;
    }

    public final void N(@Nullable o0 o0Var) {
        this.f97742o.setValue(o0Var);
    }

    public final void O(@NotNull ed.p<? super Float, ? super Float, Float> pVar) {
        this.f97740m.setValue(pVar);
    }

    public final void P(float f10) {
        this.f97741n.setFloatValue(f10);
    }

    public final Object Q(float f10, kotlin.coroutines.e<? super kotlin.L0> eVar) {
        Object objA = androidx.compose.foundation.gestures.o.a(this.f97743p, null, new SwipeableState$snapInternalToOffset$2(f10, this, null), eVar, 1, null);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : kotlin.L0.f217464a;
    }

    @P
    @Nullable
    public final Object R(T t10, @NotNull kotlin.coroutines.e<? super kotlin.L0> eVar) {
        Object objCollect = this.f97737j.collect(new SwipeableState$snapTo$2(t10, this), eVar);
        return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : kotlin.L0.f217464a;
    }

    public final Object i(float f10, InterfaceC1587h<Float> interfaceC1587h, kotlin.coroutines.e<? super kotlin.L0> eVar) {
        Object objA = androidx.compose.foundation.gestures.o.a(this.f97743p, null, new SwipeableState$animateInternalToOffset$2(this, f10, interfaceC1587h, null), eVar, 1, null);
        return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : kotlin.L0.f217464a;
    }

    @P
    @Nullable
    public final Object j(T t10, @NotNull InterfaceC1587h<Float> interfaceC1587h, @NotNull kotlin.coroutines.e<? super kotlin.L0> eVar) {
        Object objCollect = this.f97737j.collect(new SwipeableState$animateTo$2(t10, this, interfaceC1587h), eVar);
        return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : kotlin.L0.f217464a;
    }

    public final void l(@NotNull Map<Float, ? extends T> map) {
        if (m().isEmpty()) {
            Float f10 = SwipeableKt.f(map, this.f97730c.getValue());
            if (f10 == null) {
                throw new IllegalArgumentException("The initial value must have an associated anchor.");
            }
            this.f97732e.setFloatValue(f10.floatValue());
            this.f97734g.setFloatValue(f10.floatValue());
        }
    }

    @NotNull
    public final Map<Float, T> m() {
        return (Map) this.f97736i.getValue();
    }

    @NotNull
    public final InterfaceC1587h<Float> n() {
        return this.f97728a;
    }

    @NotNull
    public final ed.l<T, Boolean> o() {
        return this.f97729b;
    }

    public final T p() {
        return this.f97730c.getValue();
    }

    public final float q() {
        Float f10 = SwipeableKt.f(m(), this.f97730c.getValue());
        if (f10 == null) {
            return 0.0f;
        }
        return Math.signum(this.f97732e.getValue().floatValue() - f10.floatValue());
    }

    @NotNull
    public final androidx.compose.foundation.gestures.p s() {
        return this.f97743p;
    }

    public final float t() {
        return this.f97739l;
    }

    public final float u() {
        return this.f97738k;
    }

    @NotNull
    public final X1<Float> v() {
        return this.f97732e;
    }

    @NotNull
    public final X1<Float> w() {
        return this.f97733f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final C0<T> x() {
        Object value;
        Object objK;
        float fFloatValue;
        List<Float> listE = SwipeableKt.e(this.f97732e.getValue().floatValue(), m().keySet());
        int size = listE.size();
        if (size == 0) {
            T value2 = this.f97730c.getValue();
            value = this.f97730c.getValue();
            objK = value2;
            fFloatValue = 1.0f;
        } else if (size != 1) {
            Pair pair = q() > 0.0f ? new Pair(listE.get(0), listE.get(1)) : new Pair(listE.get(1), listE.get(0));
            float fFloatValue2 = ((Number) pair.f217467a).floatValue();
            float fFloatValue3 = ((Number) pair.f217468b).floatValue();
            objK = kotlin.collections.n0.K(m(), Float.valueOf(fFloatValue2));
            value = kotlin.collections.n0.K(m(), Float.valueOf(fFloatValue3));
            fFloatValue = (this.f97732e.getValue().floatValue() - fFloatValue2) / (fFloatValue3 - fFloatValue2);
        } else {
            Object objK2 = kotlin.collections.n0.K(m(), listE.get(0));
            value = kotlin.collections.n0.K(m(), listE.get(0));
            fFloatValue = 1.0f;
            objK = objK2;
        }
        return new C0<>(objK, value, fFloatValue);
    }

    @Nullable
    public final o0 z() {
        return (o0) this.f97742o.getValue();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SwipeableState(Object obj, InterfaceC1587h interfaceC1587h, ed.l lVar, int i10, C4969v c4969v) {
        if ((i10 & 2) != 0) {
            D0.f95961a.getClass();
            interfaceC1587h = D0.f95962b;
        }
        this(obj, interfaceC1587h, (i10 & 4) != 0 ? new ed.l<T, Boolean>() { // from class: androidx.compose.material.SwipeableState.1
            @NotNull
            public final Boolean e(T t10) {
                return Boolean.TRUE;
            }

            @Override // ed.l
            public /* bridge */ /* synthetic */ Boolean invoke(Object obj2) {
                return Boolean.TRUE;
            }
        } : lVar);
    }
}
