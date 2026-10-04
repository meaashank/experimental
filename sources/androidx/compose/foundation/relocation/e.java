package androidx.compose.foundation.relocation;

import androidx.compose.foundation.L;
import androidx.compose.ui.p;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e {
    @L
    @NotNull
    public static final c a() {
        return new BringIntoViewRequesterImpl();
    }

    @L
    @NotNull
    public static final p b(@NotNull p pVar, @NotNull c cVar) {
        return pVar.P0(new BringIntoViewRequesterElement(cVar));
    }
}
