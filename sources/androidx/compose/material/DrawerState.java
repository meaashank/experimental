package androidx.compose.material;

import androidx.compose.animation.core.InterfaceC1587h;
import androidx.compose.runtime.T1;
import androidx.compose.runtime.saveable.SaverKt;
import ed.InterfaceC4376a;
import k0.InterfaceC4814e;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC4982o;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@T1
public final class DrawerState {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final Companion f96179c = new Companion();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f96180d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final AnchoredDraggableState<DrawerValue> f96181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public InterfaceC4814e f96182b;

    public static final class Companion {
        public Companion() {
        }

        @NotNull
        public final androidx.compose.runtime.saveable.e<DrawerState, DrawerValue> a(@NotNull final ed.l<? super DrawerValue, Boolean> lVar) {
            return SaverKt.a(new ed.p<androidx.compose.runtime.saveable.f, DrawerState, DrawerValue>() { // from class: androidx.compose.material.DrawerState$Companion$Saver$1
                @Nullable
                public final DrawerValue e(@NotNull androidx.compose.runtime.saveable.f fVar, @NotNull DrawerState drawerState) {
                    return drawerState.e();
                }

                @Override // ed.p
                public DrawerValue invoke(androidx.compose.runtime.saveable.f fVar, DrawerState drawerState) {
                    return drawerState.e();
                }
            }, new ed.l<DrawerValue, DrawerState>() { // from class: androidx.compose.material.DrawerState$Companion$Saver$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // ed.l
                @Nullable
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public final DrawerState invoke(@NotNull DrawerValue drawerValue) {
                    return new DrawerState(drawerValue, lVar);
                }
            });
        }

        public Companion(C4969v c4969v) {
        }
    }

    public DrawerState(@NotNull DrawerValue drawerValue, @NotNull ed.l<? super DrawerValue, Boolean> lVar) {
        this.f96181a = new AnchoredDraggableState<>(drawerValue, new ed.l<Float, Float>() { // from class: androidx.compose.material.DrawerState$anchoredDraggableState$1
            {
                super(1);
            }

            @NotNull
            public final Float e(float f10) {
                return Float.valueOf(this.f96186d.o().l2(DrawerKt.f96042b));
            }

            @Override // ed.l
            public /* bridge */ /* synthetic */ Float invoke(Float f10) {
                return e(f10.floatValue());
            }
        }, new InterfaceC4376a<Float>() { // from class: androidx.compose.material.DrawerState$anchoredDraggableState$2
            {
                super(0);
            }

            @Override // ed.InterfaceC4376a
            @NotNull
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Float invoke() {
                return Float.valueOf(this.f96187d.o().l2(DrawerKt.f96043c));
            }
        }, DrawerKt.f96044d, lVar);
    }

    @P
    public static /* synthetic */ void h() {
    }

    @P
    public static /* synthetic */ void j() {
    }

    @P
    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "This method has been replaced by the open and close methods. The animation spec is now an implementation detail of ModalDrawer.")
    @Nullable
    public final Object b(@NotNull DrawerValue drawerValue, @NotNull InterfaceC1587h<Float> interfaceC1587h, @NotNull kotlin.coroutines.e<? super kotlin.L0> eVar) {
        Object objG = AnchoredDraggableKt.g(this.f96181a, drawerValue, 0.0f, eVar, 2, null);
        return objG == CoroutineSingletons.COROUTINE_SUSPENDED ? objG : kotlin.L0.f217464a;
    }

    @Nullable
    public final Object c(@NotNull kotlin.coroutines.e<? super kotlin.L0> eVar) {
        Object objG = AnchoredDraggableKt.g(this.f96181a, DrawerValue.Closed, 0.0f, eVar, 2, null);
        return objG == CoroutineSingletons.COROUTINE_SUSPENDED ? objG : kotlin.L0.f217464a;
    }

    @NotNull
    public final AnchoredDraggableState<DrawerValue> d() {
        return this.f96181a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final DrawerValue e() {
        return (DrawerValue) this.f96181a.f95176g.getValue();
    }

    @Nullable
    public final InterfaceC4814e f() {
        return this.f96182b;
    }

    @P
    public final float g() {
        return this.f96181a.f95179j.getFloatValue();
    }

    @P
    @NotNull
    public final DrawerValue i() {
        return (DrawerValue) this.f96181a.f95177h.getValue();
    }

    public final boolean k() {
        return this.f96181a.C();
    }

    public final boolean l() {
        return e() == DrawerValue.Closed;
    }

    public final boolean m() {
        return e() == DrawerValue.Open;
    }

    @Nullable
    public final Object n(@NotNull kotlin.coroutines.e<? super kotlin.L0> eVar) {
        Object objG = AnchoredDraggableKt.g(this.f96181a, DrawerValue.Open, 0.0f, eVar, 2, null);
        return objG == CoroutineSingletons.COROUTINE_SUSPENDED ? objG : kotlin.L0.f217464a;
    }

    public final InterfaceC4814e o() {
        InterfaceC4814e interfaceC4814e = this.f96182b;
        if (interfaceC4814e != null) {
            return interfaceC4814e;
        }
        throw new IllegalArgumentException(("The density on DrawerState (" + this + ") was not set. Did you use DrawerState with the Drawer composable?").toString());
    }

    public final float p() {
        return this.f96181a.E();
    }

    public final void q(@Nullable InterfaceC4814e interfaceC4814e) {
        this.f96182b = interfaceC4814e;
    }

    @Nullable
    public final Object r(@NotNull DrawerValue drawerValue, @NotNull kotlin.coroutines.e<? super kotlin.L0> eVar) {
        Object objK = AnchoredDraggableKt.k(this.f96181a, drawerValue, eVar);
        return objK == CoroutineSingletons.COROUTINE_SUSPENDED ? objK : kotlin.L0.f217464a;
    }

    public /* synthetic */ DrawerState(DrawerValue drawerValue, ed.l lVar, int i10, C4969v c4969v) {
        this(drawerValue, (i10 & 2) != 0 ? new ed.l<DrawerValue, Boolean>() { // from class: androidx.compose.material.DrawerState.1
            @NotNull
            public final Boolean e(@NotNull DrawerValue drawerValue2) {
                return Boolean.TRUE;
            }

            @Override // ed.l
            public /* bridge */ /* synthetic */ Boolean invoke(DrawerValue drawerValue2) {
                return Boolean.TRUE;
            }
        } : lVar);
    }
}
