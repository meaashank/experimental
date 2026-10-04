package androidx.activity;

import android.view.View;
import android.view.Window;
import androidx.core.view.M1;
import androidx.core.view.N0;
import e.InterfaceC4345t;
import e.T;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@T(23)
public final class r implements x {
    @Override // androidx.activity.x
    @InterfaceC4345t
    public void a(@NotNull SystemBarStyle statusBarStyle, @NotNull SystemBarStyle navigationBarStyle, @NotNull Window window, @NotNull View view, boolean z10, boolean z11) {
        kotlin.jvm.internal.G.p(statusBarStyle, "statusBarStyle");
        kotlin.jvm.internal.G.p(navigationBarStyle, "navigationBarStyle");
        kotlin.jvm.internal.G.p(window, "window");
        kotlin.jvm.internal.G.p(view, "view");
        N0.c(window, false);
        window.setStatusBarColor(statusBarStyle.g(z10));
        window.setNavigationBarColor(navigationBarStyle.f84904b);
        new M1(window, view).i(!z10);
    }
}
