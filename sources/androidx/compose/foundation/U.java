package androidx.compose.foundation;

import androidx.compose.runtime.T1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class U {
    @T1
    @NotNull
    public static final androidx.compose.ui.p a(@NotNull androidx.compose.ui.p pVar, @NotNull androidx.compose.foundation.interaction.g gVar, boolean z10) {
        return pVar.P0(z10 ? new HoverableElement(gVar) : androidx.compose.ui.p.f103112M2);
    }

    public static /* synthetic */ androidx.compose.ui.p b(androidx.compose.ui.p pVar, androidx.compose.foundation.interaction.g gVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return a(pVar, gVar, z10);
    }
}
