package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.InterfaceC1587h;
import androidx.compose.foundation.L;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.ActualAndroid_androidKt;
import androidx.compose.runtime.F0;
import androidx.compose.runtime.K1;
import androidx.compose.runtime.L0;
import androidx.compose.runtime.L1;
import androidx.compose.runtime.M1;
import androidx.compose.runtime.T1;
import androidx.compose.runtime.X1;
import androidx.compose.runtime.saveable.SaverKt;
import e.InterfaceC4348w;
import ed.InterfaceC4376a;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4982o;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@L
@V({"SMAP\nAnchoredDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/foundation/gestures/AnchoredDraggableState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 4 MutatorMutex.kt\nandroidx/compose/foundation/MutatorMutex\n*L\n1#1,1220:1\n81#2:1221\n107#2,2:1222\n81#2:1224\n107#2,2:1225\n81#2:1227\n81#2:1231\n81#2:1235\n107#2,2:1236\n81#2:1238\n107#2,2:1239\n79#3:1228\n112#3,2:1229\n79#3:1232\n112#3,2:1233\n189#4,9:1241\n*S KotlinDebug\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/foundation/gestures/AnchoredDraggableState\n*L\n557#1:1221\n557#1:1222,2\n566#1:1224\n566#1:1225,2\n573#1:1227\n645#1:1231\n665#1:1235\n665#1:1236,2\n667#1:1238\n667#1:1239,2\n590#1:1228\n590#1:1229,2\n662#1:1232\n662#1:1233,2\n928#1:1241,9\n*E\n"})
@T1
public final class AnchoredDraggableState<T> {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public static final Companion f89197p = new Companion();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f89198q = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ed.l<Float, Float> f89199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final InterfaceC4376a<Float> f89200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final InterfaceC1587h<Float> f89201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final androidx.compose.animation.core.C<Float> f89202d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final ed.l<T, Boolean> f89203e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final MutatorMutex f89204f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final L0 f89205g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final L0 f89206h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final X1 f89207i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final F0 f89208j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final X1 f89209k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final F0 f89210l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final L0 f89211m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final L0 f89212n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final a f89213o;

    public static final class Companion {
        public Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ androidx.compose.runtime.saveable.e b(Companion companion, InterfaceC1587h interfaceC1587h, androidx.compose.animation.core.C c10, ed.l lVar, InterfaceC4376a interfaceC4376a, ed.l lVar2, int i10, Object obj) {
            if ((i10 & 16) != 0) {
                lVar2 = new ed.l<T, Boolean>() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState$Companion$Saver$1
                    @NotNull
                    public final Boolean e(@NotNull T t10) {
                        return Boolean.TRUE;
                    }

                    @Override // ed.l
                    public /* bridge */ /* synthetic */ Boolean invoke(Object obj2) {
                        return Boolean.TRUE;
                    }
                };
            }
            return companion.a(interfaceC1587h, c10, lVar, interfaceC4376a, lVar2);
        }

