package androidx.compose.material;

import androidx.compose.animation.core.InterfaceC1587h;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.runtime.ActualAndroid_androidKt;
import androidx.compose.runtime.K1;
import androidx.compose.runtime.L1;
import androidx.compose.runtime.M1;
import androidx.compose.runtime.T1;
import androidx.compose.runtime.X1;
import androidx.compose.runtime.saveable.SaverKt;
import e.InterfaceC4348w;
import ed.InterfaceC4376a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nAnchoredDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/material/AnchoredDraggableState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n*L\n1#1,897:1\n81#2:898\n107#2,2:899\n81#2:901\n81#2:902\n81#2:906\n81#2:910\n107#2,2:911\n81#2:913\n107#2,2:914\n79#3:903\n112#3,2:904\n79#3:907\n112#3,2:908\n*S KotlinDebug\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/material/AnchoredDraggableState\n*L\n304#1:898\n304#1:899,2\n312#1:901\n326#1:902\n371#1:906\n391#1:910\n391#1:911,2\n393#1:913\n393#1:914,2\n343#1:903\n343#1:904,2\n388#1:907\n388#1:908,2\n*E\n"})
@P
@T1
public final class AnchoredDraggableState<T> {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public static final Companion f95168p = new Companion();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f95169q = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ed.l<Float, Float> f95170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final InterfaceC4376a<Float> f95171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final InterfaceC1587h<Float> f95172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ed.l<T, Boolean> f95173d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final InternalMutatorMutex f95174e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final androidx.compose.foundation.gestures.p f95175f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final androidx.compose.runtime.L0 f95176g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final X1 f95177h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final X1 f95178i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final androidx.compose.runtime.F0 f95179j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final X1 f95180k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final androidx.compose.runtime.F0 f95181l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final androidx.compose.runtime.L0 f95182m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final androidx.compose.runtime.L0 f95183n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final InterfaceC1850d f95184o;

    public static final class Companion {
        public Companion() {
        }

        @P
        @NotNull
        public final <T> androidx.compose.runtime.saveable.e<AnchoredDraggableState<T>, T> a(@NotNull final InterfaceC1587h<Float> interfaceC1587h, @NotNull final ed.l<? super T, Boolean> lVar, @NotNull final ed.l<? super Float, Float> lVar2, @NotNull final InterfaceC4376a<Float> interfaceC4376a) {
            return SaverKt.a(new ed.p<androidx.compose.runtime.saveable.f, AnchoredDraggableState<T>, T>() { // from class: androidx.compose.material.AnchoredDraggableState$Companion$Saver$1
                @Nullable
                public final T e(@NotNull androidx.compose.runtime.saveable.f fVar, @NotNull AnchoredDraggableState<T> anchoredDraggableState) {
                    return anchoredDraggableState.f95176g.getValue();
                }

                @Override // ed.p
                public Object invoke(androidx.compose.runtime.saveable.f fVar, Object obj) {
                    return ((AnchoredDraggableState) obj).f95176g.getValue();
                }
            }, new ed.l<T, AnchoredDraggableState<T>>() { // from class: androidx.compose.material.AnchoredDraggableState$Companion$Saver$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // ed.l
                @Nullable
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public final AnchoredDraggableState<T> invoke(@NotNull T t10) {
                    return new AnchoredDraggableState<>(t10, lVar2, interfaceC4376a, interfaceC1587h, lVar);
                }
            });
        }

        public Companion(C4969v c4969v) {
        }
    }

    public static final class a implements InterfaceC1850d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AnchoredDraggableState<T> f95192a;

        public a(AnchoredDraggableState<T> anchoredDraggableState) {
            this.f95192a = anchoredDraggableState;
        }

