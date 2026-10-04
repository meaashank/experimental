package androidx.compose.foundation.layout;

import androidx.compose.foundation.C1750p;
import androidx.compose.runtime.T1;
import androidx.compose.ui.platform.C2278s0;
import androidx.compose.ui.unit.LayoutDirection;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,484:1\n149#2:485\n149#2:486\n149#2:487\n149#2:488\n149#2:489\n149#2:490\n149#2:491\n149#2:492\n149#2:493\n149#2:494\n149#2:495\n149#2:496\n149#2:497\n149#2:498\n149#2:499\n*S KotlinDebug\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingKt\n*L\n51#1:485\n52#1:486\n53#1:487\n54#1:488\n84#1:489\n85#1:490\n157#1:491\n158#1:492\n159#1:493\n160#1:494\n284#1:495\n294#1:496\n295#1:497\n296#1:498\n297#1:499\n*E\n"})
public final class PaddingKt {
    @T1
    @NotNull
    public static final InterfaceC1694n0 a(float f10) {
        return new C1698p0(f10, f10, f10, f10);
    }

    @T1
    @NotNull
    public static final InterfaceC1694n0 b(float f10, float f11) {
        return new C1698p0(f10, f11, f10, f11);
    }

    public static InterfaceC1694n0 c(float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 0;
        }
        if ((i10 & 2) != 0) {
            f11 = 0;
        }
        return new C1698p0(f10, f11, f10, f11);
    }

    @T1
    @NotNull
    public static final InterfaceC1694n0 d(float f10, float f11, float f12, float f13) {
        return new C1698p0(f10, f11, f12, f13);
    }

    public static InterfaceC1694n0 e(float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 0;
        }
        if ((i10 & 2) != 0) {
            f11 = 0;
        }
        if ((i10 & 4) != 0) {
            f12 = 0;
        }
        if ((i10 & 8) != 0) {
            f13 = 0;
        }
        return new C1698p0(f10, f11, f12, f13);
    }

    @T1
    @NotNull
    public static final androidx.compose.ui.p f(@NotNull androidx.compose.ui.p pVar, final float f10, final float f11, final float f12, final float f13) {
        return pVar.P0(new PaddingElement(f10, f11, f12, f13, false, new ed.l<C2278s0, kotlin.L0>() { // from class: androidx.compose.foundation.layout.PaddingKt$absolutePadding$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void e(@NotNull C2278s0 c2278s0) {
                c2278s0.f103927a = "absolutePadding";
                C1750p.a(f10, c2278s0.f103929c, "left");
                C1750p.a(f11, c2278s0.f103929c, "top");
                C1750p.a(f12, c2278s0.f103929c, "right");
                C1750p.a(f13, c2278s0.f103929c, "bottom");
            }

            @Override // ed.l
            public /* bridge */ /* synthetic */ kotlin.L0 invoke(C2278s0 c2278s0) {
                e(c2278s0);
                return kotlin.L0.f217464a;
            }
        }));
    }

    public static androidx.compose.ui.p g(androidx.compose.ui.p pVar, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 0;
        }
        if ((i10 & 2) != 0) {
            f11 = 0;
        }
        if ((i10 & 4) != 0) {
            f12 = 0;
        }
        if ((i10 & 8) != 0) {
            f13 = 0;
        }
        return f(pVar, f10, f11, f12, f13);
    }

    @T1
    public static final float h(@NotNull InterfaceC1694n0 interfaceC1694n0, @NotNull LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.Ltr ? interfaceC1694n0.c(layoutDirection) : interfaceC1694n0.b(layoutDirection);
    }

    @T1
    public static final float i(@NotNull InterfaceC1694n0 interfaceC1694n0, @NotNull LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.Ltr ? interfaceC1694n0.b(layoutDirection) : interfaceC1694n0.c(layoutDirection);
    }

    @T1
    @NotNull
    public static final androidx.compose.ui.p j(@NotNull androidx.compose.ui.p pVar, @NotNull final InterfaceC1694n0 interfaceC1694n0) {
        return pVar.P0(new PaddingValuesElement(interfaceC1694n0, new ed.l<C2278s0, kotlin.L0>() { // from class: androidx.compose.foundation.layout.PaddingKt$padding$4
            {
                super(1);
            }

            public final void e(@NotNull C2278s0 c2278s0) {
                c2278s0.f103927a = "padding";
                c2278s0.f103929c.c("paddingValues", interfaceC1694n0);
            }

            @Override // ed.l
            public /* bridge */ /* synthetic */ kotlin.L0 invoke(C2278s0 c2278s0) {
                e(c2278s0);
                return kotlin.L0.f217464a;
            }
        }));
    }

    @T1
    @NotNull
    public static final androidx.compose.ui.p k(@NotNull androidx.compose.ui.p pVar, final float f10) {
        return pVar.P0(new PaddingElement(f10, f10, f10, f10, true, new ed.l<C2278s0, kotlin.L0>() { // from class: androidx.compose.foundation.layout.PaddingKt$padding$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void e(@NotNull C2278s0 c2278s0) {
                c2278s0.f103927a = "padding";
                c2278s0.f103928b = new k0.i(f10);
            }

            @Override // ed.l
            public /* bridge */ /* synthetic */ kotlin.L0 invoke(C2278s0 c2278s0) {
                e(c2278s0);
                return kotlin.L0.f217464a;
            }
        }));
    }

    @T1
    @NotNull
    public static final androidx.compose.ui.p l(@NotNull androidx.compose.ui.p pVar, final float f10, final float f11) {
        return pVar.P0(new PaddingElement(f10, f11, f10, f11, true, new ed.l<C2278s0, kotlin.L0>() { // from class: androidx.compose.foundation.layout.PaddingKt$padding$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void e(@NotNull C2278s0 c2278s0) {
                c2278s0.f103927a = "padding";
                C1750p.a(f10, c2278s0.f103929c, "horizontal");
                C1750p.a(f11, c2278s0.f103929c, "vertical");
            }

            @Override // ed.l
            public /* bridge */ /* synthetic */ kotlin.L0 invoke(C2278s0 c2278s0) {
                e(c2278s0);
                return kotlin.L0.f217464a;
            }
        }));
    }

    public static androidx.compose.ui.p m(androidx.compose.ui.p pVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 0;
        }
        if ((i10 & 2) != 0) {
            f11 = 0;
        }
        return l(pVar, f10, f11);
    }

    @T1
    @NotNull
    public static final androidx.compose.ui.p n(@NotNull androidx.compose.ui.p pVar, final float f10, final float f11, final float f12, final float f13) {
        return pVar.P0(new PaddingElement(f10, f11, f12, f13, true, new ed.l<C2278s0, kotlin.L0>() { // from class: androidx.compose.foundation.layout.PaddingKt$padding$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void e(@NotNull C2278s0 c2278s0) {
                c2278s0.f103927a = "padding";
                C1750p.a(f10, c2278s0.f103929c, "start");
                C1750p.a(f11, c2278s0.f103929c, "top");
                C1750p.a(f12, c2278s0.f103929c, "end");
                C1750p.a(f13, c2278s0.f103929c, "bottom");
            }

            @Override // ed.l
            public /* bridge */ /* synthetic */ kotlin.L0 invoke(C2278s0 c2278s0) {
                e(c2278s0);
                return kotlin.L0.f217464a;
            }
        }));
    }

    public static androidx.compose.ui.p o(androidx.compose.ui.p pVar, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 0;
        }
        if ((i10 & 2) != 0) {
            f11 = 0;
        }
        if ((i10 & 4) != 0) {
            f12 = 0;
        }
        if ((i10 & 8) != 0) {
            f13 = 0;
        }
        return n(pVar, f10, f11, f12, f13);
    }
}
