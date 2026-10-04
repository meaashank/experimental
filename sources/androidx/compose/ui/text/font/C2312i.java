package androidx.compose.ui.text.font;

import androidx.compose.ui.text.font.L;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.ui.text.font.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2312i {
    @NotNull
    public static final L a(@NotNull L.a aVar) {
        aVar.getClass();
        return L.f104558i;
    }

    public static final int b(boolean z10, boolean z11) {
        if (z11 && z10) {
            return 3;
        }
        if (z10) {
            return 1;
        }
        return z11 ? 2 : 0;
    }

    public static final int c(@NotNull L l10, int i10) {
        boolean z10 = l10.compareTo(a(L.f104551b)) >= 0;
        H.f104527b.getClass();
        return b(z10, i10 == H.f104529d);
    }
}
