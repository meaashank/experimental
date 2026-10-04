package androidx.window.layout;

import android.view.DisplayCutout;
import e.T;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@T(28)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final l f120142a = new l();

    public final int a(@NotNull DisplayCutout displayCutout) {
        kotlin.jvm.internal.G.p(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetBottom();
    }

    public final int b(@NotNull DisplayCutout displayCutout) {
        kotlin.jvm.internal.G.p(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetLeft();
    }

    public final int c(@NotNull DisplayCutout displayCutout) {
        kotlin.jvm.internal.G.p(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetRight();
    }

    public final int d(@NotNull DisplayCutout displayCutout) {
        kotlin.jvm.internal.G.p(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetTop();
    }
}
