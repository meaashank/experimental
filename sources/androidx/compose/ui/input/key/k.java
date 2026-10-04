package androidx.compose.ui.input.key;

import androidx.compose.ui.p;
import ed.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class k {
    @androidx.compose.ui.i
    @NotNull
    public static final p a(@NotNull p pVar, @NotNull l<? super c, Boolean> lVar) {
        return pVar.P0(new SoftKeyboardInterceptionElement(lVar, null));
    }

    @androidx.compose.ui.i
    @NotNull
    public static final p b(@NotNull p pVar, @NotNull l<? super c, Boolean> lVar) {
        return pVar.P0(new SoftKeyboardInterceptionElement(null, lVar));
    }
}
