package androidx.compose.ui.window;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public class i implements g {
    @Override // androidx.compose.ui.window.g
    public void a(@NotNull WindowManager windowManager, @NotNull View view, @NotNull ViewGroup.LayoutParams layoutParams) {
        windowManager.updateViewLayout(view, layoutParams);
    }

    @Override // androidx.compose.ui.window.g
    public void b(@NotNull View view, int i10, int i11) {
    }

    @Override // androidx.compose.ui.window.g
    public void c(@NotNull View view, @NotNull Rect rect) {
        view.getWindowVisibleDisplayFrame(rect);
    }
}
