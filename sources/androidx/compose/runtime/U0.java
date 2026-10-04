package androidx.compose.runtime;

import ed.InterfaceC4376a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class U0 {
    public static final void a(boolean z10) {
        if (z10) {
            return;
        }
        e("Check failed.");
        throw null;
    }

    public static final void b(boolean z10, @NotNull InterfaceC4376a<String> interfaceC4376a) {
        if (z10) {
            return;
        }
        e(interfaceC4376a.invoke());
        throw null;
    }

    public static final void c(boolean z10, @NotNull InterfaceC4376a<String> interfaceC4376a) {
        if (z10) {
            return;
        }
        d(interfaceC4376a.invoke());
        throw null;
    }

    public static final void d(@NotNull String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void e(@NotNull String str) {
        throw new IllegalStateException(str);
    }
}
