package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    @NotNull
    public static final p a(@NotNull p pVar, @NotNull b bVar, @Nullable NestedScrollDispatcher nestedScrollDispatcher) {
        return pVar.P0(new NestedScrollElement(bVar, nestedScrollDispatcher));
    }

    public static /* synthetic */ p b(p pVar, b bVar, NestedScrollDispatcher nestedScrollDispatcher, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            nestedScrollDispatcher = null;
        }
        return a(pVar, bVar, nestedScrollDispatcher);
    }
}
