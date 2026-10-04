package androidx.compose.ui.graphics;

import ed.InterfaceC4376a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.h2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2037h2 {
    public static final void a(boolean z10, @NotNull InterfaceC4376a<String> interfaceC4376a) {
        if (z10) {
            return;
        }
        b(interfaceC4376a.invoke());
        throw null;
    }

    public static final void b(@NotNull String str) {
        throw new IllegalArgumentException(str);
    }
}
