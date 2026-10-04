package androidx.compose.ui.platform;

import android.content.ClipboardManager;
import e.InterfaceC4345t;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@e.T(28)
public final class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final T f103652a = new T();

    @dd.o
    @InterfaceC4345t
    public static final void a(@NotNull ClipboardManager clipboardManager) {
        clipboardManager.clearPrimaryClip();
    }
}
