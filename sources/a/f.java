package A;

import ed.InterfaceC4376a;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    public static final void a(boolean z10, @NotNull InterfaceC4376a<String> lazyMessage) {
        G.p(lazyMessage, "lazyMessage");
        if (z10) {
            return;
        }
        d(lazyMessage.invoke());
        throw null;
    }

    public static final void b(boolean z10, @NotNull InterfaceC4376a<String> lazyMessage) {
        G.p(lazyMessage, "lazyMessage");
        if (z10) {
            return;
        }
        c(lazyMessage.invoke());
        throw null;
    }

    public static final void c(@NotNull String message) {
        G.p(message, "message");
        throw new IllegalArgumentException(message);
    }

    public static final void d(@NotNull String message) {
        G.p(message, "message");
        throw new IllegalStateException(message);
    }
}
