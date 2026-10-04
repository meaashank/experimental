package W;

import ed.InterfaceC4376a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final void a(boolean z10) {
        if (z10) {
            return;
        }
        g("Check failed.");
        throw null;
    }

    public static final void b(boolean z10, @NotNull InterfaceC4376a<String> interfaceC4376a) {
        if (z10) {
            return;
        }
        g(interfaceC4376a.invoke());
        throw null;
    }

    @NotNull
    public static final <T> T c(@Nullable T t10) {
        if (t10 != null) {
            return t10;
        }
        h("Required value was null.");
        throw null;
    }

    @NotNull
    public static final <T> T d(@Nullable T t10, @NotNull InterfaceC4376a<String> interfaceC4376a) {
        if (t10 != null) {
            return t10;
        }
        h(interfaceC4376a.invoke());
        throw null;
    }

    public static final void e(boolean z10, @NotNull InterfaceC4376a<String> interfaceC4376a) {
        if (z10) {
            return;
        }
        f(interfaceC4376a.invoke());
        throw null;
    }

    public static final void f(@NotNull String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void g(@NotNull String str) {
        throw new IllegalStateException(str);
    }

    @NotNull
    public static final Void h(@NotNull String str) {
        throw new IllegalStateException(str);
    }
}
