package androidx.compose.ui.graphics.layer;

import android.graphics.Canvas;
import android.view.Surface;
import e.InterfaceC4345t;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@e.T(23)
public final class Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Y f101285a = new Y();

    @InterfaceC4345t
    @NotNull
    public final Canvas a(@NotNull Surface surface) {
        return surface.lockHardwareCanvas();
    }
}
