package androidx.compose.material;

import androidx.compose.animation.core.InterfaceC1587h;
import androidx.compose.runtime.T1;
import androidx.compose.runtime.saveable.SaverKt;
import e.InterfaceC4348w;
import ed.InterfaceC4376a;
import k0.InterfaceC4814e;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4982o;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@T1
public final class BottomSheetState {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Companion f95764b = new Companion();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f95765c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final AnchoredDraggableState<BottomSheetValue> f95766a;

    public static final class Companion {
        public Companion() {
        }

        @NotNull
        public final androidx.compose.runtime.saveable.e<BottomSheetState, ?> a(@NotNull final InterfaceC1587h<Float> interfaceC1587h, @NotNull final ed.l<? super BottomSheetValue, Boolean> lVar, @NotNull final InterfaceC4814e interfaceC4814e) {
            return SaverKt.a(new ed.p<androidx.compose.runtime.saveable.f, BottomSheetState, BottomSheetValue>() { // from class: androidx.compose.material.BottomSheetState$Companion$Saver$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // ed.p
                @Nullable
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public final BottomSheetValue invoke(@NotNull androidx.compose.runtime.saveable.f fVar, @NotNull BottomSheetState bottomSheetState) {
                    return (BottomSheetValue) bottomSheetState.f95766a.f95176g.getValue();
                }
            }, new ed.l<BottomSheetValue, BottomSheetState>() { // from class: androidx.compose.material.BottomSheetState$Companion$Saver$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // ed.l
                @Nullable
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public final BottomSheetState invoke(@NotNull BottomSheetValue bottomSheetValue) {
                    return new BottomSheetState(bottomSheetValue, interfaceC4814e, interfaceC1587h, lVar);
                }
            });
        }

        public Companion(C4969v c4969v) {
        }
    }

    public BottomSheetState(@NotNull BottomSheetValue bottomSheetValue, @NotNull final InterfaceC4814e interfaceC4814e, @NotNull InterfaceC1587h<Float> interfaceC1587h, @NotNull ed.l<? super BottomSheetValue, Boolean> lVar) {
        this.f95766a = new AnchoredDraggableState<>(bottomSheetValue, new ed.l<Float, Float>() { // from class: androidx.compose.material.BottomSheetState$anchoredDraggableState$1
            {
                super(1);
            }

            @NotNull
            public final Float e(float f10) {
                return Float.valueOf(interfaceC4814e.l2(BottomSheetScaffoldKt.f95642b));
            }

            @Override // ed.l
            public /* bridge */ /* synthetic */ Float invoke(Float f10) {
                return e(f10.floatValue());
            }
        }, new InterfaceC4376a<Float>() { // from class: androidx.compose.material.BottomSheetState$anchoredDraggableState$2
            {
                super(0);
            }

            @Override // ed.InterfaceC4376a
            @NotNull
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Float invoke() {
                return Float.valueOf(interfaceC4814e.l2(BottomSheetScaffoldKt.f95643c));
            }
        }, interfaceC1587h, lVar);
    }

