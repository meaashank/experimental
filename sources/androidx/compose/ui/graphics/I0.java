package androidx.compose.ui.graphics;

import android.graphics.Canvas;
import e.InterfaceC4345t;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@e.T(29)
public final class I0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final I0 f100715a = new I0();

    @InterfaceC4345t
    public final void a(@NotNull Canvas canvas, boolean z10) {
        if (z10) {
            canvas.enableZ();
        } else {
            canvas.disableZ();
        }
    }
}
