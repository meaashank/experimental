package androidx.compose.ui.draw;

import androidx.compose.runtime.T1;
import androidx.compose.ui.graphics.Z1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class q {
    @T1
    @NotNull
    public static final androidx.compose.ui.p a(@NotNull androidx.compose.ui.p pVar, float f10) {
        return b(pVar, f10, f10);
    }

    @T1
    @NotNull
    public static final androidx.compose.ui.p b(@NotNull androidx.compose.ui.p pVar, float f10, float f11) {
        return (f10 == 1.0f && f11 == 1.0f) ? pVar : Z1.e(pVar, f10, f11, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131068, null);
    }
}