    public static Object b(BottomSheetState bottomSheetState, BottomSheetValue bottomSheetValue, float f10, kotlin.coroutines.e eVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = bottomSheetState.f95766a.f95181l.getFloatValue();
        }
        return bottomSheetState.a(bottomSheetValue, f10, eVar);
    }

    @P
    @InterfaceC4982o(message = "Please use the progress function to query progress explicitly between targets.", replaceWith = @InterfaceC4852c0(expression = "progress(from = , to = )", imports = {}))
    public static /* synthetic */ void h() {
    }

    @Nullable
    public final Object a(@NotNull BottomSheetValue bottomSheetValue, float f10, @NotNull kotlin.coroutines.e<? super kotlin.L0> eVar) {
        Object objF = AnchoredDraggableKt.f(this.f95766a, bottomSheetValue, f10, eVar);
        return objF == CoroutineSingletons.COROUTINE_SUSPENDED ? objF : kotlin.L0.f217464a;
    }

    @Nullable
    public final Object c(@NotNull kotlin.coroutines.e<? super kotlin.L0> eVar) {
        Object objG = AnchoredDraggableKt.g(this.f95766a, BottomSheetValue.Collapsed, 0.0f, eVar, 2, null);
        return objG == CoroutineSingletons.COROUTINE_SUSPENDED ? objG : kotlin.L0.f217464a;
    }

    @Nullable
    public final Object d(@NotNull kotlin.coroutines.e<? super kotlin.L0> eVar) {
        J<BottomSheetValue> jP = this.f95766a.p();
        BottomSheetValue bottomSheetValue = BottomSheetValue.Expanded;
        if (!jP.c(bottomSheetValue)) {
            bottomSheetValue = BottomSheetValue.Collapsed;
        }
        Object objG = AnchoredDraggableKt.g(this.f95766a, bottomSheetValue, 0.0f, eVar, 2, null);
        return objG == CoroutineSingletons.COROUTINE_SUSPENDED ? objG : kotlin.L0.f217464a;
    }

    @NotNull
    public final AnchoredDraggableState<BottomSheetValue> e() {
        return this.f95766a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final BottomSheetValue f() {
        return (BottomSheetValue) this.f95766a.f95176g.getValue();
    }

    @InterfaceC4348w(from = 0.0d, to = 1.0d)
    public final float g() {
        return this.f95766a.z();
    }

    @NotNull
    public final BottomSheetValue i() {
        return (BottomSheetValue) this.f95766a.f95177h.getValue();
    }

    public final boolean j() {
        return this.f95766a.f95176g.getValue() == BottomSheetValue.Collapsed;
    }

    public final boolean k() {
        return this.f95766a.f95176g.getValue() == BottomSheetValue.Expanded;
    }

    @InterfaceC4348w(from = 0.0d, to = 1.0d)
    public final float l(@NotNull BottomSheetValue bottomSheetValue, @NotNull BottomSheetValue bottomSheetValue2) {
        float fE = this.f95766a.p().e(bottomSheetValue);
        float fE2 = this.f95766a.p().e(bottomSheetValue2);
        float fJ = (md.u.J(this.f95766a.f95179j.getFloatValue(), Math.min(fE, fE2), Math.max(fE, fE2)) - fE) / (fE2 - fE);
        if (Float.isNaN(fJ)) {
            return 1.0f;
        }
        return Math.abs(fJ);
    }

    public final float m() {
        return this.f95766a.E();
    }

    @Nullable
    public final Object n(@NotNull BottomSheetValue bottomSheetValue, @NotNull kotlin.coroutines.e<? super kotlin.L0> eVar) {
        Object objK = AnchoredDraggableKt.k(this.f95766a, bottomSheetValue, eVar);
        return objK == CoroutineSingletons.COROUTINE_SUSPENDED ? objK : kotlin.L0.f217464a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BottomSheetState(BottomSheetValue bottomSheetValue, InterfaceC4814e interfaceC4814e, InterfaceC1587h interfaceC1587h, ed.l lVar, int i10, C4969v c4969v) {
        if ((i10 & 4) != 0) {
            C1864k.f98632a.getClass();
            interfaceC1587h = C1864k.f98635d;
        }
        this(bottomSheetValue, interfaceC4814e, interfaceC1587h, (i10 & 8) != 0 ? new ed.l<BottomSheetValue, Boolean>() { // from class: androidx.compose.material.BottomSheetState.1
            @NotNull
            public final Boolean e(@NotNull BottomSheetValue bottomSheetValue2) {
                return Boolean.TRUE;
            }

            @Override // ed.l
            public /* bridge */ /* synthetic */ Boolean invoke(BottomSheetValue bottomSheetValue2) {
                return Boolean.TRUE;
            }
        } : lVar);
    }
}
