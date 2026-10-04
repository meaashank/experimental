package androidx.compose.ui.graphics.layer;

import android.view.View;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@e.T(28)
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final d0 f101309a = new d0();

    public final void a(@NotNull View view) {
        view.resetPivot();
    }

    public final void b(@NotNull View view, int i10) {
        view.setOutlineAmbientShadowColor(i10);
    }

    public final void c(@NotNull View view, int i10) {
        view.setOutlineSpotShadowColor(i10);
    }
}
