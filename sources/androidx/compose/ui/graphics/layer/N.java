package androidx.compose.ui.graphics.layer;

import android.graphics.Canvas;
import android.view.Surface;
import e.InterfaceC4345t;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@e.T(23)
public final class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final N f101273a = new N();

    @InterfaceC4345t
    @NotNull
    public final Canvas a(@NotNull Surface surface) {
        return surface.lockHardwareCanvas();
    }
}