        @Override // androidx.compose.material.InterfaceC1850d
        public void a(float f10, float f11) {
            this.f95192a.J(f10);
            this.f95192a.I(f11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AnchoredDraggableState(T t10, @NotNull ed.l<? super Float, Float> lVar, @NotNull InterfaceC4376a<Float> interfaceC4376a, @NotNull InterfaceC1587h<Float> interfaceC1587h, @NotNull ed.l<? super T, Boolean> lVar2) {
        this.f95170a = lVar;
        this.f95171b = interfaceC4376a;
        this.f95172c = interfaceC1587h;
        this.f95173d = lVar2;
        this.f95174e = new InternalMutatorMutex();
        this.f95175f = new AnchoredDraggableState$draggableState$1(this);
        this.f95176g = M1.g(t10, null, 2, null);
        this.f95177h = K1.d(new InterfaceC4376a<T>(this) { // from class: androidx.compose.material.AnchoredDraggableState$targetValue$2

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ AnchoredDraggableState<T> f95226d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.f95226d = this;
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
            @Override // ed.InterfaceC4376a
            public final T invoke() {
                T value = this.f95226d.f95182m.getValue();
                if (value != null) {
                    return value;
                }
                AnchoredDraggableState<T> anchoredDraggableState = this.f95226d;
                float floatValue = anchoredDraggableState.f95179j.getFloatValue();
                return !Float.isNaN(floatValue) ? (T) anchoredDraggableState.m(floatValue, anchoredDraggableState.f95176g.getValue(), 0.0f) : anchoredDraggableState.f95176g.getValue();
            }
        });
        this.f95178i = K1.d(new InterfaceC4376a<T>(this) { // from class: androidx.compose.material.AnchoredDraggableState$closestValue$2

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ AnchoredDraggableState<T> f95218d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.f95218d = this;
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
            @Override // ed.InterfaceC4376a
            public final T invoke() {
                T value = this.f95218d.f95182m.getValue();
                if (value != null) {
                    return value;
                }
                AnchoredDraggableState<T> anchoredDraggableState = this.f95218d;
                float floatValue = anchoredDraggableState.f95179j.getFloatValue();
                return !Float.isNaN(floatValue) ? (T) anchoredDraggableState.n(floatValue, anchoredDraggableState.f95176g.getValue()) : anchoredDraggableState.f95176g.getValue();
            }
        });
        this.f95179j = ActualAndroid_androidKt.b(Float.NaN);
        this.f95180k = K1.c(L1.c(), new InterfaceC4376a<Float>(this) { // from class: androidx.compose.material.AnchoredDraggableState$progress$2

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ AnchoredDraggableState<T> f95225d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.f95225d = this;
            }

            @Override // ed.InterfaceC4376a
            @NotNull
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Float invoke() {
                float fE = this.f95225d.p().e(this.f95225d.f95176g.getValue());
                float fE2 = this.f95225d.p().e(this.f95225d.f95178i.getValue()) - fE;
                float fAbs = Math.abs(fE2);
                float f10 = 1.0f;
                if (!Float.isNaN(fAbs) && fAbs > 1.0E-6f) {
                    float fE3 = (this.f95225d.E() - fE) / fE2;
                    if (fE3 < 1.0E-6f) {
                        f10 = 0.0f;
                    } else if (fE3 <= 0.999999f) {
                        f10 = fE3;
                    }
                }
                return Float.valueOf(f10);
            }
        });
        this.f95181l = ActualAndroid_androidKt.b(0.0f);
        this.f95182m = M1.g(null, null, 2, null);
        this.f95183n = M1.g(AnchoredDraggableKt.i(), null, 2, null);
        this.f95184o = new a(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void N(AnchoredDraggableState anchoredDraggableState, J j10, Object obj, int i10, Object obj2) {
        if ((i10 & 2) != 0 && (Float.isNaN(anchoredDraggableState.f95179j.getFloatValue()) || (obj = j10.b(anchoredDraggableState.f95179j.getFloatValue())) == null)) {
            obj = anchoredDraggableState.f95177h.getValue();
        }
        anchoredDraggableState.M(j10, obj);
    }

    public static final Object d(AnchoredDraggableState anchoredDraggableState) {
        return anchoredDraggableState.f95182m.getValue();
    }

    public static /* synthetic */ Object k(AnchoredDraggableState anchoredDraggableState, MutatePriority mutatePriority, ed.q qVar, kotlin.coroutines.e eVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return anchoredDraggableState.i(mutatePriority, qVar, eVar);
    }

    public static /* synthetic */ Object l(AnchoredDraggableState anchoredDraggableState, Object obj, MutatePriority mutatePriority, ed.r rVar, kotlin.coroutines.e eVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return anchoredDraggableState.j(obj, mutatePriority, rVar, eVar);
    }

    public final T A() {
        return (T) this.f95177h.getValue();
    }

    @NotNull
    public final InterfaceC4376a<Float> B() {
        return this.f95171b;
    }

    public final boolean C() {
        return this.f95182m.getValue() != null;
    }

    public final float D(float f10) {
        return md.u.J((Float.isNaN(this.f95179j.getFloatValue()) ? 0.0f : this.f95179j.getFloatValue()) + f10, p().d(), p().f());
    }

    public final float E() {
        if (Float.isNaN(this.f95179j.getFloatValue())) {
            throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return this.f95179j.getFloatValue();
    }

    public final void F(J<T> j10) {
        this.f95183n.setValue(j10);
    }

    public final void G(T t10) {
        this.f95176g.setValue(t10);
    }

    public final void H(T t10) {
        this.f95182m.setValue(t10);
    }

    public final void I(float f10) {
        this.f95181l.setFloatValue(f10);
    }

    public final void J(float f10) {
        this.f95179j.setFloatValue(f10);
    }

    @Nullable
    public final Object K(float f10, @NotNull kotlin.coroutines.e<? super kotlin.L0> eVar) {
        T value = this.f95176g.getValue();
        T tM = m(E(), value, f10);
        if (this.f95173d.invoke(tM).booleanValue()) {
            Object objF = AnchoredDraggableKt.f(this, tM, f10, eVar);
            return objF == CoroutineSingletons.COROUTINE_SUSPENDED ? objF : kotlin.L0.f217464a;
        }
        Object objF2 = AnchoredDraggableKt.f(this, value, f10, eVar);
        return objF2 == CoroutineSingletons.COROUTINE_SUSPENDED ? objF2 : kotlin.L0.f217464a;
    }

    public final boolean L(final T t10) {
        return this.f95174e.h(new InterfaceC4376a<kotlin.L0>(this) { // from class: androidx.compose.material.AnchoredDraggableState$trySnapTo$1

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ AnchoredDraggableState<T> f95227d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.f95227d = this;
            }

            @Override // ed.InterfaceC4376a
            public /* bridge */ /* synthetic */ kotlin.L0 invoke() {
                invoke2();
                return kotlin.L0.f217464a;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                AnchoredDraggableState<T> anchoredDraggableState = this.f95227d;
                InterfaceC1850d interfaceC1850d = anchoredDraggableState.f95184o;
                T t11 = t10;
                float fE = anchoredDraggableState.p().e(t11);
                if (!Float.isNaN(fE)) {
                    C1848c.a(interfaceC1850d, fE, 0.0f, 2, null);
                    anchoredDraggableState.H(null);
                }
                anchoredDraggableState.G(t11);
            }
        });
    }

    public final void M(@NotNull J<T> j10, T t10) {
        if (kotlin.jvm.internal.G.g(p(), j10)) {
            return;
        }
        F(j10);
        if (L(t10)) {
            return;
        }
        H(t10);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(@org.jetbrains.annotations.NotNull androidx.compose.foundation.MutatePriority r7, @org.jetbrains.annotations.NotNull ed.q<? super androidx.compose.material.InterfaceC1850d, ? super androidx.compose.material.J<T>, ? super kotlin.coroutines.e<? super kotlin.L0>, ? extends java.lang.Object> r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.L0> r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof androidx.compose.material.AnchoredDraggableState$anchoredDrag$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.material.AnchoredDraggableState$anchoredDrag$1 r0 = (androidx.compose.material.AnchoredDraggableState$anchoredDrag$1) r0
            int r1 = r0.f95196d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f95196d = r1
            goto L18
        L13:
            androidx.compose.material.AnchoredDraggableState$anchoredDrag$1 r0 = new androidx.compose.material.AnchoredDraggableState$anchoredDrag$1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f95194b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f95196d
            r3 = 1056964608(0x3f000000, float:0.5)
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            java.lang.Object r7 = r0.f95193a
            androidx.compose.material.AnchoredDraggableState r7 = (androidx.compose.material.AnchoredDraggableState) r7
            kotlin.C4885d0.n(r9)     // Catch: java.lang.Throwable -> L2d
            goto L4e
        L2d:
            r8 = move-exception
            goto L8b
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            kotlin.C4885d0.n(r9)
            androidx.compose.material.InternalMutatorMutex r9 = r6.f95174e     // Catch: java.lang.Throwable -> L89
            androidx.compose.material.AnchoredDraggableState$anchoredDrag$2 r2 = new androidx.compose.material.AnchoredDraggableState$anchoredDrag$2     // Catch: java.lang.Throwable -> L89
            r5 = 0
            r2.<init>(r6, r8, r5)     // Catch: java.lang.Throwable -> L89
            r0.f95193a = r6     // Catch: java.lang.Throwable -> L89
            r0.f95196d = r4     // Catch: java.lang.Throwable -> L89
            java.lang.Object r7 = r9.d(r7, r2, r0)     // Catch: java.lang.Throwable -> L89
            if (r7 != r1) goto L4d
            return r1
        L4d:
            r7 = r6
        L4e:
            androidx.compose.material.J r8 = r7.p()
            androidx.compose.runtime.F0 r9 = r7.f95179j
            float r9 = r9.getFloatValue()
            java.lang.Object r8 = r8.b(r9)
            if (r8 == 0) goto L86
            androidx.compose.runtime.F0 r9 = r7.f95179j
            float r9 = r9.getFloatValue()
            androidx.compose.material.J r0 = r7.p()
            float r0 = r0.e(r8)
            float r9 = r9 - r0
            float r9 = java.lang.Math.abs(r9)
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 > 0) goto L86
            ed.l<T, java.lang.Boolean> r9 = r7.f95173d
            java.lang.Object r9 = r9.invoke(r8)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L86
            r7.G(r8)
        L86:
            kotlin.L0 r7 = kotlin.L0.f217464a
            return r7
        L89:
            r8 = move-exception
            r7 = r6
        L8b:
            androidx.compose.material.J r9 = r7.p()
            androidx.compose.runtime.F0 r0 = r7.f95179j
            float r0 = r0.getFloatValue()
            java.lang.Object r9 = r9.b(r0)
            if (r9 == 0) goto Lc3
            androidx.compose.runtime.F0 r0 = r7.f95179j
            float r0 = r0.getFloatValue()
            androidx.compose.material.J r1 = r7.p()
            float r1 = r1.e(r9)
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto Lc3
            ed.l<T, java.lang.Boolean> r0 = r7.f95173d
            java.lang.Object r0 = r0.invoke(r9)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lc3
            r7.G(r9)
        Lc3:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AnchoredDraggableState.i(androidx.compose.foundation.MutatePriority, ed.q, kotlin.coroutines.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(T r7, @org.jetbrains.annotations.NotNull androidx.compose.foundation.MutatePriority r8, @org.jetbrains.annotations.NotNull ed.r<? super androidx.compose.material.InterfaceC1850d, ? super androidx.compose.material.J<T>, ? super T, ? super kotlin.coroutines.e<? super kotlin.L0>, ? extends java.lang.Object> r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.L0> r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AnchoredDraggableState.j(java.lang.Object, androidx.compose.foundation.MutatePriority, ed.r, kotlin.coroutines.e):java.lang.Object");
    }

    public final T m(float f10, T t10, float f11) {
        J<T> jP = p();
        float fE = jP.e(t10);
        float fFloatValue = this.f95171b.invoke().floatValue();
        if (fE != f10 && !Float.isNaN(fE)) {
            if (fE < f10) {
                if (f11 >= fFloatValue) {
                    T tA = jP.a(f10, true);
                    kotlin.jvm.internal.G.m(tA);
                    return tA;
                }
                T tA2 = jP.a(f10, true);
                kotlin.jvm.internal.G.m(tA2);
                if (f10 >= Math.abs(Math.abs(this.f95170a.invoke(Float.valueOf(Math.abs(jP.e(tA2) - fE))).floatValue()) + fE)) {
                    return tA2;
                }
            } else {
                if (f11 <= (-fFloatValue)) {
                    T tA3 = jP.a(f10, false);
                    kotlin.jvm.internal.G.m(tA3);
                    return tA3;
                }
                T tA4 = jP.a(f10, false);
                kotlin.jvm.internal.G.m(tA4);
                float fAbs = Math.abs(fE - Math.abs(this.f95170a.invoke(Float.valueOf(Math.abs(fE - jP.e(tA4)))).floatValue()));
                if (f10 >= 0.0f ? f10 <= fAbs : Math.abs(f10) >= fAbs) {
                    return tA4;
                }
            }
        }
        return t10;
    }

    public final T n(float f10, T t10) {
        J<T> jP = p();
        float fE = jP.e(t10);
        if (fE != f10 && !Float.isNaN(fE)) {
            if (fE < f10) {
                T tA = jP.a(f10, true);
                if (tA != null) {
                    return tA;
                }
            } else {
                T tA2 = jP.a(f10, false);
                if (tA2 != null) {
                    return tA2;
                }
            }
        }
        return t10;
    }

    public final float o(float f10) {
        float fD = D(f10);
        float floatValue = Float.isNaN(this.f95179j.getFloatValue()) ? 0.0f : this.f95179j.getFloatValue();
        J(fD);
        return fD - floatValue;
    }

    @NotNull
    public final J<T> p() {
        return (J) this.f95183n.getValue();
    }

    @NotNull
    public final InterfaceC1587h<Float> q() {
        return this.f95172c;
    }

    public final T r() {
        return (T) this.f95178i.getValue();
    }

    @NotNull
    public final ed.l<T, Boolean> s() {
        return this.f95173d;
    }

    public final T t() {
        return this.f95176g.getValue();
    }

    public final T u() {
        return this.f95182m.getValue();
    }

    @NotNull
    public final androidx.compose.foundation.gestures.p v() {
        return this.f95175f;
    }

    public final float w() {
        return this.f95181l.getFloatValue();
    }

    public final float x() {
        return this.f95179j.getFloatValue();
    }

    @NotNull
    public final ed.l<Float, Float> y() {
        return this.f95170a;
    }

    @InterfaceC4348w(from = 0.0d, to = 1.0d)
    public final float z() {
        return ((Number) this.f95180k.getValue()).floatValue();
    }

    public /* synthetic */ AnchoredDraggableState(Object obj, ed.l lVar, InterfaceC4376a interfaceC4376a, InterfaceC1587h interfaceC1587h, ed.l lVar2, int i10, C4969v c4969v) {
        this(obj, lVar, interfaceC4376a, interfaceC1587h, (i10 & 16) != 0 ? new ed.l<T, Boolean>() { // from class: androidx.compose.material.AnchoredDraggableState.1
            @NotNull
            public final Boolean e(T t10) {
                return Boolean.TRUE;
            }

            @Override // ed.l
            public /* bridge */ /* synthetic */ Boolean invoke(Object obj2) {
                return Boolean.TRUE;
            }
        } : lVar2);
    }

    public /* synthetic */ AnchoredDraggableState(Object obj, J j10, ed.l lVar, InterfaceC4376a interfaceC4376a, InterfaceC1587h interfaceC1587h, ed.l lVar2, int i10, C4969v c4969v) {
        this(obj, j10, lVar, interfaceC4376a, interfaceC1587h, (i10 & 32) != 0 ? new ed.l<T, Boolean>() { // from class: androidx.compose.material.AnchoredDraggableState.2
            @NotNull
            public final Boolean e(T t10) {
                return Boolean.TRUE;
            }

            @Override // ed.l
            public /* bridge */ /* synthetic */ Boolean invoke(Object obj2) {
                return Boolean.TRUE;
            }
        } : lVar2);
    }

    @P
    public AnchoredDraggableState(T t10, @NotNull J<T> j10, @NotNull ed.l<? super Float, Float> lVar, @NotNull InterfaceC4376a<Float> interfaceC4376a, @NotNull InterfaceC1587h<Float> interfaceC1587h, @NotNull ed.l<? super T, Boolean> lVar2) {
        this(t10, lVar, interfaceC4376a, interfaceC1587h, lVar2);
        F(j10);
        L(t10);
    }
}
