package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.T1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class w {
    @T1
    @NotNull
    public static final androidx.compose.ui.p a(@NotNull androidx.compose.ui.p pVar, @NotNull InterfaceC2154v interfaceC2154v, boolean z10) {
        return pVar.P0(new PointerHoverIconModifierElement(interfaceC2154v, z10));
    }

    public static /* synthetic */ androidx.compose.ui.p b(androidx.compose.ui.p pVar, InterfaceC2154v interfaceC2154v, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return a(pVar, interfaceC2154v, z10);
    }
}
