package androidx.compose.foundation.layout;

import androidx.compose.runtime.T1;
import androidx.compose.ui.platform.C2278s0;
import androidx.compose.ui.platform.InspectableValueKt;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import e.InterfaceC4348w;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nAspectRatio.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AspectRatio.kt\nandroidx/compose/foundation/layout/AspectRatioKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,236:1\n135#2:237\n*S KotlinDebug\n*F\n+ 1 AspectRatio.kt\nandroidx/compose/foundation/layout/AspectRatioKt\n*L\n63#1:237\n*E\n"})
public final class AspectRatioKt {
    @T1
    @NotNull
    public static final androidx.compose.ui.p a(@NotNull androidx.compose.ui.p pVar, @InterfaceC4348w(from = 0.0d, fromInclusive = false) final float f10, final boolean z10) {
        return pVar.P0(new AspectRatioElement(f10, z10, InspectableValueKt.e() ? new ed.l<C2278s0, kotlin.L0>() { // from class: androidx.compose.foundation.layout.AspectRatioKt$aspectRatio$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void e(@NotNull C2278s0 c2278s0) {
                c2278s0.f103927a = InMobiNetworkValues.ASPECT_RATIO;
                c2278s0.f103929c.c(androidx.constraintlayout.widget.d.f107890U1, Float.valueOf(f10));
                c2278s0.f103929c.c("matchHeightConstraintsFirst", Boolean.valueOf(z10));
            }

            @Override // ed.l
            public /* bridge */ /* synthetic */ kotlin.L0 invoke(C2278s0 c2278s0) {
                e(c2278s0);
                return kotlin.L0.f217464a;
            }
        } : InspectableValueKt.f103595a));
    }

    public static /* synthetic */ androidx.compose.ui.p b(androidx.compose.ui.p pVar, float f10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return a(pVar, f10, z10);
    }
}
