package androidx.compose.foundation.layout;

import androidx.compose.runtime.T1;
import androidx.compose.ui.platform.C2278s0;
import androidx.compose.ui.platform.InspectableValueKt;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nIntrinsic.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Intrinsic.kt\nandroidx/compose/foundation/layout/IntrinsicKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,285:1\n135#2:286\n135#2:287\n135#2:288\n135#2:289\n*S KotlinDebug\n*F\n+ 1 Intrinsic.kt\nandroidx/compose/foundation/layout/IntrinsicKt\n*L\n52#1:286\n76#1:287\n98#1:288\n120#1:289\n*E\n"})
public final class IntrinsicKt {
    @T1
    @NotNull
    public static final androidx.compose.ui.p a(@NotNull androidx.compose.ui.p pVar, @NotNull final IntrinsicSize intrinsicSize) {
        return pVar.P0(new IntrinsicHeightElement(intrinsicSize, true, InspectableValueKt.e() ? new ed.l<C2278s0, kotlin.L0>() { // from class: androidx.compose.foundation.layout.IntrinsicKt$height$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            public final void e(@NotNull C2278s0 c2278s0) {
                c2278s0.f103927a = InMobiNetworkValues.HEIGHT;
                c2278s0.f103929c.c("intrinsicSize", intrinsicSize);
            }

            @Override // ed.l
            public /* bridge */ /* synthetic */ kotlin.L0 invoke(C2278s0 c2278s0) {
                e(c2278s0);
                return kotlin.L0.f217464a;
            }
        } : InspectableValueKt.f103595a));
    }

    @T1
    @NotNull
    public static final androidx.compose.ui.p b(@NotNull androidx.compose.ui.p pVar, @NotNull final IntrinsicSize intrinsicSize) {
        return pVar.P0(new IntrinsicHeightElement(intrinsicSize, false, InspectableValueKt.e() ? new ed.l<C2278s0, kotlin.L0>() { // from class: androidx.compose.foundation.layout.IntrinsicKt$requiredHeight$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            public final void e(@NotNull C2278s0 c2278s0) {
                c2278s0.f103927a = "requiredHeight";
                c2278s0.f103929c.c("intrinsicSize", intrinsicSize);
            }

            @Override // ed.l
            public /* bridge */ /* synthetic */ kotlin.L0 invoke(C2278s0 c2278s0) {
                e(c2278s0);
                return kotlin.L0.f217464a;
            }
        } : InspectableValueKt.f103595a));
    }

    @T1
    @NotNull
    public static final androidx.compose.ui.p c(@NotNull androidx.compose.ui.p pVar, @NotNull final IntrinsicSize intrinsicSize) {
        return pVar.P0(new IntrinsicWidthElement(intrinsicSize, false, InspectableValueKt.e() ? new ed.l<C2278s0, kotlin.L0>() { // from class: androidx.compose.foundation.layout.IntrinsicKt$requiredWidth$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            public final void e(@NotNull C2278s0 c2278s0) {
                c2278s0.f103927a = "requiredWidth";
                c2278s0.f103929c.c("intrinsicSize", intrinsicSize);
            }

            @Override // ed.l
            public /* bridge */ /* synthetic */ kotlin.L0 invoke(C2278s0 c2278s0) {
                e(c2278s0);
                return kotlin.L0.f217464a;
            }
        } : InspectableValueKt.f103595a));
    }

    @T1
    @NotNull
    public static final androidx.compose.ui.p d(@NotNull androidx.compose.ui.p pVar, @NotNull final IntrinsicSize intrinsicSize) {
        return pVar.P0(new IntrinsicWidthElement(intrinsicSize, true, InspectableValueKt.e() ? new ed.l<C2278s0, kotlin.L0>() { // from class: androidx.compose.foundation.layout.IntrinsicKt$width$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            public final void e(@NotNull C2278s0 c2278s0) {
                c2278s0.f103927a = InMobiNetworkValues.WIDTH;
                c2278s0.f103929c.c("intrinsicSize", intrinsicSize);
            }

            @Override // ed.l
            public /* bridge */ /* synthetic */ kotlin.L0 invoke(C2278s0 c2278s0) {
                e(c2278s0);
                return kotlin.L0.f217464a;
            }
        } : InspectableValueKt.f103595a));
    }
}
