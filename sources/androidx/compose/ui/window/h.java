package androidx.compose.ui.window;

import android.graphics.Rect;
import android.view.View;
import e.T;
import kotlin.collections.I;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@T(29)
public final class h extends i {
    @Override // androidx.compose.ui.window.i, androidx.compose.ui.window.g
    public void b(@NotNull View view, int i10, int i11) {
        view.setSystemGestureExclusionRects(I.U(new Rect(0, 0, i10, i11)));
    }
}
