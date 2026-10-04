package androidx.compose.foundation.lazy.layout;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class r {
    @androidx.compose.foundation.L
    public static final int a(@NotNull InterfaceC1743q interfaceC1743q, @Nullable Object obj, int i10) {
        int iB;
        return (obj == null || interfaceC1743q.getItemCount() == 0 || (i10 < interfaceC1743q.getItemCount() && obj.equals(interfaceC1743q.c(i10))) || (iB = interfaceC1743q.b(obj)) == -1) ? i10 : iB;
    }
}
