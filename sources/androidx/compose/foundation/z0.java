package androidx.compose.foundation;

import android.os.Build;
import androidx.compose.ui.layout.InterfaceC2188x;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nSystemGestureExclusion.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SystemGestureExclusion.android.kt\nandroidx/compose/foundation/SystemGestureExclusionKt\n*L\n1#1,111:1\n66#1:112\n66#1:113\n*S KotlinDebug\n*F\n+ 1 SystemGestureExclusion.android.kt\nandroidx/compose/foundation/SystemGestureExclusionKt\n*L\n42#1:112\n59#1:113\n*E\n"})
@dd.j(name = "SystemGestureExclusionKt")
public final class z0 {
    @e.T(29)
    public static final androidx.compose.ui.p a(ed.l<? super InterfaceC2188x, P.j> lVar) {
        return new ExcludeFromSystemGestureElement(lVar);
    }

    @NotNull
    public static final androidx.compose.ui.p b(@NotNull androidx.compose.ui.p pVar) {
        return Build.VERSION.SDK_INT < 29 ? pVar : pVar.P0(new ExcludeFromSystemGestureElement(null));
    }

    @NotNull
    public static final androidx.compose.ui.p c(@NotNull androidx.compose.ui.p pVar, @NotNull ed.l<? super InterfaceC2188x, P.j> lVar) {
        return Build.VERSION.SDK_INT < 29 ? pVar : pVar.P0(new ExcludeFromSystemGestureElement(lVar));
    }
}
