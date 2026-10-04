package androidx.compose.ui.graphics;

import android.graphics.Canvas;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nAndroidCanvas.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/AndroidCanvas_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,435:1\n1#2:436\n*E\n"})
public final class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Canvas f100712a = new Canvas();

    @NotNull
    public static final C0 a(@NotNull InterfaceC2025e2 interfaceC2025e2) {
        G g10 = new G();
        g10.f100692a = new Canvas(V.b(interfaceC2025e2));
        return g10;
    }

    @NotNull
    public static final C0 b(@NotNull Canvas canvas) {
        G g10 = new G();
        g10.f100692a = canvas;
        return g10;
    }

    @NotNull
    public static final Canvas d(@NotNull C0 c02) {
        kotlin.jvm.internal.G.n(c02, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidCanvas");
        return ((G) c02).f100692a;
    }
}
