package androidx.compose.foundation;

import android.os.Build;
import androidx.compose.ui.layout.InterfaceC2188x;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nPreferKeepClear.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreferKeepClear.android.kt\nandroidx/compose/foundation/PreferKeepClear_androidKt\n*L\n1#1,112:1\n67#1:113\n67#1:114\n*S KotlinDebug\n*F\n+ 1 PreferKeepClear.android.kt\nandroidx/compose/foundation/PreferKeepClear_androidKt\n*L\n41#1:113\n60#1:114\n*E\n"})
public final class t0 {
    @NotNull
    public static final androidx.compose.ui.p a(@NotNull androidx.compose.ui.p pVar) {
        return Build.VERSION.SDK_INT < 33 ? pVar : pVar.P0(new PreferKeepClearElement(null));
    }

    @NotNull
    public static final androidx.compose.ui.p b(@NotNull androidx.compose.ui.p pVar, @NotNull ed.l<? super InterfaceC2188x, P.j> lVar) {
        return Build.VERSION.SDK_INT < 33 ? pVar : pVar.P0(new PreferKeepClearElement(lVar));
    }

    @e.T(33)
    public static final androidx.compose.ui.p c(ed.l<? super InterfaceC2188x, P.j> lVar) {
        return new PreferKeepClearElement(lVar);
    }
}
