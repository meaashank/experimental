package androidx.compose.foundation.selection;

import androidx.compose.runtime.T1;
import androidx.compose.ui.p;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.o;
import androidx.compose.ui.semantics.u;
import ed.l;
import kotlin.L0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class SelectableGroupKt {
    @T1
    @NotNull
    public static final p a(@NotNull p pVar) {
        return o.f(pVar, false, new l<u, L0>() { // from class: androidx.compose.foundation.selection.SelectableGroupKt$selectableGroup$1
            public final void e(@NotNull u uVar) {
                SemanticsPropertiesKt.j1(uVar);
            }

            @Override // ed.l
            public L0 invoke(u uVar) {
                SemanticsPropertiesKt.j1(uVar);
                return L0.f217464a;
            }
        }, 1, null);
    }
}
