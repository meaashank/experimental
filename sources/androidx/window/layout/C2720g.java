package androidx.window.layout;

import android.graphics.Point;
import android.view.Display;
import e.T;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.window.layout.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@T(17)
public final class C2720g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C2720g f120141a = new C2720g();

    public final void a(@NotNull Display display, @NotNull Point point) {
        kotlin.jvm.internal.G.p(display, "display");
        kotlin.jvm.internal.G.p(point, "point");
        display.getRealSize(point);
    }
}
