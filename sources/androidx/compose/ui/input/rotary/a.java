package androidx.compose.ui.input.rotary;

import androidx.compose.ui.p;
import ed.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    @NotNull
    public static final p a(@NotNull p pVar, @NotNull l<? super d, Boolean> lVar) {
        return pVar.P0(new RotaryInputElement(null, lVar));
    }

    @NotNull
    public static final p b(@NotNull p pVar, @NotNull l<? super d, Boolean> lVar) {
        return pVar.P0(new RotaryInputElement(lVar, null));
    }
}