        @L
        @NotNull
        public final <T> androidx.compose.runtime.saveable.e<AnchoredDraggableState<T>, T> a(@NotNull final InterfaceC1587h<Float> interfaceC1587h, @NotNull final androidx.compose.animation.core.C<Float> c10, @NotNull final ed.l<? super Float, Float> lVar, @NotNull final InterfaceC4376a<Float> interfaceC4376a, @NotNull final ed.l<? super T, Boolean> lVar2) {
            return SaverKt.a(new ed.p<androidx.compose.runtime.saveable.f, AnchoredDraggableState<T>, T>() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState$Companion$Saver$2
                @Nullable
                public final T e(@NotNull androidx.compose.runtime.saveable.f fVar, @NotNull AnchoredDraggableState<T> anchoredDraggableState) {
                    return anchoredDraggableState.f89205g.getValue();
                }

                @Override // ed.p
                public Object invoke(androidx.compose.runtime.saveable.f fVar, Object obj) {
                    return ((AnchoredDraggableState) obj).f89205g.getValue();
                }
            }, new ed.l<T, AnchoredDraggableState<T>>() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState$Companion$Saver$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // ed.l
                @Nullable
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public final AnchoredDraggableState<T> invoke(@NotNull T t10) {
                    return new AnchoredDraggableState<>(t10, lVar, interfaceC4376a, interfaceC1587h, c10, lVar2);
                }
            });
        }

        public Companion(C4969v c4969v) {
        }
    }

    public static final class a implements InterfaceC1654b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public T f89223a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public T f89224b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f89225c = Float.NaN;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ AnchoredDraggableState<T> f89226d;

        public a(AnchoredDraggableState<T> anchoredDraggableState) {
            this.f89226d = anchoredDraggableState;
        }

        @Override // androidx.compose.foundation.gestures.InterfaceC1654b
        public void a(float f10, float f11) {
            float floatValue = this.f89226d.f89208j.getFloatValue();
            this.f89226d.J(f10);
            this.f89226d.I(f11);
            if (Float.isNaN(floatValue)) {
                return;
            }
            i(f10 >= floatValue);
        }

        public final float b() {
            return this.f89225c;
        }

        @Nullable
        public final T c() {
            return this.f89223a;
        }

        @Nullable
        public final T d() {
            return this.f89224b;
        }

        public final void e(float f10) {
            this.f89225c = f10;
        }

        public final void f(@Nullable T t10) {
            this.f89223a = t10;
        }

        public final void g(@Nullable T t10) {
            this.f89224b = t10;
        }

        public final void h(boolean z10) {
            if (this.f89226d.f89208j.getFloatValue() == this.f89226d.n().e(this.f89226d.f89205g.getValue())) {
                T tA = this.f89226d.n().a(this.f89226d.f89208j.getFloatValue() + (z10 ? 1.0f : -1.0f), z10);
                if (tA == null) {
                    tA = this.f89226d.f89205g.getValue();
                }
                if (z10) {
                    this.f89223a = this.f89226d.f89205g.getValue();
                    this.f89224b = tA;
                } else {
                    this.f89223a = tA;
                    this.f89224b = this.f89226d.f89205g.getValue();
                }
            } else {
                T tA2 = this.f89226d.n().a(this.f89226d.f89208j.getFloatValue(), false);
                if (tA2 == null) {
                    tA2 = this.f89226d.f89205g.getValue();
                }
                T tA3 = this.f89226d.n().a(this.f89226d.f89208j.getFloatValue(), true);
                if (tA3 == null) {
                    tA3 = this.f89226d.f89205g.getValue();
                }
                this.f89223a = tA2;
                this.f89224b = tA3;
            }
            m<T> mVarN = this.f89226d.n();
            T t10 = this.f89223a;
            kotlin.jvm.internal.G.m(t10);
            float fE = mVarN.e(t10);
            m<T> mVarN2 = this.f89226d.n();
            T t11 = this.f89224b;
            kotlin.jvm.internal.G.m(t11);
            this.f89225c = Math.abs(fE - mVarN2.e(t11));
        }

        public final void i(boolean z10) {
            h(z10);
            if (Math.abs(this.f89226d.f89208j.getFloatValue() - this.f89226d.n().e(this.f89226d.f89205g.getValue())) >= this.f89225c / 2.0f) {
                T value = z10 ? this.f89224b : this.f89223a;
                if (value == null) {
                    value = this.f89226d.f89205g.getValue();
                }
                if (((Boolean) this.f89226d.f89203e.invoke(value)).booleanValue()) {
                    this.f89226d.G(value);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AnchoredDraggableState(T t10, @NotNull ed.l<? super Float, Float> lVar, @NotNull InterfaceC4376a<Float> interfaceC4376a, @NotNull InterfaceC1587h<Float> interfaceC1587h, @NotNull androidx.compose.animation.core.C<Float> c10, @NotNull ed.l<? super T, Boolean> lVar2) {
        this.f89199a = lVar;
        this.f89200b = interfaceC4376a;
        this.f89201c = interfaceC1587h;
        this.f89202d = c10;
        this.f89203e = lVar2;
        this.f89204f = new MutatorMutex();
        this.f89205g = M1.g(t10, null, 2, null);
        this.f89206h = M1.g(t10, null, 2, null);
        this.f89207i = K1.d(new InterfaceC4376a<T>(this) { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState$targetValue$2

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ AnchoredDraggableState<T> f89249d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.f89249d = this;
            }

            @Override // ed.InterfaceC4376a
            public final T invoke() {
                T value = this.f89249d.f89211m.getValue();
                if (value != null) {
                    return value;
                }
                AnchoredDraggableState<T> anchoredDraggableState = this.f89249d;
                if (Float.isNaN(anchoredDraggableState.f89208j.getFloatValue())) {
                    return anchoredDraggableState.f89205g.getValue();
                }
                T tB = anchoredDraggableState.n().b(anchoredDraggableState.f89208j.getFloatValue());
                return tB == null ? anchoredDraggableState.f89205g.getValue() : tB;
            }
        });
        this.f89208j = ActualAndroid_androidKt.b(Float.NaN);
        this.f89209k = K1.c(L1.c(), new InterfaceC4376a<Float>(this) { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState$progress$2

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ AnchoredDraggableState<T> f89248d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.f89248d = this;
            }

            @Override // ed.InterfaceC4376a
            @NotNull
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Float invoke() {
                float fE = this.f89248d.n().e(this.f89248d.f89206h.getValue());
                float fE2 = this.f89248d.n().e(this.f89248d.f89207i.getValue()) - fE;
                float fAbs = Math.abs(fE2);
                float f10 = 1.0f;
                if (!Float.isNaN(fAbs) && fAbs > 1.0E-6f) {
                    float fE3 = (this.f89248d.E() - fE) / fE2;
                    if (fE3 < 1.0E-6f) {
                        f10 = 0.0f;
                    } else if (fE3 <= 0.999999f) {
                        f10 = fE3;
                    }
                }
                return Float.valueOf(f10);
            }
        });
        this.f89210l = ActualAndroid_androidKt.b(0.0f);
        this.f89211m = M1.g(null, null, 2, null);
        this.f89212n = M1.g(AnchoredDraggableKt.r(), null, 2, null);
        this.f89213o = new a(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void O(AnchoredDraggableState anchoredDraggableState, m mVar, Object obj, int i10, Object obj2) {
        if ((i10 & 2) != 0 && (Float.isNaN(anchoredDraggableState.f89208j.getFloatValue()) || (obj = mVar.b(anchoredDraggableState.f89208j.getFloatValue())) == null)) {
            obj = anchoredDraggableState.f89207i.getValue();
        }
        anchoredDraggableState.N(mVar, obj);
    }

    public static final Object b(AnchoredDraggableState anchoredDraggableState) {
        return anchoredDraggableState.f89211m.getValue();
    }

    public static /* synthetic */ Object j(AnchoredDraggableState anchoredDraggableState, MutatePriority mutatePriority, ed.q qVar, kotlin.coroutines.e eVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return anchoredDraggableState.h(mutatePriority, qVar, eVar);
    }

    public static /* synthetic */ Object k(AnchoredDraggableState anchoredDraggableState, Object obj, MutatePriority mutatePriority, ed.r rVar, kotlin.coroutines.e eVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return anchoredDraggableState.i(obj, mutatePriority, rVar, eVar);
    }

    @InterfaceC4982o(message = "Use the progress function to query the progress between two specified anchors.", replaceWith = @InterfaceC4852c0(expression = "progress(state.settledValue, state.targetValue)", imports = {}))
    public static /* synthetic */ void w() {
    }

    @NotNull
    public final InterfaceC4376a<Float> A() {
        return this.f89200b;
    }

    public final boolean B() {
        return this.f89211m.getValue() != null;
    }

    public final float C(float f10) {
        return md.u.J((Float.isNaN(this.f89208j.getFloatValue()) ? 0.0f : this.f89208j.getFloatValue()) + f10, n().d(), n().f());
    }

    @InterfaceC4348w(from = 0.0d, to = 1.0d)
    public final float D(T t10, T t11) {
        float fE = n().e(t10);
        float fE2 = n().e(t11);
        float fJ = (md.u.J(this.f89208j.getFloatValue(), Math.min(fE, fE2), Math.max(fE, fE2)) - fE) / (fE2 - fE);
        if (Float.isNaN(fJ)) {
            return 1.0f;
        }
        if (fJ < 1.0E-6f) {
            return 0.0f;
        }
        if (fJ > 0.999999f) {
            return 1.0f;
        }
        return Math.abs(fJ);
    }

    public final float E() {
        if (Float.isNaN(this.f89208j.getFloatValue())) {
            throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return this.f89208j.getFloatValue();
    }

    public final void F(m<T> mVar) {
        this.f89212n.setValue(mVar);
    }

    public final void G(T t10) {
        this.f89205g.setValue(t10);
    }

    public final void H(T t10) {
        this.f89211m.setValue(t10);
    }

    public final void I(float f10) {
        this.f89210l.setFloatValue(f10);
    }

    public final void J(float f10) {
        this.f89208j.setFloatValue(f10);
    }

    public final void K(T t10) {
        this.f89206h.setValue(t10);
    }

    @Nullable
    public final Object L(float f10, @NotNull kotlin.coroutines.e<? super Float> eVar) {
        T value = this.f89205g.getValue();
        T tL = l(E(), value, f10);
        return this.f89203e.invoke(tL).booleanValue() ? AnchoredDraggableKt.o(this, tL, f10, eVar) : AnchoredDraggableKt.o(this, value, f10, eVar);
    }

    public final boolean M(T t10) {
        MutatorMutex mutatorMutex = this.f89204f;
        boolean zH = mutatorMutex.h();
        if (!zH) {
            return zH;
        }
        try {
            a aVar = this.f89213o;
            float fE = n().e(t10);
            if (!Float.isNaN(fE)) {
                C1653a.a(aVar, fE, 0.0f, 2, null);
                H(null);
            }
            G(t10);
            K(t10);
            mutatorMutex.k();
            return zH;
        } catch (Throwable th) {
            mutatorMutex.k();
            throw th;
        }
    }

    public final void N(@NotNull m<T> mVar, T t10) {
        if (kotlin.jvm.internal.G.g(n(), mVar)) {
            return;
        }
        F(mVar);
        if (M(t10)) {
            return;
        }
        H(t10);
    }

    @Nullable
    public final Object h(@NotNull MutatePriority mutatePriority, @NotNull ed.q<? super InterfaceC1654b, ? super m<T>, ? super kotlin.coroutines.e<? super kotlin.L0>, ? extends Object> qVar, @NotNull kotlin.coroutines.e<? super kotlin.L0> eVar) {
        Object objD = this.f89204f.d(mutatePriority, new AnchoredDraggableState$anchoredDrag$2(this, qVar, null), eVar);
        return objD == CoroutineSingletons.COROUTINE_SUSPENDED ? objD : kotlin.L0.f217464a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(T r6, @org.jetbrains.annotations.NotNull androidx.compose.foundation.MutatePriority r7, @org.jetbrains.annotations.NotNull ed.r<? super androidx.compose.foundation.gestures.InterfaceC1654b, ? super androidx.compose.foundation.gestures.m<T>, ? super T, ? super kotlin.coroutines.e<? super kotlin.L0>, ? extends java.lang.Object> r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.L0> r9) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$3
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$3 r0 = (androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$3) r0
            int r1 = r0.f89238d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f89238d = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$3 r0 = new androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$3
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.f89236b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f89238d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r6 = r0.f89235a
            androidx.compose.foundation.gestures.AnchoredDraggableState r6 = (androidx.compose.foundation.gestures.AnchoredDraggableState) r6
            kotlin.C4885d0.n(r9)     // Catch: java.lang.Throwable -> L2c
            goto L56
        L2c:
            r7 = move-exception
            goto L5c
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            kotlin.C4885d0.n(r9)
            androidx.compose.foundation.gestures.m r9 = r5.n()
            boolean r9 = r9.c(r6)
            if (r9 == 0) goto L60
            androidx.compose.foundation.MutatorMutex r9 = r5.f89204f     // Catch: java.lang.Throwable -> L5a
            androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4 r2 = new androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4     // Catch: java.lang.Throwable -> L5a
            r2.<init>(r5, r6, r8, r4)     // Catch: java.lang.Throwable -> L5a
            r0.f89235a = r5     // Catch: java.lang.Throwable -> L5a
            r0.f89238d = r3     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r6 = r9.d(r7, r2, r0)     // Catch: java.lang.Throwable -> L5a
            if (r6 != r1) goto L55
            return r1
        L55:
            r6 = r5
        L56:
            r6.H(r4)
            goto L74
        L5a:
            r7 = move-exception
            r6 = r5
        L5c:
            r6.H(r4)
            throw r7
        L60:
            ed.l<T, java.lang.Boolean> r7 = r5.f89203e
            java.lang.Object r7 = r7.invoke(r6)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L74
            r5.K(r6)
            r5.G(r6)
        L74:
            kotlin.L0 r6 = kotlin.L0.f217464a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AnchoredDraggableState.i(java.lang.Object, androidx.compose.foundation.MutatePriority, ed.r, kotlin.coroutines.e):java.lang.Object");
    }

    public final T l(float f10, T t10, float f11) {
        m<T> mVarN = n();
        float fE = mVarN.e(t10);
        float fFloatValue = this.f89200b.invoke().floatValue();
        if (fE != f10 && !Float.isNaN(fE)) {
            if (Math.abs(f11) >= Math.abs(fFloatValue)) {
                T tA = mVarN.a(f10, Math.signum(f11) > 0.0f);
                kotlin.jvm.internal.G.m(tA);
                return tA;
            }
            T tA2 = mVarN.a(f10, f10 - fE > 0.0f);
            kotlin.jvm.internal.G.m(tA2);
            if (Math.abs(fE - f10) > Math.abs(this.f89199a.invoke(Float.valueOf(Math.abs(fE - mVarN.e(tA2)))).floatValue())) {
                return tA2;
            }
        }
        return t10;
    }

    public final float m(float f10) {
        float fC = C(f10);
        float floatValue = Float.isNaN(this.f89208j.getFloatValue()) ? 0.0f : this.f89208j.getFloatValue();
        J(fC);
        return fC - floatValue;
    }

    @NotNull
    public final m<T> n() {
        return (m) this.f89212n.getValue();
    }

    @NotNull
    public final ed.l<T, Boolean> o() {
        return this.f89203e;
    }

    public final T p() {
        return this.f89205g.getValue();
    }

    @NotNull
    public final androidx.compose.animation.core.C<Float> q() {
        return this.f89202d;
    }

    public final T r() {
        return this.f89211m.getValue();
    }

    public final float s() {
        return this.f89210l.getFloatValue();
    }

    public final float t() {
        return this.f89208j.getFloatValue();
    }

    @NotNull
    public final ed.l<Float, Float> u() {
        return this.f89199a;
    }

    @InterfaceC4348w(from = 0.0d, to = 1.0d)
    public final float v() {
        return ((Number) this.f89209k.getValue()).floatValue();
    }

    public final T x() {
        return this.f89206h.getValue();
    }

    @NotNull
    public final InterfaceC1587h<Float> y() {
        return this.f89201c;
    }

    public final T z() {
        return (T) this.f89207i.getValue();
    }

    public /* synthetic */ AnchoredDraggableState(Object obj, ed.l lVar, InterfaceC4376a interfaceC4376a, InterfaceC1587h interfaceC1587h, androidx.compose.animation.core.C c10, ed.l lVar2, int i10, C4969v c4969v) {
        this(obj, lVar, interfaceC4376a, interfaceC1587h, c10, (i10 & 32) != 0 ? new ed.l<T, Boolean>() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState.1
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

    public /* synthetic */ AnchoredDraggableState(Object obj, m mVar, ed.l lVar, InterfaceC4376a interfaceC4376a, InterfaceC1587h interfaceC1587h, androidx.compose.animation.core.C c10, ed.l lVar2, int i10, C4969v c4969v) {
        this(obj, mVar, lVar, interfaceC4376a, interfaceC1587h, c10, (i10 & 64) != 0 ? new ed.l<T, Boolean>() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState.2
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

    @L
    public AnchoredDraggableState(T t10, @NotNull m<T> mVar, @NotNull ed.l<? super Float, Float> lVar, @NotNull InterfaceC4376a<Float> interfaceC4376a, @NotNull InterfaceC1587h<Float> interfaceC1587h, @NotNull androidx.compose.animation.core.C<Float> c10, @NotNull ed.l<? super T, Boolean> lVar2) {
        this(t10, lVar, interfaceC4376a, interfaceC1587h, c10, lVar2);
        F(mVar);
        M(t10);
    }
}
