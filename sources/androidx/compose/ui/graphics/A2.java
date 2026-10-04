package androidx.compose.ui.graphics;

import e.InterfaceC4348w;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class A2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Path f100673a = C2031g0.a();

    @NotNull
    public static final C2133z2 a(@NotNull Path path, @InterfaceC4348w(from = 0.0d) float f10) {
        C2133z2 c2133z2 = new C2133z2();
        c2133z2.b(path, f10);
        return c2133z2;
    }

    public static /* synthetic */ C2133z2 b(Path path, float f10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = 0.5f;
        }
        return a(path, f10);
    }
}
