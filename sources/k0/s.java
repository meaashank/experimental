package k0;

import ed.InterfaceC4376a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f214327a = -9223372034707292160L;

    public static final void a(boolean z10, @NotNull InterfaceC4376a<String> interfaceC4376a) {
        if (z10) {
            return;
        }
        d(interfaceC4376a.invoke());
        throw null;
    }

    public static final void b(boolean z10, @NotNull InterfaceC4376a<String> interfaceC4376a) {
        if (z10) {
            return;
        }
        c(interfaceC4376a.invoke());
        throw null;
    }

    public static final void c(@NotNull String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void d(@NotNull String str) {
        throw new IllegalStateException(str);
    }
}
