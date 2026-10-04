package androidx.compose.animation.core;

import ed.InterfaceC4376a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.animation.core.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1602o0 {
    public static final void a(boolean z10, @NotNull InterfaceC4376a<String> interfaceC4376a) {
        if (z10) {
            return;
        }
        e(interfaceC4376a.invoke());
        throw null;
    }

    @NotNull
    public static final <T> T b(@Nullable T t10, @NotNull InterfaceC4376a<String> interfaceC4376a) {
        if (t10 != null) {
            return t10;
        }
        f(interfaceC4376a.invoke());
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

    @NotNull
    public static final Void f(@NotNull String str) {
        throw new IllegalStateException(str);
    }
}
