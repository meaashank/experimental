package androidx.window.layout;

import android.app.Activity;
import android.graphics.Rect;
import e.T;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.window.layout.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@T(30)
public final class C2719f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C2719f f120140a = new C2719f();

    @NotNull
    public final Rect a(@NotNull Activity activity) {
        kotlin.jvm.internal.G.p(activity, "activity");
        Rect bounds = activity.getWindowManager().getCurrentWindowMetrics().getBounds();
        kotlin.jvm.internal.G.o(bounds, "activity.windowManager.currentWindowMetrics.bounds");
        return bounds;
    }

    @NotNull
    public final Rect b(@NotNull Activity activity) {
        kotlin.jvm.internal.G.p(activity, "activity");
        Rect bounds = activity.getWindowManager().getMaximumWindowMetrics().getBounds();
        kotlin.jvm.internal.G.o(bounds, "activity.windowManager.maximumWindowMetrics.bounds");
        return bounds;
    }
}
