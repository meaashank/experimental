package androidx.compose.ui.platform;

import android.view.View;
import e.InterfaceC4345t;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.ui.platform.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@e.T(31)
@androidx.compose.runtime.internal.r(parameters = 1)
public final class C2295z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C2295z f103948a = new C2295z();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f103949b = 0;

    @e.T(31)
    @InterfaceC4345t
    public final void a(@NotNull View view) {
        view.clearViewTranslationCallback();
    }

    @e.T(31)
    @InterfaceC4345t
    public final void b(@NotNull View view) {
        view.setViewTranslationCallback(C2289w.a(ViewTranslationCallbackC2286v.f103935a));
    }
}
