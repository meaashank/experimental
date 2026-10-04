package androidx.activity;

import android.view.View;
import android.view.Window;
import androidx.core.view.M1;
import androidx.core.view.N0;
import e.InterfaceC4345t;
import e.T;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@T(29)
public final class v implements x {
    @Override // androidx.activity.x
    @InterfaceC4345t
    public void a(@NotNull SystemBarStyle statusBarStyle, @NotNull SystemBarStyle navigationBarStyle, @NotNull Window window, @NotNull View view, boolean z10, boolean z11) {
        kotlin.jvm.internal.G.p(statusBarStyle, "statusBarStyle");
        kotlin.jvm.internal.G.p(navigationBarStyle, "navigationBarStyle");
        kotlin.jvm.internal.G.p(window, "window");
        kotlin.jvm.internal.G.p(view, "view");
        N0.c(window, false);
        window.setStatusBarColor(statusBarStyle.h(z10));
        window.setNavigationBarColor(navigationBarStyle.h(z11));
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(navigationBarStyle.f84905c == 0);
        M1 m12 = new M1(window, view);
        m12.i(!z10);
        m12.h(true ^ z11);
    }
}
