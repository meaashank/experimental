package androidx.compose.ui.platform;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.ui.platform.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@e.T(31)
public final class ViewTranslationCallbackC2286v implements ViewTranslationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ViewTranslationCallbackC2286v f103935a = new ViewTranslationCallbackC2286v();

    public boolean onClearTranslation(@NotNull View view) {
        kotlin.jvm.internal.G.n(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ((AndroidComposeView) view).f103209s.v();
        return true;
    }

    public boolean onHideTranslation(@NotNull View view) {
        kotlin.jvm.internal.G.n(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ((AndroidComposeView) view).f103209s.x();
        return true;
    }

    public boolean onShowTranslation(@NotNull View view) {
        kotlin.jvm.internal.G.n(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ((AndroidComposeView) view).f103209s.A();
        return true;
    }
}
